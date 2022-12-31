import java.util.ArrayList;
import java.util.Scanner;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> findByAge() {
        Scanner in = new Scanner(System.in, "ibm866");
        System.out.println("Введите границу возраста: ");
        int inputAge = in.nextInt();
        in.close();
        for (Node t : tree) {
            if (inputAge >= t.p1.age) {
                result.add(t.p1.fullName);
            }
            if (inputAge >= t.p2.age) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

}
