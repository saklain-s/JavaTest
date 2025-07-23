package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class time extends JFrame {

    private int time = 0;              // Time in seconds
    private boolean running = false;   // State of stopwatch (running or not)
    private JLabel timeLabel;          // Label to display com.practice.time
    private Timer timer;               // Timer object to update the stopwatch

    public time() {
        setTitle("Stopwatch");
        setSize(250, 100);              // Window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);    // Center the window
        setAlwaysOnTop(true);           // Always on top of other windows

        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        add(timeLabel);

        // Start button
        JButton startButton = new JButton("▶");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });
        add(startButton);

        // Stop button
        JButton stopButton = new JButton("⏸");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });
        add(stopButton);

        // Reset button
        JButton resetButton = new JButton("⏹");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        add(resetButton);

        // Timer to update com.practice.time every second
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    time++;
                    updateTimeLabel();
                }
            }
        });

        setVisible(true);
    }

    // Method to start the stopwatch
    public void start() {
        running = true;
        timer.start();
    }

    // Method to stop the stopwatch
    public void stop() {
        running = false;
        timer.stop();
    }

    // Method to reset the stopwatch
    public void reset() {
        running = false;
        time = 0;
        updateTimeLabel();
        timer.stop();
    }

    // Method to update the com.practice.time display
    public void updateTimeLabel() {
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        new time();
    }
}
