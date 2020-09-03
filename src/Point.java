public class Point {
    //data (fields) "member variables" in C++
    private int x; //Instance field
    private int y; //Instance field

    //actions (methods) "member functions" in C++
    public Point() { //default constructor
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) { //constructor 2
        this.x = x;
        this.y = y;
    }

    //instance method
    public void translate(int deltaX, int deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public void sayMessage(String m){
        System.out.println(m);
        printSpaces(10);
    }

    private void printSpaces(int numSpace){
        for(int i = 0 ; i < numSpace; i++){
            System.out.print(" ");
        }
    }

    @Override // I am rewriting my parents' original method
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
