import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FireTypeQuizGUI extends JPanel
{ static JFrame fireFrame;
  static JPanel firePanel;
  static Queue<Question> questions;
  static String question;
  static boolean cont = false;
  static ArrayList<String> thoseInAgreement = new ArrayList<String>();
  static ArrayList<String> thoseInDenial = new ArrayList<String>();
  static ArrayList<String> firePokemon = new ArrayList<String>();
   public FireTypeQuizGUI() {
     super(new GridLayout(0,1));
     setOpaque(false);
     Question fire = questions.poll();
     question = fire.getQuestion();
     thoseInAgreement = fire.getYes();
     thoseInDenial = fire.getNo();
     JButton yes;
     JButton no;
     if (question.equals("What gender are you?")) {
       yes = new JButton("Male");
       no = new JButton("Female");
     } else {
       yes = new JButton("Yes");
       no = new JButton("No");
     }

     JPanel conflictingInterests = new JPanel(new GridLayout(1,0));
     conflictingInterests.add(yes);
     yes.setForeground(new Color(0.0f, 0.0f, 1.0f));
     yes.setBackground(new Color(1.0f, 1.0f, 1.0f));
     yes.setOpaque(true);
     conflictingInterests.add(no);
     no.setForeground(new Color(1.0f, 0.0f, 0.0f));
     no.setBackground(new Color(1.0f, 1.0f, 1.0f));
     no.setOpaque(true);

     JLabel questionLabel = new JLabel(question, SwingConstants.CENTER);
     questionLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 12));
     questionLabel.setBackground(new Color((86f/100f), (8f/100f),(24f/100f)));
     questionLabel.setOpaque(true);
     questionLabel.setForeground(Color.WHITE);
     questionLabel.setPreferredSize(new Dimension(1000, 70));
     yes.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInDenial.size(); i++) {
           firePokemon.remove(thoseInDenial.get(i));
          }
          thoseInAgreement.clear();
          thoseInDenial.clear();
          boolean readyForNextQuestion = false;
          while (!readyForNextQuestion) {
            if (questions.size() == 0) {
              break;
            }
            readyForNextQuestion = checkIfNecessary(questions.peek());
            if (!readyForNextQuestion) {
              questions.poll();
            }
          }
          if (questions.size() != 0) {
            fireFrame.getContentPane().removeAll();
		        firePanel = new FireTypeQuizGUI();
            fireFrame.add(firePanel);
            fireFrame.pack();
          } else {
              if (firePokemon.size() > 1) {
                  for(int i = 0; i < firePokemon.size(); i++) {
                    System.out.println(firePokemon.get(i));
                  }
                  fireFrame.getContentPane().removeAll();
                  ColorSelection color = new ColorSelection();
                  fireFrame.add(color);
                  fireFrame.pack();
              } else if (firePokemon.size() == 1) {
                  fireFrame.getContentPane().removeAll();
                  JPanel pokemon = ColorSelection.truePokemon();
                  fireFrame.add(pokemon);
                  fireFrame.pack();
                  fireFrame.setVisible(true);
              } else {
                  fireFrame.getContentPane().removeAll();
                  JLabel missingno = ColorSelection.glitch();
                  fireFrame.add(missingno);
                  fireFrame.pack();
              }
          }
       }
     });
     no.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         for(int i = 0; i < thoseInAgreement.size(); i++) {
           firePokemon.remove(thoseInAgreement.get(i));
         }
         thoseInAgreement.clear();
         thoseInDenial.clear();
         boolean readyForNextQuestion = false;
         while(!readyForNextQuestion) {
           if(questions.size() == 0) {
             break;
           }
           readyForNextQuestion = checkIfNecessary(questions.peek());
           if(!readyForNextQuestion) {
             questions.poll();
           }
         }
         if (questions.size() != 0) {
           fireFrame.getContentPane().removeAll();
		       firePanel = new FireTypeQuizGUI();
           fireFrame.add(firePanel);
           fireFrame.pack();
         } else {
           if (firePokemon.size() > 1) {
             for(int i = 0; i < firePokemon.size(); i++) {
               System.out.println(firePokemon.get(i));
             }
             fireFrame.getContentPane().removeAll();
             ColorSelection color = new ColorSelection();
             fireFrame.add(color);
             fireFrame.pack();
           } else if (firePokemon.size() == 1) {
             fireFrame.getContentPane().removeAll();
             JPanel pokemon = ColorSelection.truePokemon();
             fireFrame.add(pokemon);
             fireFrame.pack();
             fireFrame.setVisible(true);
           } else {
             fireFrame.getContentPane().removeAll();
             JLabel missingno = ColorSelection.glitch();
             fireFrame.add(missingno);
             fireFrame.pack();
           }


         }
       }
     });
     add(questionLabel);
     add(conflictingInterests);
   }
   public boolean checkIfNecessary(Question question) {
     boolean necessary = false;
     ArrayList<String> yesPoke = question.getYes();
     ArrayList<String> noPoke = question.getNo();
     for (int i = 0; i < yesPoke.size(); i++) {
       if (firePokemon.contains(yesPoke.get(i))) {
         necessary = true;
         break;
       }
     }
     if (!necessary) {
       for (int i = 0; i < noPoke.size(); i++) {
         if (firePokemon.contains(noPoke.get(i))) {
           necessary = true;
           break;
         }
       }
     }
     return necessary;
   }
   public static class Question {
     public String _question = "???";
     public ArrayList<String> yes = new ArrayList<String>();
     public ArrayList<String> no = new ArrayList<String>();
     public Question (String porque) {
       _question = porque;
     }
     public void addPokemonYes (String pokemon) {
       yes.add(pokemon);
     }
     public void addPokemonNo (String pokemon) {
       no.add(pokemon);
     }
     public String getQuestion() {
       return _question;
     }
     public ArrayList<String> getYes() {
       return yes;
     }
     public ArrayList<String> getNo() {
       return no;
     }
   }

   public static class ColorSelection extends JPanel implements ActionListener {
     public ColorSelection () {
       super(new BorderLayout());
       JPanel colorsPanel = new JPanel(new GridLayout(0,3));
       JLabel select = new JLabel("Select the color which describes you the "+
               "best:\n");
       select.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       select.setOpaque(true);
       select.setForeground(Color.WHITE);
       select.setBackground(Color.BLACK);
       ArrayList<JButton> colors = new ArrayList<JButton>();
       for (int i = 0; i < firePokemon.size(); i++) {
         if (firePokemon.get(i).equals("Growlithe") || firePokemon.get(i)
             .equals("Arcanine"))
         {
           JButton colorButton = new JButton("Cinnabar");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Cinnabar");
           colorButton.setBackground(new Color((89f/100f),(26f/100f),
                 (20f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (firePokemon.get(i).equals("Torkoal"))
         {
           JButton colorButton = new JButton("Smoke");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Smoke");
           colorButton.setBackground(new Color((45f/100f), (51f/100f),
                 (46f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (firePokemon.get(i).equals("Charmander") || firePokemon.get(i)
             .equals("Charmeleon") || firePokemon.get(i).equals("Charizard"))
         {
           JButton colorButton = new JButton("Flame");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Flame");
           colorButton.setBackground(new Color((89f/100f), (35f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
             }
         if (firePokemon.get(i).equals("Vulpix") || firePokemon.get(i)
             .equals("Ninetales"))
         {
           JButton colorButton = new JButton("Blond");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Blond");
           colorButton.setBackground(new Color((98f/100f), (94f/100f),
                 (75f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Ponyta") || firePokemon.get(i)
             .equals("Rapidash"))
         {
           JButton colorButton = new JButton("Champagne");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Champagne");
           colorButton.setBackground(new Color((97f/100f), (91f/100f),
                 (81f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Reshiram"))
         {
           JButton colorButton = new JButton("White");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("White");
           colorButton.setBackground(new Color((100f/100f), (100f/100f),
                 (100f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Pansear") ||
             firePokemon.get(i).equals("Simisear"))
         {
           JButton colorButton = new JButton("Lust");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lust");
           colorButton.setBackground(new Color((90f/100f), (13f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Flareon"))
         {
           JButton colorButton = new JButton("Yellow");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Yellow");
           colorButton.setBackground(new Color((100f/100f), (100f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Magby") || firePokemon.get(i)
             .equals("Magmar") || firePokemon.get(i).equals("Magmortar"))
         {
           JButton colorButton = new JButton("Lava");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lava");
           colorButton.setBackground(new Color((81f/100f), (6f/100f),
                 (13f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Slugma") ||
             firePokemon.get(i).equals("Magcargo"))
         {
           JButton colorButton = new JButton("Charcoal");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Charcoal");
           colorButton.setBackground(new Color((21f/100f), (27f/100f),
                 (31f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Cyndaquil") ||
             firePokemon.get(i).equals("Quilava") ||
             firePokemon.get(i).equals("Typhlosion"))
         {
           JButton colorButton = new JButton("Amazon");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Amazon");
           colorButton.setBackground(new Color((23f/100f), (48f/100f),
                 (34f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Entei"))
         {
           JButton colorButton = new JButton("Silver");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Silver");
           colorButton.setBackground(new Color((75f/100f), (75f/100f),
                 (75f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Chimchar") ||
             firePokemon.get(i).equals("Monferno") ||
             firePokemon.get(i).equals("Infernape"))
         {
           JButton colorButton = new JButton("Mango");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Mango");
           colorButton.setBackground(new Color((100f/100f), (51f/100f),
                 (26f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Moltres"))
         {
           JButton colorButton = new JButton("Ruby");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Ruby");
           colorButton.setBackground(new Color((88f/100f), (7f/100f),
                 (37f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Heatran"))
         {
           JButton colorButton = new JButton("Burnt Orange");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Burnt Orange");
           colorButton.setBackground(new Color((80f/100f), (33f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Numel") ||
             firePokemon.get(i).equals("Camerupt"))
         {
           JButton colorButton = new JButton("Sand Dune");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Sand Dune");
           colorButton.setBackground(new Color((59f/100f), (44f/100f),
                 (9f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Litwick") ||
             firePokemon.get(i).equals("Lampent") ||
             firePokemon.get(i).equals("Chandelure"))
         {
           JButton colorButton = new JButton("Dark Purple");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Dark Purple");
           colorButton.setBackground(new Color((20f/100f), (9f/100f),
                 (30f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Darumaka") ||
             firePokemon.get(i).equals("Darmanitan"))
         {
           JButton colorButton = new JButton("Lemon");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Lemon");
           colorButton.setBackground(new Color((100f/100f), (97f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Tepig") ||
             firePokemon.get(i).equals("Pignite") ||
             firePokemon.get(i).equals("Emboar"))
         {
           JButton colorButton = new JButton("Candy Apple Red");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Candy Apple Red");
           colorButton.setBackground(new Color((100f/100f), (3f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Larvesta") ||
             firePokemon.get(i).equals("Volcarona"))
         {
           JButton colorButton = new JButton("Sunglow");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Sunglow");
           colorButton.setBackground(new Color((100f/100f), (80f/100f),
                 (20f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Houndour") ||
             firePokemon.get(i).equals("Houndoom"))
         {
           JButton colorButton = new JButton("Black");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Black");
           colorButton.setBackground(new Color((0f/100f), (0f/100f),
                 (0f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Litleo") ||
             firePokemon.get(i).equals("Pyroar"))
         {
           JButton colorButton = new JButton("Auburn");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Auburn");
           colorButton.setBackground(new Color((65f/100f), (16f/100f),
                 (16f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Heatmor"))
         {
           JButton colorButton = new JButton("Russet");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Russet");
           colorButton.setBackground(new Color((50f/100f), (27f/100f),
                 (11f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Victini"))
         {
           JButton colorButton = new JButton("Sunset Orange");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Sunset Orange");
           colorButton.setBackground(new Color((99f/100f), (37f/100f),
                 (33f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Klink") ||
             firePokemon.get(i).equals("Klang") ||
             firePokemon.get(i).equals("Klinklang"))
         {
           JButton colorButton = new JButton("Gray");
           colorButton.setForeground(Color.BLACK);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Gray");
           colorButton.setBackground(new Color((50f/100f), (50f/100f),
                 (50f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Fletchinder") ||
             firePokemon.get(i).equals("Talonflame"))
         {
           JButton colorButton = new JButton("Jet");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Jet");
           colorButton.setBackground(new Color((20f/100f), (20f/100f),
                 (20f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Torchic") ||
             firePokemon.get(i).equals("Combusken") ||
             firePokemon.get(i).equals("Blaziken"))
         {
           JButton colorButton = new JButton("Crimson");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Crimson");
           colorButton.setBackground(new Color((86f/100f), (8f/100f),
                 (24f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
         if (firePokemon.get(i).equals("Fennekin") ||
             firePokemon.get(i).equals("Braixen") ||
             firePokemon.get(i).equals("Delphox"))
         {
           JButton colorButton = new JButton("Scarlet");
           colorButton.setForeground(Color.WHITE);
           colorButton.setOpaque(true);
           colorButton.setActionCommand("Scarlet");
           colorButton.setBackground(new Color((99f/100f), (5f/100f),
                 (21f/100f)));
           colorButton.addActionListener(this);
           colors.add(colorButton);
         }
       }
       for (int i = 0; i < colors.size(); i++) {
         colorsPanel.add(colors.get(i));
       }
       add(select, BorderLayout.NORTH);
       add(colorsPanel, BorderLayout.CENTER);

     }
     public void actionPerformed(ActionEvent e) {
       String colorStr = e.getActionCommand();
       Color color = ((JButton)e.getSource()).getBackground();
       ImageIcon pokePicture;
       JPanel n = new JPanel();
       fireFrame.getContentPane().removeAll();
       if (colorStr.equals("Flame") &&
           firePokemon.contains("Charmander")) {
           n.add(createPokemon("Charmander", color));
       } else if (colorStr.equals("Flame") &&
               firePokemon.contains("Charmeleon")){
           n.add(createPokemon("Charmeleon", color));
       } else if (colorStr.equals("Flame") &&
               firePokemon.contains("Charizard")){
           n.add(createPokemon("Charizard", color));
       } else if (colorStr.equals("Blond") && firePokemon.contains("Vulpix")) {
           n.add(createPokemon("Vulpix", color));
       } else if (colorStr.equals("Blond") &&
           firePokemon.contains("Ninetales")) {
           n.add(createPokemon("Ninetales", color));
       } else if (colorStr.equals("Cinnabar") &&
           firePokemon.contains("Growlithe")) {
           n.add(createPokemon("Growlithe", color));
       } else if (colorStr.equals("Cinnabar") &&
           firePokemon.contains("Arcanine")) {
           n.add(createPokemon("Arcanine", color));
       } else if (colorStr.equals("Champagne") &&
           firePokemon.contains("Ponyta")) {
           n.add(createPokemon("Ponyta", color));
       } else if (colorStr.equals("Champagne") && firePokemon
               .contains("Rapidash")) {
           n.add(createPokemon("Rapidash", color));
       } else if (colorStr.equals("Lava") && firePokemon
               .contains("Magby")) {
           n.add(createPokemon("Magby", color));
       } else if (colorStr.equals("Lava") && firePokemon
           .contains("Magmar")) {
           n.add(createPokemon("Magmar", color));
       } else if (colorStr.equals("Lava") && firePokemon
               .contains("Magmortar")) {
           n.add(createPokemon("Magmortar", color));
       } else if (colorStr.equals("Yellow")) {
           n.add(createPokemon("Flareon", color));
       } else if (colorStr.equals("Ruby")) {
           n.add(createPokemon("Moltres", color));
       } else if (colorStr.equals("Amazon") &&
           firePokemon.contains("Cyndaquil")) {
           n.add(createPokemon("Cyndaquil", color));
       } else if (colorStr.equals("Amazon") &&
           firePokemon.contains("Quilava")) {
           n.add(createPokemon("Quilava", color));
       } else if (colorStr.equals("Amazon") &&
           firePokemon.contains("Typhlosion")) {
           n.add(createPokemon("Typhlosion", color));
       } else if (colorStr.equals("Charcoal") &&
           firePokemon.contains("Slugma")) {
           n.add(createPokemon("Slugma", color));
       } else if (colorStr.equals("Charcoal") && firePokemon
           .contains("Magcargo")) {
           n.add(createPokemon("Magcargo", color));
       } else if (colorStr.equals("Black") &&
           firePokemon.contains("Houndour")) {
           n.add(createPokemon("Houndour", color));
       } else if (colorStr.equals("Black") && firePokemon
               .contains("Houndoom")) {
           n.add(createPokemon("Houndoom", color));
       } else if (colorStr.equals("Silver")) {
           n.add(createPokemon("Entei", color));
       } else if (colorStr.equals("Gold")) {
           n.add(createPokemon("Ho-oh", color));
       } else if (colorStr.equals("Crimson") &&
           firePokemon.contains("Torchic")) {
           n.add(createPokemon("Torchic", color));
       } else if (colorStr.equals("Crimson") &&
           firePokemon.contains("Combusken")) {
           n.add(createPokemon("Combusken", color));
       } else if (colorStr.equals("Crimson") &&
           firePokemon.contains("Blaziken")) {
           n.add(createPokemon("Blaziken", color));
       } else if (colorStr.equals("Sand Dune") &&
           firePokemon.contains("Numel")) {
           n.add(createPokemon("Numel", color));
       } else if (colorStr.equals("Sand Dune") && firePokemon
               .contains("Camerupt")) {
           n.add(createPokemon("Camerupt", color));
       } else if (colorStr.equals("Smoke")) {
           n.add(createPokemon("Torkoal", color));
       } else if (colorStr.equals("Mango") &&
           firePokemon.contains("Chimchar")) {
           n.add(createPokemon("Chimchar", color));
       } else if (colorStr.equals("Mango") &&
           firePokemon.contains("Monferno")) {
           n.add(createPokemon("Monferno", color));
       } else if (colorStr.equals("Mango") &&
           firePokemon.contains("Infernape")) {
           n.add(createPokemon("Infernape", color));
       } else if (colorStr.equals("Burnt Orange")) {
           n.add(createPokemon("Heatran", color));
       } else if (colorStr.equals("Sunset Orange")) {
           n.add(createPokemon("Victini", color));
       } else if (colorStr.equals("Candy Apple Red") &&
           firePokemon.contains("Tepig")) {
           n.add(createPokemon("Tepig", color));
       } else if (colorStr.equals("Candy Apple Red") &&
           firePokemon.contains("Pignite")) {
           n.add(createPokemon("Pignite", color));
       } else if (colorStr.equals("Candy Apple Red") &&
           firePokemon.contains("Emboar")) {
           n.add(createPokemon("Emboar", color));
       } else if (colorStr.equals("Lust") &&
           firePokemon.contains("Pansear")) {
           n.add(createPokemon("Pansear", color));
       } else if (colorStr.equals("Lust") &&
           firePokemon.contains("Simisear")) {
           n.add(createPokemon("Simisear", color));
       } else if (colorStr.equals("Lemon") &&
           firePokemon.contains("Darumaka")) {
           n.add(createPokemon("Darumaka", color));
       }
       else if(colorStr.equals("Lemon") &&
           firePokemon.contains("Darmanitan")) {
           n.add(createPokemon("Darmanitan", color));
       }
       else if(colorStr.equals("Dark Purple") &&
           firePokemon.contains("Litwick")) {
           n.add(createPokemon("Litwick", color));
       }
       else if(colorStr.equals("Dark Purple") &&
           firePokemon.contains("Lampent")) {
           n.add(createPokemon("Lampent", color));
       }
       else if(colorStr.equals("Dark Purple") &&
           firePokemon.contains("Chandelure")) {
           n.add(createPokemon("Chandelure", color));
       }
       else if(colorStr.equals("Russet")) {
           n.add(createPokemon("Heatmor", color));
       }
       else if(colorStr.equals("Sunglow") &&
           firePokemon.contains("Larvesta")) {
           n.add(createPokemon("Larvesta", color));
       }
       else if(colorStr.equals("Sunglow") &&
           firePokemon.contains("Volcarona")) {
           n.add(createPokemon("Volcarona", color));
       }
       else if(colorStr.equals("White")) {
           n.add(createPokemon("Reshiram", color));
       }
       else if(colorStr.equals("Scarlet") &&
           firePokemon.contains("Fennekin")) {
           n.add(createPokemon("Fennekin", color));
       }
       else if(colorStr.equals("Scarlet") &&
           firePokemon.contains("Braixen")) {
           n.add(createPokemon("Braixen", color));
       }
       else if(colorStr.equals("Scarlet") &&
           firePokemon.contains("Delphox")) {
           n.add(createPokemon("Delphox", color));
       }
       else if(colorStr.equals("Jet") &&
           firePokemon.contains("Fletchinder")) {
           n.add(createPokemon("Fletchinder", color));
       }
       else if(colorStr.equals("Jet") &&
           firePokemon.contains("Talonflame")) {
           n.add(createPokemon("Talonflame", color));
       }
       else if(colorStr.equals("Auburn") &&
           firePokemon.contains("Litleo")) {
           n.add(createPokemon("Litleo", color));
       }
       else if(colorStr.equals("Auburn") &&
           firePokemon.contains("Pyroar-Male")) {
           n.add(createPokemon("Pyroar-Male", color));
       }
       else if(colorStr.equals("Auburn") &&
           firePokemon.contains("Pyroar-Female")) {
           n.add(createPokemon("Pyroar-Female", color));
       }
       fireFrame.add(n);
       fireFrame.pack();
       fireFrame.setVisible(true);
     }

     public static JPanel truePokemon() {
       JPanel n = new JPanel();
       if (firePokemon.get(0).equals("Magnemite")) {
         n.add(createPokemon("Magnemite", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (firePokemon.get(0).equals("Magneton")) {
         n.add(createPokemon("Magneton", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (firePokemon.get(0).equals("Magnezone")) {
         n.add(createPokemon("Magnezone", new Color((100f/100f),
                 (100f/100f),(20f/100f))));
       }
       if (firePokemon.get(0).equals("Forretress")) {
         n.add(createPokemon("Forretress", new Color((13f/100f),
                 (55f/100f),(13f/100f))));
       }
       if (firePokemon.get(0).equals("Fireix")) {
         n.add(createPokemon("Fireix", new Color((21f/100f),
                 (22f/100f),(22f/100f))));
       }
       if (firePokemon.get(0).equals("Scizor")) {
         n.add(createPokemon("Scizor", new Color((100f/100f),
                 (0f/100f),(0f/100f))));
       }
       if (firePokemon.get(0).equals("Skarmory")) {
         n.add(createPokemon("Skarmory", new Color((86f/100f),
                 (8f/100f),(24f/100f))));
       }
       if (firePokemon.get(0).equals("Mawile")) {
         n.add(createPokemon("Mawile", new Color((10f/100f),
                 (7f/100f),(6f/100f))));
       }
       if (firePokemon.get(0).equals("Aron")) {
         n.add(createPokemon("Aron", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (firePokemon.get(0).equals("Lairon")) {
         n.add(createPokemon("Lairon", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (firePokemon.get(0).equals("Aggron")) {
         n.add(createPokemon("Aggron", new Color((21f/100f),
                 (27f/100f),(31f/100f))));
       }
       if (firePokemon.get(0).equals("Beldum")) {
         n.add(createPokemon("Beldum", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (firePokemon.get(0).equals("Metang")) {
         n.add(createPokemon("Metang", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (firePokemon.get(0).equals("Metagross")) {
         n.add(createPokemon("Metagross", new Color((0f/100f),
                 (28f/100f),(67f/100f))));
       }
       if (firePokemon.get(0).equals("Regifire")) {
         n.add(createPokemon("Regifire", new Color((25f/100f),
                 (29f/100f),(30f/100f))));
       }
       if (firePokemon.get(0).equals("Jirachi")) {
         n.add(createPokemon("Jirachi", new Color((83f/100f),
                 (69f/100f),(22f/100f))));
       }
       if (firePokemon.get(0).equals("Empoleon")) {
         n.add(createPokemon("Empoleon", new Color((0f/100f),
                 (14f/100f),(40f/100f))));
       }
       if (firePokemon.get(0).equals("Shieldon")) {
         n.add(createPokemon("Shieldon", new Color((100f/100f),
                 (86f/100f),(35f/100f))));
       }
       if (firePokemon.get(0).equals("Bastiodon")) {
         n.add(createPokemon("Bastiodon", new Color((100f/100f),
                 (86f/100f),(35f/100f))));
       }
       if (firePokemon.get(0).equals("Bronzor")) {
         n.add(createPokemon("Bronzor", new Color((80f/100f),
                 (50f/100f),(20f/100f))));
       }
       if (firePokemon.get(0).equals("Bronzong")) {
         n.add(createPokemon("Bronzong", new Color((80f/100f),
                 (50f/100f),(20f/100f))));
       }
       if (firePokemon.get(0).equals("Lucario")) {
         n.add(createPokemon("Lucario", new Color((27f/100f),
                 (51f/100f),(71f/100f))));
       }
       if (firePokemon.get(0).equals("Probopass")) {
         n.add(createPokemon("Probopass", new Color((0f/100f),
                 (100f/100f),(100f/100f))));
       }
       if (firePokemon.get(0).equals("Dialga")) {
         n.add(createPokemon("Dialga", new Color((29f/100f),
                 (59f/100f),(82f/100f))));
       }
       if (firePokemon.get(0).equals("Heatran")) {
         n.add(createPokemon("Heatran", new Color((80f/100f),
                 (33f/100f),(0f/100f))));
       }
       if (firePokemon.get(0).equals("Excadrill")) {
         n.add(createPokemon("Excadrill", new Color((58f/100f),
                 (27f/100f),(21f/100f))));
       }
       if (firePokemon.get(0).equals("Escavalier")) {
         n.add(createPokemon("Escavalier", new Color((57f/100f),
                 (64f/100f),(69f/100f))));
       }
       if (firePokemon.get(0).equals("Ferroseed")) {
         n.add(createPokemon("Ferroseed", new Color((0f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (firePokemon.get(0).equals("Ferrothorn")) {
         n.add(createPokemon("Ferrothorn", new Color((0f/100f),
                 (50f/100f),(0f/100f))));
       }
       if (firePokemon.get(0).equals("Klink")) {
         n.add(createPokemon("Klink", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (firePokemon.get(0).equals("Klang")) {
         n.add(createPokemon("Klang", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (firePokemon.get(0).equals("Klinklang")) {
         n.add(createPokemon("Klinklang", new Color((50f/100f),
                 (50f/100f),(50f/100f))));
       }
       if (firePokemon.get(0).equals("Pawniard")) {
         n.add(createPokemon("Pawniard", new Color((50f/100f),
                 (0f/100f),(13f/100f))));
       }
       if (firePokemon.get(0).equals("Bisharp")) {
         n.add(createPokemon("Bisharp", new Color((50f/100f),
                 (0f/100f),(13f/100f))));
       }
       if (firePokemon.get(0).equals("Durant")) {
         n.add(createPokemon("Durant", new Color((4f/100f),
                 (85f/100f),(32f/100f))));
       }
       if (firePokemon.get(0).equals("Cobalion")) {
         n.add(createPokemon("Cobalion", new Color((75f/100f),
                 (75f/100f),(75f/100f))));
       }
       if (firePokemon.get(0).equals("Genesect")) {
         n.add(createPokemon("Genesect", new Color((75f/100f),
                 (0f/100f),(100f/100f))));
       }
       if (firePokemon.get(0).equals("Honedge")) {
         n.add(createPokemon("Honedge", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (firePokemon.get(0).equals("Doublade")) {
         n.add(createPokemon("Doublade", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (firePokemon.get(0).equals("Aegislash")) {
         n.add(createPokemon("Aegislash", new Color((10f/100f),
                 (10f/100f),(44f/100f))));
       }
       if (firePokemon.get(0).equals("Klefki")) {
         n.add(createPokemon("Klefki", new Color((83f/100f),
                 (83f/100f),(83f/100f))));
       }
       return n;
     }

     public static JLabel glitch() {
       ImageIcon pokePicture = new ImageIcon("images/MissingNo.png");
       JLabel pokeLabel = new JLabel("There was a glitch...", pokePicture,
           JLabel.CENTER);
       pokeLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       pokeLabel.setForeground(Color.WHITE);
       pokeLabel.setBackground(Color.BLACK);
       pokeLabel.setOpaque(true);
       return pokeLabel;
     }

     public static JLabel createPokemon(String pokemon, Color color) {
       fireFrame.getContentPane().removeAll();
       ImageIcon pokePicture = new ImageIcon("./images/Fire/" + pokemon +
           ".png");
       JLabel pokeLabel;
       if (pokemon.equals("Jellicent-Male") ||
           pokemon.equals("Jellicent-Female")) {
         pokeLabel = new JLabel("You are Jellicent!", pokePicture,
             JLabel.CENTER);
       } else if (pokemon.equals("Frillish-Male") ||
           pokemon.equals("Frillish-Female")) {
         pokeLabel = new JLabel("You are Frillish!", pokePicture,
             JLabel.CENTER);
           } else {
         pokeLabel = new JLabel("You are " + pokemon + "!", pokePicture,
             JLabel.CENTER);
         }
       pokeLabel.setFont(new Font("SansSerif.bold", Font.PLAIN, 24));
       if((color.getRed() + color.getGreen() + color.getBlue())/3.0 > 128.0) {
         pokeLabel.setForeground(Color.BLACK);
       } else {
         pokeLabel.setForeground(Color.WHITE);
       }
       /*pokeLabel.setForeground(new Color((1f - color.getRed()/255f), (1f - color.getGreen()/255f),
             (1f - color.getBlue()/255f)));*/
       pokeLabel.setOpaque(true);
       pokeLabel.setBackground(color);
       return pokeLabel;
     }
   }
   public static void main(String arg[]) {
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
       firePokemon.add("Fennekin");
       firePokemon.add("Braixen");
       firePokemon.add("Delphox");
       firePokemon.add("Fletchinder");
       firePokemon.add("Talonflame");
       firePokemon.add("Litleo");
       firePokemon.add("Pyroar-Male");
       firePokemon.add("Pyroar-Female");
    //   firePokemon.add("Volcanion");

    questions =  new LinkedList<Question>();
    Question question = new Question("Are you famous and well-known outside" +
        " of your home?");
    question.addPokemonYes("Moltres");
    question.addPokemonYes("Entei");
    question.addPokemonYes("Ho-oh");
    question.addPokemonYes("Heatran");
    question.addPokemonYes("Victini");
    question.addPokemonYes("Reshiram");
    //question.addPokemonYes("Volcanion");
    questions.add(question);
    
    question = new Question("Would you fight to the death to protect " +
        "someone, or to defend an ideal, instead of running away in self-" +
        "preservation?");
    question.addPokemonYes("Growlithe");
    question.addPokemonYes("Arcanine");
    questions.add(question);


    question = new Question("Do tend to dread deadlines, but are often rather" +
        " slow in accomplishing tasks?");
    question.addPokemonYes("Slugma");
    question.addPokemonYes("Magcargo");
    questions.add(question);

    question = new Question("Do you constantly look for new challenges and " +
        "thrills?");
    question.addPokemonYes("Charmander");
    question.addPokemonYes("Charmeleon");
    question.addPokemonYes("Charizard");
    questions.add(question);

    question = new Question("Are you the life of the party when with your " +
        "friends, but are a bit wary or maybe a little rude when you are " +
        "around strangers?");
    question.addPokemonYes("Chimchar");
    question.addPokemonYes("Monferno");
    question.addPokemonYes("Infernape");
    questions.add(question);

    question = new Question("Are you addicted to sweets or sugary foods, but" +
        " burn off what you eat because of your healthy lifestyle?");
    question.addPokemonYes("Pansear");
    question.addPokemonYes("Simisear");
    questions.add(question);

    question = new Question("Are you a vegetarian?");
    question.addPokemonYes("Fennekin");
    question.addPokemonYes("Braixen");
    question.addPokemonYes("Delphox");
    questions.add(question);

    question = new Question("Did you enjoy torturing or burning insects " +
        "when you were younger, or are you an exterminator by profession?");
    question.addPokemonYes("Heatmor");
    questions.add(question);

    question = new Question("Are you either a highly competitive and somewhat" +
        " selfish person, or do you run or participate in track for fun?");
    question.addPokemonYes("Ponyta");
    question.addPokemonYes("Rapidash");
    questions.add(question);

    question = new Question("Are you likely to get defensive or lash out if " +
        "someone mocks you or belittles you?");
    question.addPokemonYes("Cyndaquil");
    question.addPokemonYes("Quilava");
    question.addPokemonYes("Typhlosion");
    questions.add(question);

    question = new Question("Do you, or does someone you are close to, smoke " +
        "cigars or cigarettes regularly?");
    question.addPokemonYes("Torkoal");
    questions.add(question);

    question = new Question("Do you tend to eat more the average person, " +
        "and has this contributed to a weight problem or the start of one?");
    question.addPokemonYes("Tepig");
    question.addPokemonYes("Pignite");
    question.addPokemonYes("Emboar");
    questions.add(question);

    question = new Question("Do you believe that life is what you make, and" +
        " that having a positive outlook on life is important?");
    question.addPokemonYes("Magby");
    question.addPokemonYes("Magmar");
    question.addPokemonYes("Magmortar");
    questions.add(question);

    question = new Question("Do people usually come to you for consolement " +
        "when they are feeling down or when they need help?");
    question.addPokemonYes("Larvesta");
    question.addPokemonYes("Volcarona");
    questions.add(question);

    question = new Question("Are you normally friendly and outgoing, but tend" +
        " to clam up and push people away when things aren't going well?");
    question.addPokemonYes("Darumaka");
    question.addPokemonYes("Darmanitan");
    questions.add(question);

    question = new Question("Are you normally quiet and unassuming, " +
        "unless something triggers you, which causes you to go off onto a " +
        "violent tirade or break things?");
    question.addPokemonYes("Numel");
    question.addPokemonYes("Camerupt");
    questions.add(question);

    question = new Question("Do you have the reputation as a bad boy or as " +
        "one that likes to stir up trouble, even though you may not deserve" +
        " it?");
    question.addPokemonYes("Houndoom");
    question.addPokemonYes("Houndour");
    questions.add(question);

    question = new Question("Are you known to be an especially affectionate " +
        "person who isn't afraid of showing off for the attention of the " +
        "opposite sex?");
    question.addPokemonYes("Torchic");
    question.addPokemonYes("Combusken");
    question.addPokemonYes("Blaziken");
    questions.add(question);

    question = new Question("Are you either an excellent teacher or a " +
        "steafast student who has a love for learning, who wishes the " +
        "world was smarter?");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Lampent");
    question.addPokemonYes("Chandelure");
    questions.add(question);

    question = new Question("Are you known to be a vengeful person who " +
        "doesn't take offenses lightly, or a heartbreaker that people " +
        "fall in love with only to be rejected?");
    question.addPokemonYes("Vulpix");
    question.addPokemonYes("Ninetales");
    questions.add(question);

    question = new Question("Are you a member of the wealthy, upper class, or" +
        " do you take great pride in how you look?");
    question.addPokemonYes("Litleo");
    question.addPokemonYes("Pyroar-Male");
    question.addPokemonYes("Pyroar-Female");
    questions.add(question);

    question = new Question("Are you still biologically a child (under the" +
        " age of 18)?");
    question.addPokemonYes("Charmander");
    question.addPokemonYes("Vulpix");
    question.addPokemonYes("Growlithe");
    question.addPokemonYes("Ponyta");
    question.addPokemonYes("Cyndaquil");
    question.addPokemonYes("Slugma");
    question.addPokemonYes("Houndour");
    question.addPokemonYes("Magby");
    question.addPokemonYes("Torchic");
    question.addPokemonYes("Numel");
    question.addPokemonYes("Chimchar");
    question.addPokemonYes("Tepig");
    question.addPokemonYes("Pansear");
    question.addPokemonYes("Darumaka");
    question.addPokemonYes("Litwick");
    question.addPokemonYes("Larvesta");
    question.addPokemonYes("Fennekin");
    question.addPokemonYes("Litleo");

    question.addPokemonNo("Charmeleon");
    question.addPokemonNo("Charizard");
    question.addPokemonNo("Ninetales");
    question.addPokemonNo("Arcanine");
    question.addPokemonNo("Rapidash");
    question.addPokemonNo("Magmar");
    question.addPokemonNo("Flareon");
    question.addPokemonNo("Quilava");
    question.addPokemonNo("Typhlosion");
    question.addPokemonNo("Magcargo");
    question.addPokemonNo("Houndoom");
    question.addPokemonNo("Combusken");
    question.addPokemonNo("Blaziken");
    question.addPokemonNo("Camerupt");
    question.addPokemonNo("Monferno");
    question.addPokemonNo("Infernape");
    question.addPokemonNo("Magmortar");
    question.addPokemonNo("Pignite");
    question.addPokemonNo("Emboar");
    question.addPokemonNo("Simisear");
    question.addPokemonNo("Darmanitan");
    question.addPokemonNo("Lampent");
    question.addPokemonNo("Chandelure");
    question.addPokemonNo("Volcarona");
    question.addPokemonNo("Braixen");
    question.addPokemonNo("Delphox");
    question.addPokemonNo("Fletchinder");
    question.addPokemonNo("Talonflame");
    question.addPokemonNo("Pyroar-Male");
    question.addPokemonNo("Pyroar-Female");
    questions.add(question);

    question = new Question("Are you known to be a passionate, skillful " +
        "lover, or do you regularly partake in extreme sports or parkour?");
    question.addPokemonYes("Blaziken");
    question.addPokemonNo("Combusken");
    questions.add(question);

    question = new Question("What gender are you?");
    question.addPokemonYes("Pyroar-Male");
    question.addPokemonNo("Pyroar-Female");
    questions.add(question);

    question = new Question("Do you believe that fear tactics, intimidating " +
       "your opponents into submission, are the best way to win a battle or " +
       "competition?");
    question.addPokemonYes("Fletchinder");
    question.addPokemonYes("Talonflame");
    questions.add(question);

    question = new Question("Do you fight to have the last say on things, " +
        "or are you the kind of gamer that steals points or \"kills\" from " +
        "your teammates?");
    question.addPokemonYes("Talonflame");
    question.addPokemonNo("Fletchinder");
    questions.add(question);
 
    question = new Question("Are you full of hot air, and tend to ramble on " +
        "about things, which bores people in the process?");
    question.addPokemonYes("Flareon");
    questions.add(question);

    question = new Question("Despite your competitive and driven spirit, " +
        "are you easy on beginners when they have to either learn from you " +
        "or go up against you?");
    question.addPokemonYes("Charizard");
    question.addPokemonNo("Charmeleon");
    questions.add(question);

    question = new Question("Have you won a prestigous competition or have " +
        "set a world record in something?");
    question.addPokemonYes("Victini");
    questions.add(question);

    question = new Question("Do you read people's thoughts or emotions very " +
        "well and has this made you a capable leader?");
    question.addPokemonYes("Lucario");
    questions.add(question);

    question = new Question("Are you a Wiccan, or someone who believes they " +
        "practice magic?");
    question.addPokemonYes("Delphox");
    question.addPokemonNo("Braixen");
    questions.add(question);

    question = new Question("Do you prefer the warmth of the spring or summer" +
        " over the cold of fall and winter, and do you tend to a garden?");
    question.addPokemonYes("Moltres");
    questions.add(question);

    question = new Question("Do you turn into a bit of a braggart or become" +
        " exuberantly happy when things are going your way?");
    question.addPokemonYes("Magmortar");
    question.addPokemonNo("Magmar");
    questions.add(question);

    question = new Question("Do you deter some people from getting close to " +
        "you because of anger or self-control issues?");
    question.addPokemonYes("Typhlosion");
    question.addPokemonNo("Quilava");
    questions.add(question);

    question = new Question("Have you been to most countries of the world, " +
        "and can never settle in one place for long?");
    question.addPokemonYes("Entei");
    questions.add(question);

    question = new Question("Are you renowned across the globe for your " +
        "beauty and do you have the power or money to make people happy?");
    question.addPokemonYes("Ho-oh");
    questions.add(question);

    question = new Question("Are you the kind of person to never turn down " +
        "dares no matter how stupid or dangerous they are, or have you " +
        "learned a martial art?");
    question.addPokemonYes("Infernape");
    question.addPokemonNo("Monferno");
    questions.add(question);

    question = new Question("Do you perform better when under pressure or " +
        "when stakes are high?");
    question.addPokemonYes("Fireix");
    questions.add(question);

    question = new Question("Have you studied or have came up with theories" +
        " on how to feasibly construct a time machine?");
    question.addPokemonYes("Dialga");
    questions.add(question);

    question = new Question("Are you famous because of your ability as a " +
        "fighter or for your endurance, and do you have battle scars or " +
        "injuries from your experiences?");
    question.addPokemonYes("Heatran");
    questions.add(question);
    
    question = new Question("Are you either a man with a rather large or " +
        "extravagent beard, or are you a woman who finds beards attractive?");
    question.addPokemonYes("Emboar");
    question.addPokemonNo("Pignite");
    questions.add(question);
     
    question = new Question("Are your manners or way of speaking refined " +
        "compared to most of your peers, and do you consider yourself of " +
        "\"the elite\"?");
    question.addPokemonYes("Chandelure");
    question.addPokemonNo("Lampent");
    questions.add(question);
     
    question = new Question("Does your calm or gentle personality betray " +
        "an inner fire or strong willpower that has the power to do anything?");
    question.addPokemonYes("Reshiram");
    questions.add(question);


    fireFrame = new JFrame("FIRE TYPE QUIZ");
    fireFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    firePanel = new FireTypeQuizGUI();
    fireFrame.add(firePanel);
    fireFrame.pack();
    fireFrame.setVisible(true);
   }
}

