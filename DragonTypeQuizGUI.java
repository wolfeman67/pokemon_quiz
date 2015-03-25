import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;

public class DragonTypeQuizGUI extends JPanel
{ static JFrame dragonFrame;
  static JPanel dragonPanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> dragonPokemon = new ArrayList<String>();
   public DragonTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question dragon = questions.poll();
     question = dragon.getQuestion();
     thoseInAgreement = dragon.getYes();
     thoseInDenial = dragon.getNo();
     JButton yes;
     JButton no;
     if (question == "What gender are you?") {
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
     questionLabel.setBackground(new Color(0.0f, 0.0f, 0.5f));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(new Color(1.0f, 1.0f, 1.0f));
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {                     
       @Override                                                            
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           dragonPokemon.remove(thoseInDenial.get(i));
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
            dragonFrame.getContentPane().removeAll();
		        dragonPanel = new DragonTypeQuizGUI();
            dragonFrame.add(dragonPanel);
            dragonFrame.pack();
          } else { 
           dragonFrame.getContentPane().removeAll();
           ColorSelection color = new ColorSelection();
           dragonFrame.add(color);
           dragonFrame.pack();
          }
       }
     });
     no.addActionListener(new ActionListener() {                     
       @Override                                                            
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           dragonPokemon.remove(thoseInAgreement.get(i));
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
           dragonFrame.getContentPane().removeAll();
		       dragonPanel = new DragonTypeQuizGUI();
           dragonFrame.add(dragonPanel);
           dragonFrame.pack();
         } else {
           if (dragonPokemon.size() > 1) {
             dragonFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             dragonFrame.add(color);
             dragonFrame.pack();
           } else if (dragonPokemon.size() == 1) {
             System.out.println("MOOSE");
             dragonFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             dragonFrame.add(pokemon);
             dragonFrame.pack();
             dragonFrame.setVisible(true);
           } else {
             dragonFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             dragonFrame.add(missingno);
             dragonFrame.pack();
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
       if (dragonPokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (dragonPokemon.contains(noPoke.get(i))) {
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
       super(new GridLayout(0, 3));
       ArrayList<JButton> colors = new ArrayList<JButton>();
       for (int i = 0; i < dragonPokemon.size(); i++) {
         if (dragonPokemon.get(i).equals("Dratini") || dragonPokemon.get(i)
             .equals("Dragonair") || dragonPokemon.get(i).equals("Dragonite"))
         {
           JButton colorButton = new JButton("Azure");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Azure");
           colorButton.setBackground(new Color(0.000f, (191f/256f), 1.000f));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (dragonPokemon.get(i).equals("Druddigon"))
         {
           JButton colorButton = new JButton("Rust");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Rust");
           colorButton.setBackground(new Color((72f/100f), (25f/100f),
                 (5f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (dragonPokemon.get(i).equals("Altaria"))
         {
           JButton colorButton = new JButton("Cotton");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cotton");
           colorButton.setBackground(new Color((100f/100f), (97f/100f),
                 (86f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
       }
       for (int i = 0; i < colors.size(); i++) {
         add(colors.get(i));
       }


     }
     public void actionPerformed(ActionEvent e) {
       String color = e.getActionCommand();
       ImageIcon pokePicture;
       JPanel n = new JPanel();
       dragonFrame.getContentPane().removeAll();
       if (color.equals("Azure") && dragonPokemon.contains("Dratini")) {
         n.add(createPokemon("Dratini", 0.000f, (191f/256f), 1.000f));
       } else if (color.equals("Azure") && dragonPokemon.contains("Dragonair")){
         n.add(createPokemon("Dragonair", 0.000f, (191f/256f),
               1.000f));
       } else if (color.equals("Azure") && dragonPokemon.contains("Dragonite")){
         n.add(createPokemon("Dragonite", 0.000f, (191f/256f),
               1.00f));
       } else if (color.equals("Rust")) {
         n.add(createPokemon("Druddigon", (72f/100f), (25f/100f),
               (5f/100f)));
       } else if (color.equals("Cotton")) {
         n.add(createPokemon("Altaria", (100f/100f), (97f/100f), (86f/100f)));
       }
       dragonFrame.add(n);
       dragonFrame.pack();
       dragonFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (dragonPokemon.get(0) == "Dratini") {
         n.add(createPokemon("Dratini", 0.000f, (191f/256f), 1.00f));
       }
       if (dragonPokemon.get(0) == "Dragonair") {
         n.add(createPokemon("Dragonair", 0.000f, (191f/256f), 1.00f));
       }
       if (dragonPokemon.get(0) == "Dragonite") {
         n.add(createPokemon("Dragonite", 0.000f, (191f/256f), 1.00f));
       }
       if (dragonPokemon.get(0) == "Druddigon") {
         n.add(createPokemon("Druddigon", (72f/100f), (25f/100f), (5f/100f)));
       }
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

     public static JLabel createPokemon(String pokemon, float r, float g,
         float b) {
       dragonFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("images/Dragon/" + pokemon +
           ".png");
       JLabel pokeLabel = new JLabel("You are " + pokemon + "!", pokePicture,
           JLabel.CENTER);
       pokeLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       if((r + g + b)/3.0 > .5) {
         pokeLabel.setForeground(Color.BLACK);
       } else {
         pokeLabel.setForeground(Color.WHITE);
       }
       pokeLabel.setOpaque(true);
       pokeLabel.setBackground(new Color(r, g, b));
       return pokeLabel;
     }
   } 
   public static void main(String arg[]) {

		dragonPokemon.add("Dratini");
		dragonPokemon.add("Dragonair");
		dragonPokemon.add("Dragonite");
		dragonPokemon.add("Kingdra");
		dragonPokemon.add("Vibrava");
		dragonPokemon.add("Flygon");
		dragonPokemon.add("Altaria");
		dragonPokemon.add("Bagon");
		dragonPokemon.add("Shelgon");
		dragonPokemon.add("Salamence");
		dragonPokemon.add("Latias");
		dragonPokemon.add("Latios");
		dragonPokemon.add("Rayquaza");
		dragonPokemon.add("Gible");
		dragonPokemon.add("Gabite");
		dragonPokemon.add("Garchomp");
		dragonPokemon.add("Dialga");
		dragonPokemon.add("Palkia");
		dragonPokemon.add("Giratina");
		dragonPokemon.add("Axew");
		dragonPokemon.add("Fraxure");
		dragonPokemon.add("Haxorus");
		dragonPokemon.add("Druddigon");
		dragonPokemon.add("Deino");
		dragonPokemon.add("Zweilous");
		dragonPokemon.add("Hydreigon");
		dragonPokemon.add("Reshiram");
		dragonPokemon.add("Zekrom");
		dragonPokemon.add("Kyurem");
    dragonPokemon.add("Dragalge");
    dragonPokemon.add("Tyrunt");
    dragonPokemon.add("Tyrantrum");
    dragonPokemon.add("Goomy");
    dragonPokemon.add("Sliggoo");
    dragonPokemon.add("Goodra");
    dragonPokemon.add("Noibat");
    dragonPokemon.add("Noivern");
    dragonPokemon.add("Zygarde");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Latios");
    question.addPokemonYes("Latias");
    question.addPokemonYes("Rayquaza");
    question.addPokemonYes("Dialga");
    question.addPokemonYes("Palkia");
    question.addPokemonYes("Giratina");
    question.addPokemonYes("Reshiram");
    question.addPokemonYes("Zekrom");
    question.addPokemonYes("Kyurem");
    question.addPokemonYes("Zygarde");
    questions.add(question);

    question = new Question("Do you have a hard time agreeing with" +
        " people and tend to argue?");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Zweilous");
    question.addPokemonYes("Hydreigon");
    questions.add(question);

    question = new Question("Is your quest in life to find or obtain rare and" +
        " beautiful things?");
    question.addPokemonYes("Gible");
    question.addPokemonYes("Gabite");
    question.addPokemonYes("Garchomp");
    questions.add(question);

    question = new Question("Are you the type to never give up on something" +
        " that you really believe in or on important goals?");
    question.addPokemonYes("Bagon");
    question.addPokemonYes("Shelgon");
    question.addPokemonYes("Salamence");
    questions.add(question);

    question = new Question("Are you more active in the sunny morning than in" +
        " the moonlit night?");
    question.addPokemonYes("Druddigon");
    question.addPokemonNo("Noibat");
    question.addPokemonNo("Noivern");
    questions.add(question);

    question = new Question("Do you have the ability to calm distressed" +
        " people or settle disagreements in a social setting?");
    question.addPokemonYes("Dratini");
    question.addPokemonYes("Dragonair");
    question.addPokemonYes("Dragonite");
    questions.add(question);

    question = new Question("Do you believe that practice and training (and" +
        " making mistakes in the process) is truly what makes perfect?");
    question.addPokemonYes("Axew");
    question.addPokemonYes("Fraxure");
    question.addPokemonYes("Haxorus");
    questions.add(question);

    question = new Question("Do you act like or do your peers treat you as a" +
        " king or leader (and do you throw fits if things don't go your way?");
    question.addPokemonYes("Tyrunt");
    question.addPokemonYes("Tyrantrum");
    questions.add(question);

    question = new Question("Does nothing bother you, or do you believe that" +
        " anything can be overcome with enough determination and patience?");
    question.addPokemonYes("Goomy");
    question.addPokemonYes("Sliggoo");
    question.addPokemonYes("Goodra");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Dratini");
    question.addPokemonYes("Bagon");
    question.addPokemonYes("Gible");
    question.addPokemonYes("Axew");
    question.addPokemonYes("Deino");
    question.addPokemonYes("Tyrunt");
    question.addPokemonYes("Goomy");

    question.addPokemonNo("Dragonair");
    question.addPokemonNo("Dragonite");
    question.addPokemonNo("Kingdra");
    question.addPokemonNo("Vibrava");
    question.addPokemonNo("Altaria");
    question.addPokemonNo("Shelgon");
    question.addPokemonNo("Gabite");
    question.addPokemonNo("Garchomp");
    question.addPokemonNo("Fraxure");
    question.addPokemonNo("Haxorus");
    question.addPokemonNo("Zweilous");
    question.addPokemonNo("Hydreigon");
    question.addPokemonNo("Dragalge");
    question.addPokemonNo("Tyrantrum");
    question.addPokemonNo("Sliggoo");
    question.addPokemonNo("Goodra");
    questions.add(question);


    question = new Question("Are you ruthless in your treatment of other " +
        "people regardless of who they are or what their relationship is with" +
        " you?");
    question.addPokemonYes("Dragalge");
    questions.add(question);

    question = new Question("Do you have the talent to be a singer?");
    question.addPokemonYes("Altaria");
    questions.add(question);

    question = new Question("Do people think you either contain great amounts" +
        " of wisdom or do people come to you for advice?");
    question.addPokemonYes("Dragonite");
    question.addPokemonNo("Dragonair");
    questions.add(question);

    question = new Question("Have you ever accomplished an achievemnt of " +
        "great merit that you feel like a greater person?");
    question.addPokemonYes("Salamence");
    question.addPokemonNo("Shelgon");
    questions.add(question);

    question = new Question("Do you tend to daydream or drift through life " +
        "without any cares?");
    question.addPokemonYes("Kingdra");
    questions.add(question);

    question = new Question("Are you talkative and friendly to the point that" +
        " you feel as if you annoy some people?");
    question.addPokemonYes("Vibrava");
    question.addPokemonYes("Flygon");
    questions.add(question);

    question = new Question("Do you have a wonderful or interesting talent " +
        "no one knows about?");
    question.addPokemonYes("Flygon");
    question.addPokemonNo("Vibrava");
    questions.add(question);

    question = new Question("Are you the kind of person that never likes to" +
        "back down on a challenge or a dare, especially when your dignity is" +
        "on the line?");
    question.addPokemonYes("Haxorus");
    question.addPokemonNo("Fraxure");
    questions.add(question);

    question = new Question("Have you experienced great hardships or abuses " +
        "that have made you a stronger?");
    question.addPokemonYes("Hydreigon");
    question.addPokemonNo("Zweilous");
    questions.add(question);

    question = new Question("Do you believe that money is the greatest force " +
        "in the world today, for better or for worse?");
    question.addPokemonYes("Garchomp");
    question.addPokemonNo("Gabite");
    questions.add(question);

    question = new Question("Are you generally a peaceful and kind person, " +
        "but aren't afraid to use force or intimidation if needed?");
    question.addPokemonYes("Goodra");
    question.addPokemonNo("Sliggoo");
    questions.add(question);

    question = new Question("Have you ever mediated between two opposing " +
        "factions of people and stopped or prevented a great conflict?");
    question.addPokemonYes("Rayquaza");
    questions.add(question);

    question = new Question("Are you naturally in tune to other peoples'" +
        " feelings or emotions and do you make a good psychiatrist?");
    question.addPokemonYes("Latias");
    question.addPokemonYes("Latios");
    questions.add(question);

    question = new Question("What gender are you?");
    question.addPokemonYes("Latios");
    question.addPokemonNo("Latias");
    questions.add(question);

    question = new Question("Have you participated in research on how to " +
        "feasibly develop a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Do you work extensively in the space program and" +
        " have been/would like to be in space?");
    question.addPokemonYes("Palkia");
    questions.add(question);

    question = new Question("Do you believe that you have visited the " +
        "afterlife, can accurately describe it, and have made it your purpose" +
        " to tell people about it?");
    question.addPokemonYes("Giratina");
    questions.add(question);

    question = new Question("Are you a die-hard seeker of truth and wish to " +
        "benefit mankind with your discoveries");
    question.addPokemonYes("Kyurem");
    questions.add(question);

    question = new Question("Do you have a rather meek or delicate appearance" +
        " that betrays your inner strength and willpower?");
    question.addPokemonYes("Reshiram");
    questions.add(question);

    question = new Question("Do you have a rough and rugged appearance that " +
        "betrays your inner gentleness and calmness?");
    question.addPokemonYes("Zekrom");
    questions.add(question);

    question = new Question("Are you a famed environmentalist or biologist " +
        "who believes that humans are the culprit for most of the world's " +
        "problems?");
    question.addPokemonYes("Zygarde");
    questions.add(question);


    dragonFrame = new JFrame("DRAGON TYPE QUIZ");
    dragonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dragonPanel = new DragonTypeQuizGUI();
    dragonFrame.add(dragonPanel);
    dragonFrame.pack();
    dragonFrame.setVisible(true);
   }
}
/*
		if(dragonPokemon.contains("Altaria"))
		{dragonAura=dragonAura + "Cotton\n";}
		if(dragonPokemon.contains("Bagon")||dragonPokemon.contains("Shelgon")||dragonPokemon.contains("Salamence"))
		{dragonAura=dragonAura + "Steel Blue\n";}
		if(dragonPokemon.contains("Druddigon"))
		{dragonAura=dragonAura + "Rusty Red\n";}
		if(dragonPokemon.contains("Axew")||dragonPokemon.contains("Fraxure")||dragonPokemon.contains("Haxorus"))
		{dragonAura=dragonAura + "Army Green\n";}
		if(dragonPokemon.contains("Vibrava")||dragonPokemon.contains("Flygon"))
		{dragonAura=dragonAura + "Electric Green\n";}
		if(dragonPokemon.contains("Deino")||dragonPokemon.contains("Zweilous")||dragonPokemon.contains("Hydreigon"))
		{dragonAura=dragonAura + "Dark Purple\n";}
		if(dragonPokemon.contains("Gible")||dragonPokemon.contains("Gabite")||dragonPokemon.contains("Garchomp"))
		{dragonAura=dragonAura + "Imperial Blue\n";}
		if(dragonPokemon.contains("Kingdra"))
		{dragonAura=dragonAura + "Turquoise\n";}
		if(dragonPokemon.contains("Palkia"))
		{dragonAura=dragonAura + "Pearl\n";}
		if(dragonPokemon.contains("Reshiram"))
		{dragonAura=dragonAura + "White\n";}
		if(dragonPokemon.contains("Zekrom"))
		{dragonAura=dragonAura + "Black\n";}
		if(dragonPokemon.contains("Dialga"))
		{dragonAura=dragonAura + "Cobalt\n";}
		if(dragonPokemon.contains("Latias")||dragonPokemon.contains("Latios"))
		{dragonAura=dragonAura + "Ivory\n";}
		if(dragonPokemon.contains("Giratina"))
		{dragonAura=dragonAura + "Onyx\n";}
		if(dragonPokemon.contains("Kyurem"))
		{dragonAura=dragonAura + "Iceberg\n";}
		if(dragonPokemon.contains("Rayquaza"))
		{dragonAura=dragonAura + "Emerald\n";}
		{System.out.println("Out of these colors:" +dragonAura +"which one would describe you the most?");
		answer=pokescan.nextLine();
                
		if(answer.equals("Azure")&&dragonPokemon.contains("Dratini"))
                    {System.out.println("You are Dratini");}
                
                else if(answer.equals("Azure")&&dragonPokemon.contains("Dragonair"))
                    {System.out.println("You are Dragonair");}
                
                else if(answer.equals("Azure")&&dragonPokemon.contains("Dragonite"))
                    {System.out.println("You are Dragonite");}
                
                else if(answer.equals("Turquoise")&&dragonPokemon.contains("Kingdra"))
                    {System.out.println("You are Kingdra");}
                
                else if(answer.equals("Electric Green")&&dragonPokemon.contains("Vibrava"))
                    {System.out.println("You are Vibrava");}
                
                else if(answer.equals("Electric Green")&&dragonPokemon.contains("Flygon"))
                    {System.out.println("You are Flygon");}
                
                else if(answer.equals("Cotton")&&dragonPokemon.contains("Altaria"))
                    {System.out.println("You are Altaria");}
                
                else if(answer.equals("Steel Blue")&&dragonPokemon.contains("Bagon"))
                    {System.out.println("You are Bagon");}
                
                else if(answer.equals("Steel Blue")&&dragonPokemon.contains("Shelgon"))
                    {System.out.println("You are Shelgon");}
                
                else if(answer.equals("Steel Blue")&&dragonPokemon.contains("Salamence"))
                    {System.out.println("You are Salamence");}
                
                else if(answer.equals("Ivory")&&dragonPokemon.contains("Latias"))
                    {System.out.println("You are Latias");}
                
                else if(answer.equals("Ivory")&&dragonPokemon.contains("Latios"))
                    {System.out.println("You are Latios");}
                
                else if(answer.equals("Emerald")&&dragonPokemon.contains("Rayquaza"))
                    {System.out.println("You are Rayquaza");}
                
                else if(answer.equals("Imperial Blue")&&dragonPokemon.contains("Gible"))
                    {System.out.println("You are Gible");}
                
                else if(answer.equals("Imperial Blue")&&dragonPokemon.contains("Gabite"))
                    {System.out.println("You are Gabite");}
                
                else if(answer.equals("Imperial Blue")&&dragonPokemon.contains("Garchomp"))
                    {System.out.println("You are Garchomp");}
                
                else if(answer.equals("Cobalt")&&dragonPokemon.contains("Dialga"))
                    {System.out.println("You are Dialga");}
                
                else if(answer.equals("Pearl")&&dragonPokemon.contains("Palkia"))
                    {System.out.println("You are Palkia");}
                
                else if(answer.equals("Onyx")&&dragonPokemon.contains("Giratina"))
                    {System.out.println("You are Giratina");}
                
                else if(answer.equals("Army Green")&&dragonPokemon.contains("Axew"))
                    {System.out.println("You are Axew");}
                
                else if(answer.equals("Army Green")&&dragonPokemon.contains("Fraxure"))
                    {System.out.println("You are Fraxure");}
                
                else if(answer.equals("Army Green")&&dragonPokemon.contains("Haxorus"))
                    {System.out.println("You are Haxorus");}
                
                else if(answer.equals("Rusty Red")&&dragonPokemon.contains("Druddigon"))
                    {System.out.println("You are Rayquaza");}
                
                else if(answer.equals("Dark Purple")&&dragonPokemon.contains("Deino"))
                    {System.out.println("You are Deino");}
                
                else if(answer.equals("Dark Purple")&&dragonPokemon.contains("Zweilous"))
                    {System.out.println("You are Zweilous");}
                
                else if(answer.equals("Dark Purple")&&dragonPokemon.contains("Hydreigon"))
                    {System.out.println("You are Hydreigon");}
                
                else if(answer.equals("White")&&dragonPokemon.contains("Reshiram"))
                    {System.out.println("You are Reshiram");}
                
                else if(answer.equals("Black")&&dragonPokemon.contains("Zekrom"))
                    {System.out.println("You are Zekrom");}
                
                else if(answer.equals("Iceberg")&&dragonPokemon.contains("Kyurem"))
                    {System.out.println("You are Kyurem");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
    }
}}}*/
