package less5_OOP.controller;

import less5_OOP.model.User;
import less5_OOP.service.UserService;

import java.util.List;

public class UserController<T extends User> {
    public UserController(UserService service){
        this.service = service;
    }
    protected UserService<T> service;
    public T create(String name, String lastName, int idGroup){
        T user = service.create(name, lastName, idGroup);
        System.out.println(user);
        return user;
    }
    public T getById(int id){
        T user = null;
        try{
            user = service.getById(id);
        } catch (Exception e) { e.getMessage(); }
        System.out.println(user);
        return user;
    }
    public List<T> getAll(){
        List<T> list = service.getAll();
        System.out.println(list);
        return list;
    }
}
