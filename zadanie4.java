import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zadanie4 {
	public void zadanie4()
	{
		Path path = Paths.get("C:/Users/Gregori/Desktop/macbeth.txt");
		
		List<String>result= new ArrayList<String>();
		try(Stream<String>lines = Files.lines(path))
		{
			result = lines.flatMap(line -> Stream.of(line.split("\\W+"))).filter(line -> line.length()>3).collect(Collectors.toList());
//			result = lines.collect(Collectors.toList());
//			System.out.println(result);
			Map <String, Integer> wordCounter = result.stream().collect(Collectors.toMap(w ->w.toString().toLowerCase(), w->1, Integer::sum));
//			System.out.println(wordCounter.values()>10);
			//wyswietla wszystkie slowa zliczone, a nie 8 najczesciej wystepujacych
			System.out.println(wordCounter);
			
			

		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

}
