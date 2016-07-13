package br.mkacunha.locadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.mkacunha.locadora.model.Veiculo;
import br.mkacunha.locadora.repository.VeiculoRepository;

@Service
public class VeiculoService extends AbstractGenericService<Veiculo, Long> {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public PagingAndSortingRepository<Veiculo, Long> getRepository() {
		return veiculoRepository;
	}

}
