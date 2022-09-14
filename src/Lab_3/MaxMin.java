package Lab_3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int num,i;
        int max=0, min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        num = input.nextInt();
        int a[] = new int[num];
        System.out.println("Nhập vào các phần tử trong mảng: ");
        for (i = 0; i < num; i++)
            a[i] = input.nextInt();
        {
            max=a[0];
            for(i=0;i<num;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }

            }
            min=a[0];
            for(i=0;i<num;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }

            }
            System.out.print("Giá trị max là: "+ max+"\n");
            System.out.print("Giá trị min là: "+ min);
        }
    }
}
