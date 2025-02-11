import java.util.*;

public class Bank {
    Scanner scnr = new Scanner(System.in);
    private String client;
    private double amount;
    private String transactionType;
    private double[] deposit;
    private double[] withdrawal;
    private String completionCheck;
    private double[] deposits;
    private double[] withdrawals;

    public Bank(String client, double amount,String transactionType, double[] deposit, 
    double[] withdrawal, String completionCheck){
        this.deposit = new double[10];
        this.client = client;
        this.amount = amount;
        this.transactionType = transactionType;
        this.deposit = deposit;
        this.withdrawal = new double[10];
        this.withdrawal = withdrawal;
        this.completionCheck = completionCheck;
    }

    public Bank(){
        this.deposit = new double[10];
        this.withdrawal = new double[10];
       
    }

    public String getClient(){
        return this.client;
    }

    public void setClient(String client){
        this.client = client;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getTransactionType(){
        return transactionType;
    }

    public void setTransactionType(String transactionType){
        this.transactionType = transactionType;
    }

    public double[] getDeposit(){
        return deposit;
    }

    public void setDeposit(double[] deposit){
        this.deposit = deposit;
    }

    public double[] getWithdrawal(){
        return withdrawal;
    }

    public void setWithdrawal(double[] withdrawal){
        this.withdrawal = withdrawal;
    }

    public String getCompletionCheck(){
        return completionCheck;
    }

    public void setCompletionCheck(String completionCheck){
        this.completionCheck = completionCheck;
    }

    public double[] getDeposits(){
        return deposits;
    }

    public void setDeposits(double[] deposits){
        this.deposits = deposits;
    }

    public String Greeting(){
        System.out.println("Welcome to our bank! May I please have your name. ");
        client = scnr.nextLine();
        System.out.println("Hello " + client + "! Are you making a deposit or withdrawal with us today? \n(Enter d for deposit or w for withdawal)");
        transactionType = scnr.nextLine();
        return this.transactionType;
    }

    public double directTransaction(String transactionType){
        if (transactionType.equalsIgnoreCase("d")){
            System.out.println("How much will you be depositing with us today?");
            amount = scnr.nextDouble();
            Deposits(amount);
        }
        else if(transactionType.equalsIgnoreCase("w")){
            System.out.println("How much will you be withdrawing from us today?");
            amount = scnr.nextDouble();
            Withdrawals(amount);
        }
        return amount;
    }
    int j = 0;
    public void Deposits(double amount){
        
        if(transactionType.equalsIgnoreCase("d")){
            deposits = Arrays.copyOf(deposit, deposit.length);
            deposits[j] = amount;
            j++;
            for(int i = 0; i < deposits.length; i++){
                deposit[i] = deposits[i];
            }
        }
        concludeTransaction(client);
    }

    public void Withdrawals(double amount){
        
        if (transactionType.equalsIgnoreCase("w")){
            withdrawals = Arrays.copyOf(withdrawal, withdrawal.length);
            withdrawals[j] = amount  * -1;
            j++;
            for (int i = 0; i < withdrawals.length; i++){
                withdrawal[i] = withdrawals[i];
            }
        }
        concludeTransaction(client);
    }
    
    public void concludeTransaction(String client){
        scnr.nextLine();
        System.out.println("Transaction complete! Is there anything else I can help you with today?(y/n)");
        completionCheck = scnr.nextLine();
        if (completionCheck.equalsIgnoreCase("Y")){
            System.out.println("Sure. Would you like to make a deposit or withdrawal?\n(Enter d for deposit of w for withdrawal)");
            transactionType = scnr.nextLine();
            directTransaction(transactionType);
        }
        else if (completionCheck.equalsIgnoreCase("N")){
            System.out.println("OK " + client + ". Here are you latest transactions. As always we appreciate your business. \nThank you for banking with us. Have a nice day!\n");
        }
    }

    public void listInteractions(){
        double depositSum = 0;
        double withdrawalSum = 0;
        for (int i = 0; i <= deposits.length -1; i++){
            if ((deposit[i] > 0) || (withdrawal[i] < 0)){
                System.out.print("Transaction " + (i+1));
            }
            if (deposit[i] > 0){
                System.out.printf(": $%.2f Deposit\n", deposit[i]);
                depositSum += deposit[i];
            }
            if(withdrawal[i] < 0){
                System.out.printf(": -$%.2f Withdrawal\n", (withdrawal[i] * -1));
                withdrawalSum += withdrawal[i];
            }
        }
        double sum = depositSum + withdrawalSum;
        System.out.printf("Balance: $%.2f\n", sum);
        if(sum < 0){
            System.out.println("Account Overdrawn!");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        String transType = bank.Greeting();

        System.out.println("Absolutely, " + bank.getClient() + "! I'd be happy to help you with that today.");
        
        bank.directTransaction(transType);
      
        bank.listInteractions();
    }

}


