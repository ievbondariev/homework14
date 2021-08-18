package interfaces;

public class TestAccess implements TestUser, TestAdmin {
    @Override
    public void access() {
        System.out.println("TestUser, TestAdmin");
    }

    @Override
    public void deniedTestUserAccess() {

    }

    @Override
    public void grantedTestUserAccess() {

    }

    @Override
    public void deniedTestAdminAccess() {

    }

    @Override
    public void grantedTestAdminAccess() {

    }

}
