import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import static java.lang.System.*;

public class NormalTypeQuiz
{
    public static void innerSearch()
    {
    	ArrayList<String> normalPokemon= new ArrayList<String>();
		normalPokemon.add("Pidgey");
		normalPokemon.add("Pidgeotto");
		normalPokemon.add("Pidgeot");
		normalPokemon.add("Rattata");
		normalPokemon.add("Raticate");
		normalPokemon.add("Spearow");
		normalPokemon.add("Fearow");
		normalPokemon.add("Clefairy");
		normalPokemon.add("Clefable");
		normalPokemon.add("Jigglypuff");
		normalPokemon.add("Wigglytuff");
		normalPokemon.add("Meowth");
		normalPokemon.add("Persian");
		normalPokemon.add("Farfetch'd");
		normalPokemon.add("Doduo");
		normalPokemon.add("Dodrio");
		normalPokemon.add("Lickitung");
		normalPokemon.add("Chansey");
		normalPokemon.add("Kangaskhan");
		normalPokemon.add("Tauros");
		normalPokemon.add("Ditto");
		normalPokemon.add("Eevee");
		normalPokemon.add("Porygon");
		normalPokemon.add("Snorlax");
		normalPokemon.add("Sentret");
		normalPokemon.add("Furret");
		normalPokemon.add("Hoothoot");
		normalPokemon.add("Noctowl");
		normalPokemon.add("Cleffa");
		normalPokemon.add("Igglybuff");
		normalPokemon.add("Togepi");
		normalPokemon.add("Togetic");
		normalPokemon.add("Aipom");
		normalPokemon.add("Girafarig");
		normalPokemon.add("Dunsparce");
		normalPokemon.add("Snubbull");
		normalPokemon.add("Granbull");
		normalPokemon.add("Teddiursa");
		normalPokemon.add("Ursaring");
		normalPokemon.add("Porygon2");
		normalPokemon.add("Stantler");
		normalPokemon.add("Smeargle");
		normalPokemon.add("Miltank");
		normalPokemon.add("Blissey");
		normalPokemon.add("Zigzagoon");
		normalPokemon.add("Linoone");
		normalPokemon.add("Taillow");
		normalPokemon.add("Swellow");
		normalPokemon.add("Slakoth");
		normalPokemon.add("Vigoroth");
		normalPokemon.add("Slaking");
		normalPokemon.add("Whismur");
		normalPokemon.add("Loudred");
		normalPokemon.add("Exploud");
		normalPokemon.add("Azurill");
		normalPokemon.add("Skitty");
		normalPokemon.add("Delcatty");
		normalPokemon.add("Spinda");
		normalPokemon.add("Swablu");
		normalPokemon.add("Zangoose");
		normalPokemon.add("Castform");
		normalPokemon.add("Kecleon");
		normalPokemon.add("Starly");
		normalPokemon.add("Staravia");
		normalPokemon.add("Staraptor");
		normalPokemon.add("Bidoof");
		normalPokemon.add("Bibarel");
		normalPokemon.add("Ambipom");
		normalPokemon.add("Buneary");
		normalPokemon.add("Lopunny");
		normalPokemon.add("Glameow");
		normalPokemon.add("Purugly");
		normalPokemon.add("Happiny");
		normalPokemon.add("Chatot");
		normalPokemon.add("Munchlax");
		normalPokemon.add("Lickilicky");
		normalPokemon.add("Togekiss");
		normalPokemon.add("Porygon-Z");
		normalPokemon.add("Regigigas");
		normalPokemon.add("Arceus");
		normalPokemon.add("Patrat");
		normalPokemon.add("Watchog");
		normalPokemon.add("Lillipup");
		normalPokemon.add("Herdier");
		normalPokemon.add("Stoutland");
		normalPokemon.add("Pidove");
		normalPokemon.add("Tranquill");
		normalPokemon.add("Unfezant");
		normalPokemon.add("Audino");
		normalPokemon.add("Minccino");
		normalPokemon.add("Cinccino");
		normalPokemon.add("Deerling");
		normalPokemon.add("Sawsbuck");
		normalPokemon.add("Bouffalant");
		normalPokemon.add("Rufflet");
		normalPokemon.add("Braviary");
		normalPokemon.add("Meloetta");


    	Scanner pokescan = new Scanner (System.in);
		System.out.println("Reply \"yes\" to all that apply \n");
		String answer="";

		System.out.println("Are you famous and well-known out of your home?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Regigigas");
		normalPokemon.remove("Arceus");
		normalPokemon.remove("Meloetta");
		}
		System.out.println();
                
                System.out.println("Are you male?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Tauros");
		normalPokemon.remove("Rufflet");
		normalPokemon.remove("Braviary");
		}
                if(answer.equals("yes"))
                {normalPokemon.remove("Happiny");
                normalPokemon.remove("Chansey");
                normalPokemon.remove("Blissey");
                normalPokemon.remove("Miltank");
                normalPokemon.remove("Kangaskhan");
                }
		System.out.println();

		System.out.println("Do you have a disgusting or annoying habit such as biting your nails?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Rattata");
		normalPokemon.remove("Raticate");
		}
		System.out.println();

		System.out.println("Are you interested with what lies far away in the universe?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Cleffa");
		normalPokemon.remove("Clefairy");
		normalPokemon.remove("Clefable");
		}
		System.out.println();

		System.out.println("Do you really have a beautiful singing voice that everyone enjoys?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Igglybuff");
		normalPokemon.remove("Jigglypuff");
		normalPokemon.remove("Wigglytuff");
		}
		System.out.println();

		System.out.println("Are you an audiophile who likes to analyze musical and sound quality of song tracks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Audino");}
		System.out.println();

		System.out.println("Do you value money or nice possessions over friends and family?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Meowth");
		normalPokemon.remove("Persian");
		}
		System.out.println();

		System.out.println("Do you spend more time on the internet then you do socializing with friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Porygon");
		normalPokemon.remove("Porygon2");
		normalPokemon.remove("Porygon-Z");
		}
		System.out.println();

		System.out.println("Do you find it rather difficult to focus on tasks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Zigzagoon");
		normalPokemon.remove("Linoone");
		}
		System.out.println();

		if(normalPokemon.contains("Tauros"))
                {System.out.println("Do you have a need to challenge people just to prove you're the best at something?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Tauros");
		}
		System.out.println();}

		System.out.println("Do you express yourself in a form of art?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Smeargle");
		}
		System.out.println();

		if(normalPokemon.contains("Chansey")||normalPokemon.contains("Blissey")||normalPokemon.contains("Happiny"))
                {System.out.println("Do you believe that spreading happiness to the people around you is the greatest joy in the world?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Happiny");
		normalPokemon.remove("Chansey");
		normalPokemon.remove("Blissey");
		}
		System.out.println();}

		System.out.println("Do you tend to be the loudest and most talkative in your group of friends?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Whismur");
		normalPokemon.remove("Loudred");
		normalPokemon.remove("Exploud");
		}
		System.out.println();

		System.out.println("Is spring time your favorite season of the year?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Deerling");
		normalPokemon.remove("Sawsbuck");
		}
		System.out.println();

		System.out.println("Are you somewhat paranoid about what people think of you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Patrat");
		normalPokemon.remove("Watchog");
		}
		System.out.println();

		System.out.println("Are your desires or actions rather spontaneous?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Skitty");
		normalPokemon.remove("Delcatty");
		}
		System.out.println();

		System.out.println("Are you brave and open to try new (often risky) things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Lillipup");
		normalPokemon.remove("Herdier");
		normalPokemon.remove("Stoutland");
		}
		System.out.println();

		System.out.println("Do you like to try new kinds of food and drinks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Lickitung");
		normalPokemon.remove("Lickilicky");
		}
		System.out.println();

		if(normalPokemon.contains("Kangaskhan"))
                {System.out.println("Are you naturally nurturing and caring for those younger than you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Kangaskhan");
		}
		System.out.println();}

		System.out.println("Do you let the standards of others determine what you are?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Ditto");
		}
		System.out.println();

		System.out.println("Do you tend to argue with or contradict yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Doduo");
		normalPokemon.remove("Dodrio");
		}
		System.out.println();

		System.out.println("Do you feel like you're constantly neglected or forgotten?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Farfetch'd");
		}
		System.out.println();

		System.out.println("Are you a couch potato who loves to eat and sleep and laze around all day?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Munchlax");
		normalPokemon.remove("Snorlax");
		}
		System.out.println();

		System.out.println("Would you much rather live a comfortable, low-profile lifestyle, than an important, stressful life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Pidgey");
		normalPokemon.remove("Pidgeotto");
		normalPokemon.remove("Pidgeot");
		}
		System.out.println();

		System.out.println("Are you protective of your possessions and are uneasy when loaning stuff to people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Spearow");
		normalPokemon.remove("Fearow");
		}
		System.out.println();

		System.out.println("Are you rather nervous when meeting new people or doing new things?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Sentret");
		normalPokemon.remove("Furret");
		}
		System.out.println();

		System.out.println("Can you keep perfect and exact rhythm or time?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Hoothoot");
		normalPokemon.remove("Noctowl");
		}
		System.out.println();

		System.out.println("Do you like to have standards of cleanliness that others consider excessive?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Minccino");
		normalPokemon.remove("Cinccino");
		}
		System.out.println();

		System.out.println("Are you or other people confused about who you are?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Dunsparce");
		}
		System.out.println();

		System.out.println("Do you believe that world peace is the most important goal?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Pidove");
		normalPokemon.remove("Tranquill");
		normalPokemon.remove("Unfezant");
		}
		System.out.println();

		System.out.println("Are you a \"goody-two-shoes\" angel who could never do anything evil?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Togepi");
		normalPokemon.remove("Togetic");
		normalPokemon.remove("Togekiss");
		}
		System.out.println();

		System.out.println("Do you have a distinct and recognizable dark side in your personality?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Girafarig");
		}
		System.out.println();

		System.out.println("Do you not like having to put much effort into your actions or pursuits?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Slakoth");
		normalPokemon.remove("Slaking");
		}
		System.out.println();

		System.out.println("Are you ambidextrous?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Aipom");
		normalPokemon.remove("Ambipom");
		}
		System.out.println();

		System.out.println("Can you fit in and socialize with any kind of crowd?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Kecleon");
		}
		System.out.println();

		System.out.println("Do you sometimes become angry and violent, and destroy some objects around you?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Bouffalant");
		}
		System.out.println();

		System.out.println("Do you like to do things solitaire if but just to see what you can do entirely by yourself?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Taillow");
		normalPokemon.remove("Swellow");
		}
		System.out.println();

		System.out.println("Do you like to appear to be threatening or powerful or great in order to conceal an insecurity?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Snubbull");
		normalPokemon.remove("Granbull");
		}
		System.out.println();

		System.out.println("Are you a regular flirter or do you have the ability to charm even random strangers?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Buneary");
		normalPokemon.remove("Lopunny");
		}
		System.out.println();

		System.out.println("Are you bilingual?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Chatot");
		}
		System.out.println();

		System.out.println("Do you know much wilderness survival knowledge and could probably survive in the woods for weeks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Teddiursa");
		normalPokemon.remove("Ursaring");
		}
		System.out.println();

		if(normalPokemon.contains("Miltank"))
                {System.out.println("Are you quite healthy and try to promote healthy habits among your friends and family");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Miltank");
		}
		System.out.println();}

		System.out.println("Do you have a personal enemy or rival that consumes a great part of your life?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Zangoose");
		}
		System.out.println();

		System.out.println("Do you find the weather and what causes it rather interesting?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Castform");
		}
		System.out.println();

		System.out.println("Do you have a rather goofy, derpy face?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Bidoof");
		normalPokemon.remove("Bibarel");
		}
		System.out.println();

		System.out.println("Do you have a certain aspect of your personality or body that distracts people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Stantler");
		}
		System.out.println();

		System.out.println("Do you believe that teamwork solves more than solitary work?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Starly");
		normalPokemon.remove("Staravia");
		normalPokemon.remove("Staraptor");
		}
		System.out.println();

		System.out.println("Are you rather fickle with your alliances with people?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Glameow");
		normalPokemon.remove("Purugly");
		}
		System.out.println();

		if(normalPokemon.contains("Rufflet")||normalPokemon.contains("Braviary"))
                {System.out.println("Do you believe that battlescars are what makes someone a man?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Rufflet");
		normalPokemon.remove("Braviary");
		}
		System.out.println();}

		System.out.println("Are you periodicallly dizzy or under the influence of substances?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Spinda");
		}
		System.out.println();



		System.out.println("Are you still legally a child (under the age of 18)? ");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Pidgey");
		normalPokemon.remove("Rattata");
		normalPokemon.remove("Spearow");
		normalPokemon.remove("Meowth");
		normalPokemon.remove("Doduo");
		normalPokemon.remove("Eevee");
		normalPokemon.remove("Porygon");
		normalPokemon.remove("Sentret");
		normalPokemon.remove("Hoothoot");
		normalPokemon.remove("Togepi");
		normalPokemon.remove("Aipom");
		normalPokemon.remove("Snubbull");
		normalPokemon.remove("Teddiursa");
		normalPokemon.remove("Zigzagoon");
		normalPokemon.remove("Taillow");
		normalPokemon.remove("Slakoth");
		normalPokemon.remove("Whismur");
		normalPokemon.remove("Azurill");
		normalPokemon.remove("Skitty");
		normalPokemon.remove("Swablu");
		normalPokemon.remove("Starly");
		normalPokemon.remove("Bidoof");
		normalPokemon.remove("Buneary");
		normalPokemon.remove("Glameow");
		normalPokemon.remove("Happiny");
		normalPokemon.remove("Munchlax");
		normalPokemon.remove("Patrat");
		normalPokemon.remove("Lillipup");
		normalPokemon.remove("Pidove");
		normalPokemon.remove("Minccino");
		normalPokemon.remove("Deerling");
		normalPokemon.remove("Rufflet");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Pidgeotto");
		normalPokemon.remove("Pidgeot");
		normalPokemon.remove("Raticate");
		normalPokemon.remove("Fearow");
		normalPokemon.remove("Clefable");
		normalPokemon.remove("Wigglytuff");
		normalPokemon.remove("Persian");
		normalPokemon.remove("Dodrio");
		normalPokemon.remove("Snorlax");
		normalPokemon.remove("Furret");
		normalPokemon.remove("Noctowl");
		normalPokemon.remove("Togetic");
		normalPokemon.remove("Granbull");
		normalPokemon.remove("Ursaring");
		normalPokemon.remove("Porygon2");
		normalPokemon.remove("Blissey");
		normalPokemon.remove("Linoone");
		normalPokemon.remove("Swellow");
		normalPokemon.remove("Vigoroth");
		normalPokemon.remove("Slaking");
		normalPokemon.remove("Loudred");
		normalPokemon.remove("Exploud");
		normalPokemon.remove("Delcatty");
		normalPokemon.remove("Staravia");
		normalPokemon.remove("Staraptor");
		normalPokemon.remove("Bibarel");
		normalPokemon.remove("Ambipom");
		normalPokemon.remove("Lopunny");
		normalPokemon.remove("Purugly");
		normalPokemon.remove("Lickilicky");
		normalPokemon.remove("Togekiss");
		normalPokemon.remove("Porygon-Z");
		normalPokemon.remove("Watchog");
		normalPokemon.remove("Herdier");
		normalPokemon.remove("Stoutland");
		normalPokemon.remove("Tranquill");
		normalPokemon.remove("Unfezant");
		normalPokemon.remove("Cinccino");
		normalPokemon.remove("Sawsbuck");
		normalPokemon.remove("Braviary");}
                System.out.println();

		if(normalPokemon.contains("Azurill"))
		{System.out.println("Do you like bouncing on trampolines or on pogo sticks?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Azurill");
		}
		System.out.println();}

		if(normalPokemon.contains("Eevee"))
		{System.out.println("Do you have an important decision to make in the near future?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Eevee");
		}
		System.out.println();}

		if(normalPokemon.contains("Swablu"))
		{System.out.println("Do you like to wear luxurious or fancy clothing?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Swablu");
		}
		System.out.println();}

		if(normalPokemon.contains("Vigoroth"))
		{System.out.println("Is it difficult for you to stand or sit still for long?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Vigoroth");
		}
		System.out.println();}

		if(normalPokemon.contains("Meloetta"))
		{System.out.println("Are you a world famous singer?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Meloetta");
		}
		System.out.println();}

		if(normalPokemon.contains("Arceus"))
		{System.out.println("Are you the god and creator of everything?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Arceus");
		}
		System.out.println();}

		if(normalPokemon.contains("Regigigas"))
		{System.out.println("Are you an athlete or body-builder that has a hard time getting up in the morning?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Regigigas");
		}
		System.out.println();}

		if(normalPokemon.contains("Clefable"))
		{System.out.println("Do you not like going to public events such as concerts or festivals?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Clefable");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Clefairy");}
		System.out.println();}

		if(normalPokemon.contains("Wigglytuff"))
		{System.out.println("Are you a touchy-feely person who likes to give free hugs?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Wigglytuff");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Jigglypuff");}
		System.out.println();}

		if(normalPokemon.contains("Blissey"))
		{System.out.println("Are you in the medical or pharmacy field?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Blissey");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Chansey");}
		System.out.println();}

		if(normalPokemon.contains("Exploud"))
		{System.out.println("Do you do whatever possible to make sure your voice is heard?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Exploud");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Loudred");}
		System.out.println();}

		if(normalPokemon.contains("Lickilicky"))
		{System.out.println("Do you have hyperactive spit glands?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Lickilicky");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Lickitung");}
		System.out.println();}

		if(normalPokemon.contains("Stoutland"))
		{System.out.println("Have you ever saved someone from a life-threatening situation?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Stoutland");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Herdier");}
		System.out.println();}

		if(normalPokemon.contains("Pidgeot"))
		{System.out.println("Do you like to stylize your hair?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Pidgeot");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Pidgeotto");}
		System.out.println();}

		if(normalPokemon.contains("Staraptor"))
		{System.out.println("Do you get really angry or violent when someone mocks you or when you lose at something?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Staraptor");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Staravia");}
		System.out.println();}
                
                if(normalPokemon.contains("Porygon-Z"))
		{System.out.println("Do you feel as if you are a deviation from what makes a normal human being?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Porygon-Z");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Porygon2");}
		System.out.println();}

		if(normalPokemon.contains("Togekiss"))
		{System.out.println("Do you believe that world peace is the ultimate goal and that it is actually obtainable?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Togekiss");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Togetic");}
		System.out.println();}

		if(normalPokemon.contains("Unfezant"))
		{System.out.println("Do you believe that males and females are complete opposites and should have separate roles?");
		answer=pokescan.nextLine();
		if(!answer.equals("yes"))
		{normalPokemon.remove("Unfezant");}
		if(answer.equals("yes"))
		{normalPokemon.remove("Tranquill");}
		System.out.println();}

		if(normalPokemon.size()==0)
			out.println("There was an error. You are Missingno.");
		if(normalPokemon.size()==1)
			out.println("You are " + normalPokemon.get(0));
		if(normalPokemon.size()>1)
		{String normalAura=new String("\n");
		if(normalPokemon.contains("Pidove")||normalPokemon.contains("Tranquill")||normalPokemon.contains("Unfezant"))
		{normalAura=normalAura + "Ash Gray\n";}
		if(normalPokemon.contains("Cleffa")||normalPokemon.contains("Clefairy")||normalPokemon.contains("Clefable"))
		{normalAura=normalAura + "Blush\n";}
		if(normalPokemon.contains("Igglybuff")||normalPokemon.contains("Jigglypuff")||normalPokemon.contains("Wigglytuff"))
		{normalAura=normalAura + "Baby Pink\n";}
		if(normalPokemon.contains("Meowth")||normalPokemon.contains("Persian"))
		{normalAura=normalAura + "Bright Green\n";}
                if(normalPokemon.contains("Rattata")||normalPokemon.contains("Raticate"))
                {normalAura=normalAura + "Straw\n";}
		if(normalPokemon.contains("Porygon")||normalPokemon.contains("Porygon2")||normalPokemon.contains("Porygon-Z"))
		{normalAura=normalAura + "Electric Blue\n";}
		if(normalPokemon.contains("Aipom")||normalPokemon.contains("Ambipom"))
		{normalAura=normalAura + "Orchid\n";}
		if(normalPokemon.contains("Munchlax")||normalPokemon.contains("Snorlax"))
		{normalAura=normalAura + "Dark Green\n";}
		if(normalPokemon.contains("Deerling")||normalPokemon.contains("Sawsbuck"))
		{normalAura=normalAura + "Forest Green\n";}
		if(normalPokemon.contains("Rufflet")||normalPokemon.contains("Braviary"))
		{normalAura=normalAura + "Air Force Blue\n";}
		if(normalPokemon.contains("Stantler"))
		{normalAura=normalAura + "Deer\n";}
		if(normalPokemon.contains("Sentret")||normalPokemon.contains("Furret"))
		{normalAura=normalAura + "Champagne\n";}
		if(normalPokemon.contains("Dunsparce"))
		{normalAura=normalAura + "Mellow Yellow\n";}
		if(normalPokemon.contains("Lillipup")||normalPokemon.contains("Herdier")||normalPokemon.contains("Stoutland"))
		{normalAura=normalAura + "Oxford Blue\n";}
		if(normalPokemon.contains("Zangoose"))
		{normalAura=normalAura + "Crimson\n";}
		if(normalPokemon.contains("Pidgey")||normalPokemon.contains("Pidgeotto")||normalPokemon.contains("Pidgeot"))
		{normalAura=normalAura + "Terracotta\n";}
                if(normalPokemon.contains("Starly")||normalPokemon.contains("Staravia")||normalPokemon.contains("Staraptor"))
		{normalAura=normalAura + "Ivory\n";}
                if(normalPokemon.contains("Buneary")||normalPokemon.contains("Lopunny"))
		{normalAura=normalAura + "Strawberry\n";}
                if(normalPokemon.contains("Lickitung")||normalPokemon.contains("Lickilicky"))
		{normalAura=normalAura + "Fandango\n";}
                if(normalPokemon.contains("Spearow")||normalPokemon.contains("Fearow"))
		{normalAura=normalAura + "Russet\n";}
                if(normalPokemon.contains("Tauros"))
		{normalAura=normalAura + "Bronze\n";}
                if(normalPokemon.contains("Skitty")||normalPokemon.contains("Delcatty"))
		{normalAura=normalAura + "Fuchsia\n";}
                if(normalPokemon.contains("Eevee"))
		{normalAura=normalAura + "Chocolate\n";}
                if(normalPokemon.contains("Kangaskhan"))
		{normalAura=normalAura + "Mahogany\n";}
                if(normalPokemon.contains("Togepi")||normalPokemon.contains("Togetic")||normalPokemon.contains("Togekiss"))
		{normalAura=normalAura + "White\n";}
                if(normalPokemon.contains("Snubbull")||normalPokemon.contains("Granbull"))
		{normalAura=normalAura + "Magenta\n";}
                if(normalPokemon.contains("Teddiursa")||normalPokemon.contains("Ursaring"))
		{normalAura=normalAura + "Honey\n";}
                if(normalPokemon.contains("Smeargle"))
		{normalAura=normalAura + "Beige\n";}
                if(normalPokemon.contains("Miltank"))
		{normalAura=normalAura + "Cream\n";}
                if(normalPokemon.contains("Zigzagoon")||normalPokemon.contains("Linoone"))
		{normalAura=normalAura + "Wheat\n";}
                if(normalPokemon.contains("Slakoth")||normalPokemon.contains("Vigoroth")||normalPokemon.contains("Slaking"))
		{normalAura=normalAura + "Amazon\n";}
                if(normalPokemon.contains("Whismur")||normalPokemon.contains("Loudred")||normalPokemon.contains("Exploud"))
		{normalAura=normalAura + "Electric Purple\n";}
                if(normalPokemon.contains("Azurill"))
		{normalAura=normalAura + "Periwinkle\n";}
                if(normalPokemon.contains("Spinda"))
		{normalAura=normalAura + "Folly\n";}
                if(normalPokemon.contains("Castform"))
		{normalAura=normalAura + "Snow\n";}
                if(normalPokemon.contains("Kecleon"))
		{normalAura=normalAura + "Harlequin\n";}
                if(normalPokemon.contains("Bidoof")||normalPokemon.contains("Bibarel"))
		{normalAura=normalAura + "Potato\n";}
                if(normalPokemon.contains("Glameow")||normalPokemon.contains("Purugly"))
		{normalAura=normalAura + "Plum\n";}
                if(normalPokemon.contains("Regigigas"))
		{normalAura=normalAura + "Gold\n";}
                if(normalPokemon.contains("Arceus"))
		{normalAura=normalAura + "I am beyond color because I am God\n";}
                if(normalPokemon.contains("Lillipup")||normalPokemon.contains("Herdier")||normalPokemon.contains("Stoutland"))
		{normalAura=normalAura + "Oxford Blue\n";}
                if(normalPokemon.contains("Chansey")||normalPokemon.contains("Blissey")||normalPokemon.contains("Happiny"))
                {normalAura=normalAura + "Lavender Rose\n";}
                if(normalPokemon.contains("Audino"))
		{normalAura=normalAura + "Tulip\n";}
                if(normalPokemon.contains("Minccino")||normalPokemon.contains("Cincinno"))
		{normalAura=normalAura + "Glitter\n";}
                if(normalPokemon.contains("Patrat")||normalPokemon.contains("Watchog"))
                {normalAura=normalAura+ "Scarlet\n";}
                if(normalPokemon.contains("Bouffalant"))
		{normalAura=normalAura + "Brown\n";}
                if(normalPokemon.contains("Farfetch'd"))
		{normalAura=normalAura + "Olive\n";}
                if(normalPokemon.contains("Doduo")||normalPokemon.contains("Dodrio"))
		{normalAura=normalAura + "Charcoal\n";}
                if(normalPokemon.contains("Hoothoot")||normalPokemon.contains("Noctowl"))
		{normalAura=normalAura + "Sienna\n";}
                if(normalPokemon.contains("Girafarig"))
		{normalAura=normalAura + "Saffron\n";}
                if(normalPokemon.contains("Taillow")||normalPokemon.contains("Swellow"))
		{normalAura=normalAura + "Maroon\n";}
                if(normalPokemon.contains("Swablu"))
		{normalAura=normalAura + "Cotton\n";}
                if(normalPokemon.contains("Chatot"))
		{normalAura=normalAura + "Maya Blue\n";}
                if(normalPokemon.contains("Meloetta"))
		{normalAura=normalAura + "Ruby\n";}
                if(normalPokemon.contains("Ditto"))
                {normalAura=normalAura + "All Colors\n";}
		{System.out.println("Out of these colors:" +normalAura +"which one describes you the most?");
		answer=pokescan.nextLine();
                
                if(answer.equals("Terracotta")&&normalPokemon.contains("Pidgey"))
                {System.out.println("You are Pidgey");}
                
                else if(answer.equals("Terracotta")&&normalPokemon.contains("Pidgeotto"))
                {System.out.println("You are Pidgeotto");}
                
                else if(answer.equals("Terracotta")&&normalPokemon.contains("Pidgeot"))
                {System.out.println("You are Pidgeot");}
                
                else if(answer.equals("Straw")&&normalPokemon.contains("Rattata"))
                {System.out.println("You are Rattata");}
                
                else if(answer.equals("Straw")&&normalPokemon.contains("Raticate"))
                {System.out.println("You are Raticate");}
                
                else if(answer.equals("Russet")&&normalPokemon.contains("Spearow"))
                {System.out.println("You are Spearow");}
                
                else if(answer.equals("Russet")&&normalPokemon.contains("Fearow"))
                {System.out.println("You are Fearow");}
                
                else if(answer.equals("Blush")&&normalPokemon.contains("Clefairy"))
                {System.out.println("You are Clefairy");}
                
                else if(answer.equals("Blush")&&normalPokemon.contains("Clefable"))
                {System.out.println("You are Clefable");}
                
                else if(answer.equals("Baby Pink")&&normalPokemon.contains("Jigglypuff"))
                {System.out.println("You are Jigglypuff");}
                
                else if(answer.equals("Baby Pink")&&normalPokemon.contains("Wigglytuff"))
                {System.out.println("You are Wigglytuff");}
                
                else if(answer.equals("Bright Green")&&normalPokemon.contains("Meowth"))
                {System.out.println("You are Meowth");}
                
                else if(answer.equals("Bright Green")&&normalPokemon.contains("Persian"))
                {System.out.println("You are Persian");}
                
                else if(answer.equals("Olive")&&normalPokemon.contains("Farfetch'd"))
                {System.out.println("You are Farfetch'd");}
                
                else if(answer.equals("Charcoal")&&normalPokemon.contains("Doduo"))
                {System.out.println("You are Doduo");}
                
                else if(answer.equals("Charcoal")&&normalPokemon.contains("Dodrio"))
                {System.out.println("You are Dodrio");}
                
                else if(answer.equals("Fandango")&&normalPokemon.contains("Lickitung"))
                {System.out.println("You are Lickitung");}
                
                else if(answer.equals("Lavender Rose")&&normalPokemon.contains("Chansey"))
                {System.out.println("You are Chansey");}
                
                else if(answer.equals("Mahogany")&&normalPokemon.contains("Kangaskhan"))
                {System.out.println("You are Kangaskhan");}
                
                else if(answer.equals("Bronze")&&normalPokemon.contains("Tauros"))
                {System.out.println("You are Tauros");}
                
                else if(answer.equals("All Colors")&&normalPokemon.contains("Ditto"))
                {System.out.println("You are Ditto");}
                
                else if(answer.equals("Chocolate")&&normalPokemon.contains("Eevee"))
                {System.out.println("You are Eevee");}
                
                else if(answer.equals("Electric Blue")&&normalPokemon.contains("Porygon"))
                {System.out.println("You are Porygon");}
                
                else if(answer.equals("Dark Green")&&normalPokemon.contains("Snorlax"))
                {System.out.println("You are Snorlax");}
                
                else if(answer.equals("Champagne")&&normalPokemon.contains("Sentret"))
                {System.out.println("You are Sentret");}
                
                else if(answer.equals("Champagne")&&normalPokemon.contains("Furret"))
                {System.out.println("You are Furret");}
                
                else if(answer.equals("Sienna")&&normalPokemon.contains("Hoothoot"))
                {System.out.println("You are Hoothoot");}
                
                else if(answer.equals("Sienna")&&normalPokemon.contains("Noctowl"))
                {System.out.println("You are Noctowl");}
                
                else if(answer.equals("Blush")&&normalPokemon.contains("Cleffa"))
                {System.out.println("You are Cleffa");}
                
                else if(answer.equals("Baby Pink")&&normalPokemon.contains("Igglybuff"))
                {System.out.println("You are Igglybuff");}
                
                else if(answer.equals("White")&&normalPokemon.contains("Togepi"))
                {System.out.println("You are Togepi");}
                
                else if(answer.equals("White")&&normalPokemon.contains("Togetic"))
                {System.out.println("You are Togetic");}
                
                else if(answer.equals("Orchid")&&normalPokemon.contains("Aipom"))
                {System.out.println("You are Aipom");}
                
                else if(answer.equals("Saffron")&&normalPokemon.contains("Girafarig"))
                {System.out.println("You are Girafarig");}
                
                else if(answer.equals("Mellow Yellow")&&normalPokemon.contains("Dunsparce"))
                {System.out.println("You are Dunsparce");}
                
                else if(answer.equals("Magenta")&&normalPokemon.contains("Snubbull"))
                {System.out.println("You are Snubbull");}
                
                else if(answer.equals("Magenta")&&normalPokemon.contains("Granbull"))
                {System.out.println("You are Granbull");}
                
                else if(answer.equals("Honey")&&normalPokemon.contains("Teddiursa"))
                {System.out.println("You are Teddiursa");}
                
                else if(answer.equals("Honey")&&normalPokemon.contains("Ursaring"))
                {System.out.println("You are Ursaring");}
                
                else if(answer.equals("Electric Blue")&&normalPokemon.contains("Porygon2"))
                {System.out.println("You are Porygon2");}
                
                else if(answer.equals("Deer")&&normalPokemon.contains("Stantler"))
                {System.out.println("You are Stantler");}
                
                else if(answer.equals("Beige")&&normalPokemon.contains("Smeargle"))
                {System.out.println("You are Smeargle");}
                
                else if(answer.equals("Cream")&&normalPokemon.contains("Miltank"))
                {System.out.println("You are Miltank");}
                
                else if(answer.equals("Lavender Rose")&&normalPokemon.contains("Blissey"))
                {System.out.println("You are Blissey");}
                
                else if(answer.equals("Wheat")&&normalPokemon.contains("Zigzagoon"))
                {System.out.println("You are Zigzagoon");}
                
                else if(answer.equals("Wheat")&&normalPokemon.contains("Linoone"))
                {System.out.println("You are Linoone");}
                
                else if(answer.equals("Maroon")&&normalPokemon.contains("Taillow"))
                {System.out.println("You are Taillow");}
                
                else if(answer.equals("Maroon")&&normalPokemon.contains("Swellow"))
                {System.out.println("You are Swellow");}
                
                else if(answer.equals("Amazon")&&normalPokemon.contains("Slakoth"))
                {System.out.println("You are Slakoth");}
                
                else if(answer.equals("Amazon")&&normalPokemon.contains("Vigoroth"))
                {System.out.println("You are Vigoroth");}
                
                else if(answer.equals("Amazon")&&normalPokemon.contains("Slaking"))
                {System.out.println("You are Slaking");}
                
                else if(answer.equals("Electric Purple")&&normalPokemon.contains("Whismur"))
                {System.out.println("You are Whismur");}
                
                else if(answer.equals("Electric Purple")&&normalPokemon.contains("Loudred"))
                {System.out.println("You are Loudred");}
                
                else if(answer.equals("Electric Purple")&&normalPokemon.contains("Exploud"))
                {System.out.println("You are Exploud");}
                
                else if(answer.equals("Fuchsia")&&normalPokemon.contains("Skitty"))
                {System.out.println("You are Skitty");}
                
                else if(answer.equals("Fuchsia")&&normalPokemon.contains("Delcatty"))
                {System.out.println("You are Delcatty");}
                
                else if(answer.equals("Folly")&&normalPokemon.contains("Spinda"))
                {System.out.println("You are Spinda");}
                
                else if(answer.equals("Cotton")&&normalPokemon.contains("Swablu"))
                {System.out.println("You are Swablu");}
                
                else if(answer.equals("Crimson")&&normalPokemon.contains("Zangoose"))
                {System.out.println("You are Zangoose");}
                
                else if(answer.equals("Snow")&&normalPokemon.contains("Castform"))
                {System.out.println("You are Castform");}
                
                else if(answer.equals("Harlequin")&&normalPokemon.contains("Kecleon"))
                {System.out.println("You are Kecleon");}
                
                else if(answer.equals("Ivory")&&normalPokemon.contains("Starly"))
                {System.out.println("You are Starly");}
                
                else if(answer.equals("Ivory")&&normalPokemon.contains("Staravia"))
                {System.out.println("You are Staravia");}
                
                else if(answer.equals("Ivory")&&normalPokemon.contains("Staraptor"))
                {System.out.println("You are Staraptor");}
                
                else if(answer.equals("Potato")&&normalPokemon.contains("Bidoof"))
                {System.out.println("You are Bidoof");}
                
                else if(answer.equals("Potato")&&normalPokemon.contains("Bibarel"))
                {System.out.println("You are Bibarel");}
                
                else if(answer.equals("Orchid")&&normalPokemon.contains("Ambipom"))
                {System.out.println("You are Ambipom");}
                
                else if(answer.equals("Strawberry")&&normalPokemon.contains("Buneary"))
                {System.out.println("You are Buneary");}
                
                else if(answer.equals("Strawberry")&&normalPokemon.contains("Lopunny"))
                {System.out.println("You are Lopunny");}
                
                else if(answer.equals("Plum")&&normalPokemon.contains("Glameow"))
                {System.out.println("You are Glameow");}
                
                else if(answer.equals("Plum")&&normalPokemon.contains("Purugly"))
                {System.out.println("You are Purugly");}
                
                else if(answer.equals("Lavender Rose")&&normalPokemon.contains("Happiny"))
                {System.out.println("You are Happiny");}
                
                else if(answer.equals("Maya Blue")&&normalPokemon.contains("Chatot"))
                {System.out.println("You are Chatot");}
                
                else if(answer.equals("Dark Green")&&normalPokemon.contains("Munchlax"))
                {System.out.println("You are Munchlax");}
                
                else if(answer.equals("Fandango")&&normalPokemon.contains("Lickilicky"))
                {System.out.println("You are Lickilicky");}
                
                else if(answer.equals("White")&&normalPokemon.contains("Togekiss"))
                {System.out.println("You are Togekiss");}
                
                else if(answer.equals("Electric Blue")&&normalPokemon.contains("Porygon-Z"))
                {System.out.println("You are Porygon-Z");}
                
                else if(answer.equals("Gold")&&normalPokemon.contains("Regigigas"))
                {System.out.println("You are Regigigas");}
                
                else if(answer.equals("I am beyond color because I am God")&&normalPokemon.contains("Arceus"))
                {System.out.println("You are Arceus");}
                
                else if(answer.equals("Scarlet")&&normalPokemon.contains("Patrat"))
                {System.out.println("You are Patrat");}
                
                else if(answer.equals("Scarlet")&&normalPokemon.contains("Watchog"))
                {System.out.println("You are Watchog");}
                
                else if(answer.equals("Oxford Blue")&&normalPokemon.contains("Lillipup"))
                {System.out.println("You are Lillipup");}
                
                else if(answer.equals("Oxford Blue")&&normalPokemon.contains("Herdier"))
                {System.out.println("You are Herdier");}
                
                else if(answer.equals("Oxford Blue")&&normalPokemon.contains("Stoutland"))
                {System.out.println("You are Stoutland");}
                
                else if(answer.equals("Ash Gray")&&normalPokemon.contains("Pidove"))
                {System.out.println("You are Pidove");}
                
                else if(answer.equals("Ash Gray")&&normalPokemon.contains("Tranquill"))
                {System.out.println("You are Tranquill");}
                
                else if(answer.equals("Ash Gray")&&normalPokemon.contains("Unfezant"))
                {System.out.println("You are Unfezant");}
                
                else if(answer.equals("Tulip")&&normalPokemon.contains("Audino"))
                {System.out.println("You are Audino");}
                
                else if(answer.equals("Glitter")&&normalPokemon.contains("Minccino"))
                {System.out.println("You are Minccino");}
                
                else if(answer.equals("Glitter")&&normalPokemon.contains("Cinccino"))
                {System.out.println("You are Cinccino");}
                
                else if(answer.equals("Forest Green")&&normalPokemon.contains("Deerling"))
                {System.out.println("You are Deerling");}
                
                else if(answer.equals("Forest Green")&&normalPokemon.contains("Sawsbuck"))
                {System.out.println("You are Sawsbuck");}
                
                else if(answer.equals("Brown")&&normalPokemon.contains("Bouffalant"))
                {System.out.println("You are Bouffalant");}
                
                else if(answer.equals("Air Force Blue")&&normalPokemon.contains("Rufflet"))
                {System.out.println("You are Rufflet");}
                
                else if(answer.equals("Air Force Blue")&&normalPokemon.contains("Braviary"))
                {System.out.println("You are Braviary");}
                
                else if(answer.equals("Ruby")&&normalPokemon.contains("Meloetta"))
                {System.out.println("You are Meloetta");}
                
                else
                {System.out.println("There was an eroor. You are Missigno");}
                
                
                }
}}}