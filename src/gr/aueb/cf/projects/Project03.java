package gr.aueb.cf.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project03 {

    public static void main(String[] args) {
        String fileName = "C:/temp/project03.txt";

        // Create a 2D array displaying characters and their frequencies.
        Object[][] arr = new Object[128][2]; // Array storing maximum 128 characters and their frequencies
        int index = 0; // To keep track of the next available index in the array

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        continue; // Skip spaces
                    }

                    // Check if the character is already in the array
                    boolean found = false;
                    for (int i = 0; i < index; i++) {
                        if ((char) arr[i][0] == c) {
                            arr[i][1] = (int) arr[i][1] + 1; // Increment the frequency
                            found = true;
                            break; // No need to continue searching
                        }
                    }

                    // If character is not found, add it to the array
                    if (!found) {
                        arr[index][0] = c; // Store the character
                        arr[index][1] = 1; // Initialize the frequency to 1
                        index++;
                    }

                    // If the array is full, stop
                    if (index >= arr.length) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if ((int) arr[i][1] > (int) arr[j][1]) {
                    // Swap rows if arr[i][1] > arr[j][1]
                    Object[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Print out the populated array
        for (int i = 0; i < index; i++) {
            char character = (char) arr[i][0];
            int frequency = (int) arr[i][1];
            System.out.println("Character: " + character + ", Frequency: " + frequency);
        }
    }
}
