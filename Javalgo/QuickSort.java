import java.util.*;
import java.io.*;

// --< Author : Mustapha JABRANE >--

public class QuickSort {

	static int partition(int[] tab, int begin, int end)
	{
		int pivot = tab[end];
		int i = begin - 1;

		for(int j = begin; j <= end - 1; j++)
		{
			if(tab[j] <= pivot)
			{
				i++;
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
			}
		}
		int temp = tab[i + 1];
		tab[i + 1] = tab[end];
		tab[end] = temp;

		return i + 1;
	}

	static void qs(int[] tab, int begin, int end)
	{
		if(begin >= end)
			return;
		int p = partition(tab, begin, end);
		qs(tab, begin, p - 1);
		qs(tab, p + 1, end);
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

			qs(tab, 0, n - 1);

			for(int j = 0; j < n; j++)
				System.out.print(tab[j] + " ");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
    
}