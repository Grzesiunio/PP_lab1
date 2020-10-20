import java.math.BigInteger;
import java.util.Scanner;
import java.text.*;

public class zadanie2 {
	public void zadanie2()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Podaj liczbe elementów");
		int n = myObj.nextInt();
		long startTime=System.nanoTime();
		BigInteger silnia = new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			silnia=silnia.multiply(BigInteger.valueOf(i));
		}
		NumberFormat formatter=new DecimalFormat();
		formatter = new DecimalFormat("0.######E0");
		System.out.println(formatter.format(silnia));
		long estimatedTime=System.nanoTime()-startTime;
		System.out.println("Czas: "+ estimatedTime/1000000 + "ms");
		
		//typ long jest za maly na takie wielkie wartosci
	}
	

}
