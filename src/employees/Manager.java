package employees;

public class Manager extends Employee {

    public int numberOfSubordinates;
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(){
        this.numberOfSubordinates = numberOfSubordinates;

    }
    public String toString(){
        return "Manager: " + getName() + " Salary: " + getSalary() + "Subordinates:" + this.numberOfSubordinates;
    }

}
