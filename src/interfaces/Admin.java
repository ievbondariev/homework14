package interfaces;

public interface Admin {
    default void access() {
        System.out.println("Admin");
    }

    static void limitedAdminAccess() {
        System.out.println("Limited Admin");
    }

    void deniedAdminAccess();

    void grantedAdminAccess();
}
