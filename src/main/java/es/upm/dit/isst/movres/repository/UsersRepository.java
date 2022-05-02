package es.upm.dit.isst.movres.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.isst.movres.model.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{

  List<Users> findByIsAdmin(Boolean b);

}
