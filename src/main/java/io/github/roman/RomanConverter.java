package io.github.roman;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RomanConverter {

    public String toRoman(int i) {
        final String value = String.valueOf(i);
        final int size = value.length();
        return convert(value, size);
    }

    private String convert(String value, int size) {
        int current = Integer.valueOf(value.substring(0, 1));
        if (size == 1)
            return singleDigit(current);
        else if (size == 2)
            return tenths(current) + convert(value.substring(1, value.length()), size - 1);
        else if (size == 3)
            return cents(current) + convert(value.substring(1, value.length()), size - 1);
        else if (size == 4)
            return thousands(current) + convert(value.substring(1, value.length()), size - 1);
        return "";
    }

    private String thousands(int i) {
        final String base = "M";
        if (i < 4) {
            return times(i, base);
        } else if (i == 4) {
            throw new IllegalArgumentException();
        } else if (i == 9) {
            throw new IllegalArgumentException();
        } else {
            throw new IllegalArgumentException();
        }
    }

    private String cents(int i) {
        final String base = "C";
        if (i < 4) {
            return times(i, base);
        } else if (i == 4) {
            return base + "D";
        } else if (i == 9) {
            return base + "M";
        } else {
            return "D" + times(i - 5, base);
        }
    }

    private String tenths(int i) {
        final String base = "X";
        if (i < 4) {
            return times(i, base);
        } else if (i == 4) {
            return base + "L";
        } else if (i == 9) {
            return base + "C";
        } else {
            return "L" + times(i - 5, base);
        }
    }

    private String singleDigit(int i) {
        final String base = "I";
        if (i < 4) {
            return times(i, base);
        } else if (i == 4) {
            return base + "V";
        } else if (i == 9) {
            return base + "X";
        } else {
            return "V" + times(i - 5, base);
        }
    }

    private String times(int i, String sign) {
        return IntStream.range(0, i).mapToObj(v -> sign).collect(Collectors.joining());
    }
}
