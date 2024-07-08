package less5_OOP.service;

import less5_OOP.model.db.DataBase;
import less5_OOP.model.impl.Teacher;

import java.util.List;

public class TeacherService implements UserService<Teacher>{

    @Override
    public Teacher create(String name, String lastName, int idGroup) {
        int id = DataBase.teachersDB.size() + 1;
        Teacher teacher = new Teacher(id, name, lastName);
        teacher.groups.add(idGroup);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    @Override
    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null)
            throw new Exception("Student don't find.");
        return teacher;
    }

    @Override
    public List<Teacher> getAll() { return DataBase.teachersDB; }
    public void addGroupId(Teacher teacher, int groupId) {
        teacher.groups.add(groupId);
    }
}
