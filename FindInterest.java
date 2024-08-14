import java.util.Scanner;

public class FindInterest {
    public static void main(String[] args) {
        int a,noofYr;
        double b, c;
  
        Scanner scaner = new Scanner(System.in);
        a = scaner.nextInt();
        b = scaner.nextDouble();
        c = scaner.nextDouble();
        noofYr = scaner.nextInt();
        Account account = new Account(a, b, c);
       double answer = calculateInterest(account, noofYr);
System.out.format("%.3f",answer);
}
public static double calculateInterest(Account account, int noOfYear)
{
double temp = noOfYear * account.getInterestRate() / 100;
return (account.getBalance() * (account.getInterestRate()+temp) / 100);
}
    }
    


class Account {
    int id;
    double balance;
    double interestRate;

    Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate=interestRate;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
}