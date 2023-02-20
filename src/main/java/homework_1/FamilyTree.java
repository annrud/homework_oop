package homework_1;

import java.util.ArrayList;

interface FamilyTree {
    ArrayList<Node> TREE = new ArrayList<>();

    default void append(Person parent, Person child) {
        Node nodeParent = new Node(parent, RelationShip.PARENT, child);
        Node nodeChild = new Node(child, RelationShip.CHILD, parent);
        if (!TREE.contains(nodeParent)) {
            TREE.add(nodeParent);
        }
        if (!TREE.contains(nodeChild)) {
            TREE.add(nodeChild);
        }
    }
}
