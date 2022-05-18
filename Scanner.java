class Scanner1

{
public static void main(String[] args)
{
java.util.Scanner scn= new java.util.Scanner(System.in);

System.out.println("ENter a Name: ");
String name=scn.next();

System.out.println("ENter a gander");
char gender=scn.next().charAt(0);


System.out.println("Name"+name+"Gender"+gender);

}

}