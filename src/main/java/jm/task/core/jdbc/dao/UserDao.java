package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable();  //Создать таблицу пользователи

    void dropUsersTable();  //Удалить таблицу пользователей

    void saveUser(String name, String lastName, byte age); //Сохранить пользователя

    void removeUserById(long id); //Удалить пользователя по id

    List<User> getAllUsers(); //Получить всех пользователей

    void cleanUsersTable(); //Очистить таблицу пользователей
}
