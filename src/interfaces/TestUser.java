package interfaces;

public interface TestUser {
    default void access() {
        System.out.println("TestUser");
    }

    static void limitedTestUserAccess() {
        System.out.println("Limited TestUser");
    }

    void deniedTestUserAccess();

    void grantedTestUserAccess();
}
