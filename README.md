# Student Management System

## Project Overview

The Student Management System is a simple Java-based application designed to manage student and teacher information. This system allows users to add, delete, and update student records, as well as display all student information. It utilizes Object-Oriented Programming (OOP) concepts such as inheritance, classes, and methods to organize the functionality. The project includes the following core classes:

- **Person**: A base class representing common attributes (name and age) for all people.
- **Student**: A subclass of `Person` representing a student with additional attributes such as `id` and `grade`.
- **Teacher**: A subclass of `Person` representing a teacher with additional attributes such as `section` and `salary`.
- **StudentManagement**: A class that manages an array of students, including methods for adding, deleting, and updating student records.

## Features

### Person Class
- Represents a generic person with basic attributes: `name` and `age`.
- Includes getters and setters for these attributes.

### Student Class
- Inherits from `Person` and adds additional attributes: `id` and `grade`.
- Methods to get and set `id` and `grade`.
- Additional methods such as `addStudent`, `deleteStudent`, and `displayStudent` can be added to manage students effectively.

### Teacher Class
- Inherits from `Person` and adds additional attributes: `section` and `salary`.
- Methods to get and set `section` and `salary`.
- Additional methods such as `addTeacher`, `deleteTeacher`, and `displayTeacher` can be added to manage teachers effectively.

### StudentManagement Class
- Manages an array of students with the following functionality:
  - **Add a Student**: Adds a new student to the system with name, age, ID, and grade.
  - **Delete a Student**: Deletes a student by their ID and shifts the remaining students accordingly.
  - **Change Student Information**: Allows modification of a student's information, either fully or partially.
  - **Display Students**: Displays the information of all students currently in the system.
  - **Method Overloading**: Includes an overloaded `changeStudentInfo` method that allows changing only the student's name.

## Requirements

- Java 8 or higher

## How to Use

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/student-management-system.git
    ```

2. **Compile and run the Java program**:
    - Use your favorite IDE (e.g., IntelliJ IDEA, Eclipse) or the command line to compile and run the `StudentManagement` class.
    - Example commands:
      ```bash
      javac StudentManagement.java
      java StudentManagement
      ```

3. **Add students, delete students, and update student information** using the methods defined in the `StudentManagement` class.

## Example Usage

```java
StudentManagement studentSystem = new StudentManagement(10);

// Add students
studentSystem.addStudent("John Doe", 20, 101, 85.5);
studentSystem.addStudent("Jane Smith", 22, 102, 90.2);

// Display all students
studentSystem.displayStudents();

// Change student info
studentSystem.changeStudentInfo(101, "John Doe Updated", 21, 88.5);

// Delete a student
studentSystem.deleteStudent(102);

// Display all students again
studentSystem.displayStudents();
