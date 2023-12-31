
public interface AuthenticationProvider {
    String getUsernameByLoginAndPassword(String login, String password);

    UserRole getUserRoleByLogin(String login);

    boolean register(String login, String password, String username);
}