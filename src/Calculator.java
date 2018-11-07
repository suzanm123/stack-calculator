import java.util.Stack;

public class Calculator {
	 Stack<Integer> stack = new Stack<>();
		
	public void loadConstant(int i) {
		stack.push(i);
	}
	
	public  void add() {
		int sum= stack.get(0)+stack.get(1);
		stack.clear();
		stack.push(sum);
	}
	
	public void Subtract() {
		
		
	}
	
	public void multiply() {
		
	}
	
	public void divide() {
		
		
	}
	
	public String toString() {
	
		if(stack.isEmpty())
		{
			return "[].";
		}
		return stack.toString();
	
		
	}
	
	
	

}
