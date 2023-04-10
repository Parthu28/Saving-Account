	public class SavingsAccount
 {
   private double annualInterestRate;
   private double balance;
   private double totalInterest;
   double monthlyInterest;

   public void withDraw(double amount){    //withdraw money:
    balance = balance - amount;
    }

   public void deposit(double amount){    //deposit money:
        balance = balance + amount;
    }

    public double getBalance(){           // method to get balance and return balance:
        return balance;
	}


     public double addMonthlyInterest(){    // method add monthly interest rate:
		 monthlyInterest = ((annualInterestRate /12) * balance * 100);
         balance =  balance + monthlyInterest;
       return monthlyInterest;
     }
    public void setAnnualInterestRate(double annualRate){   // annual interest rate:
		annualInterestRate = annualRate / 100;

    }
     public  SavingsAccount(double startingBalance){
        balance = startingBalance;

   }
    }