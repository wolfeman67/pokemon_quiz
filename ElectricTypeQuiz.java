import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class ElectricTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> electricPokemon= new ArrayList<String>();
		electricPokemon.add("Pikachu");
		electricPokemon.add("Raichu");
		electricPokemon.add("Magnemite");
		electricPokemon.add("Magneton");
		electricPokemon.add("Voltorb");
		electricPokemon.add("Electrode");
		electricPokemon.add("Electabuzz");
		electricPokemon.add("Jolteon");
		electricPokemon.add("Zapdos");
		electricPokemon.add("Chinchou");
		electricPokemon.add("Lanturn");
		electricPokemon.add("Pichu");
		electricPokemon.add("Mareep");
		electricPokemon.add("Flaafy");
		electricPokemon.add("Ampharos");
		electricPokemon.add("Elekid");
		electricPokemon.add("Raikou");
		electricPokemon.add("Electrike");
		electricPokemon.add("Manectric");
		electricPokemon.add("Plusle");
		electricPokemon.add("Minun");
		electricPokemon.add("Shinx");
		electricPokemon.add("Luxio");
		electricPokemon.add("Luxray");
		electricPokemon.add("Pachirisu");
		electricPokemon.add("Magnezone");
		electricPokemon.add("Electivire");
		electricPokemon.add("Rotom");
		electricPokemon.add("Blitzle");
		electricPokemon.add("Zebstrika");
		electricPokemon.add("Emolga");
		electricPokemon.add("Joltik");
		electricPokemon.add("Galvantula");
		electricPokemon.add("Tynamo");
		electricPokemon.add("Eelektrik");
		electricPokemon.add("Eelektross");
		electricPokemon.add("Stunfisk");
		electricPokemon.add("Thundurus");
		electricPokemon.add("Zekrom");

    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Zapdos");
		electricPokemon.remove("Raikou");
		electricPokemon.remove("Thundurus");
		electricPokemon.remove("Zekrom");
		}
		System.out.println();

		System.out.println("Do you have anger management problems that often get you in trouble?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Voltorb");
		electricPokemon.remove("Electrode");
		}
		System.out.println();

		System.out.println("Are you a rather popular person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Pikachu");
		electricPokemon.remove("Raichu");
		electricPokemon.remove("Pichu");
		}
		System.out.println();

		System.out.println("Does the field of computer or electrical engineering or hacking interest you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Magnemite");
		electricPokemon.remove("Magneton");
		electricPokemon.remove("Magnezone");
		}
		System.out.println();

		System.out.println("Do you tend to parasite off of your partners or friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Joltik");
		electricPokemon.remove("Galvantula");
		}
		System.out.println();

		System.out.println("Do people tend to not notice you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Stunfisk");
		}
		System.out.println();

		System.out.println("Do you not like sharing your stuff with other people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Pachirisu");
		}
		System.out.println();

		System.out.println("Do you have a certain warmup \"ritual\" that you adhere to before competing or doing something that requires skill?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Elekid");
		electricPokemon.remove("Electabuzz");
		electricPokemon.remove("Electivire");
		}
		System.out.println();

		System.out.println("Are you rather soft and easy-going with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Mareep");
		electricPokemon.remove("Flaafy");
		electricPokemon.remove("Ampharos");
		}
		System.out.println();

		System.out.println("Do you have a certain partner that it would be difficult to live without?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Plusle");
		electricPokemon.remove("Minun");
		}
		System.out.println();

		System.out.println("Are you rather stubborn and tend to rebel with people who attempt to control you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Blitzle");
		electricPokemon.remove("Zebstrika");
		}
		System.out.println();

		System.out.println("Do you like to break down your problems or assignments into smaller pieces?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Tynamo");
		electricPokemon.remove("Eelektrik");
		electricPokemon.remove("Eelektross");
		}
		System.out.println();

		System.out.println("Have you ever sky-dived and enjoyed it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Emolga");
		}
		System.out.println();

		System.out.println("Do you prefer sleeping with a nightlight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Chinchou");
		electricPokemon.remove("Lanturn");
		}
		System.out.println();

		System.out.println("Have you ever hacked into computers or have disabled hardware?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Rotom");
		}
		System.out.println();

		System.out.println("Are you part of a sports or competing team?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Shinx");
		electricPokemon.remove("Luxio");
		electricPokemon.remove("Luxray");
		}
		System.out.println();

		System.out.println("Do you like to run or partake in other track events?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Electrike");
		electricPokemon.remove("Manectric");
		}
		System.out.println();

		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Pichu");
		electricPokemon.remove("Magnemite");
		electricPokemon.remove("Voltorb");
		electricPokemon.remove("Elekid");
		electricPokemon.remove("Chinchou");
		electricPokemon.remove("Mareep");
		electricPokemon.remove("Electrike");
		electricPokemon.remove("Shinx");
		electricPokemon.remove("Blitzle");
		electricPokemon.remove("Joltik");
		electricPokemon.remove("Tynamo");}
		if(answer.equals("yes"))
		{electricPokemon.remove("Raichu");
		electricPokemon.remove("Magneton");
		electricPokemon.remove("Electrode");
		electricPokemon.remove("Electabuzz");
		electricPokemon.remove("Jolteon");
		electricPokemon.remove("Lanturn");
		electricPokemon.remove("Flaafy");
		electricPokemon.remove("Ampharos");
		electricPokemon.remove("Manectric");
		electricPokemon.remove("Luxio");
		electricPokemon.remove("Luxray");
		electricPokemon.remove("Magnezone");
		electricPokemon.remove("Electivire");
		electricPokemon.remove("Zebstrika");
		electricPokemon.remove("Galvantula");
		electricPokemon.remove("Eelektrik");
		electricPokemon.remove("Eelektross");}
		System.out.println();

		if(electricPokemon.contains("Magnezone"))
		{System.out.println("Do you tend to be a peacekeeper amongst your friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Magnezone");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Magneton");
		}
		System.out.println();}

		if(electricPokemon.contains("Raichu"))
		{System.out.println("Have you changed your entire personality for one person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Raichu");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Pikachu");
		}
		System.out.println();}

		if(electricPokemon.contains("Jolteon"))
		{System.out.println("Do you tend to be rather mean when you are stressed or upset?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Jolteon");}
		System.out.println();}

		if(electricPokemon.contains("Ampharos"))
		{System.out.println("Have you ever greatly helped someone by showing them a certain path to go?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Ampharos");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Flaafy");
		}
		System.out.println();}

		if(electricPokemon.contains("Plusle"))
		{System.out.println("Are you the more positive person in your bond/relationship?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Plusle");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Minun");
		}
		System.out.println();}

		if(electricPokemon.contains("Luxray"))
		{System.out.println("Are you the captain or leader of your sports or competitive team?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Luxray");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Luxio");
		}
		System.out.println();}

		if(electricPokemon.contains("Eelektross"))
		{System.out.println("Have you reached a position in life that has caused many people to envy you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Eelektross");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Eelektrik");
		}
		System.out.println();}

		if(electricPokemon.contains("Electivire"))
		{System.out.println("Do you sometimes have the bad habit of throwing caution to the wind?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Electivire");
		}
		if(answer.equals("yes"))
		{electricPokemon.remove("Electabuzz");
		}
		System.out.println();}

		if(electricPokemon.contains("Raikou"))
		{System.out.println("Have you started a major political or social movement?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Raikou");}
		System.out.println();}

		if(electricPokemon.contains("Zapdos"))
		{System.out.println("Have you explored the mysteries of the sky and beyond?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Zapdos");}
		System.out.println();}

		if(electricPokemon.contains("Zekrom"))
		{System.out.println("Do you have an idealogy that people don't neccessarily find ethical even though it has its good points?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Zekrom");}
		System.out.println();}

		if(electricPokemon.contains("Thundurus"))
		{System.out.println("Are you generally disliked by the general populace because of your personality or stance on life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{electricPokemon.remove("Thundurus");}
		System.out.println();}

		if(electricPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(electricPokemon.size()==1)
			out.println("You are" + electricPokemon.get(0));
		if(electricPokemon.size()>1)
		{String electricAura=new String("\n");
		if(electricPokemon.contains("Magnemite")||electricPokemon.contains("Magneton")||electricPokemon.contains("Magnezone"))
		{electricAura=electricAura + "Steel\n";}
		if(electricPokemon.contains("Pichu")||electricPokemon.contains("Pikachu")||electricPokemon.contains("Raichu"))
		{electricAura=electricAura + "Yellow\n";}
		if(electricPokemon.contains("Mareep")||electricPokemon.contains("Flaafy")||electricPokemon.contains("Ampharos"))
		{electricAura=electricAura + "Cream\n";}
		if(electricPokemon.contains("Jolteon"))
		{electricAura=electricAura + "Sunglow\n";}
		if(electricPokemon.contains("Elekid")||electricPokemon.contains("Electabuzz")||electricPokemon.contains("Electivire"))
		{electricAura=electricAura + "Lemon\n";}
		if(electricPokemon.contains("Voltorb")||electricPokemon.contains("Electrode"))
		{electricAura=electricAura + "Red\n";}
		if(electricPokemon.contains("Electrike")||electricPokemon.contains("Manectric"))
		{electricAura=electricAura + "Lime\n";}
		if(electricPokemon.contains("Plusle")||electricPokemon.contains("Minun"))
		{electricAura=electricAura + "Champagne\n";}
		if(electricPokemon.contains("Shinx")||electricPokemon.contains("Luxio")||electricPokemon.contains("Luxray"))
		{electricAura=electricAura + "Electric Blue\n";}
		if(electricPokemon.contains("Pachirisu"))
		{electricAura=electricAura + "Bubbles\n";}
		if(electricPokemon.contains("Blitzle")||electricPokemon.contains("Zebstrika"))
		{electricAura=electricAura + "Licorice\n";}
		if(electricPokemon.contains("Tynamo")||electricPokemon.contains("Eelektrik")||electricPokemon.contains("Eelektross"))
		{electricAura=electricAura + "Dark Blue\n";}
		if(electricPokemon.contains("Rotom"))
		{electricAura=electricAura + "Orange\n";}
		if(electricPokemon.contains("Emolga"))
		{electricAura=electricAura + "Wheat\n";}
		if(electricPokemon.contains("Joltik")||electricPokemon.contains("Galvantula"))
		{electricAura=electricAura + "Amber\n";}
		if(electricPokemon.contains("Stunfisk"))
		{electricAura=electricAura + "Potato\n";}
		if(electricPokemon.contains("Chinchou")||electricPokemon.contains("Lanturn"))
		{electricAura=electricAura + "Blueberry\n";}
		if(electricPokemon.contains("Zekrom"))
		{electricAura=electricAura + "Black\n";}
		if(electricPokemon.contains("Raikou"))
		{electricAura=electricAura + "Purple\n";}
		if(electricPokemon.contains("Zapdos"))
		{electricAura=electricAura + "Gold\n";}
		if(electricPokemon.contains("Thundurus"))
		{electricAura=electricAura + "White\n";}
		{System.out.println("Out of these colors:" +electricAura +"which one would describe you the most?");
		answer=pokescan.nextLine();
                
		if(answer.equals("Yellow")&&electricPokemon.contains("Pikachu"))
                    {System.out.println("You are Pikachu");}
                
                else if(answer.equals("Yellow")&&electricPokemon.contains("Raichu"))
                    {System.out.println("You are Raichu");}
                
                else if(answer.equals("Steel")&&electricPokemon.contains("Magnemite"))
                    {System.out.println("You are Magnemite");}
                
                else if(answer.equals("Steel")&&electricPokemon.contains("Magneton"))
                    {System.out.println("You are Magneton");}
                
                else if(answer.equals("Red")&&electricPokemon.contains("Voltorb"))
                    {System.out.println("You are Voltorb");}
                
                else if(answer.equals("Red")&&electricPokemon.contains("Electrode"))
                    {System.out.println("You are Electrode");}
                
                else if(answer.equals("Lemon")&&electricPokemon.contains("Electabuzz"))
                    {System.out.println("You are Electabuzz");}
                
                else if(answer.equals("Sunglow")&&electricPokemon.contains("Jolteon"))
                    {System.out.println("You are Jolteon");}
                
                else if(answer.equals("Gold")&&electricPokemon.contains("Zapdos"))
                    {System.out.println("You are Zapdos");}
                
                else if(answer.equals("Blueberry")&&electricPokemon.contains("Chinchou"))
                    {System.out.println("You are Chinchou");}
                
                else if(answer.equals("Blueberry")&&electricPokemon.contains("Lanturn"))
                    {System.out.println("You are Lanturn");}
                
                else if(answer.equals("Yellow")&&electricPokemon.contains("Pichu"))
                    {System.out.println("You are Pichu");}
                
                else if(answer.equals("Cream")&&electricPokemon.contains("Mareep"))
                    {System.out.println("You are Mareep");}
                
                else if(answer.equals("Cream")&&electricPokemon.contains("Flaafy"))
                    {System.out.println("You are Flaafy");}
                
                else if(answer.equals("Cream")&&electricPokemon.contains("Ampharos"))
                    {System.out.println("You are Ampharos");}
                
                else if(answer.equals("Lemon")&&electricPokemon.contains("Elekid"))
                    {System.out.println("You are Elekid");}
                
                else if(answer.equals("Purple")&&electricPokemon.contains("Raikou"))
                    {System.out.println("You are Raikou");}
                
                else if(answer.equals("Lime")&&electricPokemon.contains("Electrike"))
                    {System.out.println("You are Electrike");}
                
                else if(answer.equals("Lime")&&electricPokemon.contains("Manectric"))
                    {System.out.println("You are Manectric");}
                
                else if(answer.equals("Champagne")&&electricPokemon.contains("Plusle"))
                    {System.out.println("You are Plusle");}
                
                else if(answer.equals("Champagne")&&electricPokemon.contains("Minun"))
                    {System.out.println("You are Minun");}
                
                else if(answer.equals("Electric Blue")&&electricPokemon.contains("Shinx"))
                    {System.out.println("You are Shinx");}
                
                else if(answer.equals("Electric Blue")&&electricPokemon.contains("Luxio"))
                    {System.out.println("You are Luxio");}
                
                else if(answer.equals("Electric Blue")&&electricPokemon.contains("Luxray"))
                    {System.out.println("You are Luxray");}
                
                else if(answer.equals("Bubbles")&&electricPokemon.contains("Pachirisu"))
                    {System.out.println("You are Pachirisu");}
                
                else if(answer.equals("Steel")&&electricPokemon.contains("Magnezone"))
                    {System.out.println("You are Magnezone");}
                
                else if(answer.equals("Lemon")&&electricPokemon.contains("Electivire"))
                    {System.out.println("You are Electivire");}
                
                else if(answer.equals("Orange")&&electricPokemon.contains("Rotom"))
                    {System.out.println("You are Rotom");}
                
                else if(answer.equals("Licorice")&&electricPokemon.contains("Blitzle"))
                    {System.out.println("You are Blitzle");}
                
                else if(answer.equals("Licorice")&&electricPokemon.contains("Zebstrika"))
                    {System.out.println("You are Zebstrika");}
                
                else if(answer.equals("Wheat")&&electricPokemon.contains("Emolga"))
                    {System.out.println("You are Emolga");}
                
                else if(answer.equals("Amber")&&electricPokemon.contains("Joltik"))
                    {System.out.println("You are Joltik");}
                
                else if(answer.equals("Amber")&&electricPokemon.contains("Galvantula"))
                    {System.out.println("You are Galvantula");}
                
                else if(answer.equals("Dark Blue")&&electricPokemon.contains("Tynamo"))
                    {System.out.println("You are Tynamo");}
                
                else if(answer.equals("Dark Blue")&&electricPokemon.contains("Eelektrik"))
                    {System.out.println("You are Eelektrik");}
                
                else if(answer.equals("Dark Blue")&&electricPokemon.contains("Eelektross"))
                    {System.out.println("You are Eelektross");}
                
                else if(answer.equals("Potato")&&electricPokemon.contains("Stunfisk"))
                    {System.out.println("You are Stunfisk");}
                
                else if(answer.equals("White")&&electricPokemon.contains("Thundurus"))
                    {System.out.println("You are Thundurus");}
                
                else if(answer.equals("Black")&&electricPokemon.contains("Zekrom"))
                    {System.out.println("You are Zekrom");}
                
                else
                    {System.out.println("There was an error. You are Missigno");}
    }}}}
