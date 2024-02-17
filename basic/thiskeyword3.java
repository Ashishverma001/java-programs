class emp
{
 int eid;
 String ename;
 void input(int eid,String ename)
 {
  this.eid=eid;
  this.ename=ename;
 }
 void show()
 {
  System.out.println(eid);
  System.out.println(ename);
 }
 public static void main(String arg[])
 { 
  emp e1=new emp();
  e1.input(1,"TOM");
  e1.shoe();
 }
}