package org.log.shipper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

final class LoggerUtilTest {

    @Test
    void shouldSuccessfullyCreateJsonString() {
        // given
        final String given = "{\"content\":\"# Big Header\"}";

        // method to test
        final String str = LoggerUtil.toJson("# Big Header");

        // assert
        assertThat(str).isNotNull();
        assertThat(str).isEqualTo(given);
    }

}