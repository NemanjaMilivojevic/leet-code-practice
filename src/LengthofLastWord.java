public class LengthofLastWord {
    public static void main(String[] args) {
        String string = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(string));
    }

    public static int lengthOfLastWord(String s) {
        var stringArray = s.split(" ");
        var lastWord = stringArray[stringArray.length - 1];

        return lastWord.length();
    }
}
