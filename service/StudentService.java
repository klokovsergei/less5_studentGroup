package less5_OOP.service;

import less5_OOP.model.db.DataBase;
import less5_OOP.model.impl.Student;

import java.util.List;

public class StudentService implements UserService<Student> {
    @Override
    public Student create(String name, String lastName, int idGroup){
        int id = DataBase.studentsDB.size() + 1;
        Student student = new Student(id, name, lastName, idGroup);
        DataBase.studentsDB.add(student);
        return student;
    }
    @Override
    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null)
            throw new Exception("Student don't find.");
        return student;
    }

    @Override
    public List<Student> getAll(){
        return DataBase.studentsDB;
    }
}
