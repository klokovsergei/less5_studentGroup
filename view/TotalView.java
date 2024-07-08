package less5_OOP.view;

import less5_OOP.model.db.DataBase;

import java.util.Scanner;

public class TotalView {
    public void start(){
        DataBase.fillDB();
        totalMenu();
    }
    public void totalMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\n1 - раздел \"студентов\"\n" +
                    "2 - раздел \"учителей\"\n" +
                    "3 - управление студенческими группами \n" +
                    "0 - выйти\n"+
                    "Ваш выбор: ");
            switch (scanner.nextInt()){
                case 1 -> new StudentView().studentMenu();
                case 2 -> new TeacherView().teacherMenu();
                case 3 -> {try {new StudentGroupView().studentGroupMenu();}
                            catch (Exception e) {}}
                case 0 -> System.exit(0);
                default -> System.out.println("Команда не поддерживается.");
            }
        }
    }
}
