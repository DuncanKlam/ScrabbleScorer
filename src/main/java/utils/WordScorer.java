package utils;

public class WordScorer {
    private static LetterValues listOne = new LetterValues(1, new char[]{'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'});
    private static  LetterValues listTwo = new LetterValues(2, new char[]{'D', 'G'});
    private static LetterValues listThree = new LetterValues(3, new char[]{'B', 'C', 'M', 'P'});
    private static LetterValues listFour = new LetterValues(4, new char[]{'F', 'H', 'V', 'W', 'Y'});
    private static LetterValues listFive = new LetterValues(5, new char[]{'K'});
    private static LetterValues listEight = new LetterValues(8, new char[]{'J', 'X'});
    private static LetterValues listTen = new LetterValues(10, new char[]{'Q', 'Z'});
    private static LetterValues[] listOfLetterValuesLists = new LetterValues[]{listOne,listTwo,listThree,listFour,listFive,listEight,listTen};


    public static int scoreWord(char[] characterArray) {
        int sum = 0;
        for (char letter : characterArray){
            for (LetterValues list : listOfLetterValuesLists){
                if(list.characterIsContainedInList(letter)){
                    sum += list.getValue();
                }
            }
        }
        return sum;
    }
}
