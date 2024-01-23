class Emp
{
 int eid;
 String ename,addr;
 void input(int ei,String en,String ad)
{
 eid=ei;
 ename=en;
 addr=ad;
}
void disp()
{
 System.out.println(eid);
 System.out.println(ename);
 System.out.println(addr);
}
 public static void main(String arg[])
{
 Emp e1=new Emp();
 e1.input(1,"Ashish","Noida");
 e1.disp();
}
}