package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.operatorTestClass;

class operatorTestUnit {
	OperatorTestClass oT = new operatorTestClass();
	
	@Test
	void opeatorTestUnitArithmetic() {
		//Arithmetic Operator
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(5,oT.subtraction(7,2),"");
		assertEquals(4.0,oT.division(12,3),"");
		assertEquals(6,oT.multiplication(2,3),"");
		assertEquals(5,oT.modulus(12,7),"");
	}
	
}
	
