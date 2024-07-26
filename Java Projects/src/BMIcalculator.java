import java.util.*;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in Kilograms");
        float weight = sc.nextFloat();
        System.out.println("Enter your height in meters");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}