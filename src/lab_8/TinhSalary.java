package lab_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TinhSalary{
  public int totalLuong(List<Employee> employeeList) {
    int totalLuong = 0;
    for (Employee employee : employeeList) {
      totalLuong+=employee.getSalary();
    }
    return totalLuong;
  }
  public static void main(String[] args) {
    Employee ft=new Fulltime();
    Employee ct=new Contract();
    System.out.println(new TinhSalary().totalLuong(Arrays.asList(ft,ft,ft,ct,ct)));
  }


}

