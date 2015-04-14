//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//public static void main (String args[])
//public static void innerSearch()
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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
        rock = rock + 1;
        steel = steel + 1;
        psychic = psychic + 2;
        ice = ice + 2;
        bug = bug + 1;
        grass = grass + 2;
        water = water + 3;
        normal = normal + 1;
      }
      else if (key.equals("Outgoing") && traits.get(key)) {
        dragon = dragon + 1;
        electric = electric + 2;
        psychic = psychic + 1;
        bug = bug + 1;
        grass = grass + 2;
        poison = poison + 1;
        flying = flying + 1;
        fire = fire + 2;
        fighting = fighting + 2;
        water = water + 2;
        normal = normal + 2;
        fairy = fairy + 1;
      }
      else if (key.equals("Kind") && traits.get(key)) {
        dragon = dragon + 1;
        electric = electric + 2;
        psychic = psychic + 1;
        ice = ice + 1;
        ground = ground + 1;
        rock = rock + 1;
        bug = bug + 2;
        grass = grass + 4;
        flying = flying + 1;
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
         psychic = psychic + 4;
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
        rock = rock + 3;
        bug = bug + 1;
        grass = grass + 1;
        poison = poison + 2;
        flying = flying + 1;
        fire = fire + 1;
        fighting = fighting + 3;
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
        normal = normal + 1;
        fairy = fairy + 2;
      }
      else if (key.equals("Decisive") && traits.get(key)) {
         dragon = dragon + 2;
         dark = dark + 1;
         ghost = ghost + 2;
         psychic = psychic + 2;
         flying = flying + 2;
         fighting = fighting + 2;
      }
      else if (key.equals("Sensitive") && traits.get(key)) {
        rock = rock + 1;
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
        fire = fire + 2;
        water = water + 1;
        normal = normal + 2;
        fairy = fairy + 2;
      }
      else if (key.equals("Lonely") && traits.get(key)) {
        ghost = ghost + 2;
        poison = poison + 1;
        flying = flying + 1;
        ground = ground + 1;
      }
      else if (key.equals("Mature") && traits.get(key)) {
         steel = steel + 3;
         dragon = dragon + 1;
         psychic = psychic + 1;
         ground = ground + 2;
         rock = rock + 2;
         flying = flying + 1;
      }
      else if (key.equals("Naive") && traits.get(key)) {
        steel = steel + 1;
        electric = electric + 2;
        ice = ice + 1;
        ground = ground + 1;
        rock = rock + 1;
        bug = bug + 1;
        grass = grass + 1;
        poison = poison + 3;
        fire = fire + 1;
        fighting = fighting + 1;
        water = water + 1;
        normal = normal + 3;
        fairy = fairy + 2;
      }
      else if (key.equals("Humble") && traits.get(key)) {
        ground = ground + 3;
        rock = rock + 2;
        grass = grass + 1;
        water = water + 1;
        normal = normal + 1;
      }
      else if (key.equals("Loyal") && traits.get(key)) {
        dragon = dragon + 1;
        electric = electric + 2;
        psychic = psychic + 1;
        ice = ice + 1;
        ground = ground + 2;
        rock = rock + 2;
        bug = bug + 2;
        grass = grass + 2;
        poison = poison + 1;
        flying = flying + 1;
        fire = fire + 1;
        fighting = fighting + 2;
        water = water + 2;
        normal = normal + 2;
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
        fighting = fighting + 3;
        dragon = dragon + 1;
      }
      else if (key.equals("Aggressive") && traits.get(key)) {
        dark = dark + 3;
        fire = fire + 1;
        fighting = fighting + 2;
      }
      else if (key.equals("Bossy") && traits.get(key)) {
        steel = steel + 1;
        dragon = dragon + 1;
        poison = poison + 1;
        dark = dark + 3;
        fighting = fighting + 2;
      }
      else if (key.equals("Dark/Pessimistic") && traits.get(key)) {
        dark = dark + 2;
        ghost = ghost + 3;
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
        fairy = fairy + 1;
      }
      else if (key.equals("Loner") && traits.get(key)) {
        dragon = dragon + 1;
        dark = dark + 2;
        steel = steel + 1;
        ghost = ghost + 3;
        rock = rock + 2;
        bug = bug + 1;
        poison = poison + 2;
        flying = flying + 2;
        fire = fire + 1;
        ice = ice + 1;
        fighting = fighting + 1;
      }
      else if (key.equals("Artistic") && traits.get(key)) {
        steel = steel + 1;
        ghost = ghost + 1;
        electric = electric + 1;
        psychic = psychic + 1;
        ice = ice + 2;
        ground = ground + 1;
        bug = bug + 1;
        grass = grass + 1;
        fire = fire + 1;
        water = water + 1;
        fairy = fairy + 2;
      }
      else if (key.equals("Shy") && traits.get(key)) {
        dragon = dragon + 1;
        ghost = ghost + 2;
        ground = ground + 1;
        bug = bug + 1;
        grass = grass + 1;
        ice = ice + 4;
        rock = rock + 2;
        fairy = fairy + 1;
      }
      else if (key.equals("Tough") && traits.get(key)) {
        dragon = dragon + 2;
        dark = dark + 1;
        steel = steel + 3;
        rock = rock + 2;
        fire = fire + 2;
        fighting = fighting + 2;
      }
      else if (key.equals("Distrustful/Reserved") && traits.get(key)) {
        dragon = dragon + 1;
        steel = steel + 2;
        dark = dark + 2;
        ghost = ghost + 1;
        ground = ground + 1;
        rock = rock + 1;
        poison = poison + 2;
        flying = flying + 1;
        fire = fire + 1;
        fighting = fighting + 1;
      }
      else if (key.equals("Laidback") && traits.get(key)) {
        psychic = psychic + 1;
        ice = ice + 1;
        ground = ground + 3;
        rock = rock + 2;
        water = water + 2;
        normal = normal + 3;
        fairy = fairy + 1;
      }
      else if (key.equals("Patient") && traits.get(key)) {
        dragon = dragon + 1;
        psychic = psychic + 1;
        ice = ice + 1;
        ground = ground + 2;
        bug = bug + 2;
        rock = rock + 1;
        grass = grass + 1;
        flying = flying + 1;
        water = water + 2;
        normal = normal + 1;
        fairy = fairy + 1;
      }
      else if (key.equals("Energetic") && traits.get(key)) {
        dragon = dragon + 2;
        electric = electric + 4;
        psychic = psychic + 1;
        ground = ground + 1;
        grass = grass + 1;
        flying = flying + 2;
        fire = fire + 1;
        fighting = fighting + 2;
        water = water + 1;
        normal = normal + 1;
        fairy = fairy + 2;
      }
      else if (key.equals("Lazy") && traits.get(key)) {
        ghost = ghost + 1;
        rock = rock + 1;
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
        bug = bug + 3;
        grass = grass + 1;
        flying = flying + 1;
        fairy = fairy + 3;
      }
      else if (key.equals("Intimidating") && traits.get(key)) {
        dragon = dragon + 4;
        dark = dark + 1;
        steel = steel + 2;
        ground = ground + 1;
        rock = rock + 2;
        fire = fire + 1;
      }
      else if (key.equals("Flirty") && traits.get(key)) {
        dark = dark + 1;
        steel = steel + 1;
        ghost = ghost + 1;
        electric = electric + 2;
        psychic = psychic + 1;
        ice = ice + 2;
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
        psychic = psychic + 2;
        poison = poison + 1;
        flying = flying + 3;
        fire = fire + 2;
        fighting = fighting + 2;
        normal = normal + 1;
      }
      else if (key.equals("Brave") && traits.get(key)) {
        dragon = dragon + 1;
        steel = steel + 1;
        electric = electric + 1;
        ground = ground + 1;
        rock = rock + 1;
        flying = flying + 3;
        fire = fire + 3;
        fighting = fighting + 2;
      }
      else if (key.equals("Timid/Cowardly") && traits.get(key)) {
        ghost = ghost + 1;
        electric = electric + 1;
        psychic = psychic + 1;
        ice = ice + 2;
        rock = rock + 1;
        bug = bug + 3;
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
        poison = poison + 3;
        flying = flying + 1;
        fighting = fighting + 1;
        normal = normal + 1;
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
        fairy = fairy + 3;
      }
      else if (key.equals("Fiery/Passionate") && traits.get(key)) {
        dark = dark + 2;
        steel = steel + 1;
        electric = electric + 1;
        ghost = ghost + 1;
        ice = ice + 1;
        ground = ground + 1;
        fire = fire + 3;
        fighting = fighting + 1;
      }
      else if (key.equals("Inquistive") && traits.get(key)) {
        ghost = ghost + 1;
        electric = electric + 2;
        psychic = psychic + 2;
        ice = ice + 2;
        bug = bug + 1;
        normal = normal + 1;
        grass = grass + 1;
        water = water + 3;
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
        dragon = dragon + 1;
        dark = dark + 2;
        fairy = fairy + 1;
        normal = normal + 1;
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
        rock = rock + 1;
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
        fairy = fairy + 1;
        ice = ice + 1;
        normal = normal + 1;
      }
      else if (key.equals("Careful") && traits.get(key)) {
        normal = normal + 1;
        grass = grass + 1;
        ice = ice + 1;
        fighting = fighting + 1;
        poison = poison + 1;
        ground = ground + 1;
        psychic = psychic + 2;
        rock = rock + 3;
        dragon = dragon + 1;
        steel = steel + 2;
        fairy = fairy + 1;
      }
      else if (key.equals("Mischevious/Naughty") && traits.get(key)) {
        fire = fire + 2;
        grass = grass + 1;
        ice = ice + 1;
        poison = poison + 2;
        electric = electric + 1;
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
    max = Math.max(max, water);
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
    JLabel type;
    frame.setVisible(false);
    JPanel typePanel = new JPanel(new GridLayout(0, 1));
    if(numberMax == 1) {
      if (dragonVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        DragonTypeQuizGUI.main(args);
      }
      else if (normalVer) {
        System.out.println("You're a Normal type!");
        frame = new JFrame("NORMAL");
        ImageIcon typePic = new ImageIcon("images/Normal.png");
        type = new JLabel("You're a Normal type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (grassVer) {
        System.out.println("You're a Grass type!");
        frame = new JFrame("GRASS");
        ImageIcon typePic = new ImageIcon("images/Grass.png");
        type = new JLabel("You're a Grass type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (fireVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        FireTypeQuizGUI.main(args);
      }
      else if (waterVer) {
        System.out.println("You're a Water type!");
        frame = new JFrame("WATER");
        ImageIcon typePic = new ImageIcon("images/Water.png");
        type = new JLabel("You're a Water type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (fightingVer) {
        System.out.println("You're a Fighting type!");
        frame = new JFrame("FIGHTING");
        ImageIcon typePic = new ImageIcon("images/Fighting.png");
        type = new JLabel("You're a Fighting type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (flyingVer) {
        System.out.println("You're a Flying type!");
        frame = new JFrame("FLYING");
        ImageIcon typePic = new ImageIcon("images/Flying.png");
        type = new JLabel("You're a Flying type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (poisonVer) {
        System.out.println("You're a Poison type!");
        frame = new JFrame("POISON");
        ImageIcon typePic = new ImageIcon("images/Poison.png");
        type = new JLabel("You're a Poison type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (groundVer) {
        System.out.println("You're a Ground type!");
        frame = new JFrame("GROUND");
        ImageIcon typePic = new ImageIcon("images/Ground.png");
        type = new JLabel("You're a Ground type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (rockVer) {
        System.out.println("You're a Rock type!");
        frame = new JFrame("ROCK");
        ImageIcon typePic = new ImageIcon("images/Rock.png");
        type = new JLabel("You're a Rock type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (bugVer) {
        System.out.println("You're a Bug type!");
        frame = new JFrame("BUG");
        ImageIcon typePic = new ImageIcon("images/Bug.png");
        type = new JLabel("You're a Bug type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (ghostVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        GhostTypeQuizGUI.main(args);
      }
      else if (electricVer) {
        System.out.println("You're an Electric type!");
        frame = new JFrame("ELECTRIC");
        ImageIcon typePic = new ImageIcon("images/Electric.png");
        type = new JLabel("You're an Electric type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (psychicVer) {
        System.out.println("You're a Psychic type!");
        frame = new JFrame("PSYCHIC");
        ImageIcon typePic = new ImageIcon("images/Psychic.png");
        type = new JLabel("You're a Psychic type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (iceVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        IceTypeQuizGUI.main(args);
      }
      else if (darkVer) {
        System.out.println("You're a Dark type!");
        frame = new JFrame("DARK");
        ImageIcon typePic = new ImageIcon("images/Dark.png");
        type = new JLabel("You're a Dark type!", typePic, JLabel.CENTER);
        typePanel.add(type);
      }
      else if (steelVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        SteelTypeQuizGUI.main(args);
      }
      else if (fairyVer) {
        frame.dispose();
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        String[] args = {};
        FairyTypeQuizGUI.main(args);
      }
    } else {
        if (normalVer) {
          JButton normalSel = new JButton("An average person, who doesn't " +
              "really have any definable traits, but is pleasant enough " +
              "to be around");
          normalSel.setBounds(80, 215, 100, 20);
          typePanel.add(normalSel);
          normalSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("NORMAL");
              ImageIcon typePic = new ImageIcon("images/Normal.png");
              JLabel type = new JLabel("You're a Normal type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (grassVer) {
          JButton grassSel = new JButton("A nurturing or caring individual who"+
            " puts friends and family before themselves but may not get" +
            " thanks in return");
          grassSel.setBounds(80, 215, 100, 20);
          typePanel.add(grassSel);
          grassSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("GRASS");
              ImageIcon typePic = new ImageIcon("images/Grass.png");
              JLabel type = new JLabel("You're a Grass type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (fireVer) {
          JButton fireSel = new JButton("Either a deeply passionate soul who"+
              " loves to feel the rush of emotions and is in tune with their" +
             " \"soul\" or a stereotypical \"bad boy/girl\"");
          fireSel.setBounds(80, 215, 100, 20);
          typePanel.add(fireSel);
          fireSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.dispose();
              frame.setUndecorated(true);
              frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
              String[] args = {};
              FireTypeQuizGUI.main(args);
            }
          });
        }
        if (waterVer) {
          JButton waterSel = new JButton("A normal person who is rather" +
             " chill and relaxed, and has an affable personality that " +
             "draws people to him/her.");
          waterSel.setBounds(80, 215, 100, 20);
          typePanel.add(waterSel);
          waterSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("WATER");
              ImageIcon typePic = new ImageIcon("images/Water.png");
              JLabel type = new JLabel("You're a Water type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (fightingVer) {
          JButton fightingSel = new JButton("An athlete who is highly" +
              " competitive and aggressive and could probably do rather well" +
             " in a fight or competition");
          fightingSel.setBounds(80, 215, 100, 20);
          typePanel.add(fightingSel);
          fightingSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("FIGHTING");
              ImageIcon typePic = new ImageIcon("images/Fighting.png");
              JLabel type = new JLabel("You're a Fighting type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (flyingVer) {
          JButton flyingSel = new JButton("A little bit of a daredevil who" +
             " isn't afraid to try or experience new things but has enough" +
            " common sense not to do anything self-endangering");
          flyingSel.setBounds(80, 215, 100, 20);
          typePanel.add(flyingSel);
          flyingSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("FLYING");
              ImageIcon typePic = new ImageIcon("images/Flying.png");
              JLabel type = new JLabel("You're a Flying type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (poisonVer) {
          JButton poisonSel = new JButton("Someone who has very few friends" +
             " and generally is disliked because people find him/her annoying" +
            " or just don't understand him/her");
          poisonSel.setBounds(80, 215, 100, 20);
          typePanel.add(poisonSel);
          poisonSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("POISON");
              ImageIcon typePic = new ImageIcon("images/Poison.png");
              JLabel type = new JLabel("You're a Poison type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (groundVer) {
          JButton groundSel = new JButton("A down-to-earth individual who" +
             " likes living a simple life and helps those who need his/her" +
            " help");
          groundSel.setBounds(80, 215, 100, 20);
          typePanel.add(groundSel);
          groundSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("GROUND");
              ImageIcon typePic = new ImageIcon("images/Ground.png");
              JLabel type = new JLabel("You're a Ground type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (rockVer) {
          JButton rockSel = new JButton("Not exactly the brightest bulb in" +
             " the bunch, but is either physically strong or has the" +
            " willpower to stand up for what they believe in");
          rockSel.setBounds(80, 215, 100, 20);
          typePanel.add(rockSel);
          rockSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("ROCK");
              ImageIcon typePic = new ImageIcon("images/Rock.png");
              JLabel type = new JLabel("You're a Rock type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (bugVer) {
          JButton bugSel = new JButton("A huge nerd who has a particular" +
             " obsession or interest and may be picked on by their peers" +
            " (someone with Asperger's basically)");
          bugSel.setBounds(80, 215, 100, 20);
          typePanel.add(bugSel);
          bugSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("BUG");
              ImageIcon typePic = new ImageIcon("images/Bug.png");
              JLabel type = new JLabel("You're a Bug type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (ghostVer) {
          JButton ghostSel = new JButton("An introverted individual who likes" +
             " to let his/her imagination run free and/or put their emotions" +
            " into a form of art, and is a little pessimistic");
          ghostSel.setBounds(80, 215, 100, 20);
          typePanel.add(ghostSel);
          ghostSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setUndecorated(true);
                frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                String[] args = {};
                GhostTypeQuizGUI.main(args);
            }
          });
        }
        if (electricVer) {
          JButton electricSel = new JButton("An energetic and extraverted" +
             " person who tends to smile and greet people, and some find a" +
            " little hyperactive");
          electricSel.setBounds(80, 215, 100, 20);
          typePanel.add(electricSel);
          electricSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("ELECTRIC");
              ImageIcon typePic = new ImageIcon("images/Electric.png");
              JLabel type = new JLabel("You're an Electric type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (psychicVer) {
          JButton psychicSel = new JButton("A very intelligent human being" +
             " who has the desire to learn many things but may be a little" +
            " vain and self-centered");
          psychicSel.setBounds(80, 215, 100, 20);
          typePanel.add(psychicSel);
          psychicSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("PSYCHIC");
              ImageIcon typePic = new ImageIcon("images/Psychic.png");
              JLabel type = new JLabel("You're a Psychic type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (iceVer) {
          JButton iceSel = new JButton("A dreamy and mysterious person who" +
             " people fall for or admire but don't understand, can be " +
             "artistic and also a little shy");
          iceSel.setBounds(80, 215, 100, 20);
          typePanel.add(iceSel);
          iceSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setUndecorated(true);
                frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                String[] args = {};
                IceTypeQuizGUI.main(args);
            }
          });
        }
        if (dragonVer) {
          JButton dragonSel = new JButton("A wise or strong person (possibly" +
             " a leader) who has the potential of becoming famous or great at" +
            " what they do");
          dragonSel.setBounds(80, 215, 100, 20);
          typePanel.add(dragonSel);
          dragonSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setUndecorated(true);
                frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                String[] args = {};
                DragonTypeQuizGUI.main(args);
            }
          });
        }
        if (darkVer) {
          JButton darkSel = new JButton("A rather nasty bully or jerk who is" +
             " either intelligent and condescending to those less intelligent" +
            " or makes up for it with brute force");
          darkSel.setBounds(80, 215, 100, 20);
          typePanel.add(darkSel);
          darkSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              frame = new JFrame("DARK");
              ImageIcon typePic = new ImageIcon("images/Dark.png");
              JLabel type = new JLabel("You're a Dark type!", typePic,
                JLabel.CENTER);
              JPanel typePanel = new JPanel(new GridLayout(0, 1));
              typePanel.add(type);
              frame.setContentPane(typePanel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.pack();
              frame.setVisible(true);
            }
          });
        }
        if (steelVer) {
          JButton steelSel = new JButton("A somewhat stoic or hardened" +
             " individual who tries to keep their problems or worries to" +
            " themselves, and has the ability to survive calamity");
          steelSel.setBounds(80, 215, 100, 20);
          typePanel.add(steelSel);
          steelSel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setUndecorated(true);
                frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                String[] args = {};
                SteelTypeQuizGUI.main(args);
            }
          });
        }
        if (fairyVer) {
          JButton fairySel = new JButton("A playful and adventurous" +
             " child-at-heart who acts in a strange and whimisical manner");
          fairySel.setBounds(80, 215, 100, 20);
          typePanel.add(fairySel);
          fairySel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setUndecorated(true);
                frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                String[] args = {};
                FairyTypeQuizGUI.main(args);
            }
          });
        }
    }
    frame.setContentPane(typePanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
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

