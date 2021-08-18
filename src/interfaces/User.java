package interfaces;

public interface User {
    default void access() {
        System.out.println("User");
    }

    static void limitedUserAccess() {
        System.out.println("Limited User");
    }

    void deniedUserAccess();

    void grantedUserAccess();
}
