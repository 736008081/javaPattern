package cn.arlen.visitor;

public class Subject implements ISubjected{

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitor(this);
		
	}

	@Override
	public String getSubject() {
		return "ทรฮสี฿";
	}

}
