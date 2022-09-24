package lab_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
public class Tongphut {
    public static void main(String[] args) {
        //string
        String chuoi = "2hrs and 5 minutes";
        String[] result = chuoi.split(" and ");
        String minutesStr = result[1].replaceAll(" ", "").replaceAll("minutes", "");
        String hourStr = result[0].replaceAll(" ", "").replaceAll("hrs","");
        //String rpl=result[1].replace("minutes","");
        System.out.println("hourStr= " + hourStr);
        System.out.println("minutesStr= " + minutesStr);
        int i = Integer.parseInt(hourStr);
        int j = Integer.parseInt(minutesStr);
        System.out.println("i= " + i);
        System.out.println("j= " + j);
        int total=(i*60) + j;
        System.out.println("total= " + total);
        System.out.println("Kết quả before: " + Arrays.toString(result));
        System.out.println("Kết quả tổng phút : " + total);


    }
}
