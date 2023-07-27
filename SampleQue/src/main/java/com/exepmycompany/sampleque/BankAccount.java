
package com.exepmycompany.sampleque;
public class BankAccount 
{
    public int accNo;
    public String accName,branch;
    public float balance;
    
    public BankAccount()
    {
        accNo=1234;
        accName="Ann";
        branch="Homagama";
        balance=(float) 2500.00;
    }
    public BankAccount(int a,String n,String b,float c)
    {
        accNo=a;
        accName=n;
        branch=b;
        balance=c;
    }
    public void withdraw(float amount)
    {
        if(balance>amount)
        {
            balance=balance-amount;
        System.out.println("Balance is "+balance);
    }
        else
        {
        System.out.println("Insufficient Amount");
                }
    }
    public void deposit(float amount)
    {
        balance=balance+amount;
        System.out.println("Balance is "+balance);
    }
    public void display()
    {
        System.out.println("Account No:"+accNo);
        System.out.println("Account Name:"+accName);
        System.out.println("Branch:"+branch);
        System.out.println("Balance:"+balance);
    }
}
