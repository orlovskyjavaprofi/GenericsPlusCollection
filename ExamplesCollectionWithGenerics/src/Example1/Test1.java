package Example1;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
	   List<Integer> ints = Arrays.asList(1,2,3);
	   int s = 0;
	   for (int n: ints){
		   s += n;
		   System.out.print(s+" ");
	   }
	   assert s == 6;
      
	}

}
