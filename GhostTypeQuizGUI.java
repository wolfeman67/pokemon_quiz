import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GhostTypeQuizGUI extends JPanel
{ static JFrame ghostFrame;
  static JPanel ghostPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> ghostPokemon = new ArrayList<String>();
   public GhostTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question ghost = questions.poll();
     question = ghost.getQuestion();
     thoseInAgreement = ghost.getYes();
     thoseInDenial = ghost.getNo();
     JButton yes;
     JButton no;
     if (question.equals("What gender are you?")) {
       yes = new JButton("Male");
       no = new JButton("Female");
     } else {
       yes = new JButton("Yes");
       no = new JButton("No");
     }

     JPanel conflictingInterests = new JPanel(new GridLayout(1,0));
     conflictingInterests.add(yes);
     yes.setForeground(new Color(0.0f, 0.0f, 1.0f));
     yes.setBackground(new Color(1.0f, 1.0f, 1.0f));
     yes.setOpaque(true);
     conflictingInterests.add(no);
     no.setForeground(new Color(1.0f, 0.0f, 0.0f));
     no.setBackground(new Color(1.0f, 1.0f, 1.0f));
     no.setOpaque(true);

     JLabel questionLabel = new JLabel(question, SwingConstants.CENTER);
     questionLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 12));
     questionLabel.setBackground(new Color((20f/100f), (9f/100f), (30f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           ghostPokemon.remove(thoseInDenial.get(i));
          }
          thoseInAgreement.clear();
          thoseInDenial.clear();
          boolean readyForNextQuestion = false;
          while (!readyForNextQuestion) {
            if (questions.size() == 0) {
              break;
            }
            readyForNextQuestion = checkIfNecessary(questions.peek());
            if (!readyForNextQuestion) {
              questions.poll();
            }
          }
          if (questions.size() != 0) {
            ghostFrame.getContentPane().removeAll();
		        ghostPanel = new GhostTypeQuizGUI();
            ghostFrame.add(ghostPanel);
            ghostFrame.pack();
          } else {
              if (ghostPokemon.size() > 1) {
                  ghostFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  ghostFrame.add(color);
                  ghostFrame.pack();
              } else if (ghostPokemon.size() == 1) {
                  ghostFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  ghostFrame.add(pokemon);
                  ghostFrame.pack();
                  ghostFrame.setVisible(true);
              } else {
                  ghostFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  ghostFrame.add(missingno);
                  ghostFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           ghostPokemon.remove(thoseInAgreement.get(i));
         }
         thoseInAgreement.clear();
         thoseInDenial.clear();
         boolean readyForNextQuestion = false;
         while(!readyForNextQuestion) {
           if(questions.size() == 0) {
             break;
           }
           readyForNextQuestion = checkIfNecessary(questions.peek());
           if(!readyForNextQuestion) {
             questions.poll();
           }
         }
         if (questions.size() != 0) {
           ghostFrame.getContentPane().removeAll();
		       ghostPanel = new GhostTypeQuizGUI();
           ghostFrame.add(ghostPanel);
           ghostFrame.pack();
         } else {
           if (ghostPokemon.size() > 1) {
             ghostFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             ghostFrame.add(color);
             ghostFrame.pack();
           } else if (ghostPokemon.size() == 1) {
             ghostFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             ghostFrame.add(pokemon);
             ghostFrame.pack();
             ghostFrame.setVisible(true);
           } else {
             ghostFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             ghostFrame.add(missingno);
             ghostFrame.pack();
           }


         }
       }
     });
     add(questionLabel);
     add(conflictingInterests);
   }
   public boolean checkIfNecessary(Question question) {
     boolean necessary = false;
     ArrayList<String> yesPoke = question.getYes();
     ArrayList<String> noPoke = question.getNo();
     for (int i = 0; i < yesPoke.size(); i++) {
       if (ghostPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (ghostPokemon.contains(noPoke.get(i))) {
           necessary = true;
           break;
         }
       }
     }
     return necessary;
   }
   public static class Question {
     public String _question = "???";
     public ArrayList<String> yes = new ArrayList<String>();
     public ArrayList<String> no = new ArrayList<String>();
     public Question (String porque) {
       _question = porque;
     }
     public void addPokemonYes (String pokemon) {
       yes.add(pokemon);
     }
     public void addPokemonNo (String pokemon) {
       no.add(pokemon);
     }
     public String getQuestion() {
       return _question;
     }
     public ArrayList<String> getYes() {
       return yes;
     }
     public ArrayList<String> getNo() {
       return no;
     }
   }

   public static class ColorSelection extends JPanel implements ActionListener {
     public ColorSelection () {
       super(new BorderLayout());
       JPanel colorsPanel = new JPanel(new GridLayout(0,3));
       JLabel select = new JLabel("Select the color which describes you the "+
               "best:\n");
       select.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       select.setOpaque(true);
       select.setForeground(Color.WHITE);
       select.setBackground(Color.BLACK);
       ArrayList<JButton> colors = new ArrayList<JButton>();
       for (int i = 0; i < ghostPokemon.size(); i++) {
         if (ghostPokemon.get(i).equals("Gastly") || ghostPokemon.get(i)
             .equals("Haunter") || ghostPokemon.get(i).equals("Gengar"))
         {
           JButton colorButton = new JButton("Dark Purple");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Dark Purple");
           colorButton.setBackground(new Color((20f/100f),(9f/100f),
                 (30f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (ghostPokemon.get(i).equals("Duskull") || ghostPokemon.get(i)
             .equals("Dusclops") || ghostPokemon.get(i).equals("Dusknoir"))
         {
           JButton colorButton = new JButton("Black");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Black");
           colorButton.setBackground(new Color((0f/100f), (0f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (ghostPokemon.get(i).equals("Misdreavus") || ghostPokemon.get(i)
             .equals("Mismagius"))
         {
           JButton colorButton = new JButton("Magenta");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Magenta");
           colorButton.setBackground(new Color((100f/100f), (0f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (ghostPokemon.get(i).equals("Litwick") || ghostPokemon.get(i)
             .equals("Lampent") || ghostPokemon.get(i).equals("Chandelure"))
         {
           JButton colorButton = new JButton("Crimson");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Crimson");
           colorButton.setBackground(new Color((60f/100f), (0f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Giratina"))
         {
           JButton colorButton = new JButton("Onyx");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Onyx");
           colorButton.setBackground(new Color((21f/100f), (22f/100f),
                 (22f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Hoopa"))
         {
           JButton colorButton = new JButton("Gold");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Gold");
           colorButton.setBackground(new Color((83f/100f), (69f/100f),
                 (22f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Phantump") || ghostPokemon.get(i)
                 .equals("Trevenant"))
         {
           JButton colorButton = new JButton("Forest Green");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Forest Green");
           colorButton.setBackground(new Color((13f/100f), (55f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Pumpkaboo") || ghostPokemon.get(i)
                 .equals("Gourgeist"))
         {
           JButton colorButton = new JButton("Pumpkin Orange");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Pumpkin Orange");
           colorButton.setBackground(new Color((100f/100f), (46f/100f),
                 (9f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Honedge") || ghostPokemon.get(i)
                 .equals("Doublade") || ghostPokemon.get(i)
                 .equals("Aegislash"))
         {
           JButton colorButton = new JButton("Royal Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Royal Blue");
           colorButton.setBackground(new Color((0f/100f), (14f/100f),
                 (40f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Frillish-Male") || ghostPokemon.get(i)
                 .equals("Jellicent-Male") || ghostPokemon.get(i)
                 .equals("Frillish-Female") || ghostPokemon.get(i)
                 .equals("Jellicent-Female"))
         {
           JButton colorButton = new JButton("White");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("White");
           colorButton.setBackground(new Color((100f/100f), (100f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Froslass"))
         {
           JButton colorButton = new JButton("Steel Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Steel Blue");
           colorButton.setBackground(new Color((27f/100f), (51f/100f),
                 (71f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Shedinja"))
         {
           JButton colorButton = new JButton("Amber");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Amber");
           colorButton.setBackground(new Color((100f/100f), (75f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Shuppet") || ghostPokemon.get(i)
             .equals("Banette"))
         {
           JButton colorButton = new JButton("Dark Blue-Gray");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Dark Blue-Gray");
           colorButton.setBackground(new Color((40f/100f), (40f/100f),
                 (60f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Drifloon") || ghostPokemon.get(i)
             .equals("Drifblim"))
         {
           JButton colorButton = new JButton("Lavender");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lavender");
           colorButton.setBackground(new Color((71f/100f), (49f/100f),
                 (86f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Spiritomb"))
         {
           JButton colorButton = new JButton("Electric Green");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Electric Green");
           colorButton.setBackground(new Color((0f/100f), (100f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Rotom"))
         {
           JButton colorButton = new JButton("Bright Orange");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Bright Orange");
           colorButton.setBackground(new Color((100f/100f), (50f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Yamask") || ghostPokemon.get(i)
             .equals("Cofagrigus"))
         {
           JButton colorButton = new JButton("Sand");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Sand");
           colorButton.setBackground(new Color((76f/100f), (70f/100f),
                 (50f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Golett") || ghostPokemon.get(i)
             .equals("Golurk"))
         {
           JButton colorButton = new JButton("Teal Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Teal Blue");
           colorButton.setBackground(new Color((21f/100f), (46f/100f),
                 (53f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (ghostPokemon.get(i).equals("Sableye"))
         {
           JButton colorButton = new JButton("Glitter");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Glitter");
           colorButton.setBackground(new Color((90f/100f), (91f/100f),
                 (98f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
       }
       for (int i = 0; i < colors.size(); i++) {
         colorsPanel.add(colors.get(i));
       }
       add(select, BorderLayout.NORTH);
       add(colorsPanel, BorderLayout.CENTER);

     }
     public void actionPerformed(ActionEvent e) {
       String colorStr = e.getActionCommand();
       Color color = ((JButton)e.getSource()).getBackground();
       ImageIcon pokePicture;
       JPanel n = new JPanel();
       ghostFrame.getContentPane().removeAll();
       if (colorStr.equals("Dark Purple") && ghostPokemon.contains("Gastly")) {
           n.add(createPokemon("Gastly", color));
       } else if (colorStr.equals("Dark Purple") &&
               ghostPokemon.contains("Haunter")){
           n.add(createPokemon("Haunter", color));
       } else if (colorStr.equals("Dark Purple") &&
               ghostPokemon.contains("Gengar")){
           n.add(createPokemon("Gengar", color));
       } else if (colorStr.equals("Magenta") && ghostPokemon.contains(
             "Misdreavus")) {
           n.add(createPokemon("Misdreavus", color));
       } else if (colorStr.equals("Magenta") && ghostPokemon.contains(
             "Mismagius")) {
           n.add(createPokemon("Mismagius", color));
       } else if (colorStr.equals("Amber")) {
           n.add(createPokemon("Shedinja", color));
       } else if (colorStr.equals("Glitter")) {
           n.add(createPokemon("Sableye", color));
       } else if (colorStr.equals("Dark Blue-Gray") && ghostPokemon
               .contains("Shuppet")) {
           n.add(createPokemon("Shuppet", color));
       } else if (colorStr.equals("Dark Blue-Gray") && ghostPokemon
               .contains("Banette")) {
           n.add(createPokemon("Banette", color));
       } else if (colorStr.equals("Black") && ghostPokemon
               .contains("Duskull")) {
           n.add(createPokemon("Duskull", color));
       } else if (colorStr.equals("Black") && ghostPokemon
               .contains("Dusclops")) {
           n.add(createPokemon("Goodra", color));
       } else if (colorStr.equals("Black") && ghostPokemon
           .contains("Dusknoir")) {
           n.add(createPokemon("Dusknoir", color));
       } else if (colorStr.equals("Lavender") && ghostPokemon
               .contains("Drifloon")) {
           n.add(createPokemon("Drifloon", color));
       } else if (colorStr.equals("Lavender") && ghostPokemon
               .contains("Drifblim")) {
           n.add(createPokemon("Drifblim", color));
       } else if (colorStr.equals("Electric Green")) {
           n.add(createPokemon("Spiritomb", color));
       } else if (colorStr.equals("Steel Blue")) {
           n.add(createPokemon("Froslass", color));
       } else if (colorStr.equals("Bright Orange")) {
           n.add(createPokemon("Rotom", color));
       } else if (colorStr.equals("Onyx")) {
           n.add(createPokemon("Giratina", color));
       } else if (colorStr.equals("Sand") && ghostPokemon
               .contains("Yamask")) {
           n.add(createPokemon("Yamask", color));
       } else if (colorStr.equals("Sand") && ghostPokemon
               .contains("Cofagrigus")) {
           n.add(createPokemon("Cofagrigus", color));
       } else if (colorStr.equals("White") && ghostPokemon
           .contains("Frillish-Male")) {
           n.add(createPokemon("Frillish-Male", color));
       } else if (colorStr.equals("White") && ghostPokemon
           .contains("Jellicent-Male")) {
           n.add(createPokemon("Jellicent-Male", color));
       } else if (colorStr.equals("White") && ghostPokemon
           .contains("Frillish-Female")) {
           n.add(createPokemon("Frillish-Female", color));
       } else if (colorStr.equals("White") && ghostPokemon
           .contains("Jellicent-Female")) {
           n.add(createPokemon("Jellicent-Female", color));
       } else if (colorStr.equals("Crimson") && ghostPokemon
           .contains("Litwick")) {
           n.add(createPokemon("Litwick", color));
       } else if (colorStr.equals("Crimson") && ghostPokemon
               .contains("Lampent")) {
           n.add(createPokemon("Lampent", color));
       } else if (colorStr.equals("Crimson") && ghostPokemon
               .contains("Chandelure")) {
           n.add(createPokemon("Chandelure", color));
       } else if (colorStr.equals("Teal Blue") && ghostPokemon
               .contains("Golett")) {
           n.add(createPokemon("Golett", color));
       } else if (colorStr.equals("Teal Blue") && ghostPokemon
               .contains("Golurk")) {
           n.add(createPokemon("Golurk", color));
       } else if (colorStr.equals("Royal Blue") && ghostPokemon
               .contains("Honedge")) {
           n.add(createPokemon("Honedge", color));
       } else if (colorStr.equals("Royal Blue") && ghostPokemon
           .contains("Doublade")) {
           n.add(createPokemon("Doublade", color));
       } else if (colorStr.equals("Royal Blue") && ghostPokemon
           .contains("Aegislash")) {
           n.add(createPokemon("Aegislash", color));
       } else if (colorStr.equals("Forest Green") && ghostPokemon
           .contains("Phantump")) {
           n.add(createPokemon("Phantump", color));
       } else if (colorStr.equals("Forest Green") && ghostPokemon
           .contains("Trevenant")) {
           n.add(createPokemon("Trevenant", color));
       } else if (colorStr.equals("Pumpkin Orange") && ghostPokemon
               .contains("Pumpkaboo")) {
           n.add(createPokemon("Pumpkaboo", color));
       } else if (colorStr.equals("Pumpkin Orange") && ghostPokemon
               .contains("Gourgeist")) {
           n.add(createPokemon("Gourgeist", color));
       } else if (colorStr.equals("Gold")) {
         n.add(createPokemon("Hoopa", color));
       }
       ghostFrame.add(n);
       ghostFrame.pack();
       ghostFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (ghostPokemon.get(0).equals("Gastly")) {
         n.add(createPokemon("Gastly", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (ghostPokemon.get(0).equals("Haunter")) {
         n.add(createPokemon("Haunter", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (ghostPokemon.get(0).equals("Gengar")) {
         n.add(createPokemon("Gengar", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (ghostPokemon.get(0).equals("Misdreavus")) {
         n.add(createPokemon("Misdreavus", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Mismagius")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Shedinja")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (75f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Sableye")) {
         n.add(createPokemon("Sabeleye", new Color((90f/100f),
                 (91f/100f),(98f/100f))));
       }
       if (ghostPokemon.get(0).equals("Frillish-Male")) {
         n.add(createPokemon("Frillish-Male", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Frillish-Female")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Jellicent-Male")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Jellicent-Female")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (ghostPokemon.get(0).equals("Duskull")) {
         n.add(createPokemon("Duskull", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Dusclops")) {
         n.add(createPokemon("Dusclops", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Dusknoir")) {
         n.add(createPokemon("Dusknoir", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Shuppet")) {
         n.add(createPokemon("Shuppet", new Color((40f/100f),
                 (40f/100f),(60f/100f))));
       }
       if (ghostPokemon.get(0).equals("Banette")) {
         n.add(createPokemon("Banette", new Color((40f/100f),
                 (40f/100f),(60f/100f))));
       }
       if (ghostPokemon.get(0).equals("Drifloon")) {
         n.add(createPokemon("Drifloon", new Color((71f/100f),
                 (49f/100f),(86f/100f))));
       }
       if (ghostPokemon.get(0).equals("Drifblim")) {
         n.add(createPokemon("Drifblim", new Color((71f/100f),
                 (49f/100f),(86f/100f))));
       }
       if (ghostPokemon.get(0).equals("Spiritomb")) {
         n.add(createPokemon("Spiritomb", new Color((0f/100f),
                 (100f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Froslass")) {
         n.add(createPokemon("Froslass", new Color((27f/100f),
                 (51f/100f),(71f/100f))));
       }
       if (ghostPokemon.get(0).equals("Rotom")) {
         n.add(createPokemon("Rotom", new Color((100f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Yamask")) {
         n.add(createPokemon("Yamask", new Color((76f/100f),
                 (70f/100f),(50f/100f))));
       }
       if (ghostPokemon.get(0).equals("Cofagrigus")) {
         n.add(createPokemon("Cofagrigus", new Color((76f/100f),
                 (70f/100f),(50f/100f))));
       }
       if (ghostPokemon.get(0).equals("Litwick")) {
         n.add(createPokemon("Litwick", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Lampent")) {
         n.add(createPokemon("Lampent", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Chandelure")) {
         n.add(createPokemon("Chandelure", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (ghostPokemon.get(0).equals("Golett")) {
         n.add(createPokemon("Golett", new Color((21f/100f),
                 (46f/100f),(53f/100f))));
       }
       if (ghostPokemon.get(0).equals("Golurk")) {
         n.add(createPokemon("Golurk", new Color((21f/100f),
                 (46f/100f),(53f/100f))));
       }
       if (ghostPokemon.get(0).equals("Honedge")) {
         n.add(createPokemon("Honedge", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (ghostPokemon.get(0).equals("Doublade")) {
         n.add(createPokemon("Doublade", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (ghostPokemon.get(0).equals("Aegislash")) {
         n.add(createPokemon("Aegislash", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (ghostPokemon.get(0).equals("Phantump")) {
         n.add(createPokemon("Phantump", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (ghostPokemon.get(0).equals("Trevenant")) {
         n.add(createPokemon("Trevenant", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (ghostPokemon.get(0).equals("Pumpkaboo")) {
         n.add(createPokemon("Pumpkaboo", new Color((100f/100f),
                 (46f/100f),(9f/100f))));
       }
       if (ghostPokemon.get(0).equals("Gourgeist")) {
         n.add(createPokemon("Gourgeist", new Color((100f/100f),
                 (46f/100f),(9f/100f))));
       }
       if (ghostPokemon.get(0).equals("Hoopa")) {
         n.add(createPokemon("Hoopa", new Color((83f/100f),
                 (69f/100f),(22f/100f))));
       }
       return n;
     }

     public static JLabel glitch() {
       ImageIcon pokePicture = new ImageIcon("images/MissingNo.png");
       JLabel pokeLabel = new JLabel("There was a glitch...", pokePicture,
           JLabel.CENTER);
       pokeLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       pokeLabel.setForeground(Color.WHITE);
       pokeLabel.setBackground(Color.BLACK);
       pokeLabel.setOpaque(true);
       return pokeLabel;
     }

     public static JLabel createPokemon(String pokemon, Color color) {
       ghostFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Ghost/" + pokemon +
           ".png");
       JLabel pokeLabel;
       if (pokemon.equals("Jellicent-Male") ||
           pokemon.equals("Jellicent-Female")) {
         pokeLabel = new JLabel("You are Jellicent!", pokePicture,
             JLabel.CENTER);
       } else if (pokemon.equals("Frillish-Male") ||
           pokemon.equals("Frillish-Female")) {
         pokeLabel = new JLabel("You are Frillish!", pokePicture,
             JLabel.CENTER);
           } else {
         pokeLabel = new JLabel("You are " + pokemon + "!", pokePicture,
             JLabel.CENTER);
         }
       pokeLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       if((color.getRed() + color.getGreen() + color.getBlue())/3.0 > 128.0) {
         pokeLabel.setForeground(Color.BLACK);
       } else {
         pokeLabel.setForeground(Color.WHITE);
       }
       pokeLabel.setOpaque(true);
       pokeLabel.setBackground(color);
       return pokeLabel;
     }
   }
   public static void main(String arg[]) {

		ghostPokemon.add("Gastly");
		ghostPokemon.add("Haunter");
		ghostPokemon.add("Gengar");
		ghostPokemon.add("Misdreavus");
		ghostPokemon.add("Shedinja");
		ghostPokemon.add("Sableye");
		ghostPokemon.add("Shuppet");
		ghostPokemon.add("Banette");
		ghostPokemon.add("Duskull");
		ghostPokemon.add("Dusclops");
		ghostPokemon.add("Drifloon");
		ghostPokemon.add("Drifblim");
		ghostPokemon.add("Mismagius");
		ghostPokemon.add("Spiritomb");
		ghostPokemon.add("Dusknoir");
		ghostPokemon.add("Froslass");
		ghostPokemon.add("Rotom");
		ghostPokemon.add("Giratina");
		ghostPokemon.add("Yamask");
		ghostPokemon.add("Cofagrigus");
		ghostPokemon.add("Frillish-Male");
    ghostPokemon.add("Frillish-Female");
		ghostPokemon.add("Jellicent-Male");
    ghostPokemon.add("Jellicent-Female");
		ghostPokemon.add("Litwick");
		ghostPokemon.add("Lampent");
		ghostPokemon.add("Chandelure");
		ghostPokemon.add("Golett");
		ghostPokemon.add("Golurk");
		ghostPokemon.add("Honedge");
		ghostPokemon.add("Doublade");
    ghostPokemon.add("Aegislash");
    ghostPokemon.add("Phantump");
    ghostPokemon.add("Trevenant");
    ghostPokemon.add("Pumpkaboo");
    ghostPokemon.add("Gourgeist");
    ghostPokemon.add("Hoopa");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Giratina");
    question.addPokemonYes("Hoopa");
    questions.add(question);

    question = new Question("Would drifting in the sky without a care in the" +
        " world appeal to you?");
    question.addPokemonYes("Drifloon");
    question.addPokemonYes("Drifblim");
    questions.add(question);

    question = new Question("Do you feel confined or trapped in your life or " +
        "by society's expectations/rules?");
    question.addPokemonYes("Spiritomb");
    questions.add(question);

    question = new Question("Do you have the odd habit of collecting a " +
        "certain kind or group of items?");
    question.addPokemonYes("Sableye");
    questions.add(question);

    question = new Question("Do you bear a strong grudge with someone or do " +
        "you have a hard time trusting people because of a betrayal in the " +
        "past?");
    question.addPokemonYes("Shuppet");
    question.addPokemonYes("Banette");
    questions.add(question);

    question = new Question("Do you like remembering the past or holding onto" +
        " mementos of past events, even if those memories are painful?");
    question.addPokemonYes("Yamask");
    question.addPokemonYes("Cofagrigus");
    questions.add(question);

    question = new Question("Do you have the power or charm to make your " +
        "friends do whatever you want them to?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Frillish-Female");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonYes("Jellicent-Female");
    questions.add(question);

    question = new Question("Do you generally not like to be the center of " +
        "attention, unless are you adept or proficient at something at hand?");
    question.addPokemonYes("Gastly");
    question.addPokemonYes("Haunter");
    question.addPokemonYes("Gengar");
    questions.add(question);

    question = new Question("Are you an excellent teacher or a steadfast " +
        "learner that has the desire to learn more and wishes the world was" +
        "more intelligent?");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Lampent");
    question.addPokemonYes("Chandelure");
    questions.add(question);
    
    question = new Question("Do you like playing pranks on people or teasing " +
        "those you consider inferior to you?");
    question.addPokemonYes("Misdreavus");
    question.addPokemonYes("Mismagius");
    questions.add(question);

    question = new Question("Do you have a strong sense of justice and " +
        "believe that karma will come into play eventually?");
    question.addPokemonYes("Duskull");
    question.addPokemonYes("Dusclops");
    question.addPokemonYes("Dusknoir");
    questions.add(question);

    question = new Question("Would a job involving electrical engineering, " +
        "software engineering, or hacking appeal to you?");
    question.addPokemonYes("Rotom");
    questions.add(question);

    question = new Question("Do you like doing things in a needlessly flashy" +
       " or technical sort of fashion?");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Doublade");
    question.addPokemonYes("Aegislash");
    questions.add(question);

    question = new Question("Would you not mind living in a secluded, " +
        "forested area, or do you tend to a rather large and extensive" +
        " garden?");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Trevenant");
    questions.add(question);

    question = new Question("Are you more active in the moonlit night than " +
        "during the day?");
    question.addPokemonYes("Pumpkaboo");
    question.addPokemonYes("Gourgeist");
    questions.add(question);

    question = new Question("Do you have a hard time controlling your " +
        "emotions, or ignoring those who are in need?");
    question.addPokemonYes("Golett");
    question.addPokemonYes("Golurk");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Gastly");
    question.addPokemonYes("Shuppet");
    question.addPokemonYes("Duskull");
    question.addPokemonYes("Drifloon");
    question.addPokemonYes("Yamask");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Frillish-Female");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Golett");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Pumpkaboo");

    question.addPokemonNo("Haunter");
    question.addPokemonNo("Gengar");
    question.addPokemonNo("Shedinja");
    question.addPokemonNo("Banette");
    question.addPokemonNo("Dusclops");
    question.addPokemonNo("Drifblim");
    question.addPokemonNo("Mismagius");
    question.addPokemonNo("Dusknoir");
    question.addPokemonNo("Froslass");
    question.addPokemonNo("Cofagrigus");
    question.addPokemonNo("Jellicent-Male");
    question.addPokemonNo("Jellicent-Female");
    question.addPokemonNo("Lampent");
    question.addPokemonNo("Chandelure");
    question.addPokemonNo("Golurk");
    question.addPokemonNo("Doublade");
    question.addPokemonNo("Aegislash");
    question.addPokemonNo("Trevenant");
    question.addPokemonNo("Gourgeist");
    questions.add(question);


    question = new Question("What gender are you?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonNo("Frillish-Female");
    question.addPokemonNo("Jellicent-Female");
    question.addPokemonNo("Froslass");
    questions.add(question);

    question = new Question("Do you enjoy or do you have the bad habit of " +
        "seducing guys and then pushing them away?");
    question.addPokemonYes("Froslass");
    questions.add(question);

    question = new Question("Are you shell of your former self, or have you " +
        "become a completely different person due to hardships?");
    question.addPokemonYes("Shedinja");
    questions.add(question);

    question = new Question("Do you have the habit of laughing at other " +
        "peoples' misfortune or pain, or even your own?");
    question.addPokemonYes("Gengar");
    question.addPokemonNo("Haunter");
    questions.add(question);

    question = new Question("Does the subject of the afterlife fascinate you " +
        "and do you believe in one?");
    question.addPokemonYes("Dusknoir");
    question.addPokemonNo("Dusclops");
    questions.add(question);

    question = new Question("Are your manners or speech elegant or refined " +
        "compared to most of your peers?");
    question.addPokemonYes("Chandelure");
    question.addPokemonNo("Lampent");
    questions.add(question);

    question = new Question("Do people either love you or hate you with " +
        "little in between?");
    question.addPokemonYes("Mismagius");
    question.addPokemonNo("Misdreavus");
    questions.add(question);

    question = new Question("Are you an excellent judge of someone's " +
        "character or abilities, and enjoy passing your judgement?");
    question.addPokemonYes("Aegislash");
    question.addPokemonNo("Doublade");
    questions.add(question);

    question = new Question("Do you believe you have been to the afterlife, " +
        "can accurately describe it, and have made it your purpose to tell " +
        "others about it?");
    question.addPokemonYes("Giratina");
    questions.add(question);

    question = new Question("Are you famous for your criminal exploits or " +
        "for all of the wealth that you have acquired?");
    question.addPokemonYes("Hoopa");
    questions.add(question);

    ghostFrame = new JFrame("GHOST TYPE QUIZ");
    ghostFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ghostPanel = new GhostTypeQuizGUI();
    ghostFrame.add(ghostPanel);
    ghostFrame.pack();
    ghostFrame.setVisible(true);
   }
}

