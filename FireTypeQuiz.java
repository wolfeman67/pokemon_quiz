import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class FireTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> firePokemon= new ArrayList<String>();
    	firePokemon.add("Charmander");
    	firePokemon.add("Charmeleon");
    	firePokemon.add("Charizard");
    	firePokemon.add("Vulpix");
    	firePokemon.add("Ninetales");
    	firePokemon.add("Growlithe");
    	firePokemon.add("Arcanine");
    	firePokemon.add("Ponyta");
    	firePokemon.add("Rapidash");
    	firePokemon.add("Magmar");
    	firePokemon.add("Flareon");
    	firePokemon.add("Moltres");
    	firePokemon.add("Cyndaquil");
    	firePokemon.add("Quilava");
    	firePokemon.add("Typhlosion");
    	firePokemon.add("Slugma");
    	firePokemon.add("Magcargo");
    	firePokemon.add("Houndour");
    	firePokemon.add("Houndoom");
    	firePokemon.add("Magby");
    	firePokemon.add("Entei");
    	firePokemon.add("Ho-oh");
    	firePokemon.add("Torchic");
    	firePokemon.add("Combusken");
    	firePokemon.add("Blaziken");
    	firePokemon.add("Numel");
    	firePokemon.add("Camerupt");
    	firePokemon.add("Torkoal");
    	firePokemon.add("Chimchar");
    	firePokemon.add("Monferno");
    	firePokemon.add("Infernape");
    	firePokemon.add("Magmortar");
    	firePokemon.add("Heatran");
    	firePokemon.add("Victini");
    	firePokemon.add("Tepig");
    	firePokemon.add("Pignite");
    	firePokemon.add("Emboar");
    	firePokemon.add("Pansear");
    	firePokemon.add("Simisear");
    	firePokemon.add("Darumaka");
    	firePokemon.add("Darmanitan");
    	firePokemon.add("Litwick");
    	firePokemon.add("Lampent");
    	firePokemon.add("Chandelure");
    	firePokemon.add("Heatmor");
    	firePokemon.add("Larvesta");
    	firePokemon.add("Volcarona");
    	firePokemon.add("Reshiram");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Moltres");
		firePokemon.remove("Entei");
		firePokemon.remove("Ho-oh");
		firePokemon.remove("Heatran");
		firePokemon.remove("Victini");
		firePokemon.remove("Reshiram");
		}
		System.out.println();

		System.out.println("Would you fight to the death to protect someone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Growlithe");
		firePokemon.remove("Arcanine");
		}
		System.out.println();

		System.out.println("Do you feel as if you don't belong in the place you are in?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Magby");
		firePokemon.remove("Magmar");
		firePokemon.remove("Magmortar");
		}
		System.out.println();

		System.out.println("Are you rather slow and awkward in your movements?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Slugma");
		firePokemon.remove("Magcargo");
		}
		System.out.println();

		System.out.println("Do you have a bad reputation you don't neccessarily deserve?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Houndour");
		firePokemon.remove("Houndoom");
		}
		System.out.println();

		System.out.println("Would you do menial labor for pay as a part time job");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Numel");
		firePokemon.remove("Camerupt");
		}
		System.out.println();

		System.out.println("Do you or someone in your family regularly smoke cigarettes or cigars?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Torkoal");
		}
		System.out.println();

		System.out.println("Are you addicted to chocolate or other sweets?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Pansear");
		firePokemon.remove("Simisear");
		}
		System.out.println();

		System.out.println("Do you have a hard time falling asleep because of your active body?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Darumaka");
		firePokemon.remove("Darmanitan");
		}
		System.out.println();

		System.out.println("Did you enjoy torturing or burning insects in your younger years?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Heatmor");
		}
		System.out.println();


		System.out.println("Are you an excellent teacher or a patient learner that has the drive to learn more?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Litwick");
		firePokemon.remove("Lampent");
		firePokemon.remove("Chandelure");
		}
		System.out.println();

		System.out.println("Do you have the talent of making someone's day even when they are down?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Larvesta");
		firePokemon.remove("Volcarona");
		}
		System.out.println();

		System.out.println("Is it hard for you to conceal your emotions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Charmander");
		firePokemon.remove("Charmeleon");
		firePokemon.remove("Charizard");
		}
		System.out.println();

		System.out.println("Have you ever broken someone's heart even if it wasn't on purpose?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Vulpix");
		firePokemon.remove("Ninetales");
		}
		System.out.println();

		System.out.println("Are you defensive when people mess with you or mock you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Cyndaquil");
		firePokemon.remove("Quilava");
		firePokemon.remove("Typhlosion");
		}
		System.out.println();

		System.out.println("Is it difficult for you to live without interacting with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Torchic");
		firePokemon.remove("Combusken");
		firePokemon.remove("Blaziken");
		}
		System.out.println();

		System.out.println("Do you have a strongly competitive spirit that tends to control you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Ponyta");
		firePokemon.remove("Rapidash");
		}
		System.out.println();
                
                System.out.println("Do you like to keep your distance from people you don't know very well, but are incredibly sociable with your friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Chimchar");
		firePokemon.remove("Monferno");
		firePokemon.remove("Infernape");
		}
		System.out.println();
                
                System.out.println("Is eating good food one of your favorite things to do?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Tepig");
		firePokemon.remove("Pignite");
		firePokemon.remove("Emboar");
		}
		System.out.println();


		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Charmander");
		firePokemon.remove("Vulpix");
		firePokemon.remove("Growlithe");
		firePokemon.remove("Ponyta");
		firePokemon.remove("Cyndaquil");
		firePokemon.remove("Slugma");
		firePokemon.remove("Houndour");
		firePokemon.remove("Magby");
		firePokemon.remove("Torchic");
		firePokemon.remove("Numel");
		firePokemon.remove("Chimchar");
		firePokemon.remove("Tepig");
		firePokemon.remove("Pansear");
		firePokemon.remove("Darumaka");
		firePokemon.remove("Litwick");
		firePokemon.remove("Larvesta");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Charmeleon");
		firePokemon.remove("Charizard");
		firePokemon.remove("Ninetales");
		firePokemon.remove("Arcanine");
		firePokemon.remove("Rapidash");
		firePokemon.remove("Magmar");
		firePokemon.remove("Flareon");
		firePokemon.remove("Quilava");
		firePokemon.remove("Typhlosion");
		firePokemon.remove("Magcargo");
		firePokemon.remove("Houndoom");
		firePokemon.remove("Combusken");
		firePokemon.remove("Blaziken");
		firePokemon.remove("Camerupt");
		firePokemon.remove("Monferno");
		firePokemon.remove("Infernape");
		firePokemon.remove("Magmortar");
		firePokemon.remove("Pignite");
		firePokemon.remove("Emboar");
		firePokemon.remove("Simisear");
		firePokemon.remove("Darmanitan");
		firePokemon.remove("Lampent");
		firePokemon.remove("Chandelure");
		firePokemon.remove("Volcarona");
		}
		System.out.println();
                
                if(firePokemon.contains("Blaziken"))
		{System.out.println("Do you like to partake in somewhat risky activities such as parkour or skydiving?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Blaziken");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Combusken");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Emboar"))
		{System.out.println("Do you find large amounts of facial hair attractive on a man?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Emboar");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Pignite");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Typhlosion"))
		{System.out.println("Are you hard to calm down when something upsets you or sets you off?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Typhlosion");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Quilava");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Charizard"))
		{System.out.println("Does your rather cocky or self-centered attitude turn some people off?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Charizard");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Charmeleon");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Chandelure"))
		{System.out.println("Are your manners elegant or refined compared to most people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Chandelure");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Lampent");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Magmortar"))
		{System.out.println("Do you make strange faces when you are in the heat of the moment in a competitive event?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Magmortar");
		}
		if(answer.equals("yes"))
		{firePokemon.remove("Magmar");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Flareon"))
		{System.out.println("When the pressure is on, can you take the heat?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Flareon");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Entei"))
		{System.out.println("Are you known as a loyal ally, bodyguard, or protector?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Entei");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Moltres"))
		{System.out.println("Do you prefer the warmth of spring or summer over the cold of fall or winter?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Moltres");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Ho-oh"))
		{System.out.println("Do you have the power to give people happiness or their truest desires?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Ho-oh");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Heatran"))
		{System.out.println("Do you think that change is a wonderful thing and do you welcome it with open arms?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Heatran");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Victini"))
		{System.out.println("Have you won a major championship or competition worth merit?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Victini");
		}
		System.out.println();
		}
                
                if(firePokemon.contains("Reshiram"))
		{System.out.println("Is your ultimate goal to find the truth on just about everything?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{firePokemon.remove("Reshiram");
		}
		System.out.println();
		}
                

		if(firePokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(firePokemon.size()==1)
			out.println("You are " + firePokemon.get(0));
		if(firePokemon.size()>1)
		{String fireAura=new String("\n");
		if(firePokemon.contains("Larvesta")||firePokemon.contains("Volcarona"))
		{fireAura=fireAura + "Sunglow\n";}
                if(firePokemon.contains("Litwick")||firePokemon.contains("Lampent")||firePokemon.contains("Chandelure"))
		{fireAura=fireAura + "Dark Purple\n";}
                if(firePokemon.contains("Houndour")||firePokemon.contains("Houndoom"))
		{fireAura=fireAura + "Licorice\n";}
                if(firePokemon.contains("Reshiram"))
		{fireAura=fireAura + "White\n";}
                if(firePokemon.contains("Victini"))
		{fireAura=fireAura + "Sunset Orange\n";}
                if(firePokemon.contains("Heatmor"))
		{fireAura=fireAura + "Russet\n";}
                if(firePokemon.contains("Heatran"))
		{fireAura=fireAura + "Burnt Orange\n";}
                if(firePokemon.contains("Chimchar")||firePokemon.contains("Monferno")||firePokemon.contains("Infernape"))
		{fireAura=fireAura + "Mango\n";}
                if(firePokemon.contains("Torkoal"))
		{fireAura=fireAura + "Smoke\n";}
                if(firePokemon.contains("Ho-oh"))
		{fireAura=fireAura + "Gold\n";}
                if(firePokemon.contains("Numel")||firePokemon.contains("Camerupt"))
		{fireAura=fireAura + "Sand Dune\n";}
                if(firePokemon.contains("Charmander")||firePokemon.contains("Charmeleon")||firePokemon.contains("Charizard"))
		{fireAura=fireAura + "Flame\n";}
                if(firePokemon.contains("Ponyta")||firePokemon.contains("Rapidash"))
		{fireAura=fireAura + "Champagne\n";}
                if(firePokemon.contains("Growlithe")||firePokemon.contains("Arcanine"))
		{fireAura=fireAura + "Cinnibar\n";}
                if(firePokemon.contains("Magby")||firePokemon.contains("Magmar")||firePokemon.contains("Magmortar"))
		{fireAura=fireAura + "Lava\n";}
                if(firePokemon.contains("Torchic")||firePokemon.contains("Combusken")||firePokemon.contains("Blaziken"))
		{fireAura=fireAura + "Crimson\n";}
                if(firePokemon.contains("Flareon"))
		{fireAura=fireAura + "Yellow\n";}
                if(firePokemon.contains("Slugma")||firePokemon.contains("Magcargo"))
		{fireAura=fireAura + "Charcoal\n";}
                if(firePokemon.contains("Vulpix")||firePokemon.contains("Ninetales"))
		{fireAura=fireAura + "Blond\n";}
                if(firePokemon.contains("Pansear")||firePokemon.contains("Simisear"))
		{fireAura=fireAura + "Lust\n";}
                if(firePokemon.contains("Darumaka")||firePokemon.contains("Darmanitan"))
		{fireAura=fireAura + "Lemon\n";}
                if(firePokemon.contains("Tepig")||firePokemon.contains("Pignite")||firePokemon.contains("Emboar"))
		{fireAura=fireAura + "Pumpkin\n";}
                if(firePokemon.contains("Moltres"))
		{fireAura=fireAura + "Ruby\n";}
                if(firePokemon.contains("Cyndaquil")||firePokemon.contains("Quilava")||firePokemon.contains("Typhlosion"))
                {fireAura=fireAura + "Amazon\n";}
                if(firePokemon.contains("Entei"))
                {fireAura=fireAura + "Silver\n";}
                
                System.out.println("Out of these colors:" +fireAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Flame")&&firePokemon.contains("Charmander"))
                {System.out.println("You are Charmander");}
                
                else if(answer.equals("Flame")&&firePokemon.contains("Charmeleon"))
                {System.out.println("You are Charmeleon");}
                
                else if(answer.equals("Flame")&&firePokemon.contains("Charizard"))
                {System.out.println("You are Charizard");}
                
                else if(answer.equals("Blond")&&firePokemon.contains("Vulpix"))
                {System.out.println("You are Vulpix");}
                
                else if(answer.equals("Blond")&&firePokemon.contains("Ninetales"))
                {System.out.println("You are Ninetales");}
                
                else if(answer.equals("Cinnibar")&&firePokemon.contains("Growlithe"))
                {System.out.println("You are Growlithe");}
                
                else if(answer.equals("Cinnibar")&&firePokemon.contains("Arcanine"))
                {System.out.println("You are Arcanine");}
                
                else if(answer.equals("Champagne")&&firePokemon.contains("Ponyta"))
                {System.out.println("You are Ponyta");}
                
                else if(answer.equals("Champagne")&&firePokemon.contains("Rapidash"))
                {System.out.println("You are Rapidash");}
                
                else if(answer.equals("Lava")&&firePokemon.contains("Magmar"))
                {System.out.println("You are Magmar");}
                
                else if(answer.equals("Yellow")&&firePokemon.contains("Flareon"))
                {System.out.println("You are Flareon");}
                
                else if(answer.equals("Ruby")&&firePokemon.contains("Moltres"))
                {System.out.println("You are Moltres");}
                
                else if(answer.equals("Amazon")&&firePokemon.contains("Cyndaquil"))
                {System.out.println("You are Cyndaquil");}
                
                else if(answer.equals("Amazon")&&firePokemon.contains("Quilava"))
                {System.out.println("You are Quilava");}
                
                else if(answer.equals("Amazon")&&firePokemon.contains("Typhlosion"))
                {System.out.println("You are Typhlosion");}
                
                else if(answer.equals("Charcoal")&&firePokemon.contains("Slugma"))
                {System.out.println("You are Slugma");}
                
                else if(answer.equals("Charcoal")&&firePokemon.contains("Magcargo"))
                {System.out.println("You are Magcargo");}
                
                else if(answer.equals("Licorice")&&firePokemon.contains("Houndour"))
                {System.out.println("You are Houndour");}
                
                else if(answer.equals("Licorice")&&firePokemon.contains("Houndoom"))
                {System.out.println("You are Houndoom");}
                
                else if(answer.equals("Lava")&&firePokemon.contains("Magby"))
                {System.out.println("You are Magby");}
                
                else if(answer.equals("Silver")&&firePokemon.contains("Entei"))
                {System.out.println("You are Entei");}
                
                else if(answer.equals("Gold")&&firePokemon.contains("Ho-oh"))
                {System.out.println("You are Ho-oh");}
                
                else if(answer.equals("Crimson")&&firePokemon.contains("Torchic"))
                {System.out.println("You are Torchic");}
                
                else if(answer.equals("Crimson")&&firePokemon.contains("Combusken"))
                {System.out.println("You are Combusken");}
                
                else if(answer.equals("Crimson")&&firePokemon.contains("Blaziken"))
                {System.out.println("You are Blaziken");}
                
                else if(answer.equals("Sand Dune")&&firePokemon.contains("Numel"))
                {System.out.println("You are Numel");}
                
                else if(answer.equals("Sand Dune")&&firePokemon.contains("Camerupt"))
                {System.out.println("You are Camerupt");}
                
                else if(answer.equals("Smoke")&&firePokemon.contains("Torkoal"))
                {System.out.println("You are Torkoal");}
                
                else if(answer.equals("Mango")&&firePokemon.contains("Chimchar"))
                {System.out.println("You are Chimchar");}
                
                else if(answer.equals("Mango")&&firePokemon.contains("Monferno"))
                {System.out.println("You are Monferno");}
                
                else if(answer.equals("Mango")&&firePokemon.contains("Infernape"))
                {System.out.println("You are Infernape");}
                
                else if(answer.equals("Lava")&&firePokemon.contains("Magmortar"))
                {System.out.println("You are Magmortar");}
                
                else if(answer.equals("Burnt Orange")&&firePokemon.contains("Heatran"))
                {System.out.println("You are Heatran");}
                
                else if(answer.equals("Sunset Orange")&&firePokemon.contains("Victini"))
                {System.out.println("You are Victini");}
                
                else if(answer.equals("Pumpkin")&&firePokemon.contains("Tepig"))
                {System.out.println("You are Tepig");}
                
                else if(answer.equals("Pumpkin")&&firePokemon.contains("Pignite"))
                {System.out.println("You are Pignite");}
                
                else if(answer.equals("Pumpkin")&&firePokemon.contains("Emboar"))
                {System.out.println("You are Emboar");}
                
                else if(answer.equals("Lust")&&firePokemon.contains("Pansear"))
                {System.out.println("You are Pansear");}
                
                else if(answer.equals("Lust")&&firePokemon.contains("Simisear"))
                {System.out.println("You are Simisear");}
                
                else if(answer.equals("Lemon")&&firePokemon.contains("Darumaka"))
                {System.out.println("You are Darumaka");}
                
                else if(answer.equals("Lemon")&&firePokemon.contains("Darmanitan"))
                {System.out.println("You are Darmanitan");}
                
                else if(answer.equals("Dark Purple")&&firePokemon.contains("Litwick"))
                {System.out.println("You are Litwick");}
                
                else if(answer.equals("Dark Purple")&&firePokemon.contains("Lampent"))
                {System.out.println("You are Lampent");}
                
                else if(answer.equals("Dark Purple")&&firePokemon.contains("Chandelure"))
                {System.out.println("You are Chandelure");}
                
                else if(answer.equals("Russet")&&firePokemon.contains("Heatmor"))
                {System.out.println("You are Heatmor");}
                
                else if(answer.equals("Sunglow")&&firePokemon.contains("Larvesta"))
                {System.out.println("You are Larvesta");}
                
                else if(answer.equals("Sunglow")&&firePokemon.contains("Volcarona"))
                {System.out.println("You are Volcarona");}
                
                else if(answer.equals("White")&&firePokemon.contains("Reshiram"))
                {System.out.println("You are Reshiram");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
    }
}}