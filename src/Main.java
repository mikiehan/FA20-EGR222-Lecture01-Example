public class Main {
    //main methods
    public static final int ZERO = 0;

    public static void main(String[] args) {
        System.out.println(Student.DISCOUNT);
        System.out.println(Main.ZERO); //static field (constant)
        Student.study(10); //static method

        Student s1 = new Student("Tyler", 123, "CBU");
        Student s2 = new Student("Jones", 456, "UCR");
        Student s3 = new Student("Nathan", 678, "CBU");

        s1.introduce();
        s2.introduce();
        System.out.println(s1.name);

////        int x = 100; //primitive type (int, double, float, boolean ... "simple" type)
////        System.out.println(x);
////        Point p1 = new Point(3, 1); //creating an object
////        Point p2 = new Point(5, 4);
////        Point p3 = new Point(-1, -1);
////
////        System.out.println(p1); //p1.toString() method is called implicitly
////        System.out.println(p2);
////        System.out.println(p3);
////
////        p1.translate(10, 20);
////        System.out.println(p1);
////
////        p1.sayMessage("Hello");
////        p2.sayMessage("CBU");
////        p3.sayMessage("Hello");
//
    }
}
