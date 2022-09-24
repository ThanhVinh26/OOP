package lab_6;

public class ChuHaySo {
    public static void main(String[] args) {
        String chuoi = "100minutes";
        String kq = "";
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                System.out.println("i= "+chuoi.charAt(i));
                kq = kq + chuoi.charAt(i);
            }
        }
        System.out.println("Ket Qua: "+kq);
    }
}
