package utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class ReplaceCamelCase extends DisplayNameGenerator.Standard {
    public ReplaceCamelCase() {
    }

    public String generateDisplayNameForClass(Class<?> testClass) {
        return reformat(super.generateDisplayNameForClass(testClass));
    }

    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return reformat(super.generateDisplayNameForNestedClass(nestedClass));
    }

    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return reformat(testMethod.getName());
    }

    static String reformat(String name) {
        final String[] camelCase = StringUtils.splitByCharacterTypeCamelCase(name);
        var joined = StringUtils.join(camelCase, ' ')
                .replaceAll("_", " ");
        var normalized = StringUtils.normalizeSpace(joined);
        return WordUtils.capitalize(normalized);
    }
}
