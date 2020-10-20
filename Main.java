import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		zadanie1 zadanie1 = new zadanie1();
//		zadanie1.zadanie1();
//		
//		zadanie2 zadanie2 = new zadanie2();
//		zadanie2.zadanie2();
		
//		zadanie3 zadanie3 = new zadanie3();
//		zadanie3.zadanie3();
//		
//		zadanie4 zadanie4 = new zadanie4();
//		zadanie4.zadanie4();
		
		zadanie5 zadanie5 = new zadanie5();
		int[] arr = new int [900000];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		//liczby rosnaco
		long start=System.nanoTime();
		zadanie5.sort_wstawianie(arr);
//		zadanie5.wypisywanie_wstawianie(arr);
		long koniec = System.nanoTime()-start;
		System.out.println("rosn¹co wstawianie:"+ koniec/1000000+ "ms");
		start = System.nanoTime();
		zadanie5.sort_scalanie(arr, 0, arr.length-1);
//		zadanie5.wypisywanie_scalanie(arr);
		koniec = System.nanoTime()-start;
		System.out.println("rosn¹co scalanie:"+ koniec/1000000+ "ms");
		//liczby malejaco
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[i]=i;
		}
		start=System.nanoTime();
		zadanie5.sort_wstawianie(arr);
		koniec = System.nanoTime()-start;
		System.out.println("malej¹co wstawianie:"+ koniec/1000000+ "ms");
		start = System.nanoTime();
		zadanie5.sort_scalanie(arr, 0, arr.length-1);
		koniec = System.nanoTime()-start;
		System.out.println("malej¹co wstawianie:"+ koniec/1000000+ "ms");
		
		Random generator = new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=generator.nextInt(100000);
		}
		start=System.nanoTime();
		zadanie5.sort_wstawianie(arr);
		koniec = System.nanoTime()-start;
		System.out.println("losowo wstawianie:"+ koniec/1000000+ "ms");
		start = System.nanoTime();
		zadanie5.sort_scalanie(arr, 0, arr.length-1);
		koniec = System.nanoTime()-start;
		System.out.println("losowo scalanie:"+ koniec/1000000+ "ms");
		

	}

}
