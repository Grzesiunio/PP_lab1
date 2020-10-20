import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class zadanie1 {
	
	public void zadanie1()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Podaj liczbe elementów");
		int n = myObj.nextInt();
		//a
		long startTime= System.nanoTime();
		int[] tablicaa = new int[n];
		for(int i=1;i<=n;i++)
		{
			tablicaa[i-1]=i;
			
		}
		long estimatedTime=System.nanoTime()-startTime;
		System.out.println("a)"+ estimatedTime/1000000 +" ms");
		
		//b
		startTime=System.nanoTime();
		ArrayList<Integer> tablicab = new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			tablicab.add(i);
		}
		estimatedTime=System.nanoTime()-startTime;
		System.out.println("b)"+ estimatedTime/1000000 +" ms");
		
		//c
		startTime=System.nanoTime();
		ArrayList<Integer> tablicac = new ArrayList<Integer>(n);
		for(int i=1;i<=n;i++)
		{
			tablicac.add(i);
		}
		estimatedTime=System.nanoTime()-startTime;
		System.out.println("c)"+ estimatedTime/1000000 +" ms");
		//d
		startTime=System.nanoTime();
		LinkedList<Integer> tablicad = new LinkedList<Integer>();
		for(int i=1;i<=n;i++)
		{
			tablicad.add(i);
		}
		estimatedTime=System.nanoTime()-startTime;
		System.out.println("d)"+ estimatedTime/1000000 +" ms");
		
		//duza roznice odgrywa podawanie rozmiaru tablicy przy tworzeniu
		
		
	}

}
