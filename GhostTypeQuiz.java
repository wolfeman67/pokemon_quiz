import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class GhostTypeQuiz
{
    public static void innerSearch()
    {ArrayList<String> ghostPokemon= new ArrayList<String>();
    	ghostPokemon.add("Gastly");
    	ghostPokemon.add("Haunter");
    	ghostPokemon.add("Gengar");
    	ghostPokemon.add("Misdreavus");
    	ghostPokemon.add("Shedinja");
    	ghostPokemon.add("Sableye");
    	ghostPokemon.add("Shuppet");
    	ghostPokemon.add("Banette");
    	ghostPokemon.add("Duskull");
    	ghostPokemon.add("Dusclops");
    	ghostPokemon.add("Drifloon");
    	ghostPokemon.add("Drifblim");
    	ghostPokemon.add("Mismagius");
    	ghostPokemon.add("Spiritomb");
    	ghostPokemon.add("Dusknoir");
    	ghostPokemon.add("Froslass");
    	ghostPokemon.add("Rotom");
    	ghostPokemon.add("Giratina");
    	ghostPokemon.add("Yamask");
    	ghostPokemon.add("Cofagrigus");
    	ghostPokemon.add("Frillish");
    	ghostPokemon.add("Jellicent");
    	ghostPokemon.add("Litwick");
    	ghostPokemon.add("Lampent");
    	ghostPokemon.add("Chandelure");
    	ghostPokemon.add("Golett");
    	ghostPokemon.add("Golurk");

    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Giratina");
		}
		System.out.println();

		System.out.println("Would drifting in the sky without a care in the world appeal to you? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Drifloon");
		ghostPokemon.remove("Drifblim");
		}
		System.out.println();

		System.out.println("Do you feel confined and trapped in your life or in society's guidelines?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Spiritomb");
		}
		System.out.println();

		System.out.println("Do you have an odd habit of collecting a certain group of items?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Sableye");
		}
		System.out.println();

		System.out.println("Do you bear a strong grudge with someone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Shuppet");
		ghostPokemon.remove("Banette");
		}
		System.out.println();

		System.out.println("Do you think that the Ancient Egyptians are the most interesting civilization?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Yamask");
		ghostPokemon.remove("Cofagrigus");
		}
		System.out.println();

		System.out.println("Do you have the power or charm to make your friends do whatever you want them to?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Frillish");
		ghostPokemon.remove("Jellicent");
		}
		System.out.println();

		System.out.println("Are you an excellent teacher or a patient learner that has the drive to learn more?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Litwick");
		ghostPokemon.remove("Lampent");
		ghostPokemon.remove("Chandelure");
		}
		System.out.println();

		System.out.println("Do you like playing pranks on people or teasing those you consider inferior to you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Misdreavus");
		ghostPokemon.remove("Mismagius");
		}
		System.out.println();

		System.out.println("Do you have a strong sense of justice and believe that karma will come into play eventually?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Duskull");
		ghostPokemon.remove("Dusclops");
		ghostPokemon.remove("Dusknoir");
		}
		System.out.println();

		System.out.println("Would the job of electrical or computer engineering or hacking appeal to you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Rotom");
		}
		System.out.println();

		System.out.println("Do you have a hard time controlling your power or emotions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Golett");
		ghostPokemon.remove("Golurk");
		}
		System.out.println();

		System.out.println("Do you generally dislike to be the center of attention, unless you want to show your peers something important or something cool that you can do?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Gastly");
		ghostPokemon.remove("Haunter");
		ghostPokemon.remove("Gengar");
		}
		System.out.println();

		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Gastly");
		 ghostPokemon.remove("Shuppet");
		 ghostPokemon.remove("Litwick");
		 ghostPokemon.remove("Golett");
		 ghostPokemon.remove("Frillish");
		 ghostPokemon.remove("Yamask");
		 ghostPokemon.remove("Duskull");
		 ghostPokemon.remove("Drifloon");
		}
		if(answer.equals("yes"))
		{ghostPokemon.remove("Haunter");
		ghostPokemon.remove("Gengar");
		ghostPokemon.remove("Mismagius");
		ghostPokemon.remove("Dusclops");
		ghostPokemon.remove("Dusknoir");
		ghostPokemon.remove("Shedinja");
		ghostPokemon.remove("Golurk");
		ghostPokemon.remove("Lampent");
		ghostPokemon.remove("Chandelure");
		ghostPokemon.remove("Banette");
		ghostPokemon.remove("Drifblim");
		ghostPokemon.remove("Froslass");
		ghostPokemon.remove("Jellicent");}
		System.out.println();

                if(ghostPokemon.contains("Froslass"))
                {System.out.println("Are you female? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Froslass");
		}
		System.out.println();}
                
		if(ghostPokemon.contains("Froslass"))
                {System.out.println("Do you enjoy seducing guys and then dropping them off? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Froslass");
		}
		System.out.println();}
                
                if(ghostPokemon.contains("Shedinja"))
                {System.out.println("Are you a shell of your former self? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Shedinja");
		}
		System.out.println();}
                
                if(ghostPokemon.contains("Gengar"))
		{System.out.println("Do you have the bad habit of laughing at other's misfortune or pain?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Gengar");
		}
		if(answer.equals("yes"))
		{ghostPokemon.remove("Haunter");
		}
		System.out.println();}

		if(ghostPokemon.contains("Dusknoir"))
		{System.out.println("Does the subject of the afterlife fascinate you and do you believe in one?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Dusknoir");
		}
		if(answer.equals("yes"))
		{ghostPokemon.remove("Dusclops");
		}
		System.out.println();}

		if(ghostPokemon.contains("Chandelure"))
		{System.out.println("Are your manners or speech elegant or refined compared to most people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{ghostPokemon.remove("Chandelure");
		}
		if(answer.equals("yes"))
		{ghostPokemon.remove("Lampent");
		}
		System.out.println();}

		if(ghostPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(ghostPokemon.size()==1)
			out.println("You are " + ghostPokemon.get(0));
		if(ghostPokemon.size()>1)
                {{String ghostAura=new String("\n");
		if(ghostPokemon.contains("Gastly")||ghostPokemon.contains("Haunter")||ghostPokemon.contains("Gengar"))
		{ghostAura=ghostAura + "Dark Purple\n";}
		if(ghostPokemon.contains("Duskull")||ghostPokemon.contains("Dusclops")||ghostPokemon.contains("Dusknoir"))
		{ghostAura=ghostAura + "Black\n";}
		if(ghostPokemon.contains("Litwick")||ghostPokemon.contains("Lampent")||ghostPokemon.contains("Chandelure"))
		{ghostAura=ghostAura + "Crimson\n";}
		if(ghostPokemon.contains("Misdreavus")||ghostPokemon.contains("Mismagius"))
		{ghostAura=ghostAura + "Harlequin\n";}
		if(ghostPokemon.contains("Giratina"))
		{ghostAura=ghostAura + "Gold\n";}
		if(ghostPokemon.contains("Shedinja"))
		{ghostAura=ghostAura + "Amber\n";}
		if(ghostPokemon.contains("Shuppet")||ghostPokemon.contains("Banette"))
		{ghostAura=ghostAura + "Dark Blue\n";}
		if(ghostPokemon.contains("Drifloon")||ghostPokemon.contains("Drifblim"))
		{ghostAura=ghostAura + "Lavender\n";}
		if(ghostPokemon.contains("Spiritomb"))
		{ghostAura=ghostAura + "Electric Green\n";}
		if(ghostPokemon.contains("Froslass"))
		{ghostAura=ghostAura + "Steel Blue\n";}
		if(ghostPokemon.contains("Rotom"))
		{ghostAura=ghostAura + "Bright Orange\n";}
		if(ghostPokemon.contains("Yamask")||ghostPokemon.contains("Cofagrigus"))
		{ghostAura=ghostAura + "Sand\n";}
		if(ghostPokemon.contains("Frillish")||ghostPokemon.contains("Jellicent"))
		{ghostAura=ghostAura + "White\n";}
		if(ghostPokemon.contains("Golett")||ghostPokemon.contains("Golurk"))
		{ghostAura=ghostAura + "Teal Blue\n";}
		
                System.out.println("Out of these colors:" +ghostAura +"which one would descibe you the most?");
		answer=pokescan.nextLine();
                if(answer.equals("Dark Purple")&&ghostPokemon.contains("Gastly"))
                    {System.out.println("You are Gastly");}
                
                else if(answer.equals("Dark Purple")&&ghostPokemon.contains("Haunter"))
                    {System.out.println("You are Haunter");}
                
                else if(answer.equals("Dark Purple")&&ghostPokemon.contains("Gengar"))
                    {System.out.println("You are Gengar");}
                
                else if(answer.equals("Harlequin")&&ghostPokemon.contains("Misdreavus"))
                    {System.out.println("You are Misdreavus");}
                
                else if(answer.equals("Amber")&&ghostPokemon.contains("Shedinja"))
                    {System.out.println("You are Shedinja");}
                
                else if(answer.equals("Glitter")&&ghostPokemon.contains("Sableye"))
                    {System.out.println("You are Sableye");}
                
                else if(answer.equals("Dark Blue")&&ghostPokemon.contains("Shuppet"))
                    {System.out.println("You are Shuppet");}
                
                else if(answer.equals("Dark Blue")&&ghostPokemon.contains("Banette"))
                    {System.out.println("You are Banette");}
                
                else if(answer.equals("Black")&&ghostPokemon.contains("Duskull"))
                    {System.out.println("You are Duskull");}
                
                else if(answer.equals("Black")&&ghostPokemon.contains("Dusclops"))
                    {System.out.println("You are Dusclops");}
                
                else if(answer.equals("Lavender")&&ghostPokemon.contains("Drifloon"))
                    {System.out.println("You are Drifloon");}
                
                else if(answer.equals("Lavender")&&ghostPokemon.contains("Drifblim"))
                    {System.out.println("You are Drifblim");}
                
                else if(answer.equals("Harlequin")&&ghostPokemon.contains("Mismagius"))
                    {System.out.println("You are Mismagius");}
                
                else if(answer.equals("Electric Green")&&ghostPokemon.contains("Spiritomb"))
                    {System.out.println("You are Spiritomb");}
                
                else if(answer.equals("Black")&&ghostPokemon.contains("Dusknoir"))
                    {System.out.println("You are Dusknoir");}
                
                else if(answer.equals("Steel Blue")&&ghostPokemon.contains("Froslass"))
                    {System.out.println("You are Froslass");}
                
                else if(answer.equals("Bright Orange")&&ghostPokemon.contains("Rotom"))
                    {System.out.println("You are Rotom");}
                
                else if(answer.equals("Gold")&&ghostPokemon.contains("Giratina"))
                    {System.out.println("You are Giratina");}
                
                else if(answer.equals("Sand")&&ghostPokemon.contains("Yamask"))
                    {System.out.println("You are Yamask");}
                
                else if(answer.equals("Sand")&&ghostPokemon.contains("Cofagrigus"))
                    {System.out.println("You are Cofragigus");}
                
                else if(answer.equals("White")&&ghostPokemon.contains("Frillish"))
                    {System.out.println("You are Frillish");}
                
                else if(answer.equals("White")&&ghostPokemon.contains("Jellicent"))
                    {System.out.println("You are Jellicent");}
                
                else if(answer.equals("Crimson")&&ghostPokemon.contains("Litwick"))
                    {System.out.println("You are Litwick");}
                
                else if(answer.equals("Crimson")&&ghostPokemon.contains("Lampent"))
                    {System.out.println("You are Lampent");}
                
                else if(answer.equals("Crimson")&&ghostPokemon.contains("Chandelure"))
                    {System.out.println("You are Chandelure");}
                
                else if(answer.equals("Teal Blue")&&ghostPokemon.contains("Golett"))
                    {System.out.println("You are Golett");}
                
                else if(answer.equals("Teal Blue")&&ghostPokemon.contains("Golurk"))
                    {System.out.println("You are Golurk");}
                
                else
                {System.out.println("There was an error.  You are Missingno.");}
    }
}}}