//dynamic binding at run time.
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
    public static void main(String[] args) {
        base b=new child();//creating the child object bind with parent class i.e; it called dynamic bunding.    

        b.show();
    }
}
//when we use dynamic bunding:-at run time polymorphism.