import ru.ifmo.se.pokemon.*;

public class Keldeo extends Pokemon {
    public Keldeo(String name, int level) {
        super(name, level);
        setStats(91, 72, 90, 129, 90, 108);
        setType(Type.WATER, Type.FIGHTING);
        setMove(new Swagger(),new Leer(),new CalmMind(),new Confide());
    }
}
