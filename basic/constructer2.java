//write a program both parent and child are permeters in this how we can call parent class using child class constructor.
class parent{
    parent(int x){
        System.out.println("parent class call"+x);
    }
}
class child extends parent{
    child(int x){
        super(10);//calling the parent class using passing the value in super class,so it directly call the parent class.
        System.out.println("child class call"+x);
    }
    public static void main(String[] args) {
        child c=new child(20);
        
    }
}
//creating the child object bind with parent class i.e; it called dynamic bunding.    

