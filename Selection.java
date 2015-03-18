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

public class Selection extends JPanel implements ActionListener{
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


  public Selection(String trait) {
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

  public void FigureOutType() {
    for(String key: traits.keySet()) {
}

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
      selections.add(new Selection(key));
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
          FigureOutType();
        }
        else {
          System.out.println("Tartar sauce!");
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

