import java.util.*;
import java.util.Random;

class numbers {
 public static void main(String[] args) {
     Random rand = new Random();
    int n = rand.nextInt(1000);
     List<Integer> digits = new ArrayList<Integer>();
     while (n > 0) {
         digits.add(n%10);
         n/=10;
     }
     System.out.println(Arrays.toString(digits.toArray()));
 }
}