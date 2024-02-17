class poly
{
 static void sum(int x,int y)
 {
  System.out.println(x+y);
 }
 static void sum(int x,int y, int z)
 {
  System.out.println(x+y+z);
 }
 public static void main(String args[])
 {
  //poly p=new poly();
  sum(10,20);
  sum(10,20,30);
 }
}