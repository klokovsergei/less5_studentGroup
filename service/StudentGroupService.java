package less5_OOP.service;

import less5_OOP.model.db.DataBase;
import less5_OOP.model.impl.Student;
import less5_OOP.model.impl.StudentGroup;
import less5_OOP.model.impl.Teacher;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StudentGroupService {

    public StudentGroup createNewStudentGroup(int idTeacher, Set<Integer> students) throws Exception{
        int maxKey = Collections.max(DataBase.studentGroupDB.keySet());
        int idGroup = maxKey + 1;
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(x -> x.getId() == idTeacher)
                .findFirst()
                .orElse(null);
        if (teacher == null)
            throw new Exception("Teacher don't find.");
        Set<Student> studentSet = new HashSet<>();
        for(int s : students){
            Student student = DataBase.studentsDB
                    .stream()
                    .filter(x -> x.getId() == s)
                    .findFirst()
                    .orElse(null);
            if (student == null)
                throw new Exception("Student don't find.");
        }
        StudentGroup newStudentGroup = new StudentGroup(idGroup, teacher, studentSet);
        DataBase.studentGroupDB.put(idGroup, newStudentGroup);
        return newStudentGroup;
    }

    public StudentGroup readStudentGroup(int key){
        return DataBase.studentGroupDB.get(key);
    }
}
