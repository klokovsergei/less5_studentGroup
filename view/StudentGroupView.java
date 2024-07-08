package less5_OOP.view;

import less5_OOP.controller.StudentGroupController;
import less5_OOP.model.impl.StudentGroup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentGroupView {
    public void studentGroupMenu() throws Exception{
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\n1 - создать студенческую группу\n" +
//                    "2 - найти студенческую группу по id\n" +
//                    "3 - распечатать информацию обо всех студенческих группах\n" +
                    "9 - вернуть в главное меню\n" +
                    "0 - выйти\n"+
                    "Ваш выбор: ");
            switch (scanner.nextInt()){
                case 1 -> createNewStudentGroup();
//                case 2 -> getById();
//                case 3 -> getAll();
                case 9 -> new TotalView().totalMenu();
                case 0 -> System.exit(0);
                default -> System.out.println("Команда не поддерживается.");
            }
        }
    }
    private StudentGroupController controller = new StudentGroupController();
    private StudentGroup createNewStudentGroup() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id учителя: ");
        int idTeacher = scanner.nextInt();
        Set<Integer> students = new HashSet<>();
        int idStudent = 0;
        while (idStudent != -1) {
            System.out.printf("Введите id %s студента или введите 0, чтобы закончить выбор студентов: ", students.size() + 1);
            idStudent = scanner.nextInt();
            students.add(idStudent);
        }
        return controller.createNewStudentGroup(idTeacher, students);
    }
}
