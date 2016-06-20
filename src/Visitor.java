public interface Visitor 

{
	public void visit(RegularPacman regularpacman);
	public void visit(WeakGhost weakghost);
	public void visit(StrongGhost weakghost);
	public void visit(SuperPacman weakghost);
	public void visit(MightyPacman weakghost);

	


}
