package ControlStatements;
public class ControlStatements{
	public static void main(String[] args) {
		System.out.println("if-else statement:"
				+ "\n--------------------");
		IfStatement();
		System.out.println("\ndo-while statement:"
				+ "\n--------------------");
		DoWhile();
		System.out.println("\nwhile loop statement:"
				+ "\n--------------------");
		WhileLoop();
		System.out.println("\nfor loop statement:"
				+ "\n--------------------");
		ForLoop();
		System.out.println("\nswitch case statement:"
				+ "\n--------------------");
		SwitchCase();
		System.out.println("\nbreak statement:"
				+ "\n--------------------");
		BreakStatement();
		System.out.println("\ncontinue statement:"
				+ "\n--------------------");
		ContinueStatement();
	}
	private static void ContinueStatement() {
		// TODO Auto-generated method stub
		for (int h = 0; h <= 10; h++) {
			if (h>3 && h<7) {
				continue;
			}
			 System.out.print(h+" ");
		}
		/* output:
	     * 0 1 2 3 7 8 9 10  
	     */
	}
	private static void BreakStatement() {
		// TODO Auto-generated method stub
		for (int j = 0; j <= 11; ++j) { 
            if (j == 5) {
                break;
            }      
            System.out.print(j+" ");
        }   
		/* output:
	     * 0 1 2 3 4 
	     */
	}
	private static void SwitchCase() {
		// TODO Auto-generated method stub
		 int n = 37;
		 String size;
		 switch (n) {
	      case 27:
	        size = "Small";
	        break;
	      case 37:
	        size = "Medium";
	        break;
	      case 47:
	        size = "Large";
	        break;
	      default:
	        size = "Unknown";
	        break; }
	    System.out.println("Size: " + size);
	    /* output:
	     * Size: Medium
	     */
	  }   
	
	private static void ForLoop() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			System.out.print(i+" ");
		}
		/* output:
	     * 0 1 2 3 4 5 6 7 8 
	     */
	}
	private static void WhileLoop() {
		// TODO Auto-generated method stub
		int a = 1;
		while(a<7) {
			System.out.print(a+" ");
			a++;
		}
		/* output:
	     *  1 2 3 4 5 6 
	     */
	}
	private static void DoWhile() {
		// TODO Auto-generated method stub
		int x = 1;
		do {
			System.out.print(x+" ");
			x++;
		} while (x<11);
		/* output:
	     * 1 2 3 4 5 6 7 8 9 10 
	     */
	}
	private static void IfStatement() {
		// TODO Auto-generated method stub
		int num = -5;
	    if (num > 0)
	    	System.out.println("The number is positive");
	    else
	    	System.out.println("The number is negative");
	    /* output:
	     * The number is negative
	     */
	}
}