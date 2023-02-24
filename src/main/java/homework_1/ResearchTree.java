package homework_1;

interface PrintInterface {
    void showResults(String str);
}


public class ResearchTree extends Research implements FamilyTree, PrintInterface{

    @Override
    public void research(Person person) {
        Relationship[] relates = Relationship.values();
        for (Relationship relate : relates) {
            StringBuilder result = new StringBuilder();
            for (Node node : tree) {
                if (node.getPerson1().getFullName().equals(person.getFullName()) &&
                        node.getRelation() == relate) {
                    result.append(node.getPerson2()).append("\n");
                }
            }
            if (result.isEmpty()) {
                showResults(String.format("%s: данных не найдено.", relate.getTranslate()));
            } else {
                result.insert(0, String.format("%s: \n", relate.getTranslate()));
                showResults(result.toString());
            }
        }
    }
    public void showResults(String str) {
        System.out.println(str);
    }

}
