package less5_OOP.model.impl;

import less5_OOP.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    public final List<Integer> groups = new ArrayList<>();
    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

}
