package DesafioMV.cafeDaManha.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DesafioMV.cafeDaManha.entity.ColaboradorEntity;
import DesafioMV.cafeDaManha.repository.ColaboradorRepository;

@Service
public class ColaboradorService {
	
	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	public ColaboradorEntity inserir(ColaboradorEntity colaborador){
		colaboradorRepository.save(colaborador);
		return colaborador;
	}
   
    public Optional<String> buscarPessoa(String cpf){
        return colaboradorRepository.findByCpf(cpf);
    }


}