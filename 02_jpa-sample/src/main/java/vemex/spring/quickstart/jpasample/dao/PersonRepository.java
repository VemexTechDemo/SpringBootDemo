package vemex.spring.quickstart.jpasample.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import vemex.spring.quickstart.jpasample.model.Person;

import java.util.List;

/**
 * @author developer
 */

public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("select p from Person p where p.name=:name")
    List<Person> withName(@Param("name") String name);
}
