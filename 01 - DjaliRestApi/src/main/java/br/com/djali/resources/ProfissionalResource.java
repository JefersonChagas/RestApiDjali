package br.com.djali.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.djali.model.Profissional;
import br.com.djali.repository.ProfissionalRepository;

@RestController
@RequestMapping(value="/api")
public class ProfissionalResource {
	
	@Autowired
	ProfissionalRepository profissionalRepository;
	
	@GetMapping("/profissionais")
	public List<Profissional> listaProfissionais(){
		return profissionalRepository.findAll();
	}
	@GetMapping("/profissional/{id}")
	
	public Profissional listaProfissionalUnico(@PathVariable(value="id") long id ){
		return profissionalRepository.findById(id);
	}
	@PostMapping("/profissional")
	public Profissional salvaProfissional(@RequestBody Profissional profissional) {
		return profissionalRepository.save(profissional);
	}
}
