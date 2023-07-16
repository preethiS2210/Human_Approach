import java.io.*;
public class alp2
{
	public static void main(String[] args)
	{
		int n=5,alphabet=65;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alphabet + i));
			}
				System.out.println();
		}
	}
}