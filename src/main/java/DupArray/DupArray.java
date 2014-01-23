package DupArray;

import java.util.HashSet;
import java.util.Set;

public class DupArray {

	public String[] removeDuplicatesNSquared(String[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			String current = array[i];
			for(int j = i+1;j < array.length;j++)
			{
				String temp=array[j];
				if(current !=null && temp !=null && current.equalsIgnoreCase(temp))
				{
					array[j]=null;
				}
			}
		}
		return array;
	}
	
	public Set<String> removeDupsWithSet(String[] array)
	{
		Set<String> setter = new HashSet<String>();
		for(String str:array)
		{
			setter.add(str);
			
		}
		return setter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DupArray dupArray = new DupArray();
		String[] array = new String[]{"Steve","Mike","Bill","steve","Steve","Jay","Jason","scott","scott","scOtt","blank","blank"};
		array = dupArray.removeDuplicatesNSquared(array);
		
		for(String str: array)
		{
			System.out.println(str);
		}
		
		System.out.println("====");
		array = new String[]{"Steve","Mike","Bill","steve","Steve","Jay","Jason","scott","scott","scOtt","blank","blank"};
		Set<String> setter = dupArray.removeDupsWithSet(array);
		
		for(String str: setter)
		{
			System.out.println(str);
		}
		
		
	}

}
