package product_service.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employee {
    String name;
    String department;
    Integer age;
    Integer salary;
}

public class EmployeeList {
    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("harshal","Development", 30, 100000));
        employeeList.add(new Employee("ak1","Finance", 30, 300000));
        employeeList.add(new Employee("h2","Finance", 30, 700000));
        employeeList.add(new Employee("h3","Deops", 30, 400000));

        return employeeList;
    }
    public static void main(String[] args) {
        List<Employee> sortedBySalary = EmployeeList.getEmployeeList().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(sortedBySalary);

        Map<String, Integer> groupByAgeAndSalary = EmployeeList.getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)));
       System.out.println(groupByAgeAndSalary);
    }
}
