public class Employee {
    private String fullName;
    private double salary;

    public String getName(){
        return this.fullName;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return "Employee: " + getName() + " Salary: " + getSalary();
    }




}
