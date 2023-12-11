package br.com.desafionf.desafionf.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.desafionf.desafionf.modelo.NotaFiscalModelo;
import br.com.desafionf.desafionf.modelo.RespostaModelo;
import br.com.desafionf.desafionf.repositorio.NotaFiscalRepositorio;

@Service
public class NotaFiscalServico {

    @Autowired
    private NotaFiscalRepositorio notaFiscalRepositorio;

    RespostaModelo respostaModelo = new RespostaModelo();
   
    // Método para lançar/cadastrar uma nf
    public ResponseEntity<?> cadastrarNotaFiscal(NotaFiscalModelo notaFiscalModelo) {
        // Vaidadando nome da empresa
        if (notaFiscalModelo.getNomeDaEmpresa().equals("")) {
            respostaModelo.setMensagem("O nome da empresa é obrigatório.");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);

            // Validando razao social
        } else if (notaFiscalModelo.getRazaoSocial().equals("")) {
            respostaModelo.setMensagem("A razão social é obrigatória");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);

            //validando cnpj
        } else if (notaFiscalModelo.getCnpj().equals("")){
            respostaModelo.setMensagem("O CNPJ é obrigatório.");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);

            //validando descricao do produto
        } else if (notaFiscalModelo.getDescricaoProduto().equals("")){
            respostaModelo.setMensagem("A descrição do produto é obrigatória.");
            return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<NotaFiscalModelo>(notaFiscalRepositorio.save(notaFiscalModelo), HttpStatus.CREATED);
        }
    }
}
