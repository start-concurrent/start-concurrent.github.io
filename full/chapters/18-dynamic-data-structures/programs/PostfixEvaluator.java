import java.util.*;

public class PostfixEvaluator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine(); 				//<.>
        TermStack stack = new TermStack();
        for(int i = 0; i < expression.length(); i++) {	//<.>
            char term = expression.charAt(i); 	
            if(term >= '0'&& term <= '9')    			//<.>
                stack.push(new Term(term - '0'));
            else {
                int b = stack.pop().getValue();             
                int a = stack.pop().getValue();             
                switch(term) {							//<.>
                    case '+': stack.push(new Term(a + b));
                        break;
                    case '-': stack.push(new Term(a - b));
                        break;
                    case '*': stack.push(new Term(a * b));
                        break;
                    case '/': stack.push(new Term(a / b));
                        break;
                }
            }
        }
        System.out.println("The answer is: " + stack.top().getValue()); //<.>
    }
}