import java.io.*;
public class pattern7
{
	public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int k=1;k<=n-i;k++)
		{
			System.out.print("*");
		}
		for(int j=n;j<=i;j++)
		{
			System.out.print(j);
		}
		for(int a=1;a<=n-i;a++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
			System.out.println();
	}
}
}