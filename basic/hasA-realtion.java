class Address
{
 String city,state,country;
 Address(String city,String state,String country)
 {
  this.city=city;
  this.state=state;
  this.country=country;
 }
}
class emp
{
 int id;
 String name;
 Address address;
 emp(int id,String name,Address address)
 {
  this.id=id;
  this.name=name;
  this.address=address;
 }
void disp()
{
 System.out.println(id+" "+name);
 System.out.println(address+" "+address.state+" "+address.country);
}
public static void main(String arg[])
{
 Address add1=new Address("Surat","Gujrat","India");
 Address add2=new Address("Jhansi","UP","India");

 emp e1=new emp(100,"TOM",add1);
 emp e2=new emp(200,"JERRY",add2);
 e1.disp();
 e2.disp();
}
}
