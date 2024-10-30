public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10, 845, "Nik1", 6);
        Employee employee2 = new Employee(11, 845, "Nik2", 3);
        Employee employee3= new Employee(13, 257677, "Nik3", 3);
        Employee employee4 = new Employee(10, 84543534, "Nik5", 2);
        Employee employee5 = new Employee(110, 22346667, "Nik5", 1);
        Employee employee6= new Employee(13, 845, "Nik6", 2);

        PhoneBookEmployee phoneBookEmployee = new PhoneBookEmployee();

        phoneBookEmployee.addEmployee(employee1);
        phoneBookEmployee.addEmployee(employee2);
        phoneBookEmployee.addEmployee(employee3);
        phoneBookEmployee.addEmployee(employee4);
        phoneBookEmployee.addEmployee(employee5);
        phoneBookEmployee.addEmployee(employee6);


        phoneBookEmployee.printEmployee();
        System.out.println("--------------------");
        phoneBookEmployee.searchExperienceEmployee(2);
        System.out.println("--------------------");
        phoneBookEmployee.searchNumberName("Nik5");
        System.out.println("--------------------");
        phoneBookEmployee.searchServiceNumberEmployee(110);
    }
}
