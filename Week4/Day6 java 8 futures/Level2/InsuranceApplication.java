import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class InsurancePolicy {
    String policyNumber;
    String holderName;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String holderName, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getHolderName() { return holderName; }
    public double getPremiumAmount() { return premiumAmount; }
}

public class InsuranceApplication {
    public static void main(String[] args) {
        List<InsurancePolicy> policies = Arrays.asList(
            new InsurancePolicy("P001", "John Doe", 1500.0),
            new InsurancePolicy("P002", "Jane Smith", 2000.0),
            new InsurancePolicy("P003", "Robert Brown", 1200.0),
            new InsurancePolicy("P004", "Alice White", 1800.0),
            new InsurancePolicy("P005", "Charlie Black", 2500.0)
        );

        // 1. Filter Policies by Premium Amount
        List<InsurancePolicy> filteredPolicies = policies.stream()
            .filter(policy -> policy.getPremiumAmount() > 1200)
            .collect(Collectors.toList());

        // 2. Sort Policies by Holder Name
        List<InsurancePolicy> sortedPolicies = policies.stream()
            .sorted(Comparator.comparing(InsurancePolicy::getHolderName))
            .collect(Collectors.toList());

        // 3. Compute Total Premium
        double totalPremium = policies.stream()
            .mapToDouble(InsurancePolicy::getPremiumAmount)
            .sum();

        // 4. Print Policy Details
        policies.forEach(policy -> System.out.println(
            String.format("Policy Number: %s, Holder: %s, Premium: %.2f",
                policy.getPolicyNumber(), policy.getHolderName(), policy.getPremiumAmount())
        ));

        // 5. Filter Policies by Premium Range ($1,000 - $2,000)
        List<InsurancePolicy> premiumRangePolicies = policies.stream()
            .filter(policy -> policy.getPremiumAmount() >= 1000 && policy.getPremiumAmount() <= 2000)
            .collect(Collectors.toList());

        // 6. Find Policy with Highest Premium
        Optional<InsurancePolicy> highestPremiumPolicy = policies.stream()
            .max(Comparator.comparingDouble(InsurancePolicy::getPremiumAmount));

        // 7. Group Policies by Holder Name Initial
        Map<Character, List<InsurancePolicy>> groupedByInitial = policies.stream()
            .collect(Collectors.groupingBy(policy -> policy.getHolderName().charAt(0)));

        // 8. Compute Average Premium
        OptionalDouble averagePremium = policies.stream()
            .mapToDouble(InsurancePolicy::getPremiumAmount)
            .average();

        // 9. Sort Policies by Premium and Print
        List<InsurancePolicy> sortedByPremium = policies.stream()
            .sorted(Comparator.comparingDouble(InsurancePolicy::getPremiumAmount))
            .collect(Collectors.toList());

        // 10. Check If Any Policy Exceeds a Certain Premium
        boolean anyExceeds2000 = policies.stream()
            .anyMatch(policy -> policy.getPremiumAmount() > 2000);

        // 11. Count Policies for Each Premium Range
        Map<String, Long> premiumRangeCount = policies.stream()
            .collect(Collectors.groupingBy(policy -> {
                if (policy.getPremiumAmount() <= 1000) return "$0-$1,000";
                else if (policy.getPremiumAmount() <= 2000) return "$1,001-$2,000";
                else return ">$2,000";
            }, Collectors.counting()));

        // 12. Extract Unique Holder Names
        Set<String> uniqueHolderNames = policies.stream()
            .map(InsurancePolicy::getHolderName)
            .collect(Collectors.toSet());

        // 13. Find Policies by Holder Name Substring
        List<InsurancePolicy> policiesWithSubstring = policies.stream()
            .filter(policy -> policy.getHolderName().contains("Smith"))
            .collect(Collectors.toList());

        // 14. Create a Map of Policy Numbers to Premium Amounts
        Map<String, Double> policyMap = policies.stream()
            .collect(Collectors.toMap(InsurancePolicy::getPolicyNumber, InsurancePolicy::getPremiumAmount));

        // 15. Finding the Most Frequent Words in a Text Corpus
        String text = "hello world hello stream java stream world java java world";
        Map<String, Long> wordFrequency = Arrays.stream(text.split("\\W+"))
            .map(String::toLowerCase)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> topWords = wordFrequency.entrySet().stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .limit(3)
            .collect(Collectors.toList());

        // 16. Find the Second Most Frequent Word in a Sequence of Words
        Optional<Map.Entry<String, Long>> secondMostFrequent = wordFrequency.entrySet().stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .skip(1)
            .findFirst();

        // Display Results
        System.out.println("Filtered Policies: " + filteredPolicies);
        System.out.println("Sorted Policies: " + sortedPolicies);
        System.out.println("Total Premium: " + totalPremium);
        System.out.println("Premium Range Policies: " + premiumRangePolicies);
        highestPremiumPolicy.ifPresent(policy ->
            System.out.println("Policy with Highest Premium: " + policy.getPolicyNumber())
        );
        System.out.println("Grouped by Initial: " + groupedByInitial);
        averagePremium.ifPresent(avg -> System.out.println("Average Premium: " + avg));
        System.out.println("Sorted by Premium: " + sortedByPremium);
        System.out.println("Any Policy Exceeds $2,000: " + anyExceeds2000);
        System.out.println("Premium Range Count: " + premiumRangeCount);
        System.out.println("Unique Holder Names: " + uniqueHolderNames);
        System.out.println("Policies with 'Smith': " + policiesWithSubstring);
        System.out.println("Policy Map: " + policyMap);
        System.out.println("Top 3 Most Frequent Words: " + topWords);
        secondMostFrequent.ifPresent(entry ->
            System.out.println("Second Most Frequent Word: " + entry.getKey())
        );
    }
}
