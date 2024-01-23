class student
{
 int sid;
 String sname,addres;
 void input(int si,String sn,String ad)
{
 sid=si;
 sname=sn;
 addres=ad;
}
 void show()
{
 System.out.println(sid);
 System.out.println(sname);
 System.out.println(addres);
}
 public static void main(String arg[])
{
 student s=new student();
  s.input(1,"Tom","Noida");
  s.show();
 student s1=new student();
  s1.input(2,"Jerry","delhi");
  s1.show();
}
}