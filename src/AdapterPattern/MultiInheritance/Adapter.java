package AdapterPattern.MultiInheritance;

public class Adapter implements Duck,Turkey {
    Object obj;

    public Adapter(Object obj) {

        this.obj = obj;
    }

    @Override
    public void quack() {

       if(obj instanceof Turkey)
           ((Turkey)obj).gobble();
       else if (obj instanceof Duck)
           ((Duck) obj).quack();
       else
           System.out.println("Object cannot adapter");
    }

    @Override
    public void gobble() {
        if(obj instanceof Turkey)
            ((Turkey)obj).gobble();
    }

    @Override
    public void fly() {
        if(obj instanceof Duck){
            ((Duck)obj).quack();
        }
    }
}
