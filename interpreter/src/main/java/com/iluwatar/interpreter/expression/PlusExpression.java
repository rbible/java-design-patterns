package com.iluwatar.interpreter.expression;


public class PlusExpression extends AbsExpression {

	private AbsExpression leftExpression;
	private AbsExpression rightExpression;

	public PlusExpression(AbsExpression leftExpression, AbsExpression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}

	@Override
	public String toString() {
		return "+";
	}

}
