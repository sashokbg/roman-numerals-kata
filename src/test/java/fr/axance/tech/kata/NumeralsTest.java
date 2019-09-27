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

    @Test
    public void should_add_10_when_X() {
        //Given
        String input = "X";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void should_add_11_when_XI() {
        //Given
        String input = "XI";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(11);
    }

    @Test
    public void should_add_15_when_XV() {
        //Given
        String input = "XV";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void should_add_16_when_XVI() {
        //Given
        String input = "XVI";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(16);
    }

    @Test
    public void should_add_9_when_IX() {
        //Given
        String input = "IX";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void should_add_50_when_L() {
        //Given
        String input = "L";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(50);
    }

    @Test
    public void should_add_67_when_LXVII() {
        //Given
        String input = "LXVII";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(67);
    }

    @Test
    public void should_add_69_when_LXIX() {
        //Given
        String input = "LXIX";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(69);
    }

    @Test
    public void should_add_48_when_XLVIII() {
        //Given
        String input = "XLVIII";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(48);
    }

    @Test
    public void should_add_49_when_XLIX() {
        //Given
        String input = "XLIX";

        //When
        int result = NumeralsService.transform(input);

        //then
        assertThat(result).isEqualTo(49);
    }
}
