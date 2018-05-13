package io.github.roman;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {

    @Test
    public void should_init_a_converter() {
        // given
        final RomanConverter converter = new RomanConverter();
        // then
        assertThat(converter).isNotNull();
    }

    @Test
    public void should_convert_1() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(1);
        // then
        assertThat(value).isEqualTo("I");
    }

    @Test
    public void should_convert_3() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(3);
        // then
        assertThat(value).isEqualTo("III");
    }

    @Test
    public void should_convert_4() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(4);
        // then
        assertThat(value).isEqualTo("IV");
    }

    @Test
    public void should_convert_7() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(7);
        // then
        assertThat(value).isEqualTo("VII");
    }

    @Test
    public void should_convert_9() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(9);
        // then
        assertThat(value).isEqualTo("IX");
    }

    @Test
    public void should_convert_11() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(11);
        // then
        assertThat(value).isEqualTo("XI");
    }

    @Test
    public void should_convert_15() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(15);
        // then
        assertThat(value).isEqualTo("XV");
    }

    @Test
    public void should_convert_18() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(18);
        // then
        assertThat(value).isEqualTo("XVIII");
    }

    @Test
    public void should_convert_19() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(19);
        // then
        assertThat(value).isEqualTo("XIX");
    }

    @Test
    public void should_convert_20() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(20);
        // then
        assertThat(value).isEqualTo("XX");
    }

    @Test
    public void should_convert_124() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(124);
        // then
        assertThat(value).isEqualTo("CXXIV");
    }

    @Test
    public void should_convert_1000() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(1000);
        // then
        assertThat(value).isEqualTo("M");
    }

    @Test
    public void should_convert_1634() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        String value = converter.toRoman(1634);
        // then
        assertThat(value).isEqualTo("MDCXXXIV");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_NOT_convert_4000() {
        // given
        final RomanConverter converter = new RomanConverter();
        // when
        converter.toRoman(4000);
    }

}
