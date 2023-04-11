package cz.czechitas.ukol6;


import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aplikace extends JFrame {

    private JLabel husyLabel;
    private JLabel kraliciLabel;
    private JLabel pocethlavLabel;
    private JLabel pocetnohouLabel;
    private JTextField husyField;
    private JTextField kraliciField;
    private JTextField pocethlavField;
    private JTextField pocetnohouField;

    private JButton vypocitatButton;


    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Aplikace().start();
    }

    public Aplikace() throws HeadlessException {
        super("Farmářka 1.0");
        this.init();
    }

    public void start() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Aplikace.class.getResource("czechitas-icon.png")).getImage());
        setLayout(new MigLayout("wrap 2", "[right]rel[50:120:150,grow,fill]"));
        setMinimumSize(new Dimension(250, 200));

        //TODO implementovat formulář podle zadání

        husyField = new JTextField();
        husyLabel = new JLabel("Husy");
        husyLabel.setDisplayedMnemonic('H');
        husyLabel.setLabelFor(husyField);
        add(husyLabel);
        add(husyField);

        kraliciField = new JTextField();
        kraliciLabel = new JLabel("Králici");
        kraliciLabel.setDisplayedMnemonic('K');
        kraliciLabel.setLabelFor(kraliciField);
        add(kraliciLabel);
        add(kraliciField);

        add(createButtonBar(), "span");

        pack();

        getRootPane().setDefaultButton(vypocitatButton);

        vypocitatButton.addActionListener(this::handleVypocitat);

        pocethlavField = new JTextField();
        pocethlavLabel = new JLabel("Počet hlav");
        pocethlavLabel.setEnabled(false);
        pocethlavLabel.setLabelFor(pocethlavField);
        add(pocethlavLabel);
        add(pocethlavField);

        pocetnohouField = new JTextField();
        pocetnohouLabel = new JLabel("Počet nohou");
        pocetnohouLabel.setEnabled(false);
        pocetnohouLabel.setLabelFor(pocetnohouField);
        add(pocetnohouLabel);
        add(pocetnohouField);

        JPanel buttonBar = new JPanel(new MigLayout(null, "[right, grow]"));

    }

    private JPanel createButtonBar() {
        vypocitatButton = new JButton("Vypocitat");
        vypocitatButton.setMnemonic('V');

        JPanel buttonBar = new JPanel(new MigLayout(null, "[right, grow]"));
        buttonBar.add(vypocitatButton);
        return buttonBar;
    }

    private void handleVypocitat(ActionEvent actionEvent) {
        // metoda vypoctu
    }
}
