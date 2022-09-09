package lab2_1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Pls nhap can nang (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.print("Pls nhap chieu cao (in meter): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height, 2);
        if (bmi < 18.5)
            System.out.printf("Chi so BMI cua ban la: "+bmi+ " Underweight");
        else if (bmi < 25.0)
            System.out.printf("Chi so BMI cua ban la: "+bmi+ " Normal");
        else if (bmi <30.0)
            System.out.printf("Chi so BMI cua ban la: "+bmi+ " Overweight");
        else
            System.out.printf("Chi so BMI cua ban la: "+bmi+ " Obese");
    }
}
