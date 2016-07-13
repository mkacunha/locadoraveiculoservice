package br.mkacunha.locadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mkacunha.locadora.model.Veiculo;
import br.mkacunha.locadora.service.AbstractGenericService;
import br.mkacunha.locadora.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController extends AbstractGenericController<Veiculo, Long> {

	@Autowired
	private VeiculoService veiculoService;

	@Override
	AbstractGenericService<Veiculo, Long> getService() {
		return veiculoService;
	}

}
