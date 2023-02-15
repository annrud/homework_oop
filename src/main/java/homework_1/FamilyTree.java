package homework_1;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Node> getTree() {
        return tree;
    }


    public void append(Person parent, Person child) {
        Node nodeParent = new Node(parent, RelationShip.PARENT, child);
        Node nodeChild = new Node(child, RelationShip.CHILD, parent);
        if (!tree.contains(nodeParent)) {
            tree.add(nodeParent);
        }
        if (!tree.contains(nodeChild)) {
            tree.add(nodeChild);
        }
    }

    @Override
    public String toString() {
        return tree.toString();
    }
}
