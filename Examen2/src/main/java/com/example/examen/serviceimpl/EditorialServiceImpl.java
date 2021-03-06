package com.example.examen.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Editorial;
import com.example.examen.repository.EditorialRepository;
import com.example.examen.service.EditorialService;
@Service
public class EditorialServiceImpl implements EditorialService {
@Autowired
private EditorialRepository editorialRepository;
	@Override
	public List<Editorial> readall() {
		// TODO Auto-generated method stub
		return editorialRepository.findAll();
	}

	@Override
	public Editorial create(Editorial al) {
		// TODO Auto-generated method stub
		return editorialRepository.save(al);
	}

	@Override
	public Editorial read(int id) {
		// TODO Auto-generated method stub
		return editorialRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		editorialRepository.deleteById(id);
	}

	@Override
	public Editorial update(Editorial al) {
		// TODO Auto-generated method stub
		return editorialRepository.save(al);
	}

}
