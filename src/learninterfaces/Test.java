package learninterfaces;

public class Test extends Check {


    @Override
    public boolean say(String saying) {
        return (saying == "saying") ? true : false;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.say("saying"));
        Check t1= new Check();
        System.out.println(t1.say("Mafi saying!"));
    }
}
