
public class Teacher extends Person {
    private String section;
    private double salary;

    public Teacher(String name, int age, String section, double salary) {
        super(name, age);
        this.section = section;
        this.salary = salary;
    }

    // Getters and setters for section and salary

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Additional methods for Teacher class, e.g., addTeacher, deleteTeacher, changeTeacherInfo, and displayTeacher
}
