package com.ps;

import java.io.*;

public class ContractFileManager {
    static String contractsFileName = "contracts.csv";

    public static void saveContract(Contract contract) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(contractsFileName, true));

            if (contract instanceof SalesContract) {
                String financeOption = ((SalesContract) contract).getFinanceOption() ? "YES" : "NO"; // Down-casting + ternary operators

                bufWriter.write(String.format("SALE|%s|%s|%s|" + "%d|%d|%s|%s|%s|%s|%d|%.2f|" + "%.2f|%.2f|%.2f|%.2f|%s|%.2f\n",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        contract.getVehicleSold().getVin(),
                        contract.getVehicleSold().getYear(),
                        contract.getVehicleSold().getMake(),
                        contract.getVehicleSold().getModel(),
                        contract.getVehicleSold().getVehicleType(),
                        contract.getVehicleSold().getColor(),
                        contract.getVehicleSold().getOdometer(),
                        contract.getVehicleSold().getPrice(),
                        ((SalesContract) contract).getSalesTaxAmount(),
                        ((SalesContract) contract).getRecordingFee(),
                        ((SalesContract) contract).getProcessingFee(),
                        contract.getTotalPrice(),
                        financeOption,
                        contract.getMonthlyPayment()
                ));

            } else if (contract instanceof LeaseContract) {
                bufWriter.write(String.format("LEASE|%s|%s|%s|" + "%d|%d|%s|%s|%s|%s|%d|%.2f|" + "%.2f|%.2f|%.2f|%.2f\n",
                        contract.getDate(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        contract.getVehicleSold().getVin(),
                        contract.getVehicleSold().getYear(),
                        contract.getVehicleSold().getMake(),
                        contract.getVehicleSold().getModel(),
                        contract.getVehicleSold().getVehicleType(),
                        contract.getVehicleSold().getColor(),
                        contract.getVehicleSold().getOdometer(),
                        contract.getVehicleSold().getPrice(),
                        ((LeaseContract) contract).getExpectedEndValue(),
                        ((LeaseContract) contract).getLeaseFee(),
                        contract.getTotalPrice(),
                        contract.getMonthlyPayment()
                ));
            }

            bufWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
