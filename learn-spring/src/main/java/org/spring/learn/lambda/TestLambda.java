package org.spring.learn.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Project: org.learnspring.parent
 * Package: org.spring.learn.lambda
 * <p>
 * User: vthalapu
 * Date: 3/2/18
 * Time: 8:10 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestLambda {

    public static void main(String... args) {

        Employee empObje = new Employee(2, 140000);

        EmployeeInterface employeeInterface = emp -> {
            if (emp.getCheckSalary() > 100000) {
                System.out.println("He is a manager");
            } else {
                System.out.println("He is a associate");
            }
        };

        employeeInterface.check(empObje);


        employeeInterface = emp -> {
            if (emp.getRating() >= 5) {
                System.out.println("He is eligible for 10% hike");
            } else if (emp.getRating() < 5 && emp.getRating() >= 2) {
                System.out.println("He is eligible for 5% hike");
            }
        };

        employeeInterface.check(empObje);

    }

    private interface EmployeeInterface {
        void check(Employee emp);
    }

}

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
class Employee {
    private int rating;
    private int checkSalary;


}