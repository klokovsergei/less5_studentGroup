package less5_OOP.view;

import less5_OOP.controller.TeacherController;
import less5_OOP.model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    public void teacherMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\n1 - создать учителя\n" +
                    "2 - найти учителя по id\n" +
                    "3 - распечатать информацию обо всех учителях\n" +
                    "9 - вернуть в главное меню\n" +
                    "0 - выйти\n" +
                    "Ваш выбор: ");
            switch (scanner.nextInt()){
                case 1 -> create();
                case 2 -> getById();
                case 3 -> getAll();
                case 9 -> new TotalView().totalMenu();
                case 0 -> System.exit(0);
                default -> System.out.println("Команда не поддерживается.");
            }
        }
    }
    private TeacherController controller = new TeacherController();
    private Teacher create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя учителя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию учителя: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите номер группы, где он преподает: ");
        int groupId = scanner.nextInt();
        return controller.create(name, lastName, groupId);
    }
    private Teacher getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id студента: ");
        int id = scanner.nextInt();
        return controller.getById(id);
    }
    private List<Teacher> getAll(){
        return controller.getAll();
    }
}
