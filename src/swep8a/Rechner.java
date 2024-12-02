package swep8a;

import uebungen3A.InputTools;

public class Rechner {
	public static void main (String[] args) {
		char operator;
		int op1 = 0;
		int op2 = 0;
		boolean continueCalculation = true;

		System.out.println("Kleiner Rechner");
		
		while(continueCalculation = true) {
			System.out.println("\nAktuelle Operanden: " + op1 + " und " + op2);
			String input = InputTools.readString("Operatoren(+-*/&|^), Operanden (1,2) oder Ende(0)");
			if(input.equals("0")) {
				continueCalculation = false;
                System.out.println("Programm beendet.");
			}
			else if(input.equals("1")) {
				 op1 = InputTools.readInteger("Zahl1");	 
			}
			else if(input.equals("2")) {
				 op2 = InputTools.readInteger("Zahl2");
			}
			else if ("+-*/&|^".contains(input)) {
              operator = input.charAt(0);
              int result = calculate(op1, op2, operator);
              printOutput(op1, op2, operator, result);
              continueCalculation = false;
            } 
	    }
	}
		    public static int calculate(int op1, int op2, char op) {
		        switch (op) {
		            case '+':
		                return op1 + op2;
		            case '-':
		                return op1 - op2;
		            case '*':
		                return op1 * op2;
		            case '/':
		                if (op2 == 0) {
		                    System.out.println("Division durch 0 ist nicht erlaubt. Ergebnis ist 0.");
		                    return 0;
		                }
		                return op1 / op2;
		            case '&':
		                return op1 & op2;
		            case '|':
		                return op1 | op2;
		            case '^':
		                return op1 ^ op2;
		            default:
		                System.out.println("Ungültiger Operator. Ergebnis ist 0.");
		                return 0;
		        }
		    }

		    public static void printOutput(int op1, int op2, char op, int res) {
		        System.out.println(op1 + " " + op + " " + op2 + " = " + res);
		    }
		
//	      
//	        }
}