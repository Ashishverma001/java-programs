class Emp
{
 int eid;
 String ename,cname;
 void input(int ei,String en,String cn)
{
 eid=ei;
 ename=en;
 cname=cn;
}
 void disp()
{
 System.out.println(eid);
 System.out.println(ename);
 System.out.println(cname);
}
public static void main(String arg[])
{
 Emp e1=new Emp();
 e1.input(1,"TOM","TCS");
 e1.disp();
 
 Emp e2=new Emp();
 e2.input(2,"Jerry","TCS");
 e2.disp();
}
}
