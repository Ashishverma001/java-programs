class block
{
 static int x=10;
 static
 {
  System.out.println("static block call"+x);
 } 
 class test1
{
 public static void main(String arg[])
 { 
  System.out.println("hello main");
  System.out.println("text.x");
 }
 class test2 
 {
 public static void main(String arg[])
 { 
  System.out.println("hello");
  System.out.println("text.x");
 }
}
}
