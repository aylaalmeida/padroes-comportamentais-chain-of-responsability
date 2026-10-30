package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoServidor implements TipoSolicitacao {

    private static TipoSolicitacaoServidor tipoSolicitacaoServidor = new TipoSolicitacaoServidor();

    private TipoSolicitacaoServidor() {};

    public static TipoSolicitacaoServidor getTipoSolicitacaoServidor() {
        return tipoSolicitacaoServidor;
    }

}