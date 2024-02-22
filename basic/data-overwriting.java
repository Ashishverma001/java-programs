class base 
{
 int x=10;//overreden memeber(comes on complie time)
}
class child extends base
{
 int x=20;//override member(this is allways comes on run time)
 void show()
 {
    System.out.println(x);
    System.out.println(super.x);//super is non-static
 }
 public static void main(String[] args) 

 {
  child c=new child();
  c.show();  
 }
}
