package cn.arlen.visitor;

public interface ISubjected {

	public void accept(IVisitor visitor);
	
	public String getSubject();
	
}
