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
     questionLabel.setBackground(new Color((11f/100f), (67f/100f),(47f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
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
       waterPokemon.add("Frillish");
       waterPokemon.add("Jellicent");
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

       waterColors.put("Bulbasaur", new ColorName("Teal Green",
               (0f/100f), (51f/100f), (50f/100f)));

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Suicune");
    question.addPokemonYes("Kyogre");
    question.addPokemonYes("Palkia");
    question.addPokemonYes("Phione");
    question.addPokemonYes("Manaphy");
    questions.add(question);

    question = new Question("Do you have a rather hedonistic outlook on life," +
      " or do you tend to put your personal feelings/need for fun above " +
      "responsibilities?");
    question.addPokemonYes("Lotad");
    question.addPokemonYes("Lombre");
    question.addPokemonYes("Ludicolo");
    questions.add(question);

    question = new Question("Do you prefer the environment of a time period " +
      "in the past, as opposed to today's current society?");
    question.addPokemonYes("Omanyte");
    question.addPokemonYes("Omastar");
    question.addPokemonYes("Kabuto");
    question.addPokemonYes("Kabutops");
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
      "taking responibility?");
    question.addPokemonYes("Wooper");
    question.addPokemonYes("Quagsire");
    questions.add(question);

    question = new Question("Are you a rather intelligent person who doesn't " +
      "mind doing favors for people, even big favors that take a lot of " +
      "energy out of you?");
    question.addPokemonYes("Lapras");
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

    question = new Question("Do you not like showing people who you truly " +
      "are, and if they pry, do you troll them or confuse the heck out of " +
      "them?");
    question.addPokemonYes("Shellder");
    question.addPokemonYes("Cloyster");
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

    question = new Question("Do you feel as if you abnormally smarter or more" +
      " gifted than other members of your family, or do you have to depend on" +
      " a \"crutch\" to succeed?");
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

    question = new Question("Do you tend to frequent places that most would " +
      "consider seedy or sketchy, and do you pursue people romantically or " +
      "sexually in these places?");
    question.addPokemonYes("Huntail");
    questions.add(question);

    question = new Question("Are you known as a rather physically attractive " +
      "gold digger who is high maintenance or a bit condescending and rude?");
    question.addPokemonYes("Gorebyss");
    questions.add(question);

    question = new Question("Have you had experience in the military, or are " +
      "you a firefighter, or do you have a job that has a high potential " +
      "chance of risking your life?");
    question.addPokemonYes("Blastoise");
    question.addPokemonNo("Wartortle");
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