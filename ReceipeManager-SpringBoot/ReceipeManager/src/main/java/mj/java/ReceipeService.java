package mj.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReceipeService {

	@Autowired
	private ReceipeRepository repo;
	
	public List<Receipe> listAll() {
		return repo.findAll();
	}
	
	public void save(Receipe receipe) {
		repo.save(receipe);
	}
	
	public Receipe get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
