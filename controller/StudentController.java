package less5_OOP.controller;

import less5_OOP.model.impl.Student;
import less5_OOP.service.StudentService;

public class StudentController extends UserController<Student>{

    public StudentController() {
        super(new StudentService());
    }
}
