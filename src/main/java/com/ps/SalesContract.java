package com.ps;

public class SalesContract extends Contract {
    // Sales tax Amount (5%) <--- Possibly "amount" * 0.05.
    private double salesTaxAmount;
//    Recording Fee: $100
    private int recordingFee;
//    Processing Fee: $295 for vehicles under $10,000 and $495 for all others
    private int processingFee;
//    (Whether they want to finance) Finance Option: Yes/No
    private boolean wantToFinance;
//    Monthly Payment (if financed) based on: <---- Get From Super class
    //    All loans at 4.25% for 48 months if the price is $10,000 or more
    //    Otherwise they are 5.25% for 24 months

    // Constructor
        // DON'T include total price and monthly payment

    public SalesContract(
            String date,
            String customerName,
            String customerEmail,
            Vehicle vehicleSold,
            int processingFee,
            boolean wantToFinance)
    {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = 0.05 * vehicleSold.getPrice(); // 5% of the vehicle's price amount
        this.recordingFee = 100; // Fixed
        this.processingFee = processingFee; // May have to do an if-statement for this or something
        this.wantToFinance = wantToFinance;
    }


    // Override getTotalPrice()
        // Calc values
    @Override
    public double getTotalPrice() {

    }

    // Override getMonthlyPayment()
        // Calc values
        // return 0 if NO loan option chosen
    @Override
    public double getMonthlyPayment() {

    }


    // Getters and Setters
    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }
    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public int getRecordingFee() {
        return recordingFee;
    }
    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }
    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isWantToFinance() {
        return wantToFinance;
    }
    public void setWantToFinance(boolean wantToFinance) {
        this.wantToFinance = wantToFinance;
    }
}
