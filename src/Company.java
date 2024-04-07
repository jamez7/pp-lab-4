import employees.Employee;

public class Company {
        public static void main(String[] args) {
            Employee[] Employees = new Employee[5];
            Employees[0]= new Employee();
            Employees[1]= new Employee();
            Employees[2]= new Employee();
            Employees[3]= new Employee();
            Employees[4]= new Employee();


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
