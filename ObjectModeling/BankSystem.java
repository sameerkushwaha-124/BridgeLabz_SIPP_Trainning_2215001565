// Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
// Tasks:
// Define a Bank class and a Customer class.
// Use an association relationship to show that each customer has an account in a bank.
// Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
// Goal: Illustrate association by setting up a relationship between customers and the bank.

public class BankSystem {
    static class Bank {
        private String name;
        private ArrayList<Customer> customers;

        Bank(String name) {
            this.name = name;
            this.customers = new ArrayList<>();
        }

        public void openAccount(Customer customer) {
            customers.add(customer);
            System.out.println("Account opened for: " + customer.getName() + " at " + name);
        }

        public void displayCustomers() {
            System.out.println("Bank: " + name);
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName() + ", Account Number: " + customer.getAccountNumber() + ", Balance: " + customer.getBalance());
            }
        }
    };
    static class Customer {
        private String name;
        private String accountNumber;
        private double balance;

        Customer(String name, String accountNumber, double initialBalance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public String getName() {
            return name;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    };


    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", "123456789", 1000.0);
        Customer customer2 = new Customer("Bob", "987654321", 500.0);

        Bank bank = new Bank("Global Bank");
        bank.openAccount(customer1);
        bank.openAccount(customer2);
        bank.displayCustomers();
        customer1.deposit(200.0);
        customer1.withdraw(150.0);
    }
}