import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    public String describe(){
        return "Использует способность Facade";
    }
}
