package analyseLexicale;

public enum TokenClass {
	kPrint, kWhile,
	ident, intVal,
	assign, equal, lessThan, lessOrEqual, notEqual, greaterThan, greaterOrEqual, semicolon, logicalNeg,
	add, subtract, multiply, divide,
	leftPar, rightPar, leftBrace, rightBrace, leftHook, rightHook, forward, repeat, left, right
}
