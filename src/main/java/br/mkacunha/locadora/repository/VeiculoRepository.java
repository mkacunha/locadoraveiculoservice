package br.mkacunha.locadora.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.mkacunha.locadora.model.Veiculo;

public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {

}
