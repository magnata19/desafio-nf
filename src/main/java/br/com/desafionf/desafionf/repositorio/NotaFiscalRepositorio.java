package br.com.desafionf.desafionf.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.desafionf.desafionf.modelo.NotaFiscalModelo;

public interface NotaFiscalRepositorio extends CrudRepository<NotaFiscalModelo, Integer> {
    
}
