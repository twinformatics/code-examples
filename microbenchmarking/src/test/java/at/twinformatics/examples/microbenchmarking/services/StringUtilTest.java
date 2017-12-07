package at.twinformatics.examples.microbenchmarking.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {

    @Test
    void getStringOfFixedLengthWithStringBuilder() {
        assertEquals("xxxxxxxxxx", StringUtil.getStringOfFixedLengthWithStringBuilder(10));
    }

    @Test
    void getStringOfFixedLength() {
        assertEquals("xxxxxxxxxx", StringUtil.getStringOfFixedLength(10));
    }

}