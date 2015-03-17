
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class FightingTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> fightingPokemon= new ArrayList<String>();
		fightingPokemon.add("Mankey");
		fightingPokemon.add("Primeape");
		fightingPokemon.add("Poliwrath");
		fightingPokemon.add("Machop");
		fightingPokemon.add("Machoke");
		fightingPokemon.add("Machamp");
		fightingPokemon.add("Hitmonlee");
		fightingPokemon.add("Hitmonchan");
		fightingPokemon.add("Heracross");
		fightingPokemon.add("Tyrogue");
		fightingPokemon.add("Hitmontop");
		fightingPokemon.add("Combusken");
		fightingPokemon.add("Blaziken");
		fightingPokemon.add("Breloom");
		fightingPokemon.add("Makuhita");
		fightingPokemon.add("Hariyama");
		fightingPokemon.add("Meditite");
		fightingPokemon.add("Medicham");
		fightingPokemon.add("Monferno");
		fightingPokemon.add("Infernape");
		fightingPokemon.add("Riolu");
		fightingPokemon.add("Lucario");
		fightingPokemon.add("Croagunk");
		fightingPokemon.add("Toxicroak");
		fightingPokemon.add("Gallade");
		fightingPokemon.add("Pignite");
		fightingPokemon.add("Emboar");
		fightingPokemon.add("Timburr");
		fightingPokemon.add("Gurdurr");
		fightingPokemon.add("Conkeldurr");
		fightingPokemon.add("Throh");
		fightingPokemon.add("Sawk");
		fightingPokemon.add("Scraggy");
		fightingPokemon.add("Scrafty");
		fightingPokemon.add("Mienfoo");
		fightingPokemon.add("Mienshao");
		fightingPokemon.add("Cobalion");
		fightingPokemon.add("Terrakion");
		fightingPokemon.add("Virizion");
		fightingPokemon.add("Keldeo");



    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Cobalion");
		fightingPokemon.remove("Virizion");
		fightingPokemon.remove("Terrakion");
		fightingPokemon.remove("Keldeo");
		fightingPokemon.remove("Meloetta");
		}
		System.out.println();
                
                System.out.println("Are you male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Hitmonlee");
		fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Tyrogue");
		fightingPokemon.remove("Hitmontop");
		fightingPokemon.remove("Gallade");
                fightingPokemon.remove("Sawk");
                fightingPokemon.remove("Throh");
		}
		System.out.println();

		System.out.println("Do you not care much about your appearance in public?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Scraggy");
		fightingPokemon.remove("Scrafty");
		}
		System.out.println();

		System.out.println("Do you have a hard time controlling your anger?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Primeape");
		fightingPokemon.remove("Mankey");
		}
		System.out.println();

		System.out.println("Are your muscles or athletic ability the most important thing to you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Machop");
		fightingPokemon.remove("Machoke");
		fightingPokemon.remove("Machamp");
		}
		System.out.println();

		System.out.println("Are you addicted to sweets?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Heracross");
		}
		System.out.println();

		System.out.println("Are you heavyset or plump?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Makuhita");
		fightingPokemon.remove("Hariyama");
		}
		System.out.println();

		System.out.println("Would you spend five years of your life to reach a goal?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Meditite");
		fightingPokemon.remove("Medicham");
		}
		System.out.println();

		System.out.println("Do you treat everything like it was a game?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Monferno");
		fightingPokemon.remove("Infernape");
		}
		System.out.println();

		System.out.println("Are you great at understanding people and their emotions?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Riolu");
		fightingPokemon.remove("Lucario");
		}
		System.out.println();

		System.out.println("Do you tend to fight dirty or weasel your way out of things you don't want to do?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Croagunk");
		fightingPokemon.remove("Toxicroak");
		}
		System.out.println();

		System.out.println("Do you really enjoy incredibly spicy food?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Pignite");
		fightingPokemon.remove("Emboar");
		}
		System.out.println();

		System.out.println("Do you not mind doing menial, physical labor for pay?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Timburr");
		fightingPokemon.remove("Gurdurr");
		fightingPokemon.remove("Conkeldurr");
		}
		System.out.println();

		if(fightingPokemon.contains("Throh")||fightingPokemon.contains("Sawk"))
                {System.out.println("Would you choose red over blue?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Throh");
		}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Sawk");}
		System.out.println();}

		System.out.println("Are your manners elegant and refined or do you try to dress nicely often?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Mienfoo");
		fightingPokemon.remove("Mienshao");
		}
		System.out.println();

		if(fightingPokemon.contains("Tyrogue")||fightingPokemon.contains("Hitmonchan")||fightingPokemon.contains("Hitmonlee")||fightingPokemon.contains("Hitmontop"))
                {System.out.println("Could you make an important decision quickly?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Tyrogue");
                fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Hitmonlee");
		fightingPokemon.remove("Hitmontop");}
		System.out.println();}



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Mankey");
		fightingPokemon.remove("Machop");
		fightingPokemon.remove("Tyrogue");
		fightingPokemon.remove("Makuhita");
		fightingPokemon.remove("Meditite");
		fightingPokemon.remove("Riolu");
		fightingPokemon.remove("Croagunk");
		fightingPokemon.remove("Timburr");
		fightingPokemon.remove("Scraggy");
		fightingPokemon.remove("Mienfoo");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Primeape");
		fightingPokemon.remove("Poliwrath");
		fightingPokemon.remove("Machoke");
		fightingPokemon.remove("Machamp");
		fightingPokemon.remove("Hitmonlee");
		fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Hitmontop");
		fightingPokemon.remove("Combusken");
		fightingPokemon.remove("Blaziken");
		fightingPokemon.remove("Breloom");
		fightingPokemon.remove("Hariyama");
		fightingPokemon.remove("Medicham");
		fightingPokemon.remove("Monferno");
		fightingPokemon.remove("Infernape");
		fightingPokemon.remove("Lucario");
		fightingPokemon.remove("Toxicroak");
		fightingPokemon.remove("Pignite");
		fightingPokemon.remove("Emboar");
		fightingPokemon.remove("Gurdurr");
		fightingPokemon.remove("Conkeldurr");
		fightingPokemon.remove("Scrafty");
		fightingPokemon.remove("Mienshao");}
		System.out.println();

		if(fightingPokemon.contains("Poliwrath"))
                {System.out.println("Do you confuse people with either your personality or ideas or beliefs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Poliwrath");
		}
		System.out.println();}
                
                if(fightingPokemon.contains("Gallade"))
                {System.out.println("Are you the odd man out or the black sheep in your family?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Gallade");
		}
		System.out.println();}
                
                if(fightingPokemon.contains("Machamp"))
		{System.out.println("Would you like to live in a place far away from where you are currently?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Machamp");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Machoke");}
		System.out.println();}
                
                if(fightingPokemon.contains("Blaziken")||fightingPokemon.contains("Combusken"))
                {System.out.println("Have you ever taken or wanted to take a part in parkour?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Combusken");
		fightingPokemon.remove("Blaziken");
		}
		System.out.println();}

		if(fightingPokemon.contains("Blaziken"))
		{System.out.println("Do you tend to take dares, just to prove your worth to others?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Blaziken");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Combusken");}
		System.out.println();}

		if(fightingPokemon.contains("Infernape"))
		{System.out.println("Can you walk with your hands or do other similar athletic feats?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Infernape");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Monferno");}
		System.out.println();}

		if(fightingPokemon.contains("Emboar"))
		{System.out.println("Would you fight to defend a friend's honor?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Emboar");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Pignite");}
		System.out.println();}

		if(fightingPokemon.contains("Conkeldurr"))
		{System.out.println("Do you have a grim outlook on life or a dark sense of humor?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{fightingPokemon.remove("Conkeldurr");}
		if(answer.equals("yes"))
		{fightingPokemon.remove("Gurdurr");}
		System.out.println();}

		if(fightingPokemon.contains("Hitmonchan")||fightingPokemon.contains("Hitmonlee")||fightingPokemon.contains("Hitmontop"))
		{System.out.println("Which do you like the best:  Jackie Chan, Bruce Lee, or Chuck Norris?");
		answer=pokescan.nextLine();
		if(answer.equals("Jackie Chan"))
		{fightingPokemon.remove("Hitmonlee");
		fightingPokemon.remove("Hitmontop");}
		if(answer.equals("Bruce Lee"))
		{fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Hitmontop");}
		if(answer.equals("Chuck Norris"))
		{fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Hitmonlee");}
		if(!answer.equals("Jackie Chan") && !answer.equals("Bruce Lee") && !answer.equals("Chuck Norris"))
		{fightingPokemon.remove("Hitmonchan");
		fightingPokemon.remove("Hitmonlee");
		fightingPokemon.remove("Hitmontop");}
		System.out.println();}

		if(fightingPokemon.contains("Virizion"))
		{System.out.println("Which of these terms fits you best: leader, muscular, fanciful, prodigious?");
		answer=pokescan.nextLine();
		if(answer.equals("leader"))
		{fightingPokemon.remove("Terrakion");
		fightingPokemon.remove("Virizion");
		fightingPokemon.remove("Keldeo");}
		if(answer.equals("muscular"))
		{fightingPokemon.remove("Cobalion");
		fightingPokemon.remove("Virizion");
		fightingPokemon.remove("Keldeo");}
		if(answer.equals("fanciful"))
		{fightingPokemon.remove("Cobalion");
		fightingPokemon.remove("Terrakion");
		fightingPokemon.remove("Keldeo");}
		if(answer.equals("prodigious"))
		{fightingPokemon.remove("Cobalion");
		fightingPokemon.remove("Terrakion");
		fightingPokemon.remove("Virizion");}
		System.out.println();}



		if(fightingPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(fightingPokemon.size()==1)
			out.println("You are " + fightingPokemon.get(0));
		if(fightingPokemon.size()>1)
		{String fightingAura=new String("\n");
		if(fightingPokemon.contains("Mankey")||fightingPokemon.contains("Primeape"))
		{fightingAura=fightingAura + "Red\n";}
		if(fightingPokemon.contains("Makuhita")||fightingPokemon.contains("Hariyama"))
		{fightingAura=fightingAura + "Saffron\n";}
		if(fightingPokemon.contains("Machop")||fightingPokemon.contains("Machoke")||fightingPokemon.contains("Machamp"))
		{fightingAura=fightingAura + "Blue Gray\n";}
		if(fightingPokemon.contains("Breloom"))
		{fightingAura=fightingAura + "Olive\n";}
		if(fightingPokemon.contains("Heracross"))
		{fightingAura=fightingAura + "Forest Green\n";}
		if(fightingPokemon.contains("Scraggy")||fightingPokemon.contains("Scrafty"))
		{fightingAura=fightingAura + "Yellow\n";}
		if(fightingPokemon.contains("Cobalion")||fightingPokemon.contains("Terrakion")||fightingPokemon.contains("Virizion")||fightingPokemon.contains("Keldeo"))
		{fightingAura=fightingAura + "Gold\n";}
		if(fightingPokemon.contains("Pignite")||fightingPokemon.contains("Emboar"))
		{fightingAura=fightingAura + "Brick Red\n";}
		if(fightingPokemon.contains("Sawk")||fightingPokemon.contains("Throh"))
		{fightingAura=fightingAura + "Charcoal\n";}
		if(fightingPokemon.contains("Mienfoo")||fightingPokemon.contains("Mienshao"))
		{fightingAura=fightingAura + "Amaranth\n";}
		if(fightingPokemon.contains("Riolu")||fightingPokemon.contains("Lucario"))
		{fightingAura=fightingAura + "Egyptian Blue\n";}
		if(fightingPokemon.contains("Poliwrath"))
		{fightingAura=fightingAura + "Aquamarine\n";}
		if(fightingPokemon.contains("Combusken")||fightingPokemon.contains("Blaziken"))
		{fightingAura=fightingAura + "Crimson\n";}
		if(fightingPokemon.contains("Monferno")||fightingPokemon.contains("Infernape"))
		{fightingAura=fightingAura + "Bright Orange\n";}
		if(fightingPokemon.contains("Croagunk")||fightingPokemon.contains("Toxicroak"))
		{fightingAura=fightingAura + "Indigo\n";}
		if(fightingPokemon.contains("Gallade"))
		{fightingAura=fightingAura + "Lime\n";}
		if(fightingPokemon.contains("Meditite")||fightingPokemon.contains("Medicham"))
		{fightingAura=fightingAura + "Fuchsia\n";}
		if(fightingPokemon.contains("Tyrouge")||fightingPokemon.contains("Hitmonlee")||fightingPokemon.contains("Hitmonchan")||fightingPokemon.contains("Hitmontop"))
		{fightingAura=fightingAura + "Brown\n";}
		if(fightingPokemon.contains("Timburr")||fightingPokemon.contains("Gurdurr")||fightingPokemon.contains("Conkeldurr"))
		{fightingAura=fightingAura + "Bronze\n";}
		{System.out.println("Out of these colors:" +fightingAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Red")&&fightingPokemon.contains("Mankey"))
                {System.out.println("You are Mankey");}
                
                else if(answer.equals("Red")&&fightingPokemon.contains("Primeape"))
                {System.out.println("You are Primeape");}
                
                else if(answer.equals("Aquamarine")&&fightingPokemon.contains("Poliwrath"))
                {System.out.println("You are Poliwrath");}
                
                else if(answer.equals("Blue Gray")&&fightingPokemon.contains("Machop"))
                {System.out.println("You are Machop");}
                
                else if(answer.equals("Blue Gray")&&fightingPokemon.contains("Machoke"))
                {System.out.println("You are Machoke");}
                
                else if(answer.equals("Blue Gray")&&fightingPokemon.contains("Machamp"))
                {System.out.println("You are Machamp");}
                
                else if(answer.equals("Brown")&&fightingPokemon.contains("Hitmonlee"))
                {System.out.println("You are Hitmonlee");}
                
                else if(answer.equals("Brown")&&fightingPokemon.contains("Hitmonchan"))
                {System.out.println("You are Hitmonchan");}
                
                else if(answer.equals("Forest Green")&&fightingPokemon.contains("Heracross"))
                {System.out.println("You are Heracross");}
                
                else if(answer.equals("Brown")&&fightingPokemon.contains("Tyrogue"))
                {System.out.println("You are Tyrogue");}
                
                else if(answer.equals("Brown")&&fightingPokemon.contains("Hitmontop"))
                {System.out.println("You are Hitmontop");}
                
                else if(answer.equals("Crimson")&&fightingPokemon.contains("Combusken"))
                {System.out.println("You are Combusken");}
                
                else if(answer.equals("Crimson")&&fightingPokemon.contains("Blaziken"))
                {System.out.println("You are Blaziken");}
                
                else if(answer.equals("Olive")&&fightingPokemon.contains("Breloom"))
                {System.out.println("You are Breloom");}
                
                else if(answer.equals("Saffron")&&fightingPokemon.contains("Makuhita"))
                {System.out.println("You are Makuhita");}
                
                else if(answer.equals("Saffron")&&fightingPokemon.contains("Hariyama"))
                {System.out.println("You are Hariyama");}
                
                else if(answer.equals("Fuchsia")&&fightingPokemon.contains("Meditite"))
                {System.out.println("You are Meditite");}
                
                else if(answer.equals("Fuchsia")&&fightingPokemon.contains("Medicham"))
                {System.out.println("You are Medicham");}
                
                else if(answer.equals("Bright Orange")&&fightingPokemon.contains("Monferno"))
                {System.out.println("You are Monferno");}
                
                else if(answer.equals("Bright Orange")&&fightingPokemon.contains("Infernape"))
                {System.out.println("You are Infernape");}
                
                else if(answer.equals("Egyptian Blue")&&fightingPokemon.contains("Riolu"))
                {System.out.println("You are Riolu");}
                
                else if(answer.equals("Egyptian Blue")&&fightingPokemon.contains("Lucario"))
                {System.out.println("You are Lucario");}
                
                else if(answer.equals("Indigo")&&fightingPokemon.contains("Croagunk"))
                {System.out.println("You are Croagunk");}
                
                else if(answer.equals("Indigo")&&fightingPokemon.contains("Toxicroak"))
                {System.out.println("You are Toxicroak");}
                
                else if(answer.equals("Lime")&&fightingPokemon.contains("Gallade"))
                {System.out.println("You are Gallade");}
                
                else if(answer.equals("Brick Red")&&fightingPokemon.contains("Pignite"))
                {System.out.println("You are Pignite");}
                
                else if(answer.equals("Brick Red")&&fightingPokemon.contains("Emboar"))
                {System.out.println("You are Emboar");}
                
                else if(answer.equals("Bronze")&&fightingPokemon.contains("Timburr"))
                {System.out.println("You are Timburr");}
                
                else if(answer.equals("Bronze")&&fightingPokemon.contains("Gurdurr"))
                {System.out.println("You are Gurdurr");}
                
                else if(answer.equals("Bronze")&&fightingPokemon.contains("Conkeldurr"))
                {System.out.println("You are Conkeldurr");}
                
                else if(answer.equals("Charcoal")&&fightingPokemon.contains("Throh"))
                {System.out.println("You are Throh");}
                
                else if(answer.equals("Charcoal")&&fightingPokemon.contains("Sawk"))
                {System.out.println("You are Sawk");}
                
                else if(answer.equals("Yellow")&&fightingPokemon.contains("Scraggy"))
                {System.out.println("You are Scraggy");}
                
                else if(answer.equals("Yellow")&&fightingPokemon.contains("Scrafty"))
                {System.out.println("You are Scrafty");}
                
                else if(answer.equals("Amaranth")&&fightingPokemon.contains("Mienfoo"))
                {System.out.println("You are Mienfoo");}
                
                else if(answer.equals("Amaranth")&&fightingPokemon.contains("Mienshao"))
                {System.out.println("You are Mienshao");}
                
                else if(answer.equals("Gold")&&fightingPokemon.contains("Cobalion"))
                {System.out.println("You are Cobalion");}
                
                else if(answer.equals("Gold")&&fightingPokemon.contains("Terrakion"))
                {System.out.println("You are Terrakion");}
                
                else if(answer.equals("Gold")&&fightingPokemon.contains("Virizion"))
                {System.out.println("You are Virizion");}
                
                else if(answer.equals("Red")&&fightingPokemon.contains("Keldeo"))
                {System.out.println("You are Keldeo");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
    }
}}}