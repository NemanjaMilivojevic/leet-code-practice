public class RomanToInteger {
    //https://leetcode.com/problems/roman-to-integer/
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }
    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            var x = s.charAt(i);
            var y = ' ';
            if (s.length() > i + 1) {
                y = s.charAt(i + 1);
            }

            if (x == 'I' && y == 'V') {
                total += 4;
                i++;
            } else if (x == 'I' && y == 'X') {
                total += 9;
                i++;
            } else if (x == 'X' && y == 'L') {
                total += 40;
                i++;
            } else if (x == 'X' && y == 'C') {
                total += 90;
                i++;
            } else if (x == 'C' && y == 'D') {
                total += 400;
                i++;
            } else if (x == 'C' && y == 'M') {
                total += 900;
                i++;
            } else {
                switch (x) {
                    case 'I':
                        total += 1;
                        break;
                    case 'V':
                        total += 5;
                        break;
                    case 'X':
                        total += 10;
                        break;
                    case 'L':
                        total += 50;
                        break;
                    case 'C':
                        total += 100;
                        break;
                    case 'D':
                        total += 500;
                        break;
                    case 'M':
                        total += 1000;
                        break;
                }
            }
        }
        return total;
    }

    public static int solutionFromLeetCode(String s) {
        int ans=0,prev=0,num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(num<prev)
                ans-=num;
            else
                ans+=num;
            prev=num;
            System.out.println(ans);
        }
        return ans;
    }
}
