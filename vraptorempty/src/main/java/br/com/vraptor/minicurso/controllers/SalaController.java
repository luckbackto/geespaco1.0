package br.com.vraptor.minicurso.controllers;

import javax.inject.Inject;

import antlr.collections.List;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.vraptor.minicurso.daos.SalaDao;
import br.com.vraptor.minicurso.entitys.Sala;

@Controller
public class SalaController {

	@Inject
	private SalaDao dao;

	@Inject
	private Result result;

	@Get("sala")
	public void sala() {

	}

	@Post("/adiciona")
	public void adiciona(Sala sala) {
		dao.adiciona(sala);
		result.redirectTo(SalaController.class).sala();
	}

	public List lista() {

		return dao.listaSalas();
	}

}
