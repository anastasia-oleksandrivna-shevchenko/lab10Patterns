package task5.decomposeCondition;

public class AccessManager {
    public void checkAccess(User user, Resource resource) {
        if (!isAccessAllowed(user, resource)) {
            denyAccess();
            return;
        }
        grantAccess();
    }

    private boolean isAccessAllowed(User user, Resource resource) {
        return isValidUser(user) && isValidResource(resource) && user.hasPermission(resource);
    }

    private boolean isValidUser(User user) {
        return user != null && user.isLoggedIn();
    }

    private boolean isValidResource(Resource resource) {
        return resource != null;
    }

    private void grantAccess() {
        System.out.println("Access granted");
    }

    private void denyAccess() {
        System.out.println("Access denied");
    }

}
