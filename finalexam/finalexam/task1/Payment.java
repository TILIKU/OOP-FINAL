package finalexam.task1;

public class Payment {
    private String sender;
    private String recipient;
    private int amount; // Amount in cents or a small unit to avoid floating-point issues
    private String date; // Date as a string in format YYYYMMDD

    // Constructor to initialize all fields
    public Payment(String sender, String recipient, int amount, String date) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.date = date;
    }

    // Getter and Setter for sender
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Getter and Setter for recipient
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    // Getter and Setter for amount
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.amount = amount;
    }

    // Getter and Setter for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        // Simple validation to check if date is in the format YYYYMMDD
        if (date == null || !date.matches("\\d{8}")) {
            throw new IllegalArgumentException("Date must be in the format YYYYMMDD.");
        }
        this.date = date;
    }

    // Overriding the toString() method to provide a string representation of the Payment object
    @Override
    public String toString() {
        return "Payment [Sender=" + sender + ", Recipient=" + recipient + ", Amount=" + amount + " cents, Date=" + date + "]";
    }
}