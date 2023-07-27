import Reporting.UserReporter;
import Saving.UserSaver;
import User.User;

public class Main {
    public static void main(String[] args) {
        UserSaver usSaver = new UserSaver();
        UserReporter usReporter = new UserReporter();

        User user = new User(1L,"Sasha");
        User user1 = new User(2L,"Masha");
        System.out.println();

        usSaver.saveUser(user);
        usSaver.saveUser(user1);
        System.out.println();

        usReporter.reportUser(user);
        usReporter.reportUser(user1);
    }
}
