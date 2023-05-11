import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        height = inp.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = inp.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your Body Mass Index (BMI): " + bmi);
    }
}
