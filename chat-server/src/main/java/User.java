public class User {
    private String login;
    private String password;
    private String username;
    private UserRole userRole;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public User(String login, String password, String username) {
        this.login = login;
        this.password = password;
        this.username = username;
        if (login.equals("admin")) {
            userRole = UserRole.ADMIN;
        } else {
            userRole = UserRole.USER;
        }
    }
}
