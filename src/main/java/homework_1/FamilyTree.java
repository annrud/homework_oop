package homework_1;

import java.util.ArrayList;

interface FamilyTree {
    ArrayList<Node> tree = new ArrayList<>();

    default void append(Person parent, Person child) {
        Node nodeParent = new Node(parent, Relationship.PARENT, child);
        Node nodeChild = new Node(child, Relationship.CHILD, parent);
        if (!tree.contains(nodeParent)) {
            tree.add(nodeParent);
        }
        if (!tree.contains(nodeChild)) {
            tree.add(nodeChild);
        }
    }
}

