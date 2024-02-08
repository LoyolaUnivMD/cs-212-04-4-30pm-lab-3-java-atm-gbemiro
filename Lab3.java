// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

class Lab3 {

    // Initiating attributes
    private String name;
    private double balance;
    private char transaction;

    // General Constructor
    public Lab3(String name, double balance) {

        this.name = name;
        this.balance = balance;
        this.transaction = 'N';

    }

    // Default Constructor
    public Lab3() {

        this.name = "Unknown";
        this.balance = 212.90;
        this.transaction = 'N';

    }

    // Crating tool for user input
    Scanner input = new Scanner(System.in);


    // Methods

    public char getTransaction() {

        // Creating list of options for user input
        char[] transactionOptions = {'D', 'W', 'C', 'E'};

        // Outputting options to the user
        System.out.println("Hi " + name + ", what can this RO Bank's ATM do for you today?\n");
        System.out.println("  D eposit");
        System.out.println("  W ithdraw");
        System.out.println("  C heck balance");
        System.out.println("  E xit");
        System.out.println();

        // Initializing veriables for error checking
        char temporaryTransaction;
        boolean validInput = true;

        // Getting first input
        temporaryTransaction = input.next().toUpperCase().charAt(0);

        // Checking input
        for(int i = 0; i < transactionOptions.length; i++) {validInput = validInput && (temporaryTransaction != transactionOptions[i]);}

        // Prompt again while input is invalid
        while (validInput) {

            // Prompting the user again
            System.out.println("Please select one of the following options:\n");
            System.out.println("  D eposit");
            System.out.println("  W ithdraw");
            System.out.println("  C heck balance");
            System.out.println("  E xit");
            System.out.println();

            // Getting input again
            temporaryTransaction = input.next().toUpperCase().charAt(0);

            // Checking input
            validInput = true;
            for(int i = 0; i < transactionOptions.length; i++) {validInput = validInput && (temporaryTransaction != transactionOptions[i]);}
        }

        // Saving into the class' variables
        transaction = temporaryTransaction;
        return transaction;

    }

    public double deposit(double amount) {
        // Adding the desired amount to balance
        balance += amount;
        // Letting the user know the transaction worked
        System.out.println("\n--------------------------------------------$--------------------------------------------\n ~ The ATM has accepted your deposit of $" + amount + ", and your account balance has been updated.\n--------------------------------------------$--------------------------------------------\n");
        // Returning updated balance
        return balance;
    }

    public double withdraw(double amount) {
        // Subtracting the desired amount to balance
        balance -= amount;
        // Letting the user know the transaction worked
        System.out.println("\n--------------------------------------------$--------------------------------------------\n ~ You have withdrawn $" + amount + ", and your account balance has been updated.\n--------------------------------------------$--------------------------------------------\n");
        // Returning updated balance
        return balance;
    }

    public void checkBalance() {
        System.out.println("\n--------------------------------------------$--------------------------------------------\n ~ Your current balance is: $" + String.format("%.2f", balance) + "\n--------------------------------------------$--------------------------------------------\n"); // Outputs current balance
    }

    public double getPositiveNum(String prompt) {
        // Initializing variables
        double num = -1.0;
        String numStr;
        boolean invalid = true;

        // Prompt again while input is invalid
        while (num < 0.0) {
            while (invalid) {
                // Prompting user
                System.out.println(prompt);
                // Getting input
                numStr = input.next();
                // Trying to convert input
                try {num = Double.parseDouble(numStr); invalid = false;}
                // If the conversion fails then the input is invalid and the user is prompted again
                catch(Exception NotADouble) {invalid = true;}
            }
        }
        // Returning input
        return num;
    }

    public static void main(String[] args) {

        // Creating tool for user input... again -.-
        Scanner input = new Scanner(System.in);

        // Creating the class for user
        Lab3 user = new Lab3();

        // Getting user's name
        System.out.print("Please input your name: ");
        user.name = input.next();

        // Beginning ATM procedure
        System.out.println("\n--------------------------------------------$--------------------------------------------\n");
        System.out.println("                                     RO Bank's ATM\n");

        // The user is prompted until they choose to exit
        while(user.transaction != 'E') {
            // User is prompted; the switch acts accordingly to the user's choice
            switch(user.getTransaction()) {
                case 'D':
                    // Stating the user's choice
                    System.out.println("\nYou have selected deposit.");
                    // Asking for amount and updating balance
                    user.deposit(user.getPositiveNum("How much do you wish to deposit?"));
                    break;
                case 'W':
                    // Stating the user's choice
                    System.out.println("\nYou have selected withdraw.");
                    // Asking for amount and updating balance
                    user.withdraw(user.getPositiveNum("How much do you wish to withdraw?"));
                    break;
                case 'C':
                    // Outputting balance
                    user.checkBalance();
                    break;
            }
        }
    }
}
