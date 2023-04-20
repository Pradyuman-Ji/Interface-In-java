package Interface;

interface M
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}

class D implements M
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8 {
    public static void main(String[] args) {
        M.abc();
        M obj = new D();
        obj.config();
        obj.show();;
    }
}