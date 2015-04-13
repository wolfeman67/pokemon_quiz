import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class DarkTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> darkPokemon= new ArrayList<String>();
		darkPokemon.add("Umbreon");
		darkPokemon.add("Murkrow");
		darkPokemon.add("Sneasel");
		darkPokemon.add("Houndour");
		darkPokemon.add("Houndoom");
		darkPokemon.add("Tyranitar");
		darkPokemon.add("Poochyena");
		darkPokemon.add("Mightyena");
		darkPokemon.add("Nuzleaf");
		darkPokemon.add("Shiftry");
		darkPokemon.add("Sableye");
		darkPokemon.add("Carvanha");
		darkPokemon.add("Sharpedo");
		darkPokemon.add("Cacturne");
		darkPokemon.add("Crawdaunt");
		darkPokemon.add("Absol");
		darkPokemon.add("Honchkrow");
		darkPokemon.add("Stunky");
		darkPokemon.add("Skuntank");
		darkPokemon.add("Spiritomb");
		darkPokemon.add("Drapion");
		darkPokemon.add("Weavile");
		darkPokemon.add("Darkrai");
		darkPokemon.add("Purrloin");
		darkPokemon.add("Liepard");
		darkPokemon.add("Sandile");
		darkPokemon.add("Krokorok");
		darkPokemon.add("Krookodile");
		darkPokemon.add("Scraggy");
		darkPokemon.add("Scrafty");
		darkPokemon.add("Zorua");
		darkPokemon.add("Zoroark");
		darkPokemon.add("Pawniard");
		darkPokemon.add("Bisharp");
		darkPokemon.add("Vullaby");
		darkPokemon.add("Mandibuzz");
		darkPokemon.add("Deino");
		darkPokemon.add("Zweilous");
		darkPokemon.add("Hydreigon");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Darkrai");
		}
		System.out.println();

		System.out.println("Are you misunderstood by most people and generally solitaire?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Absol");
		}
		System.out.println();

		
                System.out.println("Are you a female?");
                answer=pokescan.nextLine();
                if(!answer.equals("yes"))
                {darkPokemon.remove("Vullaby");
                darkPokemon.remove("Mandibuzz");
                }
                System.out.println();
                
                if(darkPokemon.contains("Vullaby")||darkPokemon.contains("Mandibuzz"))
                {System.out.println("Do you like to wear clothing or accessories that you would see at places like Hot Topic?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Vullaby");
		darkPokemon.remove("Mandibuzz");
		}
		System.out.println();}

		System.out.println("Do you like to make your pants sag or do other things that make you have swag?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Scraggy");
		darkPokemon.remove("Scrafty");
		}
		System.out.println();

		System.out.println("Are you great at acting and performing on stage or do you do magic tricks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Zorua");
		darkPokemon.remove("Zoroark");
		}
		System.out.println();

		System.out.println("Are you an expert strategist at games like chess and have you had experience with a martial art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Pawniard");
		darkPokemon.remove("Bisharp");
		}
		System.out.println();

		System.out.println("Do you have the smarts to make most people believe any lie that you could come up with?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Purrloin");
		darkPokemon.remove("Liepard");
		}
		System.out.println();

		System.out.println("Do you have perfect, 20/20 vision?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Sandile");
		darkPokemon.remove("Krokorok");
		darkPokemon.remove("Krookodile");
		}
		System.out.println();

		System.out.println("Do you enjoy picking on those weaker or less smarter than you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Carvanha");
		darkPokemon.remove("Sharpedo");
		}
		System.out.println();

		System.out.println("Do you have a bad reputation that you don't deserve because of things you like or people you are associated with?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Houndour");
		darkPokemon.remove("Houndoom");
		}
		System.out.println();

		System.out.println("Do you feel as if you have a deep connection to the moon?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Umbreon");
		}
		System.out.println();

		System.out.println("Is there a degree of dangerous enmity or anger or violence between members of your family?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Deino");
		darkPokemon.remove("Zweilous");
		darkPokemon.remove("Hydreigon");
		}
		System.out.println();

		System.out.println("Would you live the life of a thief on the run from the law if you had the promise of wealth and fame in the future?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Sneasel");
		darkPokemon.remove("Weavile");
		}
		System.out.println();

		System.out.println("Do you normally smell bad?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Stunky");
		darkPokemon.remove("Skuntank");
		}
		System.out.println();

		System.out.println("When you work with a team, do you tend to let your teammates do most of the work?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Poochyena");
		darkPokemon.remove("Mightyena");
		}
		System.out.println();

		System.out.println("Are you a tree-hugging conservationist that believes that nature matters the most?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Nuzleaf");
		darkPokemon.remove("Shiftry");
		}
		System.out.println();

		System.out.println("Do you eat lots of food, yet manage to burn it all off?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Tyranitar");
		}
		System.out.println();

		System.out.println("Do you have a collection of certain, strange objects that you actively look to add to?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Sableye");
		}
		System.out.println();

		System.out.println("Have you ever stolen any amount of money above 20 dollars?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Murkrow");
		darkPokemon.remove("Honchkrow");
		}
		System.out.println();

		System.out.println("Do you feel as if you have multiple personalities?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Spiritomb");
		}
		System.out.println();

		System.out.println("Do you thrive during the nighttime hours?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Cacturne");
		}
		System.out.println();

		System.out.println("Do you pick fights for silly reasons?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Crawdaunt");
		}
		System.out.println();

		System.out.println("Are you proud of your strength and tend to boast about it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Drapion");
		}
		System.out.println();

		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Houndour");
		darkPokemon.remove("Poochyena");
		darkPokemon.remove("Carvanha");
		darkPokemon.remove("Stunky");
		darkPokemon.remove("Purrloin");
		darkPokemon.remove("Sandile");
		darkPokemon.remove("Scraggy");
		darkPokemon.remove("Zorua");
		darkPokemon.remove("Vullaby");
		darkPokemon.remove("Pawniard");
		darkPokemon.remove("Deino");}
		if(answer.equals("yes"))
		{darkPokemon.remove("Houndoom");
		darkPokemon.remove("Umbreon");
		darkPokemon.remove("Tyranitar");
		darkPokemon.remove("Mightyena");
		darkPokemon.remove("Nuzleaf");
		darkPokemon.remove("Shiftry");
		darkPokemon.remove("Sharpedo");
		darkPokemon.remove("Cacturne");
		darkPokemon.remove("Crawdaunt");
		darkPokemon.remove("Honchkrow");
		darkPokemon.remove("Skuntank");
		darkPokemon.remove("Drapion");
		darkPokemon.remove("Weavile");
		darkPokemon.remove("Liepard");
		darkPokemon.remove("Krokorok");
		darkPokemon.remove("Krookodile");
		darkPokemon.remove("Scrafty");
		darkPokemon.remove("Zoroark");
		darkPokemon.remove("Bisharp");
		darkPokemon.remove("Mandibuzz");
		darkPokemon.remove("Zweilous");
		darkPokemon.remove("Hydreigon");}

		if(darkPokemon.contains("Nuzleaf"))
		{System.out.println("Do you have a hair style that is different from most peoples'?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Shiftry");
		}
		if(answer.equals("yes"))
		{darkPokemon.remove("Nuzleaf");
		}
		System.out.println();}

		if(darkPokemon.contains("Krokorok"))
		{System.out.println("Do you pursue your goals until the end?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Krookodile");
		}
		if(answer.equals("yes"))
		{darkPokemon.remove("Krokorok");
		}
		System.out.println();}

		if(darkPokemon.contains("Zweilous"))
		{System.out.println("Are you the smart one in your dysfunctional family?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{darkPokemon.remove("Hydreigon");
		}
		if(answer.equals("yes"))
		{darkPokemon.remove("Zweilous");
		}
		System.out.println();}

		if(darkPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(darkPokemon.size()==1)
			out.println(darkPokemon.get(0));
		if(darkPokemon.size()>1)
		{String darkAura=new String("\n");
		if(darkPokemon.contains("Purrloin")||darkPokemon.contains("Liepard"))
		{darkAura=darkAura + "Magenta\n";}
		if(darkPokemon.contains("Zorua")||darkPokemon.contains("Zoroark"))
		{darkAura=darkAura + "Licorice\n";}
		if(darkPokemon.contains("Absol"))
		{darkAura=darkAura + "White\n";}
		if(darkPokemon.contains("Poochyena")||darkPokemon.contains("Mightyena"))
		{darkAura=darkAura + "Gray\n";}
		if(darkPokemon.contains("Scraggy")||darkPokemon.contains("Scrafty"))
		{darkAura=darkAura + "Orange\n";}
		if(darkPokemon.contains("Deino")||darkPokemon.contains("Zweilous")||darkPokemon.contains("Hydreigon"))
		{darkAura=darkAura + "Black\n";}
		if(darkPokemon.contains("Umbreon"))
		{darkAura=darkAura + "Saffron\n";}
		if(darkPokemon.contains("Carvanha")||darkPokemon.contains("Sharpedo"))
		{darkAura=darkAura + "Dark Blue\n";}
		if(darkPokemon.contains("Pawniard")||darkPokemon.contains("Bisharp"))
		{darkAura=darkAura + "Gunmetal\n";}
		if(darkPokemon.contains("Vullaby")||darkPokemon.contains("Mandibuzz"))
		{darkAura=darkAura + "Amaranth Pink\n";}
		if(darkPokemon.contains("Darkrai"))
		{darkAura=darkAura + "Gold\n";}
		if(darkPokemon.contains("Houndour")||darkPokemon.contains("Houndoom"))
		{darkAura=darkAura + "Crimson\n";}
		if(darkPokemon.contains("Murkrow")||darkPokemon.contains("Honchkrow"))
		{darkAura=darkAura + "Bright Green\n";}
		if(darkPokemon.contains("Sableye"))
		{darkAura=darkAura + "Glitter\n";}
		if(darkPokemon.contains("Tyranitar"))
		{darkAura=darkAura + "Bronze\n";}
		if(darkPokemon.contains("Nuzleaf")||darkPokemon.contains("Shiftry"))
		{darkAura=darkAura + "Forest Green\n";}
		if(darkPokemon.contains("Sandile")||darkPokemon.contains("Krokorok")||darkPokemon.contains("Krookodile"))
		{darkAura=darkAura + "Sand\n";}
		if(darkPokemon.contains("Crawdaunt"))
		{darkAura=darkAura + "Rust\n";}
		if(darkPokemon.contains("Sneasel")||darkPokemon.contains("Weavile"))
		{darkAura=darkAura + "Steel\n";}
		if(darkPokemon.contains("Spiritomb"))
		{darkAura=darkAura + "Harlequin\n";}
		if(darkPokemon.contains("Stunky")||darkPokemon.contains("Skuntank"))
		{darkAura=darkAura + "Ube\n";}
		if(darkPokemon.contains("Drapion"))
		{darkAura=darkAura + "Dark Purple\n";}
		if(darkPokemon.contains("Cacturne"))
		{darkAura=darkAura + "Dark Green\n";}
		{System.out.println("Out of these colors:" +darkAura +"which one would describe you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Saffron")&&darkPokemon.contains("Umbreon"))
                    {System.out.println("You are Umbreon");}
                
                else if(answer.equals("Bright Green")&&darkPokemon.contains("Murkrow"))
                    {System.out.println("You are Murkrow");}
                
                else if(answer.equals("Steel")&&darkPokemon.contains("Sneasel"))
                    {System.out.println("You are Sneasel");}
                
                else if(answer.equals("Crimson")&&darkPokemon.contains("Houndour"))
                    {System.out.println("You are Houndour");}
                
                else if(answer.equals("Crimson")&&darkPokemon.contains("Houndoom"))
                    {System.out.println("You are Houndoom");}
                
                else if(answer.equals("Bronze")&&darkPokemon.contains("Tyranitar"))
                    {System.out.println("You are Tyranitar");}
                
                else if(answer.equals("Gray")&&darkPokemon.contains("Poochyena"))
                    {System.out.println("You are Poochyena");}
                
                else if(answer.equals("Gray")&&darkPokemon.contains("Mightyena"))
                    {System.out.println("You are Mightyena");}
                
                else if(answer.equals("Forest Green")&&darkPokemon.contains("Nuzleaf"))
                    {System.out.println("You are Nuzleaf");}
                
                else if(answer.equals("Forest Green")&&darkPokemon.contains("Shiftry"))
                    {System.out.println("You are Shiftry");}
                
                else if(answer.equals("Glitter")&&darkPokemon.contains("Sableye"))
                    {System.out.println("You are Sableye");}
                
                else if(answer.equals("Dark Blue")&&darkPokemon.contains("Carvanha"))
                    {System.out.println("You are Carvanha");}
                
                else if(answer.equals("Dark Blue")&&darkPokemon.contains("Sharpedo"))
                    {System.out.println("You are Sharpedo");}
                
                else if(answer.equals("Dark Green")&&darkPokemon.contains("Cacturne"))
                    {System.out.println("You are Cacturne");}
                
                else if(answer.equals("Rust")&&darkPokemon.contains("Crawdaunt"))
                    {System.out.println("You are Crawdaunt");}
                
                else if(answer.equals("White")&&darkPokemon.contains("Absol"))
                    {System.out.println("You are Absol");}
                
                else if(answer.equals("Bright Green")&&darkPokemon.contains("Honchkrow"))
                    {System.out.println("You are Honchkrow");}
                
                else if(answer.equals("Ube")&&darkPokemon.contains("Stunky"))
                    {System.out.println("You are Stunky");}
                
                else if(answer.equals("Ube")&&darkPokemon.contains("Skuntank"))
                    {System.out.println("You are Skuntank");}
                
                else if(answer.equals("Harlequin")&&darkPokemon.contains("Spiritomb"))
                    {System.out.println("You are Spiritomb");}
                
                else if(answer.equals("Dark Purple")&&darkPokemon.contains("Drapion"))
                    {System.out.println("You are Drapion");}
                
                else if(answer.equals("Steel")&&darkPokemon.contains("Weavile"))
                    {System.out.println("You are Weavile");}
                
                else if(answer.equals("Gold")&&darkPokemon.contains("Darkrai"))
                    {System.out.println("You are Darkrai");}
                
                else if(answer.equals("Magenta")&&darkPokemon.contains("Purrloin"))
                    {System.out.println("You are Purrloin");}
                
                else if(answer.equals("Magenta")&&darkPokemon.contains("Liepard"))
                    {System.out.println("You are Liepard");}
                
                else if(answer.equals("Sand")&&darkPokemon.contains("Sandile"))
                    {System.out.println("You are Sandile");}
                
                else if(answer.equals("Sand")&&darkPokemon.contains("Krokorok"))
                    {System.out.println("You are Krokorok");}
                
                else if(answer.equals("Sand")&&darkPokemon.contains("Krookodile"))
                    {System.out.println("You are Krookodile");}
                
                else if(answer.equals("Orange")&&darkPokemon.contains("Scraggy"))
                    {System.out.println("You are Scraggy");}
                
                else if(answer.equals("Orange")&&darkPokemon.contains("Scrafty"))
                    {System.out.println("You are Scrafty");}
                
                else if(answer.equals("Licorice")&&darkPokemon.contains("Zorua"))
                    {System.out.println("You are Zorua");}
                
                else if(answer.equals("Licorice")&&darkPokemon.contains("Zoroark"))
                    {System.out.println("You are Zoroark");}
                
                else if(answer.equals("Gunmetal")&&darkPokemon.contains("Pawniard"))
                    {System.out.println("You are Pawniard");}
                
                else if(answer.equals("Gunmetal")&&darkPokemon.contains("Bisharp"))
                    {System.out.println("You are Bisharp");}
                
                else if(answer.equals("Amaranth Pink")&&darkPokemon.contains("Vullaby"))
                    {System.out.println("You are Vullaby");}
                
                else if(answer.equals("Amaranth Pink")&&darkPokemon.contains("Mandibuzz"))
                    {System.out.println("You are Mandibuzz");}
                
                else if(answer.equals("Black")&&darkPokemon.contains("Deino"))
                    {System.out.println("You are Deino");}
                
                else if(answer.equals("Black")&&darkPokemon.contains("Zweilous"))
                    {System.out.println("You are Zweilous");}
                
                else if(answer.equals("Black")&&darkPokemon.contains("Hydreigon"))
                    {System.out.println("You are Hydreigon");}
                
                else
                    {System.out.println("There was an error. You are Missingno");}
		
    }
}}}
