package ua.lviv.lgs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.model.University;
import ua.lviv.lgs.repositories.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Transactional
	public void create(University university) {
		universityRepository.save(university);
	}
	
	public University read(Long id) {
		return universityRepository.findById(id).get();
	}
	
	public void update(University university) {
		universityRepository.save(university);
	}
	
	public void delete(University university) {
		universityRepository.delete(university);
	}

	
	
}