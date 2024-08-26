import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rizz {
    // Attributes
    private String name;
    private int age;
    private double rizzStrength;
    private boolean rizzByDefault;
    private double version;
    private String description;

    // Default Constructor
    public Rizz() {
        this.name = "Default Rizzler";
        this.age = 17;
        this.rizzStrength = 900.0;
        this.rizzByDefault = true;
        this.version = 0.0;
        this.description = "Default object constructor rizzes by default";
    }

    // Parameterized Constructor
    public Rizz(String name, int age, double rizzStrength, boolean rizzByDefault, double version, String description) {
        this.name = name;
        this.age = age;
        this.rizzStrength = rizzStrength;
        this.rizzByDefault = rizzByDefault;
        this.version = version;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRizzStrength() {
        return rizzStrength;
    }

    public void setRizzStrength(double rizzStrength) {
        this.rizzStrength = rizzStrength;
    }

    public boolean getRizzByDefault() {
        return rizzByDefault;
    }

    public void setRizzByDefault(boolean rizzByDefault) {
        this.rizzByDefault = rizzByDefault;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame rizzFrame = new JFrame("Rizzler Control Panel");
        rizzFrame.setSize(1300, 2000);
        rizzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rizzFrame.setResizable(true);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(1300, 1300)); // Initial size

        // Rizz GUI Title
        JLabel label = new JLabel("Control Panel Window");
        label.setBounds(20, 20, 450, 50);
        label.setFont(new Font("Serif", Font.BOLD, 45));
        panel.add(label);

        // Default Rizzler Info (Initially Hidden)
        String defaultRizzler = "<html> <b>Default Rizz Object:</b><br/>Name: Default Rizzler<br/>Age: 17<br/>Rizz Strength: 900<br/>Rizz By Default: True<br/>Version: 0.1<br/>Description: Default System Rizz Object";
        JLabel defaultRizzlerLabel = new JLabel(defaultRizzler);
        defaultRizzlerLabel.setBounds(20, 100, 1200, 300);
        defaultRizzlerLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        defaultRizzlerLabel.setVisible(false);
        panel.add(defaultRizzlerLabel);

        // Rizzler Default Button
        JButton rizzlerButton = new JButton("System Default");
        rizzlerButton.setBounds(20, 95, 160, 50);
        rizzlerButton.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(rizzlerButton);

        // Action Listener
        rizzlerButton.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible;
                defaultRizzlerLabel.setVisible(isVisible);
            }
        });

        // Wrap the panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        rizzFrame.add(scrollPane);

        // Rizzler 1 Button
        JButton rizzler1Button = new JButton("Rizzler 1");
        rizzler1Button.setBounds(20, 360, 160, 50);
        rizzler1Button.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(rizzler1Button);

        // Rizzler 1 Info (Initially Hidden)
        String rizzler1 = "<html><b>Rizzler 1:</b><br/>Rizzler 1 cannot be accessed at the moment.";
        JLabel rizzler1Label = new JLabel(rizzler1);
        rizzler1Label.setBounds(20, 425, 160, 115);
        rizzler1Label.setFont(new Font("Serif", Font.PLAIN, 20));
        rizzler1Label.setVisible(false);
        panel.add(rizzler1Label);

        // Action Listener
        rizzler1Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible;
                rizzler1Label.setVisible(isVisible);
            }
        });

        // Rizzler 2 Button
        JButton rizzler2Button = new JButton("Rizzler 2");
        rizzler2Button.setBounds(20, 550, 160, 50);
        rizzler2Button.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(rizzler2Button);

        // Rizzler 2 Info (Initially Hidden)
        String rizzler2 = "<html><b>Rizzler 2:</b><br/>Womp womp lil jit.";
        JLabel rizzler2Label = new JLabel(rizzler2);
        rizzler2Label.setBounds(20, 595, 160, 115);
        rizzler2Label.setFont(new Font("Serif", Font.PLAIN, 20));
        rizzler2Label.setVisible(false);
        panel.add(rizzler2Label);

        // Action Listener
        rizzler2Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible =!isVisible;
                rizzler2Label.setVisible(isVisible);
            }
        });

        // Rizzler 3 Button
        JButton rizzler3Button = new JButton("Rizzler 3");
        rizzler3Button.setBounds(20, 720, 160, 50);
        rizzler3Button.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(rizzler3Button);

        // Rizzler 3 Info (Initially Hidden)
        String rizzler3 = "<html> <b>Rizzler 3:</b><br/>Name: ConnyGuy 101<br/>Age: 17<br/>Rizz Strength: 1000<br/>Rizz By Default: True<br/>Version: 24.0<br/>Description: This guy is full of rizz!";
        JLabel rizzler3Label = new JLabel(rizzler3);
        rizzler3Label.setBounds(20, 755, 350, 235);
        rizzler3Label.setFont(new Font("Serif", Font.PLAIN, 20));
        rizzler3Label.setVisible(false);
        panel.add(rizzler3Label);

        // Action Listener
        rizzler3Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible =!isVisible;
                rizzler3Label.setVisible(isVisible);
            }
        });

        // Set the frame visible at the end
        rizzFrame.setVisible(true);
    }
}

