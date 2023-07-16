import java.io.*;
public class pattern4
{
	public static void main(String[] args)
	{
		int n=6;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
					System.out.println();
		}
	}
}