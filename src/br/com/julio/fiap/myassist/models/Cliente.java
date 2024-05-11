package br.com.julio.fiap.myassist.models;

import br.com.julio.fiap.myassist.enums.TipoDocumentoEnum;
import br.com.julio.fiap.myassist.models.abstracts.Pessoa;

public class Cliente extends Pessoa {

    String endereco, documento;
    TipoDocumentoEnum tipoDocumento;

    public Cliente() {

    }

    public Cliente(String nome, String telefone, String email, String endereco, String documento, TipoDocumentoEnum tipoDocumento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

}
