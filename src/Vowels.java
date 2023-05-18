public class Vowels {
    public static void main(String[] args) {
        System.out.println(getCount("This website is for losers LOL!"));
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static int getCount(String str) {
        int count = 0;
        if (str.isEmpty()) {
            return count;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String disemvowel(String str) {
        String s = "";
        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            if (lowerCaseStr.charAt(i) != 'a' && lowerCaseStr.charAt(i) != 'e' && lowerCaseStr.charAt(i) != 'i' && lowerCaseStr.charAt(i) != 'o' && lowerCaseStr.charAt(i) != 'u') {
                s += str.charAt(i);
            }
        }
        return s;
        //return str.replaceAll("[aAeEiIoOuU]", "");
        // kratko resenje
    }
}
