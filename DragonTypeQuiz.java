import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class DragonTypeQuiz
{
   public static void innerSearch()
    {
    	ArrayList<String> dragonPokemon= new ArrayList<String>();
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




    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Latias");
		dragonPokemon.remove("Latios");
		dragonPokemon.remove("Rayquaza");
		dragonPokemon.remove("Dialga");
		dragonPokemon.remove("Palkia");
		dragonPokemon.remove("Giratina");
		dragonPokemon.remove("Reshiram");
		dragonPokemon.remove("Zekrom");
		dragonPokemon.remove("Kyurem");
		}
		System.out.println();

		System.out.println("Do you have a hard time agreeing with people and tend to argue?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Deino");
		dragonPokemon.remove("Zweilous");
		dragonPokemon.remove("Hydreigon");
		}
		System.out.println();

		System.out.println("Is your quest in life to find or obtain rare and beautiful things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Gible");
		dragonPokemon.remove("Gabite");
		dragonPokemon.remove("Garchomp");
		}
		System.out.println();

		System.out.println("Are you the type to never give up on something that you really believe in or on important goals?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Bagon");
		dragonPokemon.remove("Shelgon");
		dragonPokemon.remove("Salamence");
		}
		System.out.println();

		System.out.println("Are you more active in the sunny morning than the moonlit night?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Druddigon");
		}
		System.out.println();

		System.out.println("Are you quite accepting of ideas, even the ones you don't neccessarily like or find rather strange?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Dratini");
		dragonPokemon.remove("Dragonair");
		dragonPokemon.remove("Dragonite");
		}
		System.out.println();

		System.out.println("Are you the kind of person that never likes to back down on a challenge or a dare, especially when your dignity is on the line?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Axew");
		dragonPokemon.remove("Fraxure");
		dragonPokemon.remove("Haxorus");
		}
		System.out.println();






		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Dratini");
		dragonPokemon.remove("Bagon");
		dragonPokemon.remove("Gible");
		dragonPokemon.remove("Axew");
		dragonPokemon.remove("Deino");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Dragonair");
		dragonPokemon.remove("Dragonite");
		dragonPokemon.remove("Kingdra");
		dragonPokemon.remove("Vibrava");
		dragonPokemon.remove("Flygon");
		dragonPokemon.remove("Altaria");
		dragonPokemon.remove("Shelgon");
		dragonPokemon.remove("Salamence");
		dragonPokemon.remove("Gabite");
		dragonPokemon.remove("Garchomp");
		dragonPokemon.remove("Fraxure");
		dragonPokemon.remove("Haxorus");
		dragonPokemon.remove("Zweilous");
		dragonPokemon.remove("Hydreigon");}
		System.out.println();

		if(dragonPokemon.contains("Altaria"))
		{System.out.println("Do you have the talent to be a singer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Altaria");}
		System.out.println();}

		if(dragonPokemon.contains("Dragonite"))
		{System.out.println("Are you someone who doesn't like or belong in the majority culture?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Dragonite");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Dragonair");
		}
		System.out.println();}

		if(dragonPokemon.contains("Salamence"))
		{System.out.println("Have you reached an achievement of great merit?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Salamence");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Shelgon");
		}
		System.out.println();}

		if(dragonPokemon.contains("Kingdra"))
		{System.out.println("Do you tend to daydream?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Kingdra");}
		System.out.println();}

		if(dragonPokemon.contains("Flygon"))
		{System.out.println("Are you often quiet, despite your intellectual ability or the fact that you think about a lot of things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Flygon");
		dragonPokemon.remove("Vibrava");}
		System.out.println();}

		if(dragonPokemon.contains("Flygon"))
		{System.out.println("Do you have a wonderful talent that no one knows about?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{dragonPokemon.remove("Flygon");
		}
		if(answer.equals("yes"))
		{dragonPokemon.remove("Vibrava");
		}
		System.out.println();}
		
		if(dragonPokemon.contains("Haxorus"))
		{System.out.println("Do you have some sort of body piercing or tattoo?");
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
		{System.out.println("Have you ever mediated between two opposing factions and stopped or prevented a great conflict?");
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
}}}