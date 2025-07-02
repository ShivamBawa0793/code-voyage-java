import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println("Balanced String : "+balancedString(str));
    }

    public static boolean balancedString(String str){
        Stack<Character> stack = new Stack<>();
        for(char element : str.toCharArray()){
            if(element == '(' || element == '[' || element == '{'){
                stack.push(element);
            }else if(element == ')' || element == ']' || element == '}'){
                if(stack.empty()){
                    return false;
                }
                char topElement = stack.pop();
                if(element == ')' && topElement !='('){
                    return false;
                } else if (element == ']' && topElement !='[') {
                    return false;
                } else if (element == '}' && topElement !='{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
