package br.mkacunha.locadora.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.mkacunha.locadora.service.AbstractGenericService;

@CrossOrigin(origins = { "http://localhost:8090" })
public abstract class AbstractGenericController<T, ID extends Serializable> {

	abstract AbstractGenericService<T, ID> getService();

	@RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
	public T save(@RequestBody T s) {
		return getService().save(s);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = "application/json")
	public T update(@PathVariable ID id, @RequestBody T s) {
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
