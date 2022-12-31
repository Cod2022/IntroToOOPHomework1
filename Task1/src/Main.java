public class Main {
    public static void main(String[] args) {
        Person sergei = new Person("Сергей", 45);
        Person irina = new Person("Ирина", 43);
        Person andrei = new Person("Андрей", 20);
        Person olga = new Person ("Ольга", 18);
        Person svetlana = new Person("Светлана", 16);

        GeoTree gt = new GeoTree();
        gt.append(sergei, andrei);
        gt.append(irina, olga);
        gt.append(irina, svetlana);

        System.out.println(gt);
        
        System.out.println(new Research(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Research(gt).findByAge());

        
    }

}
