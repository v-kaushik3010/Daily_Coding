package Infi;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Priyanka_and_Toys {

	public static int toys(List<Integer> w) {
	    // Write your code here
	    Collections.sort(w);
	    int ans = 1;
	    int x = w.get(0) +4;
	    
	    for(int q : w){
	        if(q > x){
	            ans++;
	            x = q+4;
	        }
	    }
	     return ans;

	    }

	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> w = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        int result = toys(w);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

	
}
