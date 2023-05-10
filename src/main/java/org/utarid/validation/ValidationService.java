package org.utarid.validation;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public String createUser(User user) {
        return user.toString();
    }
}
