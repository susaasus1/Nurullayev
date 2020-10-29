import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON,90,100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.3).condition(Status.POISON);
        p.addEffect(e);
    }

    protected String describe() {
        return "Использует способность Sludge Bomb";
    }
}
