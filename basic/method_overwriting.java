class base
{
    static  void show()//overreden
    {
        System.out.println("base show call");
    }
}
class child extends base
{
    static public void show()//override
    {
        System.out.println("child show call");
        base.show();
    }
    public static void main(String[] args) 
    {
       child c=new child();
       c.show();  
    }
}
//why we reuse constructer. 
//yes,it can use because it is a member  OF class. 
