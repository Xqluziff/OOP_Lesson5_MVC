package personal.model;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String createUser(User user);
    User updateUser(User user);
    User deleteUser(User user);
}
