package dev.elisih.bankPortal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "online-Portal.accounts")
public class Account {
    @Id
    private String id;
    private String accountNumber;
    private BigDecimal balance;
    private String accountType; // Existing field for account type
    private String pin; // Added field for account PIN

    // Enum for account types (optional, for better type safety)
    public enum AccountType {
        SAVINGS, CHEQUE, PRIVATE_WEALTH, STUDENT, YOUNG_PROFESSIONAL, GOLD
    }

    // Default constructor
    public Account() {
    }

    // Constructor with parameters including account type and pin
    public Account(String id, String accountNumber, BigDecimal balance, String accountType, String pin) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.pin = pin; // Initialize the pin
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", pin='" + pin + '\'' + // Include pin in the toString method
                '}';
    }
}
