class Test
{
 Test() 
 {
 this(10);
 System.out.println("def cans call");
 }
 Test(int x)
 { 
  this(10,20);
  System.out.println(x);
 }
 Test(int x,int y)
 { 
  System.out.println(x+y);
 }
 public static void main(String arg [])
 {
  new Test();
 }
}