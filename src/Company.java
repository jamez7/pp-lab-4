 public class Company {
        public static void main(String[] args) {
            Employee[] Employees = new Employee[5];
            Employees[3] = new Employee();


            System.out.println("Dane pracownika o indeksie 3: " + Employees[3].toString());

            Employees[3].setSalary(1000);


            Employees[3].toString();

            int i = 1;
            do {
                Employees[i].toString();
                i++;
            }
            while (i <= 5);

        }
    }
