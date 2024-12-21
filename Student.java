
    public class Student extends Person {
        private int id;
        private double grade;
    
        public Student(String name, int age, int id, double grade) {
            super(name, age);
            this.id = id;
            this.grade = grade;
        }
    
        // Getters and setters for id and grade
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public double getGrade() {
            return grade;
        }
    
        public void setGrade(double grade) {
            this.grade = grade;
        }
        
        // Additional methods for Student class, e.g., addStudent, deleteStudent, changeStudentInfo, and displayStudent?
    }
    
    

