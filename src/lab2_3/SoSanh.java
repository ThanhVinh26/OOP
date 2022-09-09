package lab2_3;

import java.util.Scanner;

public class SoSanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Pls nhap can nang (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.print("Pls nhap chieu cao (in meter): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height, 2);
        double delta = 0;
        if (bmi < 18.5) {
            delta = 18.5 - bmi;

            System.out.println("Chi so BMI cua ban la: "+bmi+ " Underweight");

        } else if (bmi < 25.0) {
            delta = 25.0 - bmi;
            System.out.println("Chi so BMI cua ban la: " + bmi + " Normal");
        }
        else if (bmi <30.0) {
            delta = 30.0 - bmi;
            System.out.println("Chi so BMI cua ban la: "+ bmi + " Overweight");
        }
        else{
                delta = 40.0 - bmi;
                System.out.println("Chi so BMI cua ban la: " + " " + bmi + " " + " Obese");
            }

        if(delta<0)
        {
            System.out.println("Ban can giam: "+ Math.abs(delta));
        }
        else
            System.out.println("Ban can tang them "+ Math.abs(delta));
    }


}
