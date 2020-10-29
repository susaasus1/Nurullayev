import ru.ifmo.se.pokemon.*;

public class IcyWind extends SpecialMove {
    public IcyWind(){
        super(Type.ICE,55,95);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    protected String describe(){
        return "Использует способность Icy Wind";
    }
}
