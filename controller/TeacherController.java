package less5_OOP.controller;

import less5_OOP.model.impl.Teacher;
import less5_OOP.service.TeacherService;

public class TeacherController extends UserController<Teacher> {
    public TeacherController() {
        super(new TeacherService());
    }
}
