package lab2_2;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so bat ky: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Day la so chan");
        }
        else{
            System.out.println("Day la so le");
        }


    }
}
