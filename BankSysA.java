//package SecondQuestion;

import java.util.Scanner;

public class BankSysA {
    private String name;
    private Double balance;

    public BankSysA(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Double depositMoney(Double amount) {
        balance += amount;
        return balance;
    }

    public Double withdrawMoney(Double amount) {
        if (balance == null) {
            System.out.println("Error: Account balance is null.");
            return 0.0;
        }
        if (balance - amount < 0) {
            System.out.println("Error: Insufficient funds to withdraw.");
            return 0.0;
        }
        return balance -= amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankSysA account = null;
        String choice = "";

        while (!choice.equals("4")) {
            System.out.println("Welcome to the bank system. Please choose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display My Balance");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    Double balance = scanner.nextDouble();
                    scanner.nextLine();
                    account = new BankSysA(name, balance);
                    System.out.println("Account created successfully.");
                    break;
                case "2":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    Double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.depositMoney(depositAmount);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;
                case "3":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    Double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdrawMoney(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                    break;
                 case "4":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;    
                case "5":
                    System.out.println("Exiting bank system. Goodbye!");
                    break;
               
                default:
                    System.out.println("Error: Invalid choice. Please choose again.");
            }
        }
    }
}
package SecondQuestion;

import java.util.Scanner;

public class BankSysA {
    private String name;
    private Double balance;

    public BankSysA(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public Double depositMoney(Double amount) {
        balance += amount;
        return balance;
    }

    public Double withdrawMoney(Double amount) {
        if (balance == null) {
            System.out.println("Error: Account balance is null.");
            return 0.0;
        }
        if (balance - amount < 0) {
            System.out.println("Error: Insufficient funds to withdraw.");
            return 0.0;
        }
        return balance -= amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankSysA account = null;
        String choice = "";

        while (!choice.equals("4")) {
            System.out.println("Welcome to the bank system. Please choose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display My Balance");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    Double balance = scanner.nextDouble();
                    scanner.nextLine();
                    account = new BankSysA(name, balance);
                    System.out.println("Account created successfully.");
                    break;
                case "2":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    Double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.depositMoney(depositAmount);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;
                case "3":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    Double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdrawMoney(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                    break;
                 case "4":
                    if (account == null) {
                        System.out.println("Error: No account created yet.");
                        break;
                    }
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;    
                case "5":
                    System.out.println("Exiting bank system. Goodbye!");
                    break;
               
                default:
                    System.out.println("Error: Invalid choice. Please choose again.");
            }
        }
    }
}
