
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class FlyingTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> flyingPokemon= new ArrayList<String>();
		flyingPokemon.add("Charizard");
		flyingPokemon.add("Butterfree");
		flyingPokemon.add("Pidgey");
		flyingPokemon.add("Pidgeotto");
		flyingPokemon.add("Pidgeot");
		flyingPokemon.add("Spearow");
		flyingPokemon.add("Fearow");
		flyingPokemon.add("Zubat");
		flyingPokemon.add("Golbat");
		flyingPokemon.add("Farfetch'd");
		flyingPokemon.add("Doduo");
		flyingPokemon.add("Dodrio");
		flyingPokemon.add("Scyther");
		flyingPokemon.add("Gyarados");
		flyingPokemon.add("Aerodactyl");
		flyingPokemon.add("Articuno");
		flyingPokemon.add("Zapdos");
		flyingPokemon.add("Moltres");
		flyingPokemon.add("Dragonite");
		flyingPokemon.add("Hoothoot");
		flyingPokemon.add("Noctowl");
		flyingPokemon.add("Ledyba");
		flyingPokemon.add("Ledian");
		flyingPokemon.add("Crobat");
		flyingPokemon.add("Togetic");
		flyingPokemon.add("Natu");
		flyingPokemon.add("Xatu");
		flyingPokemon.add("Hoppip");
		flyingPokemon.add("Skiploom");
		flyingPokemon.add("Jumpluff");
		flyingPokemon.add("Yanma");
		flyingPokemon.add("Murkrow");
		flyingPokemon.add("Gligar");
		flyingPokemon.add("Delibird");
		flyingPokemon.add("Mantine");
		flyingPokemon.add("Skarmory");
		flyingPokemon.add("Lugia");
		flyingPokemon.add("Ho-oh");
		flyingPokemon.add("Beautifly");
		flyingPokemon.add("Taillow");
		flyingPokemon.add("Swellow");
		flyingPokemon.add("Wingull");
		flyingPokemon.add("Pelipper");
		flyingPokemon.add("Masquerain");
		flyingPokemon.add("Ninjask");
		flyingPokemon.add("Swablu");
		flyingPokemon.add("Altaria");
		flyingPokemon.add("Tropius");
		flyingPokemon.add("Salamence");
		flyingPokemon.add("Rayquaza");
		flyingPokemon.add("Starly");
		flyingPokemon.add("Staravia");
		flyingPokemon.add("Staraptor");
		flyingPokemon.add("Mothim");
		flyingPokemon.add("Combee");
		flyingPokemon.add("Vespiquen");
		flyingPokemon.add("Drifloon");
		flyingPokemon.add("Drifblim");
		flyingPokemon.add("Honchkrow");
		flyingPokemon.add("Chatot");
		flyingPokemon.add("Mantyke");
		flyingPokemon.add("Togekiss");
		flyingPokemon.add("Yanmega");
		flyingPokemon.add("Gliscor");
		flyingPokemon.add("Pidove");
		flyingPokemon.add("Tranquil");
		flyingPokemon.add("Unfezant");
		flyingPokemon.add("Woobat");
		flyingPokemon.add("Swoobat");
		flyingPokemon.add("Sigilyph");
		flyingPokemon.add("Archen");
		flyingPokemon.add("Archeops");
		flyingPokemon.add("Ducklett");
		flyingPokemon.add("Swanna");
		flyingPokemon.add("Emolga");
		flyingPokemon.add("Rufflet");
		flyingPokemon.add("Braviary");
		flyingPokemon.add("Vullaby");
		flyingPokemon.add("Mandibuzz");
		flyingPokemon.add("Tornadus");
		flyingPokemon.add("Thundurus");
		flyingPokemon.add("Landorus");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Articuno");
		flyingPokemon.remove("Zapdos");
		flyingPokemon.remove("Moltres");
		flyingPokemon.remove("Lugia");
		flyingPokemon.remove("Ho-oh");
		flyingPokemon.remove("Rayquaza");
		flyingPokemon.remove("Tornadus");
		flyingPokemon.remove("Thundurus");
		flyingPokemon.remove("Landorus");

		}
		System.out.println();
                
                System.out.println("Are you a male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Rufflet");
		flyingPokemon.remove("Braviary");
                flyingPokemon.remove("Mothim");
                flyingPokemon.remove("Tornadus");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Vullaby");
                flyingPokemon.remove("Mandibuzz");
                flyingPokemon.remove("Vespiquen");}
                System.out.println();
                
                System.out.println("Do you prefer a culture that existed in the past as opposed to today's culture?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Archen");
		flyingPokemon.remove("Archeops");
		}
		System.out.println();
                
                if(flyingPokemon.contains("Archen")||flyingPokemon.contains("Archeops"))
                {System.out.println("Are you generally competent in what you do but tend to give up easily on difficult tasks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Archen");
		flyingPokemon.remove("Archeops");
		}
		System.out.println();}

		System.out.println("Do you believe in a strong social hierarchy or that people can only belong to certain groups?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Combee");
		flyingPokemon.remove("Vespiquen");
		}
		System.out.println();

		if(flyingPokemon.contains("Vullaby")||flyingPokemon.contains("Mandibuzz"))
                {System.out.println("Do you like wearing skeleton/Halloween/emo accessories?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Vullaby");
		flyingPokemon.remove("Mandibuzz");
		}
		System.out.println();}

		System.out.println("Do you have perfect vision?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Pidgey");
		flyingPokemon.remove("Pidgeotto");
		flyingPokemon.remove("Pidgeot");
		}
		System.out.println();

		System.out.println("Do you have excellent stamina and can run for a long time?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Spearow");
		flyingPokemon.remove("Fearow");
		}
		System.out.println();

		System.out.println("Have you tasted blood and liked it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Zubat");
		flyingPokemon.remove("Golbat");
		flyingPokemon.remove("Crobat");
		}
		System.out.println();

		System.out.println("Do you have a security blanket of some sort?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Farfetch'd");
		}
		System.out.println();

		System.out.println("Do you feel as if you have multiple personalities?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Doduo");
		flyingPokemon.remove("Dodrio");
		}
		System.out.println();

		System.out.println("Do you feel as if you are more powerful or smarter than your peers?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Scyther");
		}
		System.out.println();

		System.out.println("Are you more active during the nighttime hours?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Hoothoot");
		flyingPokemon.remove("Noctowl");
		}
		System.out.println();

		System.out.println("Do you prefer fruit over junk food or sweets?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Tropius");
		}
		System.out.println();

		if(flyingPokemon.contains("Rufflet")||flyingPokemon.contains("Braviary"))
                {System.out.println("Would you sacrifice yourself to save a friend?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Rufflet");
		flyingPokemon.remove("Braviary");
		}
		System.out.println();}

		System.out.println("Do you have a rather sappy, romantic heart?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Woobat");
		flyingPokemon.remove("Swoobat");
		}
		System.out.println();

		System.out.println("Are you highly energetic and don't really like sitting still in one place for long?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Hoppip");
		flyingPokemon.remove("Skiploom");
		flyingPokemon.remove("Jumpluff");
		}
		System.out.println();
                
                System.out.println("Would drifting in the sky without a care in the world appeal to you?");
                answer=pokescan.nextLine();
                if(!answer.equals("yes"))
                {flyingPokemon.remove("Drifloon");
                flyingPokemon.remove("Drifbliim");}
                System.out.println();

		System.out.println("Are you calm and peaceful on the inside but can still respond to pressure or difficult situations?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Pidove");
		flyingPokemon.remove("Tranquil");
		flyingPokemon.remove("Unfezant");
		}
		System.out.println();

		System.out.println("Have you depended on your friends strongly to help you with your life or problems?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Starly");
		flyingPokemon.remove("Staravia");
		flyingPokemon.remove("Staraptor");
		}
		System.out.println();


		System.out.println("Would you study languages as a major or are you bilingual?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Chatot");
		}
		System.out.println();

		System.out.println("Would you rather live in the countryside than in the city or suburbs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Ledyba");
		flyingPokemon.remove("Ledian");
		}
		System.out.println();

		System.out.println("Do you surround yourself exclusively with kind people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Togetic");
		flyingPokemon.remove("Togekiss");
		}
		System.out.println();

		System.out.println("Do you have the strong tendancy to zone off or daydream?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Natu");
		flyingPokemon.remove("Xatu");
		}
		System.out.println();

		System.out.println("Would the job of a postman or delivery man appeal to you at least for a part time job?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Wingull");
		flyingPokemon.remove("Pelipper");
		}
		System.out.println();

		System.out.println("Do you believe in Santa Claus?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Delibird");
		}
		System.out.println();

		System.out.println("Have you participated in an organized prank or fight with other accomplices or friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Murkrow");
		flyingPokemon.remove("Honchkrow");
		}
		System.out.println();

		System.out.println("Do you think that sometimes you have to use the contributions of others in order to reach your own success??");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Gligar");
		flyingPokemon.remove("Gliscor");
		}
		System.out.println();

		System.out.println("Have people taken advantage of you in the past?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Mantyke");
		flyingPokemon.remove("Mantine");
		}
		System.out.println();

		System.out.println("Do people admire you for your abilities or your lofty position?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Skarmory");
		}
		System.out.println();

		System.out.println("Do you take on challenges or games with an \"I can't lose\" attitude?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Taillow");
		flyingPokemon.remove("Swellow");
		}
		System.out.println();

		System.out.println("Can you tell when someone is lying or is withholding information?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Yanma");
		flyingPokemon.remove("Yanmega");
		}
		System.out.println();

		System.out.println("Are you a clean freak that hates getting dirty?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Swablu");
		flyingPokemon.remove("Altaria");
		}
		System.out.println();

		System.out.println("Would you enjoy hang-gliding from a high area?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Emolga");
		}
		System.out.println();

		System.out.println("Does Native American culture interest you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Sigilyph");
		}
		System.out.println();



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Pidgey");
		flyingPokemon.remove("Spearow");
		flyingPokemon.remove("Zubat");
		flyingPokemon.remove("Doduo");
		flyingPokemon.remove("Hoothoot");
		flyingPokemon.remove("Ledyba");
		flyingPokemon.remove("Natu");
		flyingPokemon.remove("Hoppip");
		flyingPokemon.remove("Yanma");
		flyingPokemon.remove("Murkrow");
		flyingPokemon.remove("Gligar");
		flyingPokemon.remove("Taillow");
		flyingPokemon.remove("Wingull");
		flyingPokemon.remove("Swablu");
		flyingPokemon.remove("Starly");
		flyingPokemon.remove("Drifloon");
		flyingPokemon.remove("Mantyke");
		flyingPokemon.remove("Pidove");
		flyingPokemon.remove("Woobat");
		flyingPokemon.remove("Archen");
		flyingPokemon.remove("Ducklett");
		flyingPokemon.remove("Rufflet");
		flyingPokemon.remove("Vullaby");
		}
		if(answer.equals("yes"))
		{flyingPokemon.remove("Charizard");
		flyingPokemon.remove("Butterfree");
		flyingPokemon.remove("Pidgeotto");
		flyingPokemon.remove("Pidgeot");
		flyingPokemon.remove("Fearow");
		flyingPokemon.remove("Golbat");
		flyingPokemon.remove("Dodrio");
		flyingPokemon.remove("Gyarados");
		flyingPokemon.remove("Dragonite");
		flyingPokemon.remove("Noctowl");
		flyingPokemon.remove("Ledian");
		flyingPokemon.remove("Crobat");
		flyingPokemon.remove("Togetic");
		flyingPokemon.remove("Xatu");
		flyingPokemon.remove("Skiploom");
		flyingPokemon.remove("Jumpluff");
		flyingPokemon.remove("Mantine");
		flyingPokemon.remove("Beautifly");
		flyingPokemon.remove("Swellow");
		flyingPokemon.remove("Pelipper");
		flyingPokemon.remove("Masquerain");
		flyingPokemon.remove("Ninjask");
		flyingPokemon.remove("Altaria");
		flyingPokemon.remove("Salamence");
		flyingPokemon.remove("Staravia");
		flyingPokemon.remove("Staraptor");
		flyingPokemon.remove("Mothim");
		flyingPokemon.remove("Vespiquen");
		flyingPokemon.remove("Drifblim");
		flyingPokemon.remove("Honchkrow");
		flyingPokemon.remove("Togekiss");
		flyingPokemon.remove("Yanmega");
		flyingPokemon.remove("Gliscor");
		flyingPokemon.remove("Tranquill");
		flyingPokemon.remove("Unfezant");
		flyingPokemon.remove("Swoobat");
		flyingPokemon.remove("Archeops");
		flyingPokemon.remove("Swanna");
		flyingPokemon.remove("Braviary");
		flyingPokemon.remove("Mandibuzz");
		}
		System.out.println();
                
                if(flyingPokemon.contains("Ducklett"))
                {System.out.println("Have you had a hard time attracting a male/female companion in the past?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Ducklett");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Swanna"))
                {System.out.println("Do you like to dance and are you a good dancer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Ducklett");
		}
		System.out.println();}

		if(flyingPokemon.contains("Gyarados"))
		{System.out.println("Are you violent or downright terrifying when you are angry?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Gyarados");
		}
		System.out.println();}

		if(flyingPokemon.contains("Butterfree"))
		{System.out.println("Are you attracted to the beauty of flowers?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Butterfree");
		}
		System.out.println();}

		if(flyingPokemon.contains("Charizard"))
		{System.out.println("Does your rather cocky or self-centered attitude turn some people off?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Charizard");
		}
		System.out.println();}

		if(flyingPokemon.contains("Aerodactyl"))
		{System.out.println("Do you often get into fights or arguments when your dominance over something is questioned?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Aerodactyl");
		}
		System.out.println();}

		if(flyingPokemon.contains("Dragonite"))
		{System.out.println("Is it pleasurable to help those in need?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Dragonite");
		}
		System.out.println();}

		if(flyingPokemon.contains("Masquerain"))
		{System.out.println("Are the physical features of the eyes important to you in choosing a mate?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Masquerain");
		}
		System.out.println();}

		if(flyingPokemon.contains("Beautifly"))
		{System.out.println("Is your inner personality different than your outer personality?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Beautifly");
		}
		System.out.println();}

		if(flyingPokemon.contains("Ninjask"))
		{System.out.println("Can you be really whiny and annoying?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Ninjask");
		}
		System.out.println();}

		if(flyingPokemon.contains("Salamence"))
		{System.out.println("Have you recently accomplished a GREAT feat?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Salamence");
		}
		System.out.println();}

		if(flyingPokemon.contains("Mothim"))
		{System.out.println("Do you often steal food from your friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Mothim");
		}
		System.out.println();}

		if(flyingPokemon.contains("Pidgeot"))
		{System.out.println("Do you like to dress extravagently?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Pidgeot");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Pidgeotto");}
		System.out.println();}

		if(flyingPokemon.contains("Crobat"))
		{System.out.println("Are you naturally quiet but have a lot on your mind?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Crobat");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Golbat");}
		System.out.println();}

		if(flyingPokemon.contains("Jumpluff"))
		{System.out.println("Have you ever cheated on your spouse or girl/boyfriend with someone else?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Jumpluff");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Skiploom");}
		System.out.println();}

		if(flyingPokemon.contains("Staraptor"))
		{System.out.println("Is your behavior often reckless and self-endangering?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Staraptor");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Staravia");}
		System.out.println();}

		if(flyingPokemon.contains("Togekiss"))
		{System.out.println("Are you always smiling wherever you go?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Togekiss");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Togetic");}
		System.out.println();}

		if(flyingPokemon.contains("Unfezant"))
		{System.out.println("Do you believe in gender equality?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Unfezant");
		}
                if(answer.equals("yes"))
                {flyingPokemon.remove("Tranquil");}
		System.out.println();}
                
                if(flyingPokemon.contains("Tornadus"))
		{System.out.println("Despite your fame, do you typically like to be left alone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Tornadus");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Articuno"))
		{System.out.println("Are you in a position where you are constantly surrounded by others dying?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Articuno");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Zapdos"))
		{System.out.println("Are you a highly energetic rock star?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Zapdos");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Moltres"))
		{System.out.println("Are you a mascot or symbol for something?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Moltres");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Lugia"))
		{System.out.println("Do you tend to keep your talents or wealth or power low key because you don't feel the need to proove your worth to people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Lugia");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Ho-oh"))
		{System.out.println("Do you have the power to give anyone happiness?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Ho-oh");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Rayquaza"))
		{System.out.println("Are you known as a great mediator of conflicts (but you are not neccessarily non-violent about it)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Rayquaza");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Thundurus"))
		{System.out.println("Are you generally hated by the public but don't neccessarilly deserve it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Thundurus");
		}
		System.out.println();}
                
                if(flyingPokemon.contains("Landorus"))
		{System.out.println("Are you a leading figure in solving world problems like hunger?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{flyingPokemon.remove("Landorus");
		}
		System.out.println();}



		if(flyingPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(flyingPokemon.size()==1)
			out.println("You are " + flyingPokemon.get(0));
		if(flyingPokemon.size()>1)
                {String flyingAura=new String("\n");
		if(flyingPokemon.contains("Pidgey")||flyingPokemon.contains("Pidgeotto")||flyingPokemon.contains("Pidgeot"))
		{flyingAura=flyingAura + "Terracotta\n";}
                if(flyingPokemon.contains("Spearow")||flyingPokemon.contains("Fearow"))
		{flyingAura=flyingAura + "Russet\n";}
                if(flyingPokemon.contains("Zubat")||flyingPokemon.contains("Golbat")||flyingPokemon.contains("Crobat"))
		{flyingAura=flyingAura + "Midnight Blue\n";}
                if(flyingPokemon.contains("Doduo")||flyingPokemon.contains("Dodrio"))
		{flyingAura=flyingAura + "Charcoal\n";}
                if(flyingPokemon.contains("Vullaby")||flyingPokemon.contains("Mandibuzz"))
		{flyingAura=flyingAura + "Fuchsia\n";}
                if(flyingPokemon.contains("Hoppip")||flyingPokemon.contains("Skiploom")||flyingPokemon.contains("Jumpluff"))
		{flyingAura=flyingAura + "Cotton\n";}
                if(flyingPokemon.contains("Yanma")||flyingPokemon.contains("Yanmega"))
		{flyingAura=flyingAura + "Bright Green\n";}
                if(flyingPokemon.contains("Taillow")||flyingPokemon.contains("Swellow"))
		{flyingAura=flyingAura + "Maroon\n";}
                if(flyingPokemon.contains("Natu")||flyingPokemon.contains("Xatu"))
		{flyingAura=flyingAura + "Amazon\n";}
                if(flyingPokemon.contains("Starly")||flyingPokemon.contains("Staravia")||flyingPokemon.contains("Staraptor"))
		{flyingAura=flyingAura + "Ivory\n";}
                if(flyingPokemon.contains("Drifloon")||flyingPokemon.contains("Drifblim"))
		{flyingAura=flyingAura + "Lavender\n";}
                if(flyingPokemon.contains("Woobat")||flyingPokemon.contains("Swoobat"))
		{flyingAura=flyingAura + "Thistle\n";}
                if(flyingPokemon.contains("Farfetch'd"))
		{flyingAura=flyingAura + "Olive\n";}
                if(flyingPokemon.contains("Scyther"))
		{flyingAura=flyingAura + "Mantis\n";}
                if(flyingPokemon.contains("Ledyba")||flyingPokemon.contains("Ledian"))
		{flyingAura=flyingAura + "Auburn\n";}
                if(flyingPokemon.contains("Murkrow")||flyingPokemon.contains("Honchkrow"))
		{flyingAura=flyingAura + "Licorice\n";}
                if(flyingPokemon.contains("Swablu")||flyingPokemon.contains("Altaria"))
		{flyingAura=flyingAura + "Periwinkle\n";}
                if(flyingPokemon.contains("Gligar")||flyingPokemon.contains("Gliscor"))
		{flyingAura=flyingAura + "Dark Purple\n";}
                if(flyingPokemon.contains("Delibird"))
		{flyingAura=flyingAura + "Snow\n";}
                if(flyingPokemon.contains("Togetic")||flyingPokemon.contains("Togekiss"))
		{flyingAura=flyingAura + "White\n";}
                if(flyingPokemon.contains("Zapdos"))
		{flyingAura=flyingAura + "Electric Yellow\n";}
                if(flyingPokemon.contains("Moltres"))
		{flyingAura=flyingAura + "Flame\n";}
                if(flyingPokemon.contains("Articuno"))
		{flyingAura=flyingAura + "Azure\n";}
                if(flyingPokemon.contains("Rufflet")||flyingPokemon.contains("Braviary"))
		{flyingAura=flyingAura + "Air Force Blue\n";}
                if(flyingPokemon.contains("Rayquaza"))
		{flyingAura=flyingAura + "Emerald\n";}
                if(flyingPokemon.contains("Ho-oh"))
		{flyingAura=flyingAura + "Gold\n";}
                if(flyingPokemon.contains("Lugia"))
		{flyingAura=flyingAura + "Silver\n";}
                if(flyingPokemon.contains("Aerodactyl"))
		{flyingAura=flyingAura + "Onyx\n";}
                if(flyingPokemon.contains("Gyarados"))
		{flyingAura=flyingAura + "Crimson\n";}
                if(flyingPokemon.contains("Hoothoot")||flyingPokemon.contains("Noctowl"))
		{flyingAura=flyingAura + "Sienna\n";}
                if(flyingPokemon.contains("Dragonite"))
		{flyingAura=flyingAura + "Sunglow\n";}
                if(flyingPokemon.contains("Mantyke")||flyingPokemon.contains("Mantine"))
		{flyingAura=flyingAura + "Sea Blue\n";}
                if(flyingPokemon.contains("Skarmory"))
		{flyingAura=flyingAura + "Gunmetal\n";}
                if(flyingPokemon.contains("Wingull")||flyingPokemon.contains("Pelipper"))
		{flyingAura=flyingAura + "Seashell\n";}
                if(flyingPokemon.contains("Masquerain"))
		{flyingAura=flyingAura + "Aqua\n";}
                if(flyingPokemon.contains("Tropius"))
		{flyingAura=flyingAura + "Banana\n";}
                if(flyingPokemon.contains("Ninjask"))
		{flyingAura=flyingAura + "Amber\n";}
                if(flyingPokemon.contains("Salamence"))
		{flyingAura=flyingAura + "Malachite\n";}
                if(flyingPokemon.contains("Mothim"))
		{flyingAura=flyingAura + "Corn\n";}
                if(flyingPokemon.contains("Combee")||flyingPokemon.contains("Vespiquen"))
		{flyingAura=flyingAura + "Honey\n";}
                if(flyingPokemon.contains("Chatot"))
		{flyingAura=flyingAura + "Maya Blue\n";}
                if(flyingPokemon.contains("Sigilyph"))
		{flyingAura=flyingAura + "Sand\n";}
                if(flyingPokemon.contains("Emolga"))
		{flyingAura=flyingAura + "Cream\n";}
                if(flyingPokemon.contains("Pidove")||flyingPokemon.contains("Tranquil")||flyingPokemon.contains("Unfezant"))
		{flyingAura=flyingAura + "Ash Gray\n";}
                if(flyingPokemon.contains("Ducklett")||flyingPokemon.contains("Swanna"))
		{flyingAura=flyingAura + "Turquoise\n";}
                if(flyingPokemon.contains("Archen")||flyingPokemon.contains("Archeops"))
		{flyingAura=flyingAura + "Scarlet\n";}
                if(flyingPokemon.contains("Landorus"))
		{flyingAura=flyingAura + "Ruddy Brown\n";}
                if(flyingPokemon.contains("Tornadus"))
		{flyingAura=flyingAura + "Royal Purple\n";}
                if(flyingPokemon.contains("Thundurus"))
		{flyingAura=flyingAura + "Electric Blue\n";}
                if(flyingPokemon.contains("Beautifly"))
		{flyingAura=flyingAura + "Coffee\n";}
                if(flyingPokemon.contains("Butterfree"))
		{flyingAura=flyingAura + "Orchid\n";}
                if(flyingPokemon.contains("Charizard"))
		{flyingAura=flyingAura + "Bright Orange\n";}
                System.out.println("Out of these colors:" +flyingAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Bright Orange")&&flyingPokemon.contains("Charizard"))
                {System.out.println("You are Charizard");}
                
                else if(answer.equals("Orchid")&&flyingPokemon.contains("Butterfree"))
                {System.out.println("You are Butterfree");}
                
                else if(answer.equals("Terracotta")&&flyingPokemon.contains("Pidgey"))
                {System.out.println("You are Pidgey");}
                
                else if(answer.equals("Terracotta")&&flyingPokemon.contains("Pidgeotto"))
                {System.out.println("You are Pidgeotto");}
                
                else if(answer.equals("Terracotta")&&flyingPokemon.contains("Pidgeot"))
                {System.out.println("You are Pidgeot");}
                
                else if(answer.equals("Russet")&&flyingPokemon.contains("Spearow"))
                {System.out.println("You are Spearow");}
                
                else if(answer.equals("Russet")&&flyingPokemon.contains("Fearow"))
                {System.out.println("You are Fearow");}
                
                else if(answer.equals("Midnight Blue")&&flyingPokemon.contains("Zubat"))
                {System.out.println("You are Zubat");}
                
                else if(answer.equals("Midnight Blue")&&flyingPokemon.contains("Golbat"))
                {System.out.println("You are Golbat");}
                
                else if(answer.equals("Olive")&&flyingPokemon.contains("Farfetch'd"))
                {System.out.println("You are Farfetch'd");}
                
                else if(answer.equals("Charcoal")&&flyingPokemon.contains("Doduo"))
                {System.out.println("You are Doduo");}
                
                else if(answer.equals("Charcoal")&&flyingPokemon.contains("Dodrio"))
                {System.out.println("You are Dodrio");}
                
                else if(answer.equals("Mantis")&&flyingPokemon.contains("Scyther"))
                {System.out.println("You are Scyther");}
                
                else if(answer.equals("Crimson")&&flyingPokemon.contains("Gyarados"))
                {System.out.println("You are Gyarados");}
                
                else if(answer.equals("Onyx")&&flyingPokemon.contains("Aerodactyl"))
                {System.out.println("You are Aerodactyl");}
                
                else if(answer.equals("Azure")&&flyingPokemon.contains("Articuno"))
                {System.out.println("You are Articuno");}
                
                else if(answer.equals("Electric Yellow")&&flyingPokemon.contains("Zapdos"))
                {System.out.println("You are Zapdos");}
                
                else if(answer.equals("Flame")&&flyingPokemon.contains("Moltres"))
                {System.out.println("You are Moltres");}
                
                else if(answer.equals("Sunglow")&&flyingPokemon.contains("Dragonite"))
                {System.out.println("You are Dragonite");}
                
                else if(answer.equals("Sienna")&&flyingPokemon.contains("Hoothoot"))
                {System.out.println("You are Hoothoot");}
                
                else if(answer.equals("Sienna")&&flyingPokemon.contains("Noctowl"))
                {System.out.println("You are Noctowl");}
                
                else if(answer.equals("Auburn")&&flyingPokemon.contains("Ledyba"))
                {System.out.println("You are Ledyba");}
                
                else if(answer.equals("Auburn")&&flyingPokemon.contains("Ledian"))
                {System.out.println("You are Ledian");}
                
                else if(answer.equals("Midnight Blue")&&flyingPokemon.contains("Crobat"))
                {System.out.println("You are Crobat");}
                
                else if(answer.equals("White")&&flyingPokemon.contains("Togetic"))
                {System.out.println("You are Togetic");}
                
                else if(answer.equals("Amazon")&&flyingPokemon.contains("Natu"))
                {System.out.println("You are Xatu");}
                
                else if(answer.equals("Cotton")&&flyingPokemon.contains("Hoppip"))
                {System.out.println("You are Hoppip");}
                
                else if(answer.equals("Cotton")&&flyingPokemon.contains("Skiploom"))
                {System.out.println("You are Skiploom");}
                
                else if(answer.equals("Cotton")&&flyingPokemon.contains("Jumpluff"))
                {System.out.println("You are Jumpluff");}
                
                else if(answer.equals("Bright Green")&&flyingPokemon.contains("Yanma"))
                {System.out.println("You are Yanma");}
                
                else if(answer.equals("Licorice")&&flyingPokemon.contains("Murkrow"))
                {System.out.println("You are Murkrow");}
                
                else if(answer.equals("Dark Purple")&&flyingPokemon.contains("Gligar"))
                {System.out.println("You are Gligar");}
                
                else if(answer.equals("Snow")&&flyingPokemon.contains("Delibird"))
                {System.out.println("You are Delibird");}
                
                else if(answer.equals("Sea Blue")&&flyingPokemon.contains("Mantine"))
                {System.out.println("You are Mantine");}
                
                else if(answer.equals("Gunmetal")&&flyingPokemon.contains("Skarmory"))
                {System.out.println("You are Skarmory");}
                
                else if(answer.equals("Silver")&&flyingPokemon.contains("Lugia"))
                {System.out.println("You are Lugia");}
                
                else if(answer.equals("Gold")&&flyingPokemon.contains("Ho-oh"))
                {System.out.println("You are Ho-oh");}
                
                else if(answer.equals("Coffee")&&flyingPokemon.contains("Beautifly"))
                {System.out.println("You are Beautifly");}
                
                else if(answer.equals("Maroon")&&flyingPokemon.contains("Taillow"))
                {System.out.println("You are Taillow");}
                
                else if(answer.equals("Maroon")&&flyingPokemon.contains("Swellow"))
                {System.out.println("You are Swellow");}
                
                else if(answer.equals("Seashell")&&flyingPokemon.contains("Wingull"))
                {System.out.println("You are Wingull");}
                
                else if(answer.equals("Seashell")&&flyingPokemon.contains("Pelipper"))
                {System.out.println("You are Pelipper");}
                
                else if(answer.equals("Aqua")&&flyingPokemon.contains("Masquerain"))
                {System.out.println("You are Masquerain");}
                
                else if(answer.equals("Amber")&&flyingPokemon.contains("Ninjask"))
                {System.out.println("You are Ninjask");}
                
                else if(answer.equals("Periwinkle")&&flyingPokemon.contains("Swablu"))
                {System.out.println("You are Swablu");}
                
                else if(answer.equals("Periwinkle")&&flyingPokemon.contains("Altaria"))
                {System.out.println("You are Altaria");}
                
                else if(answer.equals("Banana")&&flyingPokemon.contains("Tropius"))
                {System.out.println("You are Tropius");}
                
                else if(answer.equals("Malachite")&&flyingPokemon.contains("Salamence"))
                {System.out.println("You are Salamence");}
                
                else if(answer.equals("Emerald")&&flyingPokemon.contains("Rayquaza"))
                {System.out.println("You are Rayquaza");}
                
                else if(answer.equals("Ivory")&&flyingPokemon.contains("Starly"))
                {System.out.println("You are Starly");}
                
                else if(answer.equals("Ivory")&&flyingPokemon.contains("Staravia"))
                {System.out.println("You are Staravia");}
                
                else if(answer.equals("Ivory")&&flyingPokemon.contains("Staraptor"))
                {System.out.println("You are Staraptor");}
                
                else if(answer.equals("Corn")&&flyingPokemon.contains("Mothim"))
                {System.out.println("You are Mothim");}
                
                else if(answer.equals("Honey")&&flyingPokemon.contains("Combee"))
                {System.out.println("You are Combee");}
                
                else if(answer.equals("Honey")&&flyingPokemon.contains("Vespiquen"))
                {System.out.println("You are Vespiquen");}
                
                else if(answer.equals("Lavender")&&flyingPokemon.contains("Drifloon"))
                {System.out.println("You are Drifloon");}
                
                else if(answer.equals("Lavender")&&flyingPokemon.contains("Drifblim"))
                {System.out.println("You are Drifblim");}
                
                else if(answer.equals("Licorice")&&flyingPokemon.contains("Honchkrow"))
                {System.out.println("You are Honchkrow");}
                
                else if(answer.equals("Maya Blue")&&flyingPokemon.contains("Chatot"))
                {System.out.println("You are Chatot");}
                
                else if(answer.equals("Sea Blue")&&flyingPokemon.contains("Mantyke"))
                {System.out.println("You are Mantyke");}
                
                else if(answer.equals("White")&&flyingPokemon.contains("Togekiss"))
                {System.out.println("You are Togekiss");}
                
                else if(answer.equals("Bright Green")&&flyingPokemon.contains("Yanmega"))
                {System.out.println("You are Yanmega");}
                
                else if(answer.equals("Dark Purple")&&flyingPokemon.contains("Gliscor"))
                {System.out.println("You are Gliscor");}
                
                else if(answer.equals("Ash Gray")&&flyingPokemon.contains("Pidove"))
                {System.out.println("You are Pidove");}
                
                else if(answer.equals("Ash Gray")&&flyingPokemon.contains("Tranquill"))
                {System.out.println("You are Tranquill");}
                
                else if(answer.equals("Ash Gray")&&flyingPokemon.contains("Unfezant"))
                {System.out.println("You are Unfezant");}
                
                else if(answer.equals("Thistle")&&flyingPokemon.contains("Woobat"))
                {System.out.println("You are Woobat");}
                
                else if(answer.equals("Thistle")&&flyingPokemon.contains("Swoobat"))
                {System.out.println("You are Swoobat");}
                
                else if(answer.equals("Sand")&&flyingPokemon.contains("Sigilyph"))
                {System.out.println("You are Sigilyph");}
                
                else if(answer.equals("Scarlet")&&flyingPokemon.contains("Archen"))
                {System.out.println("You are Archen");}
                
                else if(answer.equals("Scarlet")&&flyingPokemon.contains("Archeops"))
                {System.out.println("You are Archeops");}
                
                else if(answer.equals("Turquoise")&&flyingPokemon.contains("Ducklett"))
                {System.out.println("You are Ducklett");}
                
                else if(answer.equals("Turquoise")&&flyingPokemon.contains("Swanna"))
                {System.out.println("You are Swanna");}
                
                else if(answer.equals("Cream")&&flyingPokemon.contains("Emolga"))
                {System.out.println("You are Emolga");}
                
                else if(answer.equals("Air Force Blue")&&flyingPokemon.contains("Rufflet"))
                {System.out.println("You are Rufflet");}
                
                else if(answer.equals("Air Force Blue")&&flyingPokemon.contains("Braviary"))
                {System.out.println("You are Braviary");}
                
                else if(answer.equals("Fuchsia")&&flyingPokemon.contains("Vullaby"))
                {System.out.println("You are Vullaby");}
                
                else if(answer.equals("Fuchsia")&&flyingPokemon.contains("Mandibuzz"))
                {System.out.println("You are Mandibuzz");}
                
                else if(answer.equals("Royal Purple")&&flyingPokemon.contains("Tornadus"))
                {System.out.println("You are Tornadus");}
                
                else if(answer.equals("Electric Blue")&&flyingPokemon.contains("Thundurus"))
                {System.out.println("You are Thundurus");}
                
                else if(answer.equals("Ruddy Brown")&&flyingPokemon.contains("Landorus"))
                {System.out.println("You are Landorus");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
                }
    }
}