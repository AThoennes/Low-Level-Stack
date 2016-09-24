public class Stack<E> implements StackInterface<E>
{
	// array of type E that will act as a stack
	E [] stackArray;
	
	
	public Stack()
	{
		stackArray = (E[]) new Object[10];
	}
	
	/**
	 * push takes in an object of type E (generic)
	 * and pushes it into the array
	 * 
	 * @param thing
	 */
	public void push(E thing)
	{
		if (!stackFull(stackArray))
		{
			for (int i = stackArray.length - 1; i > -1; i--)
			{
				if (stackArray[i] == null)
				{
					stackArray[i] = thing;
					System.out.println("Pushed: " + stackArray[i]);
					break;
				}
			}
		}
		else 
		{
			System.out.println("ERROR: Can not push onto a full stack!");
		}
	}
	
	/**
	 * pop removes the first thing off the top
	 * of the stack by setting it to null.
	 */
	public void pop()
	{
		// if the stack is NOT empty
		if (!stackEmpty(stackArray))
		{
			// start at the beginning and find the first 
			//element that isn't null and then remove it
			for (int i = 0; i < stackArray.length; i++)
			{
				// check if the current element is null
				if (stackArray[i] != null)
				{
					// do this if it isn't null
					System.out.println("Popped: " + stackArray[i]);
					stackArray[i] = null;
					break;
				}
			}
		}
		else
		{
			System.out.println("ERROR: Can not pop an empty stack!");
		}
	}
	
	/**
	 * dumpStack displays everything in the stack
	 */
	public void dumpStack()
	{
		if (!stackEmpty(stackArray))
		{
			System.out.print("Elements in stack: ");
			
			for (int i = 0; i < stackArray.length; i++)
			{
				System.out.print(stackArray[i] + "\t");
			}
			
			System.out.println("\n");
		}
		else
		{
			System.out.println("The stack is empty.");
		}
	}
	
	/**
	 * stackEmpty looks at the very last element
	 * in the stack. If it is empty, then the stack
	 * is empty otherwise the stack has something
	 * in it. 
	 * 
	 * @param array
	 * @return boolean
	 */
	public boolean stackEmpty(E [] array)
	{
	if (array[array.length - 1] == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * stackFull looks at the very first element in
	 * the stack and checks if it is not null. If it 
	 * is null, then the stack is not full. Otherwise
	 * the stack is full.
	 * 
	 * @param array
	 * @return boolean
	 */
	public boolean stackFull(E [] array)
	{
		if (array[0] != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
