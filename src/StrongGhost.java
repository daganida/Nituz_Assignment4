public class StrongGhost extends Ghost
{

	@Override
	public void visit(RegularPacman regularpacman) {
		System.out.println("Strong ghost  wins Regular pacman");
		
	}

	@Override
	public void visit(WeakGhost weakghost) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void visit(StrongGhost stronghost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SuperPacman weakghost) {
		System.out.println("Strong ghost  wins super pacman");
		
	}

	@Override
	public void visit(MightyPacman mightypacman) {
		System.out.println("Strong ghost loses mighty pacman");
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}

}
