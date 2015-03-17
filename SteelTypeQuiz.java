import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class SteelTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> steelPokemon= new ArrayList<String>();
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

    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Registeel");
		steelPokemon.remove("Jirachi");
		steelPokemon.remove("Dialga");
		steelPokemon.remove("Heatran");
		steelPokemon.remove("Cobalion");
		steelPokemon.remove("Genesect");
		}
		System.out.println();

		System.out.println("Would you hack into computers for a living (even if it's dishonest)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Magnemite");
		steelPokemon.remove("Magneton");
		steelPokemon.remove("Magnezone");
		}
		System.out.println();

		System.out.println("Are you an expert strategist at games like chess and have you had experience with a martial art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Pawniard");
		steelPokemon.remove("Bisharp");
		}
		System.out.println();

		System.out.println("Do you have an aspect of your personality or behavior that tends to annoy people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Aron");
		steelPokemon.remove("Lairon");
		steelPokemon.remove("Aggron");
		}
		System.out.println();

		System.out.println("Do you get more energy when you are with more friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Beldum");
		steelPokemon.remove("Metang");
		steelPokemon.remove("Metagross");
		}
		System.out.println();

		System.out.println("Is it amusing to trick stupid people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Mawile");
		}
		System.out.println();

		System.out.println("Are you generally passive unless you are going to stop a conflict?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Shieldon");
		steelPokemon.remove("Bastiodon");
		}
		System.out.println();

		System.out.println("Do people see you as a good luck charm or a person that brightens everyone's day?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Bronzor");
		steelPokemon.remove("Bronzong");
		}
		System.out.println();

		System.out.println("Do you not like it when people touch you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Ferroseed");
		steelPokemon.remove("Ferrothorn");
		}
		System.out.println();

		System.out.println("Are you fascinated with how machines work?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Klink");
		steelPokemon.remove("Klang");
		steelPokemon.remove("Klinklang");
		}
		System.out.println();

		System.out.println("Is your weakness something that others would consider silly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Durant");
		}
		System.out.println();


		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Magnemite");
		steelPokemon.remove("Aron");
		steelPokemon.remove("Beldum");
		steelPokemon.remove("Shieldon");
		steelPokemon.remove("Bronzor");
		steelPokemon.remove("Ferroseed");
		steelPokemon.remove("Klink");
		steelPokemon.remove("Pawniard");
		}
		if(answer.equals("yes"))
		{steelPokemon.remove("Magneton");
		steelPokemon.remove("Forretress");
		steelPokemon.remove("Steelix");
		steelPokemon.remove("Scizor");
		steelPokemon.remove("Lairon");
		steelPokemon.remove("Aggron");
		steelPokemon.remove("Metang");
		steelPokemon.remove("Metagross");
		steelPokemon.remove("Empoleon");
		steelPokemon.remove("Bastiodon");
		steelPokemon.remove("Bronzong");
		steelPokemon.remove("Lucario");
		steelPokemon.remove("Magnezone");
		steelPokemon.remove("Probopass");
		steelPokemon.remove("Excadrill");
		steelPokemon.remove("Escavalier");
		steelPokemon.remove("Ferrothorn");
		steelPokemon.remove("Klang");
		steelPokemon.remove("Klinklang");
		steelPokemon.remove("Bisharp");}
		System.out.println();

		if(steelPokemon.contains("Steelix"))
		{System.out.println("Has a difficult experience made you into a better person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Steelix");
		}
		System.out.println();}

		if(steelPokemon.contains("Lucario"))
		{System.out.println("Are you great at understanding people and their emotions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Lucario");
		}
		System.out.println();}

		if(steelPokemon.contains("Forretress"))
		{System.out.println("Do you usually keep yourself closed off in your little world?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Forretress");
		}
		System.out.println();}

		if(steelPokemon.contains("Scizor"))
		{System.out.println("In terms of super powers, would you rather have armored skin over the ability to fly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Scizor");
		}
		System.out.println();}

		if(steelPokemon.contains("Skarmory"))
		{System.out.println("Do you like challenges or pushing yourself to reach really difficult goals?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Skarmory");
		}
		System.out.println();}

		if(steelPokemon.contains("Empoleon"))
		{System.out.println("Do you become angry when people mock you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Empoleon");
		}
		System.out.println();}

		if(steelPokemon.contains("Probopass"))
		{System.out.println("Do you find facial hair sexy on a man?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Probopass");
		}
		System.out.println();}

		if(steelPokemon.contains("Excadrill"))
		{System.out.println("Do you believe that size does not matter in a fight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Excadrill");
		}
		System.out.println();}

		if(steelPokemon.contains("Escavalier"))
		{System.out.println("Have you been to a Renaissance fair at least once?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Escavalier");
		}
		System.out.println();}

		if(steelPokemon.contains("Aggron"))
		{System.out.println("Do you believe that the way you live your life now is perfect and you wouldn't change it for anything?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Aggron");
		}
		if(answer.equals("yes"))
		{steelPokemon.remove("Lairon");
		}
		System.out.println();}

		if(steelPokemon.contains("Metagross"))
		{System.out.println("Are all of your close friends nerds?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Metagross");
		}
		if(answer.equals("yes"))
		{steelPokemon.remove("Metang");
		}
		System.out.println();}

		if(steelPokemon.contains("Magnezone"))
		{System.out.println("Would you much rather work in a laboratory than in a typical office building?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Magnezone");}
		if(answer.equals("yes"))
		{steelPokemon.remove("Magneton");
		}
		System.out.println();}

		if(steelPokemon.contains("Klinklang"))
		{System.out.println("Are you, or are you on your way to becoming, a mechanical engineer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Klinklang");
		}
		if(answer.equals("yes"))
		{steelPokemon.remove("Klang");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Registeel"))
		{System.out.println("Are you steadfast and unchanging in your philosophical stances?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Registeel");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Jirachi"))
		{System.out.println("Have you made a large and life-changing wish of someone come true?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Jirachi");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Heatran"))
		{System.out.println("Do you think that change is a wonderful thing and do you welcome it with open arms?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Heatran");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Dialga"))
		{System.out.println("Have you ever theorized on how to actually create a functional time machine?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Dialga");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Genesect"))
		{System.out.println("Are you an actual cyborg with functional limbs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Genesect");
		}
		System.out.println();}
		
		if(steelPokemon.contains("Cobalion"))
		{System.out.println("Are you naturally protective but don't like telling people your secrets?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{steelPokemon.remove("Cobalion");
		}
		System.out.println();}



		if(steelPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(steelPokemon.size()==1)
			out.println("You are " +  steelPokemon.get(0));
		if(steelPokemon.size()>1)
		{String steelAura=new String("\n");
		if(steelPokemon.contains("Bronzor")||steelPokemon.contains("Bronzong"))
		{steelAura=steelAura + "Bronze\n";}
                if(steelPokemon.contains("Probopass"))
		{steelAura=steelAura + "Cyan\n";}
                if(steelPokemon.contains("Ferroseed")||steelPokemon.contains("Ferrothorn"))
		{steelAura=steelAura + "Green\n";}
                if(steelPokemon.contains("Magnemite")||steelPokemon.contains("Magneton")||steelPokemon.contains("Magnezone"))
		{steelAura=steelAura + "Electric Yellow\n";}
                if(steelPokemon.contains("Shieldon")||steelPokemon.contains("Bastiodon"))
		{steelAura=steelAura + "Mustard\n";}
                if(steelPokemon.contains("Excadrill"))
		{steelAura=steelAura + "Chestnut\n";}
                if(steelPokemon.contains("Aron")||steelPokemon.contains("Lairon")||steelPokemon.contains("Aggron"))
		{steelAura=steelAura + "Steel Blue\n";}
                if(steelPokemon.contains("Empoleon"))
		{steelAura=steelAura + "Blue\n";}
                if(steelPokemon.contains("Lucario"))
		{steelAura=steelAura + "Royal Blue\n";}
                if(steelPokemon.contains("Skarmory"))
		{steelAura=steelAura + "Crimson\n";}
                if(steelPokemon.contains("Jirachi"))
		{steelAura=steelAura + "Gold\n";}
                if(steelPokemon.contains("Heatran"))
		{steelAura=steelAura + "Burnt Orange\n";}
                if(steelPokemon.contains("Durant"))
		{steelAura=steelAura + "Malachite\n";}
                if(steelPokemon.contains("Steelix"))
		{steelAura=steelAura + "Onyx\n";}
                if(steelPokemon.contains("Forretress"))
		{steelAura=steelAura + "Bright Green\n";}
                if(steelPokemon.contains("Genesect"))
		{steelAura=steelAura + "Electric Purple\n";}
                if(steelPokemon.contains("Scizor"))
		{steelAura=steelAura + "Red\n";}
                if(steelPokemon.contains("Escavalier"))
		{steelAura=steelAura + "Ivory\n";}
                if(steelPokemon.contains("Pawniard")||steelPokemon.contains("Bisharp"))
		{steelAura=steelAura + "Gunmetal\n";}
                if(steelPokemon.contains("Beldum")||steelPokemon.contains("Metang")||steelPokemon.contains("Metagross"))
		{steelAura=steelAura + "Cobalt\n";}
                if(steelPokemon.contains("Cobalion"))
		{steelAura=steelAura + "Silver\n";}
                if(steelPokemon.contains("Dialga"))
		{steelAura=steelAura + "Celestial Blue\n";}
                if(steelPokemon.contains("Mawile"))
		{steelAura=steelAura + "Licorice\n";}
                if(steelPokemon.contains("Klink")||steelPokemon.contains("Klang")||steelPokemon.contains("Klinklang"))
		{steelAura=steelAura + "Iron\n";}
                if(steelPokemon.contains("Registeel"))
		{steelAura=steelAura + "Steel\n";}
                System.out.println("Out of these colors:" +steelAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Electric Yellow")&&steelPokemon.contains("Magnemite"))
                {System.out.println("You are Magnemite");}
                
                else if(answer.equals("Electric Yellow")&&steelPokemon.contains("Magneton"))
                {System.out.println("You are Magneton");}
                
                else if(answer.equals("Bright Green")&&steelPokemon.contains("Forretress"))
                {System.out.println("You are Forretress");}
                
                else if(answer.equals("Onyx")&&steelPokemon.contains("Steelix"))
                {System.out.println("You are Steelix");}
                
                else if(answer.equals("Red")&&steelPokemon.contains("Scizor"))
                {System.out.println("You are Scizor");}
                
                else if(answer.equals("Crimson")&&steelPokemon.contains("Skarmory"))
                {System.out.println("You are Skarmory");}
                
                else if(answer.equals("Licorice")&&steelPokemon.contains("Mawile"))
                {System.out.println("You are Mawile");}
                
                else if(answer.equals("Steel Blue")&&steelPokemon.contains("Aron"))
                {System.out.println("You are Aron");}
                
                else if(answer.equals("Steel Blue")&&steelPokemon.contains("Lairon"))
                {System.out.println("You are Lairon");}
                
                else if(answer.equals("Steel Blue")&&steelPokemon.contains("Aggron"))
                {System.out.println("You are Aggron");}
                
                else if(answer.equals("Cobalt")&&steelPokemon.contains("Beldum"))
                {System.out.println("You are Beldum");}
                
                else if(answer.equals("Cobalt")&&steelPokemon.contains("Metang"))
                {System.out.println("You are Metang");}
                
                else if(answer.equals("Cobalt")&&steelPokemon.contains("Metagross"))
                {System.out.println("You are Metagross");}
                
                else if(answer.equals("Steel")&&steelPokemon.contains("Registeel"))
                {System.out.println("You are Registeel");}
                
                else if(answer.equals("Gold")&&steelPokemon.contains("Jirachi"))
                {System.out.println("You are Jirachi");}
                
                else if(answer.equals("Blue")&&steelPokemon.contains("Empoleon"))
                {System.out.println("You are Empoleon");}
                
                else if(answer.equals("Mustard")&&steelPokemon.contains("Shieldon"))
                {System.out.println("You are Shieldon");}
                
                else if(answer.equals("Mustard")&&steelPokemon.contains("Bastiodon"))
                {System.out.println("You are Bastiodon");}
                
                else if(answer.equals("Bronze")&&steelPokemon.contains("Bronzor"))
                {System.out.println("You are Bronzor");}
                
                else if(answer.equals("Bronze")&&steelPokemon.contains("Bronzong"))
                {System.out.println("You are Bronzong");}
                
                else if(answer.equals("Royal Blue")&&steelPokemon.contains("Lucario"))
                {System.out.println("You are Lucario");}
                
                else if(answer.equals("Electric Yellow")&&steelPokemon.contains("Magnezone"))
                {System.out.println("You are Magnezone");}
                
                else if(answer.equals("Cyan")&&steelPokemon.contains("Probopass"))
                {System.out.println("You are Probopass");}
                
                else if(answer.equals("Celestial Blue")&&steelPokemon.contains("Dialga"))
                {System.out.println("You are Dialga");}
                
                else if(answer.equals("Burnt Orange")&&steelPokemon.contains("Heatran"))
                {System.out.println("You are Heatran");}
                
                else if(answer.equals("Chestnut")&&steelPokemon.contains("Excadrill"))
                {System.out.println("You are Excadrill");}
                
                else if(answer.equals("Ivory")&&steelPokemon.contains("Escavalier"))
                {System.out.println("You are Escavalier");}
                
                else if(answer.equals("Green")&&steelPokemon.contains("Ferroseed"))
                {System.out.println("You are Ferroseed");}
                
                else if(answer.equals("Green")&&steelPokemon.contains("Ferrothorn"))
                {System.out.println("You are Ferrothorn");}
                
                else if(answer.equals("Iron")&&steelPokemon.contains("Klink"))
                {System.out.println("You are Klink");}
                
                else if(answer.equals("Iron")&&steelPokemon.contains("Klang"))
                {System.out.println("You are Klinklang");}
                
                else if(answer.equals("Iron")&&steelPokemon.contains("Klinklang"))
                {System.out.println("You are Klinklang");}
                
                else if(answer.equals("Gunmetal")&&steelPokemon.contains("Pawniard"))
                {System.out.println("You are Pawniard");}
                
                else if(answer.equals("Gunmetal")&&steelPokemon.contains("Bisharp"))
                {System.out.println("You are Bisharp");}
                
                else if(answer.equals("Malachite")&&steelPokemon.contains("Durant"))
                {System.out.println("You are Durant");}
                
                else if(answer.equals("Silver")&&steelPokemon.contains("Cobalion"))
                {System.out.println("You are Cobalion");}
                
                else if(answer.equals("Electric Purple")&&steelPokemon.contains("Genesect"))
                {System.out.println("You are Genesect");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
                
}}}