package ua.rud.repository.impl;

import org.springframework.stereotype.Repository;
import ua.rud.domain.User;
import ua.rud.repository.Specification;
import ua.rud.repository.UserRepository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void add(User object) {

    }

    @Override
    public void remove(User object) {

    }

    @Override
    public void update(User object) {

    }

    @Override
    public List<User> query(Specification<User> specification) {
        return null;
    }
}
