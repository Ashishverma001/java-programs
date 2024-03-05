interface my{

    void show();
    void disp();// all the methods are inside the interface all are abstract.
}
class child implements my{
// whenever we use interface allways use implements not extend.
public void show(){

      System.out.println("child show call");
    }
public void disp(){
    System.out.println("child disp call");
}
public static void main(String[] args) {

    child c= new child();
    c.show();
    c.disp();
}
}
//can we make more then one interface if this happens.
