
interface ABC {
    int x=100;
    void m1();
}

interface XYZ {
    int y = 200;
    void m2();
}

public class MultipleInheritance implements ABC, XYZ {

    public void m1() {
        System.out.println(x);
    }
    public void m2() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.m1();
        obj.m2();
    }

}
