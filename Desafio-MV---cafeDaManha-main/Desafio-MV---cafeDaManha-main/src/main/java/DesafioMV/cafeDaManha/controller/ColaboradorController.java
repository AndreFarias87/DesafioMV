package DesafioMV.cafeDaManha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DesafioMV.cafeDaManha.entity.ColaboradorEntity;
import DesafioMV.cafeDaManha.service.ColaboradorService;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {
	
	@Autowired
	ColaboradorService colaboradorService;
	
	@PostMapping("/inserir-colaborador")
	public ColaboradorEntity inserirColaborador(@RequestBody ColaboradorEntity colaborador) {
		colaboradorService.inserir(colaborador);
		return colaborador;
	}
	
	@GetMapping("/buscar-pessoa/")
	public ResponseEntity<?> buscarPessoa(@RequestParam(name = "cpf") String cpf) throws Exception {
	    try {
	        var pessoaRetornada = colaboradorService.buscarPessoa(cpf);
	        return new ResponseEntity(pessoaRetornada, HttpStatus.OK);
	    }catch (Exception e){
	        e.printStackTrace();
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
}
