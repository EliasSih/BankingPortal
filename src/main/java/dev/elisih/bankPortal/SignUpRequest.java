package dev.elisih.bankPortal;

public class SignUpRequest {
    private String accountNumber;
    private String pin;
    private String name;
    private String surname;
    private String phoneNumber;
    private String address;
    private String email;
    private String dateOfBirth;
    private String username;
    private String password;

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "SignUpRequest{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", username='" + username + '\'' +
                ", password='[PROTECTED]'" + // Never log or print passwords
                '}';
    }
}
