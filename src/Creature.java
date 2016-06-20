public abstract class Creature implements Visitor,Visited

{
	public void fight(Creature c) {
		c.accept(this);
	}


}
