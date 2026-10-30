package padroescomportamentais.chainofresponsability;

public class ResponsavelAtendente extends Responsavel {

    public ResponsavelAtendente(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoSenha.getTipoSolicitacaoSenha());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }

}