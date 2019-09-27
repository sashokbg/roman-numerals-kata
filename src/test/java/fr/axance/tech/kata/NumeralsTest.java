package fr.axance.tech.kata;

import kata.NumeralsService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumeralsTest {

    @Test
    public void must_print_1_when_I() {
        //Given
        String input = "I";

        //When
        int result = NumeralsService.transform(input);

        //Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void must_print_2_when_II() {
        //Given
        String input = "II";

        //When
        int result = NumeralsService.transform(input);

        //Then
        assertThat(result).isEqualTo(2);
    }

    @Test(expected = NumberFormatException.class)
    public void should_fail_when_input_is_not_formatted() {
        //Given
        String input = "IIa";

        //When
        int result = NumeralsService.transform(input);

        //Then
    }

    @Test
    public void should_return_0_when_input_empty() {
        //Given
        String input = "";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void should_add_five_when_V () {
        //Given
        String input = "V";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void should_add_five_and_one_when_VI () {
        //Given
        String input = "VI";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void should_subtract_one_from_five_when_IV () {
        //Given
        String input = "IV";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(4);
    }
}
