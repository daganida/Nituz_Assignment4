

public class RegularPacman extends Pacman 
{



	@Override
	public void visit(RegularPacman regularpacman) {
			
	}


	@Override
	public void visit(WeakGhost weakghost) {
		System.out.println("Regular pacman loses  Weak Ghost");	
	}

	@Override
	public void visit(StrongGhost stringhost) {
		// TODO Auto-generated method stub
		System.out.println("Regular pacman loses  Strong Ghost");	

		
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
