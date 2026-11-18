import java.util.Set;
import java.util.HashSet;

public class Exercise5 {
	public static void main(String[] args)
	{
		Set<String> allStudents = new HashSet<>();
		Set<String> submitted = new HashSet<>();
		
		allStudents.add("Dooly");
		allStudents.add("Gildong");
		allStudents.add("Heedong");
		allStudents.add("Minsoo");
		
		submitted.add("Dooly");
		submitted.add("Minsoo");
		
		allStudents.removeAll(submitted);
		
		System.out.println("Not submitted: ");
		
		for(String name : allStudents)
		{
			System.out.println(name);
		}
	}
}
