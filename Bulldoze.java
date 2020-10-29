import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }

    protected String describe(){
        return "Использует способность Bulldoze";
    }
}
