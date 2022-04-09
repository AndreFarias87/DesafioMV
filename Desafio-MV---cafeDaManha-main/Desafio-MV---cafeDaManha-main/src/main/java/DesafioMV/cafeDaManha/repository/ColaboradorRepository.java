package DesafioMV.cafeDaManha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DesafioMV.cafeDaManha.entity.ColaboradorEntity;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorEntity, Long> {

	Optional <String> findByCpf(String cpf);}
