import ru.ifmo.se.pokemon.*;

public class Mamoswine extends Piloswine {
    public Mamoswine(String name, int level) {
        super(name, level);
        setStats(110, 130, 80, 70, 60, 80);
        setType(Type.ICE, Type.GROUND);
        setMove(new Facade(),new Bulldoze(),new IcyWind(),new IceBeam());
    }
}