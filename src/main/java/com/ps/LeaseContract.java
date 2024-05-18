package com.ps;

public class LeaseContract extends Contract {
//    Expected Ending Value (50% of the original cost of vehicle, after 3 years) <--- the estimated amount the vehicle is worth at the end of the lease.
    private double expectedEndValue;
//    Lease Fee (7% of the original cost of vehicle) <--- Initial cost
    private double leaseFee;
//    Monthly Payment based on:
    //    All leases are financed at 4.0% for 36 months

    // Constructor
        // DON'T include total price and monthly payment

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


    // Override getTotalPrice()
        // Calc values
    @Override
    public double getTotalPrice() {
        this.totalPrice = this.getExpectedEndValue() + this.leaseFee;
        return this.totalPrice;
    }

    // Override getMonthlyPayment()
        // Calc values
    @Override
    public double getMonthlyPayment() {
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
