package br.com.desafionf.desafionf.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.desafionf.desafionf.modelo.NotaFiscalModelo;
import br.com.desafionf.desafionf.modelo.RespostaModelo;
import br.com.desafionf.desafionf.repositorio.NotaFiscalRepositorio;

@Service
public class NotaFiscalServico {
    
    @Autowired
    private NotaFiscalRepositorio notaFiscalRepositorio;

    @Autowired
    private RespostaModelo respostaModelo;

    //Método para lançar/cadastrar uma nf
     
}
