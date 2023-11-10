package dev.elisih.bankPortal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document
public class Transaction {
    @Id
    private String id;
    private String fromAccountNumber;
    private String toAccountNumber;
    private BigDecimal amount;
    private LocalDateTime date;
    private String description;
    private TransactionType type; // Enum for transaction type (e.g., DEPOSIT, WITHDRAWAL, TRANSFER)

    // Enum for transaction types
    public enum TransactionType {
        DEPOSIT, WITHDRAWAL, TRANSFER
    }

    // Default constructor
    public Transaction() {
    }

    // Constructor with parameters
    public Transaction(String id, String fromAccountNumber, String toAccountNumber, BigDecimal amount, LocalDateTime date, String description, TransactionType type) {
        this.id = id;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.type = type;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", fromAccountNumber='" + fromAccountNumber + '\'' +
                ", toAccountNumber='" + toAccountNumber + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
