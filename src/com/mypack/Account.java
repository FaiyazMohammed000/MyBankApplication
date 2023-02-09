package com.mypack;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phonenumber;

    public Account(String number,double balance,String name,String email,String phonenumber)
    {
        this.number=number;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phonenumber=phonenumber;
    }
    public void depositMoney(double depositedMoney)
    {
        this.balance+=depositedMoney;
        System.out.println("Money deposited sucessfully,current balance is:"+this.balance);
    }
    public void withdrawMoney(double withdrawlMoney)
    {
        if (this.balance-withdrawlMoney<0)
        {
            System.out.println("Transaction Failed Insufficient balance:"+this.balance);
        }
        else {
            this.balance -= withdrawlMoney;
            System.out.println("Money withdrawn sucessfully,current balance is:" + this.balance);
        }
    }




    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
