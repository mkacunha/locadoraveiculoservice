package br.mkacunha.locadora.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class AbstractGenericService<T, ID extends Serializable> {

	public abstract PagingAndSortingRepository<T, ID> getRepository();

	public void delete(ID id) {
		getRepository().delete(id);
	}

	public void delete(T entity) {
		getRepository().delete(entity);

	}

	public Iterable<T> findAll() {
		return getRepository().findAll();
	}

	public Iterable<T> findAll(Iterable<ID> ids) {
		return getRepository().findAll(ids);
	}

	public T findOne(ID id) {
		return getRepository().findOne(id);
	}

	public <S extends T> S save(S s) {
		return getRepository().save(s);
	}

	public Iterable<T> findAll(Sort sort) {
		return getRepository().findAll(sort);
	}

	public Page<T> findAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}
}
