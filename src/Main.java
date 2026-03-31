import java.util.ArrayList;
import java.util.List;

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
        List<String> names = new ArrayList<>();
        names.add("Manuel Candela");
        names.add("Ana García");
        names.add("Carlos Pérez");
        names.add("Lucía Fernández");
        names.add("David Jiménez");
        names.add("Elena Ruiz");
        names.add("Sergio Torres");
        names.add("Marta Luna");
        names.add("Iván Ramos");
        names.add("Sonia Castro");

        List<String> ids = new ArrayList<>();
        ids.add("EMP-001");
        ids.add("EMP-002");
        ids.add("EMP-003");
        ids.add("EMP-004");
        ids.add("EMP-005");
        ids.add("EMP-006");
        ids.add("EMP-007");
        ids.add("EMP-008");
        ids.add("EMP-009");
        ids.add("EMP-010");

        List<Employee> employeeList = new ArrayList<>();
        System.out.println(ids.get(1));
        //METODO DE CREAR EMPLEADOS ALEATORIOS BY IGOR!

        for (int i = 0; i < names.size(); i++) {
            if (i % 3 == 0) {
                employeeList.add(new Intern(ids.get(i), names.get(i), 18000.0));
            } else {
                employeeList.add(new Employee(ids.get(i), names.get(i), 30000.0, true));
            }
        }
//        for (int i = 0; i < names.size(); i++) {
//            double increasingSalary = 25000.0 + (i * 4000.0);
//            if (i < 5) {
//                employeeList.add(new Employee(ids.get(i), names.get(i), increasingSalary, true));
//            } else {
//                employeeList.add(new Intern(ids.get(i), names.get(i), increasingSalary));
//            }
//        }

        // Imprimimos la lista
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Tarea 4: Validación
        System.out.println("\n--- Attempting to raise salaries above the limit ---");

        // 1. Probamos con Ana García

        employeeList.get(3).setSalary(22200.0);
        System.out.println("Salary of " + employeeList.get(3).getName() + " (Fixed): " + employeeList.get(3).getSalary());

        // 2. Probamos con Iván Ramos

        employeeList.get(9).setSalary(40000.0);
        System.out.println("Salary of " + employeeList.get(9).getName() + " (Intern): " + employeeList.get(9).getSalary());
    }
}