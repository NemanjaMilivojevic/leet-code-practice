public class FindtheIndexoftheFirstOccurrenceInaString {
    public static void main(String[] args) {
        System.out.println(strStr("sadxxxsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}
