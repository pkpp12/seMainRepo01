package se.maven.example;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WeiredAddInSimpleCalculatorTest {
	//
	public int expected;
	public int value1;
	public int value2;
	
	//테스트 데이터를 생성하는 부분
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
			{30, 10, 20},
			{0, 0, 0},
			{100,5,7},
			{50,25,25}
		});
	}
	
	// 테이스 데이처를 받아들이는 생성자 작성
	public WeiredAddInSimpleCalculatorTest(int expected, int value1, int value2) {
		this.expected = expected;
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//테스트 메소드 만들기
	@Test
	public void testWeiredAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(value1, value2);
		assertEquals(expected, calc.getResult());
	}

}
