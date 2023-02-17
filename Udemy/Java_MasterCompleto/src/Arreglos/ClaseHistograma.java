package Arreglos;

public class ClaseHistograma {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1}; // Crea un arreglo llamado myArray con 10 elementos
        int[] histogram = new int[5]; // Crea un arreglo llamado histogram con 5 elementos
        for (int i = 0; i < myArray.length; i++) { // Recorre el arreglo myArray
            int value = myArray[i]; // Obtiene el valor actual de myArray
            histogram[value - 1]++; // Incrementa en 1 el valor correspondiente en el histograma
        }
        for (int i = 0; i < histogram.length; i++) { // Recorre el arreglo histogram
            System.out.print((i + 1) + ": "); // Imprime el número actual
            for (int j = 0; j < histogram[i]; j++) { // Imprime tantos asteriscos como el valor correspondiente en el histograma
                System.out.print("*");
            }
            System.out.println(); // Va a la siguiente línea
        }
    }
}
