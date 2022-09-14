package Lab_3;

import java.util.Scanner;

public class ChanleArray {
    public static void main(String[] args) {
        int num,i;
        int chan=0, le=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        num = input.nextInt();
        int a[] = new int[num];
        System.out.println("Nhập vào các phần tử trong mảng: ");
        for (i = 0; i < num; i++)
            a[i] = input.nextInt();
        {
            for(i=0;i<num;i++)
            {
                if(a[i] %2 == 0)
                {
                    chan++;
                }
                else
                {
                    le++;
                }
            }
            System.out.println("n Chan trong mang la: " + chan);
            System.out.println("n Le trong mang la:  " + le);
        }
    }
}
