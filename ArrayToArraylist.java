import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array4 {
   public static void main(String args[]) {
      String[] array = {"a", "b", "c", "d", "e"};

      
      List<String> list = Arrays.asList(array);          
      System.out.println(list);

      
      List<String> list1 = new ArrayList<String>();
      Collections.addAll(list1, array);
      System.out.println(list1);

     
      List<String> list2 = new ArrayList<String>();
      for(String text:array) {
         list2.add(text);
      }
      System.out.println(list2);
   }  
}