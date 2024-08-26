// Imported Packages
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.io.File;


// Rizz Class
public class Rizz {
    // Attributes
    private String name;
    private int age;
    private double rizzStrength;
    private boolean rizzByDefault;
    private double version;
    private String description;

    // Default Constuctor
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
        rizzFrame.setSize(1300, 1300);
        rizzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rizzFrame.setResizable(true);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(1300, 900)); // Initial size

        // Rizz GUI Title
        JLabel label = new JLabel("Control Panel");
        label.setBounds(20, 20, 350, 50);
        panel.add(label);
        label.setFont(new Font("sans-serif", Font.BOLD, 45));

        // Default Rizzler Info (Initially Hidden)
        String defaultRizzler = "<html> <b> Default Rizz Object: </b> <br/> Name: Default Rizzler <br/> Age: 17 <br/> Rizz Strength: 900 <br/> Rizz By Default: True <br/> Version: 0.0 <br/> Description: Default System Rizz Object";
        JLabel defaultRizzlerLabel = new JLabel(defaultRizzler);
        defaultRizzlerLabel.setBounds(20, 100, 1200, 300);
        defaultRizzlerLabel.setFont(new Font("sans-serif", Font.PLAIN, 20));
        defaultRizzlerLabel.setVisible(false);
        panel.add(defaultRizzlerLabel);

        // Rizzler Default Button
        JButton rizzlerButton = new JButton("System Default Info");
        rizzlerButton.setBounds(20, 95, 160, 50);
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
        panel.add(rizzler1Button);

        // Rizzler 1 Info (Initally Hidden)
        String rizzler1 = "<html> <b> Rizzler 1: </b> <br/> Rizzler 1 cannot be accessed at the moment.";
        JLabel rizzler1Label = new JLabel(rizzler1);
        rizzler1Label.setBounds(20, 425, 160, 95);
        rizzler1Label.setFont(new Font("sans-serif", Font.PLAIN, 20));
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


        // Set the frame visible at the end
        rizzFrame.setVisible(true);
    }
}