public class Term { 
    private int value;  
    private char operator;
    private boolean isOperator;

    public Term(int value) {
        this.value = value;
        isOperator = false;
    }
    
    public Term(char operator) {
        this.operator = operator;
        isOperator = true;
    }

    public int getValue() { return value; } 
    public char getOperator() { return operator; }          
    public boolean isOperator() { return isOperator; }  

    public boolean greaterOrEqual(Term term) {
        if(isOperator())
            switch(operator) {            
                case '*':
                case '/': return true;              
                case '+':
                case '-': return term.operator != '*' && term.operator != '/';
                default: return false;
            }       
        else
            return false;
    }
}