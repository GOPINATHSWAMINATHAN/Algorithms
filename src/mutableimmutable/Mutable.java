package mutableimmutable;

public class Mutable {

    String name;


    Mutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[])
    {
        Mutable m=new Mutable("Gopinath");
        System.out.println(m.getName());
        m.setName("Pulipandy");
        System.out.println(m.getName());
    }
}
