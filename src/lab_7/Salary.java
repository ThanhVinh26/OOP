package lab_7;

public class Salary {
    public static void main(String[] args) {
        Fulltime ful=new Fulltime();
        Contract ctr=new Contract();
        int totalF=3;
        int totalC=2;
        int totalsalary=(totalF*50000)+(totalC*40000);
        System.out.println("Số nhân viên chính thức là: "+totalF);
        System.out.println("Số nhân viên partime là: "+totalC);
        System.out.println("Tổng lương của nhân viên là: "+totalsalary);
    }
}
