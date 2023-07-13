package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Added";
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> myStudent = studentRepo.findById(id);
        return myStudent.orElse(null);
    }


    public String updateStudentByDepartment(Long id, Department dept) {
        Optional<Student> myStudent = studentRepo.findById(id);
        if(myStudent.isEmpty())
            return "Id Not Found: "+id;

//        Student student = myStudent.get();        we can also use this method.
//        student.setDept(dept);
//        studentRepo.save(student);

        myStudent.get().setDept(dept);
        studentRepo.save(myStudent.get());
        return "Updated Department";
    }

    public String deleteStudent(Long id) {
        if(studentRepo.findById(id).isEmpty())
            return "Id Not Found: "+id;

        studentRepo.deleteById(id);
        return "Student by this id: "+id+" Deleted";
    }
}
