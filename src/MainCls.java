public class MainCls {

    public static void main(String[] args) {
        SectionPlane section = new SectionPlane(new Section(1,1,2,2), new Section(-3,0, 1, 1));

        System.out.println(section.isEqual());
    }
}
