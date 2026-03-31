public class Intern extends Employee {

    // Constante para el límite de sueldo
    private static final double MAX_SALARY_LIMIT = 20000.0;

    // Constructor: Al llamar a super, ponemos "false" en el booleano de Full Time
    public Intern(String id, String name, double salary) {
        super(id, name, salary, false);
        setSalary(salary);
    }

    // Sobrescribimos el Rol
    @Override
    public String getRole() {
        return "INTERN STUDENT";
    }

    // Sobrescribimos el Setter
    @Override
    public void setSalary(double salary) {
        validateAndSetSalary(salary);
    }

    // Método interno de validación
    private void validateAndSetSalary(double salary) {
        if (salary > MAX_SALARY_LIMIT) {
            super.setSalary(MAX_SALARY_LIMIT);
        } else {
            super.setSalary(salary);
        }
    }
}