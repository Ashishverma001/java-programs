//make one interface my1 and another interface my2 and another is my can this interface extends my1 and my2.
interface my1{
    void show();
}
interface my2{
    void disp();
}
interface my extends my1, my2{

}
class child implements my{
    public void show(){
        System.out.println("child show call");
    }
    public void disp(){
        System.out.println("child disp call");
    }
    public static void main(String[] args) {
        
        child c = new child();
        c.show();
        c.disp();
    }
}
// one interface class and abstaract class and a child class is there how we can create a relation inculde all.