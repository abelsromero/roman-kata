package io.github.roman;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class RomanConverterParametrizer {

    public RomanConverterParametrizer(int arab, String roman) {
        this.arab = arab;
        this.roman = roman;
    }

    private int arab;
    private String roman;

    @Test
    public void assertValue() {
        final RomanConverter converter = new RomanConverter();
        // when
        final String value = converter.toRoman(arab);
        // then
        assertThat(roman).isEqualTo(value);
    }

}
