package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ApiInterfaceImplTest {

    private final ApiInterface apiInterface = new ApiInterfaceImpl();

    @Test
    public void implType() {
        System.out.println(">>>>>> impl2 <<<<<<");
    }

    @Nested
    @DisplayName("getData()")
    class GetData {

        @Test
        @DisplayName("should return correct value, when called")
        public void shouldReturnCorrectValueWhenCalled() {
            String expectedData = "Impl2";

            Assertions.assertEquals(expectedData, apiInterface.getData());
        }
    }
}
