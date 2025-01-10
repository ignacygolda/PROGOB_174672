public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.lastName.length() > o.lastName.length()) return 1;
        else if(this.lastName.length() < o.lastName.length()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
