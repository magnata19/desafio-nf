package br.com.desafionf.desafionf.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafionf.desafionf.modelo.NotaFiscalModelo;
import br.com.desafionf.desafionf.servico.NotaFiscalServico;

@RestController
public class NotaFiscalControle {
    
    @Autowired
    private NotaFiscalServico notaFiscalServico;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrarNotaFiscal(@RequestBody NotaFiscalModelo notaFiscalModelo){
        return notaFiscalServico.cadastrarNotaFiscal(notaFiscalModelo);
    }
}
