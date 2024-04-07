package employees;

public class Worker extends Employee{

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }


    public String position;
    public String getPosition(){
        return this.position;
    }

    public void setPosition(){
        this.position = position;
    }

    public String toString(){
        return "Manager: " + getName() + " Salary: " + getSalary() + "Position:" + this.position;
    }
}
