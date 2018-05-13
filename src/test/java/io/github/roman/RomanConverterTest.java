package io.github.roman;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanConverterTest {

    @Test
    public void should_init_a_converter() {
        // when
        final RomanConverter converter = new RomanConverter();
        // then
        assertThat(converter).isNotNull();
    }


}
