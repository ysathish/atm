package com.depositor.drawer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ATMSystem {
    private static final String FILE_NAME = "accounts.txt";
    private List<Account> accounts = new ArrayList<>();

    public ATMSystem() {
        loadAccountsFromFile();
    }
    public List<Account> getAccounts() {
        return accounts;
    }

    // Add a new account
    public boolean addAccount(String username, String password) {
        if (findAccount(username) != null) {
            System.out.println("Account already exists for username: " + username);
            return false;
        }
        Account account = new Account(username, password);
        accounts.add(account);
        saveAccountsToFile();
        System.out.println("Account for " + username + " added successfully.");
        return true;
    }

    // Find an account by username
    public Account findAccount(String username) {
        for (Account account : accounts) {
            if (account != null && account.authenticate(username, "")) {
                return account;
            }
        }
        return null;
    }

    // Authenticate account
    public Account authenticate(String username, String password) {
        for (Account account : accounts) {
            if (account != null && account.authenticate(username, password)) {
                return account;
            }
        }
        return null;
    }

    // Remove an account
    public boolean removeAccount(String username) {
        Account account = findAccount(username);
        if (account != null) {
            accounts.remove(account);
            saveAccountsToFile();
            System.out.println("Account for " + username + " removed successfully.");
            return true;
        }
        System.out.println("Account not found.");
        return false;
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("Accounts in the system:");
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("- " + account.getUsername());
            }
        }
    }

    // Save accounts to file
    private void saveAccountsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Account account : accounts) {
                writer.write(account.getUsername() + "," + account.getPassword());
                writer.newLine();
            }
            System.out.println("Accounts saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving accounts to file: " + e.getMessage());
        }
    }

    // Load accounts from file
    private void loadAccountsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    accounts.add(new Account(parts[0], parts[1]));
                }
            }
            System.out.println("Accounts loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing accounts file found. Starting fresh.");
        } catch (IOException e) {
            System.err.println("Error loading accounts from file: " + e.getMessage());
        }
    }
}



