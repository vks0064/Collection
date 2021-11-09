import java.util.HashSet;
public class DuplicateHashSet {

 public static void main(String[] args)

 {

   

     HashSet<String> hset = new HashSet<String>();



     hset.add("A");

     hset.add("B");

     hset.add("C");

     hset.add("D");
     hset.add("E");
     hset.add("F");
     hset.add("D");
     hset.add("G");
     hset.add("H");
     hset.add("A");

    




   

     System.out.println("HashSet contains: ");


     for (String temp : hset) {

         System.out.println(temp);

     }

 }
}