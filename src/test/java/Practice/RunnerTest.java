package Practice;

import Practice.Employee;

import java.util.ArrayList;

public class RunnerTest {
    public static void main(String[] args) {


        Employee d1 = new Employee(101, "jhon",21);
        Employee d2 = new Employee(102, "ven",22);
        Employee d3 = new Employee(103, "ken",23);
        Employee d4 = new Employee(104, "ten",24);
        Employee d5 = new Employee(105, "tammy",25);


        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(d1);
        al.add(d2);
        al.add(d3);
        al.add(d4);
        al.add(d5);

        System.out.println(al);
    }
}
