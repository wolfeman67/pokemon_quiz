import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class GrassTypeQuizGUI extends JPanel
{ static JFrame grassFrame;
  static JPanel grassPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> grassPokemon = new ArrayList<String>();
  static Map <String, ColorName> grassColors = 
          new HashMap<String, ColorName>();
   public GrassTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question grass = questions.poll();
     question = grass.getQuestion();
     thoseInAgreement = grass.getYes();
     thoseInDenial = grass.getNo();
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
     questionLabel.setBackground(new Color((11f/100f), (67f/100f),(47f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           grassPokemon.remove(thoseInDenial.get(i));
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
            grassFrame.getContentPane().removeAll();
		        grassPanel = new GrassTypeQuizGUI();
            grassFrame.add(grassPanel);
            grassFrame.pack();
          } else {
              if (grassPokemon.size() > 1) {
                  for(int i = 0; i < grassPokemon.size(); i++) {
                    System.out.println(grassPokemon.get(i));
                  }
                  grassFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  grassFrame.add(color);
                  grassFrame.pack();
              } else if (grassPokemon.size() == 1) {
                  grassFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  grassFrame.add(pokemon);
                  grassFrame.pack();
                  grassFrame.setVisible(true);
              } else {
                  grassFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  grassFrame.add(missingno);
                  grassFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           grassPokemon.remove(thoseInAgreement.get(i));
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
           grassFrame.getContentPane().removeAll();
		       grassPanel = new GrassTypeQuizGUI();
           grassFrame.add(grassPanel);
           grassFrame.pack();
         } else {
           if (grassPokemon.size() > 1) {
             for(int i = 0; i < grassPokemon.size(); i++) {
               System.out.println(grassPokemon.get(i));
             }
             grassFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             grassFrame.add(color);
             grassFrame.pack();
           } else if (grassPokemon.size() == 1) {
             grassFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             grassFrame.add(pokemon);
             grassFrame.pack();
             grassFrame.setVisible(true);
           } else {
             grassFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             grassFrame.add(missingno);
             grassFrame.pack();
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
       if (grassPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (grassPokemon.contains(noPoke.get(i))) {
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
       ColorName currentColor;
       String currentPokemon;
       float red;
       float green;
       float blue;
       ArrayList<JButton> colors = new ArrayList<JButton>();
       for (int i = 0; i < grassPokemon.size(); i++) {
           currentPokemon = grassPokemon.get(i);
           currentColor = grassColors.get(currentPokemon);
           red = currentColor.getRed();
           green = currentColor.getGreen();
           blue = currentColor.getBlue();
           JButton colorButton = new JButton(currentColor.getName());
           colorButton.setOpaque(true);
           colorButton.setActionCommand(currentPokemon);
           colorButton.addActionListener(this);
           if ((red + green + blue) / 3 < .5f) {
               colorButton.setForeground(Color.WHITE);
           } else {
               colorButton.setForeground(Color.BLACK);
           }
           colorButton.setBackground(new Color(red, green, blue));
           colors.add(colorButton);
       }
       for (int i = 0; i < colors.size(); i++) {
         colorsPanel.add(colors.get(i));
       }
       add(select, BorderLayout.NORTH);
       add(colorsPanel, BorderLayout.CENTER);

     }
     public void actionPerformed(ActionEvent e) {
       String finalPokemon = e.getActionCommand();
       Color color = ((JButton)e.getSource()).getBackground();
       
       JPanel n = new JPanel();
       n.add(createPokemon(finalPokemon, color));
       
       grassFrame.getContentPane().removeAll();
       grassFrame.add(n);
       grassFrame.pack();
       grassFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = grassColors.get(grassPokemon.get(0));
       n.add(createPokemon(grassPokemon.get(0), new Color(
               trueColor.getRed(), trueColor.getGreen(), trueColor.getBlue())));
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
       grassFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Grass/" + pokemon +
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
       grassPokemon.add("Bulbasaur");
       grassPokemon.add("Ivysaur");
       grassPokemon.add("Venusaur");
       grassPokemon.add("Oddish");
       grassPokemon.add("Gloom");
       grassPokemon.add("Vileplume");
       grassPokemon.add("Paras");
       grassPokemon.add("Parasect");
       grassPokemon.add("Bellsprout");
       grassPokemon.add("Weepinbell");
       grassPokemon.add("Victreebel");
       grassPokemon.add("Exeggcute");
       grassPokemon.add("Exeggutor");
       grassPokemon.add("Tangela");
       grassPokemon.add("Chikorita");
       grassPokemon.add("Bayleef");
       grassPokemon.add("Meganium");
       grassPokemon.add("Bellossom");
       grassPokemon.add("Hoppip");
       grassPokemon.add("Skiploom");
       grassPokemon.add("Jumpluff");
       grassPokemon.add("Sunkern");
       grassPokemon.add("Sunflora");
       grassPokemon.add("Celebi");
       grassPokemon.add("Treecko");
       grassPokemon.add("Grovyle");
       grassPokemon.add("Sceptile");
       grassPokemon.add("Lotad");
       grassPokemon.add("Lombre");
       grassPokemon.add("Ludicolo");
       grassPokemon.add("Seedot");
       grassPokemon.add("Nuzleaf");
       grassPokemon.add("Shiftry");
       grassPokemon.add("Shroomish");
       grassPokemon.add("Breloom");
       grassPokemon.add("Roselia");
       grassPokemon.add("Cacnea");
       grassPokemon.add("Cacturne");
       grassPokemon.add("Lileep");
       grassPokemon.add("Cradily");
       grassPokemon.add("Tropius");
       grassPokemon.add("Turtwig");
       grassPokemon.add("Grotle");
       grassPokemon.add("Torterra");
       grassPokemon.add("Budew");
       grassPokemon.add("Roserade");
       grassPokemon.add("Cherubi");
       grassPokemon.add("Cherrim");
       grassPokemon.add("Carnivine");
       grassPokemon.add("Snover");
       grassPokemon.add("Abomasnow");
       grassPokemon.add("Tangrowth");
       grassPokemon.add("Leafeon");
       grassPokemon.add("Shaymin");
       grassPokemon.add("Snivy");
       grassPokemon.add("Servine");
       grassPokemon.add("Serperior");
       grassPokemon.add("Pansage");
       grassPokemon.add("Simisage");
       grassPokemon.add("Sewaddle");
       grassPokemon.add("Swadloon");
       grassPokemon.add("Leavanny");
       grassPokemon.add("Cottonee");
       grassPokemon.add("Whimsicott");
       grassPokemon.add("Petilil");
       grassPokemon.add("Lilligant");
       grassPokemon.add("Maractus");
       grassPokemon.add("Deerling");
       grassPokemon.add("Sawsbuck");
       grassPokemon.add("Foongus");
       grassPokemon.add("Amoonguss");
       grassPokemon.add("Ferroseed");
       grassPokemon.add("Ferrothorn");
       grassPokemon.add("Virizion");
       grassPokemon.add("Chespin");
       grassPokemon.add("Quiladin");
       grassPokemon.add("Chesnaught");
       grassPokemon.add("Skiddo");
       grassPokemon.add("Gogoat");
       grassPokemon.add("Phantump");
       grassPokemon.add("Trevenant");
       grassPokemon.add("Pumpkaboo");
       grassPokemon.add("Gourgeist");
       
       grassColors.put("Bulbasaur", new ColorName("Teal Green",
               (0f/100f), (51f/100f), (50f/100f)));
       grassColors.put("Ivysaur", new ColorName("Teal Green",
               (0f/100f), (51f/100f), (50f/100f)));
       grassColors.put("Venusaur", new ColorName("Teal Green",
               (0f/100f), (51f/100f), (50f/100f)));
       grassColors.put("Oddish", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       grassColors.put("Gloom", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       grassColors.put("Vileplume", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       grassColors.put("Paras", new ColorName("Poppy",
               (100f/100f), (21f/100f), (37f/100f)));
       grassColors.put("Parasect", new ColorName("Poppy",
               (100f/100f), (21f/100f), (37f/100f)));
       grassColors.put("Bellsprout", new ColorName("Chartreuse",
               (50f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Weepinbell", new ColorName("Chartreuse",
               (50f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Victreebel", new ColorName("Chartreuse",
               (50f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Exeggcute", new ColorName("Eggplant",
               (38f/100f), (25f/100f), (32f/100f)));
       grassColors.put("Exeggutor", new ColorName("Eggplant",
               (38f/100f), (25f/100f), (32f/100f)));
       grassColors.put("Tangela", new ColorName("Deep Jungle Green",
               (0f/100f), (29f/100f), (29f/100f)));
       grassColors.put("Chikorita", new ColorName("Spring Green",
               (0f/100f), (100f/100f), (50f/100f)));
       grassColors.put("Bayleef", new ColorName("Spring Green",
               (0f/100f), (100f/100f), (50f/100f)));
       grassColors.put("Meganium", new ColorName("Spring Green",
               (0f/100f), (100f/100f), (50f/100f)));
       grassColors.put("Bellossom", new ColorName("Hot Pink",
               (100f/100f), (80f/100f), (20f/100f)));
       grassColors.put("Hoppip", new ColorName("Cream",
               (100f/100f), (99f/100f), (82f/100f)));
       grassColors.put("Skiploom", new ColorName("Cream",
               (100f/100f), (99f/100f), (82f/100f)));
       grassColors.put("Jumpluff", new ColorName("Cream",
               (100f/100f), (99f/100f), (82f/100f)));
       grassColors.put("Sunkern", new ColorName("Sunglow",
               (100f/100f), (80f/100f), (20f/100f)));
       grassColors.put("Sunflora", new ColorName("Sunglow",
               (100f/100f), (80f/100f), (20f/100f)));
       grassColors.put("Celebi", new ColorName("Jade",
               (0f/100f), (66f/100f), (42f/100f)));
       grassColors.put("Treecko", new ColorName("Jasper",
               (84f/100f), (23f/100f), (24f/100f)));
       grassColors.put("Grovyle", new ColorName("Jasper",
               (84f/100f), (23f/100f), (24f/100f)));
       grassColors.put("Sceptile", new ColorName("Jasper",
               (84f/100f), (23f/100f), (24f/100f)));
       grassColors.put("Lotad", new ColorName("Lime",
               (0f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Lombre", new ColorName("Lime",
               (0f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Ludicolo", new ColorName("Lime",
               (0f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Seedot", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       grassColors.put("Nuzleaf", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       grassColors.put("Shiftry", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       grassColors.put("Shroomish", new ColorName("Olive",
               (50f/100f), (50f/100f), (0f/100f)));
       grassColors.put("Breloom", new ColorName("Olive",
               (50f/100f), (50f/100f), (0f/100f)));
       grassColors.put("Roselia", new ColorName("Rose",
               (100f/100f), (0f/100f), (50f/100f)));
       grassColors.put("Cacnea", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       grassColors.put("Cacturne", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       grassColors.put("Lileep", new ColorName("Bright Lilac",
               (85f/100f), (57f/100f), (94f/100f)));
       grassColors.put("Cradily", new ColorName("Bright Lilac",
               (85f/100f), (57f/100f), (94f/100f)));
       grassColors.put("Tropius", new ColorName("Banana Yellow",
               (100f/100f), (88f/100f), (21f/100f)));
       grassColors.put("Turtwig", new ColorName("Earth Yellow",
               (88f/100f), (66f/100f), (37f/100f)));
       grassColors.put("Grotle", new ColorName("Earth Yellow",
               (88f/100f), (66f/100f), (37f/100f)));
       grassColors.put("Torterra", new ColorName("Earth Yellow",
               (88f/100f), (66f/100f), (37f/100f)));
       grassColors.put("Budew", new ColorName("Rose",
               (100f/100f), (0f/100f), (50f/100f)));
       grassColors.put("Roserade", new ColorName("Rose",
               (100f/100f), (0f/100f), (50f/100f)));
       grassColors.put("Cherubi", new ColorName("Cherry Blossom Pink",
               (100f/100f), (72f/100f), (77f/100f)));
       grassColors.put("Cherrim", new ColorName("Cherry Blossom Pink",
               (100f/100f), (72f/100f), (77f/100f)));
       grassColors.put("Carnivine", new ColorName("Bright Green",
               (40f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Snover", new ColorName("Snow",
               (100f/100f), (98f/100f), (98f/100f)));
       grassColors.put("Abomasnow", new ColorName("Snow",
               (100f/100f), (98f/100f), (98f/100f)));
       grassColors.put("Tangrowth", new ColorName("Deep Jungle Green",
               (0f/100f), (29f/100f), (29f/100f)));
       grassColors.put("Leafeon", new ColorName("Blond",
               (98f/100f), (94f/100f), (75f/100f)));
       grassColors.put("Shaymin", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       grassColors.put("Snivy", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       grassColors.put("Servine", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       grassColors.put("Serperior", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       grassColors.put("Pansage", new ColorName("Asparagus",
               (53f/100f), (66f/100f), (42f/100f)));
       grassColors.put("Simisage", new ColorName("Asparagus",
               (53f/100f), (66f/100f), (42f/100f)));
       grassColors.put("Sewaddle", new ColorName("Jasmine",
               (97f/100f), (87f/100f), (49f/100f)));
       grassColors.put("Swadloon", new ColorName("Jasmine",
               (97f/100f), (87f/100f), (49f/100f)));
       grassColors.put("Leavanny", new ColorName("Jasmine",
               (97f/100f), (87f/100f), (49f/100f)));
       grassColors.put("Cottonee", new ColorName("Harlequin",
               (25f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Whimsicott", new ColorName("Harlequin",
               (25f/100f), (100f/100f), (0f/100f)));
       grassColors.put("Petilil", new ColorName("Royal Purple",
               (47f/100f), (32f/100f), (66f/100f)));
       grassColors.put("Lilligant", new ColorName("Royal Purple",
               (47f/100f), (32f/100f), (66f/100f)));
       grassColors.put("Maractus", new ColorName("Mexican Pink",
               (89f/100f), (0f/100f), (49f/100f)));
       grassColors.put("Deerling", new ColorName("Deer",
               (73f/100f), (53f/100f), (35f/100f)));
       grassColors.put("Sawsbuck", new ColorName("Deer",
               (73f/100f), (53f/100f), (35f/100f)));
       grassColors.put("Foongus", new ColorName("Maroon",
               (50f/100f), (0f/100f), (0f/100f)));
       grassColors.put("Amoonguss", new ColorName("Maroon",
               (50f/100f), (0f/100f), (0f/100f)));
       grassColors.put("Ferroseed", new ColorName("Steel Gray",
               (52f/100f), (52f/100f), (51f/100f)));
       grassColors.put("Ferrothorn", new ColorName("Steel Gray",
               (52f/100f), (52f/100f), (51f/100f)));
       grassColors.put("Virizion", new ColorName("Malachite",
               (4f/100f), (85f/100f), (32f/100f)));
       grassColors.put("Chespin", new ColorName("Chestnut",
               (58f/100f), (27f/100f), (21f/100f)));
       grassColors.put("Quiladin", new ColorName("Chestnut",
               (58f/100f), (27f/100f), (21f/100f)));
       grassColors.put("Chesnaught", new ColorName("Chestnut",
               (58f/100f), (27f/100f), (21f/100f)));
       grassColors.put("Skiddo", new ColorName("Mountain Meadow",
               (19f/100f), (73f/100f), (56f/100f)));
       grassColors.put("Gogoat", new ColorName("Mountain Meadow",
               (19f/100f), (73f/100f), (56f/100f)));
       grassColors.put("Phantump", new ColorName("Mahogany",
               (75f/100f), (25f/100f), (0f/100f)));
       grassColors.put("Trevenant", new ColorName("Mahogany",
               (75f/100f), (25f/100f), (0f/100f)));
       grassColors.put("Pumpkaboo", new ColorName("Pumpkin",
               (100f/100f), (46f/100f), (9f/100f)));
       grassColors.put("Gourgeist", new ColorName("Pumpkin",
               (100f/100f), (46f/100f), (9f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Celebi");
    question.addPokemonYes("Shaymin");
    question.addPokemonYes("Virizion");
    questions.add(question);
    
    question = new Question("What gender are you?");
    question.addPokemonNo("Petilil");
    question.addPokemonNo("Lilligant");
    questions.add(question);

    question = new Question("Do you get the feeling that someone is mooching " +
      "off of you, or that someone is negatively affecting you in some way?");
    question.addPokemonYes("Paras");
    question.addPokemonYes("Parsect");
    questions.add(question);

    question = new Question("Do you enjoy basking in the sun, and getting " +
      "tans, or do you hate doing jobs that require getting yourself dirty?");
    question.addPokemonYes("Snivy");
    question.addPokemonYes("Servine");
    question.addPokemonYes("Serperior");
    questions.add(question);

    question = new Question("Are you cranky and surly when you don't get your" +
      " daily fix for the day (caffeinated beverages, entertainment, or, " +
        "ahem, illicit substances)?");
    question.addPokemonYes("Pansage");
    question.addPokemonYes("Simisage");
    questions.add(question);

    question = new Question("Are you a taxi driver by profession, tend to be " +
      "the person who's assigned to carpool, or are one who gets stuck " +
      "the undesirable parts of an assignment/job?");
    question.addPokemonYes("Skiddo");
    question.addPokemonYes("Gogoat");
    questions.add(question);

    question = new Question("Do you eat more fruit than you do unnaturally " +
      "sweet foods like cookies and candy?");
    question.addPokemonYes("Tropius");
    questions.add(question);

    question = new Question("Would you much rather live in hot, arid areas, " +
      "than in cold, wintery areas?");
    question.addPokemonYes("Cacnea");
    question.addPokemonYes("Cacturne");
    question.addPokemonYes("Maractus");
    question.addPokemonNo("Snover");
    question.addPokemonNo("Abomasnow");
    questions.add(question);

    question = new Question("Do you wear perfume or cologne that makes you " +
      "smell pleasant, or do you have an affable and friendly personality " +
      "draws people closer to you?");
    question.addPokemonYes("Chikorita");
    question.addPokemonYes("Bayleef");
    question.addPokemonYes("Meganium");
    questions.add(question);

    question = new Question("Do you create works of art that startle, "+
      "frighten, or shock the weak in heart?");
    question.addPokemonYes("Seedot");
    question.addPokemonYes("Nuzleaf");
    question.addPokemonYes("Shiftry");
    questions.add(question);

    question = new Question("Do you prefer an environment from a different " +
      "time in the past, or are you rather stubborn and unchanging in your " +
      "opinions or thoughts?");
    question.addPokemonYes("Lileep");
    question.addPokemonYes("Cradily");
    questions.add(question);

    question = new Question("Do you not like being touched or hugged by " +
      "people unless it is someone you are in a relationship with?");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Ferrothorn");
    questions.add(question);

    question = new Question("Do you have the habit of stalking people on " +
      "Facebook or other social networks before meeting them in real life?");
    question.addPokemonYes("Cacnea");
    question.addPokemonYes("Cacturne");
    questions.add(question);

    question = new Question("Do you not like showing people who you really " +
      "are, or do you have hair that is longer than what is considered normal" +
      " for your gender?");
    question.addPokemonYes("Tangela");
    question.addPokemonYes("Tangrowth");
    questions.add(question);

    question = new Question("Are you a morning person who tends to eat rather" +
      " little amounts of food, at least compared to most other people?");
    question.addPokemonYes("Sunkern");
    question.addPokemonYes("Sunflora");
    questions.add(question);

    question = new Question("Are you more active in the nighttime hours, than" +
      " in the morning, or do you get baths or showers less than what's " +
      "considered normal?");
    question.addPokemonYes("Oddish");
    question.addPokemonYes("Gloom");
    question.addPokemonYes("Vileplume");
    question.addPokemonNo("Bellossom");
    questions.add(question);

    question = new Question("Do you enjoy dancing and have a rather eclectic " +
      "taste in music?");
    question.addPokemonYes("Bellossom");
    question.addPokemonYes("Maractus");
    questions.add(question);

    question = new Question("Do you follow a group or club religously, or do " +
      "you believe that agreeing with the majority or sticking to norms is " +
      "the best way to go through life?");
    question.addPokemonYes("Exeggcute");
    question.addPokemonYes("Exeggutor");
    questions.add(question);

    question = new Question("Have you ever got lost in a forest or while " +
      "hiking, and has this scared you close to death?");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Trevenant");
    questions.add(question);

    question = new Question("Do you tend to sing or whistle songs to " +
      "yourself, while doing work or while walking, or do you laugh at " +
      "misfortunate events?");
    question.addPokemonYes("Pumpkaboo");
    question.addPokemonYes("Gourgeist");
    questions.add(question);

    question = new Question("Are you rather weak-willed and easily dissuaded," +
      " or tend to go through life without many cares or concerns?");
    question.addPokemonYes("Hoppip");
    question.addPokemonYes("Skiploom");
    question.addPokemonYes("Jumpluff");
    questions.add(question);

    question = new Question("Are you calm and collected in any situation, " +
      "because you don't really care about things or give off the impression " +
      "that you do not?");
    question.addPokemonYes("Treecko");
    question.addPokemonYes("Grovyle");
    question.addPokemonYes("Sceptile");
    questions.add(question);

    question = new Question("Were you raised to eat healthily, but insist on " +
      "going against those teachings, eating whatever junk food or " +
      "drinking whatever soft drinks you wish?");
    question.addPokemonYes("Bulbasaur");
    question.addPokemonYes("Ivysaur");
    question.addPokemonYes("Venusaur");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Bulbasaur");
    question.addPokemonYes("Oddish");
    question.addPokemonYes("Paras");
    question.addPokemonYes("Bellsprout");
    question.addPokemonYes("Exeggcute");
    question.addPokemonYes("Chikorita");
    question.addPokemonYes("Hoppip");
    question.addPokemonYes("Sunkern");
    question.addPokemonYes("Treecko");
    question.addPokemonYes("Lotad");
    question.addPokemonYes("Seedot");
    question.addPokemonYes("Shroomish");
    question.addPokemonYes("Cacnea");
    question.addPokemonYes("Lileep");
    question.addPokemonYes("Turtwig");
    question.addPokemonYes("Budew");
    question.addPokemonYes("Cherubi");
    question.addPokemonYes("Snover");
    question.addPokemonYes("Snivy");
    question.addPokemonYes("Pansage");
    question.addPokemonYes("Sewaddle");
    question.addPokemonYes("Cottonee");
    question.addPokemonYes("Petilil");
    question.addPokemonYes("Deerling");
    question.addPokemonYes("Foongus");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Chespin");
    question.addPokemonYes("Skiddo");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Pumpkaboo");

    question.addPokemonNo("Ivysaur");
    question.addPokemonNo("Venusaur");
    question.addPokemonNo("Gloom");
    question.addPokemonNo("Vileplume");
    question.addPokemonNo("Parasect");
    question.addPokemonNo("Weepinbell");
    question.addPokemonNo("Victreebel");
    question.addPokemonNo("Exeggutor");
    question.addPokemonNo("Bayleef");
    question.addPokemonNo("Meganium");
    question.addPokemonNo("Bellossom");
    question.addPokemonNo("Skiploom");
    question.addPokemonNo("Jumpluff");
    question.addPokemonNo("Sunflora");
    question.addPokemonNo("Grovyle");
    question.addPokemonNo("Sceptile");
    question.addPokemonNo("Lombre");
    question.addPokemonNo("Ludicolo");
    question.addPokemonNo("Nuzleaf");
    question.addPokemonNo("Shiftry");
    question.addPokemonNo("Breloom");
    question.addPokemonNo("Roselia");
    question.addPokemonNo("Cacturne");
    question.addPokemonNo("Cradily");
    question.addPokemonNo("Grotle");
    question.addPokemonNo("Torterra");
    question.addPokemonNo("Roserade");
    question.addPokemonNo("Cherrim");
    question.addPokemonNo("Abomasnow");
    question.addPokemonNo("Tangrowth");
    question.addPokemonNo("Leafeon");
    question.addPokemonNo("Servine");
    question.addPokemonNo("Serperior");
    question.addPokemonNo("Simisage");
    question.addPokemonNo("Swadloon");
    question.addPokemonNo("Leavanny");
    question.addPokemonNo("Whimsicott");
    question.addPokemonNo("Lilligant");
    question.addPokemonNo("Sawsbuck");
    question.addPokemonNo("Amoonguss");
    question.addPokemonNo("Ferrothorn");
    question.addPokemonNo("Quiladin");
    question.addPokemonNo("Chesnaught");
    question.addPokemonNo("Gogoat");
    question.addPokemonNo("Trevenant");
    question.addPokemonNo("Gourgeist");
    questions.add(question);

    question = new Question("If you feel as if a task or opponent is below " +
      "your skill level, do you not try as hard?");
    question.addPokemonYes("Serperior");
    question.addPokemonNo("Servine");
    questions.add(question);

    question = new Question("Are you rather reclusive and prefer living " +
      "alone, and does this lifestyle unnerve people?");
    question.addPokemonYes("Shiftry");
    question.addPokemonNo("Nuzleaf");
    questions.add(question);

    question = new Question("Are you the kind of person who is adept at " +
      "calming down people, or do you have a chill or relaxed personality?");
    question.addPokemonYes("Meganium");
    question.addPokemonNo("Bayleef");
    questions.add(question);

    question = new Question("Do you like partaking in parkour, or other " +
      "somewhat dangerous or reckless activities, like skydiving or " +
      "extreme skateboarding?");
    question.addPokemonYes("Sceptile");
    question.addPokemonNo("Grovyle");
    questions.add(question);

    question = new Question("Are you rather hefty for your size, but your " +
      "friendly or pleasant personality draws people to you regardless?");
    question.addPokemonYes("Venusaur");
    question.addPokemonNo("Ivysaur");
    questions.add(question);

    question = new Question("Are you completely pacifistic, and purposefully" +
      "avoid polluted or heavily populated areas like cities?");
    question.addPokemonYes("Leafeon");
    questions.add(question);

    question = new Question("Do you like surroundings yourself with scented " +
      "materials like candles or incense, or do you have a large ego that " +
      "sometimes pushes people away?");
    question.addPokemonYes("Vileplume");
    question.addPokemonNo("Gloom");
    questions.add(question);

    question = new Question("Do you have a hard time staying at one place for" +
      " long, or do you like traveling everywhere and seeing what the world " +
      "has to offer?");
    question.addPokemonYes("Jumpluff");
    question.addPokemonNo("Skiploom");
    questions.add(question);

    question = new Question("Do people say that you have the mentality of a " +
      "caveman, or do you prefer a culture that existed in the past, as " +
      "opposed to the current culture?");
    question.addPokemonYes("Tangrowth");
    question.addPokemonNo("Tangela");
    questions.add(question);

    grassFrame = new JFrame("GRASS TYPE QUIZ");
    grassFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    grassPanel = new GrassTypeQuizGUI();
    grassFrame.add(grassPanel);
    grassFrame.pack();
    grassFrame.setVisible(true);
   }
}

