public enum UserRole {
    ADMIN("Администратор"), USER("Пользователь");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
