package java_oops_tasks;
// task- 12
import java.util.*;
//import java.util.stream.*;

public class Lamda_with_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names = Arrays.asList("Anil","Lucky","Pavan","Meghana","Farooq");
		System.out.println("All the Listed names:");
		names.forEach(name -> System.out.println(name));
		
		System.out.println("\nNames starting with 'A':");
		names.stream()
		.filter(name -> name.startsWith("A"))
		.forEach(name -> System.out.println(name));
		System.out.println("\nSorted Names:");
		names.stream()
		.sorted()
		.forEach(name -> System.out.println(name));
	}

}
