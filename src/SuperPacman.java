

public class SuperPacman extends Pacman {

	@Override
	public void visit(RegularPacman regularpacman) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(WeakGhost weakghost) {
		System.out.println("Mighty pacman Wins WeakGhost");	
		
	}


	@Override
	public void visit(StrongGhost stronghost) {
		System.out.println("Mighty pacman Wins Strong Ghost");	
		
	}

	@Override
	public void visit(SuperPacman superpacman) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MightyPacman mightypacman) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}


}
