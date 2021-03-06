package ru.example.application.service;

import ru.example.application.entity.Client;
import ru.example.application.err.ErrorClient;

import java.util.List;

public interface IClientRoleService {


    /**
     * Получение всех пользователей
     * @return Список клиентов
     */
    List<Client> readAll();

    /**
     * Получение пользователя с ролью по логину
     * @param loginClient логин пользователя
     * @return пользователь с ролью
     */
    Client findClientByLogin(String loginClient);

    /**
     * Добавление пользователя и роль
     * @param client пользователь с ролью
     */
    List<ErrorClient> addClient(Client client);

    /**
     * Редактирование пользователя и изменение его ролей
     * @param client пользователь с ролью
     * @return
     */
    boolean update(Client client);

    /**
     * Удаление пользователя по логину
     * @param loginClient логин пользователя
     * @return
     */
    boolean delete(String loginClient);

}
