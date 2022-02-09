package ca.sait.lab4.services;

import ca.sait.lab4.models.User;

/**
 * Login validation service
 * @author Alan(Dong O) Kim
 */
public class AccountService {
        public User login(String username, String password) {
            if (username.equals("abe") && password.equals("password")) {
                return new User(username, null);
            } else if (username.equals("barb") && password.equals("password")) {
                return new User(username, null);
            } else {
                return null;
            }
        }
}
