//can abstract class have constructor aur not.?interview question.
abstract class base
{
    base()
    {
        System.out.println("base def call");
    }
}
class child extends base
{
    child()
    {
        System.out.println("child def call");
    }
    public static void main(String[] args) {
        child child =new child();
    }
}
//yes,abstract class have constructor.
//count ovels in an array
//an array of
//ana element find third larjust number  