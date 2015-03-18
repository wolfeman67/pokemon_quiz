//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//public static void main (String args[])
//public static void innerSearch()
import java.applet.Applet;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;

public class TypeDetermination extends JPanel implements ActionListener{
  static Map <String,Boolean> traits = new HashMap<String,Boolean>();
  static private JButton submit;
  static JFrame frame;

  static int dragon = 0;
  static int dark = 0;
  static int steel = 0;
  static int ghost = 0;
  static int electric = 0;
  static int psychic = 0;
  static int ice = 0;
  static int ground = 0;
  static int rock = 0;
  static int bug = 0;
  static int grass = 0;
  static int poison = 0;
  static int flying = 0;
  static int fire = 0;
  static int fighting = 0;
  static int water = 0;
  static int normal = 0;
  static int fairy=0;


  public TypeDetermination(String trait) {
    super(new BorderLayout());
    JRadioButton yesButton = new JRadioButton("Yes");
    yesButton.setActionCommand(trait + ": Yes");

    JRadioButton noButton = new JRadioButton("No");
    noButton.setActionCommand(trait + ": No");

    ButtonGroup traitGroup = new ButtonGroup();
    traitGroup.add(yesButton);
    traitGroup.add(noButton);

    yesButton.addActionListener(this);
    noButton.addActionListener(this);

    JLabel traitLabel = new JLabel(trait);

    JPanel radioPanel = new JPanel(new BorderLayout());
    radioPanel.add(yesButton, BorderLayout.WEST);
    radioPanel.add(noButton, BorderLayout.EAST);

    add(radioPanel, BorderLayout.EAST);
    add(traitLabel, BorderLayout.WEST);
  }
  public void actionPerformed (ActionEvent e) {
    System.out.println(e.getActionCommand());
    String[] parts = e.getActionCommand().split(": ");
    if(parts[1].equals("Yes")) {
      traits.put(parts[0], true);
    }
    else if (parts[1].equals("No")) {
      traits.put(parts[0], false);
    }
  }

  public static void FigureOutType() {
    for(String key: traits.keySet()) {
      if (key.equals("Calm") && traits.get(key)) {
        steel = steel + 1;                                                   
        psychic = psychic + 2;                                               
        ice = ice + 2;                                                       
        bug = bug + 1;                                                       
        grass = grass + 2;                                                   
        water = water + 2;                                                   
        normal = normal + 1;                                                 
        fairy= fairy+1;
      }
      else if (key.equals("Outgoing") && traits.get(key)) {
        dragon = dragon + 1;                                                 
        electric = electric + 2;                                             
        psychic = psychic + 1;                                               
        ice = ice + 1;                                                       
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
      else if (key.equals("Kind") && traits.get(key)) {
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
      else if (key.equals("Smart/Nerdy") && traits.get(key)) {
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
      else if (key.equals("Smart/Nerdy") && !traits.get(key)) {
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
      else if (key.equals("Creative") && traits.get(key)) {
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
      else if (key.equals("Decisive") && traits.get(key)) {
         dragon = dragon + 2;                                                 
         dark = dark + 1;                                                     
         ghost = ghost + 2;                                                   
         psychic = psychic + 2;                                               
         flying = flying + 2;                                                 
         fire = fire + 1;                                                     
         fighting = fighting + 2;
      }
      else if (key.equals("Sensitive") && traits.get(key)) {
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
      else if (key.equals("Lonely") && traits.get(key)) {
        ghost = ghost + 2;                                                   
        poison = poison + 1;                                                 
        flying = flying + 1;
      }
      else if (key.equals("Mature") && traits.get(key)) {
         steel = steel + 2;                                                   
         dragon = dragon + 1;                                                 
         psychic = psychic + 1;                                               
         ground = ground + 2;                                                 
         rock = rock + 1;                                                     
         flying = flying + 1;
      }
      else if (key.equals("Naive") && traits.get(key)) {
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
      else if (key.equals("Humble") && traits.get(key)) {
        ground = ground + 2;                                                 
        rock = rock + 2;                                                     
        grass = grass + 1;                                                   
        water = water + 1;                                                   
        normal = normal + 2;                                                 
        fairy = fairy + 1;
      }
      else if (key.equals("Loyal") && traits.get(key)) {
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
      else if (key.equals("Quiet") && traits.get(key)) {
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
      else if (key.equals("Assertive") && traits.get(key)) {
        dark = dark + 2;                                                     
        steel = steel + 2;                                                   
        fire = fire + 2;                                                     
        fighting = fighting + 2;                                             
        dragon = dragon + 1;
      }
      else if (key.equals("Aggressive") && traits.get(key)) {
        dark = dark + 1;                                                     
        fire = fire + 1;                                                     
        fighting = fighting + 2;
      }
      else if (key.equals("Bossy") && traits.get(key)) {
        steel = steel + 1;                                                   
        dragon = dragon + 1;                                                 
        poison = poison + 1;                                                 
        dark = dark + 2;                                                     
        fighting = fighting + 2;
      }
      else if (key.equals("Dark/Pessimistic") && traits.get(key)) {
        dark = dark + 2;                                                     
        ghost = ghost + 2;                                                   
        poison = poison + 1;                                                 
        fighting = fighting + 1;
      }
      else if (key.equals("Serious") && traits.get(key)) {
        dragon = dragon + 1;                                                 
        ground = ground + 2;                                                 
        rock = rock + 2;                                                     
        grass = grass + 1;                                                   
        flying = flying + 1;                                                 
        steel = steel + 1;
      }
      else if (key.equals("Cheerful/Optimistic") && traits.get(key)) {
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
      else if (key.equals("Loner") && traits.get(key)) {
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
      else if (key.equals("Artistic") && traits.get(key)) {
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
      else if (key.equals("Shy") && traits.get(key)) {
        dragon = dragon + 1;                                                 
        ghost = ghost + 2;                                                   
        ground = ground + 1;                                                 
        bug = bug + 1;                                                       
        grass = grass + 1;
        ice = ice + 1;                                           
        fairy = fairy + 1;
      }
      else if (key.equals("Tough") && traits.get(key)) {
        dragon = dragon + 2;                                                 
        dark = dark + 1;                                                     
        steel = steel + 2;                                                   
        rock = rock + 1;                                                     
        fire = fire + 1;                                                     
        fighting = fighting + 2;
      }
      else if (key.equals("Distrustful/Reserved") && traits.get(key)) {
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
      else if (key.equals("Laidback") && traits.get(key)) {
        psychic = psychic + 1;                                               
        ice = ice + 2;                                                       
        ground = ground + 1;                                                 
        rock = rock + 1;                                                     
        water = water + 2;                                                   
        normal = normal + 1;                                                 
        fairy = fairy + 1;
      }
      else if (key.equals("Patient") && traits.get(key)) {
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
      else if (key.equals("Energetic") && traits.get(key)) {
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
      else if (key.equals("Lazy") && traits.get(key)) {
        ghost = ghost + 1;                                                   
        ground = ground + 2;                                                 
        poison = poison + 2;                                                 
        flying = flying + 1;                                                 
        water = water + 1;                                                   
        normal = normal + 1;
      }
      else if (key.equals("Strange") && traits.get(key)) {
        dragon = dragon + 1;                                                 
        ghost = ghost + 2;                                                   
        psychic = psychic + 2;                                               
        ice = ice + 1;                                                       
        bug = bug + 2;                                                       
        grass = grass + 1;                                                   
        flying = flying + 1;                                                 
        fairy = fairy + 1;
      }
      else if (key.equals("Intimidating") && traits.get(key)) {
        dragon = dragon + 2;                                                 
        dark = dark + 1;                                                     
        steel = steel + 2;                                                   
        ice = ice + 1;                                                       
        ground = ground + 1;                                                 
        rock = rock + 1;                                                     
        fire = fire + 1;
      }
      else if (key.equals("Flirty") && traits.get(key)) {
        dark = dark + 1;                                                     
        steel = steel + 1;                                                   
        ghost = ghost + 1;                                                   
        electric = electric + 1;                                             
        psychic = psychic + 1;                                               
        ice = ice + 1;                                                       
        bug = bug + 1;                                                       
        grass = grass + 1;                                                   
        poison = poison + 2;                                                 
        flying = flying + 1;                                                 
        fire = fire + 2;                                                     
        water = water + 2;                                                   
        normal = normal + 1;                                                 
        fairy = fairy + 2;
      }
      else if (key.equals("Showoff") && traits.get(key)) {
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
      else if (key.equals("Brave") && traits.get(key)) {
        dragon = dragon + 1;                                                 
        steel = steel + 1;                                                   
        electric = electric + 1;                                             
        ground = ground + 1;                                                 
        rock = rock + 2;                                                     
        flying = flying + 2;                                                 
        fire = fire + 2;                                                     
        fighting = fighting + 1;
      }
      else if (key.equals("Timid/Cowardly") && traits.get(key)) {
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
      else if (key.equals("Sarcastic") && traits.get(key)) {
        dark = dark + 2;                                                     
        ghost = ghost + 2;                                                   
        psychic = psychic + 2;                                               
        ice = ice + 1;                                                       
        poison = poison + 1;                                                 
        flying = flying + 1;                                                 
        fighting = fighting + 1;
      }
      else if (key.equals("Charming/Charismatic") && traits.get(key)) {
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
      else if (key.equals("Fiery/Passionate") && traits.get(key)) {
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
      else if (key.equals("Inquistive") && traits.get(key)) {
        ghost = ghost + 1;                                                   
        electric = electric + 1;                                             
        psychic = psychic + 2;                                               
        ice = ice + 2;                                                       
        bug = bug + 1;                                                       
        grass = grass + 1;                                                   
        water = water + 1;                                                   
        fairy = fairy + 1;
      }
      else if (key.equals("Vain") && traits.get(key)) {
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
      else if (key.equals("Childlike") && traits.get(key)) {
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
      else if (key.equals("Grumpy") && traits.get(key)) {
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
      else if (key.equals("Persistant") && traits.get(key)) {
        fire = fire + 1;                                                     
        fighting = fighting + 1;                                             
        ground = ground + 1;                                                 
        flying = flying + 1;                                                 
        psychic = psychic + 1;                                               
        dragon = dragon + 2;                                                 
        dark = dark + 1;                                                     
        steel = steel + 2; 
      }
      else if (key.equals("Soft/Affectionate") && traits.get(key)) {
        fire = fire + 1;                                                     
        water = water + 2;                                                   
        electric = electric + 1;                                             
        grass = grass + 2;                                                   
        ground = ground + 1;                                                 
        flying = flying + 1;                                                 
        bug = bug + 2;                                                       
        fairy = fairy + 2; 
      }
      else if (key.equals("Careful") && traits.get(key)) {
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
      else if (key.equals("Mischevious/Naughty") && traits.get(key)) {
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
    }
    int max = 0;
    max = Math.max(max, dragon);
    max = Math.max(max, steel);
    max = Math.max(max, psychic);
    max = Math.max(max, bug);
    max = Math.max(max, ice);
    max = Math.max(max, grass);
    max = Math.max(max, fairy);
    max = Math.max(max, ghost);
    max = Math.max(max, dark);
    max = Math.max(max, fire);
    max = Math.max(max, normal);
    max = Math.max(max, rock);
    max = Math.max(max, ground);
    max = Math.max(max, flying);
    max = Math.max(max, poison);
    max = Math.max(max, electric);
    max = Math.max(max, fighting);

    int numberMax = 0;
    boolean dragonVer = false;
    boolean steelVer = false;
    boolean psychicVer = false;
    boolean bugVer = false;
    boolean iceVer = false;
    boolean grassVer = false;
    boolean waterVer = false;
    boolean fairyVer = false;
    boolean ghostVer = false;
    boolean darkVer = false;
    boolean fireVer = false;
    boolean normalVer = false;
    boolean rockVer = false;
    boolean groundVer = false;
    boolean flyingVer = false;
    boolean poisonVer = false;
    boolean electricVer = false;
    boolean fightingVer = false;
    if (max == dragon) {
      dragonVer = true;
      numberMax += 1;
    }
    if (max == steel) {
      steelVer = true;
      numberMax += 1;
    }
    if (max == psychic) {
      psychicVer = true;
      numberMax += 1;
    }
    if (max == bug) {
      bugVer = true;
      numberMax += 1;
    }
    if (max == ice) {
      iceVer = true;
      numberMax += 1;
    }
    if (max == grass) {
      grassVer = true;
      numberMax += 1;
    }
    if (max == water) {
      waterVer = true;
      numberMax += 1;
    }
    if (max == fairy) {
      fairyVer = true;
      numberMax += 1;
    }
    if (max == ghost) {
      ghostVer = true;
      numberMax += 1;
    }
    if (max == dark) {
      darkVer = true;
      numberMax += 1;
    }
    if (max == fire) {
      fireVer = true;
      numberMax += 1;
    }
    if (max == normal) {
      normalVer = true;
      numberMax += 1;
    }
    if (max == rock) {
      rockVer = true;
      numberMax += 1;
    }
    if (max == ground) {
      groundVer = true;
      numberMax += 1;
    }
    if (max == flying) {
      flyingVer = true;
      numberMax += 1;
    }
    if (max == poison) {
      poisonVer = true;
      numberMax += 1;
    }
    if (max == electric) {
      electricVer = true;
      numberMax += 1;
    }
    if (max == fighting) {
      fightingVer = true;
      numberMax += 1;
    }

    if(numberMax == 1) {
      if (dragonVer) {
        System.out.println("You're a Dragon type!");
      }
      else if (normalVer) {
        System.out.println("You're a Normal type!");
      }
      else if (grassVer) {
        System.out.println("You're a Grass type!");
      }
      else if (fireVer) {
        System.out.println("You're a Fire type!");
      }
      else if (waterVer) {
        System.out.println("You're a Water type!");
      }
      else if (fightingVer) {
        System.out.println("You're a Fighting type!");
      }
      else if (flyingVer) {
        System.out.println("You're a Flying type!");
      }
      else if (poisonVer) {
        System.out.println("You're a Poison type!");
      }
      else if (groundVer) {
        System.out.println("You're a Ground type!");
      }
      else if (rockVer) {
        System.out.println("You're a Rock type!");
      }
      else if (bugVer) {
        System.out.println("You're a Bug type!");
      }
      else if (ghostVer) {
        System.out.println("You're a Ghost type!");
      }
      else if (electricVer) {
        System.out.println("You're an Electric type!");
      }
      else if (psychicVer) {
        System.out.println("You're a Psychic type!");
      }
      else if (iceVer) {
        System.out.println("You're an Ice type!");
      }
      else if (dragonVer) {
        System.out.println("You're a Dragon type!");
      }
      else if (darkVer) {
        System.out.println("You're a Dark type!");
      }
      else if (steelVer) {
        System.out.println("You're a Steel type!");
      }
      else if (fairyVer) {
        System.out.println("You're a Fairy type!");
      }
    }
    System.out.println("Normal: " + normal);
    System.out.println("Grass: " + grass);
    System.out.println("Fire: " + fire);
    System.out.println("Water: " + water);
    System.out.println("Fighting: " + fighting);
    System.out.println("Flying: " + flying);
    System.out.println("Poison: " + poison);
    System.out.println("Ground: " + ground);
    System.out.println("Rock: " + rock);
    System.out.println("Bug: " + bug);
    System.out.println("Ghost: " + ghost);
    System.out.println("Electric: " + electric);
    System.out.println("Psychic: " + psychic);
    System.out.println("Ice: " + ice);
    System.out.println("Dragon: " + dragon);
    System.out.println("Dark: " + dark);
    System.out.println("Steel: " + steel);
    System.out.println("Fairy: " + fairy);
  }

  private static void createAndShowGUI() {
    frame = new JFrame("Type Determination");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    traits.put("Calm", null);
    traits.put("Outgoing", null);
    traits.put("Kind", null);
    traits.put("Smart/Nerdy", null);
    traits.put("Creative", null);
    traits.put("Decisive", null);
    traits.put("Sensitive", null);
    traits.put("Lonely", null);
    traits.put("Mature", null);
    traits.put("Naive", null);
    traits.put("Humble", null);
    traits.put("Loyal", null);
    traits.put("Quiet", null);
    traits.put("Assertive", null);
    traits.put("Aggressive", null);
    traits.put("Bossy", null);
    traits.put("Dark/Pessimistic", null);
    traits.put("Serious", null);
    traits.put("Cheerful/Optimistic", null);
    traits.put("Loner", null);
    traits.put("Artistic", null);
    traits.put("Shy", null);
    traits.put("Tough", null);
    traits.put("Distrustful/Reserved", null);
    traits.put("Laidback", null);
    traits.put("Patient", null);
    traits.put("Energetic", null);
    traits.put("Lazy", null);
    traits.put("Strange", null);
    traits.put("Intimidating", null);
    traits.put("Flirty", null);
    traits.put("Showoff", null);
    traits.put("Brave", null);
    traits.put("Timid/Cowardly", null);
    traits.put("Sarcastic", null);
    traits.put("Charming/Charismatic", null);
    traits.put("Fiery/Passionate", null);
    traits.put("Inquisitive", null);
    traits.put("Vain", null);
    traits.put("Childlike", null);
    traits.put("Grumpy", null);
    traits.put("Persistant", null);
    traits.put("Soft/Affectionate", null);
    traits.put("Careful", null);
    traits.put("Mischevious/Naughty", null);
    JPanel selections = new JPanel(new GridLayout(0, 1));
    for(String key: traits.keySet()) {
      selections.add(new TypeDetermination(key));
    }
    submit = new JButton("Submit");
    submit.setBounds(80, 215, 100, 20);
    selections.add(submit);
    submit.addActionListener(new ActionListener() {
      @Override 
      public void actionPerformed(ActionEvent e) {
        boolean allSet = true;
        for(String key: traits.keySet()) {
          if(traits.get(key) == null) {
            System.out.println(key);
            allSet = false;
            break;
          }
        }
        if (allSet) {
          dragon = 0;
          dark = 0;
          steel = 0;
          ghost = 0;
          electric = 0;
          psychic = 0;
          ice = 0;
          ground = 0;
          rock = 0;
          bug = 0;
          grass = 0;
          poison = 0;
          flying = 0;
          fire = 0;
          fighting = 0;
          water = 0;
          normal = 0;
          fairy=0;
          FigureOutType();
        }
      }
    });
    
    frame.setContentPane(selections);

    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String args[]) {
    createAndShowGUI();
  }
}

