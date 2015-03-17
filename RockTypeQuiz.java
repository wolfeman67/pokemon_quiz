import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class RockTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> rockPokemon= new ArrayList<String>();
		rockPokemon.add("Geodude");
		rockPokemon.add("Graveler");
		rockPokemon.add("Golem");
		rockPokemon.add("Onix");
		rockPokemon.add("Rhyhorn");
		rockPokemon.add("Rhydon");
		rockPokemon.add("Omanyte");
		rockPokemon.add("Omastar");
		rockPokemon.add("Kabuto");
		rockPokemon.add("Kabutops");
		rockPokemon.add("Aerodactyl");
		rockPokemon.add("Sudowoodo");
		rockPokemon.add("Shuckle");
		rockPokemon.add("Magcargo");
		rockPokemon.add("Corsola");
		rockPokemon.add("Larvitar");
		rockPokemon.add("Pupitar");
		rockPokemon.add("Tyranitar");
		rockPokemon.add("Nosepass");
		rockPokemon.add("Aron");
		rockPokemon.add("Lairon");
		rockPokemon.add("Aggron");
		rockPokemon.add("Lunatone");
		rockPokemon.add("Solrock");
		rockPokemon.add("Lileep");
		rockPokemon.add("Cradily");
		rockPokemon.add("Anorith");
		rockPokemon.add("Armaldo");
		rockPokemon.add("Relicanth");
		rockPokemon.add("Regirock");
		rockPokemon.add("Cranidos");
		rockPokemon.add("Rampardos");
		rockPokemon.add("Shieldon");
		rockPokemon.add("Bastiodon");
		rockPokemon.add("Bonsly");
		rockPokemon.add("Rhyperior");
		rockPokemon.add("Probopass");
		rockPokemon.add("Roggenrola");
		rockPokemon.add("Boldore");
		rockPokemon.add("Gigalith");
		rockPokemon.add("Dwebble");
		rockPokemon.add("Crustle");
		rockPokemon.add("Tirtouga");
		rockPokemon.add("Carracosta");
		rockPokemon.add("Archen");
		rockPokemon.add("Archeops");
		rockPokemon.add("Terrakion");




    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Regirock");
		rockPokemon.remove("Terrakion");
		}
		System.out.println();
                
                System.out.println("Do you prefer a culture that existed in the past as opposed to today's culture?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Omanyte");
		rockPokemon.remove("Omastar");
                rockPokemon.remove("Kabuto");
                rockPokemon.remove("Kabutops");
                rockPokemon.remove("Aerodactyl");
                rockPokemon.remove("Lileep");
                rockPokemon.remove("Cradily");
                rockPokemon.remove("Anorith");
                rockPokemon.remove("Armaldo");
                rockPokemon.remove("Cranidos");
                rockPokemon.remove("Rampardos");
                rockPokemon.remove("Shieldon");
                rockPokemon.remove("Bastiodon");
                rockPokemon.remove("Archen");
                rockPokemon.remove("Archeops");
                rockPokemon.remove("Tirtouga");
                rockPokemon.remove("Carracosta");
		}
		System.out.println();
                
                System.out.println("Do you tend to look up on the bright side of life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Nosepass");
		rockPokemon.remove("Probopass");
		}
		System.out.println();
                
                System.out.println("Is your outer self often decieving of your inner self?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Bonsly");
		rockPokemon.remove("Sudowoodo");
		}
		System.out.println();
                
                if(rockPokemon.contains("Anorith")||rockPokemon.contains("Armaldo"))
                {System.out.println("Are you somewhat of a hipster who likes to set their own trends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Anorith");
		rockPokemon.remove("Armaldo");
		}
		System.out.println();}
                
                System.out.println("Do you have a good sense of direction in terms of what you want your future to be?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Onix");
		rockPokemon.remove("Steelix");
		}
		System.out.println();
                
                if(rockPokemon.contains("Cranidos")||rockPokemon.contains("Rampardos"))
                {System.out.println("Do people believe (possibly incorrectly) that you are nothing more than a stupid musclehead?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Cranidos");
		rockPokemon.remove("Rampardos");
		}
		System.out.println();}
                
                System.out.println("Are you a night person rather than a day person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Lunatone");
		}
                if(answer.equals("yes"))
                {rockPokemon.remove("Solrock");}
		System.out.println();
                
                if(rockPokemon.contains("Shieldon")||rockPokemon.contains("Bastiodon"))
                {System.out.println("Are you generally passive, unless you are trying to stop a conflict or fight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Shieldon");
		rockPokemon.remove("Bastiodon");
		}
		System.out.println();}
                
                System.out.println("Have you had any experience with brewing, cooking, or any other form of the culinary arts?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Shuckle");
		}
		System.out.println();
                
                if(rockPokemon.contains("Lileep")||rockPokemon.contains("Cradily"))
                {System.out.println("Do you believe that in order to make new friends or get a girlfriend/boyfriend you have to hide something about you or pretend that you are something?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Lileep");
                rockPokemon.remove("Cradily");
		}
		System.out.println();}
                
                System.out.println("Do you tend to remain calm or carefree when troubles come your way?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Geodude");
		rockPokemon.remove("Graveler");
                rockPokemon.remove("Golem");
		}
		System.out.println();
                
                if(rockPokemon.contains("Archen")||rockPokemon.contains("Archeops"))
                {System.out.println("Are you generally competent, but tend to give up on tasks when things go hard or you are having a bad day?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Archen");
		rockPokemon.remove("Archeops");
		}
		System.out.println();}
                
                System.out.println("Do you tend to eat a lot of food but are somehow still not overweight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Larvitar");
		rockPokemon.remove("Pupitar");
                rockPokemon.remove("Tyranitar");
		}
		System.out.println();
                
                if(rockPokemon.contains("Aerodactyl"))
                {System.out.println("Do you often get into fights or arguments when your dominance over something is questioned?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Aerodactyl");
		}
		System.out.println();}
                
                System.out.println("Are you rather stubborn in your opinions or actions and tend to do things hastily?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Rhyhorn");
		rockPokemon.remove("Rhydon");
                rockPokemon.remove("Rhyperior");
		}
		System.out.println();
                
                if(rockPokemon.contains("Tirtouga")||rockPokemon.contains("Carracosta"))
                {System.out.println("Have you never had a cavity or other issues with your teeth or corrective treatments like braces?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Tirtouga");
		rockPokemon.remove("Carracosta");
		}
		System.out.println();}
                
                System.out.println("Do you have a habit or aspect of your personality that really irritates everyone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Aron");
		rockPokemon.remove("Lairon");
                rockPokemon.remove("Aggron");
		}
		System.out.println();
                
                if(rockPokemon.contains("Omanyte")||rockPokemon.contains("Omastar"))
                {System.out.println("Are you a pack rat who cannot let go of things from the past, even if you don't use them at all?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Omanyte");
		rockPokemon.remove("Omastar");
		}
		System.out.println();}
                
                System.out.println("Do you feel as if you haven't really changed in terms of who you are for a long time?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Relicanth");
		}
		System.out.println();
                
                System.out.println("Are you always uneasy when traveling to or visiting new places?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Dwebble");
		rockPokemon.remove("Crustle");
		}
		System.out.println();
                
                System.out.println("Do you find it hard to contain your troubles or excitement or other emotions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Roggenrola");
		rockPokemon.remove("Boldore");
                rockPokemon.remove("Gigalith");
		}
		System.out.println();
                
                System.out.println("Do you change your whole look or style regularly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Corsola");
		}
		System.out.println();
                
                if(rockPokemon.contains("Kabuto")||rockPokemon.contains("Kabutops"))
                {System.out.println("Are you rather enigmatic or aloof, sometimes to the point of being called creepy?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Kabuto");
		rockPokemon.remove("Kabutops");
		}
		System.out.println();}



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Geodude");
		rockPokemon.remove("Rhyhorn");
		rockPokemon.remove("Omanyte");
		rockPokemon.remove("Kabuto");
		rockPokemon.remove("Larvitar");
		rockPokemon.remove("Aron");
		rockPokemon.remove("Lileep");
		rockPokemon.remove("Anorith");
		rockPokemon.remove("Cranidos");
		rockPokemon.remove("Shieldon");
		rockPokemon.remove("Bonsly");
		rockPokemon.remove("Roggenrola");
		rockPokemon.remove("Dwebble");
		rockPokemon.remove("Tirtouga");
		rockPokemon.remove("Archen");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Graveler");
		rockPokemon.remove("Golem");
		rockPokemon.remove("Rhydon");
		rockPokemon.remove("Omastar");
		rockPokemon.remove("Kabutops");
		rockPokemon.remove("Aerodactyl");
		rockPokemon.remove("Sudowoodo");
		rockPokemon.remove("Shuckle");
		rockPokemon.remove("Magcargo");
		rockPokemon.remove("Pupitar");
		rockPokemon.remove("Tyranitar");
		rockPokemon.remove("Larion");
		rockPokemon.remove("Aggron");
		rockPokemon.remove("Cradily");
		rockPokemon.remove("Armaldo");
		rockPokemon.remove("Rampardos");
		rockPokemon.remove("Bastiodon");
		rockPokemon.remove("Rhyperior");
		rockPokemon.remove("Probopass");
		rockPokemon.remove("Boldore");
		rockPokemon.remove("Gigalith");
		rockPokemon.remove("Crustle");
		rockPokemon.remove("Carracosta");
		rockPokemon.remove("Archeops");}
                System.out.println();

		if(rockPokemon.contains("Probopass"))
		{System.out.println("Do you find facial hair attractive on a man?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Probopass");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Nosepass");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Gigalith"))
		{System.out.println("Do you have a particular art that you release your emotions into and do other people like this art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Gigalith");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Boldore");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Golem"))
		{System.out.println("Do you believe that a change in your schedule or lifestyle or workspace, once in a while, is a good thing?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Golem");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Graveler");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Tyranitar"))
		{System.out.println("Do you believe that your needs and desires come before those of others?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Tyranitar");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Pupitar");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Aggron"))
		{System.out.println("Do you eat more meat than you do vegetables?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Aggron");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Lairon");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Rhyperior"))
		{System.out.println("Have you had experiene with firearms or guns?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Rhyperior");
		}
		if(answer.equals("yes"))
		{rockPokemon.remove("Rhydon");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Magcargo"))
		{System.out.println("Are you rather slow in your movements or understanding of concepts?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Magcargo");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Terrakion"))
		{System.out.println("Are you a champion for an oppressed or unheard group of people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Terrakion");
		}
		System.out.println();}
                
                if(rockPokemon.contains("Regirock"))
		{System.out.println("Are you a cyborg that has mechanical parts that replace some limbs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{rockPokemon.remove("Regirock");
		}
		System.out.println();}
                


		if(rockPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(rockPokemon.size()==1)
			out.println("You are " + rockPokemon.get(0));
		if(rockPokemon.size()>1)
		{String rockAura=new String("\n");
		if(rockPokemon.contains("Nosepass")||rockPokemon.contains("Probopass"))
		{rockAura=rockAura + "Cyan\n";}
                if(rockPokemon.contains("Bonsly")||rockPokemon.contains("Sudowoodo"))
		{rockAura=rockAura + "Olive\n";}
                if(rockPokemon.contains("Cranidos")||rockPokemon.contains("Rampardos"))
		{rockAura=rockAura + "Slate Gray\n";}
                if(rockPokemon.contains("Roggenrola")||rockPokemon.contains("Boldore")||rockPokemon.contains("Gigalith"))
		{rockAura=rockAura + "Cobalt\n";}
                if(rockPokemon.contains("Geodude")||rockPokemon.contains("Graveler")||rockPokemon.contains("Golem"))
		{rockAura=rockAura + "Bronze\n";}
                if(rockPokemon.contains("Omanyte")||rockPokemon.contains("Omastar"))
		{rockAura=rockAura + "Turquoise\n";}
                if(rockPokemon.contains("Larvitar")||rockPokemon.contains("Pupitar")||rockPokemon.contains("Tyranitar"))
		{rockAura=rockAura + "Dark Green\n";}
                if(rockPokemon.contains("Lileep")||rockPokemon.contains("Cradily"))
		{rockAura=rockAura + "Lilac\n";}
                if(rockPokemon.contains("Anorith")||rockPokemon.contains("Armaldo"))
		{rockAura=rockAura + "Celadon\n";}
                if(rockPokemon.contains("Aerodactyl"))
		{rockAura=rockAura + "Crimson\n";}
                if(rockPokemon.contains("Dwebble")||rockPokemon.contains("Crustle"))
		{rockAura=rockAura + "Auburn\n";}
                if(rockPokemon.contains("Shieldon")||rockPokemon.contains("Bastiodon"))
		{rockAura=rockAura + "Mustard\n";}
                if(rockPokemon.contains("Archen")||rockPokemon.contains("Archeops"))
		{rockAura=rockAura + "Electric Yellow\n";}
                if(rockPokemon.contains("Rhyhorn")||rockPokemon.contains("Rhydon")||rockPokemon.contains("Rhyperior"))
		{rockAura=rockAura + "Battleship Gray\n";}
                if(rockPokemon.contains("Aron")||rockPokemon.contains("Lairon")||rockPokemon.contains("Aggron"))
		{rockAura=rockAura + "Iron\n";}
                if(rockPokemon.contains("Shuckle"))
		{rockAura=rockAura + "Corn\n";}
                if(rockPokemon.contains("Magcargo"))
		{rockAura=rockAura + "Lava\n";}
                if(rockPokemon.contains("Corsola"))
		{rockAura=rockAura + "Coral Pink\n";}
                if(rockPokemon.contains("Relicanth"))
		{rockAura=rockAura + "Russet\n";}
                if(rockPokemon.contains("Tirtouga")||rockPokemon.contains("Carracosta"))
		{rockAura=rockAura + "Ultramarine\n";}
                if(rockPokemon.contains("Onix"))
		{rockAura=rockAura + "Onyx\n";}
                if(rockPokemon.contains("Kabuto")||rockPokemon.contains("Kabutops"))
		{rockAura=rockAura + "Licorice\n";}
                if(rockPokemon.contains("Lunatone"))
		{rockAura=rockAura + "Moonstone\n";}
                if(rockPokemon.contains("Solrock"))
		{rockAura=rockAura + "Sunglow\n";}
                if(rockPokemon.contains("Terrakion"))
		{rockAura=rockAura + "Silver\n";}
                if(rockPokemon.contains("Regirock"))
		{rockAura=rockAura + "Gold\n";}
                System.out.println("Out of these colors: " + rockAura + "which one describes you the most?");
                answer=pokescan.nextLine();
                
                if(answer.equals("Bronze")&&rockPokemon.contains("Geodude"))
                {System.out.println("You are Geodude");}
                
                else if(answer.equals("Bronze")&&rockPokemon.contains("Graveler"))
                {System.out.println("You are Graveler");}
                
                else if(answer.equals("Bronze")&&rockPokemon.contains("Golem"))
                {System.out.println("You are Golem");}
                
                else if(answer.equals("Onyx")&&rockPokemon.contains("Onix"))
                {System.out.println("You are Onix");}
                
                else if(answer.equals("Battleship Gray")&&rockPokemon.contains("Rhyhorn"))
                {System.out.println("You are Rhyhorn");}
                
                else if(answer.equals("Battleship Gray")&&rockPokemon.contains("Rhydon"))
                {System.out.println("You are Rhydon");}
                
                else if(answer.equals("Turquoise")&&rockPokemon.contains("Omanyte"))
                {System.out.println("You are Omanyte");}
                
                else if(answer.equals("Turquoise")&&rockPokemon.contains("Omastar"))
                {System.out.println("You are Omastar");}
                
                else if(answer.equals("Licorice")&&rockPokemon.contains("Kabuto"))
                {System.out.println("You are Kabuto");}
                
                else if(answer.equals("Licorice")&&rockPokemon.contains("Kabutops"))
                {System.out.println("You are Kabutops");}
                
                else if(answer.equals("Crimson")&&rockPokemon.contains("Aerodactyl"))
                {System.out.println("You are Aerodactyl");}
                
                else if(answer.equals("Olive")&&rockPokemon.contains("Sudowoodo"))
                {System.out.println("You are Sudowoodo");}
                
                else if(answer.equals("Corn")&&rockPokemon.contains("Shuckle"))
                {System.out.println("You are Shuckle");}
                
                else if(answer.equals("Lava")&&rockPokemon.contains("Magcargo"))
                {System.out.println("You are Magcargo");}
                
                else if(answer.equals("Coral Pink")&&rockPokemon.contains("Corsola"))
                {System.out.println("You are Corsola");}
                
                else if(answer.equals("Dark Green")&&rockPokemon.contains("Larvitar"))
                {System.out.println("You are Larvitar");}
                
                else if(answer.equals("Dark Green")&&rockPokemon.contains("Pupitar"))
                {System.out.println("You are Pupitar");}
                
                else if(answer.equals("Dark Green")&&rockPokemon.contains("Tyranitar"))
                {System.out.println("You are Tyranitar");}
                
                else if(answer.equals("Cyan")&&rockPokemon.contains("Nosepass"))
                {System.out.println("You are Nosepass");}
                
                else if(answer.equals("Iron")&&rockPokemon.contains("Aron"))
                {System.out.println("You are Aron");}
                
                else if(answer.equals("Iron")&&rockPokemon.contains("Lairon"))
                {System.out.println("You are Lairon");}
                
                else if(answer.equals("Iron")&&rockPokemon.contains("Aggron"))
                {System.out.println("You are Aggron");}
                
                else if(answer.equals("Moonstone")&&rockPokemon.contains("Lunatone"))
                {System.out.println("You are Lunatone");}
                
                else if(answer.equals("Sunglow")&&rockPokemon.contains("Solrock"))
                {System.out.println("You are Solrock");}
                
                else if(answer.equals("Lilac")&&rockPokemon.contains("Lileep"))
                {System.out.println("You are Lileep");}
                
                else if(answer.equals("Lilac")&&rockPokemon.contains("Cradily"))
                {System.out.println("You are Cradily");}
                
                else if(answer.equals("Celadon")&&rockPokemon.contains("Anorith"))
                {System.out.println("You are Anorith");}
                
                else if(answer.equals("Celadon")&&rockPokemon.contains("Armaldo"))
                {System.out.println("You are Armaldo");}
                
                else if(answer.equals("Russet")&&rockPokemon.contains("Relicanth"))
                {System.out.println("You are Relicanth");}
                
                else if(answer.equals("Gold")&&rockPokemon.contains("Regirock"))
                {System.out.println("You are Regirock");}
                
                else if(answer.equals("Slate Gray")&&rockPokemon.contains("Cranidos"))
                {System.out.println("You are Cranidos");}
                
                else if(answer.equals("Slate Gray")&&rockPokemon.contains("Rampardos"))
                {System.out.println("You are Rampardos");}
                
                else if(answer.equals("Mustard")&&rockPokemon.contains("Shieldon"))
                {System.out.println("You are Shieldon");}
                
                else if(answer.equals("Mustard")&&rockPokemon.contains("Bastiodon"))
                {System.out.println("You are Bastiodon");}
                
                else if(answer.equals("Olive")&&rockPokemon.contains("Bonsly"))
                {System.out.println("You are Bonslyl");}
                
                else if(answer.equals("Battleship Gray")&&rockPokemon.contains("Rhyperior"))
                {System.out.println("You are Rhyperior");}
                
                else if(answer.equals("Cyan")&&rockPokemon.contains("Probopass"))
                {System.out.println("You are Probopass");}
                
                else if(answer.equals("Cobalt")&&rockPokemon.contains("Roggenrola"))
                {System.out.println("You are Roggenrola");}
                
                else if(answer.equals("Cobalt")&&rockPokemon.contains("Boldore"))
                {System.out.println("You are Boldore");}
                
                else if(answer.equals("Cobalt")&&rockPokemon.contains("Gigalith"))
                {System.out.println("You are Gigalith");}
                
                else if(answer.equals("Auburn")&&rockPokemon.contains("Dwebble"))
                {System.out.println("You are Dwebble");}
                
                else if(answer.equals("Auburn")&&rockPokemon.contains("Crustle"))
                {System.out.println("You are Crustle");}
                
                else if(answer.equals("Ultramarine")&&rockPokemon.contains("Tirtouga"))
                {System.out.println("You are Tirtouga");}
                
                else if(answer.equals("Ultramarine")&&rockPokemon.contains("Carracosta"))
                {System.out.println("You are Carracosta");}
                
                else if(answer.equals("Electric Yellow")&&rockPokemon.contains("Archen"))
                {System.out.println("You are Archen");}
                
                else if(answer.equals("Electric Yellow")&&rockPokemon.contains("Archeops"))
                {System.out.println("You are Archeops");}
                
                else if(answer.equals("Silver")&&rockPokemon.contains("Terrakion"))
                {System.out.println("You are Terrakion");}
                else
                {System.out.println("There was an error. You are Missingno");}
                
                
    }
}}