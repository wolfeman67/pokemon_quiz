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
                  for(int i = 0; i < fairyPokemon.size(); i++) {
                  }
                  fairyFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  fairyFrame.add(color);
                  fairyFrame.pack();
              } else if (fairyPokemon.size() == 1) {
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
             for(int i = 0; i < fairyPokemon.size(); i++) {
             }
             fairyFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             fairyFrame.add(color);
             fairyFrame.pack();
           } else if (fairyPokemon.size() == 1) {
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
         if (fairyPokemon.get(i).equals("Flabebe") || fairyPokemon.get(i)
             .equals("Floette") || fairyPokemon.get(i).equals("Florges"))
         {
           JButton colorButton = new JButton("Rose");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Rose");
           colorButton.setBackground(new Color((100f/100f),(0f/100f),
                 (50f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (fairyPokemon.get(i).equals("Togepi") || fairyPokemon.get(i)
             .equals("Togetic") || fairyPokemon.get(i).equals("Togekiss"))
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
         if (fairyPokemon.get(i).equals("Azurill") || fairyPokemon.get(i)
             .equals("Marill") || fairyPokemon.get(i).equals("Azumarill"))
         {
           JButton colorButton = new JButton("Baby Blue");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Baby Blue");
           colorButton.setBackground(new Color((54f/100f), (81f/100f),
                 (94f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (fairyPokemon.get(i).equals("Cleffa") || fairyPokemon.get(i)
             .equals("Clefairy") || fairyPokemon.get(i).equals("Clefable"))
         {
           JButton colorButton = new JButton("Blush");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Blush");
           colorButton.setBackground(new Color((87f/100f), (36f/100f),
                 (51f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Igglybuff") || fairyPokemon.get(i)
             .equals("Jigglypuff") || fairyPokemon.get(i).equals("Wigglytuff"))
         {
           JButton colorButton = new JButton("Baby Pink");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Baby Pink");
           colorButton.setBackground(new Color((96f/100f), (76f/100f),
                 (76f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Xerneas"))
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
         if (fairyPokemon.get(i).equals("Snubbull") || fairyPokemon.get(i)
                 .equals("Granbull"))
         {
           JButton colorButton = new JButton("Lavender Magenta");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lavender Magenta");
           colorButton.setBackground(new Color((100f/100f), (0f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Dedenne"))
         {
           JButton colorButton = new JButton("Tangelo");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Tangelo");
           colorButton.setBackground(new Color((98f/100f), (30f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Ralts") || fairyPokemon.get(i)
             .equals("Kirlia") || fairyPokemon.get(i).equals("Gardevoir"))
         {
           JButton colorButton = new JButton("Azure");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Azure");
           colorButton.setBackground(new Color((0f/100f), (50f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Cottonee") || fairyPokemon.get(i)
                 .equals("Whimsicott"))
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
         if (fairyPokemon.get(i).equals("Mawile"))
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
         if (fairyPokemon.get(i).equals("Swirlix") || fairyPokemon.get(i)
             .equals("Slurpuff"))
         {
           JButton colorButton = new JButton("Cotton Candy");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cotton Candy");
           colorButton.setBackground(new Color((100f/100f), (74f/100f),
                 (85f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Spritzee") || fairyPokemon.get(i)
             .equals("Aromatisse"))
         {
           JButton colorButton = new JButton("Fandango");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Fandango");
           colorButton.setBackground(new Color((71f/100f), (20f/100f),
                 (54f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Mime Jr.") || fairyPokemon.get(i)
             .equals("Mr. Mime"))
         {
           JButton colorButton = new JButton("Razzmatazz");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Razzmatazz");
           colorButton.setBackground(new Color((89/100f), (15f/100f),
                 (42f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Sylveon"))
         {
           JButton colorButton = new JButton("Champagne");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Champagne");
           colorButton.setBackground(new Color((97f/100f), (91f/100f),
                 (81f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Diancie"))
         {
           JButton colorButton = new JButton("Diamond");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Diamond");
           colorButton.setBackground(new Color((73f/100f), (95f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (fairyPokemon.get(i).equals("Klefki"))
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
         if (fairyPokemon.get(i).equals("Carbink"))
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
       if (colorStr.equals("Blush") && fairyPokemon.contains("Cleffa")) {
           n.add(createPokemon("Cleffa", color));
       } else if (colorStr.equals("Blush") &&
               fairyPokemon.contains("Clefairy")){
           n.add(createPokemon("Clefairy", color));
       } else if (colorStr.equals("Blush") &&
               fairyPokemon.contains("Clefable")){
           n.add(createPokemon("Clefable", color));
       } else if (colorStr.equals("Baby Pink") && fairyPokemon.contains(
             "Igglybuff")) {
           n.add(createPokemon("Igglybuff", color));
       } else if (colorStr.equals("Baby Pink") && fairyPokemon.contains(
             "Jigglypuff")) {
           n.add(createPokemon("Jigglypuff", color));
       } else if (colorStr.equals("Baby Pink") && fairyPokemon.contains(
             "Wigglytuff")) {
           n.add(createPokemon("Wigglytuff", color));
       } else if (colorStr.equals("Razzmatazz") && fairyPokemon
               .contains("Mime Jr.")) {
           n.add(createPokemon("Mime Jr.", color));
       } else if (colorStr.equals("Razzmatazz") && fairyPokemon
               .contains("Mr. Mime")) {
           n.add(createPokemon("Mr. Mime", color));
       } else if (colorStr.equals("White") && fairyPokemon
               .contains("Togepi")) {
           n.add(createPokemon("Togepi", color));
       } else if (colorStr.equals("White") && fairyPokemon
               .contains("Togetic")) {
           n.add(createPokemon("Togetic", color));
       } else if (colorStr.equals("White") && fairyPokemon
           .contains("Togekiss")) {
           n.add(createPokemon("Togekiss", color));
       } else if (colorStr.equals("Baby Blue") && fairyPokemon
               .contains("Azurill")) {
           n.add(createPokemon("Azurill", color));
       } else if (colorStr.equals("Baby Blue") && fairyPokemon
               .contains("Marill")) {
           n.add(createPokemon("Marill", color));
       } else if (colorStr.equals("Baby Blue") && fairyPokemon
               .contains("Azumarill")) {
           n.add(createPokemon("Azumarill", color));
       } else if (colorStr.equals("Lavender Magenta") && fairyPokemon
           .contains("Snubbull")) {
           n.add(createPokemon("Snubbull", color));
       } else if (colorStr.equals("Lavender Magenta") && fairyPokemon
           .contains("Granbull")) {
           n.add(createPokemon("Granbull", color));
       } else if (colorStr.equals("Azure") && fairyPokemon.contains("Ralts")) {
           n.add(createPokemon("Ralts", color));
       } else if (colorStr.equals("Azure") && fairyPokemon.contains("Kirlia")) {
           n.add(createPokemon("Kirlia", color));
       } else if (colorStr.equals("Azure") && fairyPokemon
           .contains("Gardevoir")) {
           n.add(createPokemon("Gardevoir", color));
       } else if (colorStr.equals("Licorice")) {
           n.add(createPokemon("Mawile", color));
       } else if (colorStr.equals("Forest Green") && fairyPokemon
               .contains("Cottonee")) {
           n.add(createPokemon("Cottonee", color));
       } else if (colorStr.equals("Forest Green") && fairyPokemon
               .contains("Whimsicott")) {
           n.add(createPokemon("Whimsicott", color));
       } else if (colorStr.equals("Rose") && fairyPokemon
           .contains("Flabebe")) {
           n.add(createPokemon("Flabebe", color));
       } else if (colorStr.equals("Rose") && fairyPokemon
           .contains("Floette")) {
           n.add(createPokemon("Floette", color));
       } else if (colorStr.equals("Rose") && fairyPokemon
           .contains("Florges")) {
           n.add(createPokemon("Florges", color));
       } else if (colorStr.equals("Fandango") && fairyPokemon
           .contains("Spritzee")) {
           n.add(createPokemon("Spritzee", color));
       } else if (colorStr.equals("Fandango") && fairyPokemon
           .contains("Aromatisse")) {
           n.add(createPokemon("Aromatisse", color));
       } else if (colorStr.equals("Cotton Candy") && fairyPokemon
               .contains("Swirlix")) {
           n.add(createPokemon("Swirlix", color));
       } else if (colorStr.equals("Cotton Candy") && fairyPokemon
               .contains("Slurpuff")) {
           n.add(createPokemon("Slurpuff", color));
       } else if (colorStr.equals("Champagne")) {
           n.add(createPokemon("Sylveon", color));
       } else if (colorStr.equals("Tangelo")) {
           n.add(createPokemon("Dedenne", color));
       } else if (colorStr.equals("Glitter")) {
           n.add(createPokemon("Carbink", color));
       } else if (colorStr.equals("Light Gray")) {
           n.add(createPokemon("Klefki", color));
       } else if (colorStr.equals("Royal Blue")) {
           n.add(createPokemon("Xerneas", color));
       } else if (colorStr.equals("Diamond")) {
           n.add(createPokemon("Diancie", color));
       }
       fairyFrame.add(n);
       fairyFrame.pack();
       fairyFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (fairyPokemon.get(0).equals("Cleffa")) {
         n.add(createPokemon("Cleffa", new Color((87f/100f),
                 (36f/100f),(51f/100f))));
       }
       if (fairyPokemon.get(0).equals("Clefairy")) {
         n.add(createPokemon("Clefairy", new Color((87f/100f),
                 (36f/100f),(51f/100f))));
       }
       if (fairyPokemon.get(0).equals("Clefable")) {
         n.add(createPokemon("Clefable", new Color((87f/100f),
                 (36f/100f),(51f/100f))));
       }
       if (fairyPokemon.get(0).equals("Flabebe")) {
         n.add(createPokemon("Flabebe", new Color((100f/100f),
                 (0f/100f),(50f/100f))));
       }
       if (fairyPokemon.get(0).equals("Floette")) {
         n.add(createPokemon("Floette", new Color((100f/100f),
                 (0f/100f),(50f/100f))));
       }
       if (fairyPokemon.get(0).equals("Florges")) {
         n.add(createPokemon("Florges", new Color((100f/100f),
                 (0f/100f),(50f/100f))));
       }
       if (fairyPokemon.get(0).equals("Igglybuff")) {
         n.add(createPokemon("Igglybuff", new Color((96f/100f),
                 (76f/100f),(76f/100f))));
       }
       if (fairyPokemon.get(0).equals("Jigglypuff")) {
         n.add(createPokemon("Jigglypuff", new Color((96f/100f),
                 (76f/100f),(76f/100f))));
       }
       if (fairyPokemon.get(0).equals("Wigglytuff")) {
         n.add(createPokemon("Wigglytuff", new Color((96f/100f),
                 (76f/100f),(76f/100f))));
       }
       if (fairyPokemon.get(0).equals("Mime Jr.")) {
         n.add(createPokemon("Mime Jr.", new Color((89f/100f),
                 (15f/100f),(42f/100f))));
       }
       if (fairyPokemon.get(0).equals("Mr. Mime")) {
         n.add(createPokemon("Mr. Mime", new Color((89f/100f),
                 (15f/100f),(42f/100f))));
       }
       if (fairyPokemon.get(0).equals("Snubbull")) {
         n.add(createPokemon("Snubbull", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Granbull")) {
         n.add(createPokemon("Granbull", new Color((100f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Ralts")) {
         n.add(createPokemon("Ralts", new Color((0f/100f),
                 (50f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Kirlia")) {
         n.add(createPokemon("Kirlia", new Color((0f/100f),
                 (50f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Gardevoir")) {
         n.add(createPokemon("Gardevoir", new Color((0f/100f),
                 (50f/100f),(100f/100f))));
       }
       if (fairyPokemon.get(0).equals("Mawile")) {
         n.add(createPokemon("Mawile", new Color((10f/100f),
                 (7f/100f),(6f/100f))));
       }
       if (fairyPokemon.get(0).equals("Cottonee")) {
         n.add(createPokemon("Cottonee", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (fairyPokemon.get(0).equals("Whimsicott")) {
         n.add(createPokemon("Whimsicott", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (fairyPokemon.get(0).equals("Spritzee")) {
         n.add(createPokemon("Spritzee", new Color((71f/100f),
                 (20f/100f),(54f/100f))));
       }
       if (fairyPokemon.get(0).equals("Aromatisse")) {
         n.add(createPokemon("Aromatisse", new Color((71f/100f),
                 (20f/100f),(54f/100f))));
       }
       if (fairyPokemon.get(0).equals("Swirlix")) {
         n.add(createPokemon("Swirlix", new Color((100f/100f),
                 (74f/100f),(85f/100f))));
       }
       if (fairyPokemon.get(0).equals("Slurpuff")) {
         n.add(createPokemon("Slurpuff", new Color((100f/100f),
                 (74f/100f),(85f/100f))));
       }
       if (fairyPokemon.get(0).equals("Sylveon")) {
         n.add(createPokemon("Sylveon", new Color((97f/100f),
                 (91f/100f),(81f/100f))));
       }
       if (fairyPokemon.get(0).equals("Dedenne")) {
         n.add(createPokemon("Dedenne", new Color((98f/100f),
                 (30f/100f),(0f/100f))));
       }
       if (fairyPokemon.get(0).equals("Carbink")) {
         n.add(createPokemon("Carbink", new Color((90f/100f),
                 (91f/100f),(98f/100f))));
       }
       if (fairyPokemon.get(0).equals("Klefki")) {
         n.add(createPokemon("Klefki", new Color((83f/100f),
                 (83f/100f),(83f/100f))));
       }
       if (fairyPokemon.get(0).equals("Xerneas")) {
         n.add(createPokemon("Xerneas", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (fairyPokemon.get(0).equals("Diancie")) {
         n.add(createPokemon("Diancie", new Color((73f/100f),
                 (95f/100f),(100f/100f))));
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
      " television characters?");
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

