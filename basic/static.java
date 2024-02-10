class emp
{
    int eid;
    String ename;
    static String cname="tcs";
    void input(int ei,String en)
    {
        eid=ei;
        ename=en;
    }
    static void cchange(String cn)
    {
        cname=cn;
    }
    void disp()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(cname);
    }
    public static void main(String[] args) 
    {
     cchange("microsoft");
     emp e1=new emp();
     e1.input(1,"ram");
     e1.disp();   
    }
}