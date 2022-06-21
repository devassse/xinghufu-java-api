package co.mz.keomasoftware.xinghufujavaapi.repositories;

import co.mz.keomasoftware.xinghufujavaapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
