package Level1;

interface MealPlan {
    String getMealType();
    String getMealDetails();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public String getMealDetails() {
        return "Meal contains plant-based ingredients, no meat or fish.";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public String getMealDetails() {
        return "Meal contains only plant-based ingredients, no animal products.";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public String getMealDetails() {
        return "Meal is high in fats, moderate in proteins, and very low in carbs.";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }

    public String getMealDetails() {
        return "Meal is rich in protein, aimed at muscle building and repair.";
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Meal Details: " + mealPlan.getMealDetails());
        System.out.println();
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

class MealPlanner {
    public static <T extends MealPlan> void validateMealPlan(T mealPlan) {
        if (mealPlan != null) {
            System.out.println("Valid meal plan selected: " + mealPlan.getMealType());
        } else {
            System.out.println("Invalid meal plan selected.");
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        MealPlanner.validateMealPlan(vegetarianMeal.getMealPlan());
        MealPlanner.validateMealPlan(veganMeal.getMealPlan());
        MealPlanner.validateMealPlan(ketoMeal.getMealPlan());
        MealPlanner.validateMealPlan(highProteinMeal.getMealPlan());

        vegetarianMeal.generateMealPlan();
        veganMeal.generateMealPlan();
        ketoMeal.generateMealPlan();
        highProteinMeal.generateMealPlan();
    }
}
