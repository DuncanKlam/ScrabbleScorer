package utils;

public class LetterValues {

    char[] letters;
    int value;

    public LetterValues(int v, char[] l){
        value = v;
        letters = l;
    }

    public boolean characterIsContainedInList(char aCharacter){
        for (char letter : letters){
            if (aCharacter == letter){
                return true;
            }
        }
        return false;
    }

    public int getValue() {
        return value;
    }
}
