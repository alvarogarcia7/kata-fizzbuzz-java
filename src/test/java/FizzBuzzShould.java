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
	public void calculate_fizzbuzz_for_five(){
		assertThat(fizzBuzz(5), is("buzz"));
	}

	@Test
	public void calculate_fizzbuzz_for_multiples_of_3(){

		for (int i = 3; i < MAX_TEST; i+=3)
		{
			assertThat(fizzBuzz(i), is("fizz"));
		}
	}

	private String fizzBuzz (final int num) {

		String result = "1";

		if (num % 3 == 0){
			result = "fizz";
		} else if (num == 5){
			result = "buzz";
		}

		return result;
	}
}

