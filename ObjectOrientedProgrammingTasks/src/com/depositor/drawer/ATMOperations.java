package com.depositor.drawer;

import javax.swing.*;

public class ATMOperations {
    private final Account account;

    public ATMOperations(Account account) {
        this.account = account;
    }

    public void start() {
        while (true) {
            String[] options = {"Check Balance", "Deposit", "Withdraw", "Logout"};
            int choice = JOptionPane.showOptionDialog(
                null, "Select an option:", "User Panel",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]
            );

            switch (choice) {
                case 0 -> checkBalance();
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Logged out successfully.");
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid option.");
            }
        }
    }

    private void checkBalance() {
        JOptionPane.showMessageDialog(null, "Current Balance: ₹" + account.getBalance());
    }

    private void deposit() {
        String input = JOptionPane.showInputDialog("Enter deposit amount:");
        try {
            int amount = Integer.parseInt(input);
            if (amount > 0) {
                account.deposit(amount);
                JOptionPane.showMessageDialog(null, "Deposit successful. New Balance: ₹" + account.getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Enter a valid amount.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }

    private void withdraw() {
        String input = JOptionPane.showInputDialog("Enter withdrawal amount:");
        try {
            int amount = Integer.parseInt(input);
            if (amount > 0 && amount <= account.getBalance()) {
                account.withdraw(amount);
                JOptionPane.showMessageDialog(null, "Withdrawal successful. Remaining Balance: ₹" + account.getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Invalid amount or insufficient balance.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }
}

