import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jacek",4.02,2003));
        students.add(new Student("Andrzej",3.89,2004));
        students.add(new Student("Jakub",4.10,2004));
        students.add(new Student("Stachu",3.55,2003));
        students.add(new Student("Janek",4.35,2004));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.toString());
        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford",23456,1996));
        cars.add(new Car("dfg",468787,1991));
        cars.add(new Car("rty",800000,1990));
        cars.add(new Car("ret",5545344,1986));
        Collections.sort(cars);
        for (Car c : cars) {
            System.out.println(c.toString());
        }

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("Jacek",4.02,2003,2020));
        students2.add(new Student("Janek",4.22,2003,2019));
        students2.add(new Student("Andrzej",3.95,2003,2013));
        students2.add(new Student("Tomasz",4.02,2003,2021));
        Collections.sort(students2);
        for (Student s : students2) {
            System.out.println(s.toString());
        }

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("aaa",234,23.35));
        orders.add(new Order("aab",200,40.99));
        orders.add(new Order("aba",120,40.99));
        orders.add(new Order("abb",450,20.00));
        Collections.sort(orders);
        for (Order o : orders) {
            System.out.println(o.toString());
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a","aaaa","dfgh"));
        employees.add(new Employee("b","aaa","dfg"));
        employees.add(new Employee("c","a","cvb"));
        employees.add(new Employee("d","aa","rdsf"));
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}