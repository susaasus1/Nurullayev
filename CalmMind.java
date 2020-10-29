import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(){
        super(Type.PSYCHIC,0,0);
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, (int) (Math.random() * 7));
        p.setMod(Stat.HP, (int) (Math.random() * 7));
        p.setMod(Stat.DEFENSE, (int) (Math.random() * 7));
        p.setMod(Stat.SPEED, (int) (Math.random() * 7));
        p.setMod(Stat.SPECIAL_DEFENSE, (int) (Math.random() * 7));
        p.setMod(Stat.ATTACK, (int) (Math.random() * 7));
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    protected String describe() {
        return "Использует способность Calm Mind";
    }
}
