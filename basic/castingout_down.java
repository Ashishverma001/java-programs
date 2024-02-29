//This is out and down casting this will use in dynamic bindings.
class base{
    void show(){
        System.out.println("base show call");
    }
}
class child extends base{
    void show(){
        System.out.println("child show call");
        super.show();
    }
    void disp(){
        System.out.println("child disp call");
    }
    public static void main(String[] args) {
        base b=new child();
        b.show();
        child c= (child)b;
        c.disp();
    }
}