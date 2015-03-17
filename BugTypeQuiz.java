import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class BugTypeQuiz
{
    public static void innerSearch()
    {
        
        
    	ArrayList<String> bugPokemon= new ArrayList<String>();
		bugPokemon.add("Caterpie");
		bugPokemon.add("Metapod");
		bugPokemon.add("Butterfree");
		bugPokemon.add("Weedle");
		bugPokemon.add("Kakuna");
		bugPokemon.add("Beedrill");
		bugPokemon.add("Paras");
		bugPokemon.add("Parasect");
		bugPokemon.add("Venonat");
		bugPokemon.add("Venomoth");
		bugPokemon.add("Scyther");
		bugPokemon.add("Pinsir");
		bugPokemon.add("Ledyba");
		bugPokemon.add("Ledian");
		bugPokemon.add("Spinarak");
		bugPokemon.add("Ariados");
		bugPokemon.add("Yanma");
		bugPokemon.add("Pineco");
		bugPokemon.add("Forretress");
		bugPokemon.add("Scizor");
		bugPokemon.add("Shuckle");
		bugPokemon.add("Heracross");
		bugPokemon.add("Wurmple");
		bugPokemon.add("Silcoon");
		bugPokemon.add("Beautifly");
		bugPokemon.add("Cascoon");
		bugPokemon.add("Dustox");
		bugPokemon.add("Surskit");
		bugPokemon.add("Masquerain");
		bugPokemon.add("Nincada");
		bugPokemon.add("Ninjask");
		bugPokemon.add("Shedinja");
		bugPokemon.add("Volbeat");
		bugPokemon.add("Illumise");
		bugPokemon.add("Anorith");
		bugPokemon.add("Armaldo");
		bugPokemon.add("Kricketot");
		bugPokemon.add("Kricketune");
		bugPokemon.add("Burmy");
		bugPokemon.add("Wormadam");
		bugPokemon.add("Mothim");
		bugPokemon.add("Combee");
		bugPokemon.add("Vespiquen");
		bugPokemon.add("Skorupi");
		bugPokemon.add("Yanmega");
		bugPokemon.add("Sewaddle");
		bugPokemon.add("Swadloon");
		bugPokemon.add("Leavanny");
		bugPokemon.add("Venipede");
		bugPokemon.add("Whirlipede");
		bugPokemon.add("Scolipede");
		bugPokemon.add("Dwebble");
		bugPokemon.add("Crustle");
		bugPokemon.add("Karrablast");
		bugPokemon.add("Escavalier");
		bugPokemon.add("Joltik");
		bugPokemon.add("Galvantula");
		bugPokemon.add("Shelmet");
		bugPokemon.add("Accelgor");
		bugPokemon.add("Durant");
		bugPokemon.add("Larvesta");
		bugPokemon.add("Volcarona");
		bugPokemon.add("Genesect");




    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Genesect");
		}
		System.out.println();

		System.out.println("Are you so mellow and nonchalant to the point that people tend to use you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Paras");
		bugPokemon.remove("Parasect");
		}
		System.out.println();

		System.out.println("Do you easily share your feelings with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Ledyba");
		bugPokemon.remove("Ledian");
		}
		System.out.println();

		System.out.println("Do you have a companion of the opposite gender that you could NOT live without?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Volbeat");
		bugPokemon.remove("Illumise");
		}
		System.out.println();

		System.out.println("Have you ever used something of your neighbors without them knowing (i.e. their wireless internet)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Joltik");
		bugPokemon.remove("Galvantula");
		}
		System.out.println();

		System.out.println("Are you quite the music nerd?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Kricketot");
		bugPokemon.remove("Kricketune");
		}
		System.out.println();

		System.out.println("Are you naturally a caring and nurturing person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Sewaddle");
		bugPokemon.remove("Swadloon");
		bugPokemon.remove("Leavanny");
		}
		System.out.println();

		System.out.println("Are you normally impatient with people and prefer to be alone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Weedle");
		bugPokemon.remove("Kakuna");
		bugPokemon.remove("Beedrill");
		}
		System.out.println();

		System.out.println("Are you uneasy when traveling to or visiting new places?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Dwebble");
		bugPokemon.remove("Crustle");
		}
		System.out.println();

		System.out.println("Do you feel like you don't belong in your current time period?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Anorith");
		bugPokemon.remove("Armaldo");
		}
		System.out.println();

		System.out.println("Are you normally calm, but feel like you could explode under the pressure of your life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Pineco");
		bugPokemon.remove("Forretress");
		}
		System.out.println();

		System.out.println("Have you had experience in the culinary arts or brewing?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Shuckle");
		}
		System.out.println();

		System.out.println("Do you have the willpower to actually achieve your goals?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Caterpie");
		bugPokemon.remove("Metapod");
		bugPokemon.remove("Butterfree");
		}
		System.out.println();

		System.out.println("Is your quest in life to search for things beautiful and rare?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Venonat");
		bugPokemon.remove("Venomoth");
		}
		System.out.println();

		System.out.println("Do you tend to rely mainly on teamwork or parasiting off of others to solve issues?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Durant");
		}
		System.out.println();

		System.out.println("Does the amount of rainfall in the air affect your mood (rain makes you more happy or more sad)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Surskit");
		bugPokemon.remove("Masquerain");
		}
		System.out.println();

		System.out.println("Do you tend to leave your life up to chance?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Wurmple");
		bugPokemon.remove("Silcoon");
		bugPokemon.remove("Beautifly");
		bugPokemon.remove("Cascoon");
		bugPokemon.remove("Dustox");
		}
		System.out.println();

		System.out.println("Have you had experience with a martial art and could you win a fight with this art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Scyther");
		bugPokemon.remove("Scizor");
		}
		System.out.println();

		System.out.println("Would you prefer to live in a matrilineal society?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Combee");
		bugPokemon.remove("Vespiquen");
		}
		System.out.println();

		System.out.println("Are you the greatest source of light and confidence in someone else's life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Larvesta");
		bugPokemon.remove("Volcarona");
		}
		System.out.println();

		System.out.println("Do you have a secret weakness that most would find rather silly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Pinsir");
		}
		System.out.println();

		System.out.println("Can you tell when someone is lying or is withholding information?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Yanma");
		bugPokemon.remove("Yanmega");
		}
		System.out.println();

		System.out.println("Do you feel insecure when you cannot control the people around you or make them think like you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Spinarak");
		bugPokemon.remove("Ariados");
		}
		System.out.println();

		System.out.println("Are you a bodybuilder, football player, or in any other sport that requires immense amounts of physical strength?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Heracross");
		}
		System.out.println();

		System.out.println("Are you a pack rat that doesn't like to let go of anything?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Burmy");
		bugPokemon.remove("Wormadam");
		bugPokemon.remove("Mothim");
		}
		System.out.println();

		System.out.println("Do you hate waiting in line or driving behind slow people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Venipede");
		bugPokemon.remove("Scolipede");
		bugPokemon.remove("Whirlipede");
		}
		System.out.println();




		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Caterpie");
		bugPokemon.remove("Weedle");
		bugPokemon.remove("Paras");
		bugPokemon.remove("Venonat");
		bugPokemon.remove("Ledyba");
		bugPokemon.remove("Spinarak");
		bugPokemon.remove("Pineco");
		bugPokemon.remove("Wurmple");
		bugPokemon.remove("Surskit");
		bugPokemon.remove("Nincada");
		bugPokemon.remove("Anorith");
		bugPokemon.remove("Kricketot");
		bugPokemon.remove("Burmy");
		bugPokemon.remove("Skorupi");
		bugPokemon.remove("Sewaddle");
		bugPokemon.remove("Venipede");
		bugPokemon.remove("Dwebble");
		bugPokemon.remove("Karrablast");
		bugPokemon.remove("Joltik");
		bugPokemon.remove("Shelmet");
		bugPokemon.remove("Larvesta");}
		if(answer.equals("yes"))
		{bugPokemon.remove("Kakuna");
		bugPokemon.remove("Beedrill");
		bugPokemon.remove("Metapod");
		bugPokemon.remove("Butterfree");
		bugPokemon.remove("Parasect");
		bugPokemon.remove("Venomoth");
		bugPokemon.remove("Ledian");
		bugPokemon.remove("Ariados");
		bugPokemon.remove("Forretress");
		bugPokemon.remove("Scizor");
		bugPokemon.remove("Silcoon");
		bugPokemon.remove("Beautifly");
		bugPokemon.remove("Cascoon");
		bugPokemon.remove("Dustox");
		bugPokemon.remove("Masquerain");
		bugPokemon.remove("Ninjask");
		bugPokemon.remove("Shedinja");
		bugPokemon.remove("Armaldo");
		bugPokemon.remove("Kricketune");
		bugPokemon.remove("Wormadam");
		bugPokemon.remove("Vespiquen");
		bugPokemon.remove("Yanmega");
		bugPokemon.remove("Swadloon");
		bugPokemon.remove("Leavanny");
		bugPokemon.remove("Whirlipede");
		bugPokemon.remove("Scolipede");
		bugPokemon.remove("Crustle");
		bugPokemon.remove("Escavalier");
		bugPokemon.remove("Galvantula");
		bugPokemon.remove("Accelgor");
		bugPokemon.remove("Volcarona");}
		System.out.println();


		if(bugPokemon.contains("Dustox")||bugPokemon.contains("Beautifly"))
		{System.out.println("Do you often make selfish decisions as opposed to selfless decisions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Cascoon");
		bugPokemon.remove("Dustox");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Silcoon");
		bugPokemon.remove("Beautifly");
		}
		System.out.println();
		}
                
                if(bugPokemon.contains("Shelmet"))
                {System.out.println("Do you believe that security from unwanted circumstances is more important than freedom to do whatever you want?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Shelmet");
		}
		System.out.println();}
                
                if(bugPokemon.contains("Accelgor"))
                {System.out.println("Do you believe that freedom to do whatever you want is more important than security from unwanted circumstances?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Accelgor");
		}
		System.out.println();}
                
                if(bugPokemon.contains("Karrablast"))
                {System.out.println("Do you feel as if you must rely on the help of your friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Karrablast");
		}
		System.out.println();}
                
                if(bugPokemon.contains("Escavalier"))
                {System.out.println("Has the assistance of friends or people with power brought you to a point where you are strong and independent?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Escavalier");
		}
		System.out.println();}

		if(bugPokemon.contains("Nincada"))
		{System.out.println("Would you like to leave your current life behind?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Nincada");
		}
		System.out.println();}

		if(bugPokemon.contains("Ninjask"))
		{System.out.println("Have you left an old lifestyle or memory behind and feel good doing so?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Ninjask");
		bugPokemon.remove("Shedinja");
		}
		System.out.println();}

		if(bugPokemon.contains("Beedrill")||bugPokemon.contains("Butterfree")||bugPokemon.contains("Beautifly")||bugPokemon.contains("Dustox"))
		{System.out.println("Are you rather independent from the influence of the media or peer pressure?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Beedrill");
		bugPokemon.remove("Butterfree");
		bugPokemon.remove("Beautifly");
		bugPokemon.remove("Dustox");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Kakuna");
		bugPokemon.remove("Metapod");
		bugPokemon.remove("Silcoon");
		bugPokemon.remove("Cascoon");
		}
		System.out.println();}

		if(bugPokemon.contains("Scizor"))
		{System.out.println("Would you much rather take invincibility over invisibility?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Scizor");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Scyther");
		}
		System.out.println();
		}

		if(bugPokemon.contains("Yanmega"))
		{System.out.println("Are you more interested in what was popular in an older time than what is popular today, music for example?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Yanmega");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Yanma");
		}
		System.out.println();
		}

		if(bugPokemon.contains("Shedinja"))
		{System.out.println("Does your past haunt you often and you have yet to let it go?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Shedinja");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Ninjask");
		}
		System.out.println();
		}

		if(bugPokemon.contains("Volbeat")||bugPokemon.contains("Illumise")||bugPokemon.contains("Wormadam")||bugPokemon.contains("Mothim")||bugPokemon.contains("Vespiquen")||bugPokemon.contains("Combee"))
		{System.out.println("Are you a male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Volbeat");
                bugPokemon.remove("Mothim");
                bugPokemon.remove("Combee");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Illumise");
                bugPokemon.remove("Wormadam");
                bugPokemon.remove("Vespiquen");
		}
		System.out.println();
		}

		if(bugPokemon.contains("Leavanny"))
		{System.out.println("Do you make a good, nurturing parent?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Leavanny");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Sewaddle");
		}
		System.out.println();
		}

		if(bugPokemon.contains("Scolipede"))
		{System.out.println("Are you abnormally tall for a human being?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{bugPokemon.remove("Scolipede");
		}
		if(answer.equals("yes"))
		{bugPokemon.remove("Whirlipede");
		}
		System.out.println();
		}


		if(bugPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(bugPokemon.size()==1)
			out.println("You are" + bugPokemon.get(0));
		if(bugPokemon.size()>1)
		{String bugAura=new String("\n");
		if(bugPokemon.contains("Sewaddle")||bugPokemon.contains("Swadloon")||bugPokemon.contains("Leavanny"))
		{bugAura=bugAura + "Forest Green\n";}
		if(bugPokemon.contains("Weedle")||bugPokemon.contains("Kakuna")||bugPokemon.contains("Beedrill"))
		{bugAura=bugAura + "Bright Orange\n";}
		if(bugPokemon.contains("Caterpie")||bugPokemon.contains("Metapod")||bugPokemon.contains("Butterfree"))
		{bugAura=bugAura + "Mint Green\n";}
		if(bugPokemon.contains("Paras")||bugPokemon.contains("Parasect"))
		{bugAura=bugAura + "Psychedelic Purple\n";}
		if(bugPokemon.contains("Wurmple")||bugPokemon.contains("Silcoon")||bugPokemon.contains("Beautifly")||bugPokemon.contains("Cascoon")||bugPokemon.contains("Dustox"))
		{bugAura=bugAura + "White\n";}
		if(bugPokemon.contains("Genesect"))
		{bugAura=bugAura + "Gold\n";}
		if(bugPokemon.contains("Joltik")||bugPokemon.contains("Galvantula"))
		{bugAura=bugAura + "Yellow\n";}
		if(bugPokemon.contains("Surskit")||bugPokemon.contains("Masquerain"))
		{bugAura=bugAura + "Sky Blue\n";}
		if(bugPokemon.contains("Venonat")||bugPokemon.contains("Venomoth"))
		{bugAura=bugAura + "Fuchsia\n";}
		if(bugPokemon.contains("Scyther")||bugPokemon.contains("Scizor"))
		{bugAura=bugAura + "Bright Red\n";}
		if(bugPokemon.contains("Ledyba")||bugPokemon.contains("Ledian"))
		{bugAura=bugAura + "Auburn\n";}
		if(bugPokemon.contains("Spinarak")||bugPokemon.contains("Ariados"))
		{bugAura=bugAura + "Bright Green\n";}
		if(bugPokemon.contains("Pinsir"))
		{bugAura=bugAura + "Black\n";}
		if(bugPokemon.contains("Volbeat")||bugPokemon.contains("Illumise"))
		{bugAura=bugAura + "Rose\n";}
		if(bugPokemon.contains("Kricketot")||bugPokemon.contains("Kricketune"))
		{bugAura=bugAura + "Tomato\n";}
		if(bugPokemon.contains("Burmy")||bugPokemon.contains("Wormadam")||bugPokemon.contains("Mothim"))
		{bugAura=bugAura + "Charcoal\n";}
		if(bugPokemon.contains("Shelmet")||bugPokemon.contains("Accelgor"))
		{bugAura=bugAura + "Blue Gray\n";}
		if(bugPokemon.contains("Yanma")||bugPokemon.contains("Yanmega"))
		{bugAura=bugAura + "Dark Green\n";}
		if(bugPokemon.contains("Shuckle"))
		{bugAura=bugAura + "Beige\n";}
		if(bugPokemon.contains("Heracross"))
		{bugAura=bugAura + "Cocoa Brown\n";}
		if(bugPokemon.contains("Pineco")||bugPokemon.contains("Forretress"))
		{bugAura=bugAura + "Teal Blue\n";}
		if(bugPokemon.contains("Larvesta")||bugPokemon.contains("Volcarona"))
		{bugAura=bugAura + "Sunglow\n";}
		if(bugPokemon.contains("Combee")||bugPokemon.contains("Vespiquen"))
		{bugAura=bugAura + "Honey\n";}
		if(bugPokemon.contains("Nincada")||bugPokemon.contains("Ninjask")||bugPokemon.contains("Shedinja"))
		{bugAura=bugAura + "Amber\n";}
		if(bugPokemon.contains("Venipede")||bugPokemon.contains("Whirlipede")||bugPokemon.contains("Scolipede"))
		{bugAura=bugAura + "Crimson\n";}
		if(bugPokemon.contains("Durant"))
		{bugAura=bugAura + "Steel\n";}
		if(bugPokemon.contains("Dwebble")||bugPokemon.contains("Crustle"))
		{bugAura=bugAura + "Cobblestone\n";}
		if(bugPokemon.contains("Karrablast")||bugPokemon.contains("Escavalier"))
		{bugAura=bugAura + "Steel Blue\n";}
		if(bugPokemon.contains("Skorupi"))
		{bugAura=bugAura + "Indigo\n";}
		if(bugPokemon.contains("Anorith")||bugPokemon.contains("Armaldo"))
		{bugAura=bugAura + "Cerulean\n";}
		{System.out.println("Out of these colors:" +bugAura +"which one would describe you the most?");
		answer=pokescan.nextLine();
		
                if(answer.equals("Mint Green") && bugPokemon.contains("Caterpie"))
                    {System.out.println("You are Caterpie");}
                
                else if(answer.equals("Mint Green") && bugPokemon.contains("Metapod"))
                    {System.out.println("You are Metapod");}
                
                else if(answer.equals("Mint Green") && bugPokemon.contains("Butterfree"))
                    {System.out.println("You are Butterfree");}
                
                else if(answer.equals("Bright Orange") && bugPokemon.contains("Weedle"))
                    {System.out.println("You are Weedle");}
                
                else if(answer.equals("Bright Orange") && bugPokemon.contains("Kakuna"))
                    {System.out.println("You are Kakuna");}
                
                else if(answer.equals("Bright Orange") && bugPokemon.contains("Beedrill"))
                    {System.out.println("You are Beedrill");}
                
                else if(answer.equals("Psychedelic Purple") && bugPokemon.contains("Paras"))
                    {System.out.println("You are Paras");}
                
                else if(answer.equals("Psychedelic Purple") && bugPokemon.contains("Parasect"))
                    {System.out.println("You are Parasect");}
                
                else if(answer.equals("Fuchsia") && bugPokemon.contains("Venonat"))
                    {System.out.println("You are Venonat");}
                
                else if(answer.equals("Fuchsia") && bugPokemon.contains("Venomoth"))
                    {System.out.println("You are Venomoth");}
                
                else if(answer.equals("Bright Red") && bugPokemon.contains("Scyther"))
                    {System.out.println("You are Scyther");}
                
                else if(answer.equals("Black") && bugPokemon.contains("Pinsir"))
                    {System.out.println("You are Pinsir");}
                
                else if(answer.equals("Auburn") && bugPokemon.contains("Ledyba"))
                    {System.out.println("You are Ledyba");}
                
                else if(answer.equals("Auburn") && bugPokemon.contains("Ledian"))
                    {System.out.println("You are Ledian");}
                
                else if(answer.equals("Bright Green") && bugPokemon.contains("Spinarak"))
                    {System.out.println("You are Spinarak");}
                
                else if(answer.equals("Bright Green") && bugPokemon.contains("Ariados"))
                    {System.out.println("You are Ariados");}
                
                else if(answer.equals("Dark Green") && bugPokemon.contains("Yanma"))
                    {System.out.println("You are Yanma");}
                
                else if(answer.equals("Teal Blue") && bugPokemon.contains("Pineco"))
                    {System.out.println("You are Pineco");}
                
                else if(answer.equals("Teal Blue") && bugPokemon.contains("Forretress"))
                    {System.out.println("You are Forretress");}
                
                else if(answer.equals("Bright Red") && bugPokemon.contains("Scizor"))
                    {System.out.println("You are Scizor");}
                
                else if(answer.equals("Beige") && bugPokemon.contains("Shuckle"))
                    {System.out.println("You are Shuckle");}
                
                else if(answer.equals("Cocoa Brown") && bugPokemon.contains("Heracross"))
                    {System.out.println("You are Heracross");}
                
                else if(answer.equals("White") && bugPokemon.contains("Wurmple"))
                    {System.out.println("You are Wurmple");}
                
                else if(answer.equals("White") && bugPokemon.contains("Silcoon"))
                    {System.out.println("You are Silcoon");}
                
                else if(answer.equals("White") && bugPokemon.contains("Beautifly"))
                    {System.out.println("You are Beautifly");}
                
                else if(answer.equals("White") && bugPokemon.contains("Cascoon"))
                    {System.out.println("You are Cascoon");}
                
                else if(answer.equals("White") && bugPokemon.contains("Dustox"))
                    {System.out.println("You are Dustox");}
                
                else if(answer.equals("Sky Blue") && bugPokemon.contains("Surskit"))
                    {System.out.println("You are Surskit");}
                
                else if(answer.equals("Sky Blue") && bugPokemon.contains("Masquerain"))
                    {System.out.println("You are Masquerain");}
                
                else if(answer.equals("Amber") && bugPokemon.contains("Nincada"))
                    {System.out.println("You are Nincada");}
                
                else if(answer.equals("Amber") && bugPokemon.contains("Ninjask"))
                    {System.out.println("You are Ninjask");}
                
                else if(answer.equals("Amber") && bugPokemon.contains("Shedinja"))
                    {System.out.println("You are Shedinja");}
                
                else if(answer.equals("Rose") && bugPokemon.contains("Volbeat"))
                    {System.out.println("You are Volbeat");}
                
                else if(answer.equals("Rose") && bugPokemon.contains("Illumise"))
                    {System.out.println("You are Illumise");}
                
                else if(answer.equals("Cerulean") && bugPokemon.contains("Anorith"))
                    {System.out.println("You are Anorith");}
                
                else if(answer.equals("Cerulean") && bugPokemon.contains("Armaldo"))
                    {System.out.println("You are Armaldo");}
                
                else if(answer.equals("Tomato") && bugPokemon.contains("Kricketot"))
                    {System.out.println("You are Kricketot");}
                
                else if(answer.equals("Tomato") && bugPokemon.contains("Kricketune"))
                    {System.out.println("You are Kricketune");}
                
                else if(answer.equals("Charcoal") && bugPokemon.contains("Burmy"))
                    {System.out.println("You are Burmy");}
                
                else if(answer.equals("Charcoal") && bugPokemon.contains("Wormadam"))
                    {System.out.println("You are Wormadam");}
                
                else if(answer.equals("Charcoal") && bugPokemon.contains("Mothim"))
                    {System.out.println("You are Mothim");}
                
                else if(answer.equals("Honey") && bugPokemon.contains("Combee"))
                    {System.out.println("You are Combee");}
                
                else if(answer.equals("Honey") && bugPokemon.contains("Vespiquen"))
                    {System.out.println("You are Vespiquen");}
                
                else if(answer.equals("Indigo") && bugPokemon.contains("Skorupi"))
                    {System.out.println("You are Skorupi");}
                
                else if(answer.equals("Dark Green") && bugPokemon.contains("Yanmega"))
                    {System.out.println("You are Yanmega");}
                
                else if(answer.equals("Forest Green") && bugPokemon.contains("Sewaddle"))
                    {System.out.println("You are Sewaddle");}
                
                else if(answer.equals("Forest Green") && bugPokemon.contains("Swadloon"))
                    {System.out.println("You are Swadloon");}
                
                else if(answer.equals("Forest Green") && bugPokemon.contains("Leavanny"))
                    {System.out.println("You are Leavanny");}
                
                else if(answer.equals("Crimson") && bugPokemon.contains("Venipede"))
                    {System.out.println("You are Venipede");}
                
                else if(answer.equals("Crimson") && bugPokemon.contains("Whirlipede"))
                    {System.out.println("You are Whirlipede");}
                
                else if(answer.equals("Crimson") && bugPokemon.contains("Scolipede"))
                    {System.out.println("You are Scolipede");}
                
                else if(answer.equals("Cobblestone") && bugPokemon.contains("Dwebble"))
                    {System.out.println("You are Dwebble");}
                
                else if(answer.equals("Cobblestone") && bugPokemon.contains("Crustle"))
                    {System.out.println("You are Scyther");}
                
                else if(answer.equals("Steel Blue") && bugPokemon.contains("Karrablast"))
                    {System.out.println("You are Karrablast");}
                
                else if(answer.equals("Steel Blue") && bugPokemon.contains("Escavalier"))
                    {System.out.println("You are Escavalier");}
                
                else if(answer.equals("Blue Gray") && bugPokemon.contains("Shelmet"))
                    {System.out.println("You are Shelmet");}
                
                else if(answer.equals("Blue Gray") && bugPokemon.contains("Accelgor"))
                    {System.out.println("You are Accelgor");}
                
                else if(answer.equals("Steel") && bugPokemon.contains("Durant"))
                    {System.out.println("You are Durant");}
                
                else if(answer.equals("Sunglow") && bugPokemon.contains("Larvesta"))
                    {System.out.println("You are Larvesta");}
                
                else if(answer.equals("Sunglow") && bugPokemon.contains("Volcarona"))
                    {System.out.println("You are Volcarona");}
                
                else if(answer.equals("Gold") && bugPokemon.contains("Genesect"))
                    {System.out.println("You are Genesect");}
                
                else
                    {System.out.println("There was an error. You are Missingno");}}
    }
}}
