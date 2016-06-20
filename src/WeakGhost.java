public class WeakGhost extends Creature
{

	@Override
	public void visit(RegularPacman regularpacman) {
		System.out.println("Weak Ghost wins Regular Pacman");
		
		
	}


	@Override
	public void visit(WeakGhost weakghost) {
		
	}


	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}


	@Override
	public void visit(StrongGhost stronghost) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(SuperPacman superpacman) {
		System.out.println("Weak Ghost loses mighty pacman");
		
	}


	@Override
	public void visit(MightyPacman mightpacman) {
		System.out.println("Weak Ghost loses mighty pacman");
		
	}


}
