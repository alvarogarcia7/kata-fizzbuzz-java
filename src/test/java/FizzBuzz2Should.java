import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by alvaro on 27/05/15.
 */
public class FizzBuzz2Should {

	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";

	@Test
	public void return_the_same_value_for_numbers_not_multiple_of_3_or_5 () {

		assertThat(fizzBuzz2(4), is("4"));
	}

	@Test
	public void return_fizz_for_multiples_of_3 () {

		assertThat(fizzBuzz2(6), is(FIZZ));
	}

	@Test
	public void return_buzz_for_multiples_of_5 () {
		assertThat(fizzBuzz2(5), is(BUZZ));
	}

	@Test
	public void return_fizzbuzz_for_multiples_of_3_and_5 () {

		assertThat(fizzBuzz2(15), is("FizzBuzz"));
	}

	private String fizzBuzz2 (final int n) {
		String result;
		if(isDivisibleBy3(n) && isDivisibleBy5(n)) {
			result = FIZZ + BUZZ;
		} else if(isDivisibleBy3(n)) {
			result = FIZZ;
		} else if(isDivisibleBy5(n)) {
			result = BUZZ;
		} else {
			result = String.valueOf(n);
		}
		return result;
	}

	private boolean isDivisibleBy3 (final int n) {
		return isDivisibleBy(n, 3);
	}

	private boolean isDivisibleBy5 (final int n) {
		return isDivisibleBy(n, 5);
	}

	private boolean isDivisibleBy (final int n, final int multiple) {
		return n % multiple == 0;
	}

}
