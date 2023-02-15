package homework_1;

import java.util.ArrayList;

public class Research {
    private ArrayList<Node> tree;
    public Research(FamilyTree familyTree) {
        tree = familyTree.getTree();
    }

    public String searchParents(Person person) {
        StringBuilder result = new StringBuilder();
        for (Node node: tree) {
            if (node.getPerson1().getFullName().equals(person.getFullName()) &&
                    node.getRelation() == RelationShip.CHILD) {
                result.append(node.getPerson2()).append("\n");
            }
        }
        if (result.isEmpty()) {
            return String.format("О родителях %s данных не найдено.", person);
        } else {
            result.insert(0, String.format("Родители %s: \n", person));
            return result.toString();
        }
    }
    public String searchChildren(Person person) {
        StringBuilder result = new StringBuilder();
        for (Node node: tree) {
            if (node.getPerson1().getFullName().equals(person.getFullName()) &&
                    node.getRelation() == RelationShip.PARENT) {
                result.append(node.getPerson2()).append("\n");
            }
        }
        if (result.isEmpty()) {
            return String.format("О детях %s данных не найдено.", person);
        } else {
            result.insert(0, String.format("Дети %s: \n", person));
            return result.toString();
        }
    }
}
