import java.io.*;
public class neon
{
	public static void main(String[] args)
	{
		int n=9;
		int m=n;
		int sum=0;
			int square=n*n;
		while(square>0)
		{
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
	if(m==sum)
		{
			System.out.println(n +"is neon number");
		}
	else
		{
			System.out.println(n +" is not neon number");
		}
	}
}			