package dev.elisih.bankPortal;

import dev.elisih.bankPortal.Account;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
public class AccountHolder {
    @Id
    private String id;
    private String name;
    private String surname; // Added surname attribute
    private String phoneNumber;
    private String address;
    private String email;
    private String dateOfBirth;
    private List<Account> accounts;

    // Default constructor
    public AccountHolder() {
    }

    // Constructor with parameters
    public AccountHolder(String id, String name, String surname, String phoneNumber, String address, String email, String dateOfBirth, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.surname = surname; // Initialize surname in constructor
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.accounts = accounts;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() { // Getter for surname
        return surname;
    }

    public void setSurname(String surname) { // Setter for surname
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "AccountHolder{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
