import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;



public class zadanie3 {
	public void zadanie3()
	{
		Path path = Paths.get("C:/Users/Gregori/Desktop/macbeth.txt");
		
		
		
		
		try(Stream<String>lines = Files.lines(path))
		{
			//zmienic literki na male
			System.out.println(lines.flatMap(line->Stream.of(line.split("\\W+"))).filter(line -> line.length()>3).distinct().count());
		

		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
		
	}

}
