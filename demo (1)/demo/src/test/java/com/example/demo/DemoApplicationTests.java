package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void PositionChecker(int[] movementsArray, int position) {
		int sum = 0;
		for (int i = 0; i < movementsArray.length; i++) {
			sum += movementsArray[i];
		}

		assertEquals(position, sum);
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
