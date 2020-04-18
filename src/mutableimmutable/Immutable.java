package mutableimmutable;

public final class Immutable {

    private String name;


    Immutable(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }




    public static void main(String args[])
    {
        Immutable im=new Immutable("Gopinath");
        System.out.println(im.getName());
        System.out.println(im.getName());
    }

}
