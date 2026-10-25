package OOP;
class Employee{
    private final int id;
    private final String name;
    private final double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}
public class Method {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Jack",20000);
        e1.display();
    }
}
