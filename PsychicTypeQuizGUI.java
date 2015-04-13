import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class PsychicTypeQuizGUI extends JPanel
{ static JFrame psychicFrame;
  static JPanel psychicPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> psychicPokemon = new ArrayList<String>();
  static Map <String, ColorName> psychicColors = 
          new HashMap<String, ColorName>();
   public PsychicTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question psychic = questions.poll();
     question = psychic.getQuestion();
     thoseInAgreement = psychic.getYes();
     thoseInDenial = psychic.getNo();
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
     questionLabel.setBackground(new Color((20f/100f), (9f/100f), (30f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           psychicPokemon.remove(thoseInDenial.get(i));
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
            psychicFrame.getContentPane().removeAll();
		        psychicPanel = new PsychicTypeQuizGUI();
            psychicFrame.add(psychicPanel);
            psychicFrame.pack();
          } else {
              if (psychicPokemon.size() > 1) {
                  psychicFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  psychicFrame.add(color);
                  psychicFrame.pack();
              } else if (psychicPokemon.size() == 1) {
                  psychicFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  psychicFrame.add(pokemon);
                  psychicFrame.pack();
                  psychicFrame.setVisible(true);
              } else {
                  psychicFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  psychicFrame.add(missingno);
                  psychicFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           psychicPokemon.remove(thoseInAgreement.get(i));
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
           psychicFrame.getContentPane().removeAll();
		       psychicPanel = new PsychicTypeQuizGUI();
           psychicFrame.add(psychicPanel);
           psychicFrame.pack();
         } else {
           if (psychicPokemon.size() > 1) {
             psychicFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             psychicFrame.add(color);
             psychicFrame.pack();
           } else if (psychicPokemon.size() == 1) {
             psychicFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             psychicFrame.add(pokemon);
             psychicFrame.pack();
             psychicFrame.setVisible(true);
           } else {
             psychicFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             psychicFrame.add(missingno);
             psychicFrame.pack();
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
       if (psychicPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (psychicPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < psychicPokemon.size(); i++) {
           currentPokemon = psychicPokemon.get(i);
           currentColor = psychicColors.get(currentPokemon);
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
       
       psychicFrame.getContentPane().removeAll();
       psychicFrame.add(n);
       psychicFrame.pack();
       psychicFrame.setVisible(true);
     }

     //This will only be Druddigon or Noivern/Noibat
     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = psychicColors.get(psychicPokemon.get(0));
       n.add(createPokemon(psychicPokemon.get(0), new Color(
               trueColor.getRed(), trueColor.getGreen(), trueColor.getBlue())));
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
       psychicFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Psychic/" + pokemon +
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

       psychicPokemon.add("Abra");
       psychicPokemon.add("Kadabra");
       psychicPokemon.add("Alakazam");
       psychicPokemon.add("Slowpoke");
       psychicPokemon.add("Slowbro");
       psychicPokemon.add("Drowzee");
       psychicPokemon.add("Hypno");
       psychicPokemon.add("Exeggcute");
       psychicPokemon.add("Exeggutor");
       psychicPokemon.add("Starmie");
       psychicPokemon.add("Mr. Mime");
       psychicPokemon.add("Jynx");
       psychicPokemon.add("Mewtwo");
       psychicPokemon.add("Mew");
       psychicPokemon.add("Natu");
       psychicPokemon.add("Xatu");
       psychicPokemon.add("Espeon");
       psychicPokemon.add("Slowking");
       psychicPokemon.add("Unown");
       psychicPokemon.add("Wobbuffet");
       psychicPokemon.add("Girafarig");
       psychicPokemon.add("Smoochum");
       psychicPokemon.add("Lugia");
       psychicPokemon.add("Ralts");
       psychicPokemon.add("Kirlia");
       psychicPokemon.add("Gardevoir");
       psychicPokemon.add("Meditite");
       psychicPokemon.add("Medicham");
       psychicPokemon.add("Spoink");
       psychicPokemon.add("Grumpig");
       psychicPokemon.add("Lunatone");
       psychicPokemon.add("Solrock");
       psychicPokemon.add("Baltoy");
       psychicPokemon.add("Claydol");
       psychicPokemon.add("Chimecho");
       psychicPokemon.add("Wynaut");
       psychicPokemon.add("Beldum");
       psychicPokemon.add("Metang");
       psychicPokemon.add("Metagross");
       psychicPokemon.add("Latias");
       psychicPokemon.add("Latios");
       psychicPokemon.add("Jirachi");
       psychicPokemon.add("Deoxys");
       psychicPokemon.add("Chingling");
       psychicPokemon.add("Bronzor");
       psychicPokemon.add("Bronzong");
       psychicPokemon.add("Mime Jr.");
       psychicPokemon.add("Gallade");
       psychicPokemon.add("Uxie");
       psychicPokemon.add("Mesprit");
       psychicPokemon.add("Azelf");
       psychicPokemon.add("Cresselia");
       psychicPokemon.add("Victini");
       psychicPokemon.add("Munna");
       psychicPokemon.add("Musharna");
       psychicPokemon.add("Woobat");
       psychicPokemon.add("Swoobat");
       psychicPokemon.add("Sigilyph");
       psychicPokemon.add("Gothita");
       psychicPokemon.add("Gothorita");
       psychicPokemon.add("Gothitelle");
       psychicPokemon.add("Solosis");
       psychicPokemon.add("Duosion");
       psychicPokemon.add("Reuniclus");
       psychicPokemon.add("Elgyem");
       psychicPokemon.add("Beheeyem");
       psychicPokemon.add("Meloetta");
       psychicPokemon.add("Delphox");
       psychicPokemon.add("Espurr");
       psychicPokemon.add("Meowstic-Male");
       psychicPokemon.add("Meowstic-Female");
       psychicPokemon.add("Inkay");
       psychicPokemon.add("Malamar");
       psychicPokemon.add("Hoopa");
       
       psychicColors.put("Gastly", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       
       

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Mewtwo");
    question.addPokemonYes("Mew");
    question.addPokemonYes("Lugia");
    question.addPokemonYes("Celebi");
    question.addPokemonYes("Latias");
    question.addPokemonYes("Latios");
    question.addPokemonYes("Jirachi");
    question.addPokemonYes("Deoxys");
    question.addPokemonYes("Uxie");
    question.addPokemonYes("Mesprit");
    question.addPokemonYes("Azelf");
    question.addPokemonYes("Cresselia");
    question.addPokemonYes("Victini");
    question.addPokemonYes("Hoopa");
    questions.add(question);

    question = new Question("Would drifting in the sky without a care in the" +
        " world appeal to you?");
    question.addPokemonYes("Drifloon");
    question.addPokemonYes("Drifblim");
    questions.add(question);

    question = new Question("Do you feel confined or trapped in your life or " +
        "by society's expectations/rules?");
    question.addPokemonYes("Spiritomb");
    questions.add(question);

    question = new Question("Do you have the odd habit of collecting a " +
        "certain kind or group of items?");
    question.addPokemonYes("Sableye");
    questions.add(question);

    question = new Question("Do you bear a strong grudge with someone or do " +
        "you have a hard time trusting people because of a betrayal in the " +
        "past?");
    question.addPokemonYes("Shuppet");
    question.addPokemonYes("Banette");
    questions.add(question);

    question = new Question("Do you like remembering the past or holding onto" +
        " mementos of past events, even if those memories are painful?");
    question.addPokemonYes("Yamask");
    question.addPokemonYes("Cofagrigus");
    questions.add(question);

    question = new Question("Do you have the power or charm to make your " +
        "friends do whatever you want them to?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Frillish-Female");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonYes("Jellicent-Female");
    questions.add(question);

    question = new Question("Do you generally not like to be the center of " +
        "attention, unless you are adept or proficient at something at hand?");
    question.addPokemonYes("Gastly");
    question.addPokemonYes("Haunter");
    question.addPokemonYes("Gengar");
    questions.add(question);

    question = new Question("Are you an excellent teacher or a steadfast " +
        "learner that has the desire to learn more and wishes the world was" +
        " more intelligent?");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Lampent");
    question.addPokemonYes("Chandelure");
    questions.add(question);

    question = new Question("Do you like playing pranks on people or teasing " +
        "those you consider inferior to you?");
    question.addPokemonYes("Misdreavus");
    question.addPokemonYes("Mismagius");
    questions.add(question);

    question = new Question("Do you have a strong sense of justice and " +
        "believe that karma will come into play eventually?");
    question.addPokemonYes("Duskull");
    question.addPokemonYes("Dusclops");
    question.addPokemonYes("Dusknoir");
    questions.add(question);

    question = new Question("Would a job involving electrical engineering, " +
        "software engineering, or hacking appeal to you?");
    question.addPokemonYes("Rotom");
    questions.add(question);

    question = new Question("Do you like doing things in a needlessly flashy" +
       " or technical sort of fashion?");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Doublade");
    question.addPokemonYes("Aegislash");
    questions.add(question);

    question = new Question("Would you not mind living in a secluded, " +
        "forested area, or do you tend to a rather large and extensive" +
        " garden?");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Trevenant");
    questions.add(question);

    question = new Question("Are you more active in the moonlit night than " +
        "during the day?");
    question.addPokemonYes("Pumpkaboo");
    question.addPokemonYes("Gourgeist");
    questions.add(question);

    question = new Question("Do you have a hard time controlling your " +
        "emotions, or ignoring those who are in need?");
    question.addPokemonYes("Golett");
    question.addPokemonYes("Golurk");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Abra");
    question.addPokemonYes("Slowpoke");
    question.addPokemonYes("Drowzee");
    question.addPokemonYes("Exeggcute");
    question.addPokemonYes("Natu");
    question.addPokemonYes("Smoochum");
    question.addPokemonYes("Ralts");
    question.addPokemonYes("Meditite");
    question.addPokemonYes("Spoink");
    question.addPokemonYes("Baltoy");
    question.addPokemonYes("Wynaut");
    question.addPokemonYes("Beldum");
    question.addPokemonYes("Chingling");
    question.addPokemonYes("Bronzor");
    question.addPokemonYes("Mime Jr.");
    question.addPokemonYes("Munna");
    question.addPokemonYes("Woobat");
    question.addPokemonYes("Gothita");
    question.addPokemonYes("Solosis");
    question.addPokemonYes("Elgyem");
    question.addPokemonYes("Espurr");
    question.addPokemonYes("Inkay");

    question.addPokemonNo("Kadabra");
    question.addPokemonNo("Alakazam");
    question.addPokemonNo("Slowbro");
    question.addPokemonNo("Hypno");
    question.addPokemonNo("Exeggutor");
    question.addPokemonNo("Starmie");
    question.addPokemonNo("Mr. Mime");
    question.addPokemonNo("Jynx");
    question.addPokemonNo("Xatu");
    question.addPokemonNo("Espeon");
    question.addPokemonNo("Slowking");
    question.addPokemonNo("Wobbuffet");
    question.addPokemonNo("Kirlia");
    question.addPokemonNo("Gardevoir");
    question.addPokemonNo("Medicham");
    question.addPokemonNo("Grumpig");
    question.addPokemonNo("Claydol");
    question.addPokemonNo("Metang");
    question.addPokemonNo("Metagross");
    question.addPokemonNo("Bronzong");
    question.addPokemonNo("Gallade");
    question.addPokemonNo("Musharna");
    question.addPokemonNo("Swoobat");
    question.addPokemonNo("Gothorita");
    question.addPokemonNo("Gothitelle");
    question.addPokemonNo("Duosion");
    question.addPokemonNo("Reuniclus");
    question.addPokemonNo("Beheeyem");
    question.addPokemonNo("Delphox");
    question.addPokemonNo("Meowstic-Male");
    question.addPokemonNo("Meowstic-Female");
    question.addPokemonNo("Malamar");
    questions.add(question);


    question = new Question("What gender are you?");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Jellicent-Male");
    question.addPokemonNo("Frillish-Female");
    question.addPokemonNo("Jellicent-Female");
    question.addPokemonNo("Froslass");
    questions.add(question);

    question = new Question("Do you enjoy or do you have the bad habit of " +
        "seducing guys and then pushing them away?");
    question.addPokemonYes("Froslass");
    questions.add(question);

    question = new Question("Are you a shell of your former self, or have you" +
        " become a completely different person due to hardships?");
    question.addPokemonYes("Shedinja");
    questions.add(question);

    question = new Question("Do you have the habit of laughing at other " +
        "peoples' misfortune or pain, or even your own?");
    question.addPokemonYes("Gengar");
    question.addPokemonNo("Haunter");
    questions.add(question);

    question = new Question("Does the subject of the afterlife fascinate you " +
        "and do you believe in one?");
    question.addPokemonYes("Dusknoir");
    question.addPokemonNo("Dusclops");
    questions.add(question);

    question = new Question("Are your manners or speech elegant or refined " +
        "compared to most of your peers?");
    question.addPokemonYes("Chandelure");
    question.addPokemonNo("Lampent");
    questions.add(question);

    question = new Question("Do people either love you or hate you with " +
        "little in between?");
    question.addPokemonYes("Mismagius");
    question.addPokemonNo("Misdreavus");
    questions.add(question);

    question = new Question("Are you an excellent judge of someone's " +
        "character or abilities, and enjoy passing your judgement?");
    question.addPokemonYes("Aegislash");
    question.addPokemonNo("Doublade");
    questions.add(question);

    question = new Question("Do you believe you have been to the afterlife, " +
        "can accurately describe it, and have made it your purpose to tell " +
        "others about it?");
    question.addPokemonYes("Giratina");
    questions.add(question);

    question = new Question("Are you famous for your criminal exploits or " +
        "for all of the wealth that you have acquired?");
    question.addPokemonYes("Hoopa");
    questions.add(question);

    psychicFrame = new JFrame("PSYCHIC TYPE QUIZ");
    psychicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    psychicPanel = new PsychicTypeQuizGUI();
    psychicFrame.add(psychicPanel);
    psychicFrame.pack();
    psychicFrame.setVisible(true);
   }
}

