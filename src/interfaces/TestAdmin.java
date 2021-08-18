package interfaces;

public interface TestAdmin {
    default void access() {
        System.out.println("TestAdmin");
    }

    static void limitedTestAdminAccess() {
        System.out.println("Limited TestAdmin");
    }

    void deniedTestAdminAccess();

    void grantedTestAdminAccess();
}
