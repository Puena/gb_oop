public class FamilyTree {
    private FamilyPerson root;

    public FamilyTree(FamilyPerson root) {
        this.root = root;
    }

    public void addPartner(FamilyPerson toPerson, Partner partner) {
        addPartner(toPerson, partner, this.root);
    }
    private void addPartner(FamilyPerson toPerson, Partner partner, FamilyPerson root) {
        if (toPerson == root) {
            root.setFamilies(partner);
            return;
        }
        for (Partner p : root.getFamilies()) {
            for (FamilyPerson fp : p.getHairs()) {
                addPartner(toPerson, partner, fp);
            }
        }
    }

    public void addHairs(FamilyPerson toPerson, Partner toPartner, FamilyPerson hair) {
        addHairs(toPerson, toPartner, hair, this.root);
    }

    private void addHairs(FamilyPerson toPerson, Partner toPartner, FamilyPerson hair, FamilyPerson root) {
        if (toPerson.equals(root)) {
            for (Partner p : toPerson.getFamilies()) {
                if (p.equals(toPartner)) {
                    p.setHairs(hair);
                    return;
                }
            }
        }
        for (Partner p : root.getFamilies()) {
            for (FamilyPerson fp : p.getHairs()) {
                addHairs(toPerson, toPartner, hair, fp);
            }
        }
    }

    @Override
    public String toString() {
        // TODO:
        return super.toString();
    }
}
