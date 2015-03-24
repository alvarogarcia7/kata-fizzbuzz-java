import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by alvaro on 24/03/15.
 */
public class FizzBuzzShould {

	private static final int MAX_TEST = 1000;

	@Test
	public void return_the_same_number_for_an_input_not_matching_divisors () {

		assertThat(fizzBuzz(1), is("1"));
	}

	@Test
	public void calculate_fizzbuzz_for_multiples_of_5_lower_than_15 () {

		for (int i = 5; i < 3 * 5; i += 5) {
			assertThat(fizzBuzz(i), is("buzz"));
		}
	}

	@Test
	public void calculate_fizzbuzz_for_multiples_of_3_lower_than_15 () {

		for (int i = 3; i < 3 * 5; i += 3) {
			assertThat(fizzBuzz(i), is("fizz"));
		}
	}

	@Test
	public void calculate_fizzbuzz_for_fifteen () {
		assertThat(fizzBuzz(15), is("fizzbuzz"));
	}

	private String fizzBuzz (final int num) {

		String result = "1";

		if (isDivisibleBy3(num) && isDivisibleBy5(num)) {
			result = "fizz"+"buzz";
		} else
		if (isDivisibleBy3(num)) {
			result = "fizz";
		} else if (isDivisibleBy5(num)) {
			result = "buzz";
		}

		return result;
	}

	private boolean isDivisibleBy5 (final int num) {
		return num % 5 == 0;
	}

	private boolean isDivisibleBy3 (final int num) {
		return num % 3 == 0;
	}
}

