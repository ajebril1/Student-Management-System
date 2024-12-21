public class StudentMangement {
    
        // Define arrays to store student information
        private String[] names;
        private int[] ages;
        private int[] ids;
        private double[] grades;
        private int numberOfStudents; // To keep track of the number of students in the system
    
        // Constructor to initialize arrays and other variables
        public StudentMangement(int maxSize) {
            names = new String[maxSize];
            ages = new int[maxSize];
            ids = new int[maxSize];
            grades = new double[maxSize];
            numberOfStudents = 0; // Initially, there are no students
        }
    
        // Method to add a new student
        public void addStudent(String name, int age, int id, double grade) {
            if (numberOfStudents < names.length) {
                names[numberOfStudents] = name;
                ages[numberOfStudents] = age;
                ids[numberOfStudents] = id;
                grades[numberOfStudents] = grade;
                numberOfStudents++;
            } else {
                System.out.println("Student database is full. Cannot add more students.");
            }
        }
    
        // Method to delete a student by ID
        public void deleteStudent(int id) {
            int indexToDelete = -1;
            for (int i = 0; i < numberOfStudents; i++) {
                if (ids[i] == id) {
                    indexToDelete = i;
                    break;
                }
            }
    
            if (indexToDelete != -1) {
                // Shift the remaining students to fill the gap
                for (int i = indexToDelete; i < numberOfStudents - 1; i++) {
                    names[i] = names[i + 1];
                    ages[i] = ages[i + 1];
                    ids[i] = ids[i + 1];
                    grades[i] = grades[i + 1];
                }
                // Clear the last element
                names[numberOfStudents - 1] = null;
                ages[numberOfStudents - 1] = 0;
                ids[numberOfStudents - 1] = 0;
                grades[numberOfStudents - 1] = 0.0;
                numberOfStudents--;
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }
    
        // Method to change student information by ID
        public void changeStudentInfo(int id, String name, int age, double grade) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (ids[i] == id) {
                    names[i] = name;
                    ages[i] = age;
                    grades[i] = grade;
                    break;
                }
            }
        }
    
        // Method to display all students
        public void displayStudents() {
            System.out.println("Student Information:");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Name: " + names[i]);
                System.out.println("Age: " + ages[i]);
                System.out.println("ID: " + ids[i]);
                System.out.println("Grade: " + grades[i]);
                System.out.println("---------------");
            }
        }
    
        // Example of method overloading to change only the name
        public void changeStudentInfo(int id, String name) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (ids[i] == id) {
                    names[i] = name;
                    break;
                }
            }
        }
    }
    

