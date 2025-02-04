package com.depositor.drawer;

import java.util.List;

import javax.swing.*;

public class AdminPanel {
    private ATMSystem atmSystem;

    public AdminPanel(ATMSystem atmSystem) {
        this.atmSystem = atmSystem;
    }

    public void showAdminPanel() {
        while (true) {
            String[] options = {"Add User", "View Users", "Remove User", "Logout"};
            int choice = JOptionPane.showOptionDialog(
                null, "Select an option:", "Admin Panel",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]
            );

            switch (choice) {
                case 0 -> addUser();
                case 1 -> viewUsers();
                case 2 -> removeUser();
                case 3 -> {
                    System.out.println("Admin logged out.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void addUser() {
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        if (atmSystem.addAccount(username, password)) {
            JOptionPane.showMessageDialog(null, "User added successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add user.");
        }
    }

    private void viewUsers() {
        StringBuilder userList = new StringBuilder("Users:\n");
        List<Account> accounts = atmSystem.getAccounts(); // Use getter
        for (Account account : accounts) {
            if (account != null) {
                userList.append("- ").append(account.getUsername()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, userList.toString());
    }

    private void removeUser() {
        String username = JOptionPane.showInputDialog("Enter username to remove:");
        if (atmSystem.removeAccount(username)) {
            JOptionPane.showMessageDialog(null, "User removed successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to remove user.");
        }
    }
}


