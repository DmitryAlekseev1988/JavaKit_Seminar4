public class Employee {
    private int serviceNumber;
    private int numberPhone;
    private String name;
    private int exp;

    public Employee(int serviceNumber, int numberPhone, String name, int exp) {
        this.serviceNumber = serviceNumber;
        this.numberPhone = numberPhone;
        this.name = name;
        this.exp = exp;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "# " + serviceNumber +
                ", Номер " + numberPhone +
                ", Имя " + name + '\'' +
                ", Стаж " + exp +
                 " лет" + '}';
    }
}
