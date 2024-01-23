class student
{
 int sid;
 String sname;
 void get_data(int si, String sn)
{
 sid=si;
 sname=sn;
 System.out.println(sid);
 System.out.println(sname);
}
 public static void main(String arg[])
{
 student s1=new student();
  s1.get_data(1,"Tom");
 System.out.println(s1);
  System.out.println(new student());

 student s2=new student();
  s1.get_data(2,"Jerry");
 System.out.println(s2);
  System.out.println(new student());
}
}