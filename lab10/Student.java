public class Student implements Comparable<Student>{
    String name;
    double averageGrade;
    int yearOfBirth;
    int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
        this.yearOfStudy = -1;
    }

    public Student(String name, double averageGrade, int yearOfBirth,int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public int compareTo(Student o) {
        if(this.averageGrade > o.averageGrade) return 1;
        else if(this.averageGrade < o.averageGrade) return -1;
        else if(this.yearOfStudy != -1) {
            if(this.yearOfStudy > o.yearOfStudy) return 1;
            else if(this.yearOfStudy < o.yearOfStudy) return -1;
            else return 0;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
