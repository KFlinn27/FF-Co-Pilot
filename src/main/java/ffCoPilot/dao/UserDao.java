package ffCoPilot.dao;



import ffCoPilot.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll(String username);

    User getUserById(int id);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);

}
