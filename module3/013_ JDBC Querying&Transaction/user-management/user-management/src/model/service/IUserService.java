package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findByAll();
    User findById(int id);
    boolean update(int id,User user);
     void add (User user);
    boolean remove(int id);
    List<User>findByCountry(String country);
    void insertUser(User user) throws SQLException;
    User getUserById(int id);
    void insertUpdateUseTransaction();
    void insertUpdateWithoutTransaction();
    void addUserTransaction(User user, int[] permissions);


}
