class dadaji
{
 void show()
 {
  System.out.println("dadaji show call");
 }
}
class papaji
{
 void disp()
 {
  System.out.println("papaji disp call");
 }
}
class child extends papaji
{
 void print()
 {
  System.out.println("child print call");
 }
public static void main(String arg [])
{
 child c=new child();
 c.show();
 c.disp();
 c.print();
}
}