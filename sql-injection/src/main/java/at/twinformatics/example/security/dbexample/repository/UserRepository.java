package at.twinformatics.example.security.dbexample.repository;

import at.twinformatics.example.security.dbexample.controller.IndexController;
import at.twinformatics.example.security.dbexample.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UserRepository {

    private final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private EntityManager entityManager;

    public boolean isLoginValid(String userName, String password) {

        String query = "Select * FROM users WHERE users.username = '" + userName + "' AND users.password = '" + password + "'";

        LOGGER.info(query);

        List result = entityManager.createNativeQuery(query, User.class).getResultList();

        return result.size() != 0;

    }
}
