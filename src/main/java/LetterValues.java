import java.util.List;

public class LetterValues {
    char[] letters;
    int value;

    public LetterValues(int v, char[] l){
        value = v;
        letters = l;
    }

    public int isContainedInList(char aCharacter){
        for (char letter : letters){
            if (aCharacter == letter){
                return value;
            }
        }
        return 0;
    }

}
