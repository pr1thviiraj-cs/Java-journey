package OOP;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args){
        Pen Pen1 = new Pen();
        Pen1.color = "Blue";
        Pen1.type = "BallPoint";

        Pen Pen2 = new Pen();
        Pen2.color = "Red";
        Pen2.type = "Gel";

        System.out.println("Pen 1 Details: ");
        Pen1.printcolor();
        Pen1.printType();
        System.out.println("\nPen 2 Details: ");
        Pen2.printcolor();
        Pen2.printType();
    }
}
