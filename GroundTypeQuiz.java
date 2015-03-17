import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class GroundTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> groundPokemon= new ArrayList<String>();
		groundPokemon.add("Sandshrew");
		groundPokemon.add("Sandslash");
		groundPokemon.add("Nidoqueen");
		groundPokemon.add("Nidoking");
		groundPokemon.add("Diglett");
		groundPokemon.add("Dugtrio");
		groundPokemon.add("Geodude");
		groundPokemon.add("Graveler");
		groundPokemon.add("Golem");
		groundPokemon.add("Onix");
		groundPokemon.add("Cubone");
		groundPokemon.add("Marowak");
		groundPokemon.add("Rhyhorn");
		groundPokemon.add("Rhydon");
		groundPokemon.add("Wooper");
		groundPokemon.add("Quagsire");
		groundPokemon.add("Gligar");
		groundPokemon.add("Steelix");
		groundPokemon.add("Swinub");
		groundPokemon.add("Piloswine");
		groundPokemon.add("Phanpy");
		groundPokemon.add("Donphan");
		groundPokemon.add("Larvitar");
		groundPokemon.add("Pupitar");
		groundPokemon.add("Marshtomp");
		groundPokemon.add("Swampert");
		groundPokemon.add("Nincada");
		groundPokemon.add("Numel");
		groundPokemon.add("Camerupt");
		groundPokemon.add("Trapinch");
		groundPokemon.add("Vibrava");
		groundPokemon.add("Flygon");
		groundPokemon.add("Barboach");
		groundPokemon.add("Whiscash");
		groundPokemon.add("Baltoy");
		groundPokemon.add("Claydol");
		groundPokemon.add("Groudon");
		groundPokemon.add("Torterra");
		groundPokemon.add("Gastrodon");
		groundPokemon.add("Gible");
		groundPokemon.add("Gabite");
		groundPokemon.add("Garchomp");
		groundPokemon.add("Hippopotas");
		groundPokemon.add("Hippowdon");
		groundPokemon.add("Rhyperior");
		groundPokemon.add("Gliscor");
		groundPokemon.add("Mamoswine");
		groundPokemon.add("Drilbur");
		groundPokemon.add("Excadrill");
		groundPokemon.add("Palpitoad");
		groundPokemon.add("Seismitoad");
		groundPokemon.add("Sandile");
		groundPokemon.add("Krokorok");
		groundPokemon.add("Krookodile");
		groundPokemon.add("Stunfisk");
		groundPokemon.add("Golett");
		groundPokemon.add("Golurk");
		groundPokemon.add("Landorus");



    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known outside your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Groudon");
		groundPokemon.remove("Landorus");
		}
		System.out.println();
                
                System.out.println("Have you lost someone really important or close to you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Cubone");
		groundPokemon.remove("Marowak");
		}
		System.out.println();
                
                System.out.println("Is your quest in life to find or obtain rare and beautiful things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Gible");
		groundPokemon.remove("Gabite");
                groundPokemon.remove("Garchomp");
		}
		System.out.println();
                
                System.out.println("Do you have a certain part of yourself that you only reveal to your closest friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Diglett");
		groundPokemon.remove("Dugtrio");
		}
		System.out.println();
                
                System.out.println("Do people tend to not notice you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Stunfisk");
		}
		System.out.println();
                
                System.out.println("Do you have a low tolerance for silly or stupid things or people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Hippopotas");
		groundPokemon.remove("Hippowdon");
		}
		System.out.println();
                
                System.out.println("Do you have the habit to bulldoze through projects without any planning or foresight?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Rhyhorn");
		groundPokemon.remove("Rhydon");
                groundPokemon.remove("Rhyperior");
		}
		System.out.println();
                
                System.out.println("Do you have perfect vision and don't require any visual aids?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Sandile");
		groundPokemon.remove("Krokorok");
                groundPokemon.remove("Krookodile");
		}
		System.out.println();
                
                System.out.println("Are you incredibly easygoing and does hardly anything bother you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Wooper");
		groundPokemon.remove("Quagsire");
		}
		System.out.println();
                
                System.out.println("Do you believe that patience yields more rewards than aggressive pursuit?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Trapinch");
		groundPokemon.remove("Vibrava");
                groundPokemon.remove("Flygon");
		}
		System.out.println();
                
                System.out.println("Do you treat your toys or possessions as if they had feelings of their own?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Baltoy");
		groundPokemon.remove("Claydol");
		}
		System.out.println();
                
                System.out.println("Are you deeply interested in architecture?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Drilbur");
		groundPokemon.remove("Excadrill");
		}
		System.out.println();
                
                System.out.println("Do you tend to get upset when people touch your things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Barboach");
		groundPokemon.remove("Whiscash");
		}
		System.out.println();
                
                System.out.println("Is eating good food one of your top favorite things to do?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Swinub");
		groundPokemon.remove("Piloswine");
                groundPokemon.remove("Mamoswine");
		}
		System.out.println();
                
                System.out.println("Do you like listening to music with heavy bass sounds in it?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Seismitoad");
		groundPokemon.remove("Palpitoad");
		}
		System.out.println();
                
                System.out.println("Do you tend to find it hard to control your emotions or a certain part of yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Golett");
		groundPokemon.remove("Golurk");
		}
		System.out.println();
                
                System.out.println("Are you generally very slow to open up to people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Sandshrew");
		groundPokemon.remove("Sandslash");
		}
		System.out.println();
                
                System.out.println("Do you believe that anyone has the power to become great through random circumstances or perseverance?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Phanpy");
		groundPokemon.remove("Donphan");
		}
		System.out.println();
                
                System.out.println("Do you like hiking or traveling while on vacation?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Geodude");
		groundPokemon.remove("Graveler");
                groundPokemon.remove("Golem");
		}
		System.out.println();
                
                System.out.println("Are you normally mild natured but become violent when angered?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Numel");
		groundPokemon.remove("Camerupt");
		}
		System.out.println();
                
                System.out.println("Do you tend to eat large amounts of food?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Larvitar");
		groundPokemon.remove("Pupitar");
		}
		System.out.println();
                
                System.out.println("Do you have a strong sense of direction in your life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Onix");
		groundPokemon.remove("Steelix");
		}
		System.out.println();
                
                System.out.println("Do you believe that in order to reach some goals you must play dirty and trick people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Gligar");
		groundPokemon.remove("Gliscor");
		}
		System.out.println();



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Sandshrew");
		groundPokemon.remove("Diglett");
		groundPokemon.remove("Geodude");
		groundPokemon.remove("Cubone");
		groundPokemon.remove("Rhyhorn");
		groundPokemon.remove("Wooper");
		groundPokemon.remove("Swinub");
		groundPokemon.remove("Phanpy");
		groundPokemon.remove("Larvitar");
		groundPokemon.remove("Nincada");
		groundPokemon.remove("Numel");
		groundPokemon.remove("Trapinch");
		groundPokemon.remove("Barboach");
		groundPokemon.remove("Baltoy");
		groundPokemon.remove("Gible");
		groundPokemon.remove("Hippopotas");
		groundPokemon.remove("Drilbur");
		groundPokemon.remove("Sandile");
		groundPokemon.remove("Golett");
		}
                if(answer.equals("yes"))
		{groundPokemon.remove("Sandslash");
		groundPokemon.remove("Nidoqueen");
		groundPokemon.remove("Nidoking");
		groundPokemon.remove("Dugtrio");
		groundPokemon.remove("Graveler");
		groundPokemon.remove("Golem");
		groundPokemon.remove("Marowak");
		groundPokemon.remove("Rhydon");
		groundPokemon.remove("Quagsire");
		groundPokemon.remove("Steelix");
		groundPokemon.remove("Piloswine");
		groundPokemon.remove("Donphan");
		groundPokemon.remove("Pupitar");
		groundPokemon.remove("Marshtomp");
		groundPokemon.remove("Swampert");
		groundPokemon.remove("Camerupt");
		groundPokemon.remove("Vibrava");
		groundPokemon.remove("Flygon");
		groundPokemon.remove("Whiscash");
		groundPokemon.remove("Claydol");
		groundPokemon.remove("Torterra");
		groundPokemon.remove("Gastrodon");
		groundPokemon.remove("Gabite");
		groundPokemon.remove("Garchomp");
		groundPokemon.remove("Hippowdon");
		groundPokemon.remove("Rhyperior");
		groundPokemon.remove("Gliscor");
		groundPokemon.remove("Mamoswine");
		groundPokemon.remove("Excadrill");
		groundPokemon.remove("Palpitoad");
		groundPokemon.remove("Seismitoad");
		groundPokemon.remove("Krokorok");
		groundPokemon.remove("Krookodile");
		groundPokemon.remove("Golurk");}
                System.out.println();

		if(groundPokemon.contains("Seismitoad"))
		{System.out.println("If you work out, do you like to work out with heavy music?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Seismitoad");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Palpitoad");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Flygon"))
		{System.out.println("Can you sing rather well?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Flygon");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Vibrava");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Rhyperior"))
		{System.out.println("Do you believe that a boring yet safe life is better than one full of thrills?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Rhyperior");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Rhydon");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Gliscor"))
		{System.out.println("Do you think that sometimes you have to use the contributions of others in order to reach your own success?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Gliscor");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Gligar");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Krookodile"))
		{System.out.println("Are the features of your body or personality intimidating?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Krookodile");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Krokorok");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Golem"))
		{System.out.println("Do you believe that huge changes in your life are good every one in a while?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Golem");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Graveler");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Steelix"))
		{System.out.println("Has a tough situation made you into a better person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Steelix");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Onix");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Garchomp"))
		{System.out.println("Do you have an amazing ability that no one would expect you of having?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Garchomp");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Gabite");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Mamoswine"))
		{System.out.println("Do you consider yourself to be a rather strange and different person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Mamoswine");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Piloswine");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Groudon"))
		{System.out.println("Are you a leading figure in the study of prehistory or the formation of the Earth?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Groudon");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Landorus"))
		{System.out.println("Are you the head of a farm or a farming corporation?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Landorus");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Nidoking"))
		{System.out.println("Do you not like to be touched by people unless it's someone you're close to and love to be touched by?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Nidoking");
                groundPokemon.remove("Nidoqueen");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Nidoking"))
		{System.out.println("Are you a male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Nidoking");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Nidoqueen");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Swampert"))
		{System.out.println("Did you like to get dirty or muddy while playing when you were a child?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Marshtomp");
                groundPokemon.remove("Swampert");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Swampert"))
		{System.out.println("Can you see through the pretenses of people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Swampert");
		}
		if(answer.equals("yes"))
		{groundPokemon.remove("Marshtomp");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Nincada"))
		{System.out.println("Do you have the tendancy to hide from strangers?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Nincada");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Torterra"))
		{System.out.println("Are you okay with having friends or even complete strangers living in your house for longer than a week or two?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Torterra");
		}
		System.out.println();}
                
                if(groundPokemon.contains("Gastrodon"))
		{System.out.println("Do you believe that men and women are completely different?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{groundPokemon.remove("Gastrodon");
		}
		System.out.println();}


		if(groundPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(groundPokemon.size()==1)
			out.println("You are " + groundPokemon.get(0));
		if(groundPokemon.size()>1)
		{String groundAura=new String("\n");
		if(groundPokemon.contains("Sandshrew")||groundPokemon.contains("Sandslash"))
		{groundAura=groundAura + "Pear\n";}
                if(groundPokemon.contains("Diglett")||groundPokemon.contains("Dugtrio"))
		{groundAura=groundAura + "Chocolate\n";}
                if(groundPokemon.contains("Cubone")||groundPokemon.contains("Marowak"))
		{groundAura=groundAura + "Bone\n";}
                if(groundPokemon.contains("Groudon"))
		{groundAura=groundAura + "Ruby\n";}
                if(groundPokemon.contains("Hippopotas")||groundPokemon.contains("Hippowdon"))
		{groundAura=groundAura + "Sand\n";}
                if(groundPokemon.contains("Trapinch")||groundPokemon.contains("Vibrava")||groundPokemon.contains("Flygon"))
		{groundAura=groundAura + "Lime\n";}
                if(groundPokemon.contains("Sandile")||groundPokemon.contains("Krokorok")||groundPokemon.contains("Krookodile"))
		{groundAura=groundAura + "Crimson\n";}
                if(groundPokemon.contains("Stunfisk"))
		{groundAura=groundAura + "Potato\n";}
                if(groundPokemon.contains("Golett")||groundPokemon.contains("Golurk"))
		{groundAura=groundAura + "Celestial Blue\n";}
                if(groundPokemon.contains("Phanpy")||groundPokemon.contains("Donphan"))
		{groundAura=groundAura + "Ivory\n";}
                if(groundPokemon.contains("Nidoking")||groundPokemon.contains("Nidoqueen"))
		{groundAura=groundAura + "Lust\n";}
                if(groundPokemon.contains("Gible")||groundPokemon.contains("Gabite")||groundPokemon.contains("Garchomp"))
		{groundAura=groundAura + "Navy Blue\n";}
                if(groundPokemon.contains("Swinub")||groundPokemon.contains("Piloswine")||groundPokemon.contains("Mamoswine"))
		{groundAura=groundAura + "Iceberg\n";}
                if(groundPokemon.contains("Drilbur")||groundPokemon.contains("Excadrill"))
		{groundAura=groundAura + "Scarlet\n";}
                if(groundPokemon.contains("Rhyhorn")||groundPokemon.contains("Rhydon")||groundPokemon.contains("Rhyperior"))
		{groundAura=groundAura + "Battleship Gray\n";}
                if(groundPokemon.contains("Marshtomp")||groundPokemon.contains("Swampert"))
		{groundAura=groundAura + "Cyan\n";}
                if(groundPokemon.contains("Gastrodon"))
		{groundAura=groundAura + "Drab\n";}
                if(groundPokemon.contains("Torterra"))
		{groundAura=groundAura + "Spring Green\n";}
                if(groundPokemon.contains("Gligar")||groundPokemon.contains("Gliscor"))
		{groundAura=groundAura + "Dark Purple\n";}
                if(groundPokemon.contains("Baltoy")||groundPokemon.contains("Claydol"))
		{groundAura=groundAura + "Terracotta\n";}
                if(groundPokemon.contains("Onix")||groundPokemon.contains("Steelix"))
		{groundAura=groundAura + "Onyx\n";}
                if(groundPokemon.contains("Geodude")||groundPokemon.contains("Graveler")||groundPokemon.contains("Golem"))
		{groundAura=groundAura + "Bronze\n";}
                if(groundPokemon.contains("Wooper")||groundPokemon.contains("Quagsire"))
		{groundAura=groundAura + "Grape Purple\n";}
                if(groundPokemon.contains("Larvitar")||groundPokemon.contains("Pupitar"))
		{groundAura=groundAura + "Dark Green\n";}
                if(groundPokemon.contains("Nincada"))
		{groundAura=groundAura + "Eggshell\n";}
                if(groundPokemon.contains("Numel")||groundPokemon.contains("Camerupt"))
		{groundAura=groundAura + "Tangerine\n";}
                if(groundPokemon.contains("Barboach")||groundPokemon.contains("Whiscash"))
		{groundAura=groundAura + "Indigo\n";}
                if(groundPokemon.contains("Palpitoad")||groundPokemon.contains("Seismitoad"))
		{groundAura=groundAura + "Ultramarine\n";}
                if(groundPokemon.contains("Landorus"))
                {groundAura=groundAura + "Gold\n";}
                System.out.println("Out of these colors: " + groundAura + "which one describes you the most?");
                answer=pokescan.nextLine();
                
                if(answer.equals("Pear")&&groundPokemon.contains("Sandshrew"))
                {System.out.println("You are Sandshrew");}
                
                else if(answer.equals("Pear")&&groundPokemon.contains("Sandslash"))
                {System.out.println("You are Sandslash");}
                
                else if(answer.equals("Lust")&&groundPokemon.contains("Nidoqueen"))
                {System.out.println("You are Nidoqueen");}
                
                else if(answer.equals("Lust")&&groundPokemon.contains("Nidoking"))
                {System.out.println("You are Nidoking");}
                
                else if(answer.equals("Chocolate")&&groundPokemon.contains("Diglett"))
                {System.out.println("You are Diglett");}
                
                else if(answer.equals("Chocolate")&&groundPokemon.contains("Dugtrio"))
                {System.out.println("You are Dugtrio");}
                
                else if(answer.equals("Bronze")&&groundPokemon.contains("Geodude"))
                {System.out.println("You are Geodude");}
                
                else if(answer.equals("Bronze")&&groundPokemon.contains("Graveler"))
                {System.out.println("You are Graveler");}
                
                else if(answer.equals("Bronze")&&groundPokemon.contains("Golem"))
                {System.out.println("You are Golem");}
                
                else if(answer.equals("Onyx")&&groundPokemon.contains("Onix"))
                {System.out.println("You are Onix");}
                
                else if(answer.equals("Bone")&&groundPokemon.contains("Cubone"))
                {System.out.println("You are Cubone");}
                
                else if(answer.equals("Bone")&&groundPokemon.contains("Marowak"))
                {System.out.println("You are Marowak");}
                
                else if(answer.equals("Battleship Gray")&&groundPokemon.contains("Rhyhorn"))
                {System.out.println("You are Rhyhorn");}
                
                else if(answer.equals("Battleship Gray")&&groundPokemon.contains("Rhydon"))
                {System.out.println("You are Rhydon");}
                
                else if(answer.equals("Grape Purple")&&groundPokemon.contains("Wooper"))
                {System.out.println("You are Wooper");}
                
                else if(answer.equals("Grape Purple")&&groundPokemon.contains("Quagsire"))
                {System.out.println("You are Quagsire");}
                
                else if(answer.equals("Dark Purple")&&groundPokemon.contains("Gligar"))
                {System.out.println("You are Gligar");}
                
                else if(answer.equals("Onyx")&&groundPokemon.contains("Steelix"))
                {System.out.println("You are Steelix");}
                
                else if(answer.equals("Iceberg")&&groundPokemon.contains("Swinub"))
                {System.out.println("You are Swinub");}
                
                else if(answer.equals("Iceberg")&&groundPokemon.contains("Piloswine"))
                {System.out.println("You are Piloswine");}
                
                else if(answer.equals("Ivory")&&groundPokemon.contains("Phanpy"))
                {System.out.println("You are Phanpy");}
                
                else if(answer.equals("Ivory")&&groundPokemon.contains("Donphan"))
                {System.out.println("You are Donphan");}
                
                else if(answer.equals("Dark Green")&&groundPokemon.contains("Larvitar"))
                {System.out.println("You are Larvitar");}
                
                else if(answer.equals("Dark Green")&&groundPokemon.contains("Pupitar"))
                {System.out.println("You are Pupitar");}
                
                else if(answer.equals("Cyan")&&groundPokemon.contains("Marshtomp"))
                {System.out.println("You are Marshtomp");}
                
                else if(answer.equals("Cyan")&&groundPokemon.contains("Swampert"))
                {System.out.println("You are Swampert");}
                
                else if(answer.equals("Eggshell")&&groundPokemon.contains("Nincada"))
                {System.out.println("You are Nincada");}
                
                else if(answer.equals("Tangerine")&&groundPokemon.contains("Numel"))
                {System.out.println("You are Numel");}
                
                else if(answer.equals("Tangerine")&&groundPokemon.contains("Camerupt"))
                {System.out.println("You are Camerupt");}
                
                else if(answer.equals("Lime")&&groundPokemon.contains("Trapinch"))
                {System.out.println("You are Trapinch");}
                
                else if(answer.equals("Lime")&&groundPokemon.contains("Vibrava"))
                {System.out.println("You are Vibrava");}
                
                else if(answer.equals("Lime")&&groundPokemon.contains("Flygon"))
                {System.out.println("You are Flygon");}
                
                else if(answer.equals("Indigo")&&groundPokemon.contains("Barboach"))
                {System.out.println("You are Barboach");}
                
                else if(answer.equals("Indigo")&&groundPokemon.contains("Whiscash"))
                {System.out.println("You are Whiscash");}
                
                else if(answer.equals("Terracotta")&&groundPokemon.contains("Baltoy"))
                {System.out.println("You are Baltoy");}
                
                else if(answer.equals("Terracotta")&&groundPokemon.contains("Claydol"))
                {System.out.println("You are Claydol");}
                
                else if(answer.equals("Ruby")&&groundPokemon.contains("Groudon"))
                {System.out.println("You are Groudon");}
                
                else if(answer.equals("Spring Green")&&groundPokemon.contains("Torterra"))
                {System.out.println("You are Torterra");}
                
                else if(answer.equals("Drab")&&groundPokemon.contains("Gastrodon"))
                {System.out.println("You are Gastrodon");}
                
                else if(answer.equals("Navy Blue")&&groundPokemon.contains("Gible"))
                {System.out.println("You are Gible");}
                
                else if(answer.equals("Navy Blue")&&groundPokemon.contains("Gabite"))
                {System.out.println("You are Gabite");}
                
                else if(answer.equals("Navy Blue")&&groundPokemon.contains("Garchomp"))
                {System.out.println("You are Garchomp");}
                
                else if(answer.equals("Sand")&&groundPokemon.contains("Hippopotas"))
                {System.out.println("You are Hippopotas");}
                
                else if(answer.equals("Sand")&&groundPokemon.contains("Hippowdon"))
                {System.out.println("You are Hippowdon");}
                
                else if(answer.equals("Battleship Gray")&&groundPokemon.contains("Rhyperior"))
                {System.out.println("You are Rhyperior");}
                
                else if(answer.equals("Dark Purple")&&groundPokemon.contains("Gliscor"))
                {System.out.println("You are Gliscor");}
                
                else if(answer.equals("Iceberg")&&groundPokemon.contains("Mamoswine"))
                {System.out.println("You are Mamoswine");}
                
                else if(answer.equals("Scarlet")&&groundPokemon.contains("Drilbur"))
                {System.out.println("You are Drilbur");}
                
                else if(answer.equals("Scarlet")&&groundPokemon.contains("Excadrill"))
                {System.out.println("You are Excadrill");}
                
                else if(answer.equals("Ultramarine")&&groundPokemon.contains("Palpitoad"))
                {System.out.println("You are Palpitoad");}
                
                else if(answer.equals("Ultramarine")&&groundPokemon.contains("Seismitoad"))
                {System.out.println("You are Seismitoad");}
                
                else if(answer.equals("Crimson")&&groundPokemon.contains("Sandile"))
                {System.out.println("You are Sandile");}
                
                else if(answer.equals("Crimson")&&groundPokemon.contains("Krokorok"))
                {System.out.println("You are Krokorok");}
                
                else if(answer.equals("Crimson")&&groundPokemon.contains("Krookodile"))
                {System.out.println("You are Krookodile");}
                
                else if(answer.equals("Potato")&&groundPokemon.contains("Stunfisk"))
                {System.out.println("You are Stunfisk");}
                
                else if(answer.equals("Celestial Blue")&&groundPokemon.contains("Golett"))
                {System.out.println("You are Golett");}
                
                else if(answer.equals("Celestial Blue")&&groundPokemon.contains("Golurk"))
                {System.out.println("You are Golurk");}
                
                else if(answer.equals("Gold")&&groundPokemon.contains("Landorus"))
                {System.out.println("You are Landorus");}
                
                else
                {System.out.println("There was an error. You are Missigno");}
    }
}}