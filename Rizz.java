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
        // Rizz GUI
        JFrame rizzFrame = new JFrame("Rizzler Control Panel");
        rizzFrame.setSize(1300, 900);
        rizzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rizzFrame.setLayout(null);
        rizzFrame.setResizable(true);

        // Rizz GUI Title
        JLabel label = new JLabel("Control Panel");
        label.setBounds(20, 20, 350, 50);
        rizzFrame.add(label);
        label.setFont(new Font("sans-serif", Font.BOLD, 45));

        // Default Rizzler Info (Initally Hidden)
        String defaultRizzler = "<html> <b> Default Rizz Object: </b> <br/> Name: Default Rizzler <br/> Age: 17 <br/> Rizz Strength: 900 <br/> Rizz By Default: True <br/> Version: 0.0 <br/> Description: Default System Rizz Object";
        JLabel defaultRizzlerLabel = new JLabel(defaultRizzler);
        defaultRizzlerLabel.setBounds(20, 100, 1200, 300);
        defaultRizzlerLabel.setFont(new Font("sans-serif", Font.PLAIN, 20));
        defaultRizzlerLabel.setVisible(false);
        rizzFrame.add(defaultRizzlerLabel);

        // Rizzler Default Button
        JButton rizzlerButton = new JButton("System Default Info");
        rizzlerButton.setBounds(20, 95, 160, 50);
        rizzFrame.add(rizzlerButton);

        // Action Listener
        rizzlerButton.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible;
                defaultRizzlerLabel.setVisible(isVisible);
            }
        });

        // Always have this GUI line at the below all other GUI code lines!
        rizzFrame.setVisible(true);

    }
}