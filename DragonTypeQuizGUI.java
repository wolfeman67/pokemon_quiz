import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragonTypeQuizGUI extends JPanel
{ static JFrame dragonFrame;
  static JPanel dragonPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> dragonPokemon = new ArrayList<String>();
   public DragonTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question dragon = questions.poll();
     question = dragon.getQuestion();
     thoseInAgreement = dragon.getYes();
     thoseInDenial = dragon.getNo();
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
     questionLabel.setBackground(new Color(0.0f, 0.0f, 0.5f));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(new Color(1.0f, 1.0f, 1.0f));
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           dragonPokemon.remove(thoseInDenial.get(i));
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
            dragonFrame.getContentPane().removeAll();
		        dragonPanel = new DragonTypeQuizGUI();
            dragonFrame.add(dragonPanel);
            dragonFrame.pack();
          } else {
              if (dragonPokemon.size() > 1) {
                  dragonFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  dragonFrame.add(color);
                  dragonFrame.pack();
              } else if (dragonPokemon.size() == 1) {
                  dragonFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  dragonFrame.add(pokemon);
                  dragonFrame.pack();
                  dragonFrame.setVisible(true);
              } else {
                  dragonFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  dragonFrame.add(missingno);
                  dragonFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           dragonPokemon.remove(thoseInAgreement.get(i));
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
           dragonFrame.getContentPane().removeAll();
		       dragonPanel = new DragonTypeQuizGUI();
           dragonFrame.add(dragonPanel);
           dragonFrame.pack();
         } else {
           if (dragonPokemon.size() > 1) {
             dragonFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             dragonFrame.add(color);
             dragonFrame.pack();
           } else if (dragonPokemon.size() == 1) {
             dragonFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             dragonFrame.add(pokemon);
             dragonFrame.pack();
             dragonFrame.setVisible(true);
           } else {
             dragonFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             dragonFrame.add(missingno);
             dragonFrame.pack();
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
       if (dragonPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (dragonPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < dragonPokemon.size(); i++) {
         if (dragonPokemon.get(i).equals("Dratini") || dragonPokemon.get(i)
             .equals("Dragonair") || dragonPokemon.get(i).equals("Dragonite"))
         {
           JButton colorButton = new JButton("Azure");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Azure");
           colorButton.setBackground(new Color(0.000f, (191f/256f), 1.000f));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (dragonPokemon.get(i).equals("Druddigon"))
         {
           JButton colorButton = new JButton("Rust");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Rust");
           colorButton.setBackground(new Color((72f/100f), (25f/100f),
                 (5f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (dragonPokemon.get(i).equals("Altaria"))
         {
           JButton colorButton = new JButton("Cotton");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cotton");
           colorButton.setBackground(new Color((100f/100f), (97f/100f),
                 (86f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Bagon") || dragonPokemon.get(i)
                 .equals("Shelgon") || dragonPokemon.get(i).equals("Salamence"))
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
         if (dragonPokemon.get(i).equals("Axew") || dragonPokemon.get(i)
                 .equals("Fraxure") || dragonPokemon.get(i).equals("Haxorus"))
         {
           JButton colorButton = new JButton("Army Green");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Army Green");
           colorButton.setBackground(new Color((29f/100f), (33f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Vibrava") || dragonPokemon.get(i)
                 .equals("Flygon"))
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
         if (dragonPokemon.get(i).equals("Deino") || dragonPokemon.get(i)
                 .equals("Zweilous") || dragonPokemon.get(i)
                 .equals("Hydreigon"))
         {
           JButton colorButton = new JButton("Dark Purple");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Dark Purple");
           colorButton.setBackground(new Color((20f/100f), (9f/100f),
                 (30f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Gible") || dragonPokemon.get(i)
                 .equals("Gabite") || dragonPokemon.get(i).equals("Garchomp"))
         {
           JButton colorButton = new JButton("Imperial Blue");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Imperial Blue");
           colorButton.setBackground(new Color((0f/100f), (14f/100f),
                 (58f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Kingdra"))
         {
           JButton colorButton = new JButton("Turquoise");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Turquoise");
           colorButton.setBackground(new Color((25f/100f), (88f/100f),
                 (82f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Palkia"))
         {
           JButton colorButton = new JButton("Pearl");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Pearl");
           colorButton.setBackground(new Color((92f/100f), (88f/100f),
                 (78f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Reshiram"))
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
         if (dragonPokemon.get(i).equals("Zekrom"))
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
         if (dragonPokemon.get(i).equals("Dialga"))
         {
           JButton colorButton = new JButton("Cobalt");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cobalt");
           colorButton.setBackground(new Color((0f/100f), (28f/100f),
                 (67f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Latias") || dragonPokemon.get(i)
                 .equals("Latios"))
         {
           JButton colorButton = new JButton("Ivory");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Ivory");
           colorButton.setBackground(new Color((100f/100f), (100f/100f),
                 (94f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Giratina"))
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
         if (dragonPokemon.get(i).equals("Kyurem"))
         {
           JButton colorButton = new JButton("Iceberg");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Iceberg");
           colorButton.setBackground(new Color((44f/100f), (65f/100f),
                 (82f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Rayquaza"))
         {
           JButton colorButton = new JButton("Emerald");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Emerald");
           colorButton.setBackground(new Color((31f/100f), (78f/100f),
                 (47f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Tyrunt") || dragonPokemon.get(i)
                 .equals("Tyrantrum"))
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
         if (dragonPokemon.get(i).equals("Goomy") || dragonPokemon.get(i)
                 .equals("Sliggoo") || dragonPokemon.get(i).equals("Goodra"))
         {
           JButton colorButton = new JButton("Lavender");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lavender");
           colorButton.setBackground(new Color((80f/100f), (80f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Dragalge"))
         {
           JButton colorButton = new JButton("Cordovan");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cordovan");
           colorButton.setBackground(new Color((54f/100f), (25f/100f),
                 (27f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Noibat") || dragonPokemon.get(i)
                 .equals("Noivern"))
         {
           JButton colorButton = new JButton("Violet");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Violet");
           colorButton.setBackground(new Color((53f/100f), (0f/100f),
                 (69f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (dragonPokemon.get(i).equals("Zygarde"))
         {
           JButton colorButton = new JButton("Fluorescent Yellow");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Fluorescent Yellow");
           colorButton.setBackground(new Color((80f/100f), (100f/100f),
                 (0f/100f)));
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
       dragonFrame.getContentPane().removeAll();
       if (colorStr.equals("Azure") && dragonPokemon.contains("Dratini")) {
           n.add(createPokemon("Dratini", color));
       } else if (colorStr.equals("Azure") &&
               dragonPokemon.contains("Dragonair")){
           n.add(createPokemon("Dragonair", color));
       } else if (colorStr.equals("Azure") &&
               dragonPokemon.contains("Dragonite")){
           n.add(createPokemon("Dragonite", color));
       } else if (colorStr.equals("Rust")) {
           n.add(createPokemon("Druddigon", color));
       } else if (colorStr.equals("Cotton")) {
           n.add(createPokemon("Altaria", color));
       } else if (colorStr.equals("Steel Blue") &&
               dragonPokemon.contains("Bagon")) {
           n.add(createPokemon("Bagon", color));
       } else if (colorStr.equals("Steel Blue") && dragonPokemon
               .contains("Shelgon")) {
           n.add(createPokemon("Shelgon", color));
       } else if (colorStr.equals("Steel Blue") && dragonPokemon
               .contains("Salamence")) {
           n.add(createPokemon("Salamence", color));
       } else if (colorStr.equals("Lavender") && dragonPokemon
               .contains("Goomy")) {
           n.add(createPokemon("Goomy", color));
       } else if (colorStr.equals("Lavender") && dragonPokemon
               .contains("Sliggoo")) {
           n.add(createPokemon("Sliggoo", color));
       } else if (colorStr.equals("Lavender") && dragonPokemon
               .contains("Goodra")) {
           n.add(createPokemon("Goodra", color));
       } else if (colorStr.equals("Turquoise")) {
           n.add(createPokemon("Kingdra", color));
       } else if (colorStr.equals("Electric Green") && dragonPokemon
               .contains("Vibrava")) {
           n.add(createPokemon("Vibrava", color));
       } else if (colorStr.equals("Electric Green") && dragonPokemon
               .contains("Flygon")) {
           n.add(createPokemon("Flygon", color));
       } else if (colorStr.equals("Ivory") && dragonPokemon
               .contains("Latias")) {
           n.add(createPokemon("Latias", color));
       } else if (colorStr.equals("Ivory") && dragonPokemon
               .contains("Latios")) {
           n.add(createPokemon("Latios", color));
       } else if (colorStr.equals("Emerald")) {
           n.add(createPokemon("Rayquaza", color));
       } else if (colorStr.equals("Imperial Blue") && dragonPokemon
               .contains("Gible")) {
           n.add(createPokemon("Gible", color));
       } else if (colorStr.equals("Imperial Blue") && dragonPokemon
               .contains("Gabite")) {
           n.add(createPokemon("Gabite", color));
       } else if (colorStr.equals("Imperial Blue") && dragonPokemon
               .contains("Garchomp")) {
           n.add(createPokemon("Garchomp", color));
       } else if (colorStr.equals("Cobalt")) {
           n.add(createPokemon("Dialga", color));
       } else if (colorStr.equals("Pearl")) {
           n.add(createPokemon("Palkia", color));
       } else if (colorStr.equals("Onyx")) {
           n.add(createPokemon("Giratina", color));
       } else if (colorStr.equals("Army Green") && dragonPokemon
               .contains("Axew")) {
           n.add(createPokemon("Axew", color));
       } else if (colorStr.equals("Army Green") && dragonPokemon
               .contains("Fraxure")) {
           n.add(createPokemon("Fraxure", color));
       } else if (colorStr.equals("Army Green") && dragonPokemon
               .contains("Haxorus")) {
           n.add(createPokemon("Haxorus", color));
       } else if (colorStr.equals("Dark Purple") && dragonPokemon
               .contains("Deino")) {
           n.add(createPokemon("Deino", color));
       } else if (colorStr.equals("Dark Purple") && dragonPokemon
               .contains("Zweilous")) {
           n.add(createPokemon("Zweilous", color));
       } else if (colorStr.equals("Dark Purple") && dragonPokemon
               .contains("Hydreigon")) {
           n.add(createPokemon("Hydreigon", color));
       } else if (colorStr.equals("White")) {
           n.add(createPokemon("Reshiram", color));
       } else if (colorStr.equals("Black")) {
           n.add(createPokemon("Zekrom", color));
       } else if (colorStr.equals("Iceberg")) {
           n.add(createPokemon("Kyurem", color));
       } else if (colorStr.equals("Cordovan")) {
           n.add(createPokemon("Dragalge", color));
       } else if (colorStr.equals("Crimson") && dragonPokemon
               .contains("Tyrunt")) {
           n.add(createPokemon("Tyrunt", color));
       } else if (colorStr.equals("Crimson") && dragonPokemon
               .contains("Tyrantrum")) {
           n.add(createPokemon("Tyrantrum", color));
       } else if (colorStr.equals("Violet") && dragonPokemon
               .contains("Noibat")) {
           n.add(createPokemon("Noibat", color));
       } else if (colorStr.equals("Violet") && dragonPokemon
               .contains("Noivern")) {
           n.add(createPokemon("Noivern", color));
       } else if (colorStr.equals("Fluorescent Yellow")) {
           n.add(createPokemon("Zygarde", color));
       }
       
       dragonFrame.add(n);
       dragonFrame.pack();
       dragonFrame.setVisible(true);
     }

     //This will only be Druddigon or Noivern/Noibat
     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (dragonPokemon.get(0).equals("Druddigon")) {
         n.add(createPokemon("Druddigon", new Color((72f/100f),
                 (25f/100f),(5f/100f))));
       }
       if (dragonPokemon.get(0).equals("Noivern")) {
         n.add(createPokemon("Noivern", new Color((53f/100f),
                 (0f/100f),(69f/100f))));
       }
       if (dragonPokemon.get(0).equals("Noibat")) {
         n.add(createPokemon("Noibat", new Color((53f/100f),
                 (0f/100f),(69f/100f))));
       }
       return n;
     }

     //This won't happen with Dragon type unless something HORRIBLE happens
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
       dragonFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Dragon/" + pokemon +
           ".png");
       JLabel pokeLabel = new JLabel("You are " + pokemon + "!", pokePicture,
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

		dragonPokemon.add("Dratini");
		dragonPokemon.add("Dragonair");
		dragonPokemon.add("Dragonite");
		dragonPokemon.add("Kingdra");
		dragonPokemon.add("Vibrava");
		dragonPokemon.add("Flygon");
		dragonPokemon.add("Altaria");
		dragonPokemon.add("Bagon");
		dragonPokemon.add("Shelgon");
		dragonPokemon.add("Salamence");
		dragonPokemon.add("Latias");
		dragonPokemon.add("Latios");
		dragonPokemon.add("Rayquaza");
		dragonPokemon.add("Gible");
		dragonPokemon.add("Gabite");
		dragonPokemon.add("Garchomp");
		dragonPokemon.add("Dialga");
		dragonPokemon.add("Palkia");
		dragonPokemon.add("Giratina");
		dragonPokemon.add("Axew");
		dragonPokemon.add("Fraxure");
		dragonPokemon.add("Haxorus");
		dragonPokemon.add("Druddigon");
		dragonPokemon.add("Deino");
		dragonPokemon.add("Zweilous");
		dragonPokemon.add("Hydreigon");
		dragonPokemon.add("Reshiram");
		dragonPokemon.add("Zekrom");
		dragonPokemon.add("Kyurem");
    dragonPokemon.add("Dragalge");
    dragonPokemon.add("Tyrunt");
    dragonPokemon.add("Tyrantrum");
    dragonPokemon.add("Goomy");
    dragonPokemon.add("Sliggoo");
    dragonPokemon.add("Goodra");
    dragonPokemon.add("Noibat");
    dragonPokemon.add("Noivern");
    dragonPokemon.add("Zygarde");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Latios");
    question.addPokemonYes("Latias");
    question.addPokemonYes("Rayquaza");
    question.addPokemonYes("Dialga");
    question.addPokemonYes("Palkia");
    question.addPokemonYes("Giratina");
    question.addPokemonYes("Reshiram");
    question.addPokemonYes("Zekrom");
    question.addPokemonYes("Kyurem");
    question.addPokemonYes("Zygarde");
    questions.add(question);

    question = new Question("Do you have a hard time agreeing with" +
        " people and tend to argue?");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Zweilous");
    question.addPokemonYes("Hydreigon");
    questions.add(question);

    question = new Question("Is your quest in life to find or obtain rare and" +
        " beautiful things?");
    question.addPokemonYes("Gible");
    question.addPokemonYes("Gabite");
    question.addPokemonYes("Garchomp");
    questions.add(question);

    question = new Question("Are you the type to never give up on something" +
        " that you really believe in or on important goals?");
    question.addPokemonYes("Bagon");
    question.addPokemonYes("Shelgon");
    question.addPokemonYes("Salamence");
    questions.add(question);

    question = new Question("Are you more active in the sunny morning than in" +
        " the moonlit night?");
    question.addPokemonYes("Druddigon");
    question.addPokemonNo("Noibat");
    question.addPokemonNo("Noivern");
    questions.add(question);

    question = new Question("Do you have the ability to calm distressed" +
        " people or settle disagreements in a social setting?");
    question.addPokemonYes("Dratini");
    question.addPokemonYes("Dragonair");
    question.addPokemonYes("Dragonite");
    questions.add(question);

    question = new Question("Do you believe that practice and training (and" +
        " making mistakes in the process) is truly what makes perfect?");
    question.addPokemonYes("Axew");
    question.addPokemonYes("Fraxure");
    question.addPokemonYes("Haxorus");
    questions.add(question);

    question = new Question("Do you act like or do your peers treat you as a" +
        " king or leader (and do you throw fits if things don't go your way)?");
    question.addPokemonYes("Tyrunt");
    question.addPokemonYes("Tyrantrum");
    questions.add(question);

    question = new Question("Does nothing bother you, or do you believe that" +
        " anything can be overcome with enough determination and patience?");
    question.addPokemonYes("Goomy");
    question.addPokemonYes("Sliggoo");
    question.addPokemonYes("Goodra");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Dratini");
    question.addPokemonYes("Bagon");
    question.addPokemonYes("Gible");
    question.addPokemonYes("Axew");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Tyrunt");
    question.addPokemonYes("Goomy");
    question.addPokemonYes("Noibat");

    question.addPokemonNo("Dragonair");
    question.addPokemonNo("Dragonite");
    question.addPokemonNo("Kingdra");
    question.addPokemonNo("Vibrava");
    question.addPokemonNo("Altaria");
    question.addPokemonNo("Shelgon");
    question.addPokemonNo("Gabite");
    question.addPokemonNo("Garchomp");
    question.addPokemonNo("Fraxure");
    question.addPokemonNo("Haxorus");
    question.addPokemonNo("Zweilous");
    question.addPokemonNo("Hydreigon");
    question.addPokemonNo("Dragalge");
    question.addPokemonNo("Tyrantrum");
    question.addPokemonNo("Sliggoo");
    question.addPokemonNo("Goodra");
    question.addPokemonNo("Noivern");
    questions.add(question);


    question = new Question("Are you ruthless in your treatment of other " +
        "people regardless of who they are or what their relationship is with" +
        " you?");
    question.addPokemonYes("Dragalge");
    questions.add(question);

    question = new Question("Do you have the talent to be a singer?");
    question.addPokemonYes("Altaria");
    questions.add(question);

    question = new Question("Do people think you either contain great amounts" +
        " of wisdom or do people come to you for advice?");
    question.addPokemonYes("Dragonite");
    question.addPokemonNo("Dragonair");
    questions.add(question);

    question = new Question("Have you ever accomplished an achievement of " +
        "great merit that made you feel like a greater person?");
    question.addPokemonYes("Salamence");
    question.addPokemonNo("Shelgon");
    questions.add(question);

    question = new Question("Do you tend to daydream or drift through life " +
        "without any cares?");
    question.addPokemonYes("Kingdra");
    questions.add(question);

    question = new Question("Are you talkative and friendly to the point that" +
        " you feel as if you annoy some people?");
    question.addPokemonYes("Vibrava");
    question.addPokemonYes("Flygon");
    questions.add(question);

    question = new Question("Do you have a wonderful or interesting talent " +
        "no one knows about?");
    question.addPokemonYes("Flygon");
    question.addPokemonNo("Vibrava");
    questions.add(question);

    question = new Question("Are you the kind of person that never likes to " +
        "back down on a challenge or a dare, especially when your dignity is " +
        "on the line?");
    question.addPokemonYes("Haxorus");
    question.addPokemonNo("Fraxure");
    questions.add(question);

    question = new Question("Have you experienced great hardships or abuses " +
        "that have made you a stronger person?");
    question.addPokemonYes("Hydreigon");
    question.addPokemonNo("Zweilous");
    questions.add(question);

    question = new Question("Do you believe that money is the greatest force " +
        "in the world today, for better or for worse?");
    question.addPokemonYes("Garchomp");
    question.addPokemonNo("Gabite");
    questions.add(question);

    question = new Question("Are you generally a peaceful and kind person, " +
        "but aren't afraid to use force or intimidation if needed?");
    question.addPokemonYes("Goodra");
    question.addPokemonNo("Sliggoo");
    questions.add(question);

    question = new Question("Have you ever mediated between two opposing " +
        "factions of people and stopped or prevented a great conflict?");
    question.addPokemonYes("Rayquaza");
    questions.add(question);

    question = new Question("Are you naturally in tune to other peoples'" +
        " feelings or emotions and do you make a good psychiatrist?");
    question.addPokemonYes("Latias");
    question.addPokemonYes("Latios");
    questions.add(question);

    question = new Question("What gender are you?");
    question.addPokemonYes("Latios");
    question.addPokemonNo("Latias");
    questions.add(question);

    question = new Question("Have you participated in research on how to " +
        "feasibly develop a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Do you work extensively in the space program and" +
        " have been/would like to be in space?");
    question.addPokemonYes("Palkia");
    questions.add(question);

    question = new Question("Do you believe that you have visited the " +
        "afterlife, can accurately describe it, and have made it your purpose" +
        " to tell people about it?");
    question.addPokemonYes("Giratina");
    questions.add(question);

    question = new Question("Are you a die-hard seeker of truth and wish to " +
        "benefit mankind with your discoveries?");
    question.addPokemonYes("Kyurem");
    questions.add(question);

    question = new Question("Do you have a rather meek or delicate appearance" +
        " that betrays your inner strength and willpower?");
    question.addPokemonYes("Reshiram");
    questions.add(question);

    question = new Question("Do you have a rough and rugged appearance that " +
        "betrays your inner gentleness and calmness?");
    question.addPokemonYes("Zekrom");
    questions.add(question);

    question = new Question("Are you a famed environmentalist or biologist " +
        "who believes that humans are the culprit for most of the world's " +
        "problems?");
    question.addPokemonYes("Zygarde");
    questions.add(question);


    dragonFrame = new JFrame("DRAGON TYPE QUIZ");
    dragonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dragonPanel = new DragonTypeQuizGUI();
    dragonFrame.add(dragonPanel);
    dragonFrame.pack();
    dragonFrame.setVisible(true);
   }
}
