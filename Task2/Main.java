package Task2;

public class Main {
    public static void main(String[] args) {
        Locker locker = new Locker();
        Man man = new Man("Дмитрий");
        System.out.println(man);
        locker.openCloseLocker();
    }
}
