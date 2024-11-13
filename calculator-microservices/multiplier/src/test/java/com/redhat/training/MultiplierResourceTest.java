
package com.redhat.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.redhat.training.service.SolverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplierResourceTest {

    private SolverService solverService;
    private MultiplierResource multiplierResource;

    // Setup method to initialize mock objects before each test
    @BeforeEach
    public void setup() {
        // Mocking the SolverService
        solverService = mock(SolverService.class);
        // Injecting mock into MultiplierResource
        multiplierResource = new MultiplierResource(solverService);
    }

    // Test case for simple multiplication
    @Test
    public void simpleMultiplication() {
        // Given: Mock the solverService to return expected values
        when(solverService.solve("2")).thenReturn(2.0f); // "2" should return 2.0f
        when(solverService.solve("3")).thenReturn(3.0f); // "3" should return 3.0f

        // When: Call the multiply method of MultiplierResource
        Float result = multiplierResource.multiply("2", "3");

        // Then: Assert that the result of multiplication is 6.0
        assertEquals(6.0f, result, "Multiplication result should be 6.0");
    }
}
