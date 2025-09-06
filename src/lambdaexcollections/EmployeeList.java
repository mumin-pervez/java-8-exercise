package lambdaexcollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeList {

  public static void main(String[] args) {
    List<Employee> empList = Arrays.asList(
        new Employee(101, "Anik", 25000.00),
        new Employee(103, "Jasim", 45000.00),
        new Employee(102, "Anik", 25000.00));

    empList.forEach(employee -> System.out.println(
        employee.empId + " " + employee.empName + " " + employee.empSalary));

    //Set employee location
    Set<String> locations = Set.of("Mohammadpur", "Green Road", "Adabor");
    locations.forEach(location -> System.out.println(location));

    Map<String, Integer> empIds = Map.of("Mumin", 97, "Anowar", 136, "Bikash", 56);
    empIds.forEach((key, value) -> System.out.println("Name: " + key + " Id: " + value));

    Map<Integer, Employee> empInfos = Map.of(
        1, new Employee(123, "Bashir", 45000.00),
        2, new Employee(107, "Amir", 40000.00),
        3, new Employee(87, "Topu", 6000.00)
    );
    empInfos.forEach((serialNo, employee) -> System.out.println(
        serialNo + ": " + employee.empId + " " + employee.empName + " " + employee.empSalary));
  }
}
