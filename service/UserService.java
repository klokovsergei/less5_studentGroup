package less5_OOP.service;

import less5_OOP.model.User;

import java.util.List;

public interface UserService<T extends User> {
    T create(String name, String lastName, int idGroup);
    T getById(int id) throws Exception;
    List<T> getAll();
}
