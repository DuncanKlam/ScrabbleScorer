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

        LetterValues listOne = new LetterValues(1, new char[]{'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'});
        LetterValues listTwo = new LetterValues(2, new char[]{'D', 'G'});
        LetterValues listThree = new LetterValues(3, new char[]{'B', 'C', 'M', 'P'});
        LetterValues listFour = new LetterValues(4, new char[]{'F', 'H', 'V', 'W', 'Y'});
        LetterValues listFive = new LetterValues(5, new char[]{'K'});
        LetterValues listEight = new LetterValues(8, new char[]{'J', 'X'});
        LetterValues listTen = new LetterValues(10, new char[]{'Q', 'Z'});

        for (char letter : characterArray){

        }





    }
}
