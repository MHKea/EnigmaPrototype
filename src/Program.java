public class Program {
    int letterToIndex(char c)
    {
        var asciiVal = (int) c;
        int letterIndex;
        switch (asciiVal) {
            case  32: return 0;
            case 198: return 27;
            case 216: return 28;
            case 197: return 29;
            default: letterIndex = asciiVal - 64;
        }
        if(letterIndex < 0 || letterIndex > 26)
            return -1;
        return letterIndex;
    }
    char indexToLetter(int index)
    {
        switch (index) {
            case  0: return ' ';
            case 27: return 'Æ';
            case 28: return 'Ø';
            case 29: return 'Å';
        }
        if(index < 1 || index > 26)
            return ' ';
        var charVal = (char )(index + 64);
        return charVal;
    }
    public static void main(String[] args) {
        var app = new Program();
        var letter = 'A';
        var fromLetter = app.letterToIndex(letter);
        System.out.printf("Numeric value of '%s' is: %d%n",letter,fromLetter);
        var fromIndex = app.indexToLetter(fromLetter);
        System.out.printf("Char value of index %d is: %s%n",fromLetter,fromIndex);
    }
}
