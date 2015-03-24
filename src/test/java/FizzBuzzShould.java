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
	public void calculate_fizzbuzz_for_three(){
		assertThat(fizzBuzz(3), is("fizz"));
	}

	@Test
	public void calculate_fizzbuzz_for_five(){
		assertThat(fizzBuzz(5), is("buzz"));
	}

	private String fizzBuzz (final int num) {

		String result = "1";

		if (num == 3){
			result = "fizz";
		} else if (num == 5){
			return "buzz";
		}

		return result;
	}
}

