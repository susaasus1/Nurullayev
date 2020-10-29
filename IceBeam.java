import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e=new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(e);
    }
    public String describe(){
        return "Использует способность Ice Beam";
    }
}
