package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

  String empName;
  int empId;

  Employee(String empName, int empId) {
    this.empName = empName;
    this.empId = empId;
  }

  @Override
  public String toString() {
    return empId + " " + empName;
  }
}

public class TestOne {

  public static void main(String[] args) {
    Employee employee = new Employee("Mumin", 97);
    System.out.println(employee);

    ArrayList<Employee> al = new ArrayList<Employee>();
    al.add(new Employee("Anik", 99));
    al.add(new Employee("Mizan", 27));
    al.add(new Employee("Sibam", 89));
    al.add(new Employee("Borney", 35));
    System.out.println(al);

    System.out.println("After sorting");
    Collections.sort(al,
        (e1, e2) -> (e1.empId > e2.empId) ? 1 : (e1.empId < e2.empId) ? -1 : 0);
    System.out.println(al);
    //Comparator cmp = (obj1, obj2) -> (obj1 > obj2 ? +1 : obj1 < obj2 ? -1 : 0);

  }

}
