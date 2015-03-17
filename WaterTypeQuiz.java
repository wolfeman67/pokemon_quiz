import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class WaterTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> waterPokemon= new ArrayList<String>();
		waterPokemon.add("Squirtle");
		waterPokemon.add("Wartortle");
		waterPokemon.add("Blastoise");
		waterPokemon.add("Psyduck");
		waterPokemon.add("Golduck");
		waterPokemon.add("Poliwag");
		waterPokemon.add("Poliwhirl");
		waterPokemon.add("Poliwrath");
		waterPokemon.add("Tentacool");
		waterPokemon.add("Tentacruel");
		waterPokemon.add("Slowpoke");
		waterPokemon.add("Slowbro");
		waterPokemon.add("Seel");
		waterPokemon.add("Dewgong");
		waterPokemon.add("Shellder");
		waterPokemon.add("Cloyster");
		waterPokemon.add("Krabby");
		waterPokemon.add("Kingler");
		waterPokemon.add("Horsea");
		waterPokemon.add("Seadra");
		waterPokemon.add("Goldeen");
		waterPokemon.add("Seaking");
		waterPokemon.add("Staryu");
		waterPokemon.add("Starmie");
		waterPokemon.add("Magikarp");
		waterPokemon.add("Gyarados");
		waterPokemon.add("Lapras");
		waterPokemon.add("Vaporeon");
		waterPokemon.add("Omanyte");
		waterPokemon.add("Omastar");
		waterPokemon.add("Kabuto");
		waterPokemon.add("Kabutops");
		waterPokemon.add("Totodile");
		waterPokemon.add("Croconaw");
		waterPokemon.add("Feraligatr");
		waterPokemon.add("Chinchou");
		waterPokemon.add("Lanturn");
		waterPokemon.add("Marill");
		waterPokemon.add("Azumarill");
		waterPokemon.add("Politoed");
		waterPokemon.add("Wooper");
		waterPokemon.add("Quagsire");
		waterPokemon.add("Slowking");
		waterPokemon.add("Qwilfish");
		waterPokemon.add("Corsola");
		waterPokemon.add("Remoraid");
		waterPokemon.add("Octillery");
		waterPokemon.add("Mantine");
		waterPokemon.add("Kingdra");
		waterPokemon.add("Suicune");
		waterPokemon.add("Mudkip");
		waterPokemon.add("Marshtomp");
		waterPokemon.add("Swampert");
		waterPokemon.add("Lotad");
		waterPokemon.add("Lombre");
		waterPokemon.add("Ludicolo");
		waterPokemon.add("Wingull");
		waterPokemon.add("Pelipper");
		waterPokemon.add("Surskit");
		waterPokemon.add("Carvanha");
		waterPokemon.add("Sharpedo");
		waterPokemon.add("Wailmer");
		waterPokemon.add("Wailord");
		waterPokemon.add("Barboach");
		waterPokemon.add("Whiscash");
		waterPokemon.add("Corphish");
		waterPokemon.add("Crawdaunt");
		waterPokemon.add("Feebas");
		waterPokemon.add("Milotic");
		waterPokemon.add("Spheal");
		waterPokemon.add("Sealeo");
		waterPokemon.add("Walrein");
		waterPokemon.add("Clamperl");
		waterPokemon.add("Huntail");
		waterPokemon.add("Gorebyss");
		waterPokemon.add("Relicanth");
		waterPokemon.add("Luvdisc");
		waterPokemon.add("Kyogre");
		waterPokemon.add("Piplup");
		waterPokemon.add("Prinplup");
		waterPokemon.add("Empoleon");
		waterPokemon.add("Bibarel");
		waterPokemon.add("Buizel");
		waterPokemon.add("Floatzel");
		waterPokemon.add("Shellos");
		waterPokemon.add("Gastrodon");
		waterPokemon.add("Finneon");
		waterPokemon.add("Lumineon");
		waterPokemon.add("Mantyke");
		waterPokemon.add("Palkia");
		waterPokemon.add("Phione");
		waterPokemon.add("Manaphy");
		waterPokemon.add("Oshawott");
		waterPokemon.add("Dewott");
		waterPokemon.add("Samurott");
		waterPokemon.add("Panpour");
		waterPokemon.add("Simipour");
		waterPokemon.add("Tympole");
		waterPokemon.add("Palpitoad");
		waterPokemon.add("Seismitoad");
		waterPokemon.add("Basculin");
		waterPokemon.add("Tirtouga");
		waterPokemon.add("Carracosta");
		waterPokemon.add("Ducklett");
		waterPokemon.add("Swanna");
		waterPokemon.add("Frillish");
		waterPokemon.add("Jellicent");
		waterPokemon.add("Alomomola");
		waterPokemon.add("Keldeo");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Suicune");
		waterPokemon.remove("Kyogre");
		waterPokemon.remove("Palkia");
		waterPokemon.remove("Phione");
		waterPokemon.remove("Manaphy");
		waterPokemon.remove("Keldeo");
		}
		System.out.println();

		System.out.println("Are you generally up for challenges or dares especially when with friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Krabby");
		waterPokemon.remove("Kingler");
		}
		System.out.println();

		System.out.println("Are you rather easy-going and flexible with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Azurill");
		waterPokemon.remove("Marill");
		waterPokemon.remove("Azumarill");
		}
		System.out.println();

		System.out.println("Do you not like showing people who you truly are inside?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Shellder");
		waterPokemon.remove("Cloyster");
		}
		System.out.println();

		System.out.println("Do you pursue members of the opposite gender often, and in the process annoy them severely?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Luvdisc");
		}
		System.out.println();

		System.out.println("Do you have to work hard in order to attain what pleases you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Piplup");
		waterPokemon.remove("Prinplup");
		waterPokemon.remove("Empoleon");
		}
		System.out.println();

		System.out.println("Does it feel as if someone has been using you quite often lately?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Mantyke");
		waterPokemon.remove("Mantine");
		}
		System.out.println();

		System.out.println("Do you have a hard time tolerating people who are not like you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Basculin");
		}
		System.out.println();

		System.out.println("Do you tend to avoid conflicts with people, even if it would be better to assert yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Horsea");
		waterPokemon.remove("Seadra");
		waterPokemon.remove("Kingdra");
		}
		System.out.println();

		System.out.println("Do you tend to treat people roughly but fairly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Totodile");
		waterPokemon.remove("Croconaw");
		waterPokemon.remove("Feraligatr");
		}
		System.out.println();

		System.out.println("Does what lies beyond in space fascinate and have you ever done night-watching?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Staryu");
		waterPokemon.remove("Starmie");
		}
		System.out.println();

		System.out.println("Do you have a hidden strength that NO ONE would think you have?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Mudkip");
		waterPokemon.remove("Marshtomp");
		waterPokemon.remove("Swampert");
		}
		System.out.println();

		System.out.println("Do you have ADHD or terrible memory?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Psyduck");
		waterPokemon.remove("Golduck");
		}
		System.out.println();

		System.out.println("Are you rather liberal and tolerant with foreigners?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Shellos");
		waterPokemon.remove("Gastrodon");
		}
		System.out.println();

		System.out.println("Do you value safety over pleasure or thrills?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Squirtle");
		waterPokemon.remove("Wartortle");
		waterPokemon.remove("Blastoise");
		}
		System.out.println();

		System.out.println("Are you rather difficult to understand in terms of who you are?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Poliwag");
		waterPokemon.remove("Poliwhirl");
		waterPokemon.remove("Poliwrath");
		waterPokemon.remove("Politoed");
		}
		System.out.println();

		System.out.println("Do you often do relatively large favors for people for no reward?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Lapras");
		}
		System.out.println();

		System.out.println("Do you enjoy controlling or manipulating people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Tentacool");
		waterPokemon.remove("Tentacruel");
		}
		System.out.println();

		System.out.println("Do you prefer a culture that existed in the past as opposed to today's culture?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Omanyte");
		waterPokemon.remove("Omastar");
		waterPokemon.remove("Kabuto");
		waterPokemon.remove("Kabutops");
		waterPokemon.remove("Tirtouga");
		waterPokemon.remove("Carracosta");
		}
		System.out.println();

		System.out.println("Do you enjoy snow and cold temperatures as opposed to the sun and heat?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Seel");
		waterPokemon.remove("Dewgong");
		}
		System.out.println();

		System.out.println("Do you believe that your outer appearance matters as much as or more than who you really are?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Goldeen");
		waterPokemon.remove("Seaking");
		}
		System.out.println();

		if(waterPokemon.contains("Omanyte"))
		{System.out.println("Do you have a really bad inner pack rat who cannot let go of things from the past?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Omanyte");
		waterPokemon.remove("Omastar");
		}
		System.out.println();}

		System.out.println("Are you afraid of the dark or rather what lies in it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Chinchou");
		waterPokemon.remove("Lanturn");
		}
		System.out.println();

		System.out.println("Do you believe that pleasure and joy is what matters the most in life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Lotad");
		waterPokemon.remove("Lombre");
		waterPokemon.remove("Ludicolo");
		}
		System.out.println();

		System.out.println("Are you the largest person out of your group of friends (either in terms of height or weight)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Wailmer");
		waterPokemon.remove("Wailord");
		}
		System.out.println();

		System.out.println("Do you have a certain posession that would cause you to be really depressed if you lost it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Clamperl");
		waterPokemon.remove("Huntail");
		waterPokemon.remove("Gorebyss");
		}
		System.out.println();

		System.out.println("Do you tend to argue with people whose morals, beliefs, or world views are different from yours?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Panpour");
		waterPokemon.remove("Simipour");
		}
		System.out.println();

		System.out.println("Are your opinions stubborn and difficult to change?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Relicanth");
		}
		System.out.println();

		System.out.println("Do you not like it when people touch you without your permission?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Qwilfish");
		}
		System.out.println();

		System.out.println("Would you do almost anything to help one you deem a good friend?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Alomomola");
		}
		System.out.println();

		System.out.println("Does very little actually bother or perturb you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Wooper");
		waterPokemon.remove("Quagsire");
		}
		System.out.println();

		System.out.println("Do you like wearing great amounts of jewelry or fancy clothes?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Corsola");
		}
		System.out.println();

		System.out.println("Are you rather slow at understanding peoples' jokes or ideas?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Slowpoke");
		waterPokemon.remove("Slowbro");
		}
		System.out.println();

		System.out.println("Do you enjoy playing first-person shooters like Halo or Call of Duty more than any other kind of game?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Remoraid");
		waterPokemon.remove("Octillery");
		}
		System.out.println();

		if(waterPokemon.contains("Kabuto"))
		{System.out.println("Are you so aloof or enigmatic to the point of people labeling you as creepy?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Kabuto");
		waterPokemon.remove("Kabutops");
		}
		System.out.println();}

		System.out.println("Would you much rather drive a van or truck than a small, gas-efficient car or motorcycle?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Wingull");
		waterPokemon.remove("Pelipper");
		}
		System.out.println();

		System.out.println("Do you enjoy tormenting people you consider inferior to you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Carvanha");
		waterPokemon.remove("Sharpedo");
		}
		System.out.println();

		System.out.println("Do you tend to fidget with things while you are bored?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Spheal");
		waterPokemon.remove("Sealeo");
		waterPokemon.remove("Walrein");
		}
		System.out.println();

		if(waterPokemon.contains("Tirtouga"))
		{System.out.println("Have you never had a cavity, or braces, or any other issues with your teeth?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Tirtouga");
		waterPokemon.remove("Carracosta");
		}
		System.out.println();}

		System.out.println("Do you go boating or fishing at least monthly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Buizel");
		waterPokemon.remove("Floatzel");
		}
		System.out.println();

		System.out.println("Do you live in a large city or other places that are crowded with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Corphish");
		waterPokemon.remove("Crawdaunt");
		}
		System.out.println();

		System.out.println("Do you find facial hair attractive on a man?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Barboach");
		waterPokemon.remove("Whiscash");
		}
		System.out.println();

		System.out.println("Do you act rather haughty or pompous among your peers?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Frillish");
		waterPokemon.remove("Jellicent");
		}
		System.out.println();

		System.out.println("Are you happy with who you are right now?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Finneon");
		waterPokemon.remove("Lumineon");
		}
		System.out.println();

		System.out.println("Have you had training in any form of a martial art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Oshawott");
		waterPokemon.remove("Dewott");
		waterPokemon.remove("Samurott");
		}
		System.out.println();

		System.out.println("Can you write original pieces of music?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Tympole");
		waterPokemon.remove("Palpitoad");
		waterPokemon.remove("Seismitoad");
		}
		System.out.println();

		System.out.println("Is seafood your favorite kind of food?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Ducklett");
		waterPokemon.remove("Swanna");
		}
		System.out.println();

		if(waterPokemon.contains("Manaphy"))
		{System.out.println("Do you believe that children are wonderful or important?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Manaphy");
		waterPokemon.remove("Phione");
		}
		System.out.println();}






		System.out.println("Are you still legally a child (under the age of 18)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Squirtle");
		waterPokemon.remove("Psyduck");
		waterPokemon.remove("Poliwag");
		waterPokemon.remove("Tentacool");
		waterPokemon.remove("Slowpoke");
		waterPokemon.remove("Seel");
		waterPokemon.remove("Shellder");
		waterPokemon.remove("Krabby");
		waterPokemon.remove("Horsea");
		waterPokemon.remove("Goldeen");
		waterPokemon.remove("Staryu");
		waterPokemon.remove("Magikarp");
		waterPokemon.remove("Omanyte");
		waterPokemon.remove("Kabuto");
		waterPokemon.remove("Totodile");
		waterPokemon.remove("Chinchou");
		waterPokemon.remove("Wooper");
		waterPokemon.remove("Remoraid");
		waterPokemon.remove("Mudkip");
		waterPokemon.remove("Lotad");
		waterPokemon.remove("Wingull");
		waterPokemon.remove("Surskit");
		waterPokemon.remove("Carvanha");
		waterPokemon.remove("Wailmer");
		waterPokemon.remove("Barboach");
		waterPokemon.remove("Corphish");
		waterPokemon.remove("Feebas");
		waterPokemon.remove("Spheal");
		waterPokemon.remove("Clamperl");
		waterPokemon.remove("Piplup");
		waterPokemon.remove("Buizel");
		waterPokemon.remove("Shellos");
		waterPokemon.remove("Finneon");
		waterPokemon.remove("Mantyke");
		waterPokemon.remove("Phione");
		waterPokemon.remove("Oshawott");
		waterPokemon.remove("Panpour");
		waterPokemon.remove("Tympole");
		waterPokemon.remove("Tirtouga");
		waterPokemon.remove("Ducklett");
		waterPokemon.remove("Frillish");}
		if(answer.equals("yes"))
		{waterPokemon.remove("Wartortle");
		waterPokemon.remove("Blastoise");
		waterPokemon.remove("Golduck");
		waterPokemon.remove("Poliwhirl");
		waterPokemon.remove("Poliwrath");
		waterPokemon.remove("Tentacruel");
		waterPokemon.remove("Slowbro");
		waterPokemon.remove("Dewgong");
		waterPokemon.remove("Cloyster");
		waterPokemon.remove("Kingler");
		waterPokemon.remove("Seadra");
		waterPokemon.remove("Seaking");
		waterPokemon.remove("Starmie");
		waterPokemon.remove("Gyarados");
		waterPokemon.remove("Vaporeon");
		waterPokemon.remove("Omastar");
		waterPokemon.remove("Kabutops");
		waterPokemon.remove("Croconaw");
		waterPokemon.remove("Feraligatr");
		waterPokemon.remove("Lanturn");
		waterPokemon.remove("Marill");
		waterPokemon.remove("Azumarill");
		waterPokemon.remove("Politoed");
		waterPokemon.remove("Quagsire");
		waterPokemon.remove("Slowking");
		waterPokemon.remove("Octillery");
		waterPokemon.remove("Mantine");
		waterPokemon.remove("Kingdra");
		waterPokemon.remove("Marshtomp");
		waterPokemon.remove("Swampert");
		waterPokemon.remove("Lombre");
		waterPokemon.remove("Ludicolo");
		waterPokemon.remove("Pelipper");
		waterPokemon.remove("Sharpedo");
		waterPokemon.remove("Wailord");
		waterPokemon.remove("Whiscash");
		waterPokemon.remove("Crawdaunt");
		waterPokemon.remove("Milotic");
		waterPokemon.remove("Sealeo");
		waterPokemon.remove("Walrein");
		waterPokemon.remove("Huntail");
		waterPokemon.remove("Gorebyss");
		waterPokemon.remove("Prinplup");
		waterPokemon.remove("Empoleon");
		waterPokemon.remove("Bibarel");
		waterPokemon.remove("Floatzel");
		waterPokemon.remove("Gastrodon");
		waterPokemon.remove("Lumineon");
		waterPokemon.remove("Manaphy");
		waterPokemon.remove("Dewott");
		waterPokemon.remove("Samurott");
		waterPokemon.remove("Simipour");
		waterPokemon.remove("Palpitoad");
		waterPokemon.remove("Seismitoad");
		waterPokemon.remove("Carracosta");
		waterPokemon.remove("Swanna");
		waterPokemon.remove("Jellicent");}
                System.out.println();

		if(waterPokemon.contains("Empoleon"))
		{System.out.println("Are you rather prideful and dislike it when people mock your image?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Empoleon");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Prinplup");
		}
		System.out.println();}

		if(waterPokemon.contains("Surskit"))
		{System.out.println("Are you relatively popular because of your personality?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Surskit");
		}
		System.out.println();}

		if(waterPokemon.contains("Vaporeon"))
		{System.out.println("Are you rather quiet and relatively enigmatic in social settings?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Vaporeon");
		}
		System.out.println();}

		if(waterPokemon.contains("Feebas"))
		{System.out.println("Are you rather insecure about your physical appearance?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Feebas");
		}
		System.out.println();}

		if(waterPokemon.contains("Milotic"))
		{System.out.println("Can you easily attract members of the opposite gender, often unintentionally?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Milotic");
		}
		System.out.println();}

		if(waterPokemon.contains("Slowking"))
		{System.out.println("Is your manner of speaking or interacting refined and sophisticated?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Slowking");
		}
		System.out.println();}

		if(waterPokemon.contains("Magikarp"))
		{System.out.println("Have you often been teased about some sort of deficiency you have?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Magikarp");
		}
		System.out.println();}

		if(waterPokemon.contains("Gyarados"))
		{System.out.println("Do you have anger management or aggression issues?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Gyarados");
		}
		System.out.println();}

		if(waterPokemon.contains("Bibarel"))
		{System.out.println("Do you work diligently on tasks that are given by your teachers or bosses even if you don't like it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Bibarel");
		}
		System.out.println();}

		if(waterPokemon.contains("Azumarill"))
		{System.out.println("Are you known to be a good listener of people and their problems?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Azumarill");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Marill");
		}
		System.out.println();}

		if(waterPokemon.contains("Poliwrath"))
		{System.out.println("Would you want to stay young forever?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Poliwrath");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Poliwhirl");
		}
		System.out.println();}

		if(waterPokemon.contains("Politoed"))
		{System.out.println("Have you been vocally trained by a teacher?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Politoed");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Poliwhirl");
		}
		System.out.println();}

		if(waterPokemon.contains("Feraligatr"))
		{System.out.println("Is it difficult for you to give up the pursuit of a goal?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Feraligatr");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Croconaw");
		}
		System.out.println();}

		if(waterPokemon.contains("Kingdra"))
		{System.out.println("Do you tend to go to places that are less travelled?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Kingdra");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Seadra");
		}
		System.out.println();}

		if(waterPokemon.contains("Huntail"))
		{System.out.println("Are you male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Huntail");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Gorebyss");
		}
		System.out.println();}

		if(waterPokemon.contains("Seismitoad"))
		{System.out.println("Are you the lead vocalist of a band?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Seismitoad");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Palpitoad");
		}
		System.out.println();}

		if(waterPokemon.contains("Samurott"))
		{System.out.println("Do people generally avoid angering you because you are not one to be messed with?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Samurott");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Dewott");
		}
		System.out.println();}

		if(waterPokemon.contains("Swampert"))
		{System.out.println("Are you rather cautious or a little wary when meeting new people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Swampert");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Marshtomp");
		}
		System.out.println();}

		if(waterPokemon.contains("Ludicolo"))
		{System.out.println("Do you party HARD?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Ludicolo");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Lombre");
		}
		System.out.println();}

		if(waterPokemon.contains("Walrein"))
		{System.out.println("Are you rather plump or overweight, but not neccessarily obese?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Walrein");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Sealeo");
		}
		System.out.println();}

		if(waterPokemon.contains("Blastoise"))
		{System.out.println("Have you been in the military service?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Blastoise");
		}
		if(answer.equals("yes"))
		{waterPokemon.remove("Wartortle");
		}
		System.out.println();}

		if(waterPokemon.contains("Suicune"))
		{System.out.println("Do you often try to change people for the better?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Suicune");
		}
		System.out.println();}

		if(waterPokemon.contains("Kyogre"))
		{System.out.println("Do you enjoy the rain more than you do sunny weather?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Kyogre");
		}
		System.out.println();}

		if(waterPokemon.contains("Palkia"))
		{System.out.println("Do you work with NASA or any other major space program associations?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Palkia");
		}
		System.out.println();}

		if(waterPokemon.contains("Keldeo"))
		{System.out.println("Are you a prodigy of a certain ability?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{waterPokemon.remove("Keldeo");
		}
		System.out.println();}


		if(waterPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(waterPokemon.size()==1)
			out.println("You are " + waterPokemon.get(0));
		if(waterPokemon.size()>1)
		{String waterAura=new String("\n");
		if(waterPokemon.contains("Lapras"))
		{waterAura=waterAura + "Lapis Lazuli\n";}
		if(waterPokemon.contains("Magikarp")||waterPokemon.contains("Gyarados"))
		{waterAura=waterAura + "Crimson\n";}
		if(waterPokemon.contains("Keldeo"))
		{waterAura=waterAura + "Silver\n";}
		if(waterPokemon.contains("Palkia"))
		{waterAura=waterAura + "Gold\n";}
		if(waterPokemon.contains("Poliwag")||waterPokemon.contains("Poliwhirl")||waterPokemon.contains("Poliwrath")||waterPokemon.contains("Politoed"))
		{waterAura=waterAura + "Sea Green\n";}
		if(waterPokemon.contains("Squirtle")||waterPokemon.contains("Wartortle")||waterPokemon.contains("Blastoise"))
		{waterAura=waterAura + "Steel Blue\n";}
		if(waterPokemon.contains("Psyduck")||waterPokemon.contains("Golduck"))
		{waterAura=waterAura + "Saffron\n";}
		if(waterPokemon.contains("Tentacool")||waterPokemon.contains("Tentacruel"))
		{waterAura=waterAura + "Ruby Red\n";}
		if(waterPokemon.contains("Slowpoke")||waterPokemon.contains("Slowbro")||waterPokemon.contains("Slowking"))
		{waterAura=waterAura + "Purple\n";}
		if(waterPokemon.contains("Seel")||waterPokemon.contains("Dewgong"))
		{waterAura=waterAura + "Vanilla\n";}
		if(waterPokemon.contains("Shellder")||waterPokemon.contains("Cloyster"))
		{waterAura=waterAura + "Dark Purple\n";}
		if(waterPokemon.contains("Krabby")||waterPokemon.contains("Kingler"))
		{waterAura=waterAura + "Bronze\n";}
		if(waterPokemon.contains("Horsea")||waterPokemon.contains("Seadra")||waterPokemon.contains("Kingdra"))
		{waterAura=waterAura + "Turquoise\n";}
		if(waterPokemon.contains("Goldeen")||waterPokemon.contains("Seaking"))
		{waterAura=waterAura + "Scarlet\n";}
		if(waterPokemon.contains("Basculin"))
		{waterAura=waterAura + "Dark Green\n";}
		if(waterPokemon.contains("Omanyte")||waterPokemon.contains("Omastar"))
		{waterAura=waterAura + "Sand\n";}
		if(waterPokemon.contains("Kabuto")||waterPokemon.contains("Kabutops"))
		{waterAura=waterAura + "Mahogany\n";}
		if(waterPokemon.contains("Totodile")||waterPokemon.contains("Croconaw")||waterPokemon.contains("Feraligatr"))
		{waterAura=waterAura + "Bright Red\n";}
		if(waterPokemon.contains("Chinchou")||waterPokemon.contains("Lanturn"))
		{waterAura=waterAura + "Yellow\n";}
		if(waterPokemon.contains("Azurill")||waterPokemon.contains("Marill")||waterPokemon.contains("Azumarill"))
		{waterAura=waterAura + "Baby Blue\n";}
		if(waterPokemon.contains("Wooper")||waterPokemon.contains("Quagsire"))
		{waterAura=waterAura + "Mint\n";}
		if(waterPokemon.contains("Qwilfish"))
		{waterAura=waterAura + "Granny Smith Green\n";}
		if(waterPokemon.contains("Corsola"))
		{waterAura=waterAura + "Magenta\n";}
		if(waterPokemon.contains("Remoraid")||waterPokemon.contains("Octillery"))
		{waterAura=waterAura + "Vermillion\n";}
		if(waterPokemon.contains("Mantyke")||waterPokemon.contains("Mantine"))
		{waterAura=waterAura + "Cerulean\n";}
		if(waterPokemon.contains("Suicune"))
		{waterAura=waterAura + "Light Blue\n";}
		if(waterPokemon.contains("Mudkip")||waterPokemon.contains("Marshtomp")||waterPokemon.contains("Swampert"))
		{waterAura=waterAura + "Tangerine\n";}
		if(waterPokemon.contains("Speal")||waterPokemon.contains("Sealeo")||waterPokemon.contains("Walrein"))
		{waterAura=waterAura + "Powder Blue\n";}
		if(waterPokemon.contains("Lotad")||waterPokemon.contains("Lombre")||waterPokemon.contains("Ludicolo"))
		{waterAura=waterAura + "Lime\n";}
		if(waterPokemon.contains("Wingull")||waterPokemon.contains("Pelipper"))
		{waterAura=waterAura + "Seashell\n";}
		if(waterPokemon.contains("Surskit"))
		{waterAura=waterAura + "Mantis Green\n";}
		if(waterPokemon.contains("Carvanha")||waterPokemon.contains("Sharpedo"))
		{waterAura=waterAura + "Dark Blue\n";}
		if(waterPokemon.contains("Wailmer")||waterPokemon.contains("Wailord"))
		{waterAura=waterAura + "Standard Blue\n";}
		if(waterPokemon.contains("Barboach")||waterPokemon.contains("Whiscash"))
		{waterAura=waterAura + "Light Brown\n";}
		if(waterPokemon.contains("Corphish")||waterPokemon.contains("Crawdaunt"))
		{waterAura=waterAura + "Rust\n";}
		if(waterPokemon.contains("Feebas")||waterPokemon.contains("Milotic"))
		{waterAura=waterAura + "Jasmine\n";}
		if(waterPokemon.contains("Relicanth"))
		{waterAura=waterAura + "Sepia\n";}
		if(waterPokemon.contains("Luvdisc"))
		{waterAura=waterAura + "Bright Pink\n";}
		if(waterPokemon.contains("Kyogre"))
		{waterAura=waterAura + "Sapphire\n";}
		if(waterPokemon.contains("Piplup")||waterPokemon.contains("Prinplup")||waterPokemon.contains("Empoleon"))
		{waterAura=waterAura + "Royal Blue\n";}
		if(waterPokemon.contains("Bibarel"))
		{waterAura=waterAura + "Wheat\n";}
		if(waterPokemon.contains("Buizel")||waterPokemon.contains("Floatzel"))
		{waterAura=waterAura + "Orange\n";}
		if(waterPokemon.contains("Shellos")||waterPokemon.contains("Gastrodon"))
		{waterAura=waterAura + "Khaki\n";}
		if(waterPokemon.contains("Finneon")||waterPokemon.contains("Lumineon"))
		{waterAura=waterAura + "Blue Gray\n";}
		if(waterPokemon.contains("Manaphy")||waterPokemon.contains("Phione"))
		{waterAura=waterAura + "Cyan\n";}
		if(waterPokemon.contains("Oshawott")||waterPokemon.contains("Dewott")||waterPokemon.contains("Samurott"))
		{waterAura=waterAura + "Indigo\n";}
		if(waterPokemon.contains("Panpour")||waterPokemon.contains("Simipour"))
		{waterAura=waterAura + "Cream\n";}
		if(waterPokemon.contains("Ducklett")||waterPokemon.contains("Swanna"))
		{waterAura=waterAura + "Periwinkle\n";}
		if(waterPokemon.contains("Alomomola"))
		{waterAura=waterAura + "Rose\n";}
		if(waterPokemon.contains("Tirtouga")||waterPokemon.contains("Carracosta"))
		{waterAura=waterAura + "Charcoal\n";}
		if(waterPokemon.contains("Frillish")||waterPokemon.contains("Jellicent"))
		{waterAura=waterAura + "White\n";}
		if(waterPokemon.contains("Staryu")||waterPokemon.contains("Starmie"))
		{waterAura=waterAura + "Amethyst\n";}
		if(waterPokemon.contains("Clamperl")||waterPokemon.contains("Huntail")||waterPokemon.contains("Gorebyss"))
		{waterAura=waterAura + "Blueberry\n";}
		if(waterPokemon.contains("Tympole")||waterPokemon.contains("Palpitoad")||waterPokemon.contains("Seismitoad"))
		{waterAura=waterAura + "Teal\n";}
		if(waterPokemon.contains("Vaporeon"))
		{waterAura=waterAura+"Celeste\n";}
                
		{System.out.println("Out of these colors:" +waterAura +"which one describes you the most?");
		answer=pokescan.nextLine();
		if(answer.equals("Steel Blue")&&waterPokemon.contains("Squirtle"))
                {System.out.println("You are Squirtle");}
                
                else if(answer.equals("Steel Blue")&&waterPokemon.contains("Wartortle"))
                {System.out.println("You are Wartortle");}
                
                else if(answer.equals("Steel Blue")&&waterPokemon.contains("Blastoise"))
                {System.out.println("You are Blastoise");}
                
                else if(answer.equals("Saffron")&&waterPokemon.contains("Psyduck"))
                {System.out.println("You are Psyduck");}
                
                else if(answer.equals("Saffron")&&waterPokemon.contains("Golduck"))
                {System.out.println("You are Golduck");}
                
                else if(answer.equals("Sea Green")&&waterPokemon.contains("Poliwag"))
                {System.out.println("You are Poliwag");}
                
                else if(answer.equals("Sea Green")&&waterPokemon.contains("Poliwhirl"))
                {System.out.println("You are Poliwhirl");}
                
                else if(answer.equals("Sea Green")&&waterPokemon.contains("Politoed"))
                {System.out.println("You are Politoed");}
                
                else if(answer.equals("Ruby Red")&&waterPokemon.contains("Tentacool"))
                {System.out.println("You are Tentacool");}
                
                else if(answer.equals("Ruby Red")&&waterPokemon.contains("Tentacruel"))
                {System.out.println("You are Tentacruel");}
                
                else if(answer.equals("Purple")&&waterPokemon.contains("Slowpoke"))
                {System.out.println("You are Slowpoke");}
                
                else if(answer.equals("Purple")&&waterPokemon.contains("Slowbro"))
                {System.out.println("You are Slowbro");}
                
                else if(answer.equals("Vanilla")&&waterPokemon.contains("Seel"))
                {System.out.println("You are Seel");}
                
                else if(answer.equals("Vanilla")&&waterPokemon.contains("Dewgong"))
                {System.out.println("You are Dewgong");}
                
                else if(answer.equals("Dark Purple")&&waterPokemon.contains("Shellder"))
                {System.out.println("You are Shellder");}
                
                else if(answer.equals("Dark Purple")&&waterPokemon.contains("Cloyster"))
                {System.out.println("You are Cloyster");}
                
                else if(answer.equals("Bronze")&&waterPokemon.contains("Krabby"))
                {System.out.println("You are Krabby");}
                
                else if(answer.equals("Bronze")&&waterPokemon.contains("Kingler"))
                {System.out.println("You are Kingler");}
                
                else if(answer.equals("Turquoise")&&waterPokemon.contains("Horsea"))
                {System.out.println("You are Horsea");}
                
                else if(answer.equals("Turquoise")&&waterPokemon.contains("Seadra"))
                {System.out.println("You are Seadra");}
                
                else if(answer.equals("Scarlet")&&waterPokemon.contains("Goldeen"))
                {System.out.println("You are Goldeen");}
                
                else if(answer.equals("Scarlet")&&waterPokemon.contains("Seaking"))
                {System.out.println("You are Seaking");}
                
                else if(answer.equals("Amethyst")&&waterPokemon.contains("Staryu"))
                {System.out.println("You are Staryu");}
                
                else if(answer.equals("Amethyst")&&waterPokemon.contains("Starmie"))
                {System.out.println("You are Starmie");}
                
                else if(answer.equals("Crimson")&&waterPokemon.contains("Magikarp"))
                {System.out.println("You are Magikarp");}
                
                else if(answer.equals("Crimson")&&waterPokemon.contains("Gyarados"))
                {System.out.println("You are Gyarados");}
                
                else if(answer.equals("Lapis Lazuli")&&waterPokemon.contains("Lapras"))
                {System.out.println("You are Lapras");}
                
                else if(answer.equals("Celeste")&&waterPokemon.contains("Vaporeon"))
                {System.out.println("You are Vaporeon");}
                
                else if(answer.equals("Sand")&&waterPokemon.contains("Omanyte"))
                {System.out.println("You are Omanyte");}
                
                else if(answer.equals("Sand")&&waterPokemon.contains("Omastar"))
                {System.out.println("You are Omastar");}
                
                else if(answer.equals("Mahogany")&&waterPokemon.contains("Kabuto"))
                {System.out.println("You are Mahogany");}
                
                else if(answer.equals("Mahogany")&&waterPokemon.contains("Kabutops"))
                {System.out.println("You are Kabutops");}
                
                else if(answer.equals("Bright Red")&&waterPokemon.contains("Totodile"))
                {System.out.println("You are Totodile");}
                
                else if(answer.equals("Bright Red")&&waterPokemon.contains("Croconaw"))
                {System.out.println("You are Croconaw");}
                
                else if(answer.equals("Bright Red")&&waterPokemon.contains("Feraligatr"))
                {System.out.println("You are Feraligatr");}
                
                else if(answer.equals("Yellow")&&waterPokemon.contains("Chinchou"))
                {System.out.println("You are Chinchou");}
                
                else if(answer.equals("Yellow")&&waterPokemon.contains("Lanturn"))
                {System.out.println("You are Lanturn");}
                
                else if(answer.equals("Baby Blue")&&waterPokemon.contains("Marill"))
                {System.out.println("You are Marill");}
                
                else if(answer.equals("Baby Blue")&&waterPokemon.contains("Azumarill"))
                {System.out.println("You are Azumarill");}
                
                else if(answer.equals("Sea Green")&&waterPokemon.contains("Politoed"))
                {System.out.println("You are Politoed");}
                
                else if(answer.equals("Mint")&&waterPokemon.contains("Wooper"))
                {System.out.println("You are Wooper");}
                
                else if(answer.equals("Mint")&&waterPokemon.contains("Quagsire"))
                {System.out.println("You are Quagsire");}
                
                else if(answer.equals("Purple")&&waterPokemon.contains("Slowking"))
                {System.out.println("You are Slowking");}
                
                else if(answer.equals("Granny Smith Green")&&waterPokemon.contains("Qwilfish"))
                {System.out.println("You are Qwilfish");}
                
                else if(answer.equals("Magenta")&&waterPokemon.contains("Corsola"))
                {System.out.println("You are Corsola");}
                
                else if(answer.equals("Vermillion")&&waterPokemon.contains("Remoraid"))
                {System.out.println("You are Remoraid");}
                
                else if(answer.equals("Vermillion")&&waterPokemon.contains("Octillery"))
                {System.out.println("You are Octillery");}
                
                else if(answer.equals("Cerulean")&&waterPokemon.contains("Mantine"))
                {System.out.println("You are Mantine");}
                
                else if(answer.equals("Turquoise")&&waterPokemon.contains("Kingdra"))
                {System.out.println("You are Kingdra");}
                
                else if(answer.equals("Light Blue")&&waterPokemon.contains("Suicune"))
                {System.out.println("You are Suicune");}
                
                else if(answer.equals("Tangerine")&&waterPokemon.contains("Mudkip"))
                {System.out.println("You are Mudkip");}
                
                else if(answer.equals("Tangerine")&&waterPokemon.contains("Marshtomp"))
                {System.out.println("You are Marshtomp");}
                
                else if(answer.equals("Tangerine")&&waterPokemon.contains("Swampert"))
                {System.out.println("You are Swampert");}
                
                else if(answer.equals("Lime")&&waterPokemon.contains("Lotad"))
                {System.out.println("You are Lotad");}
                
                else if(answer.equals("Lime")&&waterPokemon.contains("Lombre"))
                {System.out.println("You are Lombre");}
                
                else if(answer.equals("Lime")&&waterPokemon.contains("Ludicolo"))
                {System.out.println("You are Ludicolo");}
                
                else if(answer.equals("Seashell")&&waterPokemon.contains("Wingull"))
                {System.out.println("You are Wingull");}
                
                else if(answer.equals("Seashell")&&waterPokemon.contains("Pelipper"))
                {System.out.println("You are Pelipper");}
                
                else if(answer.equals("Mantis Green")&&waterPokemon.contains("Surskit"))
                {System.out.println("You are Surskit");}
                
                else if(answer.equals("Dark Blue")&&waterPokemon.contains("Carvanha"))
                {System.out.println("You are Carvanha");}
                
                else if(answer.equals("Dark Blue")&&waterPokemon.contains("Sharpedo"))
                {System.out.println("You are Sharpedo");}
                
                else if(answer.equals("Standard Blue")&&waterPokemon.contains("Wailmer"))
                {System.out.println("You are Wailmer");}
                
                else if(answer.equals("Standard Blue")&&waterPokemon.contains("Wailord"))
                {System.out.println("You are Wailord");}
                
                else if(answer.equals("Light Brown")&&waterPokemon.contains("Barboach"))
                {System.out.println("You are Barboach");}
                
                else if(answer.equals("Light Brown")&&waterPokemon.contains("Whiscash"))
                {System.out.println("You are Whiscash");}
                
                else if(answer.equals("Rust")&&waterPokemon.contains("Corphish"))
                {System.out.println("You are Corphish");}
                
                else if(answer.equals("Rust")&&waterPokemon.contains("Crawdaunt"))
                {System.out.println("You are Crawdaunt");}
                
                else if(answer.equals("Jasmine")&&waterPokemon.contains("Feebas"))
                {System.out.println("You are Feebas");}
                
                else if(answer.equals("Jasmine")&&waterPokemon.contains("Milotic"))
                {System.out.println("You are Milotic");}
                
                else if(answer.equals("Powder Blue")&&waterPokemon.contains("Spheal"))
                {System.out.println("You are Spheal");}
                
                else if(answer.equals("Powder Blue")&&waterPokemon.contains("Sealeo"))
                {System.out.println("You are Sealeo");}
                
                else if(answer.equals("Powder Blue")&&waterPokemon.contains("Walrein"))
                {System.out.println("You are Walrein");}
                
                else if(answer.equals("Blueberry")&&waterPokemon.contains("Clamperl"))
                {System.out.println("You are Clamperl");}
                
                else if(answer.equals("Blueberry")&&waterPokemon.contains("Huntail"))
                {System.out.println("You are Huntail");}
                
                else if(answer.equals("Blueberry")&&waterPokemon.contains("Gorebyss"))
                {System.out.println("You are Gorebyss");}
                
                else if(answer.equals("Sepia")&&waterPokemon.contains("Relicanth"))
                {System.out.println("You are Relicanth");}
                
                else if(answer.equals("Bright Pink")&&waterPokemon.contains("Luvdisc"))
                {System.out.println("You are Luvdisc");}
                
                else if(answer.equals("Sapphire")&&waterPokemon.contains("Kyogre"))
                {System.out.println("You are Kyogre");}
                
                else if(answer.equals("Royal Blue")&&waterPokemon.contains("Piplup"))
                {System.out.println("You are Piplup");}
                
                else if(answer.equals("Royal Blue")&&waterPokemon.contains("Prinplup"))
                {System.out.println("You are Prinplup");}
                
                else if(answer.equals("Royal Blue")&&waterPokemon.contains("Empoleon"))
                {System.out.println("You are Empoleon");}
                
                else if(answer.equals("Wheat")&&waterPokemon.contains("Bibarel"))
                {System.out.println("You are Bibarel");}
                
                else if(answer.equals("Orange")&&waterPokemon.contains("Buizel"))
                {System.out.println("You are Buizel");}
                
                else if(answer.equals("Orange")&&waterPokemon.contains("Floatzel"))
                {System.out.println("You are Floatzel");}
                
                else if(answer.equals("Khaki")&&waterPokemon.contains("Shellos"))
                {System.out.println("You are Shellos");}
                
                else if(answer.equals("Khaki")&&waterPokemon.contains("Gastrodon"))
                {System.out.println("You are Gastrodon");}
                
                else if(answer.equals("Blue Gray")&&waterPokemon.contains("Finneon"))
                {System.out.println("You are Finneon");}
                
                else if(answer.equals("Blue Gray")&&waterPokemon.contains("Lumineon"))
                {System.out.println("You are Lumineon");}
                
                else if(answer.equals("Gold")&&waterPokemon.contains("Palkia"))
                {System.out.println("You are Palkia");}
                
                else if(answer.equals("Cyan")&&waterPokemon.contains("Manaphy"))
                {System.out.println("You are Manaphy");}
                
                else if(answer.equals("Cyan")&&waterPokemon.contains("Phione"))
                {System.out.println("You are Phione");}
                
                else if(answer.equals("Indigo")&&waterPokemon.contains("Oshawott"))
                {System.out.println("You are Oshawott");}
                
                else if(answer.equals("Indigo")&&waterPokemon.contains("Dewott"))
                {System.out.println("You are Dewott");}
                
                else if(answer.equals("Indigo")&&waterPokemon.contains("Samurott"))
                {System.out.println("You are Samurott");}
                
                else if(answer.equals("Cream")&&waterPokemon.contains("Panpour"))
                {System.out.println("You are Panpour");}
                
                else if(answer.equals("Cream")&&waterPokemon.contains("Simipour"))
                {System.out.println("You are Simipour");}
                
                else if(answer.equals("Teal")&&waterPokemon.contains("Tympole"))
                {System.out.println("You are Tympole");}
                
                else if(answer.equals("Teal")&&waterPokemon.contains("Palpitoad"))
                {System.out.println("You are Palpitoad");}
                
                else if(answer.equals("Teal")&&waterPokemon.contains("Seismitoad"))
                {System.out.println("You are Seismitoad");}
                
                else if(answer.equals("Dark Green")&&waterPokemon.contains("Basculin"))
                {System.out.println("You are Basculin");}
                
                else if(answer.equals("Charcoal")&&waterPokemon.contains("Tirtouga"))
                {System.out.println("You are Tirtouga");}
                
                else if(answer.equals("Charcoal")&&waterPokemon.contains("Carracosta"))
                {System.out.println("You are Carracosta");}
                
                else if(answer.equals("Periwinkle")&&waterPokemon.contains("Ducklett"))
                {System.out.println("You are Ducklett");}
                
                else if(answer.equals("Periwinkle")&&waterPokemon.contains("Swanna"))
                {System.out.println("You are Swanna");}
                
                else if(answer.equals("White")&&waterPokemon.contains("Frillish"))
                {System.out.println("You are Frillish");}
                
                else if(answer.equals("White")&&waterPokemon.contains("Jellicent"))
                {System.out.println("You are Jellicent");}
                
                else if(answer.equals("Rose")&&waterPokemon.contains("Alomomola"))
                {System.out.println("You are Alomomola");}
                
                else if(answer.equals("Silver")&&waterPokemon.contains("Keldeo"))
                {System.out.println("You are Keldeo");}
                
                else
                {System.out.println("There was an error. You are Missigno");}
    }
}}}
