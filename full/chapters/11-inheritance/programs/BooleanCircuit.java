import java.util.*;

public class BooleanCircuit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Gate[] gates = new Gate[count];
        String name;
        int value;

        // Create gates
        for(int i = 0; i < count; i++) {
            name = in.next().toUpperCase();
            if(name.equals("true"))
                gates[i] = new True();
            else if(name.equals("false"))
                gates[i] = new False();
            else if(name.equals("AND"))
                gates[i] = new And();
            else if(name.equals("OR"))
                gates[i] = new Or();
            else if(name.equals("XOR"))
                gates[i] = new Xor();
            else if(name.equals("NOT"))
                gates[i] = new Not();
            else if(name.equals("OUTPUT")) {
                value = in.nextInt();
                gates[i] = new Output(value);
            }
        }       

        //connect gates
        while(in.hasNextInt()) {
            value = in.nextInt();
            name = gates[value].getName();
            if(name.equals("AND") || name.equals("OR") || name.equals("XOR")) {
                BinaryOperator operator = (BinaryOperator)gates[value];
                operator.setOperand1(gates[in.nextInt()]);
                operator.setOperand2(gates[in.nextInt()]);
            }
            else if(name.equals("NOT") || name.startsWith("OUTPUT")) {
                UnaryOperator operator = (UnaryOperator)gates[value];
                operator.setInput(gates[in.nextInt()]);
            }
        }
        
        // Compute output
        for(int i = 0; i < count; i++)
          if(gates[i].getName().startsWith("OUTPUT"))
            System.out.println(gates[i]);
      }
}