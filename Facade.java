import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    protected String describe(){
        return "Использует способность Facade";
    }
    protected double calcBaseDamage (Pokemon att, Pokemon def) {
		double d = super.calcBaseDamage(att, def);

		switch (att.getCondition()) {
		case BURN:
		case POISON:
		case PARALYZE:
			d *= 2.0;
		}

		return d;
	}
}
