/**
 *This class checks the login tand password
 * @author Adrian Roguski
 * 
 */
public class Login {
    private String login;
    private String password;

    /**
     *
     * @param _login login jaki dana instancja klasy bedzie przchowywac
     * @param _password haslo jakie dana instancja klasy bedzie przechowywac
     */
    public Login(String _login, String _password){
        login = _login;
        password = _password;
    }

    /**
     *
     * @param _login login do porownania z przechowywanym wewnatrz obiektu
     * @param _password haslo do porownania z przechowywanym wewnatrz obiektu
     * @return prawda, gdy login i hasło zgadzaja sie, fałsz gdy albo login albo hasło nie pasuje do tych rpzechowywanych przez instancję kalsy
     */
    public boolean check(String _login, String _password){
        return login.equals(_login) && password.equals(_password);
    }

}
