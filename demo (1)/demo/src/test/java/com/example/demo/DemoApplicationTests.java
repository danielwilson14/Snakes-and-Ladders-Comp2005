package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public boolean PositionChecker(int[] movementsArray, int position) {
		int sum = 0;
		for (int i = 0; i < movementsArray.length; i++) {
			sum += movementsArray[i];
		}

		if(sum != position) {
			return false;
		}
		return true;
	}

	@Test
	void BottomOfLadderChecker() {

	}

	@Test
	void TopOfLadderChecker() {

	}

	@Test
	void BottomOfSnakeChecker() {

	}

	@Test
	void TopOfSnakeChecker() {

	}

	@Test
	void NormalBlockChecker() {

	}

	@Test
	void FinshLineChecker() {

	}

	@Test
	void CorrectMoveTest() {

	}

}
