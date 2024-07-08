package less5_OOP.controller;

import less5_OOP.model.impl.StudentGroup;
import less5_OOP.service.StudentGroupService;

import java.util.Set;

public class StudentGroupController {
    private StudentGroupService service;
    public StudentGroupController(){
        this.service = new StudentGroupService();
    }

    public StudentGroup createNewStudentGroup(int idTeacher, Set<Integer> students) throws Exception{
        StudentGroup studentGroup = service.createNewStudentGroup(idTeacher, students);
        System.out.println(studentGroup);
        return studentGroup;
    }
//    public StudentGroup createNewStudentGroup(Teacher teacher, List<Student> students){
//        int maxKey = Collections.max(DataBase.studentGroupDB.keySet());
//        int idGroup = maxKey + 1;
//        StudentGroup newStudentGroup = new StudentGroup(teacher, students);
//        DataBase.studentGroupDB.put(idGroup, newStudentGroup);
//        return newStudentGroup;
//    }
//
//    public StudentGroup readStudentGroup(int key){
//        return DataBase.studentGroupDB.get(key);
//    }
}
