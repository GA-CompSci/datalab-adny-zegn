/**
 * Cereal Class - Represents one cereal with nutritional data
 *
 * Activity 1 Step 3: Complete this class
 *
 * Requirements:
 * - 5 private instance variables
 * - Constructor with 5 parameters
 * - 5 getter methods (one for each variable)
 * - toString() method
 */
public class Cereal {
    // Declare your 5 private instance variables here:
    // name, calories, fiber, carbohydrates, cups
    private String name;
    private int calories;
    private int fiber;
    private int carbohydrates;
    private double cups;

    // Write your constructor here
    // It should take 5 parameters in this order:
    // String name, int calories, int fiber, int carbohydrates, double cups
    public Cereal(String name, int calories, int fiber, int carbohydrates, double cups) {
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.cups = cups;
    }

    // Write your 5 getter methods here
    // getName() - returns String
    public String getName() { return this.name; }
    // getCalories() - returns int
    public int getCalories() { return this.calories; }
    // getFiber() - returns int
    public int getFiber() { return this.fiber; }
    // getCarbohydrates() - returns int
    public int getCarbohydrates() { return this.carbohydrates; }
    // getCups() - returns double
    public double getCups() { return this.cups; }

    // Write your toString() method here
    // Should return a String with all the cereal data
    // Example: "100% Bran - Calories: 70, Fiber: 10g, Carbs: 5g, Serving: 0.33 cups"
    @Override
    public String toString() {
        return name + " - Calories: " + calories + ", Fiber: " + fiber + "g, Carbs: " + carbohydrates + "g, Serving Size: " + cups + " cups";
    }



}
