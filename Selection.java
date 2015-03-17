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

public class Selection extends JPanel implements ActionListener{
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

    JPanel radioPanel = new JPanel(new GridLayout(1, 0));
    radioPanel.add(yesButton);
    radioPanel.add(noButton);

    add(radioPanel, BorderLayout.CENTER);
    add(traitLabel, BorderLayout.WEST);
  }
  public void actionPerformed (ActionEvent e) {
    System.out.println(e.getActionCommand());
  }

  private static void createAndShowGUI() {
    JFrame frame = new JFrame("Type Determination");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ArrayList<String> traits = new ArrayList<String>();
    traits.add("Calm");
    traits.add("Outgoing");
    JPanel selections = new JPanel(new GridLayout(0, 1));
    for(int i = 0; i < traits.size(); i++) {
      selections.add(new Selection(traits.get(i)));
    }
    frame.setContentPane(selections);

    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String args[]) {
    createAndShowGUI();
  }
}

