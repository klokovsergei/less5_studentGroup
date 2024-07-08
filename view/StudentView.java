package less5_OOP.view;

import less5_OOP.controller.StudentController;
import less5_OOP.model.impl.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    public void studentMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\n1 - создать студента\n" +
                    "2 - найти студента по id\n" +
                    "3 - распечатать информацию обо всех студентах\n" +
                    "9 - вернуть в главное меню\n" +
                    "0 - выйти\n"+
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
    private StudentController controller = new StudentController();
    private Student create(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите номер группы: ");
        int groupId = scanner.nextInt();
        return controller.create(name, lastName, groupId);
    }
    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id студента: ");
        int id = scanner.nextInt();
        return controller.getById(id);
    }
    private List<Student> getAll(){
        return controller.getAll();
    }
}
