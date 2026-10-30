package padroescomportamentais.chainofresponsability;

public class ResponsavelTecnico extends Responsavel {

    public ResponsavelTecnico(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Tecnico";
    }

}