import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIAndVO2MaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = 0;
        double height = 0;
        boolean isMale = true;
        String name = "";
        int maxHR = 0;
        int restingHR = 0;
        int age = 0;

        // Get name
        System.out.print("Enter your name: ");
        name = scanner.nextLine().trim();

        // Get gender
        while (true) {
            System.out.print("Enter your gender (male/female): ");
            String genderInput = scanner.nextLine().trim();
            if (genderInput.equalsIgnoreCase("male")) {
                isMale = true;
                break;
            } else if (genderInput.equalsIgnoreCase("female")) {
                isMale = false;
                break;
            } else {
                System.out.println("Invalid input! Please enter 'male' or 'female'.");
            }
        }

        // Get age
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Age must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.nextLine();
            }
        }

        // Get resting heart rate
        while (true) {
            try {
                System.out.print("Enter your resting heart rate (BPM): ");
                restingHR = scanner.nextInt();
                if (restingHR <= 0) {
                    System.out.println("Resting heart rate must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.nextLine();
            }
        }

        // Get maximum heart rate
        while (true) {
            try {
                System.out.print("Enter your maximum heart rate (BPM): ");
                maxHR = scanner.nextInt();
                if (maxHR <= 0 || maxHR <= restingHR) {
                    System.out.println("Max heart rate must be greater than resting heart rate.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.nextLine();
            }
        }

        // Get weight
        while (true) {
            try {
                System.out.print("Enter your weight in kilograms: ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }

        // Get height
        while (true) {
            try {
                System.out.print("Enter your height in meters: ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be greater than 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }

        // Calculate BMI
        double bmi = weight / (height * height);

        // Calculate VO2 Max
        double vo2Max = 15 * ((double) maxHR / restingHR);

        // Display results
        System.out.println("\nYour Stats:");
        System.out.println("Name: " + name);
        System.out.printf("Gender: %s%n", isMale ? "Male" : "Female");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " Kg");
        System.out.printf("BMI: %.2f%n", bmi);

        // Gender-based BMI interpretation
        if (isMale) {
            if (bmi < 18.5) {
                System.out.println("BMI Category: Underweight");
            } else if (bmi < 26) {
                System.out.println("BMI Category: Normal weight");
            } else if (bmi < 30) {
                System.out.println("BMI Category: Overweight");
            } else {
                System.out.println("BMI Category: Obese");
            }
        } else {
            if (bmi < 18) {
                System.out.println("BMI Category: Underweight");
            } else if (bmi < 25) {
                System.out.println("BMI Category: Normal weight");
            } else if (bmi < 29) {
                System.out.println("BMI Category: Overweight");
            } else {
                System.out.println("BMI Category: Obese");
            }
        }

        //Display VO2Max Results
        System.out.println("Resting Heart Rate: " + restingHR + " bpm");
        System.out.println("Maximum Heart Rate: " + maxHR + " bpm");
        System.out.printf("Estimated VO2 Max: %.2f ml/kg/min%n", vo2Max);

        // VO2 Max interpretation by age and gender
        String vo2Category = getVo2Category(vo2Max, isMale, age);
        System.out.println("VO2 Max Rating: " + vo2Category);

        scanner.close();
    }

    // Function to determine VO2 Max category based on gender and age
    //Category based from The Cooper Institute as used by Garmin
    public static String getVo2Category(double vo2Max, boolean isMale, int age) {
        if (isMale) {
            if (age <= 29) return getCategory(vo2Max, 55.4, 51.1, 45.4,41.7);
            if (age <= 39) return getCategory(vo2Max, 54, 48.3, 44,40.5);
            if (age <= 49) return getCategory(vo2Max, 52.5, 46.4, 42.4,38.5);
            if (age <= 59) return getCategory(vo2Max, 48.9, 43.4, 39.2,35.6);
            if (age <= 69) return getCategory(vo2Max, 45.7,39.5,35.5,32.3);
            return getCategory(vo2Max, 42.1, 36.7, 32.3,29.4);
        } else {
            if (age <= 29) return getCategory(vo2Max, 49.6, 43.9, 39.5,36.1);
            if (age <= 39) return getCategory(vo2Max, 47.4, 42.4, 37.8,34.4);
            if (age <= 49) return getCategory(vo2Max, 45.3, 39.7, 36.3,33);
            if (age <= 59) return getCategory(vo2Max, 41.1, 36.7, 33,30.1);
            if (age <= 69) return getCategory(vo2Max, 37.8,33,30,27.5);
            return getCategory(vo2Max, 36.7, 30.9, 28.1,25.9);
        }
    }

    // Helper method for VO2 classification
    public static String getCategory(double vo2Max, double superior, double excellent, double good, double fair) {
        if (vo2Max > superior) return "Superior";
        if (vo2Max >= excellent) return "Excellent";
        if (vo2Max >= good) return "Good";
        if (vo2Max >= fair) return "Fair";
        return "Poor";
    }
}

