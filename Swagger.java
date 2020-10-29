import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, (int) (Math.random() * 7));
        p.setMod(Stat.HP, (int) (Math.random() * 7));
        p.setMod(Stat.DEFENSE, (int) (Math.random() * 7));
        p.setMod(Stat.SPEED, (int) (Math.random() * 7));
        p.setMod(Stat.SPECIAL_DEFENSE, (int) (Math.random() * 7));
        p.setMod(Stat.ATTACK, (int) (Math.random() * 7));

    }

    protected String describe() {
        return "Использует способность Swagger";
    }

}
