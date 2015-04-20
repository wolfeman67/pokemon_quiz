import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class DarkTypeQuizGUI extends JPanel
{ static JFrame darkFrame;
  static JPanel darkPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> darkPokemon = new ArrayList<String>();
  static Map <String, ColorName> darkColors = 
          new HashMap<String, ColorName>();
   public DarkTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question dark = questions.poll();
     question = dark.getQuestion();
     thoseInAgreement = dark.getYes();
     thoseInDenial = dark.getNo();
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
     questionLabel.setBackground(new Color((0f/100f), (0f/100f),(0f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           darkPokemon.remove(thoseInDenial.get(i));
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
            darkFrame.getContentPane().removeAll();
		        darkPanel = new DarkTypeQuizGUI();
            darkFrame.add(darkPanel);
            darkFrame.pack();
          } else {
              if (darkPokemon.size() > 1) {
                  for(int i = 0; i < darkPokemon.size(); i++) {
                    System.out.println(darkPokemon.get(i));
                  }
                  darkFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  darkFrame.add(color);
                  darkFrame.pack();
              } else if (darkPokemon.size() == 1) {
                  darkFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  darkFrame.add(pokemon);
                  darkFrame.pack();
                  darkFrame.setVisible(true);
              } else {
                  darkFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  darkFrame.add(missingno);
                  darkFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           darkPokemon.remove(thoseInAgreement.get(i));
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
           darkFrame.getContentPane().removeAll();
		       darkPanel = new DarkTypeQuizGUI();
           darkFrame.add(darkPanel);
           darkFrame.pack();
         } else {
           if (darkPokemon.size() > 1) {
             for(int i = 0; i < darkPokemon.size(); i++) {
               System.out.println(darkPokemon.get(i));
             }
             darkFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             darkFrame.add(color);
             darkFrame.pack();
           } else if (darkPokemon.size() == 1) {
             darkFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             darkFrame.add(pokemon);
             darkFrame.pack();
             darkFrame.setVisible(true);
           } else {
             darkFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             darkFrame.add(missingno);
             darkFrame.pack();
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
       if (darkPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (darkPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < darkPokemon.size(); i++) {
           currentPokemon = darkPokemon.get(i);
           currentColor = darkColors.get(currentPokemon);
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
       
       darkFrame.getContentPane().removeAll();
       darkFrame.add(n);
       darkFrame.pack();
       darkFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = darkColors.get(darkPokemon.get(0));
       n.add(createPokemon(darkPokemon.get(0), new Color(
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
       darkFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Dark/" + pokemon +
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
       darkPokemon.add("Umbreon");
       darkPokemon.add("Murkrow");
       darkPokemon.add("Sneasel");
       darkPokemon.add("Houndour");
       darkPokemon.add("Houndoom");
       darkPokemon.add("Tyranitar");
       darkPokemon.add("Poochyena");
       darkPokemon.add("Mightyena");
       darkPokemon.add("Nuzleaf");
       darkPokemon.add("Shiftry");
       darkPokemon.add("Sableye");
       darkPokemon.add("Carvanha");
       darkPokemon.add("Sharpedo");
       darkPokemon.add("Cacturne");
       darkPokemon.add("Crawdaunt");
       darkPokemon.add("Absol");
       darkPokemon.add("Honchkrow");
       darkPokemon.add("Stunky");
       darkPokemon.add("Skuntank");
       darkPokemon.add("Spiritomb");
       darkPokemon.add("Drapion");
       darkPokemon.add("Weavile");
       darkPokemon.add("Darkrai");
       darkPokemon.add("Purrloin");
       darkPokemon.add("Liepard");
       darkPokemon.add("Sandile");
       darkPokemon.add("Krokorok");
       darkPokemon.add("Krookodile");
       darkPokemon.add("Scraggy");
       darkPokemon.add("Scrafty");
       darkPokemon.add("Zorua");
       darkPokemon.add("Zoroark");
       darkPokemon.add("Pawniard");
       darkPokemon.add("Bisharp");
       darkPokemon.add("Vullaby");
       darkPokemon.add("Mandibuzz");
       darkPokemon.add("Deino");
       darkPokemon.add("Zweilous");
       darkPokemon.add("Hydreigon");
       darkPokemon.add("Greninja");
       darkPokemon.add("Pangoro");
       darkPokemon.add("Inkay");
       darkPokemon.add("Malamar");
       darkPokemon.add("Yveltal");
       
       darkColors.put("Umbreon", new ColorName("Moonstone Blue",
               (45f/100f), (66f/100f), (76f/100f)));
       darkColors.put("Murkrow", new ColorName("Dollar Bill",
               (52f/100f), (73f/100f), (40f/100f)));
       darkColors.put("Sneasel", new ColorName("Steel Blue",
               (27f/100f), (51f/100f), (71f/100f)));
       darkColors.put("Houndour", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       darkColors.put("Houndoom", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       darkColors.put("Tyranitar", new ColorName("Onyx",
               (21f/100f), (22f/100f), (22f/100f)));
       darkColors.put("Poochyena", new ColorName("Gray",
               (50f/100f), (50f/100f), (50f/100f)));
       darkColors.put("Mightyena", new ColorName("Gray",
               (50f/100f), (50f/100f), (50f/100f)));
       darkColors.put("Nuzleaf", new ColorName("Forest Green",
               (0f/100f), (27f/100f), (13f/100f)));
       darkColors.put("Shiftry", new ColorName("Forest Green",
               (0f/100f), (27f/100f), (13f/100f)));
       darkColors.put("Sableye", new ColorName("Glitter",
               (90f/100f), (91f/100f), (98f/100f)));
       darkColors.put("Carvanha", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       darkColors.put("Sharpedo", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       darkColors.put("Cacturne", new ColorName("Dark Green",
               (0f/100f), (20f/100f), (13f/100f)));
       darkColors.put("Crawdaunt", new ColorName("Rust",
               (72f/100f), (25f/100f), (5f/100f)));
       darkColors.put("Absol", new ColorName("Ghost White",
               (97f/100f), (97f/100f), (100f/100f)));
       darkColors.put("Honchkrow", new ColorName("Dollar Bill",
               (52f/100f), (73f/100f), (40f/100f)));
       darkColors.put("Stunky", new ColorName("Ube",
               (53f/100f), (47f/100f), (76f/100f)));
       darkColors.put("Skuntank", new ColorName("Ube",
               (53f/100f), (47f/100f), (76f/100f)));
       darkColors.put("Spiritomb", new ColorName("Harlequin",
               (25f/100f), (100f/100f), (0f/100f)));
       darkColors.put("Drapion", new ColorName("Indigo",
               (29f/100f), (0f/100f), (51f/100f)));
       darkColors.put("Weavile", new ColorName("Steel Blue",
               (27f/100f), (51f/100f), (71f/100f)));
       darkColors.put("Darkrai", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       darkColors.put("Purrloin", new ColorName("Magenta",
               (100f/100f), (0f/100f), (100f/100f)));
       darkColors.put("Liepard", new ColorName("Magenta",
               (100f/100f), (0f/100f), (100f/100f)));
       darkColors.put("Sandile", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       darkColors.put("Krokorok", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       darkColors.put("Krookodile", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       darkColors.put("Scraggy", new ColorName("Saffron",
               (96f/100f), (77f/100f), (19f/100f)));
       darkColors.put("Scrafty", new ColorName("Saffron",
               (96f/100f), (77f/100f), (19f/100f)));
       darkColors.put("Zorua", new ColorName("Lust",
               (90f/100f), (13f/100f), (13f/100f)));
       darkColors.put("Zoroark", new ColorName("Lust",
               (90f/100f), (13f/100f), (13f/100f)));
       darkColors.put("Pawniard", new ColorName("Gunmetal",
               (16f/100f), (20f/100f), (22f/100f)));
       darkColors.put("Bisharp", new ColorName("Gunmetal",
               (16f/100f), (20f/100f), (22f/100f)));
       darkColors.put("Vullaby", new ColorName("Eggshell",
               (94f/100f), (92f/100f), (84f/100f)));
       darkColors.put("Mandibuzz", new ColorName("Eggshell",
               (94f/100f), (92f/100f), (84f/100f)));
       darkColors.put("Deino", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       darkColors.put("Zweilous", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       darkColors.put("Hydreigon", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       darkColors.put("Greninja", new ColorName("Ultramarine",
               (7f/100f), (4f/100f), (56f/100f)));
       darkColors.put("Pangoro", new ColorName("Jet",
               (20f/100f), (20f/100f), (20f/100f)));
       darkColors.put("Inkay", new ColorName("Electric Violet",
               (56f/100f), (0f/100f), (100f/100f)));
       darkColors.put("Malamar", new ColorName("Electric Violet",
               (56f/100f), (0f/100f), (100f/100f)));
       darkColors.put("Yveltal", new ColorName("Devil Red",
               (53f/100f), (0f/100f), (7f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Darkrai");
    question.addPokemonYes("Yveltal");
    questions.add(question);
    
    question = new Question("What gender are you?");
    question.addPokemonNo("Vullaby");
    question.addPokemonNo("Mandibuzz");
    questions.add(question);

    question = new Question("Do you like dressing up in \"goth\" clothing " +
      "or the sort of clothes you could find at a place like Hot Topic?");
    question.addPokemonNo("Vullaby");
    question.addPokemonNo("Mandibuzz");
    questions.add(question);

    question = new Question("When you work with a team, do you tend to let " +
        "your teammates do most of the work, but take part of the credit?");
    question.addPokemonYes("Poochyena");
    question.addPokemonYes("Mightyena");
    questions.add(question);

    question = new Question("Do you pretend that you are something that you " +
        "are not in order to get out of sticky situations, or to get things " +
        "out of people?");
    question.addPokemonYes("Zorua");
    question.addPokemonYes("Zoroark");
    questions.add(question);

    question = new Question("Do people tend to forget your misdeeds or " +
        "lessen the amount of punishment you receive because of " +
        "how attractive or charismatic you are?");
    question.addPokemonYes("Purrloin");
    question.addPokemonYes("Liepard");
    questions.add(question);

    question = new Question("Do you have a magnetic personality that causes " +
        "others to do what you want, or believe what you say?");
    question.addPokemonYes("Inkay");
    question.addPokemonYes("Malamar");
    questions.add(question);

    question = new Question("Do you have the odd habit of collecting a " +
        "certain group of items?");
    question.addPokemonYes("Sableye");
    questions.add(question);

    question = new Question("Do you have the ability to detect where future " +
      "problems or conflicts will arise, or are you a rather pessimistic or " +
      "depressed person?");
    question.addPokemonYes("Absol");
    questions.add(question);

    question = new Question("Do you either let your natural body odor escape " +
        "your body unquashed, or do you wear heavy amounts of perfume or " +
        "cologne?");
    question.addPokemonYes("Stunky");
    question.addPokemonYes("Skuntank");
    questions.add(question);

    question = new Question("Do you have perfect, 20/20 vision or have never" +
        " had the need of glasses or contacts?");
    question.addPokemonYes("Sandile");
    question.addPokemonYes("Krokorok");
    question.addPokemonYes("Krookodile");
    questions.add(question);

    question = new Question("Are you into hoodlum culture, are a part of " +
        "a street gang, or would like to join a street gang but are too young?");
    question.addPokemonYes("Scraggy");
    question.addPokemonYes("Scrafty");
    questions.add(question);

    question = new Question("Are you obsessed with attaining great sums of " +
      "money or material possessions?");
    question.addPokemonYes("Murkrow");
    question.addPokemonYes("Honchkrow");
    questions.add(question);

    question = new Question("Are you a charming person, who has the " +
      "reputation as a bad boy/girl, and people never forget about you?");
    question.addPokemonYes("Houndour");
    question.addPokemonYes("Houndoom");
    questions.add(question);

    question = new Question("Do you mock those you consider inferior to you " +
      "when you are confident in your abilities, but also tend to dwell on " +
      "your shortcomings?");
    question.addPokemonYes("Carvanha");
    question.addPokemonYes("Sharpedo");
    questions.add(question);

    question = new Question("Do you feel trapped or confined by society's " +
      "rules, have ever been incarcerated, or have multiple personalities?");
    question.addPokemonYes("Spiritomb");
    questions.add(question);

    question = new Question("Do you tend to strategize and analyze everything" +
      ", and like forming plans before going into things?");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Bisharp");
    questions.add(question);

    question = new Question("Have you or would you turn to a life of crime " +
            "or thievery to attain great wealth or make end's meet?");
    question.addPokemonYes("Sneasel");
    question.addPokemonYes("Weavile");
    questions.add(question);

    question = new Question("Did you live in an abusive environment where " +
      "either your friends or family tended to quarrel or fight often?");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Zweilous");
    question.addPokemonYes("Hydreigon");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Houndour");
    question.addPokemonYes("Poochyena");
    question.addPokemonYes("Carvanha");
    question.addPokemonYes("Stunky");
    question.addPokemonYes("Purrloin");
    question.addPokemonYes("Sandile");
    question.addPokemonYes("Scraggy");
    question.addPokemonYes("Zorua");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Vullaby");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Inkay");

    question.addPokemonNo("Umbreon");
    question.addPokemonNo("Houndoom");
    question.addPokemonNo("Tyranitar");
    question.addPokemonNo("Mightyena");
    question.addPokemonNo("Nuzleaf");
    question.addPokemonNo("Shiftry");
    question.addPokemonNo("Sharpedo");
    question.addPokemonNo("Cacturne");
    question.addPokemonNo("Crawdaunt");
    question.addPokemonNo("Honchkrow");
    question.addPokemonNo("Skuntank");
    question.addPokemonNo("Drapion");
    question.addPokemonNo("Weavile");
    question.addPokemonNo("Liepard");
    question.addPokemonNo("Krokorok");
    question.addPokemonNo("Krookodile");
    question.addPokemonNo("Scrafty");
    question.addPokemonNo("Zoroark");
    question.addPokemonNo("Bisharp");
    question.addPokemonNo("Mandibuzz");
    question.addPokemonNo("Zweilous");
    question.addPokemonNo("Hydreigon");
    question.addPokemonNo("Greninja");
    question.addPokemonNo("Pangoro");
    question.addPokemonNo("Malamar");
    questions.add(question);

    question = new Question("Are you the kind of person that never gives up" +
        " on their dreams or goals, or refuses to accept no when rejected?");
    question.addPokemonYes("Krookodile");
    question.addPokemonNo("Krokorok");
    questions.add(question);

    question = new Question("Do you create works of art that startle, "+
      "frighten, or shock the weak in heart?");
    question.addPokemonYes("Nuzleaf");
    question.addPokemonYes("Shiftry");
    questions.add(question);

    question = new Question("Are you rather reclusive and prefer living " +
      "alone, and does this lifestyle unnerve people?");
    question.addPokemonYes("Shiftry");
    question.addPokemonNo("Nuzleaf");
    questions.add(question);

    question = new Question("Because you have experienced hardships that have" +
      " made you a harder person, are you more grouchy and combatitive than " +
      "most normal people?");
    question.addPokemonYes("Hydreigon");
    question.addPokemonNo("Zweilous");
    questions.add(question);

    question = new Question("Are you someone who always speaks their minds " +
        "or does what they want, without first considering the opinions of " +
        "others?");
    question.addPokemonYes("Pangoro");
    questions.add(question);

    question = new Question("Do you have a competitive drive that sometimes " +
      "causes you to act harshly or play dirty in your desire to be the best?");
    question.addPokemonYes("Crawdaunt");
    questions.add(question);

    question = new Question("Do you have underlings that do the grunt work " +
            "of your job or operation, while you do the more, ahem, important" +
            " tasks?");
    question.addPokemonYes("Honchkrow");
    question.addPokemonNo("Murkrow");
    questions.add(question);
 
    question = new Question("Do you like taking walks at night, in the dark, " +
            "or do you work out (and sweat profusely) in order to maintain " +
            "control over your stress levels?");
    question.addPokemonYes("Umbreon");
    questions.add(question);

    question = new Question("Do you tend to break things or hurt others when " +
        "you get angry, or are you in a position of political power?");
    question.addPokemonYes("Tyranitar");
    questions.add(question);

    question = new Question("Would you mind not living in hot or arid areas, " +
        "and do you have a bad habit of stalking people online?");
    question.addPokemonYes("Cacturne");
    questions.add(question);

    question = new Question("Do you have the ability to fit in with almost " +
        "any kind of crowd or group of people?");
    question.addPokemonYes("Greninja");
    questions.add(question);

    question = new Question("Are you able to get yourself out of sticky " +
            "situations by lying, or do you accomplish more when you have " +
            "teammates backing you up?");
    question.addPokemonYes("Weavile");
    question.addPokemonNo("Sneasel");
    questions.add(question);

    question = new Question("Do you not care about the world's resources " +
        "depleting, or do you believe that the world would be a better place" +
        " if some people died?");
    question.addPokemonYes("Yveltal");
    questions.add(question);

    question = new Question("Are you someone or have you played someone in "+
      "film that gives people nightmares?");
    question.addPokemonYes("Darkrai");
    questions.add(question);

    question = new Question("Do you take great pride in your strength or " +
        "athletic ability, and like picking on those who are not as " +
        "physically fit as you?");
    question.addPokemonYes("Drapion");
    questions.add(question);

    darkFrame = new JFrame("DARK TYPE QUIZ");
    darkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    darkPanel = new DarkTypeQuizGUI();
    darkFrame.add(darkPanel);
    darkFrame.pack();
    darkFrame.setVisible(true);
   }
}

