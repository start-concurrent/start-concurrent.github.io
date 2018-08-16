import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {        
        Scanner in = new Scanner( System.in );
        String expression = in.nextLine();
        TermStack stack = new TermStack(expression.length());
        String postfix = "";        
        char term;  
        for( int i = 0; i < expression.length(); i++ ) {
            term = expression.charAt(i);
            if( term >= '0' && term <= '9' )
                postfix += term;        
            else if( term == '(' )
                    stack.push( new Term( term ));
            else if( term == ')' ) {
                while( stack.top().getOperator() != '(' ) {
                    postfix += stack.top().getOperator();
                    stack.pop();
                }
                stack.pop(); //pop off the '('
            }
            else if( term == '*' || term == '/' ||
                 term == '+' || term == '-' ) {
                Term operator = new Term( term );
                while( stack.size() > 0 &&
                    stack.top().greaterOrEqual( operator ) ) {
                    postfix += stack.top().getOperator();
                    stack.pop();
                }
                stack.push( operator );
            }                   
        }

        while( stack.size() > 0 ) {
            postfix += stack.top().getOperator();
            stack.pop();
        }       
        System.out.println(postfix);
    }
}