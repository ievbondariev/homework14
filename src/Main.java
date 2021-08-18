import helper.Helper;
import interfaces.*;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Access access = new Access();
        access.access();
        access.deniedUserAccess();
        access.grantedUserAccess();
        access.deniedAdminAccess();
        access.grantedAdminAccess();
        User.limitedUserAccess();
        Admin.limitedAdminAccess();

        TestAccess testAccess = new TestAccess();
        testAccess.access();
        testAccess.deniedTestUserAccess();
        testAccess.grantedTestUserAccess();
        testAccess.deniedTestAdminAccess();
        testAccess.grantedTestAdminAccess();
        TestUser.limitedTestUserAccess();
        TestAdmin.limitedTestAdminAccess();

        Helper helper = new Helper();
        Optional<String> acceptedLine = helper.acceptLine("1@ukr.net");
        Optional<String> notAcceptedLine = helper.acceptLine("1ukrnet");
        acceptedLine.ifPresent(System.out::println);
        notAcceptedLine.ifPresent(System.out::println);
    }
}
