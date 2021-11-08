package com.example.examen.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libros;
import com.example.examen.repository.LibrosRepository;
import com.example.examen.service.LibrosService;


@Service
public class LibrosServiceImpl implements LibrosService {
@Autowired
private LibrosRepository librosRepository;
	@Override
	public List<Libros> readall() {
		// TODO Auto-generated method stub
		return librosRepository.findAll();
	}

	@Override
	public Libros create(Libros al) {
		// TODO Auto-generated method stub
		return librosRepository.save(al);
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return librosRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		librosRepository.deleteById(id);
		
	}

	@Override
	public Libros update(Libros al) {
		// TODO Auto-generated method stub
		return librosRepository.save(al);
	}

}
