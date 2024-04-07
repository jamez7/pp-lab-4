import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
        public static void main(String[] args) {
            Employee[] Employees = {
                    new Manager("Jakub Kulikowski", 3000, 4),
                    new Worker("Damian Bąk", 2000, "Woźny"),
                    new Employee("Andrzej Wsad", 4000),
                    new Employee("Marcin Bińkowski", 3000),
                    new Worker("Jeremiasz Korman", 2000, "Kamerdyner"),
            };


            int i = 0;
            do {
                System.out.println(Employees[i].toString());
                i++;
            }
            while (i <= 4);



        }
    }
