package less5_OOP.model.db;

import less5_OOP.model.impl.Student;
import less5_OOP.model.impl.StudentGroup;
import less5_OOP.model.impl.Teacher;

import java.util.*;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final Map<Integer, StudentGroup> studentGroupDB = new HashMap<>();
    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Anna", "Ivanova");
        //teacher.addGroupId(1);
        teachersDB.add(teacher);

        Student student1 = new Student(1, "Petr", "Sidorov", 1);
        Student student2 = new Student(2, "Alina", "Zhirova", 1);
        studentsDB.add(student1);
        studentsDB.add(student2);
        studentGroupDB.put(1, new StudentGroup(1, teacher, new HashSet<>(List.of(student1, student2))));
    }
}
