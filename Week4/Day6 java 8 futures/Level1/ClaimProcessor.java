package Level1;

import java.util.*;
import java.util.stream.*;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    String claimDate;
    String status;

    public Claim(String claimId, String policyNumber, double claimAmount, String claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    public String getPolicyNumber() { return policyNumber; }
    public double getClaimAmount() { return claimAmount; }
    public String getStatus() { return status; }
}

class PolicyClaimSummary {
    String policyNumber;
    double totalAmount;
    double averageAmount;

    public PolicyClaimSummary(String policyNumber, double totalAmount, double averageAmount) {
        this.policyNumber = policyNumber;
        this.totalAmount = totalAmount;
        this.averageAmount = averageAmount;
    }

    @Override
    public String toString() {
        return "Policy: " + policyNumber + ", Total: $" + totalAmount + ", Average: $" + averageAmount;
    }
}

public class ClaimProcessor {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("C001", "P1001", 8000, "2023-05-10", "Approved"),
            new Claim("C002", "P1002", 3000, "2023-06-15", "Pending"),
            new Claim("C003", "P1001", 6000, "2023-07-20", "Approved"),
            new Claim("C004", "P1003", 10000, "2023-05-25", "Approved"),
            new Claim("C005", "P1002", 7000, "2023-08-10", "Approved"),
            new Claim("C006", "P1004", 2000, "2023-09-01", "Rejected"),
            new Claim("C007", "P1003", 3000, "2023-09-05", "Approved"),
            new Claim("C008", "P1002", 6000, "2023-10-10", "Approved")
        );

        Map<String, List<Claim>> grouped = claims.stream()
            .filter(c -> c.getStatus().equals("Approved") && c.getClaimAmount() > 5000)
            .collect(Collectors.groupingBy(Claim::getPolicyNumber));

        List<PolicyClaimSummary> summaries = grouped.entrySet().stream()
            .map(entry -> {
                String policy = entry.getKey();
                List<Claim> cl = entry.getValue();
                double total = cl.stream().mapToDouble(Claim::getClaimAmount).sum();
                double avg = total / cl.size();
                return new PolicyClaimSummary(policy, total, avg);
            })
            .sorted(Comparator.comparingDouble((PolicyClaimSummary pcs) -> pcs.totalAmount).reversed())
            .limit(3)
            .collect(Collectors.toList());

        summaries.forEach(System.out::println);
    }
}
