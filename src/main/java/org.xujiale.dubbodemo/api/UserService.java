package org.xujiale.dubbodemo.api;

import org.xujiale.dubbodemo.bean.Response;
import org.xujiale.dubbodemo.bean.User;

public interface UserService {

    Response register(User userToRegister);
}
