package product_service.entity;

import lombok.Data;

@Data
public class Employee {
    String name;
    Integer salary;

    public Employee(String hr, int i) {
        this.name = hr;
        this.salary = i;
    }
}
