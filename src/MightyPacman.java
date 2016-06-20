

public class MightyPacman extends Pacman {

	@Override
	public void visit(RegularPacman regularpacman) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(WeakGhost weakghost) {
		// TODO Auto-generated method stub
		System.out.println("Mighty pacman Wins WeakGhost");	
		
	}



	@Override
	public void visit(StrongGhost weakghost) {
		System.out.println("Mighty pacman Loses Strong Ghost");	
		
	}

	@Override
	public void visit(SuperPacman weakghost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MightyPacman weakghost) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		// TODO Auto-generated method stub
		
	}

}
