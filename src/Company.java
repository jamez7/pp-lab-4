import employees.Employee;
import employees.Worker;

public class Company {
        public static void main(String[] args) {
            Employee[] Employees = {
                    new Employee("Jakub Kulikowski", 3000),
                    new Worker("Damian Bąk", 2000, "Woźny"),
                    new Employee("Andrzej Wsad", 4000),
                    new Employee("Marcin Bińkowski", 3000),
                    new Worker("Jeremiasz Korman", 2000, "Kamerdyner"),
            };



            System.out.println("Dane pracownika o indeksie 3: " + Employees[1].toString());

            Employees[3].setSalary(1000);


            Employees[3].toString();

            int i = 0;
            do {
                System.out.println(Employees[i].toString());
                i++;
            }
            while (i <= 4);



        }
    }
