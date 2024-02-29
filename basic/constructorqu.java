//why we reuse constructer. 
//yes,it can use because it is a member OF class. 
class base{
    base(){
        System.out.println("def cons call");
    }
}
class child{
    child(){
        super();
        System.out.println("def cons child call");
    }
    public static void main(String[] args) {
        child c=new child();
    }
}
//both parent and child are permeters in this,how we can call parent class using constructor.
