package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Responsavel {

    protected ArrayList listaSolicitacoes = new ArrayList();
    private Responsavel responsavelSuperior;

    public Responsavel getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(Responsavel responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderChamado(Chamado chamado) {
        if (listaSolicitacoes.contains(chamado.getTipoSolicitacao())) {
            return getDescricaoCargo();
        }
        else {
            if (responsavelSuperior != null) {
                return responsavelSuperior.atenderChamado(chamado);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}