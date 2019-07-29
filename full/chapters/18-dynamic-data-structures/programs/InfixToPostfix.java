import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine(); 	//<.>
        TermStack stack = new TermStack();	//<.>
        String postfix = "";        		//<.>
        for(int i = 0; i < expression.length(); i++) {	//<.>
            char term = expression.charAt(i);
            if(term >= '0' && term <= '9')				//<.>
                postfix += term;        
            else if(term == '(')						//<.>
                    stack.push(new Term(term));
            else if(term == ')') {						//<.>
                while(stack.top().getOperator() != '(') {
                    postfix += stack.top().getOperator();
                    stack.pop();
                }
                stack.pop(); // Pop off the '('
            }
            else if(term == '*' || term == '/' || term == '+' || term == '-') {
                Term operator = new Term(term);			//<.>
                while(!stack.isEmpty() && stack.top().greaterOrEqual(operator)) {
                    postfix += stack.top().getOperator();
                    stack.pop();
                }
                stack.push(operator);
            }                   
        }

        while(!stack.isEmpty()) { 		//<.>
            postfix += stack.top().getOperator();
            stack.pop();
        }       
        System.out.println(postfix);	//<.>
    }
}