abstract class animal{
    abstract void fly();
    void nonfly()
    {
        System.out.println("Animal fly");
    }
}
class bird extends animal
{
    void show(){
        System.out.println("bird show call");
    }
    void fly(){
        System.out.println("bird fly call");
    }
    public static void main(String[] args) {
        bird b = new bird();
        b.show();
        b.fly();
        b.nonfly();
    }
}