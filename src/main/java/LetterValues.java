import java.util.List;

public class LetterValues {
    List<Character> letters;
    int value;

    public LetterValues(int v, List l){
        value = v;
        letters = l;
    }

    public int isContainedInList(char aCharacter){
        for (char letter : letters){
            if (aCharacter == letter){
                return value;
            }
        }
        return 1;
    }

}
