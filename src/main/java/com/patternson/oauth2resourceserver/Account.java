package com.patternson.oauth2resourceserver;

public class Account {

    private int accountNumber;
    private String accountType;
    private String accountHolderName;
    private String accountBankName;

    public Account(int accountNumber, String accountType, String accountHolderName, String accountBankName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolderName = accountHolderName;
        this.accountBankName = accountBankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }
}
