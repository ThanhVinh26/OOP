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

        bmi = Math.abs(weight/Math.pow(height, 2));
        double delta = 0;
        double m,a,b;
        Math.abs(a=18.5-bmi);
        Math.abs(b=bmi-24.9);
        if (bmi <= 18.5) {
            System.out.println("Chi so BMI cua ban la: "+bmi+ " Underweight");

        } else if (bmi <= 24.9) {
            System.out.println("Chi so BMI cua ban la: " + bmi + " Normal");
        }
        else if (bmi <=29.9) {
            System.out.println("Chi so BMI cua ban la: "+ bmi + " Overweight");
        }
        else{
                System.out.println("Chi so BMI cua ban la: " + bmi + " Obese");
            }

        if(bmi<18.5)
        {
            System.out.println("Ban can tang them : "+ Math.abs(a));
        }
        else
            System.out.println("Ban can giam đi "+ Math.abs(b));
    }


}
