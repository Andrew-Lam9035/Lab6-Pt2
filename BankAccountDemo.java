import java.util.Scanner;
/**
*
* Gets input from users on whether to use useWholeDollarMode or 
* useCurrencyMode (double/decimal) with either a 1 or 2 respectively
* If the user doesn't enter a 1 or 2, then ask again until they 
* enter a 1 or 2.
* 
* @author Andrew Lam, alam001@student.sdccd.edu
* @version v1.0
* @since 9/27/2026
*/

public class BankAccountDemo //Update to Main for Replit or MyProgram for codeHS
{
public static void main (String[] args){
//Create necessary code that forces a 1 or 2 input
//if user selects 1, call useWholeDollarMode()
//else call useCurrencyMode()
int bankInput;

Scanner keyboard = new Scanner(System.in);

do{
System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
bankInput = keyboard.nextInt();

if (bankInput == 1){
    useWholeDollarMode();
}
else if (bankInput == 2){
    useCurrencyMode();
}

}while(bankInput != 1 && bankInput != 2);

//Do while loop to ask user until the enter 1 or 2.
}

//used for menu option 1

/**
* useWholeDollarMode asks the user for the starting balance, the
interest, and the number of months to
* process. A BankAccount object is created with balance and
interest rates as args.
* A loop runs based on number of months to process. For each month
deposits, withdraws,
* and interest rate is calculated. After the loop processes, ending
balance, total deposits,
* total withdraws, and total interest is displayed.
*/
public static void useWholeDollarMode(){
    
Scanner keyboard = new Scanner(System.in);
//Create Scanner object

System.out.print("What is your starting balance: $");
int balance = keyboard.nextInt();

System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
double intRate = keyboard.nextDouble();

System.out.print("How many months do you want to calculate? ");
int counter = keyboard.nextInt();

System.out.println("===============================");
//formatting

BankAccount bankAccount = new BankAccount(balance, intRate);
//creates new BankAccount object to use BankAccount methods

for(int i=1;i<=counter;i++)
{
    System.out.print("Enter Month " + i + " deposits $");
    bankAccount.makeDeposit(keyboard.nextInt());
    System.out.print("Enter Month " + i + " withdraws $");
    bankAccount.makeWithdraw(keyboard.nextInt());
    bankAccount.calcInterest();
}
System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance());

System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());

System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());

System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());

} //end useWholeDollarMode()
//used for menu option 2
/**
* useCurrencyMode asks the user for the starting balance, the
interest, and the number of months to
* process. A BankAccount object is created with balance and
interest rates as args.
* A loop runs based on number of months to process. For each month
deposits, withdraws,
* and interest rate is calculated. After the loop processes, ending
balance, total deposits,
* total withdraws, and total interest is displayed.
*/
public static void useCurrencyMode(){
    
Scanner keyboard = new Scanner(System.in);
//Create scanner object

System.out.print("What is your starting balance: $");
double balance = keyboard.nextDouble();

System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
double intRate = keyboard.nextDouble();

System.out.print("How many months do you want to calculate? ");
int counter = keyboard.nextInt();

System.out.println("===============================");
//formatting

BankAccount bankAccount = new BankAccount(balance, intRate);
//creates new BankAccount object to use BankAccount methods

for(int i = 1;i <= counter;i++)
{
    System.out.print("Enter Month " + i + " deposits $");
    bankAccount.makeDeposit(keyboard.nextDouble());
    System.out.print("Enter Month " + i + " withdraws $");
    bankAccount.makeWithdraw(keyboard.nextDouble());
    bankAccount.calcInterest();
}
System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance());

System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());

System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());

System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
}//end useCurrencyMode()

}//end class
