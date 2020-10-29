import ru.ifmo.se.pokemon.*;


public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON,65,100);
    }
    protected double calcBaseDamage (Pokemon att, Pokemon def) {
		double d = super.calcBaseDamage(att, def);
		if (att.getCondition() == Status.POISON)
			return 2.0 * d;
		return d;
	}
    protected String describe() {
        return "Использует способность Venoshock";
    }
    
}
