package Interface;

class U
{

    public void show()
    {
        System.out.println("in A show");
    }
    static class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}


public class Inner {
    public static void main(String[] args) {
        U obj = new U();
        obj.show();

        U.B obj1 = new U.B();
        obj1.display();
    }
}
