//can we make more then one interface if this happens.and one class implement to interface.
// yes we can.
interface my{
    void show();
}
interface my1 extends my{
    void disp();
}
class child implements my1{
    public void show(){
        System.out.println("child show call");
    }
    public void disp(){
        System.out.println("disp show call");
    }
    public static void main(String[] args) {
       child c= new child();
       c.show();
       c.disp();
    }
}
