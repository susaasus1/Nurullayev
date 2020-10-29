import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }

    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
    }

    protected String describe() {
        return "Использует способность Rest";
    }
}
