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
       
       darkColors.put("Dewgong", new ColorName("Turquoise",
               (25f/100f), (88f/100f), (82f/100f)));

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

    question = new Question("Is your greatest love either monetary wealth, or" +
            " jewelry and other sparkly, expensive thing?");
    question.addPokemonYes("Murkrow");
    question.addPokemonYes("Honchkrow");
    questions.add(question);

    question = new Question("Are you likely to get defensive or lash out if " +
        "someone mocks you or belittles you?");
    question.addPokemonYes("Cyndaquil");
    question.addPokemonYes("Quilava");
    question.addPokemonYes("Typhlosion");
    questions.add(question);

    question = new Question("Do you prefer the wintertime over the summertime" +
            ", and do you tend to disappear when you are not " +
            "feeling well emotionally?");
    question.addPokemonYes("Cryogonal");
    questions.add(question);

    question = new Question("Do you have perfect, 20/20 vision or have never" +
        " had the need of glasses or contacts?");
    question.addPokemonYes("Sandile");
    question.addPokemonYes("Krokorok");
    question.addPokemonYes("Krookodile");
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

    question = new Question("Are you famous for either a heroic rescue in the" +
            " wilderness, or for surviving in unfavorable environments such " +
            "the desert or the mountains?");
    question.addPokemonYes("Articuno");
    questions.add(question);

    question = new Question("Do you have underlings that do the grunt work " +
            "of your job or operation, while you do the more, ahem, important" +
            "tasks?");
    question.addPokemonYes("Honchkrow");
    question.addPokemonNo("Murkrow");
    questions.add(question);
 
    question = new Question("Do you like taking walks at night, in the dark, " +
            "or do you work out (and sweat profusely) in order to maintain " +
            "control over your stress levels?");
    question.addPokemonYes("Umbreon");
    questions.add(question);

    question = new Question("Is dark cream your favorite kind of dessert, and " +
            "do you hate sharing your food with people?");
    question.addPokemonYes("Vanilluxe");
    question.addPokemonNo("Vanillish");
    questions.add(question);

    question = new Question("Are you steadfast and unchanging in your " +
            "thoughts or beliefs, even if everyone else thinks you're wrong?");
    question.addPokemonYes("Regdark");
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

    question = new Question("Do you not care about the world's resources " +
        "depleting, or do you believe that the world would be a better place" +
        " if some people died?");
    question.addPokemonYes("Yveltal");
    questions.add(question);

    question = new Question("Have you made it your goal in life to discover " +
        "absolute truths in the world, or to make a grand scientific " +
        "discovery no one else has?");
    question.addPokemonYes("Kyurem");
    questions.add(question);

    question = new Question("Has a man broken your heart and abandoned you, " +
            "and has this made you difficult to love again?");
    question.addPokemonYes("Froslass");
    questions.add(question);

    darkFrame = new JFrame("DARK TYPE QUIZ");
    darkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    darkPanel = new DarkTypeQuizGUI();
    darkFrame.add(darkPanel);
    darkFrame.pack();
    darkFrame.setVisible(true);
   }
}

