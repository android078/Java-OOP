package Saving;

import User.User;

public class UserSaver implements Savable {
    /**
     * Класс-сейвер
     */
    public UserSaver() {
    }

    /**
     * Метод для сохранения Пользователя
     * @param user - конкретный экземпляр Пользователя для сохранения
     */
    public void saveUser(User user) {
        System.out.println("Save user:  id " + user.getId() + "  name " + user.getName());
    }
}
