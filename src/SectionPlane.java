public class SectionPlane {
    private Section lhs;
    private Section rhs;

    SectionPlane(Section s1, Section s2){
        lhs = s1;
        rhs = s2;
    }

    public boolean isEqual() {
        return lhs.Length() == rhs.Length();
    }
}
