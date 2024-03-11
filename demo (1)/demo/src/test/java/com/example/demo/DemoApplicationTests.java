package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
	void LadderChecker(int position) {

		assertFalse(position == 22| position == 6);

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
