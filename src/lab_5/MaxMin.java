package lab_5;

import java.util.Scanner;
import java.util.ArrayList;
public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Nhập số phần tử của Array: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextInt();
            arrList.add(number);
        }

        int max = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i).compareTo(max) > 0) {
                max = arrList.get(i);
            }
        }

        int min = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i).compareTo(min) < 0) {
                min = arrList.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arr = " + max);
        System.out.println("Phần tử bé nhất trong arr = " + min);
    }
}
