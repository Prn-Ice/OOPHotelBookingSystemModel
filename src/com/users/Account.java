package com.users;

public class Account {
    private String name;
    private int accountId;
    private String emailId;

    public Account(String name, int accountId, String emailId){
        this.setName(name);
        this.setAccountId(accountId);
        this.setEmailId(emailId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
