package authentificator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticatorApplicationTest {
    @Test
    public void testAuthenticate() {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        String username = "JavaCodeGeeks";
        String password_false = "unsafePassword";

        String password_true = "truePassword";
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);

        Mockito.when(authenticatorMock.authenticateUser(username, password_false))
                .thenReturn(false);

        Mockito.when(authenticatorMock.authenticateUser(username, password_true))
                .thenReturn(true);

        assertEquals(false, authenticator.authenticate(username, password_false));
        assertEquals(true, authenticator.authenticate(username, password_true));










    }



}
