/**
 * A bank account class that can create a BankAccount object to
 * store the balance
 * deposit money
 * withdraw money
 * get interest
 * over months chosen by the user.
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 9/27/2026
 * 
 */
public class BankAccount
{

private double balance;
private double deposit;
private double withdraw;
private double interest;
private double monthlyIntRate;

/**
* Constructs a BankAccount with the default monthlyIntRate of 
* 0.044/12 (4.4% divided by 12 to create a monthly rate) 
* and the default balance is 0.
* 
*/

public BankAccount(){

monthlyIntRate = 0.044/12;

    
}

/**
* Constructs a BankAccount with the monthlyIntRate of the 
* intRate (percentage form) put into decimal form (divide by 100) 
* divided over a twelve month period (divide by 12)
* and the default balance is the specified balance in whole number.
* 
* @param inBalance User input for how much is in balance
* @param intRate User input for how much is the interest rate
*/

public BankAccount(int inBalance, double intRate){

monthlyIntRate = ((intRate / 100) / 12);
balance = inBalance;
    
}

/**
* Constructs a BankAccount with the monthlyIntRate of the 
* intRate (percentage form) put into decimal form (divde by 100) 
* divided over a twelve month period (divide by 12)
* and the default balance is the specified balance with decimals.
* 
* @param inBalance User input for how much is in balance
* @param intRate User input for how much is the interest rate
*/

public BankAccount(double inBalance, double intRate){
    
monthlyIntRate = ((intRate / 100) / 12);
balance = inBalance;

}

/**
* Deposits the amount add (double) is into balance.
* And adds the total amount of deposits into the variable deposit
* 
* @param add How much to deposit into balance
* 
*/

public void makeDeposit(double add){

balance += add;
deposit += add;

}

/**
* Deposits the amount add (int) is into balance.
* And adds the total amount of deposits into the variable deposit
*
* @param add How much to deposit into balance
* 
*/

public void makeDeposit(int add){

balance += add;
deposit += add;

}

/**
* Withdraw the amount sub (double) out of balance.
* And adds the total amount of withdrawals into the variable withdraw
*
* @param sub How much to withdraw out of balance
* 
*/

public void makeWithdraw(double sub){

balance -= sub;
withdraw += sub;

}

/**
* Withdraw the amount sub (int) out of balance.
* And add the total amount of withdrawals into the variable withdraw
* 
* @param sub How much to withdraw out of balance
* 
*/

public void makeWithdraw(int sub){

balance -= sub;
withdraw += sub;
    
}

/**
* If balance is positive,
* then, add the interest by balance * monthlyIntRate into the total interest.
* then add the same interest to balance.
*
*/

public void calcInterest(){


if (balance > 0){
    
    interest += balance * monthlyIntRate;
    //Get the interest for this month first
    
    balance += balance * monthlyIntRate;

}



}

/**
* Return the amount currently in balance
* 
* @return balance The amount in balance
*/

public double getBalance(){

return balance;
}

/**
* Return the total amount deposited into balance
* 
* @return deposit The total amount of deposits
*/

public double getDeposit(){

return deposit;
}

/**
* Return the total amount withdrawed from balance
* 
* @return withdraw The total amount of withdrawals
*/

public double getWithdraw(){

return withdraw;
}

/**
* Return the total amount gained from interest
* 
* @return interest The total amount gained from interest
*/

public double getInterest(){

return interest;
}

}