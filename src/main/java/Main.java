import utils.WordScorer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Enter a word to score\nOR\n(type '0' to exit):");
                String wordToBeScored = br.readLine();
                if (wordToBeScored.equals("0")) {
                    break;
                }
                else {
                    char[] characterArray = wordToBeScored.toUpperCase().toCharArray();
                    System.out.printf("%s: %d\n", wordToBeScored.toUpperCase(), WordScorer.scoreWord(characterArray));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
