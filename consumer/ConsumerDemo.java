package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;

public class ConsumerDemo {

	public static void main(String[] args) {
		//CONSUMER
		Consumer<String> con=(s)->{System.out.println(s.length());};
		con.accept("chandrakala");//calling
		
		Consumer<String> con1=(s1)->{System.out.println(s1.toLowerCase());};
		con1.accept("HYDERABAD");//calling
		
		Consumer<Integer> con2=(s2)->{System.out.println(s2+10);};
		con2.accept(10);
		
		Consumer<Integer> con3=(s3)->{System.out.println(s3*10);};
		con3.accept(10);
		
		con.andThen(con1).accept("HyderaBAD");
		con2.andThen(con3).accept(20);
		
		//BICOSUMER
		BiConsumer<Integer,Integer> bc1=(i,j)->{System.out.println(i+j);};
		bc1.accept(10,10);
		
		BiConsumer<Integer,Integer> bc2=(k,j)->{System.out.println(k/j);};
		bc2.accept(100,10);
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(1,2,3);
	}

}
