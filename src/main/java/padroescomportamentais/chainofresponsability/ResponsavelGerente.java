package padroescomportamentais.chainofresponsability;

public class ResponsavelGerente extends Responsavel {

    public ResponsavelGerente(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoServidor.getTipoSolicitacaoServidor());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}