import java.util.*;
class kilometer
{
 public static void main(String arg[])
 {
  int km,m;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter your distance in meter");
  m=s.nextInt();
  km=m/1000;
  System.out.println("kilometer in"+km);
}
}