package homework_1;

interface PrintInterface {
    void showResults(String str);
}


public class ResearchTree extends Research implements FamilyTree, PrintInterface, ObjectIs{

    @Override
    public void research(Person person) {
        RelationShip[] relates = RelationShip.values();
        for (RelationShip relate : relates) {
            String object = objectIs(relate);
            StringBuilder result = new StringBuilder();
            for (Node node : TREE) {
                if (node.getPerson1().getFullName().equals(person.getFullName()) &&
                        node.getRelation() == relate) {
                    result.append(node.getPerson2()).append("\n");
                }
            }
            if (result.isEmpty()) {
                showResults(String.format("%s: данных не найдено.", object));
            } else {
                result.insert(0, String.format("%s: \n", object));
                showResults(result.toString());
            }
        }
    }
    public void showResults(String str) {
        System.out.println(str);
    }

}
