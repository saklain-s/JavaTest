package com.arrays;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Array2 extends JFrame {
    private final JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public Array2() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a label to display time
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        // Format for displaying time
        timeFormat = new SimpleDateFormat("HH:mm:ss");

        // Timer to update time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        setVisible(true);
    }

    private void updateTime() {
        String currentTime = timeFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Array2::new);
    }
}
