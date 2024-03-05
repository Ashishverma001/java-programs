abstract class plan
{
    abstract void getrate();
}
class demos extends plan
{
    int unit;
    float rate;
    void getrate()
    {
        unit = 100;
        rate = 5;
        System.out.println("Bill gen in demos"+(unit*rate));
    }
class comers extends plan
{
    int unit;
    float rate;
    void getrate()
    {
        System.out.println("Bill gen in comers"+(unit*rate));
    }
    public static void main(String[] args) {
        plan p1 = new demos();
        plan p2 = new comers();
        p1.getrate();
        p2.getrate();
    }
}
}
