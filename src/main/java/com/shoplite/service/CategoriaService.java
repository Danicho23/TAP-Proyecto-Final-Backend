package com.shoplite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoplite.model.Categoria;
import com.shoplite.repository.ICategoria;

@Service
public class CategoriaService {

	@Autowired
    private ICategoria repoCateg;
	
	public Categoria crearUsuarios(Categoria categ) {
		return repoCateg.save(categ);
	}
	
	public List<Categoria> listUsers() {
        return repoCateg.findAll();
    }
}
