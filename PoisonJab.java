import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(){
        super(Type.POISON,80,100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.3).condition(Status.POISON);
        p.addEffect(e);
    }
    protected String describe(){
        return "Использует способность Posion Jab";
    }
}
