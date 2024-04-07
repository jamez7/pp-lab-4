package employees;

public class Worker extends Employee{


    public String position;
    public getPosition(){
        return this.position;
    }

    public void setPosition(){
        this.position = position;
    }

    public String toString(){
        return "Manager: " + getName() + " Salary: " + getSalary() + "Position:" + this.position;
    }
}
