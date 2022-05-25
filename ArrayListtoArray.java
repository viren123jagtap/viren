import java.util.ArrayList;
 
  public class ArrayListtoArray {
  public static void  main(String[] args)
  {
  ArrayList<String> list = new ArrayList<String>();

  list.add("Virendra");
 
  list.add("Sudarshan");
 
  list.add("Gopal");
  
  list.add("Shradha");
 
  list.add("Manini");
  
  list.add("Kanchan");
 
  String[]  my_array = new String[list.size()];
  
  list.toArray(my_array);
  
  for (String  string : my_array)
  {
  System.out.println(string);
  }
  }
  }
