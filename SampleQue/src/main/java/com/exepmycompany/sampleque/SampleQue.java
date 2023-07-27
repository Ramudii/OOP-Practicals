package com.exepmycompany.sampleque;
public class SampleQue 
{
    public static void main(String[] args)
    {
        BankAccount b1=new BankAccount();
        b1.display();
        BankAccount b2=new BankAccount(456,"Jane","Colombo",5000.00f);
        b2.display();
        b2.deposit(3000.00f);
        b2.withdraw(2000.00f);
    }
}
