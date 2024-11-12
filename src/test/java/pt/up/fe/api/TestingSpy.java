package pt.up.fe.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;


@ExtendWith(MockitoExtension.class)
public class TestingSpy {
    @Spy
    private List<String> spy = new LinkedList<>();

    @Test
    public void ensureToLearnAboutSpy(){
        doReturn("XPTO").when(spy).get(10000000);

        Assertions.assertEquals("XPTO", spy.get(10000000));
    }
}
