public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        String prefix = "";
        boolean flag = true;
        var result = "";

        for (int i = 0; i < strs[0].length(); i++) {
            if (!flag)
                break;
                prefix += strs[0].charAt(i);
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    flag = false;
                    break;
                }
            }
                if (flag) {
                    result += strs[0].charAt(i);

            }
        }
        System.out.println(result);


    }
}