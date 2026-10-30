package padroescomportamentais.chainofresponsability;

public class ResponsavelCoordenador extends Responsavel {

    public ResponsavelCoordenador(Responsavel superior) {
        listaSolicitacoes.add(TipoSolicitacaoRede.getTipoSolicitacaoRede());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Coordenador";
    }

}