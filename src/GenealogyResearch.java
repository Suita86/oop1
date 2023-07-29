public class GenealogyResearch {
    private FamilyTree familyTree;

    public GenealogyResearch(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public List<Person> getAllChildren(Person parent) {
        return familyTree.getAllChildren(parent);
    }

    public List<Person> getAllDescendants(Person ancestor) {
        List<Person> descendants = new ArrayList<>();
        List<Person> children = getAllChildren(ancestor);
        descendants.addAll(children);
        for (Person child : children) {
            descendants.addAll(getAllDescendants(child));
        }
        return descendants;
    }
}
