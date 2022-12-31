package Task2;

import java.util.Scanner;

public class Man {
    String name;

    public Man() {

    }

    public Man (String name) {
        this.name = name;
    }

    public int chooseState () {
        System.out.println("Введите:\n 1 - закрыть шкафчик\n 2 - открыть шкафчик\n 3 - выход из меню");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        return num;
    }

    @Override
    public String toString() {
        return String.format("%s", name); 
    }
}
