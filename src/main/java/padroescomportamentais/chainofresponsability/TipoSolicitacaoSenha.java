package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoSenha implements TipoSolicitacao {

    private static TipoSolicitacaoSenha tipoSolicitacaoSenha = new TipoSolicitacaoSenha();

    private TipoSolicitacaoSenha() {};

    public static TipoSolicitacaoSenha getTipoSolicitacaoSenha() {
        return tipoSolicitacaoSenha;
    }

}