package br.mkacunha.locadora.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.mkacunha.locadora.service.AbstractGenericService;

public abstract class AbstractGenericController<T, ID extends Serializable> {

	abstract AbstractGenericService<T, ID> getService();

	@RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
	public <S extends T> S save(@RequestBody S s) {
		return getService().save(s);
	}

	@RequestMapping(path = "/", method = RequestMethod.PUT, produces = "application/json")
	public <S extends T> S update(@RequestBody S s) {
		return getService().save(s);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable ID id) {
		getService().delete(id);
	}

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
	public Iterable<T> findAll() {
		return getService().findAll();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public T findOne(@PathVariable ID id) {
		return getService().findOne(id);
	}

}
