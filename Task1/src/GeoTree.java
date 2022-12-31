import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        // tree.add(new Node(children, Relationship.children, parent));
    }

    @Override
    public String toString() {
        return String.format("%s", tree); 
    }

}
