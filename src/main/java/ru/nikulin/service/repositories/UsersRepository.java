package ru.nikulin.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikulin.service.models.User;

public interface UsersRepository extends JpaRepository<User,Long>{

}
