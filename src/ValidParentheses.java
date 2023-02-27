import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "())[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid (String s){
        Stack<Character> stack = new Stack<>();
        for(var el : s.toCharArray()){
            if(el == '(' || el == '{' || el == '['){
                stack.push(el);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((top == '(' && el != ')') || (top == '[' && el != ']') || (top == '{' && el != '}') ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}

