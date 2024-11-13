
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.exception.ResteasyWebApplicationException;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@Test
public void simpleMultiplication() {
 // Given
 Mockito.when(solverService.solve("2")).thenReturn(Float.valueOf("2"));
 Mockito.when(solverService.solve("3")).thenReturn(Float.valueOf("3"));
 // When
 Float result = multiplierResource.multiply("2", "3");
 // Then
 assertEquals( 6.0f, result );
}
