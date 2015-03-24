import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;
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
     System.out.println(questions.size());
     Question dragon = questions.poll();
     question = dragon.getQuestion();
     thoseInAgreement = dragon.getYes();
     thoseInDenial = dragon.getNo();
     System.out.println("FLOOP");
     JButton yes = new JButton("Yes");
     JButton no = new JButton("No");

     JPanel conflictingInterests = new JPanel(new GridLayout(1,0));
     conflictingInterests.add(yes);
     conflictingInterests.add(no);

     JLabel questionLabel = new JLabel(question, SwingConstants.CENTER);
     System.out.println("GOOP");
     yes.addActionListener(new ActionListener() {                     
       @Override                                                            
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           System.out.println(thoseInDenial.get(i));
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
            System.out.println("FINISHED");
            for(int i = 0; i < dragonPokemon.size(); i++) {
              System.out.println(dragonPokemon.get(i));
            }
            System.exit(0);
          }
       }
     });
     no.addActionListener(new ActionListener() {                     
       @Override                                                            
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           System.out.println(thoseInAgreement.get(i));
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
           System.out.println("FINISHED");
           for(int i = 0; i < dragonPokemon.size(); i++) {
             System.out.println(dragonPokemon.get(i));
           }
           System.exit(0);
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
     System.out.println("Necessary: " + necessary);
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


    dragonFrame = new JFrame("DRAGON TYPE QUIZ");
    dragonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dragonPanel = new DragonTypeQuizGUI();
    dragonFrame.add(dragonPanel);
    dragonFrame.pack();
    dragonFrame.setVisible(true);
    System.out.println("DARGONS?!");
   }
}
/*
    //
    //Are you generally a peaceful and kind person, but aren't afraid to use force or intimidation if it is neccessary?
    //Goodra
    //Are you a famed environmentlist or biologist who believes that humans are the culprit for most of the world's problems?
    //Zygarde

		if(dragonPokemon.contains("Haxorus"))
		{System.out.println("Are you the kind of person that never likes to back down on a challenge or a dare, especially when your dignity is on the line?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Haxorus");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Fraxure");
		}
		System.out.println();}
		
		if(dragonPokemon.contains("Hydreigon"))
		{System.out.println("Has there been a great deal of physical or verbal abuse within your family or group of friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Hydreigon");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Zweilous");
		}
		System.out.println();}
		
		if(dragonPokemon.contains("Garchomp"))
		{System.out.println("Do you believe that money is the greatest force in the world today, for better or for worse?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Garchomp");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Gabite");
		}
		System.out.println();}
		
		if(dragonPokemon.contains("Rayquaza"))
		{System.out.println("Have you ever mediated between two opposing factions of people and stopped or prevented a great conflict?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Rayquaza");}
		System.out.println();}
		
		if(dragonPokemon.contains("Latias"))
		{System.out.println("Are you naturally in tune to other peoples' feelings or emotions and do you make a good psychiatrist?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Latias");
		dragonPokemon.remove("Latios");}
		System.out.println();}
		
		if(dragonPokemon.contains("Latios"))
		{System.out.println("Are you a male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Latios");}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Latias");}
		System.out.println();}
		
		if(dragonPokemon.contains("Dialga"))
		{System.out.println("Have you ever speculated on how to seriously create a time machine?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Dialga");}
		System.out.println();}
		
		if(dragonPokemon.contains("Palkia"))
		{System.out.println("Do you work extensively in the space program and would like to be/have been in space?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Palkia");}
		System.out.println();}
		
		if(dragonPokemon.contains("Giratina"))
		{System.out.println("Do you believe that you have visited the afterlife and can accurately describe it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Giratina");}
		System.out.println();}
		
		if(dragonPokemon.contains("Kyurem"))
		{System.out.println("Are you a die-hard seeker of absolute truths that could benefit mankind?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Kyurem");}
		System.out.println();}
		
		if(dragonPokemon.contains("Reshiram"))
		{System.out.println("Do you have a rather meek or delicate appearance that betrays your inner strength and willpower?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Reshiram");}
		System.out.println();}
		
		if(dragonPokemon.contains("Zekrom"))
		{System.out.println("Do you have a rough and rugged appearance that betrays your inner gentleness and calmness?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Zekrom");}
		System.out.println();}


		if(dragonPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(dragonPokemon.size()==1)
			out.println("You are " + dragonPokemon.get(0));
		if(dragonPokemon.size()>1)
		{String dragonAura=new String("\n");
		if(dragonPokemon.contains("Dratini")||dragonPokemon.contains("Dragonair")||dragonPokemon.contains("Dragonite"))
		{dragonAura=dragonAura + "Azure\n";}
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
