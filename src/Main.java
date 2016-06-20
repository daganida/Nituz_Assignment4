public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WeakGhost wg = new WeakGhost();
		RegularPacman rg = new RegularPacman();
		MightyPacman mp = new MightyPacman();
		SuperPacman sp = new SuperPacman();
		StrongGhost sg = new StrongGhost();

		wg.fight(rg);
		rg.fight(wg);
		sg.fight(mp);
		

	}

}
