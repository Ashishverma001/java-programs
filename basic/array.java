import java.util.*;
class test 
{
 public static void main(String arg[])
 {
  int x[]=new int[5];
  Scanner s=new Scanner(System.in);
  for(int i=0;i<x.length;i++)
  {
   System.out.println(x[i]);
   x[i]=s.nextInt();
  }
  for(int i=0;i<x.length;i++)
  {
  System.out.println(x[i]);
  }
 }
}