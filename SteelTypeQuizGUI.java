import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class SteelTypeQuizGUI extends JPanel
{ static JFrame steelFrame;
  static JPanel steelPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> steelPokemon = new ArrayList<String>();
  static Map <String, ColorName> steelColors = 
          new HashMap<String, ColorName>();
   public SteelTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question steel = questions.poll();
     question = steel.getQuestion();
     thoseInAgreement = steel.getYes();
     thoseInDenial = steel.getNo();
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
     questionLabel.setBackground(new Color((54f/100f), (50f/100f),(50f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           steelPokemon.remove(thoseInDenial.get(i));
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
            steelFrame.getContentPane().removeAll();
		        steelPanel = new SteelTypeQuizGUI();
            steelFrame.add(steelPanel);
            steelFrame.pack();
          } else {
              if (steelPokemon.size() > 1) {
                  for(int i = 0; i < steelPokemon.size(); i++) {
                    System.out.println(steelPokemon.get(i));
                  }
                  steelFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  steelFrame.add(color);
                  steelFrame.pack();
              } else if (steelPokemon.size() == 1) {
                  steelFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  steelFrame.add(pokemon);
                  steelFrame.pack();
                  steelFrame.setVisible(true);
              } else {
                  steelFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  steelFrame.add(missingno);
                  steelFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           steelPokemon.remove(thoseInAgreement.get(i));
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
           steelFrame.getContentPane().removeAll();
		       steelPanel = new SteelTypeQuizGUI();
           steelFrame.add(steelPanel);
           steelFrame.pack();
         } else {
           if (steelPokemon.size() > 1) {
             for(int i = 0; i < steelPokemon.size(); i++) {
               System.out.println(steelPokemon.get(i));
             }
             steelFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             steelFrame.add(color);
             steelFrame.pack();
           } else if (steelPokemon.size() == 1) {
             steelFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             steelFrame.add(pokemon);
             steelFrame.pack();
             steelFrame.setVisible(true);
           } else {
             steelFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             steelFrame.add(missingno);
             steelFrame.pack();
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
       if (steelPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (steelPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < steelPokemon.size(); i++) {
           currentPokemon = steelPokemon.get(i);
           currentColor = steelColors.get(currentPokemon);
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
       
       steelFrame.getContentPane().removeAll();
       steelFrame.add(n);
       steelFrame.pack();
       steelFrame.setVisible(true);
     }

     //This will only be Druddigon or Noivern/Noibat
     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = steelColors.get(steelPokemon.get(0));
       n.add(createPokemon(steelPokemon.get(0), new Color(
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
       steelFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Steel/" + pokemon +
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
       steelPokemon.add("Magnemite");
       steelPokemon.add("Magneton");
       steelPokemon.add("Forretress");
       steelPokemon.add("Steelix");
       steelPokemon.add("Scizor");
       steelPokemon.add("Skarmory");
       steelPokemon.add("Mawile");
       steelPokemon.add("Aron");
       steelPokemon.add("Lairon");
       steelPokemon.add("Aggron");
       steelPokemon.add("Beldum");
       steelPokemon.add("Metang");
       steelPokemon.add("Metagross");
       steelPokemon.add("Registeel");
       steelPokemon.add("Jirachi");
       steelPokemon.add("Empoleon");
       steelPokemon.add("Shieldon");
       steelPokemon.add("Bastiodon");
       steelPokemon.add("Bronzor");
       steelPokemon.add("Bronzong");
       steelPokemon.add("Lucario");
       steelPokemon.add("Magnezone");
       steelPokemon.add("Probopass");
       steelPokemon.add("Dialga");
       steelPokemon.add("Heatran");
       steelPokemon.add("Excadrill");
       steelPokemon.add("Escavalier");
       steelPokemon.add("Ferroseed");
       steelPokemon.add("Ferrothorn");
       steelPokemon.add("Klink");
       steelPokemon.add("Klang");
       steelPokemon.add("Klinklang");
       steelPokemon.add("Pawniard");
       steelPokemon.add("Bisharp");
       steelPokemon.add("Durant");
       steelPokemon.add("Cobalion");
       steelPokemon.add("Genesect");
       steelPokemon.add("Honedge");
       steelPokemon.add("Doublade");
       steelPokemon.add("Aegislash");
       steelPokemon.add("Klefki");
       
       steelColors.put("Magnemite", new ColorName("Electric Yellow",
               (100f/100f), (100f/100f), (20f/100f)));
       steelColors.put("Magneton", new ColorName("Electric Yellow",
               (100f/100f), (100f/100f), (20f/100f)));
       steelColors.put("Forretress", new ColorName("Forest Green",
               (13f/100f), (55f/100f), (13f/100f)));
       steelColors.put("Steelix", new ColorName("Onyx",
               (21f/100f), (22f/100f), (22f/100f)));
       steelColors.put("Scizor", new ColorName("Red",
               (100f/100f), (0f/100f), (0f/100f)));
       steelColors.put("Skarmory", new ColorName("Crimson",
               (86f/100f), (8f/100f), (24f/100f)));
       steelColors.put("Mawile", new ColorName("Licorice",
               (10f/100f), (7f/100f), (6f/100f)));
       steelColors.put("Aron", new ColorName("Charcoal",
               (21f/100f), (27f/100f), (31f/100f)));
       steelColors.put("Lairon", new ColorName("Charcoal",
               (21f/100f), (27f/100f), (31f/100f)));
       steelColors.put("Aggron", new ColorName("Charcoal",
               (21f/100f), (27f/100f), (31f/100f)));
       steelColors.put("Beldum", new ColorName("Cobalt Blue",
               (0f/100f), (28f/100f), (67f/100f)));
       steelColors.put("Metang", new ColorName("Cobalt Blue",
               (0f/100f), (28f/100f), (67f/100f)));
       steelColors.put("Metagross", new ColorName("Cobalt Blue",
               (0f/100f), (28f/100f), (67f/100f)));
       steelColors.put("Registeel", new ColorName("Outer Space",
               (25f/100f), (29f/100f), (30f/100f)));
       steelColors.put("Jirachi", new ColorName("Gold",
               (83f/100f), (69f/100f), (22f/100f)));
       steelColors.put("Empoleon", new ColorName("Royal Blue",
               (0f/100f), (14f/100f), (40f/100f)));
       steelColors.put("Shieldon", new ColorName("Mustard",
               (100f/100f), (86f/100f), (25f/100f)));
       steelColors.put("Bastiodon", new ColorName("Mustard",
               (100f/100f), (86f/100f), (25f/100f)));
       steelColors.put("Bronzor", new ColorName("Bronze",
               (80f/100f), (50f/100f), (20f/100f)));
       steelColors.put("Bronzong", new ColorName("Bronze",
               (80f/100f), (50f/100f), (20f/100f)));
       steelColors.put("Lucario", new ColorName("Steel Blue",
               (27f/100f), (51f/100f), (71f/100f)));
       steelColors.put("Magnezone", new ColorName("Electric Yellow",
               (100f/100f), (100f/100f), (20f/100f)));
       steelColors.put("Probopass", new ColorName("Cyan",
               (0f/100f), (100f/100f), (100f/100f)));
       steelColors.put("Dialga", new ColorName("Celestial Blue",
               (29f/100f), (59f/100f), (82f/100f)));
       steelColors.put("Heatran", new ColorName("Burnt Orange",
               (80f/100f), (33f/100f), (0f/100f)));
       steelColors.put("Excadrill", new ColorName("Chestnut",
               (58f/100f), (27f/100f), (21f/100f)));
       steelColors.put("Escavalier", new ColorName("Cadet Grey",
               (57f/100f), (64f/100f), (69f/100f)));
       steelColors.put("Ferroseed", new ColorName("Green",
               (0f/100f), (50f/100f), (0f/100f)));
       steelColors.put("Ferrothorn", new ColorName("Green",
               (0f/100f), (50f/100f), (0f/100f)));
       steelColors.put("Klink", new ColorName("Gray",
               (50f/100f), (50f/100f), (50f/100f)));
       steelColors.put("Klang", new ColorName("Gray",
               (50f/100f), (50f/100f), (50f/100f)));
       steelColors.put("Klinklang", new ColorName("Gray",
               (50f/100f), (50f/100f), (50f/100f)));
       steelColors.put("Pawniard", new ColorName("Burgundy",
               (50f/100f), (0f/100f), (13f/100f)));
       steelColors.put("Bisharp", new ColorName("Burgundy",
               (50f/100f), (0f/100f), (13f/100f)));
       steelColors.put("Durant", new ColorName("Malachite",
               (4f/100f), (85f/100f), (32f/100f)));
       steelColors.put("Cobalion", new ColorName("Silver",
               (75f/100f), (75f/100f), (75f/100f)));
       steelColors.put("Genesect", new ColorName("Electric Purple",
               (75f/100f), (0f/100f), (100f/100f)));
       steelColors.put("Honedge", new ColorName("Midnight Blue",
               (10f/100f), (10f/100f), (44f/100f)));
       steelColors.put("Doublade", new ColorName("Midnight Blue",
               (10f/100f), (10f/100f), (44f/100f)));
       steelColors.put("Aegislash", new ColorName("Midnight Blue",
               (10f/100f), (10f/100f), (44f/100f)));
       steelColors.put("Klefki", new ColorName("Light Gray",
               (83f/100f), (83f/100f), (83f/100f)));
       

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Registeel");
    question.addPokemonYes("Jirachi");
    question.addPokemonYes("Dialga");
    question.addPokemonYes("Heatran");
    question.addPokemonYes("Cobalion");
    question.addPokemonYes("Genesect");
    questions.add(question);
    
    question = new Question("Do you tend to eat copious amounts of food, and" +
        " are always hungry?");
    question.addPokemonYes("Aron");
    question.addPokemonYes("Lairon");
    question.addPokemonYes("Aggron");
    questions.add(question);


    question = new Question("Do you believe that painful experiences or " +
        "hardships make someone ultimately stronger?");
    question.addPokemonYes("Skarmory");
    questions.add(question);

    question = new Question("Do you like to dignify yourself, or do things" +
        " in needlessly flashy or technical ways?");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Doublade");
    question.addPokemonYes("Aegislash");
    questions.add(question);

    question = new Question("Do you generally not like to be touched or " +
        "hugged by people unless if they are your significant other?");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Ferrothorn");
    questions.add(question);

    question = new Question("Do you believe that there is someone for " +
        "everyone (either in terms of romance or friendships)?");
    question.addPokemonYes("Klink");
    question.addPokemonYes("Klang");
    question.addPokemonYes("Klinklang");
    questions.add(question);

    question = new Question("Do you have an embarassing secret or weakness " +
        " that most people would laugh at if they found out?");
    question.addPokemonYes("Durant");
    questions.add(question);

    question = new Question("Would you consider studying the field of " +
        "meteorology, or do people consider you to be a fun person to be " +
        "around?");
    question.addPokemonYes("Bronzor");
    question.addPokemonYes("Bronzong");
    questions.add(question);

    question = new Question("Are you looking to enter the fields of computer " +
        "science, physics, or electrical engineering?");
    question.addPokemonYes("Magnemite");
    question.addPokemonYes("Magneton");
    question.addPokemonYes("Magnezone");
    questions.add(question);

    question = new Question("Is your outer self so much different from your " +
        "inner self that it would shock people?");
    question.addPokemonYes("Mawile");
    questions.add(question);

    question = new Question("Do you depend on your friends in order to " +
        "accomplish things, or do you believe that teamwork accomplishes more" +
        " than solitary work?");
    question.addPokemonYes("Beldum");
    question.addPokemonYes("Metang");
    question.addPokemonYes("Metagross");
    questions.add(question);

    question = new Question("Are you only concerned with your own personal " +
        "problems, and don't really care about the world at large?");
    question.addPokemonYes("Shieldon");
    question.addPokemonYes("Bastiodon");
    questions.add(question);

    question = new Question("Do you tend to strategize and analyze things, " +
        "and usually have a plan for everything, instead of rushing things?");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Bisharp");
    questions.add(question);

    question = new Question("Are you super-attentive about the security of " +
      "your personal information or possessions?");
    question.addPokemonYes("Klefki");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Magnemite");
    question.addPokemonYes("Aron");
    question.addPokemonYes("Beldum");
    question.addPokemonYes("Shieldon");
    question.addPokemonYes("Bronzor");
    question.addPokemonYes("Ferroseed");
    question.addPokemonYes("Klink");
    question.addPokemonYes("Pawniard");
    question.addPokemonYes("Honedge");

    question.addPokemonNo("Magneton");
    question.addPokemonNo("Forretress");
    question.addPokemonNo("Steelix");
    question.addPokemonNo("Scizor");
    question.addPokemonNo("Lairon");
    question.addPokemonNo("Aggron");
    question.addPokemonNo("Metang");
    question.addPokemonNo("Metagross");
    question.addPokemonNo("Empoleon");
    question.addPokemonNo("Bastiodon");
    question.addPokemonNo("Bronzong");
    question.addPokemonNo("Lucario");
    question.addPokemonNo("Magnezone");
    question.addPokemonNo("Probopass");
    question.addPokemonNo("Excadrill");
    question.addPokemonNo("Escavalier");
    question.addPokemonNo("Ferrothorn");
    question.addPokemonNo("Klang");
    question.addPokemonNo("Klinklang");
    question.addPokemonNo("Bisharp");
    question.addPokemonNo("Doublade");
    question.addPokemonNo("Aegislash");
    questions.add(question);

    question = new Question("Are you quite belligerent when someone corrects " +
        "you or tries to change you in some way?");
    question.addPokemonYes("Aggron");
    question.addPokemonNo("Lairon");
    questions.add(question);

    question = new Question("Do you tend to nearly exclusively associate with" +
        " intellectuals or other generally intelligent people?");
    question.addPokemonYes("Metagross");
    question.addPokemonNo("Metang");
    questions.add(question);
 
    question = new Question("Are you a man with noticable or extravagent " +
        "facial hair, or are you a woman who finds facial hair attractive?");
    question.addPokemonYes("Probopass");
    questions.add(question);

    question = new Question("Do most people consider you enigmatic or " +
        "difficult to read?");
    question.addPokemonYes("Registeel");
    questions.add(question);

    question = new Question("Do you have the power or money to grant people's" +
        " wishes, and do you have philanthropic stance on life?");
    question.addPokemonYes("Jirachi");
    questions.add(question);

    question = new Question("Do you read people's thoughts or emotions very " +
        "well and has this made you a capable leader?");
    question.addPokemonYes("Lucario");
    questions.add(question);

    question = new Question("Do you usually read up on the latest scientific" +
        " discoveries or read scientific journals?");
    question.addPokemonYes("Magnezone");
    question.addPokemonNo("Magneton");
    questions.add(question);

    question = new Question("In terms of super powers, would you much rather " +
        "have armored skin over the ability to fly?");
    question.addPokemonYes("Scizor");
    questions.add(question);

    question = new Question("Do you like doing your own home remodeling/" +
        "construction projects, instead of paying someone to do it?");
    question.addPokemonYes("Excadrill");
    questions.add(question);

    question = new Question("Are you an excellent judger of someone's " +
        "qualities and do you like passing that judgement onto others?");
    question.addPokemonYes("Aegislash");
    question.addPokemonNo("Doublade");
    questions.add(question);

    question = new Question("Are you an introvert who likes to close yourself" +
        " off in your little world, and dislikes leaving your \"bubble\"?");
    question.addPokemonYes("Forretress");
    questions.add(question);

    question = new Question("Are your true feelings only discernable if " +
       "someone pays attention to your actions ?");
    question.addPokemonYes("Klinklang");
    question.addPokemonNo("Klang");
    questions.add(question);

    question = new Question("Do you turn aggressive when someone mocks you or" +
        " belittles your accomplishments?");
    question.addPokemonYes("Empoleon");
    questions.add(question);

    question = new Question("Do you perform better when under pressure or " +
        "when stakes are high?");
    question.addPokemonYes("Steelix");
    questions.add(question);

    question = new Question("Have you studied or have came up with theories" +
        " on how to feasibly construct a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Do you sometimes have severe anger management" +
        " problems but usually keep it now under wraps?");
    question.addPokemonYes("Heatran");
    questions.add(question);
    
    question = new Question("Do you have the bad habit of not returning " +
        "things that you borrow from others, but otherwise are a moral person?");
    question.addPokemonYes("Escavalier");
    questions.add(question);
     
    question = new Question("Do you have commanding presence of a leader, but" +
        " others find you a bit cold and distant?");
    question.addPokemonYes("Cobalion");
    questions.add(question);
     
    question = new Question("Are you either a cyborg (partially at least) or " +
        "have been genetically modified in some way?");
    question.addPokemonYes("Genesect");
    questions.add(question);


    steelFrame = new JFrame("STEEL TYPE QUIZ");
    steelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    steelPanel = new SteelTypeQuizGUI();
    steelFrame.add(steelPanel);
    steelFrame.pack();
    steelFrame.setVisible(true);
   }
}

