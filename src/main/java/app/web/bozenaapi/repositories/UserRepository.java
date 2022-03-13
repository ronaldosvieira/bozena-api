package app.web.bozenaapi.repositories;

import app.web.bozenaapi.resources.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}