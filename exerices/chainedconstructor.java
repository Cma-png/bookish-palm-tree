public class Employee {
    int ID;          // 4-digit integer
    String name;     // string
    String position; // "clerk" or "manager"
    int salary;      // clerk always $10000; manager $20000
    
    Employee(int ID, String name, String position, int salary) {
        // Complete the constructor here
        this.ID = ID;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    Employee(int ID, String name, String position) {
        // Complete the constructor here: you can assume the position is always "manager" here
        this(ID, name, "manager", 20000 );

    }        
    
    Employee(int ID, String name) {
        // Complete the constructor here
        this(ID, name, "clerk", 10000 );
    }    
    
    public void show() {
        System.out.printf("ID: %4d%n", ID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
    
    public static void main(String args[]) {
        Employee staff1, staff2, staff3;
        staff1 = new Employee(1001, "Samuel"); // default position is clerk with $10000 salary
        staff2 = new Employee(1002, "Franklin", "manager"); // default salary for manager is 20000
        staff3 = new Employee(1003, "John", "manager", 21000);
        
        staff1.show();
        staff2.show();
        staff3.show();
    }
}
