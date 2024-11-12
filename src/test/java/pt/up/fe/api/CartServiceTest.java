package pt.up.fe.api;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class CartServiceTest {
    // TODO: Mock the PriceCalculator
    @Mock
    private PriceCalculator priceCalculator;

    // TODO: Create CartService and inject the mock
    @InjectMocks
    private CartService cartService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks and inject them
    }

    @Test
    public void testCalculateTotalPrice() {

        // Arrange: Prepare a list of item IDs
        List<String> itemIds = Arrays.asList("item1", "item2", "item3");

        // TODO: Stub the behavior of the mock using when(...).thenReturn(...)

        // Stub behavior for each item ID's price
        when(priceCalculator.getPrice("item1")).thenReturn(5.0);
        when(priceCalculator.getPrice("item2")).thenReturn(7.5);
        when(priceCalculator.getPrice("item3")).thenReturn(10.0);

        // TODO: Call the method under test, i.e., calculateTotalPrice
        double totalPrice = cartService.calculateTotalPrice(itemIds);

        // TODO: Assert the result
        assertEquals(22.5, totalPrice, 0.01);

        // TODO: Verify that the mock was interacted with correctly
        verify(priceCalculator).getPrice("item1");
        verify(priceCalculator).getPrice("item2");
        verify(priceCalculator).getPrice("item3");
        verifyNoMoreInteractions(priceCalculator);
    }
}
