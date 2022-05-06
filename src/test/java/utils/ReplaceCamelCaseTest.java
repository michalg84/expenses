package utils;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceCamelCase.class)
class ReplaceCamelCaseTest {

    @Test
    void shouldReturn12when5IsAddedTo7() {
        final String tested = "shouldReturn12when5IsAddedTo7";
        final String result = ReplaceCamelCase.reformat(tested);
        assertThat(result).isEqualTo("Should Return 12 When 5 Is Added To 7");
    }

    @Test
    void underscoreRemoval() {
        final String tested = "underscore_removal_7_345_test";
        final String result = ReplaceCamelCase.reformat(tested);
        assertThat(result).isEqualTo("Underscore Removal 7 345 Test");
    }

    @Test
    void testLowerUpperCasesWithNumbers() {
        final String tested = "UPPER789_lower90OrCamelCase";
        final String result = ReplaceCamelCase.reformat(tested);
        assertThat(result).isEqualTo("UPPER 789 Lower 90 Or Camel Case");
    }
}
