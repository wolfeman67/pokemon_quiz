import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class PoisonTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> poisonPokemon= new ArrayList<String>();
		poisonPokemon.add("Bulbasaur");
		poisonPokemon.add("Ivysaur");
		poisonPokemon.add("Venusaur");
		poisonPokemon.add("Weedle");
		poisonPokemon.add("Kakuna");
		poisonPokemon.add("Beedrill");
		poisonPokemon.add("Ekans");
		poisonPokemon.add("Arbok");
		poisonPokemon.add("Nidoran(female)");
		poisonPokemon.add("Nidorina");
		poisonPokemon.add("Nidoqueen");
		poisonPokemon.add("Nidoran(male)");
		poisonPokemon.add("Nidorino");
		poisonPokemon.add("Nidoking");
		poisonPokemon.add("Zubat");
		poisonPokemon.add("Golbat");
		poisonPokemon.add("Oddish");
		poisonPokemon.add("Gloom");
		poisonPokemon.add("Vileplume");
		poisonPokemon.add("Venonat");
		poisonPokemon.add("Venomoth");
		poisonPokemon.add("Bellsprout");
		poisonPokemon.add("Weepinbell");
		poisonPokemon.add("Victreebel");
		poisonPokemon.add("Tentacool");
		poisonPokemon.add("Tentacruel");
		poisonPokemon.add("Grimer");
		poisonPokemon.add("Muk");
		poisonPokemon.add("Gastly");
		poisonPokemon.add("Haunter");
		poisonPokemon.add("Gengar");
		poisonPokemon.add("Koffing");
		poisonPokemon.add("Weezing");
		poisonPokemon.add("Spinarak");
		poisonPokemon.add("Ariados");
		poisonPokemon.add("Crobat");
		poisonPokemon.add("Qwilfish");
		poisonPokemon.add("Dustox");
		poisonPokemon.add("Roselia");
		poisonPokemon.add("Gulpin");
		poisonPokemon.add("Swalot");
		poisonPokemon.add("Seviper");
		poisonPokemon.add("Budew");
		poisonPokemon.add("Roserade");
		poisonPokemon.add("Stunky");
		poisonPokemon.add("Skuntank");
		poisonPokemon.add("Skorupi");
		poisonPokemon.add("Drapion");
		poisonPokemon.add("Croagunk");
		poisonPokemon.add("Toxicroak");
		poisonPokemon.add("Venipede");
		poisonPokemon.add("Whirlipede");
		poisonPokemon.add("Scolipede");
		poisonPokemon.add("Trubbish");
		poisonPokemon.add("Garbodor");
		poisonPokemon.add("Foongus");
		poisonPokemon.add("Amoonguss");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Do you not like to be touched by people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Nidoran(female)");
		poisonPokemon.remove("Nidorina");
		poisonPokemon.remove("Nidoqueen");
		poisonPokemon.remove("Nidoran(male)");
		poisonPokemon.remove("Nidorino");
		poisonPokemon.remove("Nidoking");
		}
		System.out.println();
                
                if(poisonPokemon.contains("Nidoking"))
		{System.out.println("Are you a male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Nidoran(male)");
                poisonPokemon.remove("Nidorino");
                poisonPokemon.remove("Nidoking");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Nidoran(female)");
                poisonPokemon.remove("Nidorina");
                poisonPokemon.remove("Nidoqueen");
		}
		System.out.println();}

		System.out.println("Do you or members of your family regularly smoke?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Koffing");
		poisonPokemon.remove("Weezing");
		}
		System.out.println();

		System.out.println("Do you generally not like to be the center of attention?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Gastly");
		poisonPokemon.remove("Haunter");
		poisonPokemon.remove("Gengar");
		}
		System.out.println();

		System.out.println("Are you the kind of person that has a limited group of friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Oddish");
		poisonPokemon.remove("Gloom");
		poisonPokemon.remove("Vileplume");
		}
		System.out.println();

		System.out.println("Do you usually smell bad?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Stunky");
		poisonPokemon.remove("Skuntank");
		}
		System.out.println();

		System.out.println("Do you take pride in your strengths and refuse to acknowledge your weaknesses?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Skorupi");
		poisonPokemon.remove("Drapion");
		}
		System.out.println();

		System.out.println("Are you a bully that likes to intimidate people into submission?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Ekans");
		poisonPokemon.remove("Arbok");
		}
		System.out.println();

		System.out.println("Does your appetite make you a bottomless pit?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Gulpin");
		poisonPokemon.remove("Swalot");
		}
		System.out.println();

		System.out.println("Do you hate waiting in line or going behind slow people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Venipede");
		poisonPokemon.remove("Whirlipede");
		poisonPokemon.remove("Scolipede");
		}
		System.out.println();

		System.out.println("Do you value your relationships with people more than your personal gain?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Bulbasaur");
		poisonPokemon.remove("Ivysaur");
		poisonPokemon.remove("Venusaur");
		}
		System.out.println();

		System.out.println("Do you have the tendency to use people without actually treating them as friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Zubat");
		poisonPokemon.remove("Golbat");
		poisonPokemon.remove("Crobat");
		}
		System.out.println();

		System.out.println("Do you tend to be vengeful when someone has hurt or insulted you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Weedle");
		poisonPokemon.remove("Kakuna");
		poisonPokemon.remove("Beedrill");
		}
		System.out.println();

		System.out.println("Is your goal in life to see things beautiful and rare?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Venonat");
		poisonPokemon.remove("Venomoth");
		}
		System.out.println();

		System.out.println("Are you flexible with people, situations, or life in general?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Bellsprout");
		poisonPokemon.remove("Weepinbell");
		poisonPokemon.remove("Victreebel");
		}
		System.out.println();

		System.out.println("Do you have no pursuits, goals, or far future plans in mind other than what you have to do?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Tentacool");
		poisonPokemon.remove("Tentacruel");
		}
		System.out.println();

		System.out.println("Do you tend to follow people that most would consider bad influences?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Grimer");
		poisonPokemon.remove("Muk");
		}
		System.out.println();

		System.out.println("Can you be rather violent when under pressure?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Qwilfish");
		}
		System.out.println();

		System.out.println("Have you ever pretended you were something you were not to garner attention or prestige?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Foongus");
		poisonPokemon.remove("Amoonguss");
		}
		System.out.println();

		System.out.println("Is your room often a disgusting mess with food and clothing strewn everywhere?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Trubbish");
		poisonPokemon.remove("Garbodor");
		}
		System.out.println();

		System.out.println("Do you like acting weird just to freak people out and keep them guessing?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Croagunk");
		poisonPokemon.remove("Toxicroak");
		}
		System.out.println();

		System.out.println("Do you have the ability to calm people, despite being insecure yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Budew");
		poisonPokemon.remove("Roselia");
		poisonPokemon.remove("Roserade");
		}
		System.out.println();

		System.out.println("Do you have a enemy that has affected most of your life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Seviper");
		}
		System.out.println();

		System.out.println("Did/do you enjoy climbing trees or mountains?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Spinarak");
		poisonPokemon.remove("Ariados");
		}
		System.out.println();



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Bulbasaur");
		poisonPokemon.remove("Weedle");
		poisonPokemon.remove("Ekans");
		poisonPokemon.remove("Nidoran(female)");
		poisonPokemon.remove("Nidoran(male)");
		poisonPokemon.remove("Zubat");
		poisonPokemon.remove("Oddish");
		poisonPokemon.remove("Venonat");
		poisonPokemon.remove("Bellsprout");
		poisonPokemon.remove("Tentacool");
		poisonPokemon.remove("Grimer");
		poisonPokemon.remove("Gastly");
		poisonPokemon.remove("Koffing");
		poisonPokemon.remove("Spinarak");
		poisonPokemon.remove("Gulpin");
		poisonPokemon.remove("Budew");
		poisonPokemon.remove("Stunky");
		poisonPokemon.remove("Skorupi");
		poisonPokemon.remove("Croagunk");
		poisonPokemon.remove("Venipede");
		poisonPokemon.remove("Trubbish");
		poisonPokemon.remove("Foongus");}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Ivysaur");
		poisonPokemon.remove("Venusaur");
		poisonPokemon.remove("Kakuna");
		poisonPokemon.remove("Beedrill");
		poisonPokemon.remove("Arbok");
		poisonPokemon.remove("Nidorina");
		poisonPokemon.remove("Nidoqueen");
		poisonPokemon.remove("Nidorino");
		poisonPokemon.remove("Nidoking");
		poisonPokemon.remove("Golbat");
		poisonPokemon.remove("Gloom");
		poisonPokemon.remove("Vileplume");
		poisonPokemon.remove("Venomoth");
		poisonPokemon.remove("Weepinbell");
		poisonPokemon.remove("Victreebel");
		poisonPokemon.remove("Tentacruel");
		poisonPokemon.remove("Muk");
		poisonPokemon.remove("Haunter");
		poisonPokemon.remove("Gengar");
		poisonPokemon.remove("Weezing");
		poisonPokemon.remove("Ariados");
		poisonPokemon.remove("Crobat");
		poisonPokemon.remove("Dustox");
		poisonPokemon.remove("Roselia");
		poisonPokemon.remove("Swalot");
		poisonPokemon.remove("Roserade");
		poisonPokemon.remove("Skuntank");
		poisonPokemon.remove("Drapion");
		poisonPokemon.remove("Toxicroak");
		poisonPokemon.remove("Whirlipede");
		poisonPokemon.remove("Scolipede");
		poisonPokemon.remove("Garbador");
		poisonPokemon.remove("Amoonguss");}
                System.out.println();

		if(poisonPokemon.contains("Nidoking"))
		{System.out.println("Would people describe you as a sexual, alpha male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Nidoking");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Nidorino");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Nidoqueen"))
		{System.out.println("Are you, or would you be, an overprotective mother?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Nidoqueen");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Nidorina");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Crobat"))
		{System.out.println("Are you graceful, suave, or have the ability to keep your cool in stressful times?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Crobat");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Golbat");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Venusaur"))
		{System.out.println("Are you a rather likable and friendly person who is also overweight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Venusaur");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Ivysaur");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Beedrill"))
		{System.out.println("Has a previous experience made you a less trusting person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Beedrill");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Kakuna");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Victreebel"))
		{System.out.println("Are you cautious with revealing your personal life to people, even friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Victreebel");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Weepinbell");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Gengar"))
		{System.out.println("Can you imitate many voices of famous people or different gestures rather excellently?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Gengar");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Haunter");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Roserade"))
		{System.out.println("Would people describe your speech or mannerisms as elegant or refined?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Roserade");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Roselia");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Dustox"))
		{System.out.println("Are you attracted more to the hustle and bustle and grandeur of large cities than rural settings?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Dustox");
		}
		System.out.println();}
                
                if(poisonPokemon.contains("Scolipede"))
		{System.out.println("Are you abnormally tall for a human being?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{poisonPokemon.remove("Scolipede");
		}
		if(answer.equals("yes"))
		{poisonPokemon.remove("Whirlipede");
		}
		System.out.println();}
                
                


		if(poisonPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(poisonPokemon.size()==1)
			out.println("You are " + poisonPokemon.get(0));
		if(poisonPokemon.size()>1)
		{String poisonAura=new String("\n");
		if(poisonPokemon.contains("Budew")||poisonPokemon.contains("Roselia")||poisonPokemon.contains("Roserade"))
		{poisonAura=poisonAura + "Mint\n";}
                if(poisonPokemon.contains("Gastly")||poisonPokemon.contains("Haunter")||poisonPokemon.contains("Gengar"))
		{poisonAura=poisonAura + "Licorice\n";}
                if(poisonPokemon.contains("Weedle")||poisonPokemon.contains("Kakuna")||poisonPokemon.contains("Beedrill"))
		{poisonAura=poisonAura + "Orange\n";}
                if(poisonPokemon.contains("Nidoran(female)")||poisonPokemon.contains("Nidorina")||poisonPokemon.contains("Nidoqueen"))
		{poisonAura=poisonAura + "Amethyst\n";}
                if(poisonPokemon.contains("Nidoran(male)")||poisonPokemon.contains("Nidorino")||poisonPokemon.contains("Nidoking"))
                {poisonAura=poisonAura + "Onyx\n";}
                if(poisonPokemon.contains("Seviper"))
		{poisonAura=poisonAura + "Black\n";}
                if(poisonPokemon.contains("Gulpin")||poisonPokemon.contains("Swalot"))
		{poisonAura=poisonAura + "Eggplant\n";}
                if(poisonPokemon.contains("Koffing")||poisonPokemon.contains("Weezing"))
		{poisonAura=poisonAura + "Grape\n";}
                if(poisonPokemon.contains("Grimer")||poisonPokemon.contains("Muk"))
		{poisonAura=poisonAura + "Ube\n";}
                if(poisonPokemon.contains("Stunky")||poisonPokemon.contains("Skuntank"))
		{poisonAura=poisonAura + "Plum\n";}
                if(poisonPokemon.contains("Spinarak")||poisonPokemon.contains("Ariados"))
		{poisonAura=poisonAura + "Pistachio\n";}
                if(poisonPokemon.contains("Croagunk")||poisonPokemon.contains("Toxicroak"))
		{poisonAura=poisonAura + "Blue Gray\n";}
                if(poisonPokemon.contains("Venipede")||poisonPokemon.contains("Whirlipede")||poisonPokemon.contains("Scolipede"))
		{poisonAura=poisonAura + "Crimson\n";}
                if(poisonPokemon.contains("Tentacool")||poisonPokemon.contains("Tentacruel"))
		{poisonAura=poisonAura + "Ruby Red\n";}
                if(poisonPokemon.contains("Trubbish")||poisonPokemon.contains("Garbodor"))
		{poisonAura=poisonAura + "Liver\n";}
                if(poisonPokemon.contains("Dustox"))
		{poisonAura=poisonAura + "Corn\n";}
                if(poisonPokemon.contains("Bellsprout")||poisonPokemon.contains("Weepinbell")||poisonPokemon.contains("Victreebel"))
		{poisonAura=poisonAura + "Jungle Green\n";}
                if(poisonPokemon.contains("Bulbasaur")||poisonPokemon.contains("Ivysaur")||poisonPokemon.contains("Venusaur"))
		{poisonAura=poisonAura + "Teal Green\n";}
                if(poisonPokemon.contains("Oddish")||poisonPokemon.contains("Gloom")||poisonPokemon.contains("Vileplume"))
		{poisonAura=poisonAura + "Orchid\n";}
                if(poisonPokemon.contains("Foongus")||poisonPokemon.contains("Amoonguss"))
		{poisonAura=poisonAura + "Cream\n";}
                if(poisonPokemon.contains("Qwilfish"))
		{poisonAura=poisonAura + "Cyan\n";}
                if(poisonPokemon.contains("Venonat")||poisonPokemon.contains("Venomoth"))
		{poisonAura=poisonAura + "Fuchsia\n";}
                if(poisonPokemon.contains("Zubat")||poisonPokemon.contains("Golbat")||poisonPokemon.contains("Crobat"))
		{poisonAura=poisonAura + "Dark Purple\n";}
                if(poisonPokemon.contains("Skorupi")||poisonPokemon.contains("Drapion"))
		{poisonAura=poisonAura + "Fandango\n";}
                if(poisonPokemon.contains("Ekans")||poisonPokemon.contains("Arbok"))
                {poisonAura=poisonAura+"Lemon\n";}
                {System.out.println("Out of these colors:" +poisonAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Teal Green")&&poisonPokemon.contains("Bulbasaur"))
                {System.out.println("You are Bulbasaur");}
                
                else if(answer.equals("Teal Green")&&poisonPokemon.contains("Ivysaur"))
                {System.out.println("You are Ivysaur");}
                
                else if(answer.equals("Teal Green")&&poisonPokemon.contains("Venusaur"))
                {System.out.println("You are Venusaur");}
                
                else if(answer.equals("Orange")&&poisonPokemon.contains("Weedle"))
                {System.out.println("You are Weedle");}
                
                else if(answer.equals("Orange")&&poisonPokemon.contains("Kakuna"))
                {System.out.println("You are Kakuna");}
                
                else if(answer.equals("Orange")&&poisonPokemon.contains("Beedrill"))
                {System.out.println("You are Beedrill");}
                
                else if(answer.equals("Lemon")&&poisonPokemon.contains("Ekans"))
                {System.out.println("You are Ekans");}
                
                else if(answer.equals("Lemon")&&poisonPokemon.contains("Arbok"))
                {System.out.println("You are Arbok");}
                
                else if(answer.equals("Amethyst")&&poisonPokemon.contains("Nidoran(female)"))
                {System.out.println("You are Nidoran(female)");}
                
                else if(answer.equals("Amethyst")&&poisonPokemon.contains("Nidorina"))
                {System.out.println("You are Nidorina");}
                
                else if(answer.equals("Amethyst")&&poisonPokemon.contains("Nidoqueen"))
                {System.out.println("You are Nidoqueen");}
                
                else if(answer.equals("Onyx")&&poisonPokemon.contains("Nidoran(male)"))
                {System.out.println("You are Nidoran(male)");}
                
                else if(answer.equals("Onyx")&&poisonPokemon.contains("Nidorino"))
                {System.out.println("You are Nidorino");}
                
                else if(answer.equals("Onyx")&&poisonPokemon.contains("Nidoking"))
                {System.out.println("You are Nidoking");}
                
                else if(answer.equals("Dark Purple")&&poisonPokemon.contains("Zubat"))
                {System.out.println("You are Zubat");}
                
                else if(answer.equals("Dark Purple")&&poisonPokemon.contains("Golbat"))
                {System.out.println("You are Golbat");}
                
                else if(answer.equals("Orchid")&&poisonPokemon.contains("Oddish"))
                {System.out.println("You are Oddish");}
                
                else if(answer.equals("Orchid")&&poisonPokemon.contains("Gloom"))
                {System.out.println("You are Gloom");}
                
                else if(answer.equals("Orchid")&&poisonPokemon.contains("Vileplume"))
                {System.out.println("You are Vileplume");}
                
                else if(answer.equals("Fuchsia")&&poisonPokemon.contains("Venonat"))
                {System.out.println("You are Venonat");}
                
                else if(answer.equals("Fuchsia")&&poisonPokemon.contains("Venomoth"))
                {System.out.println("You are Venomoth");}
                
                else if(answer.equals("Jungle Green")&&poisonPokemon.contains("Bellsprout"))
                {System.out.println("You are Bellsprout");}
                
                else if(answer.equals("Jungle Green")&&poisonPokemon.contains("Weepinbell"))
                {System.out.println("You are Weepinbell");}
                
                else if(answer.equals("Jungle Green")&&poisonPokemon.contains("Victreebel"))
                {System.out.println("You are Victreebel");}
                
                else if(answer.equals("Ruby Red")&&poisonPokemon.contains("Tentacool"))
                {System.out.println("You are Tentacool");}
                
                else if(answer.equals("Ruby Red")&&poisonPokemon.contains("Tentacruel"))
                {System.out.println("You are Tentacruel");}
                
                else if(answer.equals("Ube")&&poisonPokemon.contains("Grimer"))
                {System.out.println("You are Grimer");}
                
                else if(answer.equals("Ube")&&poisonPokemon.contains("Muk"))
                {System.out.println("You are Muk");}
                
                else if(answer.equals("Licorice")&&poisonPokemon.contains("Gastly"))
                {System.out.println("You are Gastly");}
                
                else if(answer.equals("Licorice")&&poisonPokemon.contains("Haunter"))
                {System.out.println("You are Haunter");}
                
                else if(answer.equals("Licorice")&&poisonPokemon.contains("Gengar"))
                {System.out.println("You are Gengar");}
                
                else if(answer.equals("Grape")&&poisonPokemon.contains("Koffing"))
                {System.out.println("You are Koffing");}
                
                else if(answer.equals("Grape")&&poisonPokemon.contains("Weezing"))
                {System.out.println("You are Weezing");}
                
                else if(answer.equals("Pistachio")&&poisonPokemon.contains("Spinarak"))
                {System.out.println("You are Spinarak");}
                
                else if(answer.equals("Pistachio")&&poisonPokemon.contains("Ariados"))
                {System.out.println("You are Ariados");}
                
                else if(answer.equals("Dark Purple")&&poisonPokemon.contains("Crobat"))
                {System.out.println("You are Crobat");}
                
                else if(answer.equals("Cyan")&&poisonPokemon.contains("Qwilfish"))
                {System.out.println("You are Qwilfish");}
                
                else if(answer.equals("Corn")&&poisonPokemon.contains("Dustox"))
                {System.out.println("You are Dustox");}
                
                else if(answer.equals("Mint")&&poisonPokemon.contains("Roselia"))
                {System.out.println("You are Roselia");}
                
                else if(answer.equals("Eggplant")&&poisonPokemon.contains("Gulpin"))
                {System.out.println("You are Gulpin");}
                
                else if(answer.equals("Eggplant")&&poisonPokemon.contains("Swalot"))
                {System.out.println("You are Swalot");}
                
                else if(answer.equals("Black")&&poisonPokemon.contains("Seviper"))
                {System.out.println("You are Seviper");}
                
                else if(answer.equals("Mint")&&poisonPokemon.contains("Budew"))
                {System.out.println("You are Budew");}
                
                else if(answer.equals("Mint")&&poisonPokemon.contains("Roserade"))
                {System.out.println("You are Roserade");}
                
                else if(answer.equals("Plum")&&poisonPokemon.contains("Stunky"))
                {System.out.println("You are Stunky");}
                
                else if(answer.equals("Plum")&&poisonPokemon.contains("Skuntank"))
                {System.out.println("You are Skuntank");}
                
                else if(answer.equals("Fandango")&&poisonPokemon.contains("Skorupi"))
                {System.out.println("You are Skorupi");}
                
                else if(answer.equals("Fandango")&&poisonPokemon.contains("Drapion"))
                {System.out.println("You are Drapion");}
                
                else if(answer.equals("Blue Gray")&&poisonPokemon.contains("Croagunk"))
                {System.out.println("You are Croagunk");}
                
                else if(answer.equals("Blue Gray")&&poisonPokemon.contains("Toxicroak"))
                {System.out.println("You are Toxicroak");}
                
                else if(answer.equals("Crimson")&&poisonPokemon.contains("Venipede"))
                {System.out.println("You are Venipede");}
                
                else if(answer.equals("Crimson")&&poisonPokemon.contains("Whirlipede"))
                {System.out.println("You are Whirlipede");}
                
                else if(answer.equals("Crimson")&&poisonPokemon.contains("Scolipede"))
                {System.out.println("You are Scolipede");}
                
                else if(answer.equals("Liver")&&poisonPokemon.contains("Trubbish"))
                {System.out.println("You are Trubbish");}
                
                else if(answer.equals("Liver")&&poisonPokemon.contains("Garbodor"))
                {System.out.println("You are Garbodor");}
                
                else if(answer.equals("Cream")&&poisonPokemon.contains("Foongus"))
                {System.out.println("You are Foongus");}
                
                else if(answer.equals("Cream")&&poisonPokemon.contains("Amoonguss"))
                {System.out.println("You are Amoonguss");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
                
                
		
    }
}}}
