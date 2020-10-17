package ua.lviv.lgs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.University;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
	
}
