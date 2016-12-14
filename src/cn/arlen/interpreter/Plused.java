package cn.arlen.interpreter;

public class Plused implements IExpression{

	@Override
	public int interpret(Contexted context) {
		return context.getNum1()+context.getNum2();
	}

}
