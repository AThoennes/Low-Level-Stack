/**
 * Alex Thoennes
 *  
 *  Dr. Bishop 
 *  
 *  CMPS 240
 *
 */
public class MyStack 
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		
		s.push(2);
		s.push(1);
		s.dumpStack();
		s.push(3);
		s.push(10);
		s.pop();
		s.push(15);
		s.dumpStack();
		s.pop();
		s.pop();
		s.dumpStack();
		s.pop();
		s.pop();
		s.pop();
		s.dumpStack();
	}
}
