package FizzBuzz;

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
		
		for(int i=1;i<100;i++)
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
	public void FizzBuzzList2(int[] list)
	{
		for(int i=0;i<list.length;i++)
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

	public static void main(String[] args)
	{
		
		FizzBuzz fb = new FizzBuzz();
		fb.fizzAndBuzz();
		for(int i=1;i<100;i++)
		{
			
		}
	}

}