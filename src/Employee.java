public class Employee {
    // Atributos
    private String id;
    private String name;
    private double salary;
    private boolean isFullTime;

    // Constructor
    public Employee(String id, String name, double salary, boolean isFullTime) {
        setId(id);
        setName(name);
        setSalary(salary);
        setFullTime(isFullTime);
    }

    public String getRole() {
        return "EMPLOYEE";
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public boolean isFullTime(){ return isFullTime; }
    public void setFullTime(boolean isFullTime) {this.isFullTime = isFullTime;}

    // toString()
    @Override
    public String toString() {
        // Si es fullTime, añadimos un "badge". Si no, se queda vacío.
        String statusTag = isFullTime ? " (Full-Time)" : "";

        return  "ID: '" + id + '\'' +
                ", Name: '" + name + '\'' +
                ", Salary: " + salary + "€  " +
                getRole() + statusTag;
    }
}