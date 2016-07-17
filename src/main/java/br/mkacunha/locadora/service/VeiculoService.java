package br.mkacunha.locadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import br.mkacunha.locadora.model.Veiculo;
import br.mkacunha.locadora.repository.VeiculoRepository;
import br.mkacunha.locadora.service.exeption.NotFoundServiceException;

@Service
public class VeiculoService extends AbstractGenericService<Veiculo, Long> {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public PagingAndSortingRepository<Veiculo, Long> getRepository() {
		return veiculoRepository;
	}

	@Override
	public Veiculo update(Long id, Veiculo s) {
		Veiculo veiculoCorrente = findOne(id);

		if (veiculoCorrente == null) {
			throw new NotFoundServiceException("Erro ao alterar veículo " + s + ", não encontrado no banco de dados.");
		}

		veiculoCorrente.setAno(s.getAno());
		veiculoCorrente.setCor(s.getCor());
		veiculoCorrente.setMarca(s.getMarca());
		veiculoCorrente.setModelo(s.getModelo());
		veiculoCorrente.setOpcionais(s.getOpcionais());
		veiculoCorrente.setPlaca(s.getPlaca());
		veiculoCorrente.setValorDiaria(s.getValorDiaria());
		veiculoCorrente.setValorKM(s.getValorKM());

		return save(veiculoCorrente);
	}

}
