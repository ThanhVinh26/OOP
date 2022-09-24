package lab_6;

import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        String mk;
        String password = "abc123456";
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.print("Moi ban nhap mat khau: ");
            mk = scanner.nextLine();
            if(mk.equals(password))
            {
                System.out.print("CHuc mung ban da nhap dung mk: ");
            }
            else
            {
                System.out.println("MK sai vui lòng nhập lại");
            }
        }
        System.out.println("Ban da nhap sai qua 3 lan, Vui long thu lại sau.");
    }
}
