import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL,0,0);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, (int) (Math.random() * -7));
        p.setMod(Stat.HP, (int) (Math.random() * -7));
        p.setMod(Stat.DEFENSE, (int) (Math.random() * -7));
        p.setMod(Stat.SPEED, (int) (Math.random() * -7));
        p.setMod(Stat.SPECIAL_DEFENSE, (int) (Math.random() * -7));
        p.setMod(Stat.ATTACK, (int) (Math.random() * -7));

    }
    protected String describe() {
        return "Использует способность Confide";
    }
}
