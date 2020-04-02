import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrepagoTest {

	@Test
	void test() {
		Plan plan= new Plan(new Prepago(10,13));
		assertEquals(3,plan.calcularTarifaPlan());
	}

}
