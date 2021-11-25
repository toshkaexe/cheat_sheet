package stream.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;


public class AuthentificatorAppicationTest {
    @Test
    public void testAuthenticate() {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        String username = "JavaCodeGeeks";
        String password_false = "unsafePassword";

        String password_true = "truePassword";
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);
        //Adding behavior
        Mockito.when(authenticatorMock.authenticateUser(username, password_false))
                .thenReturn(false);

        Mockito.when(authenticatorMock.authenticateUser(username, password_true))
                .thenReturn(true);

        assertEquals(false, authenticator.authenticate(username, password_false));
        assertEquals(true, authenticator.authenticate(username, password_true));
        //verify behavior
        verify(authenticatorMock).authenticateUser(username,password_true);
    }


}

