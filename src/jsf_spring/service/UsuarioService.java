package jsf_spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jsf_spring.dao.entity.impl.UsuarioDAO;
import jsf_spring.entity.Usuario;

@Component
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;
	

	/* Salvar */
	@Transactional
	public Usuario save(Usuario obj) {
		obj.setAtivo(true);
		return dao.save(obj);
	}

}