public class Main {
    public static void main(String[] args) {

        // ---> TAREAS 1 Y 2 (Lógica de arrays)
        int[] data = {12, 45, 7, 33, 2, 19};
        System.out.println("--- TASKS 1 AND 2 ---");
        System.out.println("Difference (T1): " + ArrayLogic.getDifference(data));
        ArrayLogic.printTwoSmallest(data);

        // ---> TAREA 5: Lista de empleados y becarios
        System.out.println("\n--- TASK 5 => Employees & Interns ---");

        // Lista de 10 empleados
        String[] names = {
                "Manuel Candela", "Ana García", "Carlos Pérez", "Lucía Fernández",
                "David Jiménez", "Elena Ruiz", "Sergio Torres", "Marta Luna",
                "Iván Ramos", "Sonia Castro"
        };

        String[] ids = {
                "EMP-001", "EMP-002", "EMP-003", "EMP-004", "EMP-005",
                "EMP-006", "EMP-007", "EMP-008", "EMP-009", "EMP-010"
        };

        Employee[] employeeList = new Employee[10];

        for (int i = 0; i < employeeList.length; i++) {
            double increasingSalary = 25000.0 + (i * 4000.0);
            if (i < 7) {

                employeeList[i] = new Employee(ids[i], names[i], increasingSalary, true);
            } else {
                employeeList[i] = new Intern(ids[i], names[i], increasingSalary);
            }
        }

        // Imprimimos la lista
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        // Tarea 4: Validación
        System.out.println("\n--- Attempting to raise salaries above the limit ---");

        // 1. Probamos con Ana García

        employeeList[3].setSalary(60000.0);
        System.out.println("Salary of " + employeeList[3].getName() + " (Fixed): " + employeeList[3].getSalary());

        // 2. Probamos con Iván Ramos

        employeeList[8].setSalary(90000.0);
        System.out.println("Salary of " + employeeList[8].getName() + " (Intern): " + employeeList[8].getSalary());
    }
}