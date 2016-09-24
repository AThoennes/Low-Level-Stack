public interface StackInterface<E>
{
	void push(E thing);
	
	void pop();
	
	void dumpStack();
	
	boolean stackEmpty(E [] array);
	
	boolean stackFull(E [] array);
}
