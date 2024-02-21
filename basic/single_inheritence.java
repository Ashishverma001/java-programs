class emp 
{
 int eid;
 String ename;
 void einput(int eid,String ename)
 {
  this.eid=eid;
  this.ename=ename;
 }
 void edisp()
 {
  System.out.println(eid);
  System.out.println(ename);
 }
 class pay extends emp
 {
  int pid;
  String pname;
  float salary;
  void pinput(int pid,String pname,float sal)
  {
   this.pid=pid;
   this.pname=pname;
   this.salary=salary;
  }
  void pdisp()
   {
   System.out.println(pid);
   System.out.println(pname);
   System.out.println(salary);
   }
  public static void main(String arg [])
  {
   pay p=new pay();
   pinput(1,"Tom");
   pinput(100,"sal",50000.6f);
   p.edisp();
   p.pdisp();
  }
 }
}