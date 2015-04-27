import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class WaterTypeQuizGUI extends JPanel
{ static JFrame waterFrame;
  static JPanel waterPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> waterPokemon = new ArrayList<String>();
  static Map <String, ColorName> waterColors =
          new HashMap<String, ColorName>();
   public WaterTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question water = questions.poll();
     question = water.getQuestion();
     thoseInAgreement = water.getYes();
     thoseInDenial = water.getNo();
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
     questionLabel.setBackground(new Color((20f/100f), (60f/100f),(100f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.BLACK);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           waterPokemon.remove(thoseInDenial.get(i));
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
            waterFrame.getContentPane().removeAll();
		        waterPanel = new WaterTypeQuizGUI();
            waterFrame.add(waterPanel);
            waterFrame.pack();
          } else {
              if (waterPokemon.size() > 1) {
                  for(int i = 0; i < waterPokemon.size(); i++) {
                    System.out.println(waterPokemon.get(i));
                  }
                  waterFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  waterFrame.add(color);
                  waterFrame.pack();
              } else if (waterPokemon.size() == 1) {
                  waterFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  waterFrame.add(pokemon);
                  waterFrame.pack();
                  waterFrame.setVisible(true);
              } else {
                  waterFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  waterFrame.add(missingno);
                  waterFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           waterPokemon.remove(thoseInAgreement.get(i));
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
           waterFrame.getContentPane().removeAll();
		       waterPanel = new WaterTypeQuizGUI();
           waterFrame.add(waterPanel);
           waterFrame.pack();
         } else {
           if (waterPokemon.size() > 1) {
             for(int i = 0; i < waterPokemon.size(); i++) {
               System.out.println(waterPokemon.get(i));
             }
             waterFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             waterFrame.add(color);
             waterFrame.pack();
           } else if (waterPokemon.size() == 1) {
             waterFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             waterFrame.add(pokemon);
             waterFrame.pack();
             waterFrame.setVisible(true);
           } else {
             waterFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             waterFrame.add(missingno);
             waterFrame.pack();
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
       if (waterPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (waterPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < waterPokemon.size(); i++) {
           currentPokemon = waterPokemon.get(i);
           currentColor = waterColors.get(currentPokemon);
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

       waterFrame.getContentPane().removeAll();
       waterFrame.add(n);
       waterFrame.pack();
       waterFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = waterColors.get(waterPokemon.get(0));
       n.add(createPokemon(waterPokemon.get(0), new Color(
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
       waterFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Water/" + pokemon +
           ".png");
       JLabel pokeLabel;
       if (pokemon.equals("Frillish-Male") ||
        pokemon.equals("Frillish-Female")) {
        pokeLabel = new JLabel("You are Frillish!", pokePicture, JLabel.CENTER);
       } else if (pokemon.equals("Jellicent-Male") ||
        pokemon.equals("Jellicent-Female")) {
        pokeLabel = new JLabel("You are Jellicent!", pokePicture, 
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
       waterPokemon.add("Squirtle");
       waterPokemon.add("Wartortle");
       waterPokemon.add("Blastoise");
       waterPokemon.add("Psyduck");
       waterPokemon.add("Golduck");
       waterPokemon.add("Poliwag");
       waterPokemon.add("Poliwhirl");
       waterPokemon.add("Poliwrath");
       waterPokemon.add("Tentacool");
       waterPokemon.add("Tentacruel");
       waterPokemon.add("Slowpoke");
       waterPokemon.add("Slowbro");
       waterPokemon.add("Seel");
       waterPokemon.add("Dewgong");
       waterPokemon.add("Shellder");
       waterPokemon.add("Cloyster");
       waterPokemon.add("Krabby");
       waterPokemon.add("Kingler");
       waterPokemon.add("Horsea");
       waterPokemon.add("Seadra");
       waterPokemon.add("Goldeen");
       waterPokemon.add("Seaking");
       waterPokemon.add("Staryu");
       waterPokemon.add("Starmie");
       waterPokemon.add("Magikarp");
       waterPokemon.add("Gyarados");
       waterPokemon.add("Lapras");
       waterPokemon.add("Vaporeon");
       waterPokemon.add("Omanyte");
       waterPokemon.add("Omastar");
       waterPokemon.add("Kabuto");
       waterPokemon.add("Kabutops");
       waterPokemon.add("Totodile");
       waterPokemon.add("Croconaw");
       waterPokemon.add("Feraligatr");
       waterPokemon.add("Chinchou");
       waterPokemon.add("Lanturn");
       waterPokemon.add("Marill");
       waterPokemon.add("Azumarill");
       waterPokemon.add("Politoed");
       waterPokemon.add("Wooper");
       waterPokemon.add("Quagsire");
       waterPokemon.add("Slowking");
       waterPokemon.add("Qwilfish");
       waterPokemon.add("Corsola");
       waterPokemon.add("Remoraid");
       waterPokemon.add("Octillery");
       waterPokemon.add("Mantine");
       waterPokemon.add("Kingdra");
       waterPokemon.add("Suicune");
       waterPokemon.add("Mudkip");
       waterPokemon.add("Marshtomp");
       waterPokemon.add("Swampert");
       waterPokemon.add("Lotad");
       waterPokemon.add("Lombre");
       waterPokemon.add("Ludicolo");
       waterPokemon.add("Wingull");
       waterPokemon.add("Pelipper");
       waterPokemon.add("Surskit");
       waterPokemon.add("Carvanha");
       waterPokemon.add("Sharpedo");
       waterPokemon.add("Wailmer");
       waterPokemon.add("Wailord");
       waterPokemon.add("Barboach");
       waterPokemon.add("Whiscash");
       waterPokemon.add("Corphish");
       waterPokemon.add("Crawdaunt");
       waterPokemon.add("Feebas");
       waterPokemon.add("Milotic");
       waterPokemon.add("Spheal");
       waterPokemon.add("Sealeo");
       waterPokemon.add("Walrein");
       waterPokemon.add("Clamperl");
       waterPokemon.add("Huntail");
       waterPokemon.add("Gorebyss");
       waterPokemon.add("Relicanth");
       waterPokemon.add("Luvdisc");
       waterPokemon.add("Kyogre");
       waterPokemon.add("Piplup");
       waterPokemon.add("Prinplup");
       waterPokemon.add("Empoleon");
       waterPokemon.add("Bibarel");
       waterPokemon.add("Buizel");
       waterPokemon.add("Floatzel");
       waterPokemon.add("Shellos");
       waterPokemon.add("Gastrodon");
       waterPokemon.add("Finneon");
       waterPokemon.add("Lumineon");
       waterPokemon.add("Mantyke");
       waterPokemon.add("Palkia");
       waterPokemon.add("Phione");
       waterPokemon.add("Manaphy");
       waterPokemon.add("Oshawott");
       waterPokemon.add("Dewott");
       waterPokemon.add("Samurott");
       waterPokemon.add("Panpour");
       waterPokemon.add("Simipour");
       waterPokemon.add("Tympole");
       waterPokemon.add("Palpitoad");
       waterPokemon.add("Seismitoad");
       waterPokemon.add("Basculin");
       waterPokemon.add("Tirtouga");
       waterPokemon.add("Carracosta");
       waterPokemon.add("Ducklett");
       waterPokemon.add("Swanna");
       waterPokemon.add("Frillish-Male");
       waterPokemon.add("Frillish-Female");
       waterPokemon.add("Jellicent-Male");
       waterPokemon.add("Jellicent-Female");
       waterPokemon.add("Alomomola");
       waterPokemon.add("Keldeo");
       waterPokemon.add("Froakie");
       waterPokemon.add("Frogadier");
       waterPokemon.add("Greninja");
       waterPokemon.add("Binacle");
       waterPokemon.add("Barbaracle");
       waterPokemon.add("Skrelp");
       waterPokemon.add("Clauncher");
       waterPokemon.add("Clawitzer");

      waterColors.put("Squirtle", new ColorName("Steel Blue",
        (27f/100f), (51f/100f), (71f/100f)));
      waterColors.put("Wartortle", new ColorName("Steel Blue",
        (27f/100f), (51f/100f), (71f/100f)));
      waterColors.put("Blastoise", new ColorName("Steel Blue",
        (27f/100f), (51f/100f), (71f/100f)));
      waterColors.put("Psyduck", new ColorName("Saffron",
        (96f/100f), (77f/100f), (19f/100f)));
      waterColors.put("Golduck", new ColorName("Saffron",
        (96f/100f), (77f/100f), (19f/100f)));
      waterColors.put("Poliwag", new ColorName("Blueberry",
        (31f/100f), (53f/100f), (97f/100f)));
      waterColors.put("Poliwhirl", new ColorName("Blueberry",
        (31f/100f), (53f/100f), (97f/100f)));
      waterColors.put("Poliwrath", new ColorName("Blueberry",
        (31f/100f), (53f/100f), (97f/100f)));
      waterColors.put("Tentacool", new ColorName("Rubine Red",
        (82f/100f), (0f/100f), (34f/100f)));
      waterColors.put("Tentacruel", new ColorName("Rubine Red",
        (82f/100f), (0f/100f), (34f/100f)));
      waterColors.put("Slowpoke", new ColorName("Purple",
        (63f/100f), (13f/100f), (94f/100f)));
      waterColors.put("Slowbro", new ColorName("Purple",
        (63f/100f), (13f/100f), (94f/100f)));
      waterColors.put("Seel", new ColorName("Snow",
        (100f/100f), (98f/100f), (98f/100f)));
      waterColors.put("Dewgong", new ColorName("Snow",
        (100f/100f), (98f/100f), (98f/100f)));
      waterColors.put("Shellder", new ColorName("Dark Purple",
        (20f/100f), (9f/100f), (30f/100f)));
      waterColors.put("Cloyster", new ColorName("Dark Purple",
        (20f/100f), (9f/100f), (30f/100f)));
      waterColors.put("Krabby", new ColorName("Bronze",
        (80f/100f), (50f/100f), (20f/100f)));
      waterColors.put("Kingler", new ColorName("Bronze",
        (80f/100f), (50f/100f), (20f/100f)));
      waterColors.put("Horsea", new ColorName("Turquoise",
        (25f/100f), (88f/100f), (82f/100f)));
      waterColors.put("Seadra", new ColorName("Turquoise",
        (25f/100f), (88f/100f), (82f/100f)));
      waterColors.put("Goldeen", new ColorName("Scarlet",
        (99f/100f), (5f/100f), (21f/100f)));
      waterColors.put("Seaking", new ColorName("Scarlet",
        (99f/100f), (5f/100f), (21f/100f)));
      waterColors.put("Staryu", new ColorName("Goldenrod",
        (85f/100f), (65f/100f), (13f/100f)));
      waterColors.put("Starmie", new ColorName("Goldenrod",
        (85f/100f), (65f/100f), (13f/100f)));
      waterColors.put("Magikarp", new ColorName("Salmon",
        (98f/100f), (50f/100f), (45f/100f)));
      waterColors.put("Gyarados", new ColorName("Crimson",
        (86f/100f), (8f/100f), (24f/100f)));
      waterColors.put("Lapras", new ColorName("Lapis Lazuli",
        (15f/100f), (38f/100f), (61f/100f)));
      waterColors.put("Vaporeon", new ColorName("Celeste",
        (70f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Omanyte", new ColorName("Sand",
        (76f/100f), (70f/100f), (50f/100f)));
      waterColors.put("Omastar", new ColorName("Sand",
        (76f/100f), (70f/100f), (50f/100f)));
      waterColors.put("Kabuto", new ColorName("Onyx",
        (21f/100f), (22f/100f), (22f/100f)));
      waterColors.put("Kabutops", new ColorName("Onyx",
        (21f/100f), (22f/100f), (22f/100f)));
      waterColors.put("Totodile", new ColorName("Red",
        (100f/100f), (0f/100f), (0f/100f)));
      waterColors.put("Croconaw", new ColorName("Red",
        (100f/100f), (0f/100f), (0f/100f)));
      waterColors.put("Feraligatr", new ColorName("Red",
        (100f/100f), (0f/100f), (0f/100f)));
      waterColors.put("Chinchou", new ColorName("Electric Yellow",
        (100f/100f), (100f/100f), (20f/100f)));
      waterColors.put("Lanturn", new ColorName("Electric Yellow",
        (100f/100f), (100f/100f), (20f/100f)));
      waterColors.put("Marill", new ColorName("Baby Blue",
        (54f/100f), (81f/100f), (94f/100f)));
      waterColors.put("Azumarill", new ColorName("Baby Blue",
        (54f/100f), (81f/100f), (94f/100f)));
      waterColors.put("Politoed", new ColorName("Sea Green",
        (18f/100f), (55f/100f), (34f/100f)));
      waterColors.put("Wooper", new ColorName("Mint",
        (24f/100f), (71f/100f), (54f/100f)));
      waterColors.put("Quagsire", new ColorName("Mint",
        (24f/100f), (71f/100f), (54f/100f)));
      waterColors.put("Slowking", new ColorName("Purple",
        (63f/100f), (13f/100f), (94f/100f)));
      waterColors.put("Qwilfish", new ColorName("Granny Smith Green",
        (66f/100f), (89f/100f), (63f/100f)));
      waterColors.put("Corsola", new ColorName("Coral",
        (100f/100f), (50f/100f), (31f/100f)));
      waterColors.put("Remoraid", new ColorName("Vermillion",
        (85f/100f), (22f/100f), (12f/100f)));
      waterColors.put("Octillery", new ColorName("Vermillion",
        (85f/100f), (22f/100f), (12f/100f)));
      waterColors.put("Mantine", new ColorName("Cerulean",
        (0f/100f), (48f/100f), (65f/100f)));
      waterColors.put("Kingdra", new ColorName("Turquoise",
        (25f/100f), (88f/100f), (82f/100f)));
      waterColors.put("Suicune", new ColorName("Aero",
        (49f/100f), (73f/100f), (91f/100f)));
      waterColors.put("Mudkip", new ColorName("Willpower Orange",
        (99f/100f), (35f/100f), (0f/100f)));
      waterColors.put("Marshtomp", new ColorName("Willpower Orange",
        (99f/100f), (35f/100f), (0f/100f)));
      waterColors.put("Swampert", new ColorName("Willpower Orange",
        (99f/100f), (35f/100f), (0f/100f)));
      waterColors.put("Lotad", new ColorName("Lime",
        (0f/100f), (100f/100f), (0f/100f)));
      waterColors.put("Lombre", new ColorName("Lime",
        (0f/100f), (100f/100f), (0f/100f)));
      waterColors.put("Ludicolo", new ColorName("Lime",
        (0f/100f), (100f/100f), (0f/100f)));
      waterColors.put("Wingull", new ColorName("Seashell",
        (100f/100f), (96f/100f), (93f/100f)));
      waterColors.put("Pelipper", new ColorName("Seashell",
        (100f/100f), (96f/100f), (93f/100f)));
      waterColors.put("Surskit", new ColorName("Mantis",
        (45f/100f), (76f/100f), (40f/100f)));
      waterColors.put("Carvanha", new ColorName("Dark Blue",
        (0f/100f), (0f/100f), (55f/100f)));
      waterColors.put("Sharpedo", new ColorName("Dark Blue",
        (0f/100f), (0f/100f), (55f/100f)));
      waterColors.put("Wailmer", new ColorName("Navy Blue",
        (0f/100f), (0f/100f), (50f/100f)));
      waterColors.put("Wailord", new ColorName("Navy Blue",
        (0f/100f), (0f/100f), (50f/100f)));
      waterColors.put("Barboach", new ColorName("Light Brown",
        (71f/100f), (40f/100f), (11f/100f)));
      waterColors.put("Whiscash", new ColorName("Light Brown",
        (71f/100f), (40f/100f), (11f/100f)));
      waterColors.put("Corphish", new ColorName("Rust",
        (72f/100f), (25f/100f), (5f/100f)));
      waterColors.put("Crawdaunt", new ColorName("Rust",
        (72f/100f), (25f/100f), (5f/100f)));
      waterColors.put("Feebas", new ColorName("Dirt",
        (61f/100f), (46f/100f), (33f/100f)));
      waterColors.put("Milotic", new ColorName("Jasmine",
        (97f/100f), (87f/100f), (49f/100f)));
      waterColors.put("Spheal", new ColorName("Powder Blue",
        (69f/100f), (88f/100f), (90f/100f)));
      waterColors.put("Sealeo", new ColorName("Powder Blue",
        (69f/100f), (88f/100f), (90f/100f)));
      waterColors.put("Walrein", new ColorName("Powder Blue",
        (69f/100f), (88f/100f), (90f/100f)));
      waterColors.put("Clamperl", new ColorName("Pearl",
        (92f/100f), (88f/100f), (78f/100f)));
      waterColors.put("Huntail", new ColorName("Dodger Blue",
        (12f/100f), (56f/100f), (100f/100f)));
      waterColors.put("Gorebyss", new ColorName("Hot Pink",
        (100f/100f), (41f/100f), (71f/100f)));
      waterColors.put("Relicanth", new ColorName("Sepia",
        (44f/100f), (26f/100f), (8f/100f)));
      waterColors.put("Luvdisc", new ColorName("Charm Pink",
        (90f/100f), (56f/100f), (67f/100f)));
      waterColors.put("Kyogre", new ColorName("Sapphire",
        (6f/100f), (32f/100f), (73f/100f)));
      waterColors.put("Piplup", new ColorName("Royal Blue",
        (0f/100f), (14f/100f), (40f/100f)));
      waterColors.put("Prinplup", new ColorName("Royal Blue",
        (0f/100f), (14f/100f), (40f/100f)));
      waterColors.put("Empoleon", new ColorName("Royal Blue",
        (0f/100f), (14f/100f), (40f/100f)));
      waterColors.put("Bibarel", new ColorName("Wheat",
        (96f/100f), (87f/100f), (70f/100f)));
      waterColors.put("Buizel", new ColorName("Safety Orange",
        (100f/100f), (47f/100f), (0f/100f)));
      waterColors.put("Floatzel", new ColorName("Safety Orange",
        (100f/100f), (47f/100f), (0f/100f)));
      waterColors.put("Shellos", new ColorName("Khaki",
        (76f/100f), (69f/100f), (57f/100f)));
      waterColors.put("Gastrodon", new ColorName("Khaki",
        (76f/100f), (69f/100f), (57f/100f)));
      waterColors.put("Finneon", new ColorName("Blue-Gray",
        (40f/100f), (60f/100f), (80f/100f)));
      waterColors.put("Lumineon", new ColorName("Blue-Gray",
        (40f/100f), (60f/100f), (80f/100f)));
      waterColors.put("Mantyke", new ColorName("Cerulean",
        (0f/100f), (48f/100f), (65f/100f)));
      waterColors.put("Palkia", new ColorName("Outer Space",
        (25f/100f), (29f/100f), (30f/100f)));
      waterColors.put("Phione", new ColorName("Cyan",
        (0f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Manaphy", new ColorName("Cyan",
        (0f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Oshawott", new ColorName("Indigo",
        (4f/100f), (12f/100f), (57f/100f)));
      waterColors.put("Dewott", new ColorName("Indigo",
        (4f/100f), (12f/100f), (57f/100f)));
      waterColors.put("Samurott", new ColorName("Indigo",
        (4f/100f), (12f/100f), (57f/100f)));
      waterColors.put("Panpour", new ColorName("Cream",
        (100f/100f), (99f/100f), (82f/100f)));
      waterColors.put("Simipour", new ColorName("Cream",
        (100f/100f), (99f/100f), (82f/100f)));
      waterColors.put("Tympole", new ColorName("Teal Blue",
        (21f/100f), (46f/100f), (53f/100f)));
      waterColors.put("Palpitoad", new ColorName("Teal Blue",
        (21f/100f), (46f/100f), (53f/100f)));
      waterColors.put("Seismitoad", new ColorName("Teal Blue",
        (21f/100f), (46f/100f), (53f/100f)));
      waterColors.put("Basculin", new ColorName("Dark Green",
        (0f/100f), (20f/100f), (13f/100f)));
      waterColors.put("Tirtouga", new ColorName("Charcoal",
        (21f/100f), (27f/100f), (31f/100f)));
      waterColors.put("Carracosta", new ColorName("Charcoal",
        (21f/100f), (27f/100f), (31f/100f)));
      waterColors.put("Ducklett", new ColorName("Periwinkle",
        (80f/100f), (80f/100f), (100f/100f)));
      waterColors.put("Swanna", new ColorName("Periwinkle",
        (80f/100f), (80f/100f), (100f/100f)));
      waterColors.put("Frillish-Male", new ColorName("White",
        (100f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Frillish-Female", new ColorName("White",
        (100f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Jellicent-Male", new ColorName("White",
        (100f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Jellicent-Female", new ColorName("White",
        (100f/100f), (100f/100f), (100f/100f)));
      waterColors.put("Alomomola", new ColorName("Rose",
        (100f/100f), (0f/100f), (50f/100f)));
      waterColors.put("Keldeo", new ColorName("Silver",
        (75f/100f), (75f/100f), (75f/100f)));
      waterColors.put("Froakie", new ColorName("Midnight Blue",
        (10f/100f), (10f/100f), (44f/100f)));
      waterColors.put("Frogadier", new ColorName("Midnight Blue",
        (10f/100f), (10f/100f), (44f/100f)));
      waterColors.put("Greninja", new ColorName("Midnight Blue",
        (10f/100f), (10f/100f), (44f/100f)));
      waterColors.put("Binacle", new ColorName("Dark Brown",
        (40f/100f), (26f/100f), (13f/100f)));
      waterColors.put("Barbaracle", new ColorName("Dark Brown",
        (40f/100f), (26f/100f), (13f/100f)));
      waterColors.put("Clauncher", new ColorName("Jet",
        (20f/100f), (20f/100f), (20f/100f)));
      waterColors.put("Clawitzer", new ColorName("Jet",
        (20f/100f), (20f/100f), (20f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Suicune");
    question.addPokemonYes("Kyogre");
    question.addPokemonYes("Palkia");
    question.addPokemonYes("Phione");
    question.addPokemonYes("Manaphy");
    question.addPokemonYes("Keldeo");
    questions.add(question);

    question = new Question("Do you prefer the environment of a time period " +
      "in the past, as opposed to today's current society?");
    question.addPokemonYes("Omanyte");
    question.addPokemonYes("Omastar");
    question.addPokemonYes("Kabuto");
    question.addPokemonYes("Kabutops");
    question.addPokemonYes("Tirtouga");
    question.addPokemonYes("Carracosta");
    questions.add(question);

    question = new Question("What gender are you?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonNo("Frillish-Female");
    question.addPokemonNo("Jellicent-Female");
    questions.add(question);

    question = new Question("Are you, or is a close family member, an avid " +
      "hunter, or do you have the knowledge or expertise to use a firearm?");
    question.addPokemonYes("Remoraid");
    question.addPokemonYes("Octillery");
    question.addPokemonYes("Clauncher");
    question.addPokemonYes("Clawitzer");
    questions.add(question);

    question = new Question("Are you an adult that depends on someone else " +
      "for the neccesities of life, or do you find that you don't return the " +
      "things you borrow?");
    question.addPokemonYes("Remoraid");
    question.addPokemonYes("Octillery");
    question.addPokemonNo("Clauncher");
    question.addPokemonNo("Clawitzer");
    questions.add(question);

    question = new Question("Do you have a rather hedonistic outlook on life," +
      " or do you tend to put your personal feelings/need for fun above " +
      "responsibilities?");
    question.addPokemonYes("Lotad");
    question.addPokemonYes("Lombre");
    question.addPokemonYes("Ludicolo");
    questions.add(question);

    question = new Question("Are you firm and unflinching in your beliefs or " +
      "virtues, or do you have a secret strength that know one knows about?");
    question.addPokemonYes("Mudkip");
    question.addPokemonYes("Marshtomp");
    question.addPokemonYes("Swampert");
    questions.add(question);

    question = new Question("Do you tend to a garden of some sort, or " +
      "do you only associate yourself with good-natured people?");
    question.addPokemonYes("Panpour");
    question.addPokemonYes("Simipour");
    questions.add(question);

    question = new Question("Are you in a relationship with someone that you " +
      "tend to argue with, but have no plans of leaving said relationship?");
    question.addPokemonYes("Binacle");
    question.addPokemonYes("Barbaracle");
    questions.add(question);

    question = new Question("Are you able to recover from injuries or blows " +
      "to the ego rather quickly, or do people look to you for inspiration?");
    question.addPokemonYes("Staryu");
    question.addPokemonYes("Starmie");
    questions.add(question);

    question = new Question("Are you so easy-going, that it sometimes feels " +
      "like your life has no direction, or do you get into trouble for not " +
      "taking responsibility?");
    question.addPokemonYes("Wooper");
    question.addPokemonYes("Quagsire");
    questions.add(question);

    question = new Question("Are you a rather intelligent person who doesn't " +
      "mind doing favors for people, even big favors that take a lot of " +
      "energy out of you?");
    question.addPokemonYes("Lapras");
    questions.add(question);

    question = new Question("Are you a doctor, or are in any other profession" +
      " that requires medical knowledge, or do people say you are abnormally " +
      "empathetic for your age?");
    question.addPokemonYes("Alomomola");
    questions.add(question);

    question = new Question("Do you turn into a bit of an over-inflated drama" +
      " queen when you wish to be left alone or when things are going wrong " +
      "for you?");
    question.addPokemonYes("Qwilfish");
    questions.add(question);

    question = new Question("Does it feel like someone is mooching off of " +
      "you, or do you have someone that depends on you?");
    question.addPokemonYes("Mantyke");
    question.addPokemonYes("Mantine");
    questions.add(question);

    question = new Question("Are you a bit belligerent and untrusting of " +
      "foreigners or people who deviate from norms?");
    question.addPokemonYes("Basculin");
    questions.add(question);

    question = new Question("Do you bully or pick on those that are weaker or" +
      " dumber than you, but are intimidated by those stronger or smarter " +
      "than you?");
    question.addPokemonYes("Carvanha");
    question.addPokemonYes("Sharpedo");
    questions.add(question);

    question = new Question("Are you a teacher or mentor who enjoys " +
      "illuminating people on important subjects, or are you a mute?");
    question.addPokemonYes("Chinchou");
    question.addPokemonYes("Lanturn");
    questions.add(question);

    question = new Question("Do you have a disability or an alternate way of " +
      "functioning that you have adjusted to, or have used to accomplish " +
      "things no one else has?");
    question.addPokemonYes("Krabby");
    question.addPokemonYes("Kingler");
    questions.add(question);

    question = new Question("Does it feel as if something or someone is " +
      "holding you back from achieving great things, or do you worship " +
      "Lord Helix?");
    question.addPokemonYes("Omanyte");
    question.addPokemonYes("Omastar");
    questions.add(question);

    question = new Question("Are you a sociable person who likes surrounding " +
     "yourself with beautiful furniture or decorations?");
    question.addPokemonYes("Corsola");
    questions.add(question);

    question = new Question("Were you seen as a revolutionary or visionary " +
      "who did things and went places no one dared, or are you a naturally " +
      "curious person?");
    question.addPokemonYes("Kabuto");
    question.addPokemonYes("Kabutops");
    questions.add(question);

    question = new Question("Do you pursue people you are interested with " +
      "resolute determination, and does this annoy those people in the " +
      "process?");
    question.addPokemonYes("Luvdisc");
    questions.add(question);

    question = new Question("Are you a body builder or athlete who's proud of" +
      " your strength, who may be a little bit slow in the mind?");
    question.addPokemonYes("Tirtouga");
    question.addPokemonYes("Carracosta");
    questions.add(question);

    question = new Question("Are you an older or elderly person, or a young " +
      "person who has a personality that is calm, mature, and wise?");
    question.addPokemonYes("Relicanth");
    questions.add(question);

    question = new Question("Does it feel as if you produce your best work " +
      "when you are either frustrated, or just by sheer accident?");
    question.addPokemonYes("Psyduck");
    question.addPokemonYes("Golduck");
    questions.add(question);

    question = new Question("Do you find that it takes you longer to learn " +
      "than your peers, or that you are unable to understand some people's " +
      "jokes or ideas?");
    question.addPokemonYes("Slowpoke");
    question.addPokemonYes("Slowbro");
    question.addPokemonNo("Slowking");
    questions.add(question);

    question = new Question("Do you prolifically play a musical instrument, " +
      "or do you have a noticeable skin condition?");
    question.addPokemonYes("Tympole");
    question.addPokemonYes("Palpitoad");
    question.addPokemonYes("Seismitoad");
    questions.add(question);

    question = new Question("Have you had experience with a martial art, or " +
      "do you follow a strict regimen for training in a particular field of " +
      "expertise?");
    question.addPokemonYes("Oshawott");
    question.addPokemonYes("Dewott");
    question.addPokemonNo("Samurott");
    questions.add(question);

    question = new Question("Do you maintain healthy, life-extending habits, " +
      "or does it seem like you have had lucky dodges of catastrophic events " +
      "or negative consequences?");
    question.addPokemonYes("Squirtle");
    question.addPokemonYes("Wartortle");
    question.addPokemonYes("Blastoise");
    questions.add(question);

    question = new Question("Are you an energetic, playful, or happy-go-lucky" +
      " person, or do you have a certain quality or possession that draws " +
      "people to you?");
    question.addPokemonYes("Horsea");
    question.addPokemonYes("Seadra");
    question.addPokemonYes("Kingdra");
    questions.add(question);

    question = new Question("Do you wear your heart on your sleeve, or do " +
      "you find that people find you a little boring?");
    question.addPokemonYes("Poliwag");
    question.addPokemonYes("Poliwhirl");
    question.addPokemonYes("Poliwrath");
    question.addPokemonYes("Politoed");
    questions.add(question);

    question = new Question("Do people assume that you are one thing judging " +
      "by appearances or first impressions, even though you are most likely " +
      "the opposite?");
    question.addPokemonYes("Seel");
    question.addPokemonYes("Dewgong");
    questions.add(question);

    question = new Question("Do you have, or did you have for a rather long " +
      "period in your life, a job in package delivery or in customer service?");
    question.addPokemonYes("Wingull");
    question.addPokemonYes("Pelipper");
    questions.add(question);

    question = new Question("Do you tend to play rough with your friends, or " +
      "is your sense of humor a bit dark or abrasive?");
    question.addPokemonYes("Totodile");
    question.addPokemonYes("Croconaw");
    question.addPokemonYes("Feraligatr");
    questions.add(question);

    question = new Question("Are you rather chubby or overweight but are not " +
      "ashamed, or do you play a sport proficiently that involves a ball?");
    question.addPokemonYes("Spheal");
    question.addPokemonYes("Sealeo");
    question.addPokemonYes("Walrein");
    questions.add(question);

    question = new Question("Are you rather proud or vain, and hate accepting" +
      " the help of others becuase of your pride?");
    question.addPokemonYes("Piplup");
    question.addPokemonYes("Prinplup");
    question.addPokemonYes("Empoleon");
    questions.add(question);

    question = new Question("Do you try to maintain an upbeat and positive " +
      "attitude, or are you focused in the pursuit of your goals?");
    question.addPokemonYes("Froakie");
    question.addPokemonYes("Frogadier");
    question.addPokemonYes("Greninja");
    questions.add(question);

    question = new Question("Do you not like showing people who you truly " +
      "are, and if they pry, do you troll them or confuse the heck out of " +
      "them?");
    question.addPokemonYes("Shellder");
    question.addPokemonYes("Cloyster");
    questions.add(question);

    question = new Question("Do you like dressing fancy so that you are " +
      "noticed by people?");
    question.addPokemonYes("Finneon");
    question.addPokemonYes("Lumineon");
    questions.add(question);

    question = new Question("Do you prefer vegetables and fruits over meat, " +
      "or do you dance with grace and finesse that comes from lessons?");
    question.addPokemonYes("Ducklett");
    question.addPokemonYes("Swanna");
    questions.add(question);

    question = new Question("Do you go through life aimlessly and without " +
      "direction, or does it feel like no one notices you?");
    question.addPokemonYes("Tentacool");
    question.addPokemonYes("Tentacruel");
    questions.add(question);

    question = new Question("Are you wary of people borrowing or using your" +
      " possessions, or do you sleep during the day, and operate at night?");
    question.addPokemonYes("Barboach");
    question.addPokemonYes("Whiscash");
    questions.add(question);

    question = new Question("Do you have a large and somewhat intimidating " +
      "presence, but also have a truly goofy and easy-going personality?");
    question.addPokemonYes("Wailmer");
    question.addPokemonYes("Wailord");
    questions.add(question);

    question = new Question("Are you one to try new or foreign foods, or " +
      "do you like challenging people to prove that you are better at " +
      "something?");
    question.addPokemonYes("Corphish");
    question.addPokemonYes("Crawdaunt");
    questions.add(question);

    question = new Question("Do people come to you when they are having " +
      "problems that feel overwhelming, or does your job involve rescuing " +
      "people from predicaments?");
    question.addPokemonYes("Buizel");
    question.addPokemonYes("Floatzel");
    questions.add(question);

    question = new Question("Do you have the ability to convince your friends" +
      " to do almost anything for you?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Frillish-Female");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonYes("Jellicent-Female");
    questions.add(question);

    question = new Question("Are you from a multiracial family, or do your " +
      "ancestors come from an oppressed group of people?");
    question.addPokemonYes("Shellos");
    question.addPokemonYes("Gastrodon");
    questions.add(question);

    question = new Question("Are you friendly and flexible with essentially " +
      "all people, even those who are bit rude or mean?");
    question.addPokemonYes("Marill");
    question.addPokemonYes("Azumarill");
    questions.add(question);

    question = new Question("Do you believe that freedom is the most " +
      "important thing in the world, and that everyone is beautiful in their " +
      "own way?");
    question.addPokemonYes("Goldeen");
    question.addPokemonYes("Seaking");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Squirtle");
    question.addPokemonYes("Psyduck");
    question.addPokemonYes("Poliwag");
    question.addPokemonYes("Tentacool");
    question.addPokemonYes("Slowpoke");
    question.addPokemonYes("Seel");
    question.addPokemonYes("Shellder");
    question.addPokemonYes("Krabby");
    question.addPokemonYes("Horsea");
    question.addPokemonYes("Goldeen");
    question.addPokemonYes("Staryu");
    question.addPokemonYes("Magikarp");
    question.addPokemonYes("Omanyte");
    question.addPokemonYes("Kabuto");
    question.addPokemonYes("Totodile");
    question.addPokemonYes("Chinchou");
    question.addPokemonYes("Wooper");
    question.addPokemonYes("Remoraid");
    question.addPokemonYes("Mudkip");
    question.addPokemonYes("Lotad");
    question.addPokemonYes("Wingull");
    question.addPokemonYes("Surskit");
    question.addPokemonYes("Carvanha");
    question.addPokemonYes("Wailmer");
    question.addPokemonYes("Barboach");
    question.addPokemonYes("Corphish");
    question.addPokemonYes("Feebas");
    question.addPokemonYes("Spheal");
    question.addPokemonYes("Clamperl");
    question.addPokemonYes("Piplup");
    question.addPokemonYes("Buizel");
    question.addPokemonYes("Shellos");
    question.addPokemonYes("Finneon");
    question.addPokemonYes("Mantyke");
    question.addPokemonYes("Phione");
    question.addPokemonYes("Oshawott");
    question.addPokemonYes("Panpour");
    question.addPokemonYes("Tympole");
    question.addPokemonYes("Tirtouga");
    question.addPokemonYes("Ducklett");
    question.addPokemonYes("Frillish");
    question.addPokemonYes("Froakie");
    question.addPokemonYes("Binacle");
    question.addPokemonYes("Skrelp");
    question.addPokemonYes("Clauncher");

    question.addPokemonNo("Wartortle");
    question.addPokemonNo("Blastoise");
    question.addPokemonNo("Golduck");
    question.addPokemonNo("Poliwhirl");
    question.addPokemonNo("Poliwrath");
    question.addPokemonNo("Tentacruel");
    question.addPokemonNo("Slowbro");
    question.addPokemonNo("Dewgong");
    question.addPokemonNo("Cloyster");
    question.addPokemonNo("Kingler");
    question.addPokemonNo("Seadra");
    question.addPokemonNo("Seaking");
    question.addPokemonNo("Starmie");
    question.addPokemonNo("Gyarados");
    question.addPokemonNo("Vaporeon");
    question.addPokemonNo("Omastar");
    question.addPokemonNo("Kabutops");
    question.addPokemonNo("Croconaw");
    question.addPokemonNo("Feraligatr");
    question.addPokemonNo("Lanturn");
    question.addPokemonNo("Marill");
    question.addPokemonNo("Azumarill");
    question.addPokemonNo("Politoed");
    question.addPokemonNo("Quagsire");
    question.addPokemonNo("Slowking");
    question.addPokemonNo("Octillery");
    question.addPokemonNo("Mantine");
    question.addPokemonNo("Kingdra");
    question.addPokemonNo("Marshtomp");
    question.addPokemonNo("Swampert");
    question.addPokemonNo("Lombre");
    question.addPokemonNo("Ludicolo");
    question.addPokemonNo("Pelipper");
    question.addPokemonNo("Sharpedo");
    question.addPokemonNo("Wailord");
    question.addPokemonNo("Whiscash");
    question.addPokemonNo("Crawdaunt");
    question.addPokemonNo("Milotic");
    question.addPokemonNo("Sealeo");
    question.addPokemonNo("Walrein");
    question.addPokemonNo("Huntail");
    question.addPokemonNo("Gorebyss");
    question.addPokemonNo("Prinplup");
    question.addPokemonNo("Empoleon");
    question.addPokemonNo("Bibarel");
    question.addPokemonNo("Floatzel");
    question.addPokemonNo("Gastrodon");
    question.addPokemonNo("Lumineon");
    question.addPokemonNo("Manaphy");
    question.addPokemonNo("Dewott");
    question.addPokemonNo("Samurott");
    question.addPokemonNo("Simipour");
    question.addPokemonNo("Palpitoad");
    question.addPokemonNo("Seismitoad");
    question.addPokemonNo("Carracosta");
    question.addPokemonNo("Swanna");
    question.addPokemonNo("Jellicent");
    question.addPokemonNo("Frogadier");
    question.addPokemonNo("Greninja");
    question.addPokemonNo("Barbaracle");
    question.addPokemonNo("Clawitzer");
    questions.add(question);

    question = new Question("Are you known to be an industrious worker, " +
      "who likes getting jobs done well, or do you do your construction " +
      "projects?");
    question.addPokemonYes("Bibarel");
    questions.add(question);

    question = new Question("Do you like giving off the impression that you " +
      "are useless, incapable, or just not good at something in order to " +
      "avoid doing that thing?");
    question.addPokemonYes("Skrelp");
    questions.add(question);

    question = new Question("Are you deficient at something that people " +
      "ridicule you for, or do you feel that you are a generally weak person?");
    question.addPokemonYes("Magikarp");
    questions.add(question);

    question = new Question("Were you picked on by your peers when you were " +
      "younger, but now you are successful at what you do, and feel confident" +
      ", even a bit cocky?");
    question.addPokemonYes("Gyarados");
    questions.add(question);

    question = new Question("Do you feel as if you're abnormally smarter or " +
      "more gifted than other members of your family, or do you have to " +
      "depend on a \"crutch\" to succeed?");
    question.addPokemonYes("Slowking");
    questions.add(question);

    question = new Question("Do you feel as if people tend to ignore you " +
      "or don't think too highly of you, because you are not popular or " +
      "all that attractive?");
    question.addPokemonYes("Feebas");
    questions.add(question);

    question = new Question("Do you usually go the road less travelled, " +
      "or do you tend to feel sleepy or a little bit out of it?");
    question.addPokemonYes("Kingdra");
    question.addPokemonNo("Seadra");
    questions.add(question);

    question = new Question("Are you a rock star who uses their musical " +
      "talents in order to attract people or appear sexy?");
    question.addPokemonYes("Seismitoad");
    question.addPokemonNo("Palpitoad");
    questions.add(question);

    question = new Question("Do you become violent or enraged when someone " +
      "belittles you or makes you feel that you aren't important?");
    question.addPokemonYes("Empoleon");
    question.addPokemonNo("Prinplup");
    questions.add(question);

    question = new Question("Are you the kind of person to exercise strict " +
      "discipline and respect while on the job or learning new tasks, and " +
      "expects other to do the same?");
    question.addPokemonYes("Samurott");
    question.addPokemonNo("Dewott");
    questions.add(question);

    question = new Question("Are you known as someone who is extraordinarily " +
      "attractive or just generally amazing, that started out as something " +
      "less desirable?");
    question.addPokemonYes("Milotic");
    questions.add(question);

    question = new Question("Do you have dreams of eventually creating a " +
      "famous, beautiful work of art, or discovering a ground-breaking " +
      "scientific principle?");
    question.addPokemonYes("Clamperl");
    questions.add(question);

    question = new Question("Are you usually slow and unfocused at tasks that" +
      " you don't really care about, but are quick and skilled at "+
      "your own personal goals?");
    question.addPokemonYes("Feraligatr");
    question.addPokemonNo("Croconaw");
    questions.add(question);

    question = new Question("Are you honest and straightforward with how you " +
      "feel emotionally, and do you have the talent to disappear or blend " +
      "into crowds?");
    question.addPokemonYes("Vaporeon");
    questions.add(question);

    question = new Question("Do you tend to frequent places that most would " +
      "consider seedy or sketchy, and do you pursue people romantically or " +
      "sexually in these places?");
    question.addPokemonYes("Huntail");
    questions.add(question);

    question = new Question("Would you defend your friends' or family's life " +
      "if it came down to it, or would you die to stand up for an ideal?");
    question.addPokemonYes("Walrein");
    question.addPokemonNo("Sealeo");
    questions.add(question);

    question = new Question("Are you known as a rather physically attractive " +
      "gold digger who is high maintenance or a bit condescending and rude?");
    question.addPokemonYes("Gorebyss");
    questions.add(question);

    question = new Question("Are you timid or easily excitable in social " +
      "settings, and does this strangely draw people to you?");
    question.addPokemonYes("Surskit");
    questions.add(question);

    question = new Question("Are you a famed marine biologist/ecologist, " +
      "or are you the leader of a rebellion that wishes to fight against the" +
      " tyranny of another group?");
    question.addPokemonYes("Kyogre");
    questions.add(question);

    question = new Question("Are you famed for your youthful appearance, or " +
      "for your unusually compassionate nature?");
    question.addPokemonYes("Manaphy");
    question.addPokemonYes("Phione");
    questions.add(question);

    question = new Question("Have you made it your purpose in life to " +
      "discover alternative sources of fuel or to purify or clean up the " +
      "mess left by man?");
    question.addPokemonYes("Suicune");
    questions.add(question);

    question = new Question("Did you join a famous or prestigous group or " +
      "society at a rather young age due to the fact that you're a prodigy?");
    question.addPokemonYes("Keldeo");
    questions.add(question);

    question = new Question("Are you anastrophysicist or someone who works at" +
      " NASA or any other space exploration enterprise?");
    question.addPokemonYes("Palkia");
    questions.add(question);

    question = new Question("Do you have the ability to look through the " +
      "fluff or bull of the people you know, or can sense where potential " +
      "problems may occur?");
    question.addPokemonYes("Swampert");
    question.addPokemonNo("Marshtomp");
    questions.add(question);

    question = new Question("Are you able to adjust your mood to match what a" +
      " particular situation calls for, or are able to keep cool under " +
      "pressure?");
    question.addPokemonYes("Greninja");
    question.addPokemonNo("Frogadier");
    questions.add(question);

    question = new Question("Have you had experience in the military, or are " +
      "you a firefighter, or do you have a job that has a high potential " +
      "chance of risking your life?");
    question.addPokemonYes("Blastoise");
    question.addPokemonNo("Wartortle");
    questions.add(question);

    question = new Question("Are you an accepting person who is willing to " +
      "listen to people, and their problems, and give them guidance?");
    question.addPokemonYes("Azumarill");
    question.addPokemonNo("Marill");
    questions.add(question);

    question = new Question("Have you learned to sleep healthily in order to " +
      "avoid tiredness, or do you regularly partake in triathalons and other " +
      "contests of endurance?");
    question.addPokemonYes("Poliwrath");
    question.addPokemonNo("Poliwhirl");
    questions.add(question);

    question = new Question("Do you have a mesmerizing singing voice, or do " +
      "others look to you for guidance?");
    question.addPokemonYes("Politoed");
    question.addPokemonNo("Poliwhirl");
    questions.add(question);

    question = new Question("Do you tend to party the hardest out of all " +
      "party guests, and are usually drunk or delirious in your stupor of " +
      "fun?");
    question.addPokemonYes("Ludicolo");
    question.addPokemonNo("Lombre");
    questions.add(question);

    waterFrame = new JFrame("WATER TYPE QUIZ");
    waterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    waterPanel = new WaterTypeQuizGUI();
    waterFrame.add(waterPanel);
    waterFrame.pack();
    waterFrame.setVisible(true);
   }
}