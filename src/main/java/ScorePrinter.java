import java.util.*;

public class ScorePrinter {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input word to get Scrabble score: ");
        String wordToBeScored = keyboard.nextLine();
        char[] characterArray = wordToBeScored.toCharArray();
        int[] scoredWord = letterSorter(characterArray);

    }

    private static int[] letterSorter(char[] characterArray) {
        Map<Character,Integer> scoredWordMap;
        List<Character> one = ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'];
        LetterValues listOne = new LetterValues(1, one);

    }
}
