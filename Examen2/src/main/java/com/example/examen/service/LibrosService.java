package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libros;



public interface LibrosService {
	List<Libros> readall();
	Libros create(Libros al);
	Libros read(int id);
	void delete(int id);
	Libros update(Libros al);
}
