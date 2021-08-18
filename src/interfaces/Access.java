package interfaces;

public class Access implements User, Admin {
    @Override
    public void access() {
        System.out.println("User, Admin");
    }

    @Override
    public void deniedUserAccess() {

    }

    @Override
    public void grantedUserAccess() {

    }

    @Override
    public void deniedAdminAccess() {

    }

    @Override
    public void grantedAdminAccess() {

    }
}
