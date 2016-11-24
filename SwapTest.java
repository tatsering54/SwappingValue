class SwapTest
{
	public static void main ( String[] args)
	{
		int a = 20;
		int b = 30;
		
	System.out.println("initial value of a :" + a +  " initial value of b : " + b);
		
		a = a + b;  
                b = a - b;
		a = a - b;
	System.out.println("================");
        System.out.println("After swapping the value");
	System.out.println("================");
	System.out.println(" a value :" + a);
        System.out.println("================");
	System.out.println(" b value :" + b);
	}
  
}
