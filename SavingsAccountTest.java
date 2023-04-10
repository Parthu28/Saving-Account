import java.util.Scanner;
 public class SavingsAccountTest
 {
   public static void main(String[]args)
    {

     Scanner scanner = new Scanner(System.in);

     double annualInterestRate;
     double startingBalance;
     int numberOfMonths;
     double depositAmount;
     double withdrawAmount;
     double totalDeposits = 0;
     double totalWithdrawals = 0;
     double totalInterestEarned = 0;

     System.out.println("Please enter the Starting Balance Rate:");
     startingBalance = scanner.nextDouble();

     System.out.println("Please enter the Annual Intrest Rate:");
     annualInterestRate = scanner.nextDouble();

     System.out.println("Please enter the Number Of Months:");
     numberOfMonths = scanner.nextInt();

     SavingsAccount account1 = new SavingsAccount( startingBalance );
     account1.setAnnualInterestRate( annualInterestRate );

     for(int month = 1; month <= numberOfMonths; month++) {       // number of months:
		 System.out.println("Please enter the deposit amount of the month:" + month );
		  depositAmount= scanner.nextDouble();
		  totalDeposits = totalDeposits + depositAmount;

	     account1.deposit( depositAmount );

	      System.out.println("Please enter the withdrawal amount of the month:" + month );
		  withdrawAmount= scanner.nextDouble();
		  totalWithdrawals = totalWithdrawals + withdrawAmount;

		   account1.withDraw( withdrawAmount );
	       totalInterestEarned = totalInterestEarned + account1.addMonthlyInterest();
	 }
	 System.out.println(" The final balance at the end of: $ " + numberOfMonths + " months is " +	account1.getBalance());
      System.out.println(" The total amount of deposits: $ " + totalDeposits);
    System.out.println(" The total amount of withdrawals: $ " + totalWithdrawals);
    System.out.println(" The total interest earned: $ " + totalInterestEarned);

}
}