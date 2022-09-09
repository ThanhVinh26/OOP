package bai1;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int n;
        int sum=0;
        System.out.println("Nhap so bat ky");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum +=i;
                System.out.println(sum);
            }

        }
//        if (n>=0){
//            System.out.println("Đay la so nguyen duong");
//        }
//        else
//        {
//            System.out.println("Day la so nguyen am");
//        }
    }
}
