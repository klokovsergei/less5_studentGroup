package less5_OOP.model.impl;

import less5_OOP.model.User;

public class Student extends User {
    int groupId;
    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }
}
