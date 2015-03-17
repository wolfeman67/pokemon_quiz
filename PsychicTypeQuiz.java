import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class PsychicTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> psychicPokemon= new ArrayList<String>();
    	psychicPokemon.add("Abra");
    	psychicPokemon.add("Kadabra");
    	psychicPokemon.add("Alakazam");
    	psychicPokemon.add("Slowpoke");
    	psychicPokemon.add("Slowbro");
    	psychicPokemon.add("Drowzee");
    	psychicPokemon.add("Hypno");
    	psychicPokemon.add("Exeggcute");
    	psychicPokemon.add("Exeggutor");
    	psychicPokemon.add("Starmie");
    	psychicPokemon.add("Mr. Mime");
    	psychicPokemon.add("Jynx");
    	psychicPokemon.add("Mewtwo");
    	psychicPokemon.add("Mew");
    	psychicPokemon.add("Natu");
    	psychicPokemon.add("Xatu");
    	psychicPokemon.add("Espeon");
    	psychicPokemon.add("Slowking");
    	psychicPokemon.add("Unown");
    	psychicPokemon.add("Wobbuffet");
    	psychicPokemon.add("Girafarig");
    	psychicPokemon.add("Smoochum");
    	psychicPokemon.add("Lugia");
    	psychicPokemon.add("Celebi");
    	psychicPokemon.add("Ralts");
    	psychicPokemon.add("Kirlia");
    	psychicPokemon.add("Gardevoir");
    	psychicPokemon.add("Meditite");
    	psychicPokemon.add("Medicham");
    	psychicPokemon.add("Spoink");
    	psychicPokemon.add("Grumpig");
    	psychicPokemon.add("Lunatone");
    	psychicPokemon.add("Solrock");
    	psychicPokemon.add("Baltoy");
    	psychicPokemon.add("Claydol");
    	psychicPokemon.add("Chimecho");
    	psychicPokemon.add("Wynaut");
    	psychicPokemon.add("Beldum");
    	psychicPokemon.add("Metang");
    	psychicPokemon.add("Metagross");
    	psychicPokemon.add("Latias");
    	psychicPokemon.add("Latios");
    	psychicPokemon.add("Jirachi");
    	psychicPokemon.add("Deoxys");
    	psychicPokemon.add("Chingling");
    	psychicPokemon.add("Bronzor");
    	psychicPokemon.add("Bronzong");
    	psychicPokemon.add("Mime Jr.");
    	psychicPokemon.add("Gallade");
    	psychicPokemon.add("Uxie");
    	psychicPokemon.add("Mesprit");
    	psychicPokemon.add("Azelf");
    	psychicPokemon.add("Cresselia");
    	psychicPokemon.add("Victini");
    	psychicPokemon.add("Munna");
    	psychicPokemon.add("Musharna");
    	psychicPokemon.add("Woobat");
    	psychicPokemon.add("Swoobat");
    	psychicPokemon.add("Sigilyph");
    	psychicPokemon.add("Gothita");
    	psychicPokemon.add("Gothorita");
    	psychicPokemon.add("Gothitelle");
    	psychicPokemon.add("Solosis");
    	psychicPokemon.add("Duosion");
    	psychicPokemon.add("Reuniclus");
    	psychicPokemon.add("Elgyem");
    	psychicPokemon.add("Beheeyem");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Meloetta");
		psychicPokemon.remove("Uxie");
		psychicPokemon.remove("Mesprit");
		psychicPokemon.remove("Azelf");
		psychicPokemon.remove("Victini");
		psychicPokemon.remove("Cresselia");
		psychicPokemon.remove("Latias");
		psychicPokemon.remove("Latios");
		psychicPokemon.remove("Jirachi");
		psychicPokemon.remove("Deoxys");
		psychicPokemon.remove("Lugia");
		psychicPokemon.remove("Celebi");
		psychicPokemon.remove("Mew");
		psychicPokemon.remove("Mewtwo");
		}
		System.out.println();
                
                System.out.println("Are you male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Gallade");
		psychicPokemon.remove("Latios");
		}
                if(answer.equals("yes"))
                {psychicPokemon.remove("Latias");
                psychicPokemon.remove("Smoochum");
                psychicPokemon.remove("Jynx");
                psychicPokemon.remove("Cresselia");
                }
		System.out.println();

		System.out.println("Do you enjoy sleeping in for long hours?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Abra");
		psychicPokemon.remove("Kadabra");
		psychicPokemon.remove("Alakazam");
		}
		System.out.println();

		System.out.println("Do you tend to do what your friends do or follow what they follow, as opposed to being your own person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Mr. Mime");
		psychicPokemon.remove("Mime Jr.");
		}
		System.out.println();

		System.out.println("Are you slow at getting peoples' jokes or ideas?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Slowpoke");
		psychicPokemon.remove("Slowbro");
		}
                if(answer.equals("yes"))
                {psychicPokemon.remove("Slowking");}
		System.out.println();

		System.out.println("Do you creep people out on purpose or not?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Drowzee");
		psychicPokemon.remove("Hypno");
		}
		System.out.println();

		System.out.println("Does it seem like you have multiple personalities?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Exeggcute");
		psychicPokemon.remove("Exeggutor");
		}
		System.out.println();

		if(psychicPokemon.contains("Jynx")||psychicPokemon.contains("Smoochum"))
                {System.out.println("Does it seem like guys are constantly fighting for your attention or trying to impress you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Jynx");
		psychicPokemon.remove("Smoochum");
		}
		System.out.println();}

		System.out.println("Do you tend to zone off or daydream?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Natu");
		psychicPokemon.remove("Xatu");
		}
		System.out.println();

		System.out.println("Is it easy for you to understand people, their problems, and how they think?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Espeon");
		}
		System.out.println();

		System.out.println("Are you more into literature than you are into mathematics?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Unown");
		}
		System.out.println();

		System.out.println("Are you not easily bothered by insults?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Wobbuffet");
		psychicPokemon.remove("Wynaut");
		}
		System.out.println();

		System.out.println("Are you honestly bipolar or tend to contradict yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Girafarig");
		}
		System.out.println();

		System.out.println("Does it often seem like you have music in your head that you will occasionally dance to?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Ralts");
		psychicPokemon.remove("Kirlia");
		psychicPokemon.remove("Gardevoir");
		}
		System.out.println();

		System.out.println("Do you relentlessly pursue individuals of the opposite gender or have a really romantic heart?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Woobat");
		psychicPokemon.remove("Swoobat");
		}
		System.out.println();

		System.out.println("Have you sometimes felt that you're not really a human?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Elgyem");
		psychicPokemon.remove("Beheeyem");
		psychicPokemon.remove("Starmie");
		}
		System.out.println();

		System.out.println("Do people see you as an emo person or someone that is into a counter culture that is also into their feminine side?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Gothita");
		psychicPokemon.remove("Gothorita");
		psychicPokemon.remove("Gothitelle");
		}
		System.out.println();

		System.out.println("Would you spend five years of hard work and determination to reach a goal?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Meditite");
		psychicPokemon.remove("Medicham");
		}
		System.out.println();

		System.out.println("Do you treat your toys or possessions as if they had feelings of their own?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Baltoy");
		psychicPokemon.remove("Claydol");
		}
		System.out.println();

		System.out.println("Do you tolerate every kind of human being, even the ones you don't neccessarily like or disagree with?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Solosis");
		psychicPokemon.remove("Duosion");
		psychicPokemon.remove("Reuniclus");
		}
		System.out.println();

		System.out.println("Do you get more energy when you are with more friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Beldum");
		psychicPokemon.remove("Metang");
		psychicPokemon.remove("Metagross");
		}
		System.out.println();



		System.out.println("Have you ever hallucinated (from drugs or not) or do you tend to let your imagination run wild?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Munna");
		psychicPokemon.remove("Musharna");
		}
		System.out.println();

		System.out.println("Do you have a certain item or part of you that you could not live without?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Spoink");
		psychicPokemon.remove("Grumpig");
		}
		System.out.println();

		if(psychicPokemon.contains("Starmie"))
		{System.out.println("Do people see you as a shining star?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Starmie");
		}}
		System.out.println();

		System.out.println("Can you sing very well or play a musical instrument?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Chimecho");
		psychicPokemon.remove("Chingling");
		}
		System.out.println();

		System.out.println("Do people see you as a good luck charm or someone that has the tendancy to cheer up people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Bronzor");
		psychicPokemon.remove("Bronzong");
		}
		System.out.println();

		System.out.println("Are you a night person rather than a day person?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Lunatone");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Solrock");}
		System.out.println();

		System.out.println("Do ancient civilization cultures deeply interest you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Sigilyph");
		}
		System.out.println();

		System.out.println("Are you still legally a child (under the age of 18)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Munna");
		psychicPokemon.remove("Bronzor");
		psychicPokemon.remove("Abra");
		psychicPokemon.remove("Slowpoke");
		psychicPokemon.remove("Drowzee");
		psychicPokemon.remove("Exeggcute");
		psychicPokemon.remove("Natu");
		psychicPokemon.remove("Smoochum");
		psychicPokemon.remove("Ralts");
		psychicPokemon.remove("Meditite");
		psychicPokemon.remove("Spoink");
		psychicPokemon.remove("Baltoy");
		psychicPokemon.remove("Wynaut");
		psychicPokemon.remove("Beldum");
		psychicPokemon.remove("Chingling");
		psychicPokemon.remove("Bronzor");
		psychicPokemon.remove("Mime Jr.");
		psychicPokemon.remove("Woobat");
		psychicPokemon.remove("Gothita");
		psychicPokemon.remove("Solosis");
		psychicPokemon.remove("Elgyem");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Kadabra");
		psychicPokemon.remove("Alakazam");
		psychicPokemon.remove("Slowbro");
		psychicPokemon.remove("Hypno");
		psychicPokemon.remove("Exeggutor");
		psychicPokemon.remove("Starmie");
		psychicPokemon.remove("Mr. Mime");
		psychicPokemon.remove("Jynx");
		psychicPokemon.remove("Xatu");
		psychicPokemon.remove("Espeon");
		psychicPokemon.remove("Slowking");
		psychicPokemon.remove("Wobbuffet");
		psychicPokemon.remove("Kirlia");
		psychicPokemon.remove("Gardevoir");
		psychicPokemon.remove("Medicham");
		psychicPokemon.remove("Grumpig");
		psychicPokemon.remove("Claydol");
		psychicPokemon.remove("Metang");
		psychicPokemon.remove("Metagross");
		psychicPokemon.remove("Bronzong");
		psychicPokemon.remove("Gallade");
		psychicPokemon.remove("Swoobat");
		psychicPokemon.remove("Musharna");
		psychicPokemon.remove("Gothorita");
		psychicPokemon.remove("Gothitelle");
		psychicPokemon.remove("Duosion");
		psychicPokemon.remove("Reuniclus");
		psychicPokemon.remove("Beheeyem");}
		System.out.println();
                
                if(psychicPokemon.contains("Gallade"))
                {System.out.println("Are you the black sheep in your family?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Gallade");
		}
                if(answer.equals("yes"))
                {psychicPokemon.remove("Kirlia");
                psychicPokemon.remove("Gardevoir");
                }
		System.out.println();}

		if(psychicPokemon.contains("Alakazam"))
		{System.out.println("Do you have a photographic memory?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Alakazam");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Kadabra");
		}
		System.out.println();}

		if(psychicPokemon.contains("Slowking"))
		{System.out.println("Are your manners refined and sophisticated?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Slowking");
		}
		System.out.println();}

		if(psychicPokemon.contains("Gardevoir"))
		{System.out.println("Would you sacrifice yourself for someone?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Gardevoir");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Kirlia");
		}
		System.out.println();}

		if(psychicPokemon.contains("Metagross"))
		{System.out.println("Are your close friends all nerdy or intellectual?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Metagross");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Metang");
		}
		System.out.println();}

		if(psychicPokemon.contains("Gothitelle"))
		{System.out.println("Have you lost someone close to you or do you suffer from depression?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Gothitelle");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Gothorita");
		}
		System.out.println();}

		if(psychicPokemon.contains("Reuniclus"))
		{System.out.println("Do you believe that every kind of human being contributes to the well-being of the world?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Reuniclus");
		}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Duosion");
		}
		System.out.println();}

		if(psychicPokemon.contains("Jirachi"))
		{System.out.println("Do you have the power to grant worthy peoples' wishes?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Jirachi");
		}
		System.out.println();}

		if(psychicPokemon.contains("Uxie"))
		{System.out.println("Which of these do you think is the most important for success: knowledge, experience, or perseverance?");
		answer=pokescan.nextLine();
		if(answer.equals("knowledge"))
		{psychicPokemon.remove("Mesprit");
		psychicPokemon.remove("Azelf");}
		if(answer.equals("experience"))
		{psychicPokemon.remove("Uxie");
		psychicPokemon.remove("Azelf");}
		if(answer.equals("perseverance"))
		{psychicPokemon.remove("Uxie");
		psychicPokemon.remove("Mesprit");}
                else
                {psychicPokemon.remove("Uxie");
                psychicPokemon.remove("Azelf");
                psychicPokemon.remove("Mesprit");
                }
		System.out.println();}

		if(psychicPokemon.contains("Mewtwo"))
		{System.out.println("Do you feel no pain or remorse when you harm others (in another words are you a sociopath)?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Mewtwo");
		}
		System.out.println();}

		if(psychicPokemon.contains("Mew"))
		{System.out.println("Are you a Renaissance man or woman that is really skilled in many different, challenging areas?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Mew");
		}
		System.out.println();}

		if(psychicPokemon.contains("Lugia"))
		{System.out.println("Do you feel as if you have a deep connection to the sea?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Lugia");
		}
		System.out.println();}

		if(psychicPokemon.contains("Celebi"))
		{System.out.println("Do you have the power to bring peace wherever you go?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Celebi");
		}
		System.out.println();}

		if(psychicPokemon.contains("Cresselia"))
		{System.out.println("Has the use of your imagination brought you to a position of fame or notoriety?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Cresselia");
		}
		System.out.println();}

		if(psychicPokemon.contains("Latias"))
		{System.out.println("Have you visited more than 10 countries?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Latias");
		psychicPokemon.remove("Latios");
		}
		System.out.println();}

		if(psychicPokemon.contains("Latias"))
		{System.out.println("Are you female?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Latias");}
		if(answer.equals("yes"))
		{psychicPokemon.remove("Latios");}
		System.out.println();}

		if(psychicPokemon.contains("Deoxys"))
		{System.out.println("Do you believe that humans will one day see aliens from another planet?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Deoxys");
		}
		System.out.println();}

		if(psychicPokemon.contains("Victini"))
		{System.out.println("Have you won a major championship or competition worth merit?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{psychicPokemon.remove("Victini");
		}
		System.out.println();}


		if(psychicPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(psychicPokemon.size()==1)
			out.println("You are " + psychicPokemon.get(0));
		if(psychicPokemon.size()>1)
		{String psychicAura=new String("\n");
		if(psychicPokemon.contains("Abra")||psychicPokemon.contains("Kadabra")||psychicPokemon.contains("Alakazam"))
		{psychicAura=psychicAura + "Bronze\n";}
		if(psychicPokemon.contains("Slowpoke")||psychicPokemon.contains("Slowbro")||psychicPokemon.contains("Slowking"))
		{psychicAura=psychicAura + "Purple\n";}
		if(psychicPokemon.contains("Drowzee")||psychicPokemon.contains("Hypno"))
		{psychicAura=psychicAura + "Amber\n";}
		if(psychicPokemon.contains("Jynx")||psychicPokemon.contains("Smoochum"))
		{psychicAura=psychicAura + "Pink\n";}
		if(psychicPokemon.contains("Exeggcute")||psychicPokemon.contains("Exeggutor"))
		{psychicAura=psychicAura + "Cream\n";}
		if(psychicPokemon.contains("Mr. Mime")||psychicPokemon.contains("Mime Jr."))
		{psychicAura=psychicAura + "Mauve\n";}
		if(psychicPokemon.contains("Mewtwo"))
		{psychicAura=psychicAura + "Black\n";}
		if(psychicPokemon.contains("Mew"))
		{psychicAura=psychicAura + "Gold\n";}
		if(psychicPokemon.contains("Natu")||psychicPokemon.contains("Xatu"))
		{psychicAura=psychicAura + "Amazon\n";}
		if(psychicPokemon.contains("Espeon"))
		{psychicAura=psychicAura + "Lavender\n";}
		if(psychicPokemon.contains("Unown"))
		{psychicAura=psychicAura + "Charcoal\n";}
		if(psychicPokemon.contains("Wobbuffet")||psychicPokemon.contains("Wynaut"))
		{psychicAura=psychicAura + "Cyan\n";}
		if(psychicPokemon.contains("Girafarig"))
		{psychicAura=psychicAura + "Sepia\n";}
		if(psychicPokemon.contains("Lugia"))
		{psychicAura=psychicAura + "Silver\n";}
		if(psychicPokemon.contains("Celebi"))
		{psychicAura=psychicAura + "Forest Green\n";}
		if(psychicPokemon.contains("Ralts")||psychicPokemon.contains("Kirlia")||psychicPokemon.contains("Gardevoir")||psychicPokemon.contains("Gallade"))
		{psychicAura=psychicAura + "Azure\n";}
		if(psychicPokemon.contains("Meditite")||psychicPokemon.contains("Medicham"))
		{psychicAura=psychicAura + "Scarlet\n";}
		if(psychicPokemon.contains("Spoink")||psychicPokemon.contains("Grumpig"))
		{psychicAura=psychicAura + "Grape Purple\n";}
                if(psychicPokemon.contains("Lunatone"))
                {psychicAura=psychicAura + "Moonstone\n";}
		if(psychicPokemon.contains("Solrock"))
		{psychicAura=psychicAura + "Copper\n";}
		if(psychicPokemon.contains("Baltoy")||psychicPokemon.contains("Claydol"))
		{psychicAura=psychicAura + "Light Brown\n";}
		if(psychicPokemon.contains("Chimecho")||psychicPokemon.contains("Chingling"))
		{psychicAura=psychicAura + "Fuschia\n";}
		if(psychicPokemon.contains("Beldum")||psychicPokemon.contains("Metang")||psychicPokemon.contains("Metagross"))
		{psychicAura=psychicAura + "Steel Blue\n";}
		if(psychicPokemon.contains("Latios")||psychicPokemon.contains("Latias"))
		{psychicAura=psychicAura + "White\n";}
		if(psychicPokemon.contains("Jirachi"))
		{psychicAura=psychicAura + "Sunglow\n";}
		if(psychicPokemon.contains("Deoxys"))
		{psychicAura=psychicAura + "Orange\n";}
		if(psychicPokemon.contains("Bronzor")||psychicPokemon.contains("Bronzong"))
		{psychicAura=psychicAura + "Iron Gray\n";}
		if(psychicPokemon.contains("Uxie")||psychicPokemon.contains("Azelf")||psychicPokemon.contains("Mesprit"))
		{psychicAura=psychicAura + "Celestial Blue\n";}
		if(psychicPokemon.contains("Cresselia"))
		{psychicAura=psychicAura + "Pearl\n";}
		if(psychicPokemon.contains("Victini"))
		{psychicAura=psychicAura + "Red\n";}
		if(psychicPokemon.contains("Munna")||psychicPokemon.contains("Musharna"))
		{psychicAura=psychicAura + "Magenta\n";}
		if(psychicPokemon.contains("Woobat")||psychicPokemon.contains("Swoobat"))
		{psychicAura=psychicAura + "Cotton\n";}
		if(psychicPokemon.contains("Sigilyph"))
		{psychicAura=psychicAura + "Sand\n";}
		if(psychicPokemon.contains("Gothita")||psychicPokemon.contains("Gothorita")||psychicPokemon.contains("Gothitelle"))
		{psychicAura=psychicAura + "Dark Blue\n";}
		if(psychicPokemon.contains("Solosis")||psychicPokemon.contains("Duosion")||psychicPokemon.contains("Reuniclus"))
		{psychicAura=psychicAura + "Mint\n";}
		if(psychicPokemon.contains("Elgyem")||psychicPokemon.contains("Beheeyem"))
		{psychicAura=psychicAura + "Teal\n";}
		if(psychicPokemon.contains("Starmie"))
		{psychicAura=psychicAura + "Ruby Red\n";}
		{System.out.println("Out of these colors:" +psychicAura +"which one describes you the most?");
		answer=pokescan.nextLine();
		
                if(answer.equals("Bronze")&&psychicPokemon.contains("Abra"))
                {System.out.println("You are Abra");}
                
                else if(answer.equals("Bronze")&&psychicPokemon.contains("Kadabra"))
                {System.out.println("You are Kadabra");}
                
                else if(answer.equals("Bronze")&&psychicPokemon.contains("Alakazam"))
                {System.out.println("You are Alakazam");}
                
                else if(answer.equals("Purple")&&psychicPokemon.contains("Slowpoke"))
                {System.out.println("You are Slowpoke");}
                
                else if(answer.equals("Purple")&&psychicPokemon.contains("Slowbro"))
                {System.out.println("You are Slowbro");}
                
                else if(answer.equals("Amber")&&psychicPokemon.contains("Drowzee"))
                {System.out.println("You are Drowzee");}
                
                else if(answer.equals("Amber")&&psychicPokemon.contains("Hypno"))
                {System.out.println("You are Hypno");}
                
                else if(answer.equals("Cream")&&psychicPokemon.contains("Exeggcute"))
                {System.out.println("You are Exeggcute");}
                
                else if(answer.equals("Cream")&&psychicPokemon.contains("Exeggutor"))
                {System.out.println("You are Exeggutor");}
                
                else if(answer.equals("Ruby Red")&&psychicPokemon.contains("Starmie"))
                {System.out.println("You are Starmie");}
                
                else if(answer.equals("Mauve")&&psychicPokemon.contains("Mr. Mime"))
                {System.out.println("You are Mr. Mime");}
                
                else if(answer.equals("Pink")&&psychicPokemon.contains("Jynx"))
                {System.out.println("You are Jynx");}
                
                else if(answer.equals("Black")&&psychicPokemon.contains("Mewtwo"))
                {System.out.println("You are Mewtwo");}
                
                else if(answer.equals("Gold")&&psychicPokemon.contains("Mew"))
                {System.out.println("You are Mew");}
                
                else if(answer.equals("Amazon")&&psychicPokemon.contains("Natu"))
                {System.out.println("You are Natu");}
                
                else if(answer.equals("Amazon")&&psychicPokemon.contains("Xatu"))
                {System.out.println("You are Xatu");}
                
                else if(answer.equals("Lavender")&&psychicPokemon.contains("Espeon"))
                {System.out.println("You are Espeon");}
                
                else if(answer.equals("Purple")&&psychicPokemon.contains("Slowking"))
                {System.out.println("You are Slowking");}
                
                else if(answer.equals("Charcoal")&&psychicPokemon.contains("Unown"))
                {System.out.println("You are Unown");}
                
                else if(answer.equals("Cyan")&&psychicPokemon.contains("Wobbuffet"))
                {System.out.println("You are Wobbuffet");}
                
                else if(answer.equals("Sepia")&&psychicPokemon.contains("Girafarig"))
                {System.out.println("You are Girafarig");}
                
                else if(answer.equals("Pink")&&psychicPokemon.contains("Smoochum"))
                {System.out.println("You are Smoochum");}
                
                else if(answer.equals("Silver")&&psychicPokemon.contains("Lugia"))
                {System.out.println("You are Lugia");}
                
                else if(answer.equals("Forest Green")&&psychicPokemon.contains("Celebi"))
                {System.out.println("You are Celebi");}
                
                else if(answer.equals("Azure")&&psychicPokemon.contains("Ralts"))
                {System.out.println("You are Ralts");}
                
                else if(answer.equals("Azure")&&psychicPokemon.contains("Kirlia"))
                {System.out.println("You are Kirlia");}
                
                else if(answer.equals("Azure")&&psychicPokemon.contains("Gardevoir"))
                {System.out.println("You are Gardevoir");}
                
                else if(answer.equals("Scarlet")&&psychicPokemon.contains("Meditite"))
                {System.out.println("You are Meditite");}
                
                else if(answer.equals("Scarlet")&&psychicPokemon.contains("Medicham"))
                {System.out.println("You are Medicham");}
                
                else if(answer.equals("Grape Purple")&&psychicPokemon.contains("Spoink"))
                {System.out.println("You are Spoink");}
                
                else if(answer.equals("Grape Purple")&&psychicPokemon.contains("Grumpig"))
                {System.out.println("You are Grumpig");}
                
                else if(answer.equals("Moonstone")&&psychicPokemon.contains("Lunatone"))
                {System.out.println("You are Lunatone");}
                
                else if(answer.equals("Copper")&&psychicPokemon.contains("Solrock"))
                {System.out.println("You are Solrock");}
                
                else if(answer.equals("Light Brown")&&psychicPokemon.contains("Baltoy"))
                {System.out.println("You are Baltoy");}
                
                else if(answer.equals("Light Brown")&&psychicPokemon.contains("Claydol"))
                {System.out.println("You are Claydol");}
                
                else if(answer.equals("Baby Blue")&&psychicPokemon.contains("Chimecho"))
                {System.out.println("You are Chimecho");}
                
                else if(answer.equals("Cyan")&&psychicPokemon.contains("Wynaut"))
                {System.out.println("You are Wynaut");}
                
                else if(answer.equals("Steel Blue")&&psychicPokemon.contains("Beldum"))
                {System.out.println("You are Beldum");}
                
                else if(answer.equals("Steel Blue")&&psychicPokemon.contains("Metang"))
                {System.out.println("You are Metang");}
                
                else if(answer.equals("Steel Blue")&&psychicPokemon.contains("Metagross"))
                {System.out.println("You are Metagross");}
                
                else if(answer.equals("White")&&psychicPokemon.contains("Latias"))
                {System.out.println("You are Latias");}
                
                else if(answer.equals("White")&&psychicPokemon.contains("Latios"))
                {System.out.println("You are Latios");}
                
                else if(answer.equals("Sunglow")&&psychicPokemon.contains("Jirachi"))
                {System.out.println("You are Jirachi");}
                
                else if(answer.equals("Orange")&&psychicPokemon.contains("Deoxys"))
                {System.out.println("You are Deoxys");}
                
                else if(answer.equals("Baby Blue")&&psychicPokemon.contains("Chingling"))
                {System.out.println("You are Chingling");}
                
                else if(answer.equals("Iron Gray")&&psychicPokemon.contains("Bronzor"))
                {System.out.println("You are Bronzor");}
                
                else if(answer.equals("Iron Gray")&&psychicPokemon.contains("Bronzong"))
                {System.out.println("You are Bronzong");}
                
                else if(answer.equals("Mauve")&&psychicPokemon.contains("Mime Jr."))
                {System.out.println("You are Mime Jr.");}
                
                else if(answer.equals("Azure")&&psychicPokemon.contains("Gallade"))
                {System.out.println("You are Gallade");}
                
                else if(answer.equals("Celestial Blue")&&psychicPokemon.contains("Uxie"))
                {System.out.println("You are Uxie");}
                
                else if(answer.equals("Celestial Blue")&&psychicPokemon.contains("Azelf"))
                {System.out.println("You are Azelf");}
                
                else if(answer.equals("Celestial Blue")&&psychicPokemon.contains("Mesprit"))
                {System.out.println("You are Mesprit");}
                
                else if(answer.equals("Pearl")&&psychicPokemon.contains("Cresselia"))
                {System.out.println("You are Cresselia");}
                
                else if(answer.equals("Red")&&psychicPokemon.contains("Victini"))
                {System.out.println("You are Victini");}
                
                else if(answer.equals("Magenta")&&psychicPokemon.contains("Munna"))
                {System.out.println("You are Munna");}
                
                else if(answer.equals("Magenta")&&psychicPokemon.contains("Musharna"))
                {System.out.println("You are Musharna");}
                
                else if(answer.equals("Cotton")&&psychicPokemon.contains("Woobat"))
                {System.out.println("You are Woobat");}
                
                else if(answer.equals("Cotton")&&psychicPokemon.contains("Swoobat"))
                {System.out.println("You are Swoobat");}
                
                else if(answer.equals("Sand")&&psychicPokemon.contains("Sigilyph"))
                {System.out.println("You are Sigilyph");}
                
                else if(answer.equals("Dark Blue")&&psychicPokemon.contains("Gothita"))
                {System.out.println("You are Gothita");}
                
                else if(answer.equals("Dark Blue")&&psychicPokemon.contains("Gothorita"))
                {System.out.println("You are Gothorita");}
                
                else if(answer.equals("Dark Blue")&&psychicPokemon.contains("Gothitelle"))
                {System.out.println("You are Gothitelle");}
                
                else if(answer.equals("Mint")&&psychicPokemon.contains("Solosis"))
                {System.out.println("You are Solosis");}
                
                else if(answer.equals("Mint")&&psychicPokemon.contains("Duosion"))
                {System.out.println("You are Duosion");}
                
                else if(answer.equals("Mint")&&psychicPokemon.contains("Reuniclus"))
                {System.out.println("You are Reuniclus");}
                
                else if(answer.equals("Teal")&&psychicPokemon.contains("Elgyem"))
                {System.out.println("You are Elgyem");}
                
                else if(answer.equals("Teal")&&psychicPokemon.contains("Beheeyem"))
                {System.out.println("You are Beheeyem");}
                
                else
                {System.out.println("There was an error. You are Missingno");}
}}}}