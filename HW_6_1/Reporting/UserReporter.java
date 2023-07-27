package Reporting;

import User.User;

public class UserReporter implements Reportable {
    public UserReporter() {
    }

    /**
     * Метод внесения Пользователя в репорт
     */
    public void reportUser(User user) {
        System.out.println("Report for user:  id " + user.getId() + "  name " + user.getName());
        }
    
}
