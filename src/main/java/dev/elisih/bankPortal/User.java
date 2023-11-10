package dev.elisih.bankPortal;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User extends AccountHolder {
    private String username;
    private String password;

    // Default constructor
    public User() {
        super(); // Call the parent constructor
    }

    // Constructor with parameters
    public User(String id, String name, String surname, String phoneNumber, String address, String email, String dateOfBirth, List<Account> accounts, String username, String password) {
        super(id, name, surname, phoneNumber, address, email, dateOfBirth, accounts); // Call the parent constructor
        this.username = username;
        this.password = password;
    }

    // Getters and Setters for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    // It's important to hash passwords in a real application
    public void setPassword(String password) {
        this.password = password;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", accounts=" + getAccounts() +
                ", username='" + username + '\'' +
                ", password='[PROTECTED]'" + // Never log or print passwords
                '}';
    }
}
