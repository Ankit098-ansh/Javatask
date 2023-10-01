package Javatask;

import java.util.Random;
public class supphle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Create a Random object
        Random rand = new Random();

        // Iterate through the array in reverse order
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap the elements at indices i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Print the shuffled array
        System.out.println("Shuffled Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
	}

}
