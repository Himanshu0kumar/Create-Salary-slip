package SalarySlip;

public class Emplyee {
    private int id ;  // Instrance variable 
    private String name ;
    private double salary ;
    private EmplyeeOperation emplyeeOperation ;
    private Printing printing ;
    
    public Emplyee(int id, String name, double salary) {  // int id is local variable 

        // Instrance var = Local variable 
        this.id = id;
        this.name = name;  
        this.salary = salary;
        printing = new Printing();
        emplyeeOperation = new EmplyeeOperation(this.salary);
    }

    
    public void setEmplyeeOperation(EmplyeeOperation emplyeeOperation) {
        this.emplyeeOperation = emplyeeOperation;
    }


    public EmplyeeOperation getEmplyeeOperation() {
        return emplyeeOperation;
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    public void print(){
        printing.printSalarySlip(this);
    }
    
}
