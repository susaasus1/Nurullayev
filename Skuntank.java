import ru.ifmo.se.pokemon.*;

public class Skuntank extends Stunky {
    public Skuntank(String name, int level) {
        super(name, level);
        setStats(103, 93, 67, 71, 61, 84);
        setType(Type.POISON, Type.DARK);
        setMove(new Rest(),new Venoshock(),new SludgeBomb(),new PoisonJab());
    }
}