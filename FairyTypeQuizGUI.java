import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FairyTypeQuizGUI extends JPanel
{ static JFrame fairyFrame;
  static JPanel fairyPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> fairyPokemon = new ArrayList<String>();
   public FairyTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question fairy = questions.poll();
     question = fairy.getQuestion();
     thoseInAgreement = fairy.getYes();
     thoseInDenial = fairy.getNo();
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
     questionLabel.setBackground(new Color((100f/100f), (40f/100f),(80f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           fairyPokemon.remove(thoseInDenial.get(i));
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
            fairyFrame.getContentPane().removeAll();
		        fairyPanel = new FairyTypeQuizGUI();
            fairyFrame.add(fairyPanel);
            fairyFrame.pack();
          } else {
              if (fairyPokemon.size() > 1) {
                  System.out.println(fairyPokemon.get(0));
                  fairyFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  fairyFrame.add(color);
                  fairyFrame.pack();
              } else if (fairyPokemon.size() == 1) {
                  System.out.println(fairyPokemon.get(0));
                  fairyFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  fairyFrame.add(pokemon);
                  fairyFrame.pack();
                  fairyFrame.setVisible(true);
              } else {
                  fairyFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  fairyFrame.add(missingno);
                  fairyFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           fairyPokemon.remove(thoseInAgreement.get(i));
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
           fairyFrame.getContentPane().removeAll();
		       fairyPanel = new FairyTypeQuizGUI();
           fairyFrame.add(fairyPanel);
           fairyFrame.pack();
         } else {
           if (fairyPokemon.size() > 1) {
               System.out.println(fairyPokemon.get(0));
             fairyFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             fairyFrame.add(color);
             fairyFrame.pack();
           } else if (fairyPokemon.size() == 1) {
               System.out.println(fairyPokemon.get(0));
             fairyFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             fairyFrame.add(pokemon);
             fairyFrame.pack();
             fairyFrame.setVisible(true);
           } else {
             fairyFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             fairyFrame.add(missingno);
             fairyFrame.pack();
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
       if (fairyPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (fairyPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < fairyPokemon.size(); i++) {
         if (fairyPokemon.get(i).equals("Gastly") || fairyPokemon.get(i)
             .equals("Haunter") || fairyPokemon.get(i).equals("Gengar"))
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
         if (fairyPokemon.get(i).equals("Duskull") || fairyPokemon.get(i)
             .equals("Dusclops") || fairyPokemon.get(i).equals("Dusknoir"))
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
         if (fairyPokemon.get(i).equals("Misdreavus") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Litwick") || fairyPokemon.get(i)
             .equals("Lampent") || fairyPokemon.get(i).equals("Chandelure"))
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
         if (fairyPokemon.get(i).equals("Giratina"))
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
         if (fairyPokemon.get(i).equals("Hoopa"))
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
         if (fairyPokemon.get(i).equals("Phantump") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Pumpkaboo") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Honedge") || fairyPokemon.get(i)
                 .equals("Doublade") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Frillish-Male") || fairyPokemon.get(i)
                 .equals("Jellicent-Male") || fairyPokemon.get(i)
                 .equals("Frillish-Female") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Froslass"))
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
         if (fairyPokemon.get(i).equals("Shedinja"))
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
         if (fairyPokemon.get(i).equals("Shuppet") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Drifloon") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Spiritomb"))
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
         if (fairyPokemon.get(i).equals("Rotom"))
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
         if (fairyPokemon.get(i).equals("Yamask") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Golett") || fairyPokemon.get(i)
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
         if (fairyPokemon.get(i).equals("Sableye"))
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
       fairyFrame.getContentPane().removeAll();
       if (colorStr.equals("Dark Purple") && fairyPokemon.contains("Gastly")) {
           n.add(createPokemon("Gastly", color));
       } else if (colorStr.equals("Dark Purple") &&
               fairyPokemon.contains("Haunter")){
           n.add(createPokemon("Haunter", color));
       } else if (colorStr.equals("Dark Purple") &&
               fairyPokemon.contains("Gengar")){
           n.add(createPokemon("Gengar", color));
       } else if (colorStr.equals("Magenta") && fairyPokemon.contains(
             "Misdreavus")) {
           n.add(createPokemon("Misdreavus", color));
       } else if (colorStr.equals("Magenta") && fairyPokemon.contains(
             "Mismagius")) {
           n.add(createPokemon("Mismagius", color));
       } else if (colorStr.equals("Amber")) {
           n.add(createPokemon("Shedinja", color));
       } else if (colorStr.equals("Glitter")) {
           n.add(createPokemon("Sableye", color));
       } else if (colorStr.equals("Dark Blue-Gray") && fairyPokemon
               .contains("Shuppet")) {
           n.add(createPokemon("Shuppet", color));
       } else if (colorStr.equals("Dark Blue-Gray") && fairyPokemon
               .contains("Banette")) {
           n.add(createPokemon("Banette", color));
       } else if (colorStr.equals("Black") && fairyPokemon
               .contains("Duskull")) {
           n.add(createPokemon("Duskull", color));
       } else if (colorStr.equals("Black") && fairyPokemon
               .contains("Dusclops")) {
           n.add(createPokemon("Goodra", color));
       } else if (colorStr.equals("Black") && fairyPokemon
           .contains("Dusknoir")) {
           n.add(createPokemon("Dusknoir", color));
       } else if (colorStr.equals("Lavender") && fairyPokemon
               .contains("Drifloon")) {
           n.add(createPokemon("Drifloon", color));
       } else if (colorStr.equals("Lavender") && fairyPokemon
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
       } else if (colorStr.equals("Sand") && fairyPokemon
               .contains("Yamask")) {
           n.add(createPokemon("Yamask", color));
       } else if (colorStr.equals("Sand") && fairyPokemon
               .contains("Cofagrigus")) {
           n.add(createPokemon("Cofagrigus", color));
       } else if (colorStr.equals("White") && fairyPokemon
           .contains("Frillish-Male")) {
           n.add(createPokemon("Frillish-Male", color));
       } else if (colorStr.equals("White") && fairyPokemon
           .contains("Jellicent-Male")) {
           n.add(createPokemon("Jellicent-Male", color));
       } else if (colorStr.equals("White") && fairyPokemon
           .contains("Frillish-Female")) {
           n.add(createPokemon("Frillish-Female", color));
       } else if (colorStr.equals("White") && fairyPokemon
           .contains("Jellicent-Female")) {
           n.add(createPokemon("Jellicent-Female", color));
       } else if (colorStr.equals("Crimson") && fairyPokemon
           .contains("Litwick")) {
           n.add(createPokemon("Litwick", color));
       } else if (colorStr.equals("Crimson") && fairyPokemon
               .contains("Lampent")) {
           n.add(createPokemon("Lampent", color));
       } else if (colorStr.equals("Crimson") && fairyPokemon
               .contains("Chandelure")) {
           n.add(createPokemon("Chandelure", color));
       } else if (colorStr.equals("Teal Blue") && fairyPokemon
               .contains("Golett")) {
           n.add(createPokemon("Golett", color));
       } else if (colorStr.equals("Teal Blue") && fairyPokemon
               .contains("Golurk")) {
           n.add(createPokemon("Golurk", color));
       } else if (colorStr.equals("Royal Blue") && fairyPokemon
               .contains("Honedge")) {
           n.add(createPokemon("Honedge", color));
       } else if (colorStr.equals("Royal Blue") && fairyPokemon
           .contains("Doublade")) {
           n.add(createPokemon("Doublade", color));
       } else if (colorStr.equals("Royal Blue") && fairyPokemon
           .contains("Aegislash")) {
           n.add(createPokemon("Aegislash", color));
       } else if (colorStr.equals("Forest Green") && fairyPokemon
           .contains("Phantump")) {
           n.add(createPokemon("Phantump", color));
       } else if (colorStr.equals("Forest Green") && fairyPokemon
           .contains("Trevenant")) {
           n.add(createPokemon("Trevenant", color));
       } else if (colorStr.equals("Pumpkin Orange") && fairyPokemon
               .contains("Pumpkaboo")) {
           n.add(createPokemon("Pumpkaboo", color));
       } else if (colorStr.equals("Pumpkin Orange") && fairyPokemon
               .contains("Gourgeist")) {
           n.add(createPokemon("Gourgeist", color));
       } else if (colorStr.equals("Gold")) {
         n.add(createPokemon("Hoopa", color));
       }
       fairyFrame.add(n);
       fairyFrame.pack();
       fairyFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (fairyPokemon.get(0).equals("Gastly")) {
         n.add(createPokemon("Gastly", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (fairyPokemon.get(0).equals("Haunter")) {
         n.add(createPokemon("Haunter", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (fairyPokemon.get(0).equals("Gengar")) {
         n.add(createPokemon("Gengar", new Color((20f/100f),
                 (9f/100f),(30f/100f))));
       }
       if (fairyPokemon.get(0).equals("Misdreavus")) {
         n.add(createPokemon("Misdreavus", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Mismagius")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Shedinja")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (75f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Sableye")) {
         n.add(createPokemon("Sabeleye", new Color((90f/100f),
                 (91f/100f),(98f/100f))));
       }
       if (fairyPokemon.get(0).equals("Frillish-Male")) {
         n.add(createPokemon("Frillish-Male", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Frillish-Female")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Jellicent-Male")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Jellicent-Female")) {
         n.add(createPokemon("Mismagius", new Color((100f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Duskull")) {
         n.add(createPokemon("Duskull", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Dusclops")) {
         n.add(createPokemon("Dusclops", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Dusknoir")) {
         n.add(createPokemon("Dusknoir", new Color((0f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Shuppet")) {
         n.add(createPokemon("Shuppet", new Color((40f/100f),
                 (40f/100f),(60f/100f))));
       }
       if (fairyPokemon.get(0).equals("Banette")) {
         n.add(createPokemon("Banette", new Color((40f/100f),
                 (40f/100f),(60f/100f))));
       }
       if (fairyPokemon.get(0).equals("Drifloon")) {
         n.add(createPokemon("Drifloon", new Color((71f/100f),
                 (49f/100f),(86f/100f))));
       }
       if (fairyPokemon.get(0).equals("Drifblim")) {
         n.add(createPokemon("Drifblim", new Color((71f/100f),
                 (49f/100f),(86f/100f))));
       }
       if (fairyPokemon.get(0).equals("Spiritomb")) {
         n.add(createPokemon("Spiritomb", new Color((0f/100f),
                 (100f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Froslass")) {
         n.add(createPokemon("Froslass", new Color((27f/100f),
                 (51f/100f),(71f/100f))));
       }
       if (fairyPokemon.get(0).equals("Rotom")) {
         n.add(createPokemon("Rotom", new Color((100f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Yamask")) {
         n.add(createPokemon("Yamask", new Color((76f/100f),
                 (70f/100f),(50f/100f))));
       }
       if (fairyPokemon.get(0).equals("Cofagrigus")) {
         n.add(createPokemon("Cofagrigus", new Color((76f/100f),
                 (70f/100f),(50f/100f))));
       }
       if (fairyPokemon.get(0).equals("Litwick")) {
         n.add(createPokemon("Litwick", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Lampent")) {
         n.add(createPokemon("Lampent", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Chandelure")) {
         n.add(createPokemon("Chandelure", new Color((60f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Golett")) {
         n.add(createPokemon("Golett", new Color((21f/100f),
                 (46f/100f),(53f/100f))));
       }
       if (fairyPokemon.get(0).equals("Golurk")) {
         n.add(createPokemon("Golurk", new Color((21f/100f),
                 (46f/100f),(53f/100f))));
       }
       if (fairyPokemon.get(0).equals("Honedge")) {
         n.add(createPokemon("Honedge", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (fairyPokemon.get(0).equals("Doublade")) {
         n.add(createPokemon("Doublade", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (fairyPokemon.get(0).equals("Aegislash")) {
         n.add(createPokemon("Aegislash", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (fairyPokemon.get(0).equals("Phantump")) {
         n.add(createPokemon("Phantump", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (fairyPokemon.get(0).equals("Trevenant")) {
         n.add(createPokemon("Trevenant", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (fairyPokemon.get(0).equals("Pumpkaboo")) {
         n.add(createPokemon("Pumpkaboo", new Color((100f/100f),
                 (46f/100f),(9f/100f))));
       }
       if (fairyPokemon.get(0).equals("Gourgeist")) {
         n.add(createPokemon("Gourgeist", new Color((100f/100f),
                 (46f/100f),(9f/100f))));
       }
       if (fairyPokemon.get(0).equals("Hoopa")) {
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
       fairyFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Fairy/" + pokemon +
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
       fairyPokemon.add("Clefairy");
       fairyPokemon.add("Clefable");
       fairyPokemon.add("Jigglypuff");
       fairyPokemon.add("Wigglytuff");
       fairyPokemon.add("Mr. Mime");
       fairyPokemon.add("Cleffa");
       fairyPokemon.add("Igglybuff");
       fairyPokemon.add("Togepi");
       fairyPokemon.add("Togetic");
       fairyPokemon.add("Marill");
       fairyPokemon.add("Azumarill");
       fairyPokemon.add("Snubbull");
       fairyPokemon.add("Granbull");
       fairyPokemon.add("Ralts");
       fairyPokemon.add("Kirlia");
       fairyPokemon.add("Gardevoir");
       fairyPokemon.add("Azurill");
       fairyPokemon.add("Mawile");
       fairyPokemon.add("Mime Jr.");
       fairyPokemon.add("Togekiss");
       fairyPokemon.add("Cottonee");
       fairyPokemon.add("Whimsicott");
       fairyPokemon.add("Flabebe");
       fairyPokemon.add("Floette");
       fairyPokemon.add("Florges");
       fairyPokemon.add("Spritzee");
       fairyPokemon.add("Aromatisse");
       fairyPokemon.add("Swirlix");
       fairyPokemon.add("Slurpuff");
       fairyPokemon.add("Sylveon");
       fairyPokemon.add("Dedenne");
       fairyPokemon.add("Carbink");
       fairyPokemon.add("Klefki");
       fairyPokemon.add("Xerneas");
       fairyPokemon.add("Diancie");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Xerneas");
    question.addPokemonYes("Diancie");
    questions.add(question);
    
    question = new Question("What gender are you?");
    question.addPokemonNo("Flabebe");
    question.addPokemonNo("Floette");
    question.addPokemonNo("Florges");
    questions.add(question);


    question = new Question("Are you addicted to television and obsess over" +
      "television characters?");
    question.addPokemonYes("Dedenne");
    questions.add(question);

    question = new Question("Is sleeping your favorite activity, and do you " +
      "tend to be a rather lazy and sleepy person?");
    question.addPokemonYes("Carbink");
    questions.add(question);

    question = new Question("Do you overindulge yourself on sweets or foods " +
      "that have high amounts of sugar?");
    question.addPokemonYes("Swirlix");
    question.addPokemonYes("Slurpuff");
    questions.add(question);

    question = new Question("Do you either let your body odor come out "+ 
      "or do you spray perfume or cologne on yourself on a regular basis?");
    question.addPokemonYes("Spritzee");
    question.addPokemonYes("Aromatisse");
    questions.add(question);

    question = new Question("Do you enjoy dancing, or can you come up with " +
      "music that comes from your own imagination?");
    question.addPokemonYes("Ralts");
    question.addPokemonYes("Kirlia");
    question.addPokemonYes("Gardevoir");
    questions.add(question);

    question = new Question("Do people see you as a rather strange person, " +
      "and do you find outer space fascinating?");
    question.addPokemonYes("Cleffa");
    question.addPokemonYes("Clefairy");
    question.addPokemonYes("Clefable");
    questions.add(question);

    question = new Question("Do you either have a wonderful singing voice, or" +
      " are do you have the kind of personality that people find boring?");
    question.addPokemonYes("Igglybuff");
    question.addPokemonYes("Jigglypuff");
    question.addPokemonYes("Wigglytuff");
    questions.add(question);

    question = new Question("Do you unintentionally emulate the mannerisms "+
      "and actions of those you admire?");
    question.addPokemonYes("Mime Jr.");
    question.addPokemonYes("Mr. Mime");
    questions.add(question);

    question = new Question("Do you only associate with good-natured people " +
      "or people your parents would consider good influences?");
    question.addPokemonYes("Togepi");
    question.addPokemonYes("Togetic");
    question.addPokemonYes("Togekiss");
    questions.add(question);

    question = new Question("Are you rather easy-going and flexible with " +
      "people, and does this draw them to you?");
    question.addPokemonYes("Azurill");
    question.addPokemonYes("Marill");
    question.addPokemonYes("Azumarill");
    questions.add(question);

    question = new Question("Is your inner personality rather different from " +
      "how you act in public, so much so it would shock people?");
    question.addPokemonYes("Mawile");
    questions.add(question);

    question = new Question("Do you often pull pranks on the unsuspecting, or" +
      " do you have a rather hedonistic outlook of life?");
    question.addPokemonYes("Cottonee");
    question.addPokemonYes("Whimsicott");
    questions.add(question);
    
    question = new Question("Do you like to act bad and tough, even though " +
      "you are a coward that is easily dissuaded?");
    question.addPokemonYes("Snubbull");
    question.addPokemonYes("Granbull");
    questions.add(question);

    question = new Question("Are you super-attentive about the security of " +
      "your personal information or possessions?");
    question.addPokemonYes("Klefki");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Cleffa");
    question.addPokemonYes("Igglybuff");
    question.addPokemonYes("Togepi");
    question.addPokemonYes("Snubbull");
    question.addPokemonYes("Ralts");
    question.addPokemonYes("Azurill");
    question.addPokemonYes("Mime Jr.");
    question.addPokemonYes("Cottonee");
    question.addPokemonYes("Flabebe");
    question.addPokemonYes("Spritzee");
    question.addPokemonYes("Swirlix");

    question.addPokemonNo("Clefairy");
    question.addPokemonNo("Clefable");
    question.addPokemonNo("Jigglypuff");
    question.addPokemonNo("Wigglytuff");
    question.addPokemonNo("Mr. Mime");
    question.addPokemonNo("Togetic");
    question.addPokemonNo("Marill");
    question.addPokemonNo("Azumarill");
    question.addPokemonNo("Granbull");
    question.addPokemonNo("Kirlia");
    question.addPokemonNo("Gardevoir");
    question.addPokemonNo("Togekiss");
    question.addPokemonNo("Whimsicott");
    question.addPokemonNo("Floette");
    question.addPokemonNo("Florges");
    question.addPokemonNo("Aromatisse");
    question.addPokemonNo("Slurpuff");
    question.addPokemonNo("Sylveon");
    questions.add(question);


    
    question = new Question("Do you enjoy the beauty of flowers and do you "+
      "tend to a garden?");
    question.addPokemonYes("Flabebe");
    question.addPokemonYes("Floette");
    question.addPokemonYes("Florges");
    questions.add(question);

    question = new Question("Do you live in an exquisite or large house or "+
      "do you live in the lap of luxury?");
    question.addPokemonYes("Florges");
    question.addPokemonNo("Floette");
    questions.add(question);

    question = new Question("Do you enjoy giving people hugs or other signs "+
      "of affection?");
    question.addPokemonYes("Sylveon");
    questions.add(question);

    question = new Question("Do you believe that world peace is the ultimate "+
      "for the world, and do you have ideas for how to attain it?");
    question.addPokemonYes("Togekiss");
    question.addPokemonNo("Togetic");
    questions.add(question);

    question = new Question("Are you rather protective and supportive of those"+
      " you love or are you close to?");
    question.addPokemonYes("Gardevoir");
    question.addPokemonNo("Kirlia");
    questions.add(question);

    question = new Question("Are you known to be a good listener for people " +
      "and their problems, who accepts people for who they are?");
    question.addPokemonYes("Azumarill");
    question.addPokemonNo("Marill");
    questions.add(question);

    question = new Question("Do you tend to avoid public events, like " +
      "concerts or fesitvals, because you are intimidated by large crowds?");
    question.addPokemonYes("Clefable");
    question.addPokemonNo("Clefairy");
    questions.add(question);

    question = new Question("Are you at least a tad bit pompous and full of " +
      "yourself?");
    question.addPokemonYes("Wigglytuff");
    question.addPokemonNo("Jigglypuff");
    questions.add(question);

    question = new Question("Are you a celebrity or famous person that came " +
      "from a common or lower class background?");
    question.addPokemonYes("Diancie");
    questions.add(question);
    
    question = new Question("Have you lived for an extraordinarily long " +
      "amount of time, or have good habits that will help you live longer?");
    question.addPokemonYes("Xerneas");
    questions.add(question);
    
    

    fairyFrame = new JFrame("FAIRY TYPE QUIZ");
    fairyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fairyPanel = new FairyTypeQuizGUI();
    fairyFrame.add(fairyPanel);
    fairyFrame.pack();
    fairyFrame.setVisible(true);
   }
}

