package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public FizzBuzz()
	{
		
	}
	
	//Typical FizzBuzz:
	/*
	 * States the following
	 * write a loop from 1-100 that does the following:
	 * for each number divisible by 3 print "fizz"
	 * for each number divisible by 5 print "buzz"
	 * for numbers divisible by 3 and 5 print FizzBuzz
	 */
	public void fizzAndBuzz()
	{
		
		for(int i=1;i<=100;i++)
		{
			String str = "";
			if(i%3 == 0)
				str+="Fizz";
			if(i%5 == 0)
				str+="Buzz";
			if(str.isEmpty())
				str+=i;
			System.out.println(str);
		}
	}
	
	public void FizzBuzzList(int[] list)
	{
		for(int number : list)
		{
			String str = "";
			if(number%3 == 0)
				str+="Fizz";
			if(number%5 == 0)
				str+="Buzz";
			if(str.isEmpty())
				str+=number;
			System.out.println(str);
		}
		
	}
	
	public void iteratorcheck(List<Object> list)
	{
		for(Object number : list)
		{
			System.out.println(number);
		}
		
	}
	public void FizzBuzzList2(int[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			String str = "";
			if(list[i]%3 == 0)
				str+="Fizz";
			if(list[i]%5 == 0)
				str+="Buzz";
			if(str.isEmpty())
				str+=list[i];
			System.out.println(str);
		}
		
	}

	public static void main(String[] args)
	{
		
		FizzBuzz fb = new FizzBuzz();
		fb.fizzAndBuzz();
		System.out.println("==================");
		int[] arr= new int[100];
		for(int i=0;i<100;i++)
		{
			arr[i]=i+1;
		}
		fb.FizzBuzzList(arr);
		System.out.println("==================");
		fb.FizzBuzzList2(arr);
		System.out.println("==================");
		
		ArrayList<Object> objects = new ArrayList<Object>();
		objects.add(null);
		objects.add(new Integer(5));
		objects.add(new Boolean(true));
		objects.add("Helo");
		
		fb.iteratorcheck(objects);
		
	}

}
