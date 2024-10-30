import java.util.ArrayList;
import java.util.List;

public class PhoneBookEmployee {
    public List<Employee> list = new ArrayList<>();

    public void addEmployee (Employee employee){
        list.add(employee);
    }

    @Override
    public String toString() {
        return "PhoneBookEmployee{" +
                "list=" + list +
                '}' + "\n";
    }
    public void printEmployee(){
        for (Employee e:list) {
            System.out.println(e);
        }
    }

    public void searchExperienceEmployee(int ex){
        for (Employee e:list) {
            if (e.getExp() == ex){
                System.out.println(e);
            }

        }
    }

    public void searchNumberName(String name){
        for (Employee e:list) {
            if (e.getName().equals(name)){
                System.out.println(e.getNumberPhone());
            }

        }
    }

    public void searchServiceNumberEmployee(int ex){
        for (Employee e:list) {
            if (e.getServiceNumber() == ex){
                System.out.println(e);
            }

        }
    }
}
