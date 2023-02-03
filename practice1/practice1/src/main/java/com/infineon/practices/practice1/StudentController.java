package com.infineon.practices.practice1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Sagar", "T");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ramkumar", "JD"));
        students.add(new Student("Aarthi", "M"));
        students.add(new Student("Jason", "Bourne"));
        students.add(new Student("Vivek", "Malviya"));
        students.add(new Student("Rajesh", "Verma"));

        return students;
    }

    @GetMapping("/student/{firstName}/{lastName}/")
    public Student getStudent(@PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("/student/query")
    public Student getStudentInfo(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
