public class Bird {

    protected String name;

    Bird () {}

    Bird (String name)
    {
        this.name = name;
    }
    
    public void speak()
    {
        System.out.println(name + ": speak speak.");
    }
}
