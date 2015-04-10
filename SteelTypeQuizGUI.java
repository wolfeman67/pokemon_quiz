import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SteelTypeQuizGUI extends JPanel
{ static JFrame steelFrame;
  static JPanel steelPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> steelPokemon = new ArrayList<String>();
   public SteelTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question steel = questions.poll();
     question = steel.getQuestion();
     thoseInAgreement = steel.getYes();
     thoseInDenial = steel.getNo();
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
     questionLabel.setBackground(new Color((54f/100f), (50f/100f),(50f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           steelPokemon.remove(thoseInDenial.get(i));
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
            steelFrame.getContentPane().removeAll();
		        steelPanel = new SteelTypeQuizGUI();
            steelFrame.add(steelPanel);
            steelFrame.pack();
          } else {
              if (steelPokemon.size() > 1) {
                  for(int i = 0; i < steelPokemon.size(); i++) {
                    System.out.println(steelPokemon.get(i));
                  }
                  steelFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  steelFrame.add(color);
                  steelFrame.pack();
              } else if (steelPokemon.size() == 1) {
                  steelFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  steelFrame.add(pokemon);
                  steelFrame.pack();
                  steelFrame.setVisible(true);
              } else {
                  steelFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  steelFrame.add(missingno);
                  steelFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           steelPokemon.remove(thoseInAgreement.get(i));
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
           steelFrame.getContentPane().removeAll();
		       steelPanel = new SteelTypeQuizGUI();
           steelFrame.add(steelPanel);
           steelFrame.pack();
         } else {
           if (steelPokemon.size() > 1) {
             for(int i = 0; i < steelPokemon.size(); i++) {
               System.out.println(steelPokemon.get(i));
             }
             steelFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             steelFrame.add(color);
             steelFrame.pack();
           } else if (steelPokemon.size() == 1) {
             steelFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             steelFrame.add(pokemon);
             steelFrame.pack();
             steelFrame.setVisible(true);
           } else {
             steelFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             steelFrame.add(missingno);
             steelFrame.pack();
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
       if (steelPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (steelPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < steelPokemon.size(); i++) {
         if (steelPokemon.get(i).equals("Bronzor") || steelPokemon.get(i)
             .equals("Bronzong"))
         {
           JButton colorButton = new JButton("Bronze");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Bronze");
           colorButton.setBackground(new Color((80f/100f),(50f/100f),
                 (20f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (steelPokemon.get(i).equals("Probopass"))
         {
           JButton colorButton = new JButton("Cyan");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cyan");
           colorButton.setBackground(new Color((0f/100f), (100f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (steelPokemon.get(i).equals("Magnemite") || steelPokemon.get(i)
             .equals("Magneton") || steelPokemon.get(i).equals("Magnezone"))
         {
           JButton colorButton = new JButton("Electric Yellow");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Electric Yellow");
           colorButton.setBackground(new Color((100f/100f), (100f/100f),
                 (20f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (steelPokemon.get(i).equals("Ferroseed") || steelPokemon.get(i)
             .equals("Ferrothorn"))
         {
           JButton colorButton = new JButton("Green");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Green");
           colorButton.setBackground(new Color((0f/100f), (50f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Shieldon") || steelPokemon.get(i)
             .equals("Bastiodon"))
         {
           JButton colorButton = new JButton("Mustard");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Mustard");
           colorButton.setBackground(new Color((100f/100f), (86f/100f),
                 (35f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Excadrill"))
         {
           JButton colorButton = new JButton("Chestnut");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Chestnut");
           colorButton.setBackground(new Color((58f/100f), (27f/100f),
                 (21f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Jirachi"))
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
         if (steelPokemon.get(i).equals("Empoleon"))
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
         if (steelPokemon.get(i).equals("Aron") || steelPokemon.get(i)
             .equals("Lairon") || steelPokemon.get(i).equals("Aggron"))
         {
           JButton colorButton = new JButton("Charcoal");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Charcoal");
           colorButton.setBackground(new Color((21f/100f), (27f/100f),
                 (31f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Lucario"))
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
         if (steelPokemon.get(i).equals("Mawile"))
         {
           JButton colorButton = new JButton("Licorice");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Licorice");
           colorButton.setBackground(new Color((10f/100f), (7f/100f),
                 (6f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Durant"))
         {
           JButton colorButton = new JButton("Malachite");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Malachite");
           colorButton.setBackground(new Color((4f/100f), (85f/100f),
                 (32f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Skarmory"))
         {
           JButton colorButton = new JButton("Crimson");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Crimson");
           colorButton.setBackground(new Color((86f/100f), (8f/100f),
                 (24f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Steelix"))
         {
           JButton colorButton = new JButton("Onyx");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Onyx");
           colorButton.setBackground(new Color((21f/100f), (22f/100f),
                 (22f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Heatran"))
         {
           JButton colorButton = new JButton("Burnt Orange");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Burnt Orange");
           colorButton.setBackground(new Color((80f/100f), (33f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Forretress"))
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
         if (steelPokemon.get(i).equals("Klefki"))
         {
           JButton colorButton = new JButton("Light Gray");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Light Gray");
           colorButton.setBackground(new Color((83f/100f), (83f/100f),
                 (83f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Genesect"))
         {
           JButton colorButton = new JButton("Electric Purple");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Electric Purple");
           colorButton.setBackground(new Color((75f/100f), (0f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Scizor"))
         {
           JButton colorButton = new JButton("Red");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Red");
           colorButton.setBackground(new Color((100f/100f), (0f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Escavalier"))
         {
           JButton colorButton = new JButton("Cadet Grey");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cadet Grey");
           colorButton.setBackground(new Color((57f/100f), (64f/100f),
                 (69f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Pawniard") ||
             steelPokemon.get(i).equals("Bisharp"))
         {
           JButton colorButton = new JButton("Burgundy");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Burgundy");
           colorButton.setBackground(new Color((50f/100f), (0f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Beldum") ||
             steelPokemon.get(i).equals("Metang") ||
             steelPokemon.get(i).equals("Metagross"))
         {
           JButton colorButton = new JButton("Cobalt Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cobalt Blue");
           colorButton.setBackground(new Color((0f/100f), (28f/100f),
                 (67f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Cobalion"))
         {
           JButton colorButton = new JButton("Silver");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Silver");
           colorButton.setBackground(new Color((75f/100f), (75f/100f),
                 (75f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Dialga"))
         {
           JButton colorButton = new JButton("Celestial Blue");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Celestial Blue");
           colorButton.setBackground(new Color((29f/100f), (59f/100f),
                 (82f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Klink") ||
             steelPokemon.get(i).equals("Klang") ||
             steelPokemon.get(i).equals("Klinklang"))
         {
           JButton colorButton = new JButton("Gray");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Gray");
           colorButton.setBackground(new Color((50f/100f), (50f/100f),
                 (50f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Registeel"))
         {
           JButton colorButton = new JButton("Outer Space");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Outer Space");
           colorButton.setBackground(new Color((25f/100f), (29f/100f),
                 (30f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (steelPokemon.get(i).equals("Honedge") ||
             steelPokemon.get(i).equals("Doublade") ||
             steelPokemon.get(i).equals("Aegislash"))
         {
           JButton colorButton = new JButton("Midnight Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Midnight Blue");
           colorButton.setBackground(new Color((10f/100f), (10f/100f),
                 (44f/100f)));
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
       steelFrame.getContentPane().removeAll();
       if (colorStr.equals("Electric Yellow") &&
           steelPokemon.contains("Magnemite")) {
           n.add(createPokemon("Magnemite", color));
       } else if (colorStr.equals("Electric Yellow") &&
               steelPokemon.contains("Magneton")){
           n.add(createPokemon("Magneton", color));
       } else if (colorStr.equals("Electric Yellow") &&
               steelPokemon.contains("Magnezone")){
           n.add(createPokemon("Magnezone", color));
       } else if (colorStr.equals("Forest Green")) {
           n.add(createPokemon("Forretress", color));
       } else if (colorStr.equals("Onyx")) {
           n.add(createPokemon("Steelix", color));
       } else if (colorStr.equals("Red")) {
           n.add(createPokemon("Scizor", color));
       } else if (colorStr.equals("Crimson")) {
           n.add(createPokemon("Skarmory", color));
       } else if (colorStr.equals("Licorice")) {
           n.add(createPokemon("Mawile", color));
       } else if (colorStr.equals("Charcoal") && steelPokemon
               .contains("Aron")) {
           n.add(createPokemon("Aron", color));
       } else if (colorStr.equals("Charcoal") && steelPokemon
               .contains("Lairon")) {
           n.add(createPokemon("Lairon", color));
       } else if (colorStr.equals("Charcoal") && steelPokemon
           .contains("Aggron")) {
           n.add(createPokemon("Aggron", color));
       } else if (colorStr.equals("Cobalt Blue") && steelPokemon
               .contains("Beldum")) {
           n.add(createPokemon("Beldum", color));
       } else if (colorStr.equals("Cobalt Blue") && steelPokemon
               .contains("Metang")) {
           n.add(createPokemon("Metang", color));
       } else if (colorStr.equals("Cobalt Blue") && steelPokemon
               .contains("Metagross")) {
           n.add(createPokemon("Metagross", color));
       } else if (colorStr.equals("Outer Space")) {
           n.add(createPokemon("Registeel", color));
       } else if (colorStr.equals("Gold")) {
           n.add(createPokemon("Jirachi", color));
       } else if (colorStr.equals("Royal Blue")) {
           n.add(createPokemon("Empoleon", color));
       } else if (colorStr.equals("Mustard") &&
           steelPokemon.contains("Shieldon")) {
           n.add(createPokemon("Shieldon", color));
       } else if (colorStr.equals("Mustard") && steelPokemon
           .contains("Bastiodon")) {
           n.add(createPokemon("Bastiodon", color));
       } else if (colorStr.equals("Bronze") &&
           steelPokemon.contains("Bronzor")) {
           n.add(createPokemon("Bronzor", color));
       } else if (colorStr.equals("Bronze") && steelPokemon
               .contains("Bronzong")) {
           n.add(createPokemon("Bronzong", color));
       } else if (colorStr.equals("Steel Blue")) {
           n.add(createPokemon("Lucario", color));
       } else if (colorStr.equals("Cyan")) {
           n.add(createPokemon("Probopass", color));
       } else if (colorStr.equals("Celestial Blue")) {
           n.add(createPokemon("Dialga", color));
       } else if (colorStr.equals("Burnt Orange")) {
           n.add(createPokemon("Heatran", color));
       } else if (colorStr.equals("Chestnut")) {
           n.add(createPokemon("Excadrill", color));
       } else if (colorStr.equals("Cadet Grey")) {
           n.add(createPokemon("Escavalier", color));
       } else if (colorStr.equals("Green") && steelPokemon
               .contains("Ferroseed")) {
           n.add(createPokemon("Ferroseed", color));
       } else if (colorStr.equals("Green") && steelPokemon
               .contains("Ferrothorn")) {
           n.add(createPokemon("Ferrothorn", color));
       } else if (colorStr.equals("Gray") && steelPokemon.contains("Klink")) {
           n.add(createPokemon("Klink", color));
       } else if (colorStr.equals("Gray") && steelPokemon.contains("Klang")) {
           n.add(createPokemon("Klang", color));
       } else if (colorStr.equals("Gray") &&
           steelPokemon.contains("Klinklang")) {
           n.add(createPokemon("Klinklang", color));
       } else if (colorStr.equals("Burgundy") &&
           steelPokemon.contains("Pawniard")) {
           n.add(createPokemon("Pawniard", color));
       } else if (colorStr.equals("Burgundy") &&
           steelPokemon.contains("Bisharp")) {
           n.add(createPokemon("Bisharp", color));
       } else if (colorStr.equals("Malachite")) {
           n.add(createPokemon("Durant", color));
       } else if (colorStr.equals("Silver")) {
           n.add(createPokemon("Cobalion", color));
       } else if (colorStr.equals("Electric Purple")) {
           n.add(createPokemon("Genesect", color));
       } else if (colorStr.equals("Midnight Blue") &&
           steelPokemon.contains("Honedge")) {
           n.add(createPokemon("Honedge", color));
       } else if (colorStr.equals("Midnight Blue") &&
           steelPokemon.contains("Doublade")) {
           n.add(createPokemon("Doublade", color));
       } else if (colorStr.equals("Midnight Blue") &&
           steelPokemon.contains("Aegislash")) {
           n.add(createPokemon("Aegislash", color));
       } else if(colorStr.equals("Light Gray")) {
           n.add(createPokemon("Klefki", color));
       }
       steelFrame.add(n);
       steelFrame.pack();
       steelFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (steelPokemon.get(0).equals("Magnemite")) {
         n.add(createPokemon("Magnemite", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (steelPokemon.get(0).equals("Magneton")) {
         n.add(createPokemon("Magneton", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (steelPokemon.get(0).equals("Magnezone")) {
         n.add(createPokemon("Magnezone", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (steelPokemon.get(0).equals("Forretress")) {
         n.add(createPokemon("Forretress", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (steelPokemon.get(0).equals("Steelix")) {
         n.add(createPokemon("Steelix", new Color((21f/100f),
                 (22f/100f),(22f/100f))));
       }
       if (steelPokemon.get(0).equals("Scizor")) {
         n.add(createPokemon("Scizor", new Color((100f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (steelPokemon.get(0).equals("Skarmory")) {
         n.add(createPokemon("Skarmory", new Color((86f/100f),
                 (8f/100f),(24f/100f))));
       }
       if (steelPokemon.get(0).equals("Mawile")) {
         n.add(createPokemon("Mawile", new Color((10f/100f),
                 (7f/100f),(6f/100f))));
       }
       if (steelPokemon.get(0).equals("Aron")) {
         n.add(createPokemon("Aron", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (steelPokemon.get(0).equals("Lairon")) {
         n.add(createPokemon("Lairon", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (steelPokemon.get(0).equals("Aggron")) {
         n.add(createPokemon("Aggron", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (steelPokemon.get(0).equals("Beldum")) {
         n.add(createPokemon("Beldum", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (steelPokemon.get(0).equals("Metang")) {
         n.add(createPokemon("Metang", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (steelPokemon.get(0).equals("Metagross")) {
         n.add(createPokemon("Metagross", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (steelPokemon.get(0).equals("Registeel")) {
         n.add(createPokemon("Registeel", new Color((25f/100f),
                 (29f/100f),(30f/100f))));
       }
       if (steelPokemon.get(0).equals("Jirachi")) {
         n.add(createPokemon("Jirachi", new Color((83f/100f),
                 (69f/100f),(22f/100f))));
       }
       if (steelPokemon.get(0).equals("Empoleon")) {
         n.add(createPokemon("Empoleon", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (steelPokemon.get(0).equals("Shieldon")) {
         n.add(createPokemon("Shieldon", new Color((100f/100f),
                 (86f/100f),(35f/100f))));
       }
       if (steelPokemon.get(0).equals("Bastiodon")) {
         n.add(createPokemon("Bastiodon", new Color((100f/100f),
                 (86f/100f),(35f/100f))));
       }
       if (steelPokemon.get(0).equals("Bronzor")) {
         n.add(createPokemon("Bronzor", new Color((80f/100f),
                 (50f/100f),(20f/100f))));
       }
       if (steelPokemon.get(0).equals("Bronzong")) {
         n.add(createPokemon("Bronzong", new Color((80f/100f),
                 (50f/100f),(20f/100f))));
       }
       if (steelPokemon.get(0).equals("Lucario")) {
         n.add(createPokemon("Lucario", new Color((27f/100f),
                 (51f/100f),(71f/100f))));
       }
       if (steelPokemon.get(0).equals("Probopass")) {
         n.add(createPokemon("Probopass", new Color((0f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (steelPokemon.get(0).equals("Dialga")) {
         n.add(createPokemon("Dialga", new Color((29f/100f),
                 (59f/100f),(82f/100f))));
       }
       if (steelPokemon.get(0).equals("Heatran")) {
         n.add(createPokemon("Heatran", new Color((80f/100f),
                 (33f/100f),(0f/100f))));
       }
       if (steelPokemon.get(0).equals("Excadrill")) {
         n.add(createPokemon("Excadrill", new Color((58f/100f),
                 (27f/100f),(21f/100f))));
       }
       if (steelPokemon.get(0).equals("Escavalier")) {
         n.add(createPokemon("Escavalier", new Color((57f/100f),
                 (64f/100f),(69f/100f))));
       }
       if (steelPokemon.get(0).equals("Ferroseed")) {
         n.add(createPokemon("Ferroseed", new Color((0f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (steelPokemon.get(0).equals("Ferrothorn")) {
         n.add(createPokemon("Ferrothorn", new Color((0f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (steelPokemon.get(0).equals("Klink")) {
         n.add(createPokemon("Klink", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (steelPokemon.get(0).equals("Klang")) {
         n.add(createPokemon("Klang", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (steelPokemon.get(0).equals("Klinklang")) {
         n.add(createPokemon("Klinklang", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (steelPokemon.get(0).equals("Pawniard")) {
         n.add(createPokemon("Pawniard", new Color((50f/100f),
                 (0f/100f),(13f/100f))));
       }
       if (steelPokemon.get(0).equals("Bisharp")) {
         n.add(createPokemon("Bisharp", new Color((50f/100f),
                 (0f/100f),(13f/100f))));
       }
       if (steelPokemon.get(0).equals("Durant")) {
         n.add(createPokemon("Durant", new Color((4f/100f),
                 (85f/100f),(32f/100f))));
       }
       if (steelPokemon.get(0).equals("Cobalion")) {
         n.add(createPokemon("Cobalion", new Color((75f/100f),
                 (75f/100f),(75f/100f))));
       }
       if (steelPokemon.get(0).equals("Genesect")) {
         n.add(createPokemon("Genesect", new Color((75f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (steelPokemon.get(0).equals("Honedge")) {
         n.add(createPokemon("Honedge", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (steelPokemon.get(0).equals("Doublade")) {
         n.add(createPokemon("Doublade", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (steelPokemon.get(0).equals("Aegislash")) {
         n.add(createPokemon("Aegislash", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (steelPokemon.get(0).equals("Klefki")) {
         n.add(createPokemon("Klefki", new Color((83f/100f),
                 (83f/100f),(83f/100f))));
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
       steelFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Steel/" + pokemon +
           ".png");
       JLabel pokeLabel;
       pokeLabel = new JLabel("You are " + pokemon + "!", pokePicture,
           JLabel.CENTER);
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
       steelPokemon.add("Magnemite");
       steelPokemon.add("Magneton");
       steelPokemon.add("Forretress");
       steelPokemon.add("Steelix");
       steelPokemon.add("Scizor");
       steelPokemon.add("Skarmory");
       steelPokemon.add("Mawile");
       steelPokemon.add("Aron");
       steelPokemon.add("Lairon");
       steelPokemon.add("Aggron");
       steelPokemon.add("Beldum");
       steelPokemon.add("Metang");
       steelPokemon.add("Metagross");
       steelPokemon.add("Registeel");
       steelPokemon.add("Jirachi");
       steelPokemon.add("Empoleon");
       steelPokemon.add("Shieldon");
       steelPokemon.add("Bastiodon");
       steelPokemon.add("Bronzor");
       steelPokemon.add("Bronzong");
       steelPokemon.add("Lucario");
       steelPokemon.add("Magnezone");
       steelPokemon.add("Probopass");
       steelPokemon.add("Dialga");
       steelPokemon.add("Heatran");
       steelPokemon.add("Excadrill");
       steelPokemon.add("Escavalier");
       steelPokemon.add("Ferroseed");
       steelPokemon.add("Ferrothorn");
       steelPokemon.add("Klink");
       steelPokemon.add("Klang");
       steelPokemon.add("Klinklang");
       steelPokemon.add("Pawniard");
       steelPokemon.add("Bisharp");
       steelPokemon.add("Durant");
       steelPokemon.add("Cobalion");
       steelPokemon.add("Genesect");
       steelPokemon.add("Honedge");
       steelPokemon.add("Doublade");
       steelPokemon.add("Aegislash");
       steelPokemon.add("Klefki");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Registeel");
    question.addPokemonYes("Jirachi");
    question.addPokemonYes("Dialga");
    question.addPokemonYes("Heatran");
    question.addPokemonYes("Cobalion");
    question.addPokemonYes("Genesect");
    questions.add(question);
    
    question = new Question("Do you tend to eat copious amounts of food, and" +
        " are always hungry?");
    question.addPokemonYes("Aron");
    question.addPokemonYes("Lairon");
    question.addPokemonYes("Aggron");
    questions.add(question);


    question = new Question("Do you believe that painful experiences or " +
        "hardships make someone ultimately stronger?");
    question.addPokemonYes("Skarmory");
    questions.add(question);

    question = new Question("Do you like to dignify yourself, or do things" +
        " in needlessly flashy or technical ways?");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Doublade");
    question.addPokemonYes("Aegislash");
    questions.add(question);

    question = new Question("Do you generally not like to be touched or " +
        "hugged by people unless if they are your significant other?");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Ferrothorn");
    questions.add(question);

    question = new Question("Do you believe that there is someone for " +
        "everyone (either in terms of romance or friendships)?");
    question.addPokemonYes("Klink");
    question.addPokemonYes("Klang");
    question.addPokemonYes("Klinklang");
    questions.add(question);

    question = new Question("Do you have an embarassing secret or weakness " +
        " that most people would laugh at if they found out?");
    question.addPokemonYes("Durant");
    questions.add(question);

    question = new Question("Would you consider studying the field of " +
        "meteorology, or do people consider you to be a fun person to be " +
        "around?");
    question.addPokemonYes("Bronzor");
    question.addPokemonYes("Bronzong");
    questions.add(question);

    question = new Question("Are you looking to enter the fields of computer " +
        "science, physics, or electrical engineering?");
    question.addPokemonYes("Magnemite");
    question.addPokemonYes("Magneton");
    question.addPokemonYes("Magnezone");
    questions.add(question);

    question = new Question("Is your outer self so much different from your " +
        "inner self that it would shock people?");
    question.addPokemonYes("Mawile");
    questions.add(question);

    question = new Question("Do you depend on your friends in order to " +
        "accomplish things, or do you believe that teamwork accomplishes more" +
        " than solitary work?");
    question.addPokemonYes("Beldum");
    question.addPokemonYes("Metang");
    question.addPokemonYes("Metagross");
    questions.add(question);

    question = new Question("Are you only concerned with your own personal " +
        "problems, and don't really care about the world at large?");
    question.addPokemonYes("Shieldon");
    question.addPokemonYes("Bastiodon");
    questions.add(question);

    question = new Question("Do you tend to strategize and analyze things, " +
        "and usually have a plan for everything, instead of rushing things?");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Bisharp");
    questions.add(question);

    question = new Question("Are you super-attentive about the security of " +
      "your personal information or possessions?");
    question.addPokemonYes("Klefki");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Magnemite");
    question.addPokemonYes("Aron");
    question.addPokemonYes("Beldum");
    question.addPokemonYes("Shieldon");
    question.addPokemonYes("Bronzor");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Klink");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Honedge");

    question.addPokemonNo("Magneton");
    question.addPokemonNo("Forretress");
    question.addPokemonNo("Steelix");
    question.addPokemonNo("Scizor");
    question.addPokemonNo("Lairon");
    question.addPokemonNo("Aggron");
    question.addPokemonNo("Metang");
    question.addPokemonNo("Metagross");
    question.addPokemonNo("Empoleon");
    question.addPokemonNo("Bastiodon");
    question.addPokemonNo("Bronzong");
    question.addPokemonNo("Lucario");
    question.addPokemonNo("Magnezone");
    question.addPokemonNo("Probopass");
    question.addPokemonNo("Excadrill");
    question.addPokemonNo("Escavalier");
    question.addPokemonNo("Ferrothorn");
    question.addPokemonNo("Klang");
    question.addPokemonNo("Klinklang");
    question.addPokemonNo("Bisharp");
    question.addPokemonNo("Doublade");
    question.addPokemonNo("Aegislash");
    questions.add(question);

    question = new Question("Are you quite belligerent when someone corrects " +
        "you or tries to change you in some way?");
    question.addPokemonYes("Aggron");
    question.addPokemonNo("Lairon");
    questions.add(question);

    question = new Question("Do you tend to nearly exclusively associate with" +
        " intellectuals or other generally intelligent people?");
    question.addPokemonYes("Metagross");
    question.addPokemonNo("Metang");
    questions.add(question);
 
    question = new Question("Are you a man with noticable or extravagent " +
        "facial hair, or are you a woman who finds facial hair attractive?");
    question.addPokemonYes("Probopass");
    questions.add(question);

    question = new Question("Do most people consider you enigmatic or " +
        "difficult to read?");
    question.addPokemonYes("Registeel");
    questions.add(question);

    question = new Question("Do you have the power or money to grant people's" +
        " wishes, and do you have philanthropic stance on life?");
    question.addPokemonYes("Jirachi");
    questions.add(question);

    question = new Question("Do you read people's thoughts or emotions very " +
        "well and has this made you a capable leader?");
    question.addPokemonYes("Lucario");
    questions.add(question);

    question = new Question("Do you usually read up on the latest scientific" +
        " discoveries or read scientific journals?");
    question.addPokemonYes("Magnezone");
    question.addPokemonNo("Magneton");
    questions.add(question);

    question = new Question("In terms of super powers, would you much rather " +
        "have armored skin over the ability to fly?");
    question.addPokemonYes("Scizor");
    questions.add(question);

    question = new Question("Do you like doing your own home remodeling/" +
        "construction projects, instead of paying someone to do it?");
    question.addPokemonYes("Excadrill");
    questions.add(question);

    question = new Question("Are you excellent judger of someone's qualities" +
        " and do you like passing that judgement onto others?");
    question.addPokemonYes("Aegislash");
    question.addPokemonNo("Doublade");
    questions.add(question);

    question = new Question("Are you an introvert who likes to close yourself" +
        " off in your little world, and dislikes leaving your \"bubble\"?");
    question.addPokemonYes("Forretress");
    questions.add(question);

    question = new Question("Are your true feelings only discernable if " +
       "someone pays attention to your actions ?");
    question.addPokemonYes("Klinklang");
    question.addPokemonNo("Klang");
    questions.add(question);

    question = new Question("Do you turn aggressive when someone mocks you or" +
        " belittles your accomplishments?");
    question.addPokemonYes("Empoleon");
    questions.add(question);

    question = new Question("Do you perform better when under pressure or " +
        "when stakes are high?");
    question.addPokemonYes("Steelix");
    questions.add(question);

    question = new Question("Have you studied or have came up with theories" +
        " on how to feasibly construct a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Do you sometimes have severe anger management" +
        " problems but usually keep it now under wraps?");
    question.addPokemonYes("Heatran");
    questions.add(question);
    
    question = new Question("Do you have the bad habit of not returning " +
        "things that you borrow from others, but otherwise are a moral person?");
    question.addPokemonYes("Escavalier");
    questions.add(question);
     
    question = new Question("Do you have commanding presence of a leader, but" +
        " others find you a bit cold and distant?");
    question.addPokemonYes("Cobalion");
    questions.add(question);
     
    question = new Question("Are you either a cyborg (partially at least) or " +
        "have been genetically modified in some way?");
    question.addPokemonYes("Genesect");
    questions.add(question);


    steelFrame = new JFrame("STEEL TYPE QUIZ");
    steelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    steelPanel = new SteelTypeQuizGUI();
    steelFrame.add(steelPanel);
    steelFrame.pack();
    steelFrame.setVisible(true);
   }
}

