class Test 
{
 int x,y;
 Test(int x,int y)
 { 
  this.x=x;
  this.y=y;
 }
 Test(Test z) 
 {
  this.x=z.x;
  this.y=z.y; 
 }
  void show()
 {
  System.out.println(x);
  System.out.println(y);
 }
 public static void main(String arg[])
 {
  Test t=new Test(10,20);
  t.show();
  Test t1=new Test(t);
  t1.show();
 }
}