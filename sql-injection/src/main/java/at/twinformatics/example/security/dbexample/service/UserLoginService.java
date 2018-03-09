package at.twinformatics.example.security.dbexample.service;

import at.twinformatics.example.security.dbexample.forms.LoginForm;
import at.twinformatics.example.security.dbexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean isValidLogin(LoginForm loginForm) throws UsernameNotFoundException {
        return userRepository.isLoginValid(loginForm.getUserName(), loginForm.getPassword());
    }
}
