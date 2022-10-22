package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void addUser(User user) {
      userDao.addUser(user);
   }
   @Transactional
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
   @Override
   public User getUser(String model, int series) {
      return userDao.getUser(model, series);
   }

}
