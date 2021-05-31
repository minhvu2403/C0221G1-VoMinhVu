package model.service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.service.IUserService;

import java.util.List;

public class UserServiceImp implements IUserService {
     UserRepository userRepository =new UserRepository();



    @Override
    public List<User> findByAll() {
        return userRepository.findByAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean update(int id, User user) {
        return userRepository.update(id,user);
    }

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public boolean remove(int id) {
        return userRepository.delete(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }
}
