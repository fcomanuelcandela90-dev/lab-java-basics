public class ArrayLogic {

    // TASK 1: Método para obtener la diferencia
    public static int getDifference(int[] numbers) {
        if (numbers.length < 1) return 0;

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max - min;
    }

    // TASK 2: Encontrar el más pequeño y el segundo más pequeño
    public static void printTwoSmallest(int[] numbers) {
        // Validación: Necesitamos al menos 2 números para comparar
        if (numbers.length < 2) {
            System.out.println("The array must have at least 2 elements.");
            return;
        }

        // Inicializamos con el valor más alto posible en Java
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                // El antiguo más pequeño ahora es el segundo más pequeño
                secondSmallest = smallest;
                // El actual es el nuevo "rey" de la pequeñez
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                // Si el número no es el más pequeño, pero es menor que el segundo
                secondSmallest = num;
            }
        }

        System.out.println("The smallest is: " + smallest);
        System.out.println("The second smallest is: " + secondSmallest);
    }
}