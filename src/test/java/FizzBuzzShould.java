import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by alvaro on 24/03/15.
 */
public class FizzBuzzShould {

	@Test
	public void return_the_same_number_for_an_input_not_matching_divisors () {

		assertThat(fizzBuzz(1), is("1"));
	}

	@Test
	public void return_fizz_for_an_input_dividing_three(){
		assertThat(fizzBuzz(3), is("fizz"));
	}

	private String fizzBuzz (final int num) {
		return "1";
	}
}

