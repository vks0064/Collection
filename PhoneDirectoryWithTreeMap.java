import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.stream.Stream;
public class PhoneDirectoryWithTreeMap {


			
private TreeMap<String,String> data;
   
  
   public PhoneDirectoryWithTreeMap() {
      data = new TreeMap<String,String>();
   }
   
 
   public String getNumber( String number ) {
         return data.get(number);
   }
   public String getName( String name ) {
       return data.get(name);
 }
   
 
   public void putNumber( String number,String name  ) {
      if (name == null || number == null)
          throw new IllegalArgumentException("name and number cannot be null");
      data.put(number,name);
   }
   
   
  
   public void print() {
      for ( Map.Entry<String,String> entry : data.entrySet() )
         System.out.println( entry.getKey() + ":  " + entry.getValue() );
   }







   public static void main(String[] args) {
       PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
    
      
       directory.putNumber("555-1234","Radha");
       directory.putNumber("555-2345","Shayam");
       directory.putNumber("555-3456","Mohan");
       System.out.println("Contents are:");
       System.out.println();
       directory.print();
       System.out.println();
       System.out.println(directory.getNumber("555-1234"));
       System.out.println(directory.getNumber("555-2345"));
       System.out.println(directory.getNumber("555-3456"));
       System.out.println();
    
	}

}

