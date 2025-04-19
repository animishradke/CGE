package Level1;

import java.util.*;
import java.util.stream.*;

class Transaction {
    String transactionId;
    String policyNumber;
    double amount;
    String transactionDate;
    boolean isFraudulent;

    public Transaction(String transactionId, String policyNumber, double amount, String transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    public boolean isFraudulent() { return isFraudulent; }
    public String getPolicyNumber() { return policyNumber; }
    public double getAmount() { return amount; }
    public String getTransactionId() { return transactionId; }
}

class FraudAlert {
    String policyNumber;
    int fraudulentTransactionCount;
    double totalFraudAmount;

    public FraudAlert(String policyNumber, int fraudulentTransactionCount, double totalFraudAmount) {
        this.policyNumber = policyNumber;
        this.fraudulentTransactionCount = fraudulentTransactionCount;
        this.totalFraudAmount = totalFraudAmount;
    }

    @Override
    public String toString() {
        return "Alert for Policy: " + policyNumber + ", Fraudulent Transactions: " + fraudulentTransactionCount 
            + ", Total Fraud Amount: " + totalFraudAmount;
    }
}

public class FraudDetection {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("T001", "P001", 15000, "2024-01-01", true),
            new Transaction("T002", "P002", 20000, "2024-01-02", true),
            new Transaction("T003", "P003", 5000, "2024-01-03", false),
            new Transaction("T004", "P001", 12000, "2024-01-04", true),
            new Transaction("T005", "P001", 8000, "2024-01-05", false),
            new Transaction("T006", "P002", 18000, "2024-01-06", true),
            new Transaction("T007", "P003", 30000, "2024-01-07", true),
            new Transaction("T008", "P001", 25000, "2024-01-08", true)
        );

        Map<String, List<Transaction>> fraudulentTransactionsGrouped = transactions.stream()
            .filter(t -> t.isFraudulent() && t.getAmount() > 10000)
            .collect(Collectors.groupingBy(Transaction::getPolicyNumber));

        List<FraudAlert> alerts = fraudulentTransactionsGrouped.entrySet().stream()
            .map(entry -> {
                String policyNumber = entry.getKey();
                List<Transaction> transactionsForPolicy = entry.getValue();
                int fraudulentTransactionCount = transactionsForPolicy.size();
                double totalFraudAmount = transactionsForPolicy.stream().mapToDouble(Transaction::getAmount).sum();

                if (fraudulentTransactionCount > 5 || totalFraudAmount > 50000) {
                    return new FraudAlert(policyNumber, fraudulentTransactionCount, totalFraudAmount);
                }
                return null;
            })
            .filter(Objects::nonNull)
            .collect(Collectors.toList());

        alerts.forEach(System.out::println);
    }
}
