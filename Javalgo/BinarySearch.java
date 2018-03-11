import java.util.*;
import java.io.*;

// --< Author : Mustapha JABRANE >--

public class BinarySearch {

	static int BS(int[] tab, int begin, int end, int x)
	{
		if(end >= begin)
		{
			int mid = begin + ( end - begin ) / 2;
			if(tab[mid] == x)
				return mid;

			if(tab[mid] < x)
				return BS(tab, mid + 1, end, x);

			else
				return BS(tab, begin, mid - 1, x);
		}
		else
			return -1;
	}

	public static void main(String[] args)
	{
		Scanner in = null;

		try
		{
			in = new Scanner(new File("input.txt"));
			int n = in.nextInt();

			int[] tab = new int[n];
			for(int i = 0; i < n; i++)
				tab[i] = in.nextInt();

			int exist = BS(tab, 0, n - 1, 20);

			if(exist != -1)
				System.out.println(tab[exist] + " is there, and its position is : " + exist);
			else
				System.out.println("It's not there !");

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
    
}