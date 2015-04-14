import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class FireTypeQuizGUI extends JPanel
{ static JFrame fireFrame;
  static JPanel firePanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> firePokemon = new ArrayList<String>();
  static Map <String, ColorName> fireColors = 
          new HashMap<String, ColorName>();
   public FireTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question fire = questions.poll();
     question = fire.getQuestion();
     thoseInAgreement = fire.getYes();
     thoseInDenial = fire.getNo();
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
     questionLabel.setBackground(new Color((86f/100f), (8f/100f),(24f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           firePokemon.remove(thoseInDenial.get(i));
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
            fireFrame.getContentPane().removeAll();
		        firePanel = new FireTypeQuizGUI();
            fireFrame.add(firePanel);
            fireFrame.pack();
          } else {
              if (firePokemon.size() > 1) {
                  for(int i = 0; i < firePokemon.size(); i++) {
                    System.out.println(firePokemon.get(i));
                  }
                  fireFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  fireFrame.add(color);
                  fireFrame.pack();
              } else if (firePokemon.size() == 1) {
                  fireFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  fireFrame.add(pokemon);
                  fireFrame.pack();
                  fireFrame.setVisible(true);
              } else {
                  fireFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  fireFrame.add(missingno);
                  fireFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           firePokemon.remove(thoseInAgreement.get(i));
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
           fireFrame.getContentPane().removeAll();
		       firePanel = new FireTypeQuizGUI();
           fireFrame.add(firePanel);
           fireFrame.pack();
         } else {
           if (firePokemon.size() > 1) {
             for(int i = 0; i < firePokemon.size(); i++) {
               System.out.println(firePokemon.get(i));
             }
             fireFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             fireFrame.add(color);
             fireFrame.pack();
           } else if (firePokemon.size() == 1) {
             fireFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             fireFrame.add(pokemon);
             fireFrame.pack();
             fireFrame.setVisible(true);
           } else {
             fireFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             fireFrame.add(missingno);
             fireFrame.pack();
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
       if (firePokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (firePokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < firePokemon.size(); i++) {
           currentPokemon = firePokemon.get(i);
           currentColor = fireColors.get(currentPokemon);
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
       
       fireFrame.getContentPane().removeAll();
       fireFrame.add(n);
       fireFrame.pack();
       fireFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = fireColors.get(firePokemon.get(0));
       n.add(createPokemon(firePokemon.get(0), new Color(
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
       fireFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Fire/" + pokemon +
           ".png");
       JLabel pokeLabel;
       if (pokemon.equals("Pyroar-Male") || pokemon.equals("Pyroar-Female")) {
           pokeLabel = new JLabel("You are Pyroar!", pokePicture, 
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
       firePokemon.add("Charmander");
       firePokemon.add("Charmeleon");
       firePokemon.add("Charizard");
       firePokemon.add("Vulpix");
       firePokemon.add("Ninetales");
       firePokemon.add("Growlithe");
       firePokemon.add("Arcanine");
       firePokemon.add("Ponyta");
       firePokemon.add("Rapidash");
       firePokemon.add("Magmar");
       firePokemon.add("Flareon");
       firePokemon.add("Moltres");
       firePokemon.add("Cyndaquil");
       firePokemon.add("Quilava");
       firePokemon.add("Typhlosion");
       firePokemon.add("Slugma");
       firePokemon.add("Magcargo");
       firePokemon.add("Houndour");
       firePokemon.add("Houndoom");
       firePokemon.add("Magby");
       firePokemon.add("Entei");
       firePokemon.add("Ho-oh");
       firePokemon.add("Torchic");
       firePokemon.add("Combusken");
       firePokemon.add("Blaziken");
       firePokemon.add("Numel");
       firePokemon.add("Camerupt");
       firePokemon.add("Torkoal");
       firePokemon.add("Chimchar");
       firePokemon.add("Monferno");
       firePokemon.add("Infernape");
       firePokemon.add("Magmortar");
       firePokemon.add("Heatran");
       firePokemon.add("Victini");
       firePokemon.add("Tepig");
       firePokemon.add("Pignite");
       firePokemon.add("Emboar");
       firePokemon.add("Pansear");
       firePokemon.add("Simisear");
       firePokemon.add("Darumaka");
       firePokemon.add("Darmanitan");
       firePokemon.add("Litwick");
       firePokemon.add("Lampent");
       firePokemon.add("Chandelure");
       firePokemon.add("Heatmor");
       firePokemon.add("Larvesta");
       firePokemon.add("Volcarona");
       firePokemon.add("Reshiram");
       firePokemon.add("Fennekin");
       firePokemon.add("Braixen");
       firePokemon.add("Delphox");
       firePokemon.add("Fletchinder");
       firePokemon.add("Talonflame");
       firePokemon.add("Litleo");
       firePokemon.add("Pyroar-Male");
       firePokemon.add("Pyroar-Female");
    //   firePokemon.add("Volcanion");
       
       fireColors.put("Charmander", new ColorName("Flame",
               (89f/100f), (35f/100f), (13f/100f)));
       fireColors.put("Charmeleon", new ColorName("Flame",
               (89f/100f), (35f/100f), (13f/100f)));
       fireColors.put("Charizard", new ColorName("Flame",
               (89f/100f), (35f/100f), (13f/100f)));
       fireColors.put("Vulpix", new ColorName("Blond",
               (98f/100f), (94f/100f), (75f/100f)));
       fireColors.put("Ninetales", new ColorName("Blond",
               (98f/100f), (94f/100f), (75f/100f)));
       fireColors.put("Growlithe", new ColorName("Cinnabar",
               (89f/100f), (26f/100f), (20f/100f)));
       fireColors.put("Arcanine", new ColorName("Cinnabar",
               (89f/100f), (26f/100f), (20f/100f)));
       fireColors.put("Ponyta", new ColorName("Champagne",
               (97f/100f), (91f/100f), (81f/100f)));
       fireColors.put("Rapidash", new ColorName("Champagne",
               (97f/100f), (91f/100f), (81f/100f)));
       fireColors.put("Magmar", new ColorName("Lava",
               (81f/100f), (6f/100f), (13f/100f)));
       fireColors.put("Flareon", new ColorName("Yellow",
               (100f/100f), (100f/100f), (0f/100f)));
       fireColors.put("Moltres", new ColorName("Ruby",
               (88f/100f), (7f/100f), (37f/100f)));
       fireColors.put("Cyndaquil", new ColorName("Amazon",
               (23f/100f), (48f/100f), (34f/100f)));
       fireColors.put("Quilava", new ColorName("Amazon",
               (23f/100f), (48f/100f), (34f/100f)));
       fireColors.put("Typhlosion", new ColorName("Amazon",
               (23f/100f), (48f/100f), (34f/100f)));
       fireColors.put("Slugma", new ColorName("Charcoal",
               (21f/100f), (27f/100f), (31f/100f)));
       fireColors.put("Magcargo", new ColorName("Charcoal",
               (21f/100f), (27f/100f), (31f/100f)));
       fireColors.put("Houndour", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       fireColors.put("Houndoom", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       fireColors.put("Magby", new ColorName("Lava",
               (81f/100f), (6f/100f), (13f/100f)));
       fireColors.put("Entei", new ColorName("Silver",
               (75f/100f), (75f/100f), (75f/100f)));
       fireColors.put("Ho-oh", new ColorName("Gold",
               (83f/100f), (69f/100f), (22f/100f)));
       fireColors.put("Torchic", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       fireColors.put("Combusken", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       fireColors.put("Blaziken", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       fireColors.put("Numel", new ColorName("Sand Dune",
               (59f/100f), (44f/100f), (9f/100f)));
       fireColors.put("Camerupt", new ColorName("Sand Dune",
               (59f/100f), (44f/100f), (9f/100f)));
       fireColors.put("Torkoal", new ColorName("Smoke",
               (45f/100f), (51f/100f), (46f/100f)));
       fireColors.put("Chimchar", new ColorName("Mango",
               (100f/100f), (51f/100f), (26f/100f)));
       fireColors.put("Monferno", new ColorName("Mango",
               (100f/100f), (51f/100f), (26f/100f)));
       fireColors.put("Infernape", new ColorName("Mango",
               (100f/100f), (51f/100f), (26f/100f)));
       fireColors.put("Magmortar", new ColorName("Lava",
               (81f/100f), (6f/100f), (13f/100f)));
       fireColors.put("Heatran", new ColorName("Burnt Orange",
               (80f/100f), (33f/100f), (0f/100f)));
       fireColors.put("Victini", new ColorName("Sunset Orange",
               (99f/100f), (37f/100f), (33f/100f)));
       fireColors.put("Tepig", new ColorName("Candy Apple Red",
               (100f/100f), (3f/100f), (0f/100f)));
       fireColors.put("Pignite", new ColorName("Candy Apple Red",
               (100f/100f), (3f/100f), (0f/100f)));
       fireColors.put("Emboar", new ColorName("Candy Apple Red",
               (100f/100f), (3f/100f), (0f/100f)));
       fireColors.put("Pansear", new ColorName("Lust",
               (90f/100f), (13f/100f), (13f/100f)));
       fireColors.put("Simisear", new ColorName("Lust",
               (90f/100f), (13f/100f), (13f/100f)));
       fireColors.put("Darumaka", new ColorName("Lemon",
               (100f/100f), (97f/100f), (0f/100f)));
       fireColors.put("Darmanitan", new ColorName("Lemon",
               (100f/100f), (97f/100f), (0f/100f)));
       fireColors.put("Litwick", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       fireColors.put("Lampent", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       fireColors.put("Chandelure", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       fireColors.put("Heatmor", new ColorName("Russet",
               (50f/100f), (27f/100f), (11f/100f)));
       fireColors.put("Larvesta", new ColorName("Sunglow",
               (100f/100f), (80f/100f), (20f/100f)));
       fireColors.put("Volcarona", new ColorName("Sunglow",
               (100f/100f), (80f/100f), (20f/100f)));
       fireColors.put("Reshiram", new ColorName("White",
               (0f/100f), (0f/100f), (0f/100f)));
       fireColors.put("Fennekin", new ColorName("Scarlet",
               (99f/100f), (5f/100f), (21f/100f)));
       fireColors.put("Braixen", new ColorName("Scarlet",
               (99f/100f), (5f/100f), (21f/100f)));
       fireColors.put("Delphox", new ColorName("Scarlet",
               (99f/100f), (5f/100f), (21f/100f)));
       fireColors.put("Fletchinder", new ColorName("Jet",
               (20f/100f), (20f/100f), (20f/100f)));
       fireColors.put("Talonflame", new ColorName("Jet",
               (20f/100f), (20f/100f), (20f/100f)));
       fireColors.put("Litleo", new ColorName("Auburn",
               (65f/100f), (16f/100f), (16f/100f)));
       fireColors.put("Pyroar-Male", new ColorName("Auburn",
               (65f/100f), (16f/100f), (16f/100f)));
       fireColors.put("Pyroar-Female", new ColorName("Auburn",
               (65f/100f), (16f/100f), (16f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Moltres");
    question.addPokemonYes("Entei");
    question.addPokemonYes("Ho-oh");
    question.addPokemonYes("Heatran");
    question.addPokemonYes("Victini");
    question.addPokemonYes("Reshiram");
    //question.addPokemonYes("Volcanion");
    questions.add(question);
    
    question = new Question("Would you fight to the death to protect " +
        "someone, or to defend an ideal, instead of running away in self-" +
        "preservation?");
    question.addPokemonYes("Growlithe");
    question.addPokemonYes("Arcanine");
    questions.add(question);


    question = new Question("Do tend to dread deadlines, but are often rather" +
        " slow in accomplishing tasks?");
    question.addPokemonYes("Slugma");
    question.addPokemonYes("Magcargo");
    questions.add(question);

    question = new Question("Do you constantly look for new challenges and " +
        "thrills?");
    question.addPokemonYes("Charmander");
    question.addPokemonYes("Charmeleon");
    question.addPokemonYes("Charizard");
    questions.add(question);

    question = new Question("Are you the life of the party when with your " +
        "friends, but are a bit wary or maybe a little rude when you are " +
        "around strangers?");
    question.addPokemonYes("Chimchar");
    question.addPokemonYes("Monferno");
    question.addPokemonYes("Infernape");
    questions.add(question);

    question = new Question("Are you addicted to sweets or sugary foods, but" +
        " burn off what you eat because of your healthy lifestyle?");
    question.addPokemonYes("Pansear");
    question.addPokemonYes("Simisear");
    questions.add(question);

    question = new Question("Are you a vegetarian?");
    question.addPokemonYes("Fennekin");
    question.addPokemonYes("Braixen");
    question.addPokemonYes("Delphox");
    questions.add(question);

    question = new Question("Did you enjoy torturing or burning insects " +
        "when you were younger, or are you an exterminator by profession?");
    question.addPokemonYes("Heatmor");
    questions.add(question);

    question = new Question("Are you either a highly competitive and somewhat" +
        " selfish person, or do you run or participate in track for fun?");
    question.addPokemonYes("Ponyta");
    question.addPokemonYes("Rapidash");
    questions.add(question);

    question = new Question("Are you likely to get defensive or lash out if " +
        "someone mocks you or belittles you?");
    question.addPokemonYes("Cyndaquil");
    question.addPokemonYes("Quilava");
    question.addPokemonYes("Typhlosion");
    questions.add(question);

    question = new Question("Do you, or does someone you are close to, smoke " +
        "cigars or cigarettes regularly?");
    question.addPokemonYes("Torkoal");
    questions.add(question);

    question = new Question("Do you tend to eat more than the average person," +
        " and has this contributed to a weight problem or the start of one?");
    question.addPokemonYes("Tepig");
    question.addPokemonYes("Pignite");
    question.addPokemonYes("Emboar");
    questions.add(question);

    question = new Question("Do you believe that life is what you make it, " +
        " and that having a positive outlook on life is important?");
    question.addPokemonYes("Magby");
    question.addPokemonYes("Magmar");
    question.addPokemonYes("Magmortar");
    questions.add(question);

    question = new Question("Do people usually come to you for consolement " +
        "when they are feeling down or when they need help?");
    question.addPokemonYes("Larvesta");
    question.addPokemonYes("Volcarona");
    questions.add(question);

    question = new Question("Are you normally friendly and outgoing, but tend" +
        " to clam up and push people away when things aren't going well?");
    question.addPokemonYes("Darumaka");
    question.addPokemonYes("Darmanitan");
    questions.add(question);

    question = new Question("Are you normally quiet and unassuming, " +
        "unless something triggers you, which causes you to go off onto a " +
        "violent tirade or break things?");
    question.addPokemonYes("Numel");
    question.addPokemonYes("Camerupt");
    questions.add(question);

    question = new Question("Do you have the reputation as a bad boy or as " +
        "one that likes to stir up trouble, even though you may not deserve" +
        " it?");
    question.addPokemonYes("Houndoom");
    question.addPokemonYes("Houndour");
    questions.add(question);

    question = new Question("Are you known to be an especially affectionate " +
        "person who isn't afraid of showing off for the attention of the " +
        "opposite sex?");
    question.addPokemonYes("Torchic");
    question.addPokemonYes("Combusken");
    question.addPokemonYes("Blaziken");
    questions.add(question);

    question = new Question("Are you either an excellent teacher or a " +
        "steadfast student who has a love for learning, who wishes the " +
        "world was smarter?");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Lampent");
    question.addPokemonYes("Chandelure");
    questions.add(question);

    question = new Question("Are you known to be a vengeful person who " +
        "doesn't take offenses lightly, or a heartbreaker that people " +
        "fall in love with only to be rejected?");
    question.addPokemonYes("Vulpix");
    question.addPokemonYes("Ninetales");
    questions.add(question);

    question = new Question("Are you a member of the wealthy, upper class, or" +
        " do you take great pride in how you look?");
    question.addPokemonYes("Litleo");
    question.addPokemonYes("Pyroar-Male");
    question.addPokemonYes("Pyroar-Female");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Charmander");
    question.addPokemonYes("Vulpix");
    question.addPokemonYes("Growlithe");
    question.addPokemonYes("Ponyta");
    question.addPokemonYes("Cyndaquil");
    question.addPokemonYes("Slugma");
    question.addPokemonYes("Houndour");
    question.addPokemonYes("Magby");
    question.addPokemonYes("Torchic");
    question.addPokemonYes("Numel");
    question.addPokemonYes("Chimchar");
    question.addPokemonYes("Tepig");
    question.addPokemonYes("Pansear");
    question.addPokemonYes("Darumaka");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Larvesta");
    question.addPokemonYes("Fennekin");
    question.addPokemonYes("Litleo");

    question.addPokemonNo("Charmeleon");
    question.addPokemonNo("Charizard");
    question.addPokemonNo("Ninetales");
    question.addPokemonNo("Arcanine");
    question.addPokemonNo("Rapidash");
    question.addPokemonNo("Magmar");
    question.addPokemonNo("Flareon");
    question.addPokemonNo("Quilava");
    question.addPokemonNo("Typhlosion");
    question.addPokemonNo("Magcargo");
    question.addPokemonNo("Houndoom");
    question.addPokemonNo("Combusken");
    question.addPokemonNo("Blaziken");
    question.addPokemonNo("Camerupt");
    question.addPokemonNo("Monferno");
    question.addPokemonNo("Infernape");
    question.addPokemonNo("Magmortar");
    question.addPokemonNo("Pignite");
    question.addPokemonNo("Emboar");
    question.addPokemonNo("Simisear");
    question.addPokemonNo("Darmanitan");
    question.addPokemonNo("Lampent");
    question.addPokemonNo("Chandelure");
    question.addPokemonNo("Volcarona");
    question.addPokemonNo("Braixen");
    question.addPokemonNo("Delphox");
    question.addPokemonNo("Fletchinder");
    question.addPokemonNo("Talonflame");
    question.addPokemonNo("Pyroar-Male");
    question.addPokemonNo("Pyroar-Female");
    questions.add(question);

    question = new Question("Are you known to be a passionate, skillful " +
        "lover, or do you regularly partake in extreme sports or parkour?");
    question.addPokemonYes("Blaziken");
    question.addPokemonNo("Combusken");
    questions.add(question);

    question = new Question("What gender are you?");
    question.addPokemonYes("Pyroar-Male");
    question.addPokemonNo("Pyroar-Female");
    questions.add(question);

    question = new Question("Do you believe that fear tactics, intimidating " +
       "your opponents into submission, are the best way to win a battle or " +
       "competition?");
    question.addPokemonYes("Fletchinder");
    question.addPokemonYes("Talonflame");
    questions.add(question);

    question = new Question("Do you fight to have the last say on things, " +
        "or are you the kind of gamer that steals points or \"kills\" from " +
        "your teammates?");
    question.addPokemonYes("Talonflame");
    question.addPokemonNo("Fletchinder");
    questions.add(question);
 
    question = new Question("Are you full of hot air, and tend to ramble on " +
        "about things, which bores people in the process?");
    question.addPokemonYes("Flareon");
    questions.add(question);

    question = new Question("Despite your competitive and driven spirit, " +
        "are you easy on beginners when they have to either learn from you " +
        "or go up against you?");
    question.addPokemonYes("Charizard");
    question.addPokemonNo("Charmeleon");
    questions.add(question);

    question = new Question("Have you won a prestigous competition or have " +
        "set a world record in something?");
    question.addPokemonYes("Victini");
    questions.add(question);

    question = new Question("Do you read people's thoughts or emotions very " +
        "well and has this made you a capable leader?");
    question.addPokemonYes("Lucario");
    questions.add(question);

    question = new Question("Are you a Wiccan, or someone who believes they " +
        "practice magic?");
    question.addPokemonYes("Delphox");
    question.addPokemonNo("Braixen");
    questions.add(question);

    question = new Question("Do you prefer the warmth of the spring or summer" +
        " over the cold of fall and winter, and do you tend to a garden?");
    question.addPokemonYes("Moltres");
    questions.add(question);

    question = new Question("Do you turn into a bit of a braggart or become" +
        " exuberantly happy when things are going your way?");
    question.addPokemonYes("Magmortar");
    question.addPokemonNo("Magmar");
    questions.add(question);

    question = new Question("Do you deter some people from getting close to " +
        "you because of anger or self-control issues?");
    question.addPokemonYes("Typhlosion");
    question.addPokemonNo("Quilava");
    questions.add(question);

    question = new Question("Have you been to most countries of the world, " +
        "and can never settle in one place for long?");
    question.addPokemonYes("Entei");
    questions.add(question);

    question = new Question("Are you renowned across the globe for your " +
        "beauty and do you have the power or money to make people happy?");
    question.addPokemonYes("Ho-oh");
    questions.add(question);

    question = new Question("Are you the kind of person to never turn down " +
        "dares no matter how stupid or dangerous they are, or have you " +
        "learned a martial art?");
    question.addPokemonYes("Infernape");
    question.addPokemonNo("Monferno");
    questions.add(question);

    question = new Question("Do you perform better when under pressure or " +
        "when stakes are high?");
    question.addPokemonYes("Fireix");
    questions.add(question);

    question = new Question("Have you studied or have came up with theories" +
        " on how to feasibly construct a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Are you famous because of your ability as a " +
        "fighter or for your endurance, and do you have battle scars or " +
        "injuries from your experiences?");
    question.addPokemonYes("Heatran");
    questions.add(question);
    
    question = new Question("Are you either a man with a rather large or " +
        "extravagent beard, or are you a woman who finds beards attractive?");
    question.addPokemonYes("Emboar");
    question.addPokemonNo("Pignite");
    questions.add(question);
     
    question = new Question("Are your manners or way of speaking refined " +
        "compared to most of your peers, and do you consider yourself of " +
        "\"the elite\"?");
    question.addPokemonYes("Chandelure");
    question.addPokemonNo("Lampent");
    questions.add(question);
     
    question = new Question("Does your calm or gentle personality betray " +
        "an inner fire or strong willpower that has the power to do anything?");
    question.addPokemonYes("Reshiram");
    questions.add(question);


    fireFrame = new JFrame("FIRE TYPE QUIZ");
    fireFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    firePanel = new FireTypeQuizGUI();
    fireFrame.add(firePanel);
    fireFrame.pack();
    fireFrame.setVisible(true);
   }
}

