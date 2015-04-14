import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class IceTypeQuizGUI extends JPanel
{ static JFrame iceFrame;
  static JPanel icePanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> icePokemon = new ArrayList<String>();
  static Map <String, ColorName> iceColors = 
          new HashMap<String, ColorName>();
   public IceTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question ice = questions.poll();
     question = ice.getQuestion();
     thoseInAgreement = ice.getYes();
     thoseInDenial = ice.getNo();
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
     questionLabel.setBackground(new Color((44f/100f), (65f/100f),(82f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           icePokemon.remove(thoseInDenial.get(i));
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
            iceFrame.getContentPane().removeAll();
		        icePanel = new IceTypeQuizGUI();
            iceFrame.add(icePanel);
            iceFrame.pack();
          } else {
              if (icePokemon.size() > 1) {
                  for(int i = 0; i < icePokemon.size(); i++) {
                    System.out.println(icePokemon.get(i));
                  }
                  iceFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  iceFrame.add(color);
                  iceFrame.pack();
              } else if (icePokemon.size() == 1) {
                  iceFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  iceFrame.add(pokemon);
                  iceFrame.pack();
                  iceFrame.setVisible(true);
              } else {
                  iceFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  iceFrame.add(missingno);
                  iceFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           icePokemon.remove(thoseInAgreement.get(i));
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
           iceFrame.getContentPane().removeAll();
		       icePanel = new IceTypeQuizGUI();
           iceFrame.add(icePanel);
           iceFrame.pack();
         } else {
           if (icePokemon.size() > 1) {
             for(int i = 0; i < icePokemon.size(); i++) {
               System.out.println(icePokemon.get(i));
             }
             iceFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             iceFrame.add(color);
             iceFrame.pack();
           } else if (icePokemon.size() == 1) {
             iceFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             iceFrame.add(pokemon);
             iceFrame.pack();
             iceFrame.setVisible(true);
           } else {
             iceFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             iceFrame.add(missingno);
             iceFrame.pack();
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
       if (icePokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (icePokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < icePokemon.size(); i++) {
           currentPokemon = icePokemon.get(i);
           currentColor = iceColors.get(currentPokemon);
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
       
       iceFrame.getContentPane().removeAll();
       iceFrame.add(n);
       iceFrame.pack();
       iceFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = iceColors.get(icePokemon.get(0));
       n.add(createPokemon(icePokemon.get(0), new Color(
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
       iceFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Ice/" + pokemon +
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
       icePokemon.add("Dewgong");
       icePokemon.add("Cloyster");
       icePokemon.add("Jynx");
       icePokemon.add("Lapras");
       icePokemon.add("Articuno");
       icePokemon.add("Sneasel");
       icePokemon.add("Swinub");
       icePokemon.add("Piloswine");
       icePokemon.add("Delibird");
       icePokemon.add("Smoochum");
       icePokemon.add("Snorunt");
       icePokemon.add("Glalie");
       icePokemon.add("Spheal");
       icePokemon.add("Sealeo");
       icePokemon.add("Walrein");
       icePokemon.add("Regice");
       icePokemon.add("Snover");
       icePokemon.add("Abomasnow");
       icePokemon.add("Weavile");
       icePokemon.add("Glaceon");
       icePokemon.add("Mamoswine");
       icePokemon.add("Froslass");
       icePokemon.add("Vanillite");
       icePokemon.add("Vanillish");
       icePokemon.add("Vanilluxe");
       icePokemon.add("Cubchoo");
       icePokemon.add("Beartic");
       icePokemon.add("Cryogonal");
       icePokemon.add("Kyurem");
       icePokemon.add("Amaura");
       icePokemon.add("Aurorus");
       icePokemon.add("Bergmite");
       icePokemon.add("Avalugg");
       
       iceColors.put("Dewgong", new ColorName("Turquoise",
               (25f/100f), (88f/100f), (82f/100f)));
       iceColors.put("Cloyster", new ColorName("Dark Blue",
               (0f/100f), (0f/100f), (55f/100f)));
       iceColors.put("Jynx", new ColorName("Magenta",
               (100f/100f), (11f/100f), (81f/100f)));
       iceColors.put("Lapras", new ColorName("Lapis Lazuli",
               (15f/100f), (38f/100f), (61f/100f)));
       iceColors.put("Articuno", new ColorName("Sapphire",
               (6f/100f), (32f/100f), (73f/100f)));
       iceColors.put("Sneasel", new ColorName("Jet",
               (20f/100f), (20f/100f), (20f/100f)));
       iceColors.put("Swinub", new ColorName("Coffee",
               (44f/100f), (26f/100f), (25f/100f)));
       iceColors.put("Piloswine", new ColorName("Coffee",
               (44f/100f), (26f/100f), (25f/100f)));
       iceColors.put("Delibird", new ColorName("Cherry",
               (87f/100f), (19f/100f), (39f/100f)));
       iceColors.put("Smoochum", new ColorName("Magenta",
               (100f/100f), (11f/100f), (81f/100f)));
       iceColors.put("Snorunt", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       iceColors.put("Glalie", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       iceColors.put("Spheal", new ColorName("Cerulean Frost",
               (43f/100f), (61f/100f), (76f/100f)));
       iceColors.put("Sealeo", new ColorName("Cerulean Frost",
               (43f/100f), (61f/100f), (76f/100f)));
       iceColors.put("Walrein", new ColorName("Cerulean Frost",
               (43f/100f), (61f/100f), (76f/100f)));
       iceColors.put("Regice", new ColorName("Diamond",
               (73f/100f), (95f/100f), (100f/100f)));
       iceColors.put("Snover", new ColorName("Pine Green",
               (0f/100f), (47f/100f), (44f/100f)));
       iceColors.put("Abomasnow", new ColorName("Pine Green",
               (0f/100f), (47f/100f), (44f/100f)));
       iceColors.put("Weavile", new ColorName("Jet",
               (20f/100f), (20f/100f), (20f/100f)));
       iceColors.put("Glaceon", new ColorName("Celeste",
               (70f/100f), (100f/100f), (100f/100f)));
       iceColors.put("Mamoswine", new ColorName("Coffee",
               (44f/100f), (26f/100f), (25f/100f)));
       iceColors.put("Froslass", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       iceColors.put("Vanillite", new ColorName("Vanilla",
               (95f/100f), (90f/100f), (67f/100f)));
       iceColors.put("Vanillish", new ColorName("Vanilla",
               (95f/100f), (90f/100f), (67f/100f)));
       iceColors.put("Vanilluxe", new ColorName("Vanilla",
               (95f/100f), (90f/100f), (67f/100f)));
       iceColors.put("Cubchoo", new ColorName("Blizzard Blue",
               (67f/100f), (90f/100f), (93f/100f)));
       iceColors.put("Beartic", new ColorName("Blizzard Blue",
               (67f/100f), (90f/100f), (93f/100f)));
       iceColors.put("Cryogonal", new ColorName("Snow",
               (100f/100f), (98f/100f), (98f/100f)));
       iceColors.put("Kyurem", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       iceColors.put("Amaura", new ColorName("Light Sky Blue",
               (53f/100f), (81f/100f), (98f/100f)));
       iceColors.put("Aurorus", new ColorName("Light Sky Blue",
               (53f/100f), (81f/100f), (98f/100f)));
       iceColors.put("Bergmite", new ColorName("Iceberg",
               (44f/100f), (65f/100f), (82f/100f)));
       iceColors.put("Avalugg", new ColorName("Iceberg",
               (44f/100f), (65f/100f), (82f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Articuno");
    question.addPokemonYes("Regice");
    question.addPokemonYes("Kyurem");
    questions.add(question);
    
    question = new Question("What gender are you?");
    question.addPokemonNo("Jynx");
    question.addPokemonNo("Smoochum");
    question.addPokemonNo("Froslass");
    questions.add(question);

    question = new Question("Do you tend to have dessert after every major " +
            "meal?");
    question.addPokemonYes("Vanillite");
    question.addPokemonYes("Vanillish");
    question.addPokemonYes("Vanilluxe");
    questions.add(question);

    question = new Question("Do you have an intense relationship with food, " +
            "tend to overeat, or have the expertise to be a chef or foot " +
            "critic?");
    question.addPokemonYes("Swinub");
    question.addPokemonYes("Piloswine");
    question.addPokemonYes("Mamoswine");
    questions.add(question);

    question = new Question("Do you have somewhat harder time understanding " +
            "people, but love learning about human psychology or philosophy?");
    question.addPokemonYes("Snover");
    question.addPokemonYes("Abomasnow");
    questions.add(question);

    question = new Question("Do you tend to do favors for people without any " +
            "reward in mind, even sometimes, big favors that take a lot " +
            "out of you?");
    question.addPokemonYes("Lapras");
    questions.add(question);

    question = new Question("Are you prone to runny noses from allergies, or" +
            " are you more likely to get affected by colds and other " +
            "contagious sicknesses?");
    question.addPokemonYes("Cubchoo");
    question.addPokemonYes("Beartic");
    questions.add(question);

    question = new Question("Do you prefer the wintertime over the summertime" +
            ", and do you tend to disappear when you are not " +
            "feeling well emotionally?");
    question.addPokemonYes("Cryogonal");
    questions.add(question);

    question = new Question("Are you a cold and distant person, who likes to" +
            " separate yourself from your peers in order to do your own thing" +
            " in isolation?");
    question.addPokemonYes("Snorunt");
    question.addPokemonYes("Glalie");
    question.addPokemonYes("Froslass");
    questions.add(question);

    question = new Question("Were you raised in a sheltered " +
            "environment, where there was no violence or calamity or death " +
            "in your family?");
    question.addPokemonYes("Amaura");
    question.addPokemonYes("Aurorus");
    questions.add(question);

    question = new Question("Do you either believe in Santa Claus, or have " +
            "you made it your life's purpose to give to others?");
    question.addPokemonYes("Delibird");
    questions.add(question);

    question = new Question("Are you known to be a particularly affectionate " +
            "person, or a rather seductive person who gets a bad reputation " +
            "for being \"easy\"?");
    question.addPokemonYes("Smoochum");
    question.addPokemonYes("Jynx");
    questions.add(question);

    question = new Question("Are you heavyset or plump, but do not feel bad " +
            "about your weight, or do you play a sport involving a ball " +
            "adeptly?");
    question.addPokemonYes("Spheal");
    question.addPokemonYes("Sealeo");
    question.addPokemonYes("Walrein");
    questions.add(question);

    question = new Question("Have you or would you turn to a life of crime " +
            "or thievery to attain great wealth or make end's meat?");
    question.addPokemonYes("Sneasel");
    question.addPokemonYes("Weavile");
    questions.add(question);

    question = new Question("Are you the kind of person to cover up your " +
            "tracks or put the blame on someone else when you make mistakes?");
    question.addPokemonYes("Bergmite");
    question.addPokemonYes("Avalugg");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Swinub");
    question.addPokemonYes("Smoochum");
    question.addPokemonYes("Snorunt");
    question.addPokemonYes("Spheal");
    question.addPokemonYes("Snover");
    question.addPokemonYes("Vanillite");
    question.addPokemonYes("Cubchoo");
    question.addPokemonYes("Amaura");
    question.addPokemonYes("Bergmite");

    question.addPokemonNo("Dewgong");
    question.addPokemonNo("Cloyster");
    question.addPokemonNo("Jynx");
    question.addPokemonNo("Piloswine");
    question.addPokemonNo("Glalie");
    question.addPokemonNo("Sealeo");
    question.addPokemonNo("Walrein");
    question.addPokemonNo("Abomasnow");
    question.addPokemonNo("Weavile");
    question.addPokemonNo("Glaceon");
    question.addPokemonNo("Mamoswine");
    question.addPokemonNo("Froslass");
    question.addPokemonNo("Vanillish");
    question.addPokemonNo("Vanilluxe");
    question.addPokemonNo("Beartic");
    question.addPokemonNo("Aurorus");
    question.addPokemonNo("Avalugg");
    questions.add(question);

    question = new Question("Are you rather elderly, or do you have maturity " +
            "or a personality that is unbecoming of your age (an old soul)?");
    question.addPokemonYes("Mamoswine");
    question.addPokemonNo("Piloswine");
    questions.add(question);

    question = new Question("Are you famous for either a heroic rescue in the" +
            " wilderness, or for surviving in unfavorable environments such " +
            "the desert or the mountains?");
    question.addPokemonYes("Articuno");
    questions.add(question);

    question = new Question("Do you have rather noticeable facial hair, or " +
            "have you experienced a debilitating injury (broken bones, etc.)?");
    question.addPokemonYes("Walrein");
    question.addPokemonNo("Sealeo");
    questions.add(question);
 
    question = new Question("Do you like to sleep in and stay up late, "+
            "as opposed to going to bed early and waking up with the sun?");
    question.addPokemonYes("Dewgong");
    questions.add(question);

    question = new Question("Is ice cream your favorite kind of dessert, and " +
            "do you hate sharing your food with people?");
    question.addPokemonYes("Vanilluxe");
    question.addPokemonNo("Vanillish");
    questions.add(question);

    question = new Question("Are you steadfast and unchanging in your " +
            "thoughts or beliefs, even if everyone else thinks you're wrong?");
    question.addPokemonYes("Regice");
    questions.add(question);

    question = new Question("Are you the kind of person who never tells " +
            "their inner thoughts, and despise people who feel the need to " +
            "prod?");
    question.addPokemonYes("Cloyster");
    questions.add(question);

    question = new Question("Are you able to get yourself out of sticky " +
            "situations by lying, or do you accomplish more when you have " +
            "teammates backing you up?");
    question.addPokemonYes("Weavile");
    question.addPokemonNo("Sneasel");
    questions.add(question);

    question = new Question("Do you take great pride in the condition of your" +
            " hair, and do you enjoy stroking your hair?");
    question.addPokemonYes("Glaceon");
    questions.add(question);

    question = new Question("Have you made it your goal in life to discover " +
        "absolute truths in the world, or to make a grand scientific " +
        "discovery no one else has?");
    question.addPokemonYes("Kyurem");
    questions.add(question);

    question = new Question("Has a man broken your heart and abandoned you, " +
            "and has this made you difficult to love again?");
    question.addPokemonYes("Froslass");
    question.addPokemonNo("Glalie");
    questions.add(question);

    iceFrame = new JFrame("ICE TYPE QUIZ");
    iceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    icePanel = new IceTypeQuizGUI();
    iceFrame.add(icePanel);
    iceFrame.pack();
    iceFrame.setVisible(true);
   }
}

