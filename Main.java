import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle ground = new Battle();
        Pokemon p1 = new Keldeo("Content", 3);
        Pokemon p2 = new Skuntank("Wave", 2);
        Pokemon p3 = new Swinub("Omega", 1);
        Pokemon p4 = new Stunky("Maxwells", 1);
        Pokemon p5 = new Piloswine("Zombie Party",2);
        Pokemon p6 = new Mamoswine("Trix", 3);
        ground.addAlly(p1);
        ground.addAlly(p2);
        ground.addAlly(p3);
        ground.addFoe(p4);
        ground.addFoe(p5);
        ground.addFoe(p6);
        ground.go();
    }
}
