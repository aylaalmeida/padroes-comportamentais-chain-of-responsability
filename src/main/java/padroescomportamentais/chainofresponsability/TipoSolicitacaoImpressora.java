package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoImpressora implements TipoSolicitacao {

    private static TipoSolicitacaoImpressora tipoSolicitacaoImpressora = new TipoSolicitacaoImpressora();

    private TipoSolicitacaoImpressora() {};

    public static TipoSolicitacaoImpressora getTipoSolicitacaoImpressora() {
        return tipoSolicitacaoImpressora;
    }

}