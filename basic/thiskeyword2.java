class Test
{
 int x=10;
 void show(int x,Test z)
 {
  System.out.println(x);
  System.out.println(this.x);
  System.out.println(this);
 }
  public static void main(String arg[]) 
 {
  Test t1=new Test();
  t1.show(20);
  System.out.println(t1);
 
 }
}