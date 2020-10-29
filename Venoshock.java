import ru.ifmo.se.pokemon.*;


public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON,65,100);
    }
    protected String describe() {
        return "Использует способность Venoshock";
    }
}
