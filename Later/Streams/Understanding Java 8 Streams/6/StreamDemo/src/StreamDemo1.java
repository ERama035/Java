import java.util.Arrays;
import java.util.List;

/**
 * Intermediate operation : filter()
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Welcome", "not", "to", "India");

		/*
		 * filter() operation helps eliminate elements based on certain
		 * criteria.
		 */
		list.stream().filter(line -> !"not".equals(line))
				.forEach(p -> System.out.println(p));
	}

}