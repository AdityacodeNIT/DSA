public class SStaatic {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.school = "NITMZ";

        Students s2 = new Students();
        System.out.println(s2.school);

    }

}

class Students {
    String name;
    int rollno;

    static String school;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
