package Level1;

import java.util.*;
import java.util.stream.*;

class PolicyHolder {
    String holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    public PolicyHolder(String holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyType() { return policyType; }
    public int getAge() { return age; }
    public double getPremiumAmount() { return premiumAmount; }
    public String getHolderId() { return holderId; }
    public String getName() { return name; }
}

class RiskAssessment {
    String holderId;
    String name;
    double riskScore;

    public RiskAssessment(String holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }

    @Override
    public String toString() {
        return "Holder: " + name + " (ID: " + holderId + "), Risk Score: " + riskScore;
    }
}

public class PolicyHolderRiskAssessment {
    public static void main(String[] args) {
        List<PolicyHolder> policyHolders = Arrays.asList(
            new PolicyHolder("H001", "John Doe", 65, "Life", 5000),
            new PolicyHolder("H002", "Jane Smith", 70, "Life", 7000),
            new PolicyHolder("H003", "Mark Johnson", 58, "Life", 4000),
            new PolicyHolder("H004", "Emily Davis", 75, "Life", 8000),
            new PolicyHolder("H005", "James Brown", 50, "Health", 6000),
            new PolicyHolder("H006", "Mary White", 68, "Life", 3000)
        );

        List<RiskAssessment> riskAssessments = policyHolders.stream()
            .filter(ph -> ph.getPolicyType().equals("Life") && ph.getAge() > 60)
            .map(ph -> new RiskAssessment(ph.getHolderId(), ph.getName(), ph.getPremiumAmount() / ph.getAge()))
            .sorted(Comparator.comparingDouble(RiskAssessment::getRiskScore).reversed())
            .collect(Collectors.toList());

        Map<String, List<RiskAssessment>> categorizedRiskAssessments = riskAssessments.stream()
            .collect(Collectors.groupingBy(r -> r.riskScore > 0.5 ? "High Risk" : "Low Risk"));

        categorizedRiskAssessments.forEach((category, assessments) -> {
            System.out.println(category + ":");
            assessments.forEach(System.out::println);
            System.out.println();
        });
    }
}

