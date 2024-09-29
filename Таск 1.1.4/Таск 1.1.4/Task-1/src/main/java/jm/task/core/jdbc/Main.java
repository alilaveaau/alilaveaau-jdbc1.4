package jm.task.core.jdbc;
import java.util.List;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Джон", "Сноу", (byte)27);
        userService.saveUser("Дейнерис", "Таргариен", (byte)25);
        userService.saveUser("Тирион", "Ланнистер", (byte)40);
        userService.saveUser("Арья", "Старк", (byte)20);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
