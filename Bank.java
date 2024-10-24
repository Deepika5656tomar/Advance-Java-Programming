public class Bank {
    //Instance Variable to store account amount
    public double amount;
    //Parameterized constructor to initialize the amount.
    Bank(double amount){
        this.amount=amount;
    }
    //method to withdraw amount
    void withdraw(double withdrawalAmt){
        //using ternary operator to check if the balance is sufficient or not
        System.out.println((amount>=withdrawalAmt)?"Withdraw Succesful":"Insufficient balance");
        amount=(amount>=withdrawalAmt)?amount-withdrawalAmt:amount;
    }
    //method to deposit amount
    void deposit(double depositAmt){
        amount+=depositAmt;
        System.out.println("Deposit successful.");
    }
    //method to display the current amount 
    void printAmt(){
        System.out.println("Total Balance: "+amount);
    }
    public static void main(String[] args) {
        //create a bank object with initial balance of 10000
        Bank acc=new Bank(10000);
        //withdram 3000
        acc.withdraw(3000);
        //deposit 5000
        acc.deposit(5000);
        //display the amount
        acc.printAmt();
    } 
}
