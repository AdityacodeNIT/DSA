public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.settip(5);
        p1.setColor("pink");
        System.out.println(p1.getColor());

        BankAccounts b1 = new BankAccounts();

        Student aditya = new Student("aDITYa", 21, 88.60f);
        System.out.println(aditya.age);

        b1.name = "aalu";
        b1.setPassword("abcdef");
    }

}

class BankAccounts {
    private String Password;
    public String name;

    public void setPassword(String pwd) {
        Password = pwd;
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        this.color = newcolor;
    }

    int gettip() {
        return this.tip;
    }

    String getColor() {
        return this.color;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }

}

class Student {
    String name;
    int age;
    float Percentage;

    void calc(int math, int phy, int chem) {
        Percentage = (math + phy + chem) / 3;
    }

    Student(String name, int age, float Percentage) {
        this.name = name;
        this.age = age;
        this.Percentage = Percentage;
    }

}
