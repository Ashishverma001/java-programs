class base
{
 protected int x=10;
}
class child extends base
{
 int y=20;
 void show()
 {
  System.out.println(x);
  system.out.println(y);
 }
public static void main(String arg [])
 {
  child c=new child();
  c.show();
 }
}