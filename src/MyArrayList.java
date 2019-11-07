import java.util.ArrayList;

public class MyArrayList <T extends Comparable<T>>
{
	private ArrayList<T> arr = new ArrayList<T>();
	
	public void add(T value)
	{
		arr.add(value);
	}
	
	public T get(int i)
	{
		return arr.get(i);
	}
	
	public T min()
	{
		T min = arr.get(0);
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i).compareTo(min) == -1)
			{
				min = arr.get(i);
			}
		}
		
		return min;
	}
}
