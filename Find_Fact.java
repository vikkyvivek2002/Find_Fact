 class Find_Fact 
{

	public static void main(String[] args)
 {
		
		long n = 10;
		long p = 6;
		long k = 0;
		for(long i =1; i<= n; i++)
		{
			if(n%i==0)
			k++;
			if( k == p)
			{
				System.out.println(i);
				break;
			}
		}
		if(k<p)
			System.out.println("0");
		
	}

}
