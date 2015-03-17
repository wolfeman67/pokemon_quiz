import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class GrassTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> grassPokemon= new ArrayList<String>();
    	grassPokemon.add("Bulbasaur");
    	grassPokemon.add("Ivysaur");
    	grassPokemon.add("Venusaur");
    	grassPokemon.add("Oddish");
    	grassPokemon.add("Gloom");
    	grassPokemon.add("Vileplume");
    	grassPokemon.add("Paras");
    	grassPokemon.add("Parasect");
    	grassPokemon.add("Bellsprout");
    	grassPokemon.add("Weepinbell");
    	grassPokemon.add("Victreebel");
    	grassPokemon.add("Exeggcute");
    	grassPokemon.add("Exeggutor");
    	grassPokemon.add("Tangela");
    	grassPokemon.add("Chikorita");
    	grassPokemon.add("Bayleef");
    	grassPokemon.add("Meganium");
    	grassPokemon.add("Bellossom");
    	grassPokemon.add("Hoppip");
    	grassPokemon.add("Skiploom");
    	grassPokemon.add("Jumpluff");
    	grassPokemon.add("Sunkern");
    	grassPokemon.add("Sunflora");
    	grassPokemon.add("Celebi");
    	grassPokemon.add("Treecko");
    	grassPokemon.add("Grovyle");
    	grassPokemon.add("Sceptile");
    	grassPokemon.add("Lotad");
    	grassPokemon.add("Lombre");
    	grassPokemon.add("Ludicolo");
    	grassPokemon.add("Seedot");
    	grassPokemon.add("Nuzleaf");
    	grassPokemon.add("Shiftry");
    	grassPokemon.add("Shroomish");
    	grassPokemon.add("Breloom");
    	grassPokemon.add("Roselia");
    	grassPokemon.add("Cacnea");
    	grassPokemon.add("Cacturne");
    	grassPokemon.add("Lileep");
    	grassPokemon.add("Cradily");
    	grassPokemon.add("Tropius");
    	grassPokemon.add("Turtwig");
    	grassPokemon.add("Grotle");
    	grassPokemon.add("Torterra");
    	grassPokemon.add("Budew");
    	grassPokemon.add("Roserade");
    	grassPokemon.add("Cherubi");
    	grassPokemon.add("Cherrim");
    	grassPokemon.add("Carnivine");
    	grassPokemon.add("Snover");
    	grassPokemon.add("Abomasnow");
    	grassPokemon.add("Tangrowth");
    	grassPokemon.add("Leafeon");
    	grassPokemon.add("Shaymin");
    	grassPokemon.add("Snivy");
    	grassPokemon.add("Servine");
    	grassPokemon.add("Serperior");
    	grassPokemon.add("Pansage");
    	grassPokemon.add("Simisage");
    	grassPokemon.add("Sewaddle");
    	grassPokemon.add("Swadloon");
    	grassPokemon.add("Leavanny");
    	grassPokemon.add("Cottonee");
    	grassPokemon.add("Whimsicott");
    	grassPokemon.add("Petilil");
    	grassPokemon.add("Lilligant");
    	grassPokemon.add("Maractus");
    	grassPokemon.add("Deerling");
    	grassPokemon.add("Sawsbuck");
    	grassPokemon.add("Foongus");
    	grassPokemon.add("Amoonguss");
    	grassPokemon.add("Ferroseed");
    	grassPokemon.add("Ferrothorn");
    	grassPokemon.add("Virizion");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Celebi");
		grassPokemon.remove("Shaymin");
		grassPokemon.remove("Virizion");
		}
		System.out.println();

		System.out.println("Are you a female who is a bit too self-conscious of your physical appearance?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Petilil");
		grassPokemon.remove("Lilligant");
		}
		System.out.println();

		System.out.println("Are you more active during the nightime hours?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Oddish");
		grassPokemon.remove("Gloom");
		grassPokemon.remove("Vileplume");
		}
		System.out.println();

		System.out.println("Is your schedule rather flexible and changable?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Bellsprout");
		grassPokemon.remove("Weepinbell");
		grassPokemon.remove("Victreebel");
		}
		System.out.println();

		System.out.println("Have you ever been under the influence of drugs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Paras");
		grassPokemon.remove("Parasect");
		}
		System.out.println();



		System.out.println("Do you feel as if you have multiple personalities?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Exeggcute");
		grassPokemon.remove("Exeggutor");
		}
		System.out.println();

		System.out.println("Do you have hair that is rather long for your gender?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Tangela");
		grassPokemon.remove("Tangrowth");
		}
		System.out.println();

		System.out.println("Do you have the ability to calm angry people and make them happy again?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Chikorita");
		grassPokemon.remove("Bayleef");
		grassPokemon.remove("Meganium");
		}
		System.out.println();

		System.out.println("Are you highly energetic and cannot sit still in one place for long?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Hoppip");
		grassPokemon.remove("Skiploom");
		grassPokemon.remove("Jumpluff");
		}
		System.out.println();

		System.out.println("Are you a morning person who enjoys exercising early in the day?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Sunkern");
		grassPokemon.remove("Sunflora");
		}
		System.out.println();

		System.out.println("Are you generally calm to the point of appearing apathetic?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Treecko");
		grassPokemon.remove("Grovyle");
		grassPokemon.remove("Sceptile");
		}
		System.out.println();

		System.out.println("Do you enjoy going to parties and socializing?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Lotad");
		grassPokemon.remove("Lombre");
		grassPokemon.remove("Ludicolo");
		}
		System.out.println();

		System.out.println("Is Halloween your favorite day of the year or do you like scary movies?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Seedot");
		grassPokemon.remove("Nuzleaf");
		grassPokemon.remove("Shiftry");
		}
		System.out.println();

		System.out.println("Have you had experience in a martial or fighting art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Shroomish");
		grassPokemon.remove("Breloom");
		}
		System.out.println();

		System.out.println("Do you think that how people perceive you matters slightly more than what you really are?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Budew");
		grassPokemon.remove("Roselia");
		grassPokemon.remove("Roserade");
		}
		System.out.println();

		System.out.println("Would you much rather live in deserted areas like Arizona or New Mexico than in constantly cold areas like Alaska or Maine?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Cacnea");
		grassPokemon.remove("Cacturne");
		}
		if(answer.equals("yes"))
		{grassPokemon.remove("Snover");
		grassPokemon.remove("Abomasnow");}
		System.out.println();

		System.out.println("Are you more into what was from a previous time period compared to your own?");
                answer=pokescan.nextLine();
                if(!answer.equals("yes"))
                {grassPokemon.remove("Lileep");
                grassPokemon.remove("Cradily");}
                System.out.println();

		System.out.println("Do you prefer fruit over sugary sweets like candy?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Tropius");
		}
		System.out.println();

		System.out.println("Do you live close to a river, stream, or lake?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Turtwig");
		grassPokemon.remove("Grotle");
		grassPokemon.remove("Torterra");
		}
		System.out.println();

		System.out.println("Are you outgoing and upbeat only if you are in a setting with familiar people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Cherubi");
		grassPokemon.remove("Cherrim");
		}
		System.out.println();

		System.out.println("Do you have tastes of food that others would consider strange?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Carnivine");
		}
		System.out.println();

		System.out.println("Are you a complete pacifist?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Leafeon");
		}
		System.out.println();

		System.out.println("Are you constantly in the pursuit for knowledge?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Snivy");
		grassPokemon.remove("Servine");
		grassPokemon.remove("Serperior");
		}
		System.out.println();

		System.out.println("Can you get cranky rather easily?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Pansage");
		grassPokemon.remove("Simisage");
		}
		System.out.println();

		System.out.println("Are you cold-natured and prefer the summer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Sewaddle");
		grassPokemon.remove("Swadloon");
		grassPokemon.remove("Leavanny");
		}
		System.out.println();

		System.out.println("Were/are you the class clown in school?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Cottonee");
		grassPokemon.remove("Whimsicott");
		}
		System.out.println();

		System.out.println("Do you enjoy listening to hip-hop, rap, or dance music?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Maractus");
		}
		System.out.println();

		System.out.println("Do you not like it when people touch you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Ferroseed");
		grassPokemon.remove("Ferrothorn");
		}
		System.out.println();

		System.out.println("Is spring time your favorite season of the year?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Deerling");
		grassPokemon.remove("Sawsbuck");
		}
		System.out.println();

		System.out.println("Is your outer self deceiving of your inner self?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Foongus");
		grassPokemon.remove("Amoonguss");
		}
		System.out.println();

		System.out.println("Do you enjoy taking naps or sleeping in late?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Bulbasaur");
		grassPokemon.remove("Ivysaur");
		grassPokemon.remove("Venusaur");
		}
		System.out.println();

		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Bulbasaur");
		grassPokemon.remove("Oddish");
		grassPokemon.remove("Paras");
		grassPokemon.remove("Bellsprout");
		grassPokemon.remove("Exeggcute");
		grassPokemon.remove("Tangela");
		grassPokemon.remove("Chikorita");
		grassPokemon.remove("Hoppip");
		grassPokemon.remove("Sunkern");
		grassPokemon.remove("Treecko");
		grassPokemon.remove("Lotad");
		grassPokemon.remove("Seedot");
		grassPokemon.remove("Shroomish");
		grassPokemon.remove("Cacnea");
		grassPokemon.remove("Lileep");
		grassPokemon.remove("Turtwig");
		grassPokemon.remove("Budew");
		grassPokemon.remove("Cherubi");
		grassPokemon.remove("Snover");
		grassPokemon.remove("Snivy");
		grassPokemon.remove("Pansage");
		grassPokemon.remove("Sewaddle");
		grassPokemon.remove("Cottonee");
		grassPokemon.remove("Petilil");
		grassPokemon.remove("Deerling");
		grassPokemon.remove("Foongus");
		grassPokemon.remove("Ferroseed");
		}
		if(answer.equals("yes"))
		{grassPokemon.remove("Ivysaur");
		grassPokemon.remove("Venusaur");
		grassPokemon.remove("Gloom");
		grassPokemon.remove("Vileplume");
		grassPokemon.remove("Parasect");
		grassPokemon.remove("Weepinbell");
		grassPokemon.remove("Victreebel");
		grassPokemon.remove("Exeggutor");
		grassPokemon.remove("Bayleef");
		grassPokemon.remove("Meganium");
		grassPokemon.remove("Skiploom");
		grassPokemon.remove("Jumpluff");
		grassPokemon.remove("Sunflora");
		grassPokemon.remove("Grovyle");
		grassPokemon.remove("Sceptile");
		grassPokemon.remove("Lombre");
		grassPokemon.remove("Ludicolo");
		grassPokemon.remove("Nuzleaf");
		grassPokemon.remove("Shiftry");
		grassPokemon.remove("Breloom");
		grassPokemon.remove("Roselia");
		grassPokemon.remove("Cacturne");
		grassPokemon.remove("Cradily");
		grassPokemon.remove("Grotle");
		grassPokemon.remove("Torterra");
		grassPokemon.remove("Roserade");
		grassPokemon.remove("Cherrim");
		grassPokemon.remove("Abomasnow");
		grassPokemon.remove("Tangrowth");
		grassPokemon.remove("Servine");
		grassPokemon.remove("Serperior");
		grassPokemon.remove("Simisage");
		grassPokemon.remove("Swadloon");
		grassPokemon.remove("Leavanny");
		grassPokemon.remove("Whimsicott");
		grassPokemon.remove("Lilligant");
		grassPokemon.remove("Sawsbuck");
		grassPokemon.remove("Amoonguss");
		grassPokemon.remove("Ferrothorn");
		}
		System.out.println();

		if(grassPokemon.contains("Victreebel"))
		{System.out.println("Do you enjoy tricking foolish people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Victreebel");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Weepinbell");}
		System.out.println();}

		if(grassPokemon.contains("Venusaur"))
		{System.out.println("Are you rather sluggish in your movements?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Venusaur");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Ivysaur");}
		System.out.println();}

		if(grassPokemon.contains("Bellossom"))
		{System.out.println("If given the chance, would you be a professional dancer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Bellossom");
		}
		System.out.println();}

		if(grassPokemon.contains("Vileplume"))
		{System.out.println("Do you usually have scented candles in your room/workspace?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Vileplume");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Gloom");}
		System.out.println();}

		if(grassPokemon.contains("Meganium"))
		{System.out.println("Have you had any form of medical schooling?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Meganium");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Bayleef");}
		System.out.println();}

		if(grassPokemon.contains("Jumpluff"))
		{System.out.println("Have you ever cheated on your spouse girl/boyfriend with another person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Jumpluff");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Skiploom");}
		System.out.println();}

		if(grassPokemon.contains("Sceptile"))
		{System.out.println("Did you climb trees when you were younger?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Sceptile");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Grovyle");}
		System.out.println();}

		if(grassPokemon.contains("Ludicolo"))
		{System.out.println("Are you usually drunk (or delirious) or dancing like crazy at parties?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Ludicolo");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Lombre");}
		System.out.println();}

		if(grassPokemon.contains("Shiftry"))
		{System.out.println("Have you ever partaken in a nature conservation or preservation program?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Shiftry");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Nuzleaf");}
		System.out.println();}

		if(grassPokemon.contains("Torterra"))
		{System.out.println("Do you do favors for people without asking for anything in return?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Torterra");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Grotle");}
		System.out.println();}

		if(grassPokemon.contains("Roserade"))
		{System.out.println("Do you fashion design something (clothes, flower arrangements, etc.)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Roserade");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Roselia");}
		System.out.println();}

		if(grassPokemon.contains("Serperior"))
		{System.out.println("Do people have immense respect for you and listen to whatever you say?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Serperior");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Servine");}
		System.out.println();}

		if(grassPokemon.contains("Leavanny"))
		{System.out.println("Would you make or are you a good parent?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Leavanny");
		}
                if(answer.equals("yes"))
                {grassPokemon.remove("Swadloon");}
		System.out.println();}
                
                if(grassPokemon.contains("Virizion"))
		{System.out.println("Are you a female or a male with feminine features who can do many masculine things like fight or use great physical strength?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Virizion");
		}
		System.out.println();}
                
                if(grassPokemon.contains("Shaymin"))
		{System.out.println("Do your great contributions to society often go unnoticed by the general public but are necessary or very useful for society?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Shaymin");
		}
		System.out.println();}
                
                if(grassPokemon.contains("Celebi"))
		{System.out.println("Have you made it your lifelong goal to spread peace into the world at large?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{grassPokemon.remove("Celebi");
		}
		System.out.println();}

		if(grassPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(grassPokemon.size()==1)
			out.println("You are " + grassPokemon.get(0));
		if(grassPokemon.size()>1)
		{String grassAura=new String("\n");
		if(grassPokemon.contains("Cherubi")||grassPokemon.contains("Cherrim"))
		{grassAura=grassAura + "Cherry\n";}
                if(grassPokemon.contains("Budew")||grassPokemon.contains("Roselia")||grassPokemon.contains("Roserade"))
		{grassAura=grassAura + "Rose\n";}
                if(grassPokemon.contains("Lotad")||grassPokemon.contains("Lombre")||grassPokemon.contains("Ludicolo"))
		{grassAura=grassAura + "Lime\n";}
                if(grassPokemon.contains("Petilil")||grassPokemon.contains("Lilligant"))
		{grassAura=grassAura + "Royal Purple\n";}
                if(grassPokemon.contains("Sunkern")||grassPokemon.contains("Sunflora"))
		{grassAura=grassAura + "Sunglow\n";}
                if(grassPokemon.contains("Oddish")||grassPokemon.contains("Gloom")||grassPokemon.contains("Vileplume"))
		{grassAura=grassAura + "Dark Blue\n";}
                if(grassPokemon.contains("Snover")||grassPokemon.contains("Abomasnow"))
		{grassAura=grassAura + "Snow\n";}
                if(grassPokemon.contains("Ferroseed")||grassPokemon.contains("Ferrothorn"))
		{grassAura=grassAura + "Steel Gray\n";}
                if(grassPokemon.contains("Cottonee")||grassPokemon.contains("Whimsicott"))
                {grassAura=grassAura + "Harlequin\n";} 
                if(grassPokemon.contains("Bulbasaur")||grassPokemon.contains("Ivysaur")||grassPokemon.contains("Venusaur"))
		{grassAura=grassAura + "Teal Green\n";}
                if(grassPokemon.contains("Seedot")||grassPokemon.contains("Nuzleaf")||grassPokemon.contains("Shiftry"))
		{grassAura=grassAura + "Black\n";}
                if(grassPokemon.contains("Turtwig")||grassPokemon.contains("Grotle")||grassPokemon.contains("Torterra"))
		{grassAura=grassAura + "Earth Yellow\n";}
                if(grassPokemon.contains("Maractus"))
		{grassAura=grassAura + "Mexican Pink\n";}
                if(grassPokemon.contains("Treecko")||grassPokemon.contains("Grovyle")||grassPokemon.contains("Sceptile"))
		{grassAura=grassAura + "Jasper\n";}
                if(grassPokemon.contains("Hoppip")||grassPokemon.contains("Skiploom")||grassPokemon.contains("Jumpluff"))
		{grassAura=grassAura + "Cotton\n";}
                if(grassPokemon.contains("Bellsprout")||grassPokemon.contains("Weepinbell")||grassPokemon.contains("Victreebel"))
		{grassAura=grassAura + "Chartreuse\n";}
                if(grassPokemon.contains("Snivy")||grassPokemon.contains("Servine")||grassPokemon.contains("Serperior"))
		{grassAura=grassAura + "Crimson\n";}
                if(grassPokemon.contains("Leafeon"))
		{grassAura=grassAura + "Blond\n";}
                if(grassPokemon.contains("Bellossom"))
		{grassAura=grassAura + "Hot Pink\n";}
                if(grassPokemon.contains("Pansage")||grassPokemon.contains("Simisage"))
		{grassAura=grassAura + "Asparagus\n";}
                if(grassPokemon.contains("Exeggcute")||grassPokemon.contains("Exeggutor"))
		{grassAura=grassAura + "Coconut\n";}
                if(grassPokemon.contains("Tropius"))
		{grassAura=grassAura + "Banana\n";}
                if(grassPokemon.contains("Deerling")||grassPokemon.contains("Sawsbuck"))
		{grassAura=grassAura + "Deer\n";}
                if(grassPokemon.contains("Sewaddle")||grassPokemon.contains("Swadloon")||grassPokemon.contains("Leavanny"))
		{grassAura=grassAura + "Jasmine\n";}
                if(grassPokemon.contains("Foongus")||grassPokemon.contains("Amoonguss"))
		{grassAura=grassAura + "Maroon\n";}
                if(grassPokemon.contains("Paras")||grassPokemon.contains("Parasect"))
		{grassAura=grassAura + "Poppy\n";}
                if(grassPokemon.contains("Lileep")||grassPokemon.contains("Cradily"))
		{grassAura=grassAura + "Bright Lilac\n";}
                if(grassPokemon.contains("Chikorita")||grassPokemon.contains("Bayleef")||grassPokemon.contains("Meganium"))
		{grassAura=grassAura + "Spring Green\n";}
                if(grassPokemon.contains("Cacnea")||grassPokemon.contains("Cacturne"))
		{grassAura=grassAura + "Sand\n";}
                if(grassPokemon.contains("Tangela")||grassPokemon.contains("Tangrowth"))
		{grassAura=grassAura + "Dark Green\n";}
                if(grassPokemon.contains("Carnivine"))
		{grassAura=grassAura + "Bright Green\n";}
                if(grassPokemon.contains("Shroomish")||grassPokemon.contains("Breloom"))
		{grassAura=grassAura + "Coffee\n";}
                if(grassPokemon.contains("Virizion"))
		{grassAura=grassAura + "Emerald\n";}
                if(grassPokemon.contains("Celebi"))
		{grassAura=grassAura + "Jade\n";}
                if(grassPokemon.contains("Shaymin"))
		{grassAura=grassAura + "White\n";}
                System.out.println("Out of these colors: " + grassAura + "which one describes you the most?");
                answer=pokescan.nextLine();
                
                if(answer.equals("Teal Green")&&grassPokemon.contains("Bulbasaur"))
                {System.out.println("You are Bulbasaur");}
                
                else if(answer.equals("Teal Green")&&grassPokemon.contains("Ivysaur"))
                {System.out.println("You are Ivysaur");}
                
                else if(answer.equals("Teal Green")&&grassPokemon.contains("Venusaur"))
                {System.out.println("You are Venusaur");}
                
                else if(answer.equals("Dark Blue")&&grassPokemon.contains("Oddish"))
                {System.out.println("You are Oddish");}
                
                else if(answer.equals("Dark Blue")&&grassPokemon.contains("Gloom"))
                {System.out.println("You are Gloom");}
                
                else if(answer.equals("Dark Blue")&&grassPokemon.contains("Vileplume"))
                {System.out.println("You are Vileplume");}
                
                else if(answer.equals("Poppy")&&grassPokemon.contains("Paras"))
                {System.out.println("You are Paras");}
                
                else if(answer.equals("Poppy")&&grassPokemon.contains("Parasect"))
                {System.out.println("You are Parasect");}
                
                else if(answer.equals("Chartreuse")&&grassPokemon.contains("Bellsprout"))
                {System.out.println("You are Bellsprout");}
                
                else if(answer.equals("Chartreuse")&&grassPokemon.contains("Weepinbell"))
                {System.out.println("You are Weepinbell");}
                
                else if(answer.equals("Chartreuse")&&grassPokemon.contains("Victreebel"))
                {System.out.println("You are Victreebel");}
                
                else if(answer.equals("Coconut")&&grassPokemon.contains("Exeggcute"))
                {System.out.println("You are Exeggcute");}
                
                else if(answer.equals("Coconut")&&grassPokemon.contains("Exeggutor"))
                {System.out.println("You are Exeggutor");}
                
                else if(answer.equals("Dark Green")&&grassPokemon.contains("Tangela"))
                {System.out.println("You are Tangela");}
                
                else if(answer.equals("Spring Green")&&grassPokemon.contains("Chikorita"))
                {System.out.println("You are Chikorita");}
                
                else if(answer.equals("Spring Green")&&grassPokemon.contains("Bayleef"))
                {System.out.println("You are Bayleef");}
                
                else if(answer.equals("Spring Green")&&grassPokemon.contains("Meganium"))
                {System.out.println("You are Meganium");}
                
                else if(answer.equals("Hot Pink")&&grassPokemon.contains("Bellossom"))
                {System.out.println("You are Bellossom");}
                
                else if(answer.equals("Cotton")&&grassPokemon.contains("Hoppip"))
                {System.out.println("You are Hoppip");}
                
                else if(answer.equals("Cotton")&&grassPokemon.contains("Skiploom"))
                {System.out.println("You are Skiploom");}
                
                else if(answer.equals("Cotton")&&grassPokemon.contains("Jumpluff"))
                {System.out.println("You are Jumpluff");}
                
                else if(answer.equals("Sunglow")&&grassPokemon.contains("Sunkern"))
                {System.out.println("You are Sunkern");}
                
                else if(answer.equals("Sunglow")&&grassPokemon.contains("Sunflora"))
                {System.out.println("You are Sunflora");}
                
                else if(answer.equals("Jade")&&grassPokemon.contains("Celebi"))
                {System.out.println("You are Celebi");}
                
                else if(answer.equals("Jasper")&&grassPokemon.contains("Treecko"))
                {System.out.println("You are Treecko");}
                
                else if(answer.equals("Jasper")&&grassPokemon.contains("Grovyle"))
                {System.out.println("You are Grovyle");}
                
                else if(answer.equals("Jasper")&&grassPokemon.contains("Sceptile"))
                {System.out.println("You are Sceptile");}
                
                else if(answer.equals("Lime")&&grassPokemon.contains("Lotad"))
                {System.out.println("You are Lotad");}
                
                else if(answer.equals("Lime")&&grassPokemon.contains("Lombre"))
                {System.out.println("You are Lombre");}
                
                else if(answer.equals("Lime")&&grassPokemon.contains("Ludicolo"))
                {System.out.println("You are Ludicolo");}
                
                else if(answer.equals("Black")&&grassPokemon.contains("Seedot"))
                {System.out.println("You are Seedot");}
                
                else if(answer.equals("Black")&&grassPokemon.contains("Nuzleaf"))
                {System.out.println("You are Nuzleaf");}
                
                else if(answer.equals("Black")&&grassPokemon.contains("Shiftry"))
                {System.out.println("You are Shiftry");}
                
                else if(answer.equals("Coffee")&&grassPokemon.contains("Shroomish"))
                {System.out.println("You are Shroomish");}
                
                else if(answer.equals("Coffee")&&grassPokemon.contains("Breloom"))
                {System.out.println("You are Breloom");}
                
                else if(answer.equals("Rose")&&grassPokemon.contains("Roselia"))
                {System.out.println("You are Roselia");}
                
                else if(answer.equals("Sand")&&grassPokemon.contains("Cacnea"))
                {System.out.println("You are Cacnea");}
                
                else if(answer.equals("Sand")&&grassPokemon.contains("Cacturne"))
                {System.out.println("You are Cacturne");}
                
                else if(answer.equals("Bright Lilac")&&grassPokemon.contains("Lileep"))
                {System.out.println("You are Lileep");}
                
                else if(answer.equals("Bright Lilac")&&grassPokemon.contains("Cradily"))
                {System.out.println("You are Cradily");}
                
                else if(answer.equals("Banana")&&grassPokemon.contains("Tropius"))
                {System.out.println("You are Tropius");}
                
                else if(answer.equals("Earth Yellow")&&grassPokemon.contains("Turtwig"))
                {System.out.println("You are Turtwig");}
                
                else if(answer.equals("Earth Yellow")&&grassPokemon.contains("Grotle"))
                {System.out.println("You are Grotle");}
                
                else if(answer.equals("Earth Yellow")&&grassPokemon.contains("Torterra"))
                {System.out.println("You are Torterra");}
                
                else if(answer.equals("Rose")&&grassPokemon.contains("Budew"))
                {System.out.println("You are Budew");}
                
                else if(answer.equals("Rose")&&grassPokemon.contains("Roserade"))
                {System.out.println("You are Roserade");}
                
                else if(answer.equals("Cherry")&&grassPokemon.contains("Cherubi"))
                {System.out.println("You are Cherubi");}
                
                else if(answer.equals("Cherry")&&grassPokemon.contains("Cherrim"))
                {System.out.println("You are Cherrim");}
                
                else if(answer.equals("Bright Green")&&grassPokemon.contains("Carnivine"))
                {System.out.println("You are Carnivine");}
                
                else if(answer.equals("Snow")&&grassPokemon.contains("Snover"))
                {System.out.println("You are Snover");}
                
                else if(answer.equals("Snow")&&grassPokemon.contains("Abomasnow"))
                {System.out.println("You are Abomasnow");}
                
                else if(answer.equals("Dark Green")&&grassPokemon.contains("Tangrowth"))
                {System.out.println("You are Tangrowth");}
                
                else if(answer.equals("Blond")&&grassPokemon.contains("Leafeon"))
                {System.out.println("You are Leafeon");}
                
                else if(answer.equals("White")&&grassPokemon.contains("Shaymin"))
                {System.out.println("You are Shaymin");}
                
                else if(answer.equals("Crimson")&&grassPokemon.contains("Snivy"))
                {System.out.println("You are Snivy");}
                
                else if(answer.equals("Crimson")&&grassPokemon.contains("Servine"))
                {System.out.println("You are Servine");}
                
                else if(answer.equals("Crimson")&&grassPokemon.contains("Serperior"))
                {System.out.println("You are Serperior");}
                
                else if(answer.equals("Asparagus")&&grassPokemon.contains("Pansage"))
                {System.out.println("You are Pansage");}
                
                else if(answer.equals("Asparagus")&&grassPokemon.contains("Simisage"))
                {System.out.println("You are Simisage");}
                
                else if(answer.equals("Jasmine")&&grassPokemon.contains("Sewaddle"))
                {System.out.println("You are Sewaddle");}
                
                else if(answer.equals("Jasmine")&&grassPokemon.contains("Swadloon"))
                {System.out.println("You are Swadloon");}
                
                else if(answer.equals("Jasmine")&&grassPokemon.contains("Leavanny"))
                {System.out.println("You are Leavanny");}
                
                else if(answer.equals("Harlequin")&&grassPokemon.contains("Cottonee"))
                {System.out.println("You are Cottonee");}
                
                else if(answer.equals("Harlequin")&&grassPokemon.contains("Whimisicott"))
                {System.out.println("You are Whimsicott");}
                
                else if(answer.equals("Royal Purple")&&grassPokemon.contains("Petilil"))
                {System.out.println("You are Petilil");}
                
                else if(answer.equals("Royal Purple")&&grassPokemon.contains("Lilligant"))
                {System.out.println("You are Lilligant");}
                
                else if(answer.equals("Mexican Pink")&&grassPokemon.contains("Maractus"))
                {System.out.println("You are Maractus");}
                
                else if(answer.equals("Deer")&&grassPokemon.contains("Deerling"))
                {System.out.println("You are Deerling");}
                
                else if(answer.equals("Deer")&&grassPokemon.contains("Sawsbuck"))
                {System.out.println("You are Sawsbuck");}
                
                else if(answer.equals("Maroon")&&grassPokemon.contains("Foongus"))
                {System.out.println("You are Foongus");}
                
                else if(answer.equals("Maroon")&&grassPokemon.contains("Amoonguss"))
                {System.out.println("You are Amoonguss");}
                
                else if(answer.equals("Steel Gray")&&grassPokemon.contains("Ferroseed"))
                {System.out.println("You are Ferroseed");}
                
                else if(answer.equals("Steel Gray")&&grassPokemon.contains("Ferrothorn"))
                {System.out.println("You are Ferrothorn");}
                
                else if(answer.equals("Emerald")&&grassPokemon.contains("Virizion"))
                {System.out.println("You are Virizion");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
    }
}}