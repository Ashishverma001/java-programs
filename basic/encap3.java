class student
{
 int sid;
 String sname,addres;
 void input(int si,String sn,String ad)
{
 Scanner ss=Scanner(System.in);
 System.out.println("enter a sid");
 sid=ss.nextInt();
 System.out.println("enter a sname"); 
 sname=ss.next();
 System.out.println("enter a addres");
 addres=ss.next();
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
  s.input();
  s.show();
 student s1=new student();
  s1.input();
  s1.show();
}
}