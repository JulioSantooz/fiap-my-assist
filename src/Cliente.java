public class Cliente {

    String nome, telefone, email, endereco, documento;
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
