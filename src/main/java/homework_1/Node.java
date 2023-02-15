package homework_1;

import lombok.Getter;

@Getter
public class Node {
    private Person person1;
    private RelationShip relation;
    private Person person2;
    public Node(Person person1, RelationShip relation, Person person2) {
        this.person1 = person1;
        this.relation = relation;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", person1, relation, person2);
    }

    @Override
    public boolean equals(Object other) {
        {
            if (!(other instanceof Node))
                return false;
            Node node = (Node) other;
            return node.toString().equals(this.toString());
        }
    }
}
