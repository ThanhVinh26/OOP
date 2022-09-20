package Lab_3;

import java.util.Scanner;

public class Sapxep {
    public static void main(String[] args) {
        int num,i,j,tam;
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
                for (j=0;j<num;j++)
                {
                    if(a[j]>a[i])
                    {
                        tam=a[j];
                        a[j]=a[i];
                        a[i]=tam;
                    }
                }
        }

        }
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (i = 0; i < num; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
