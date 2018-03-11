import java.util.*;
import java.io.*;

// --< Author : Mustapha JABRANE >--

public class InsertionSort {

	static void IS(int[] arr, int n)
	{
		int temp = 0, j = 0;

		for(int i = 1; i < n; i++)
		{
			temp = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j];
				System.out.println(arr[j+1]);
				j--;
			}
			arr[j + 1] = temp;
		}
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
			for(int i = 0; i < n; i++)
				System.out.print(tab[i] + " ");


			IS(tab, n);

			for(int i = 0; i < n; i++)
				System.out.print(tab[i] + " ");

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
    
}