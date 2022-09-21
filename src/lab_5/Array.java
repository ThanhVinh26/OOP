package lab_5;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args)
    {
        ArrayList mang = new ArrayList();
        mang.add("Trang");
        mang.add("Hang");
        mang.add("Thư");
        mang.add("Thảo");
        // hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: " );
        System.out.println(mang + "\n");

        System.out.println("list trước khi cập nhật: ");
        System.out.println(mang+ "\n");
        mang.set(3, "My");
        System.out.println("list sau khi cập nhật: ");
        System.out.println(mang+ "\n");
    }
}

