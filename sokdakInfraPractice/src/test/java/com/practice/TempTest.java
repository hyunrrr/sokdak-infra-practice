package com.practice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LOCAL_DATE_TIME;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import net.bytebuddy.asm.Advice.Local;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TempTest {

    @DisplayName("임시 테스트")
    @Test
    void test() {
    }

    @DisplayName("임시테스트 2")
    @Test
    void test2() {
        System.out.println("hi");
    }

    @DisplayName("임시테스트 3")
    @Test
    void test3() {
        System.out.println("hello");
    }

    @DisplayName("timezone 확인 테스트")
    @Test
    void test4() {
        String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH"));
        System.out.println(formatDate);
        assertThat(formatDate).isEqualTo(LocalDateTime.now().format(DateTimeFormatter.ofPattern("2022-08-18-14")));
    }
}
