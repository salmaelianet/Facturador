import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WowTest {

	@Test
	void test() {
		Plan plan= new Plan(new Wow(10));
		assertEquals(10,plan.calcularTarifaPlan());
	}

}
