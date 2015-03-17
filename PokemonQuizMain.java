//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//public static void main (String args[])
//public static void innerSearch()
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class PokemonQuizMain {

    public static void main(String args[]) {
      Selection sel = new Selection("ugly");

        /*int dragon = 0;
        int dark = 0;
        int steel = 0;
        int ghost = 0;
        int electric = 0;
        int psychic = 0;
        int ice = 0;
        int ground = 0;
        int rock = 0;
        int bug = 0;
        int grass = 0;
        int poison = 0;
        int flying = 0;
        int fire = 0;
        int fighting = 0;
        int water = 0;
        int normal = 0;
        int fairy=0;
        Scanner pokescan = new Scanner(System.in);
        System.out.println("Reply \"yes\" to all that apply \n");

        System.out.print("Calm :: ");
        String answer = "";
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            steel = steel + 1;
            psychic = psychic + 2;
            ice = ice + 1;
            bug = bug + 1;
            grass = grass + 2;
            water = water + 2;
            normal = normal + 1;
            fairy= fairy+1;
        }

        System.out.print("Outgoing :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 2;
            bug = bug + 1;
            grass = grass + 2;
            poison = poison + 1;
            flying = flying + 1;
            fire = fire + 2;
            fighting = fighting + 1;
            water = water + 2;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Kind :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 1;
            rock = rock + 1;
            bug = bug + 2;
            grass = grass + 2;
            flying = flying + 1;
            fire = fire + 1;
            water = water + 2;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Smart/Nerdy :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            ghost = ghost + 2;
            dark = dark + 1;
            steel = steel + 1;
            electric = electric + 2;
            psychic = psychic + 2;
            ice = ice + 1;
            bug = bug + 2;
            grass = grass + 1;
            flying = flying + 1;
            water = water + 1;
            normal = normal + 1;
            fairy = fairy + 1;
        } 
        else {
            dragon = dragon + 2;
            dark = dark + 1;
            steel = steel + 1;
            ghost = ghost + 1;
            ice = ice + 1;
            ground = ground + 2;
            rock = rock + 2;
            bug = bug + 1;
            grass = grass + 1;
            poison = poison + 2;
            flying = flying + 1;
            fire = fire + 1;
            fighting = fighting + 2;
            water = water + 1;
            normal = normal + 1;
        }

        System.out.print("Creative :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ghost = ghost + 2;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 1;
            bug = bug + 1;
            grass = grass + 1;
            flying = flying + 1;
            water = water + 2;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Decisive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            dark = dark + 1;
            ghost = ghost + 2;
            psychic = psychic + 2;
            flying = flying + 2;
            fire = fire + 1;
            fighting = fighting + 2;
        }

        System.out.print("Sensitive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            steel = steel + 1;
            ghost = ghost + 1;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 1;
            bug = bug + 2;
            grass = grass + 2;
            poison = poison + 1;
            flying = flying + 1;
            fire = fire + 1;
            water = water + 1;
            normal = normal + 2;
            fairy = fairy + 2;
        }
        
        System.out.print("Lonely :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ghost = ghost + 2;
            poison = poison + 1;
            flying = flying + 1;
        }

        System.out.print("Mature :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            steel = steel + 2;
            dragon = dragon + 1;
            psychic = psychic + 1;
            ground = ground + 2;
            rock = rock + 1;
            flying = flying + 1;
        }

        System.out.print("Naive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            steel = steel + 1;
            electric = electric + 2;
            ice = ice + 2;
            ground = ground + 1;
            rock = rock + 1;
            bug = bug + 1;
            grass = grass + 1;
            poison = poison + 2;
            fire = fire + 1;
            fighting = fighting + 1;
            water = water + 1;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Humble :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ground = ground + 2;
            rock = rock + 2;
            grass = grass + 1;
            water = water + 1;
            normal = normal + 2;
            fairy = fairy + 1;
        }

        System.out.print("Loyal :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 2;
            rock = rock + 1;
            bug = bug + 2;
            grass = grass + 2;
            poison = poison + 1;
            flying = flying + 1;
            fire = fire + 1;
            fighting = fighting + 2;
            water = water + 2;
            normal = normal + 1;
            fairy = fairy + 1;
        }

        System.out.print("Quiet :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 1;
            steel = steel + 2;
            dragon = dragon + 1;
            ghost = ghost + 1;
            psychic = psychic + 2;
            ground = ground + 1;
            rock = rock + 2;
            bug = bug + 1;
            grass = grass + 1;
            poison = poison + 2;
	    ice = ice + 2;
            fire = fire + 1;
            water = water + 1;
            fairy = fairy + 1;
        }

        System.out.print("Assertive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 2;
            steel = steel + 2;
            fire = fire + 2;
            fighting = fighting + 2;
            dragon = dragon + 1;
        }

        System.out.print("Aggressive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 1;
            fire = fire + 1;
            fighting = fighting + 2;
        }

        System.out.print("Bossy :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            steel = steel + 1;
            dragon = dragon + 1;
            poison = poison + 1;
            dark = dark + 2;
            fighting = fighting + 2;
        }
        
        System.out.print("Dark/Pessimistic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 2;
            ghost = ghost + 2;
            poison = poison + 1;
            fighting = fighting + 1;
        }

        System.out.print("Serious :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            ground = ground + 2;
            rock = rock + 2;
            grass = grass + 1;
            flying = flying + 1;
            steel = steel + 1;
        }

        System.out.print("Cheerful/Optimistic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            steel = steel + 1;
            ghost = ghost + 1;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 2;
            ground = ground + 1;
            rock = rock + 1;
            bug = bug + 1;
            grass = grass + 2;
            poison = poison + 1;
            flying = flying + 2;
            fire = fire + 1;
            water = water + 2;
            normal = normal + 2;
            fairy = fairy + 2;
        }
        
        System.out.print("Loner :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            dark = dark + 2;
            steel = steel + 1;
            ghost = ghost + 1;
            rock = rock + 2;
            bug = bug + 1;
            poison = poison + 2;
            flying = flying + 2;
            fire = fire + 1;
            fighting = fighting + 1;
            fairy= fairy + 1;
        }

        System.out.print("Artistic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            steel = steel + 1;
            ghost = ghost + 1;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 2;
            ground = ground + 1;
            bug = bug + 2;
            grass = grass + 2;
            fire = fire + 1;
            water = water + 1;
            normal = normal + 1;
            fairy = fairy + 2;
        }

        System.out.print("Shy :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            ghost = ghost + 2;
            ground = ground + 1;
            bug = bug + 1;
            grass = grass + 1;
            fairy = fairy + 1;
        }

        System.out.print("Tough :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            dark = dark + 1;
            steel = steel + 2;
            rock = rock + 1;
            fire = fire + 1;
            fighting = fighting + 2;
        }

        System.out.print("Distrustful/Reserved :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            steel = steel + 1;
            dark = dark + 2;
            ghost = ghost + 1;
            ground = ground + 1;
            rock = rock + 2;
            poison = poison + 2;
            flying = flying + 1;
            fire = fire + 2;
            fighting = fighting + 1;
        }

        System.out.print("Laidback :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            psychic = psychic + 1;
            ice = ice + 2;
            ground = ground + 1;
            rock = rock + 1;
            water = water + 2;
            normal = normal + 1;
            fairy = fairy + 1;
        }

        System.out.print("Patient :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 2;
            bug = bug + 2;
            grass = grass + 1;
            flying = flying + 1;
            water = water + 2;
            normal = normal + 1;
            fairy = fairy + 1;
        }

        System.out.print("Energetic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            electric = electric + 2;
            psychic = psychic + 1;
            ice = ice + 1;
            ground = ground + 1;
            grass = grass + 1;
            flying = flying + 2;
            fire = fire + 1;
            fighting = fighting + 2;
            water = water + 1;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Lazy :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ghost = ghost + 1;
            ground = ground + 2;
            poison = poison + 2;
            flying = flying + 1;
            water = water + 1;
            normal = normal + 1;
        }

        System.out.print("Strange :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            ghost = ghost + 2;
            psychic = psychic + 2;
            ice = ice + 1;
            bug = bug + 2;
            grass = grass + 1;
            flying = flying + 1;
            fairy = fairy + 1;
        }

        System.out.print("Intimidating :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            dark = dark + 1;
            steel = steel + 2;
            ice = ice + 1;
            ground = ground + 1;
            rock = rock + 1;
            fire = fire + 1;
        }

        System.out.print("Flirty :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 1;
            steel = steel + 1;
            ghost = ghost + 1;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 2;
            bug = bug + 1;
            grass = grass + 1;
            poison = poison + 2;
            flying = flying + 1;
            fire = fire + 2;
            water = water + 2;
            normal = normal + 1;
            fairy = fairy + 1;
        }

        System.out.print("Showoff :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            steel = steel + 1;
            dragon = dragon + 1;
            dark = dark + 1;
            ghost = ghost + 1;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 1;
            poison = poison + 1;
            flying = flying + 2;
            fire = fire + 2;
            fighting = fighting + 2;
            normal = normal + 1;
        }

        System.out.print("Brave :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 1;
            steel = steel + 1;
            electric = electric + 1;
            ground = ground + 1;
            rock = rock + 2;
            flying = flying + 2;
            fire = fire + 2;
            fighting = fighting + 1;
        }

        System.out.print("Timid/Cowardly :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ghost = ghost + 1;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 2;
            rock = rock + 1;
            bug = bug + 2;
            grass = grass + 1;
            water = water + 1;
            normal = normal + 2;
            fairy = fairy + 2;
        }

        System.out.print("Sarcastic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 2;
            ghost = ghost + 2;
            psychic = psychic + 2;
            ice = ice + 1;
            poison = poison + 1;
            flying = flying + 1;
            fighting = fighting + 1;
        }

        System.out.print("Charming/Charismatic :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dragon = dragon + 2;
            electric = electric + 1;
            psychic = psychic + 1;
            ice = ice + 2;
            bug = bug + 2;
            grass = grass + 2;
            flying = flying + 1;
            fire = fire + 2;
            water = water + 1;
            normal = normal + 1;
            fairy = fairy + 2;
        }

        System.out.print("Fiery/Passionate :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            dark = dark + 2;
            steel = steel + 1;
            ghost = ghost + 1;
            ice = ice + 1;
            ground = ground + 1;
            rock = rock + 1;
            fire = fire + 2;
            fighting = fighting + 1;
            dragon = dragon + 1;
        }

        System.out.print("Inquisitive :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            ghost = ghost + 1;
            electric = electric + 1;
            psychic = psychic + 2;
            ice = ice + 2;
            bug = bug + 1;
            grass = grass + 1;
            water = water + 1;
            fairy = fairy + 1;
        }
        
        System.out.print("Vain :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            fire = fire + 2;
            electric = electric + 2;
            grass = grass + 1;
            fighting = fighting + 2;
            poison = poison + 1;
            flying = flying + 2;
            ghost = ghost + 2;
            dragon = dragon + 2;
            dark = dark + 2;
            fairy = fairy + 1;
        }
        
        System.out.print("Childlike :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            water = water + 1;
            electric = electric + 2;
            grass = grass + 1;
            ice = ice + 2;
            poison = poison + 1;
            bug = bug + 2;
            ghost = ghost + 1;
            dragon = dragon +1;
            dark = dark + 1;
            fairy = fairy + 2;
        }
        
        System.out.print("Grumpy :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            fire = fire + 1;
            electric = electric + 1;
            fighting = fighting + 2;
            poison = poison + 1;
            flying = flying + 1;
            rock = rock + 2;
            ghost = ghost + 1;
            dragon = dragon + 2;
            dark = dark + 2;
            steel = steel + 2;
        }
        
        System.out.print("Persistant :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            fire = fire + 1;
            fighting = fighting + 1;
            ground = ground + 1;
            flying = flying + 1;
            psychic = psychic + 1;
            dragon = dragon + 1;
            dark = dark + 1;
            steel = steel + 1;
        }
        
        System.out.print("Soft/Affectionate :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            fire = fire + 1;
            water = water + 2;
            electric = electric + 1;
            grass = grass + 2;
            ground = ground + 1;
            flying = flying + 1;
            bug = bug + 2;
            fairy = fairy + 2;
        }
        
        System.out.print("Careful :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            normal = normal + 1;
            grass = grass + 1;
            ice = ice + 1;
            fighting = fighting + 1;
            poison = poison + 1;
            ground = ground + 2;
            psychic = psychic + 2;
            rock = rock + 1;
            dragon = dragon + 1;
            steel = steel + 2;
            fairy = fairy + 1;
        }
        
        System.out.print("Mischevious/ Naughty :: ");
        answer = pokescan.nextLine();
        if (answer.equals("yes")) {
            fire = fire + 2;
            grass = grass + 1;
            ice = ice + 1;
            poison = poison + 2;
            flying = flying + 1;
            psychic = psychic + 1;
            bug = bug + 1;
            ghost = ghost + 2;
            dark = dark + 2;
            fairy = fairy + 1;
        }

        
        if (dragon > dark && dragon > steel && dragon > ghost && dragon > electric && dragon > psychic && dragon > ice && dragon > ground && dragon > rock && dragon > bug && dragon > grass && dragon > poison && dragon > flying && dragon > fire && dragon > fighting && dragon > water && dragon > normal) {
            DragonTypeQuiz dragonQuiz = new DragonTypeQuiz();
            dragonQuiz.innerSearch();
        } else if (dark > dragon && dark > steel && dark > ghost && dark > electric && dark > psychic && dark > ice && dark > ground && dark > rock && dark > bug && dark > grass && dark > poison && dark > flying && dark > fire && dark > fighting && dark > water && dark > normal) {
            DarkTypeQuiz darkQuiz = new DarkTypeQuiz();
            darkQuiz.innerSearch();
        } else if (steel > dragon && steel > dark && steel > ghost && steel > electric && steel > psychic && steel > ice && steel > ground && steel > rock && steel > bug && steel > grass && steel > poison && steel > flying && steel > fire && steel > fighting && steel > water && steel > normal) {
            SteelTypeQuiz steelQuiz = new SteelTypeQuiz();
            steelQuiz.innerSearch();
        } else if (ghost > dragon && ghost > dark && ghost > steel && ghost > electric && ghost > psychic && ghost > ice && ghost > ground && ghost > rock && ghost > bug && ghost > grass && ghost > poison && ghost > flying && ghost > fire && ghost > fighting && ghost > water && ghost > normal) {
            GhostTypeQuiz ghostQuiz = new GhostTypeQuiz();
            ghostQuiz.innerSearch();
        } else if (electric > dragon && electric > dark && electric > steel && electric > ghost && electric > psychic && electric > ice && electric > ground && electric > rock && electric > bug && electric > grass && electric > poison && electric > flying && electric > fire && electric > fighting && electric > water && electric > normal) {
            ElectricTypeQuiz electricQuiz = new ElectricTypeQuiz();
            electricQuiz.innerSearch();
        } else if (psychic > dragon && psychic > dark && psychic > steel && psychic > ghost && psychic > electric && psychic > ice && psychic > ground && psychic > rock && psychic > bug && psychic > grass && psychic > poison && psychic > flying && psychic > fire && psychic > fighting && psychic > water && psychic > normal) {
            PsychicTypeQuiz psychicQuiz = new PsychicTypeQuiz();
            psychicQuiz.innerSearch();
        } else if (ice > dragon && ice > dark && ice > steel && ice > ghost && ice > electric && ice > psychic && ice > ground && ice > rock && ice > bug && ice > grass && ice > poison && ice > flying && ice > fire && ice > fighting && ice > water && ice > normal) {
            IceTypeQuiz iceQuiz = new IceTypeQuiz();
            iceQuiz.innerSearch();
        } else if (ground > dragon && ground > dark && ground > steel && ground > ghost && ground > electric && ground > psychic && ground > ice && ground > rock && ground > bug && ground > grass && ground > poison && ground > flying && ground > fire && ground > fighting && ground > water && ground > normal) {
            GroundTypeQuiz groundQuiz = new GroundTypeQuiz();
            groundQuiz.innerSearch();
        } else if (rock > dragon && rock > dark && rock > steel && rock > ghost && rock > electric && rock > psychic && rock > ice && rock > ground && rock > bug && rock > grass && rock > poison && rock > flying && rock > fire && rock > fighting && rock > water && rock > normal) {
            RockTypeQuiz rockQuiz = new RockTypeQuiz();
            rockQuiz.innerSearch();
        } else if (bug > dragon && bug > dark && bug > steel && bug > ghost && bug > electric && bug > psychic && bug > ice && bug > ground && bug > rock && bug > grass && bug > poison && bug > flying && bug > fire && bug > fighting && bug > water && bug > normal) {
            BugTypeQuiz bugQuiz = new BugTypeQuiz();
            bugQuiz.innerSearch();
        } else if (grass > dragon && grass > dark && grass > steel && grass > ghost && grass > electric && grass > psychic && grass > ice && grass > ground && grass > rock && grass > bug && grass > poison && grass > flying && grass > fire && grass > fighting && grass > water && grass > normal) {
            GrassTypeQuiz grassQuiz = new GrassTypeQuiz();
            grassQuiz.innerSearch();
        } else if (poison > dragon && poison > dark && poison > steel && poison > ghost && poison > electric && poison > psychic && poison > ice && poison > ground && poison > rock && poison > bug && poison > grass && poison > flying && poison > fire && poison > fighting && poison > water && poison > normal) {
            PoisonTypeQuiz poisonQuiz = new PoisonTypeQuiz();
            poisonQuiz.innerSearch();
        } else if (flying > dragon && flying > dark && flying > steel && flying > ghost && flying > electric && flying > psychic && flying > ice && flying > ground && flying > rock && flying > bug && flying > grass && flying > poison && flying > fire && flying > fighting && flying > water && flying > normal) {
            FlyingTypeQuiz flyingQuiz = new FlyingTypeQuiz();
            flyingQuiz.innerSearch();
        } else if (fire > dragon && fire > dark && fire > steel && fire > ghost && fire > electric && fire > psychic && fire > ice && fire > ground && fire > rock && fire > bug && fire > grass && fire > poison && fire > flying && fire > fighting && fire > water && fire > normal) {
            FireTypeQuiz fireQuiz = new FireTypeQuiz();
            fireQuiz.innerSearch();
        } else if (fighting > dragon && fighting > dark && fighting > steel && fighting > ghost && fighting > electric && fighting > psychic && fighting > ice && fighting > ground && fighting > rock && fighting > bug && fighting > grass && fighting > poison && fighting > flying && fighting > fire && fighting > water && fighting > normal) {
            FightingTypeQuiz fightQuiz = new FightingTypeQuiz();
            fightQuiz.innerSearch();
        } else if (water > dragon && water > dark && water > steel && water > ghost && water > electric && water > psychic && water > ice && water > ground && water > rock && water > bug && water > grass && water > poison && water > flying && water > fire && water > fighting && water > normal) {
            WaterTypeQuiz waterQuiz = new WaterTypeQuiz();
            waterQuiz.innerSearch();
        } else if (normal > dragon && normal > dark && normal > steel && normal > ghost && normal > electric && normal > psychic && normal > ice && normal > ground && normal > rock && normal > bug && normal > grass && normal > poison && normal > flying && normal > fire && normal > fighting && normal > water) {
            NormalTypeQuiz normalQuiz = new NormalTypeQuiz();
            normalQuiz.innerSearch();
        } else {
            int max = 0;
            if (dragon >= max) {
                max = dragon;
            }
            if (dark >= max) {
                max = dark;
            }
            if (steel >= max) {
                max = steel;
            }
            if (ghost >= max) {
                max = ghost;
            }
            if (electric >= max) {
                max = electric;
            }
            if (psychic >= max) {
                max = psychic;
            }
            if (ice >= max) {
                max = ice;
            }
            if (ground >= max) {
                max = ground;
            }
            if (rock >= max) {
                max = rock;
            }
            if (bug >= max) {
                max = bug;
            }
            if (grass >= max) {
                max = grass;
            }
            if (poison >= max) {
                max = poison;
            }
            if (flying >= max) {
                max = flying;
            }
            if (fire >= max) {
                max = fire;
            }
            if (fighting >= max) {
                max = fighting;
            }
            if (water >= max) {
                max = water;
            }
            if (normal >= max) {
                max = normal;
            }
            int dragonver = 0;
            int darkver = 0;
            int steelver = 0;
            int ghostver = 0;
            int electricver = 0;
            int psychicver = 0;
            int icever = 0;
            int groundver = 0;
            int rockver = 0;
            int bugver = 0;
            int grassver = 0;
            int poisonver = 0;
            int flyingver = 0;
            int firever = 0;
            int fightingver = 0;
            int waterver = 0;
            int normalver = 0;

            if (dragon == max) {
                dragonver = 1;
            }
            if (dark == max) {
                darkver = 1;
            }
            if (steel == max) {
                steelver = 1;
            }
            if (ghost == max) {
                ghostver = 1;
            }
            if (electric == max) {
                electricver = 1;
            }
            if (psychic == max) {
                psychicver = 1;
            }
            if (ice == max) {
                icever = 1;
            }
            if (ground == max) {
                groundver = 1;
            }
            if (rock == max) {
                rockver = 1;
            }
            if (bug == max) {
                bugver = 1;
            }
            if (grass == max) {
                grassver = 1;
            }
            if (poison == max) {
                poisonver = 1;
            }
            if (flying == max) {
                flyingver = 1;
            }
            if (fire == max) {
                firever = 1;
            }
            if (fighting == max) {
                fightingver = 1;
            }
            if (water == max) {
                waterver = 1;
            }
            if (normal == max) {
                normalver = 1;
            }

            String finaltype = "Choose the letter which applies to you the most: \n";
            if (dragonver == 1) {
                finaltype += "A. A wise or strong person (possibly a leader) who has the potential of becoming famous or great at what they do\n";
            }
            if (darkver == 1) {
                finaltype += "B. A rather nasty bully or jerk who is either intelligent and condescending to those less intelligent or makes up for it with brute force\n";
            }
            if (steelver == 1) {
                finaltype += "C. A somewhat stoic or emotionless individual who tries to keep their problems or worries to themselves\n";
            }
            if (ghostver == 1) {
                finaltype += "D. An introverted individual who likes to let his/her imagination run free and/or put their emotions into a form of art\n";
            }
            if (electricver == 1) {
                finaltype += "E. An energetic and extraverted person who tends to smile and greet people, and some find a little hyperactive\n";
            }
            if (psychicver == 1) {
                finaltype += "F. A very intelligent human being who has the desire to learn many things but may be a little vain and self-centered\n";
            }
            if (icever == 1) {
                finaltype += "G. A playful or flirty person who treats life as a game and can be spontaneous or careless at times, usually an artist\n";
            }
            if (groundver == 1) {
                finaltype += "H. A down-to-earth individual who likes living a simple life and helps those who need his/her help\n";
            }
            if (rockver == 1) {
                finaltype += "I. Not exactly the brightest bulb in the bunch, but is either physically strong or has the willpower to stand up for what they believe in\n";
            }
            if (bugver == 1) {
                finaltype += "J. A huge nerd who has a particular obsession or interest and may be picked on by their peers (someone with Asperger's basically)\n";
            }
            if (grassver == 1) {
                finaltype += "K. A nurturing or caring individual who puts friends and family before themselves but may not get thanks in return\n";
            }
            if (poisonver == 1) {
                finaltype += "L. Someone who has very few friends and generally is disliked because people find him/her annoying or just don't understand him/her\n";
            }
            if (flyingver == 1) {
                finaltype += "M. A little bit of a daredevil who isn't afraid to try or experience new things but has enough common sense not to do anything self-endangering\n";
            }
            if (firever == 1) {
                finaltype += "N. Either someone who has the tendancy to get angry when things don't go their way or a deeply passionate soul who loves to feel the rush of emotions and is in tune with their \"soul\"\n";
            }
            if (fightingver == 1) {
                finaltype += "O. An athlete who is highly competitive and aggressive and could probably do rather well in a fight or competition\n";
            }
            if (waterver == 1) {
                finaltype += "P. A normal, every day person who has a distinct personality or ability that makes him/her somewhat interesting and is generally very pleasant and fun to be around\n";
            }
            if (normalver == 1) {
                finaltype += "Q. A rather friendly or intelligent individual that likes to make people smile or someone who doesn't really have a set, definable personality (is their own person)\n";
            }
            System.out.println(finaltype);
            answer = pokescan.nextLine();
            if (answer.equals("A") && dragonver == 1) {
                DragonTypeQuiz dragonQuiz = new DragonTypeQuiz();
                dragonQuiz.innerSearch();
            } else if (answer.equals("B") && darkver == 1) {
                DarkTypeQuiz darkQuiz = new DarkTypeQuiz();
                darkQuiz.innerSearch();
            } else if (answer.equals("C") && steelver == 1) {
                SteelTypeQuiz steelQuiz = new SteelTypeQuiz();
                steelQuiz.innerSearch();
            } else if (answer.equals("D") && ghostver == 1) {
                GhostTypeQuiz ghostQuiz = new GhostTypeQuiz();
                ghostQuiz.innerSearch();
            } else if (answer.equals("E") && electricver == 1) {
                ElectricTypeQuiz electricQuiz = new ElectricTypeQuiz();
                electricQuiz.innerSearch();
            } else if (answer.equals("F") && psychicver == 1) {
                PsychicTypeQuiz psychicQuiz = new PsychicTypeQuiz();
                psychicQuiz.innerSearch();
            } else if (answer.equals("G") && icever == 1) {
                IceTypeQuiz iceQuiz = new IceTypeQuiz();
                iceQuiz.innerSearch();
            } else if (answer.equals("H") && groundver == 1) {
                GroundTypeQuiz groundQuiz = new GroundTypeQuiz();
                groundQuiz.innerSearch();
            } else if (answer.equals("I") && rockver == 1) {
                RockTypeQuiz rockQuiz = new RockTypeQuiz();
                rockQuiz.innerSearch();
            } else if (answer.equals("J") && bugver == 1) {
                BugTypeQuiz bugQuiz = new BugTypeQuiz();
                bugQuiz.innerSearch();
            } else if (answer.equals("K") && grassver == 1) {
                GrassTypeQuiz grassQuiz = new GrassTypeQuiz();
                grassQuiz.innerSearch();
            } else if (answer.equals("L") && poisonver == 1) {
                PoisonTypeQuiz poisonQuiz = new PoisonTypeQuiz();
                poisonQuiz.innerSearch();
            } else if (answer.equals("M") && flyingver == 1) {
                FlyingTypeQuiz flyingQuiz = new FlyingTypeQuiz();
                flyingQuiz.innerSearch();
            } else if (answer.equals("N") && firever == 1) {
                FireTypeQuiz fireQuiz = new FireTypeQuiz();
                fireQuiz.innerSearch();
            } else if (answer.equals("O") && fightingver == 1) {
                FightingTypeQuiz fightingQuiz = new FightingTypeQuiz();
                fightingQuiz.innerSearch();
            } else if (answer.equals("P") && waterver == 1) {
                WaterTypeQuiz waterQuiz = new WaterTypeQuiz();
                waterQuiz.innerSearch();
            } else if (answer.equals("Q") && normalver == 1) {
                NormalTypeQuiz normalQuiz = new NormalTypeQuiz();
                normalQuiz.innerSearch();
            } else {
                System.out.println("There was an error. You are Missingno");
            }
        }

        System.out.println("Dragon points: " + dragon);
        System.out.println("Dark points: " + dark);
        System.out.println("Steel points: " + steel);
        System.out.println("Ghost points: " + ghost);
        System.out.println("Electric points: " + electric);
        System.out.println("Psychic points: " + psychic);
        System.out.println("Ice points: " + ice);
        System.out.println("Ground points: " + ground);
        System.out.println("Rock points: " + rock);
        System.out.println("Bug points: " + bug);
        System.out.println("Grass points: " + grass);
        System.out.println("Poison points: " + poison);
        System.out.println("Flying points: " + flying);
        System.out.println("Fire points: " + fire);
        System.out.println("Fighting points: " + fighting);
        System.out.println("Water points: " + water);
        System.out.println("Normal points: " + normal);
        System.out.println("Fairy points: " + fairy);*/
    }
}
