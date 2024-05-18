package com.ps;

public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold; // May have to change this to be a String or an int later.
    protected double totalPrice;
    protected double monthlyPayment;

    // Constructor
        // DON'T include total price and monthly payment
    public Contract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }


    // Abstract getTotalPrice();
        // Returns computed values based on contract type
    public abstract double getTotalPrice();

    // Abstract getMonthlyPayment();
        // Returns computed values based on contract type
    public abstract double getMonthlyPayment();

    // Getters and Setters


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }
    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
}
