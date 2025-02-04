package com.depositor.drawer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ATMFrame extends JFrame {
    private ATMSystem atmSystem = new ATMSystem();

    public ATMFrame() {
        setupFrame();
        showRoleSelection();
    }

    private void setupFrame() {
        setTitle("ATM System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void showRoleSelection() {
        String[] options = {"Admin", "User", "Exit"};
        int choice = JOptionPane.showOptionDialog(
            this, "Select your role:", "ATM System",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            null, options, options[0]
        );

        switch (choice) {
            case 0 -> authenticateAdmin();
            case 1 -> authenticateUser();
            case 2 -> System.exit(0);
            default -> showRoleSelection();
        }
    }

    private void authenticateAdmin() {
        String adminUsername = JOptionPane.showInputDialog("Admin Username:");
        String adminPassword = JOptionPane.showInputDialog("Admin Password:");

        if ("admin".equals(adminUsername) && "admin123".equals(adminPassword)) {
            new AdminPanel(atmSystem).showAdminPanel();
            showRoleSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid admin credentials.");
            showRoleSelection();
        }
    }

    private void authenticateUser() {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");

        Account account = atmSystem.authenticate(username, password);
        if (account != null) {
            new ATMOperations(account).start();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid user credentials.");
            showRoleSelection();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ATMFrame().setVisible(true));
    }
}
