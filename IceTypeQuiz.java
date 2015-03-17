import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class IceTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> icePokemon= new ArrayList<String>();
		icePokemon.add("Dewgong");
		icePokemon.add("Cloyster");
		icePokemon.add("Jynx");
		icePokemon.add("Lapras");
		icePokemon.add("Articuno");
		icePokemon.add("Sneasel");
		icePokemon.add("Swinub");
		icePokemon.add("Piloswine");
		icePokemon.add("Delibird");
		icePokemon.add("Smoochum");
		icePokemon.add("Snorunt");
		icePokemon.add("Glalie");
		icePokemon.add("Spheal");
		icePokemon.add("Sealeo");
		icePokemon.add("Walrein");
		icePokemon.add("Regice");
		icePokemon.add("Snover");
		icePokemon.add("Abomasnow");
		icePokemon.add("Weavile");
		icePokemon.add("Glaceon");
		icePokemon.add("Mamoswine");
		icePokemon.add("Froslass");
		icePokemon.add("Vanillite");
		icePokemon.add("Vanillish");
		icePokemon.add("Vanilluxe");
		icePokemon.add("Cubchoo");
		icePokemon.add("Beartic");
		icePokemon.add("Cryogonal");
		icePokemon.add("Kyurem");



    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Articuno");
		icePokemon.remove("Regice");
		icePokemon.remove("Kyurem");
		}
		System.out.println();
                
                System.out.println("Are you female?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Smoochum");
		icePokemon.remove("Jynx");
		icePokemon.remove("Froslass");
		}
		System.out.println();

		System.out.println("Do you enjoy sleeping in and staying up late?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Dewgong");
		}
		System.out.println();

		System.out.println("Are you introverted and closed-up in your mind generally?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Cloyster");
		}
		System.out.println();

		if(icePokemon.contains("Jynx")||icePokemon.contains("Smoochum")||icePokemon.contains("Froslass"))
                {System.out.println("Do guys tend to fight for your attention or try to impress you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Jynx");
		icePokemon.remove("Smoochum");
		icePokemon.remove("Froslass");
		}
		System.out.println();}

		System.out.println("Would you turn to life of thievery if but for the promise of wealth and fame?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Sneasel");
		icePokemon.remove("Weavile");
		}
		System.out.println();

		System.out.println("Would you work as a gourmet, chef, or food critic?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Swinub");
		icePokemon.remove("Piloswine");
		icePokemon.remove("Mamoswine");
		}
		System.out.println();

		System.out.println("Do you believe in Santa Clause?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Delibird");
		}
		System.out.println();

		System.out.println("Do you have secrets (possibly dark secrets) that you haven't told anybody yet and probably won't ever?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Snorunt");
		icePokemon.remove("Glalie");
		}
		System.out.println();

		System.out.println("Are you heavyset or plump?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Spheal");
		icePokemon.remove("Sealeo");
		icePokemon.remove("Walrein");
		}
		System.out.println();

		System.out.println("Do you generally have dessert after a major meal?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Vanillite");
		icePokemon.remove("Vanillish");
		icePokemon.remove("Vanilluxe");
		}
		System.out.println();

		System.out.println("Do you do relatively large favors selflessly for people with no reward in mind?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Lapras");
		}
		System.out.println();

		System.out.println("Do you have a hard time understanding people and their motives?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Snover");
		icePokemon.remove("Abomasnow");
		}
		System.out.println();

		System.out.println("Do you prefer wintertime over summertime?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Cryogonal");
		}
		System.out.println();

		System.out.println("Are you prone to runny noses and colds?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Cubchoo");
		icePokemon.remove("Beartic");
		}
		System.out.println();


		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Cubchoo");
		icePokemon.remove("Snover");
		icePokemon.remove("Vanillite");
		icePokemon.remove("Snorunt");
		icePokemon.remove("Swinub");
		icePokemon.remove("Smoochum");
		icePokemon.remove("Spheal");
		icePokemon.remove("Sneasel");
		}
		if(answer.equals("yes"))
		{icePokemon.remove("Glalie");
		icePokemon.remove("Glaceon");
		icePokemon.remove("Vanilluxe");
		icePokemon.remove("Vanillish");
		icePokemon.remove("Beartic");
		icePokemon.remove("Jynx");
		icePokemon.remove("Piloswine");
		icePokemon.remove("Sealeo");
		icePokemon.remove("Walrein");
		icePokemon.remove("Mamoswine");
		icePokemon.remove("Froslass");
		icePokemon.remove("Dewgong");
		icePokemon.remove("Cloyster");
		icePokemon.remove("Abomasnow");
		icePokemon.remove("Weavile");}
		System.out.println();

		if(icePokemon.contains("Vanilluxe"))
		{System.out.println("Is ice-cream your all time favorite desert?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Vanilluxe");
		}
		if(answer.equals("yes"))
		{icePokemon.remove("Vanillish");
		}
		System.out.println();}
                
                if(icePokemon.contains("Glaceon"))
                {System.out.println("Are you rather quiet and aloof and do you have an aura of mystery surrounding you that entices people?");
                answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Glaceon");
		}
		System.out.println();}

		if(icePokemon.contains("Froslass"))
		{System.out.println("Has someone you rejected still love you and try to make you love them?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Froslass");
		}
		System.out.println();}

		if(icePokemon.contains("Walrein"))
		{System.out.println("Do you find large amounts of facial hair attractive?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Walrein");
		}
		if(answer.equals("yes"))
		{icePokemon.remove("Sealeo");
		}
		System.out.println();}

		if(icePokemon.contains("Mamoswine"))
		{System.out.println("Does the subject of prehistoric history deeply interest you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Mamoswine");
		}
		if(answer.equals("yes"))
		{icePokemon.remove("Piloswine");
		}
		System.out.println();}


		if(icePokemon.contains("Regice"))
		{System.out.println("Are you steadfast and unchaging in your opinions and beliefs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Regice");
		}
		System.out.println();}


		if(icePokemon.contains("Articuno"))
		{System.out.println("Have you ever rescued someone's life from a perilous predicament?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Articuno");
		}
		System.out.println();}


		if(icePokemon.contains("Kyurem"))
		{System.out.println("Do you wish to team up with another great or famous person in some sort of endeavor?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{icePokemon.remove("Kyurem");
		}
		System.out.println();}



		if(icePokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(icePokemon.size()==1)
			out.println("You are " + icePokemon.get(0));
		if(icePokemon.size()>1)
		{	String iceAura=new String("\n");
		if(icePokemon.contains("Vanillite")||icePokemon.contains("Vanillish")||icePokemon.contains("Vanilluxe"))
		{iceAura=iceAura + "Vanilla\n";}
		if(icePokemon.contains("Cubchoo")||icePokemon.contains("Beartic"))
		{iceAura=iceAura + "Blizzard Blue\n";}
		if(icePokemon.contains("Snorunt")||icePokemon.contains("Glalie")||icePokemon.contains("Froslass"))
		{iceAura=iceAura + "Black\n";}
		if(icePokemon.contains("Swinub")||icePokemon.contains("Piloswine")||icePokemon.contains("Mamoswine"))
		{iceAura=iceAura + "Coffee\n";}
		if(icePokemon.contains("Smoochum")||icePokemon.contains("Jynx"))
		{iceAura=iceAura + "Magenta\n";}
		if(icePokemon.contains("Delibird"))
		{iceAura=iceAura + "Cherry\n";}
		if(icePokemon.contains("Lapras"))
		{iceAura=iceAura + "Lapis Lazuli\n";}
		if(icePokemon.contains("Sneasel")||icePokemon.contains("Weavile"))
		{iceAura=iceAura + "Steel\n";}
		if(icePokemon.contains("Snover")||icePokemon.contains("Abomasnow"))
		{iceAura=iceAura + "Pine Green\n";}
		if(icePokemon.contains("Dewgong"))
		{iceAura=iceAura + "Turquoise\n";}
		if(icePokemon.contains("Cloyster"))
		{iceAura=iceAura + "Dark Blue\n";}
		if(icePokemon.contains("Spheal")||icePokemon.contains("Sealeo")||icePokemon.contains("Walrein"))
		{iceAura=iceAura + "Azure\n";}
		if(icePokemon.contains("Cryogonal"))
		{iceAura=iceAura + "Snow\n";}
		if(icePokemon.contains("Glaceon"))
		{iceAura=iceAura + "Celeste\n";}
		if(icePokemon.contains("Regice"))
		{iceAura=iceAura + "Iceberg\n";}
		if(icePokemon.contains("Articuno"))
		{iceAura=iceAura + "Sapphire\n";}
		if(icePokemon.contains("Kyurem"))
		{iceAura=iceAura + "White\n";}
		System.out.println("Out of these colors:" +iceAura +"which one speaks to you the most?");
		answer=pokescan.nextLine();
                
		if(answer.equals("Turquoise")&&icePokemon.contains("Dewgong"))
                {System.out.println("You are Dewgong");}
                
                else if(answer.equals("Dark Blue")&&icePokemon.contains("Cloyster"))
                {System.out.println("You are Cloyster");}
                
                else if(answer.equals("Magenta")&&icePokemon.contains("Jynx"))
                {System.out.println("You are Jynx");}
                
                else if(answer.equals("Lapis Lazuli")&&icePokemon.contains("Lapras"))
                {System.out.println("You are Lapras");}
                
                else if(answer.equals("Sapphire")&&icePokemon.contains("Articuno"))
                {System.out.println("You are Articuno");}
                
                else if(answer.equals("Steel")&&icePokemon.contains("Sneasel"))
                {System.out.println("You are Sneasel");}
                
                else if(answer.equals("Coffee")&&icePokemon.contains("Swinub"))
                {System.out.println("You are Swinub");}
                
                else if(answer.equals("Coffee")&&icePokemon.contains("Piloswine"))
                {System.out.println("You are Piloswine");}
                
                else if(answer.equals("Cherry")&&icePokemon.contains("Delibird"))
                {System.out.println("You are Delibird");}
                
                else if(answer.equals("Magenta")&&icePokemon.contains("Smoochum"))
                {System.out.println("You are Smoochum");}
                
                else if(answer.equals("Black")&&icePokemon.contains("Snorunt"))
                {System.out.println("You are Snorunt");}
                
                else if(answer.equals("Black")&&icePokemon.contains("Glalie"))
                {System.out.println("You are Glalie");}
                
                else if(answer.equals("Azure")&&icePokemon.contains("Spheal"))
                {System.out.println("You are Spheal");}
                
                else if(answer.equals("Azure")&&icePokemon.contains("Sealeo"))
                {System.out.println("You are Sealeo");}
                
                else if(answer.equals("Azure")&&icePokemon.contains("Walrein"))
                {System.out.println("You are Walrein");}
                
                else if(answer.equals("Iceberg")&&icePokemon.contains("Regice"))
                {System.out.println("You are Regice");}
                
                else if(answer.equals("Pine Green")&&icePokemon.contains("Snover"))
                {System.out.println("You are Snover");}
                
                else if(answer.equals("Pine Green")&&icePokemon.contains("Abomasnow"))
                {System.out.println("You are Abomasnow");}
                
                else if(answer.equals("Steel")&&icePokemon.contains("Weavile"))
                {System.out.println("You are Weavile");}
                
                else if(answer.equals("Celeste")&&icePokemon.contains("Glaceon"))
                {System.out.println("You are Glaceon");}
                
                else if(answer.equals("Coffee")&&icePokemon.contains("Mamoswine"))
                {System.out.println("You are Mamoswine");}
                
                else if(answer.equals("Black")&&icePokemon.contains("Froslass"))
                {System.out.println("You are Froslass");}
                
                else if(answer.equals("Vanilla")&&icePokemon.contains("Vanillish"))
                {System.out.println("You are Vanillish");}
                
                else if(answer.equals("Vanilla")&&icePokemon.contains("Vanillite"))
                {System.out.println("You are Vanillite");}
                
                else if(answer.equals("Vanilla")&&icePokemon.contains("Vanilluxe"))
                {System.out.println("You are Vanilluxe");}
                
                else if(answer.equals("Blizzard Blue")&&icePokemon.contains("Cubchoo"))
                {System.out.println("You are Cubchoo");}
                
                else if(answer.equals("Blizzard Blue")&&icePokemon.contains("Beartic"))
                {System.out.println("You are Beartic");}
                
                else if(answer.equals("Snow")&&icePokemon.contains("Cryogonal"))
                {System.out.println("You are Cryogonal");}
                
                else if(answer.equals("White")&&icePokemon.contains("Kyurem"))
                {System.out.println("You are Kyurem");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
    }
}}