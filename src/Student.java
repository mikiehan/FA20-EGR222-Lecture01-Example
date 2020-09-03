public class Student {
    public String name; //instance field
    private int ID; //instance field
    private String schoolName; //instance field (belongs to an instance, one copy per instance is kept)
    public static final boolean DISCOUNT = true; //static constant field (belongs to a Class - only one copy kept!)

    public Student(String name, int ID, String schoolName) {
        this.name = name;
        this.ID = ID;
        this.schoolName = schoolName;
    }

    //static method (belongs to Class)
    public static void study(int hours){
        System.out.println("studying for " + hours + " hours");
    }

    //instance method (belongs to an instance)
    public void introduce(){
        System.out.println("Hi my name is " + name + " and I go to " + schoolName);
    }
}
