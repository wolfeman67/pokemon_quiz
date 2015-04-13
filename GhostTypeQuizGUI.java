import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class GhostTypeQuizGUI extends JPanel
{ static JFrame ghostFrame;
  static JPanel ghostPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> ghostPokemon = new ArrayList<String>();
  static Map <String, ColorName> ghostColors = 
          new HashMap<String, ColorName>();
   public GhostTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question ghost = questions.poll();
     question = ghost.getQuestion();
     thoseInAgreement = ghost.getYes();
     thoseInDenial = ghost.getNo();
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
           ghostPokemon.remove(thoseInDenial.get(i));
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
            ghostFrame.getContentPane().removeAll();
		        ghostPanel = new GhostTypeQuizGUI();
            ghostFrame.add(ghostPanel);
            ghostFrame.pack();
          } else {
              if (ghostPokemon.size() > 1) {
                  ghostFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  ghostFrame.add(color);
                  ghostFrame.pack();
              } else if (ghostPokemon.size() == 1) {
                  ghostFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  ghostFrame.add(pokemon);
                  ghostFrame.pack();
                  ghostFrame.setVisible(true);
              } else {
                  ghostFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  ghostFrame.add(missingno);
                  ghostFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           ghostPokemon.remove(thoseInAgreement.get(i));
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
           ghostFrame.getContentPane().removeAll();
		       ghostPanel = new GhostTypeQuizGUI();
           ghostFrame.add(ghostPanel);
           ghostFrame.pack();
         } else {
           if (ghostPokemon.size() > 1) {
             ghostFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             ghostFrame.add(color);
             ghostFrame.pack();
           } else if (ghostPokemon.size() == 1) {
             ghostFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             ghostFrame.add(pokemon);
             ghostFrame.pack();
             ghostFrame.setVisible(true);
           } else {
             ghostFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             ghostFrame.add(missingno);
             ghostFrame.pack();
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
       if (ghostPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (ghostPokemon.contains(noPoke.get(i))) {
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
       for (int i = 0; i < ghostPokemon.size(); i++) {
           currentPokemon = ghostPokemon.get(i);
           currentColor = ghostColors.get(currentPokemon);
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
       
       ghostFrame.getContentPane().removeAll();
       ghostFrame.add(n);
       ghostFrame.pack();
       ghostFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       ColorName trueColor = ghostColors.get(ghostPokemon.get(0));
       n.add(createPokemon(ghostPokemon.get(0), new Color(
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
       ghostFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Ghost/" + pokemon +
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

       ghostPokemon.add("Gastly");
       ghostPokemon.add("Haunter");
       ghostPokemon.add("Gengar");
       ghostPokemon.add("Misdreavus");
       ghostPokemon.add("Shedinja");
       ghostPokemon.add("Sableye");
       ghostPokemon.add("Shuppet");
       ghostPokemon.add("Banette");
       ghostPokemon.add("Duskull");
       ghostPokemon.add("Dusclops");
       ghostPokemon.add("Drifloon");
       ghostPokemon.add("Drifblim");
       ghostPokemon.add("Mismagius");
       ghostPokemon.add("Spiritomb");
       ghostPokemon.add("Dusknoir");
       ghostPokemon.add("Froslass");
       ghostPokemon.add("Rotom");
       ghostPokemon.add("Giratina");
       ghostPokemon.add("Yamask");
       ghostPokemon.add("Cofagrigus");
       ghostPokemon.add("Frillish-Male");
       ghostPokemon.add("Frillish-Female");
       ghostPokemon.add("Jellicent-Male");
       ghostPokemon.add("Jellicent-Female");
       ghostPokemon.add("Litwick");
       ghostPokemon.add("Lampent");
       ghostPokemon.add("Chandelure");
       ghostPokemon.add("Golett");
       ghostPokemon.add("Golurk");
       ghostPokemon.add("Honedge");
       ghostPokemon.add("Doublade");
       ghostPokemon.add("Aegislash");
       ghostPokemon.add("Phantump");
       ghostPokemon.add("Trevenant");
       ghostPokemon.add("Pumpkaboo");
       ghostPokemon.add("Gourgeist");
       ghostPokemon.add("Hoopa");
       
       ghostColors.put("Gastly", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       ghostColors.put("Haunter", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       ghostColors.put("Gengar", new ColorName("Dark Purple",
               (20f/100f), (9f/100f), (30f/100f)));
       ghostColors.put("Misdreavus", new ColorName("Magneta",
               (100f/100f), (0f/100f), (100f/100f)));
       ghostColors.put("Shedinja", new ColorName("Amber",
               (100f/100f), (75f/100f), (0f/100f)));
       ghostColors.put("Sableye", new ColorName("Glitter",
               (90f/100f), (91f/100f), (98f/100f)));
       ghostColors.put("Shuppet", new ColorName("Dark Blue-Gray",
               (40f/100f), (40f/100f), (60f/100f)));
       ghostColors.put("Banette", new ColorName("Dark Blue-Gray",
               (40f/100f), (40f/100f), (60f/100f)));
       ghostColors.put("Duskull", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Dusclops", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Drifloon", new ColorName("Lavender",
               (71f/100f), (49f/100f), (86f/100f)));
       ghostColors.put("Drifblim", new ColorName("Lavender",
               (71f/100f), (49f/100f), (86f/100f)));
       ghostColors.put("Mismagius", new ColorName("Magneta",
               (100f/100f), (0f/100f), (100f/100f)));
       ghostColors.put("Spiritomb", new ColorName("Electric Green",
               (0f/100f), (100f/100f), (0f/100f)));
       ghostColors.put("Duksnoir", new ColorName("Black",
               (0f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Froslass", new ColorName("Steel Blue",
               (27f/100f), (51f/100f), (71f/100f)));
       ghostColors.put("Rotom", new ColorName("Bright Orange",
               (100f/100f), (50f/100f), (0f/100f)));
       ghostColors.put("Giratina", new ColorName("Onyx",
               (21f/100f), (22f/100f), (22f/100f)));
       ghostColors.put("Yamask", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       ghostColors.put("Cofagrigus", new ColorName("Sand",
               (76f/100f), (70f/100f), (50f/100f)));
       ghostColors.put("Frillish-Male", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       ghostColors.put("Frillish-Female", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       ghostColors.put("Jellicent-Male", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       ghostColors.put("Jellicent-Female", new ColorName("White",
               (100f/100f), (100f/100f), (100f/100f)));
       ghostColors.put("Litwick", new ColorName("Crimson",
               (60f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Lampent", new ColorName("Crimson",
               (60f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Chandelure", new ColorName("Crimson",
               (60f/100f), (0f/100f), (0f/100f)));
       ghostColors.put("Golett", new ColorName("Teal Blue",
               (21f/100f), (46f/100f), (53f/100f)));
       ghostColors.put("Golurk", new ColorName("Teal Blue",
               (21f/100f), (46f/100f), (53f/100f)));
       ghostColors.put("Honedge", new ColorName("Royal Blue",
               (0f/100f), (14f/100f), (40f/100f)));
       ghostColors.put("Doublade", new ColorName("Royal Blue",
               (0f/100f), (14f/100f), (40f/100f)));
       ghostColors.put("Aegislash", new ColorName("Royal Blue",
               (0f/100f), (14f/100f), (40f/100f)));
       ghostColors.put("Phantump", new ColorName("Forest Green",
               (13f/100f), (55f/100f), (13f/100f)));
       ghostColors.put("Trevenant", new ColorName("Forest Green",
               (13f/100f), (55f/100f), (13f/100f)));
       ghostColors.put("Pumpkaboo", new ColorName("Pumpkin Orange",
               (100f/100f), (46f/100f), (9f/100f)));
       ghostColors.put("Gourgeist", new ColorName("Pumpkin Orange",
               (100f/100f), (46f/100f), (9f/100f)));
       ghostColors.put("Hoopa", new ColorName("Gold",
               (83f/100f), (69f/100f), (22f/100f)));
       
       

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Giratina");
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
    question.addPokemonYes("Gastly");
    question.addPokemonYes("Shuppet");
    question.addPokemonYes("Duskull");
    question.addPokemonYes("Drifloon");
    question.addPokemonYes("Yamask");
    question.addPokemonYes("Frillish-Male");
    question.addPokemonYes("Frillish-Female");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Golett");
    question.addPokemonYes("Honedge");
    question.addPokemonYes("Phantump");
    question.addPokemonYes("Pumpkaboo");

    question.addPokemonNo("Haunter");
    question.addPokemonNo("Gengar");
    question.addPokemonNo("Shedinja");
    question.addPokemonNo("Banette");
    question.addPokemonNo("Dusclops");
    question.addPokemonNo("Drifblim");
    question.addPokemonNo("Mismagius");
    question.addPokemonNo("Dusknoir");
    question.addPokemonNo("Froslass");
    question.addPokemonNo("Cofagrigus");
    question.addPokemonNo("Jellicent-Male");
    question.addPokemonNo("Jellicent-Female");
    question.addPokemonNo("Lampent");
    question.addPokemonNo("Chandelure");
    question.addPokemonNo("Golurk");
    question.addPokemonNo("Doublade");
    question.addPokemonNo("Aegislash");
    question.addPokemonNo("Trevenant");
    question.addPokemonNo("Gourgeist");
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

    question = new Question("Are your manners or way of speaking more elegant" +
        "or refined compared to most of your peers?");
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

    ghostFrame = new JFrame("GHOST TYPE QUIZ");
    ghostFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ghostPanel = new GhostTypeQuizGUI();
    ghostFrame.add(ghostPanel);
    ghostFrame.pack();
    ghostFrame.setVisible(true);
   }
}

