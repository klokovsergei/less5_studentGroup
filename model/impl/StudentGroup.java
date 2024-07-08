package less5_OOP.model.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentGroup {
    private int idGroup;
    private Teacher teacher;
    private final Set<Student> students = new HashSet<>();

    public StudentGroup(int idGroup, Teacher teacher, Set<Student> students) {
        this.idGroup = idGroup;
        this.teacher = teacher;
        this.students.addAll(Set.copyOf(students));
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public boolean addStudents(Student student) {
        return students.add(student);
    }
    public boolean dellStudents(Student student) {
        return students.remove(student);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "\nteacher=" + teacher +
                "\n, students=" + students +
                '}';
    }
}
