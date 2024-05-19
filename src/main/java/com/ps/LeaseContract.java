package com.ps;

public class LeaseContract extends Contract {
    private double expectedEndValue; // The estimated amount the vehicle is worth at the end of the lease.
    private double leaseFee;

    public LeaseContract(
            String date,
            String customerName,
            String customerEmail,
            Vehicle vehicleSold)
    {
        super(date, customerName, customerEmail, vehicleSold);
        this.expectedEndValue = vehicleSold.getPrice() * .5; // 50% of original vehicle cost
        this.leaseFee = vehicleSold.getPrice() * 0.07; // 7% of original vehicle cost
    }


    @Override
    public double getTotalPrice() {
        this.totalPrice = this.getExpectedEndValue() + this.leaseFee;
        return this.totalPrice;
    }

    @Override
    public double getMonthlyPayment() { // This might not be correct, but no idea
        this.monthlyPayment = this.getTotalPrice() * 0.04;
        return this.monthlyPayment;
    }


    // Getters and Setters
    public double getExpectedEndValue() {
        return expectedEndValue;
    }
    public void setExpectedEndValue(double expectedEndValue) {
        this.expectedEndValue = expectedEndValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }
    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }
}
