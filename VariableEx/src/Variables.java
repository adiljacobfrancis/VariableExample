public class Variables
{
    int instanceVariable;
    static int staticVariable;

    public Variables(int instanceVar)
    {
        this.instanceVariable = instanceVar;
    }

    public void showVariables()
    {
        int localVariable = 32;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void showStaticVariable()
    {
        System.out.println("Static Variable from static method: " + staticVariable);
    }
    public static void main(String[] args)
    {
        Variables.staticVariable = 22;
        Variables.showStaticVariable();

        Variables obj = new Variables(70);
        obj.showVariables();
    }
}