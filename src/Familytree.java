// Модель дерева семьи
public class FamilyTree {
    private Person root;

    public FamilyTree(Person root) {
        this.root = root;
    }

    public List<Person> getAllChildren(Person parent) {
        List<Person> children = new ArrayList<>();
        if (parent.getChildren().isEmpty()) {
            return children;
        } else {
            for (Person child : parent.getChildren()) {
                children.add(child);
                children.addAll(getAllChildren(child));
            }
            return children;
        }
    }
}
