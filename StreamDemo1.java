package consumer;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<String> namesList=Arrays.asList("kadapa","hyderabad","chennai","mumbai","bangalore");

		//1.converting into uppercase
		List<String> outputList=namesList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
System.out.println( outputList);

//2.getting >6 alphabets cities name
List<String> responseList = namesList.stream().filter(s-> s.length()>7)
.map(s ->s.toUpperCase()).collect(Collectors.toList());
System.out.println(responseList);

//3.starts with c
List<String> startsList = namesList.stream().filter(s-> s.startsWith("c"))
.map(s ->s.toUpperCase()).collect(Collectors.toList());
System.out.println(startsList);

//4.contains ai as suffix
List<String> filterList = namesList.stream().filter(s-> s.contains("ai"))
.map(s ->s.toUpperCase()).collect(Collectors.toList());
System.out.println(filterList);

//5.concate with metro
List<String> appendsList = namesList.stream().map(s-> s.concat(" metro"))
.map(s ->s.toUpperCase()).collect(Collectors.toList());
System.out.println(appendsList);

//6.sorting the cities
List<String> sortedList = namesList.stream().sorted()
.map(s ->s.toUpperCase()).collect(Collectors.toList());
System.out.println(sortedList);

//7.counting the cities
long countList = namesList.stream().filter(s-> s.length()>0).count();
System.out.println(countList);

//8.find first element
String findFirstList = namesList.stream().findFirst().get();

System.out.println(findFirstList);

	}

}
