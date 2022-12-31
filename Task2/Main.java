package Task2;
/*
 * Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. 
 * Какие члены должны быть у каждого из классов
 */

public class Main {
    public static void main(String[] args) {
        Locker locker = new Locker();
        Man man = new Man("Дмитрий");
        System.out.printf("Пользователь: %s", man);
        System.out.println();
        locker.openCloseLocker();
    }
}
