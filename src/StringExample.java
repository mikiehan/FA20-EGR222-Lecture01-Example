public class StringExample {
    public static void main(String[] args) {
        int x = 10; //primitive types (double boolean) value comparison
        int y = 10;
        System.out.println(x == y); //value comparison

        String s1 = "hello";

        String s2 = new String("hello");
        String s3 = new String("hello");

        System.out.println(s1 == s2); //true??
        System.out.println(s2 == s3); //true??

        System.out.println(s2.equals(s3)); //content char by char comparison
        System.out.println(s1.equals(s2)); //content char by char comparison

    }
}
