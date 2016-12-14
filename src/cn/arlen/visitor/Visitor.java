package cn.arlen.visitor;

public class Visitor implements IVisitor{

	@Override
	public void visitor(ISubjected subject) {
		System.out.println("current visitor:"+subject.getSubject());
		
	}

}
