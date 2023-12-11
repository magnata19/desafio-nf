package br.com.desafionf.desafionf.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "NOTA_FISCAL")
@Getter
@Setter
public class NotaFiscalModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDaEmpresa;
    private String razaoSocial;
    private String cnpj;
    private String descricaoProduto;

}
