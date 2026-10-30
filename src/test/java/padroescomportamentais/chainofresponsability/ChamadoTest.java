package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    ResponsavelGerente gerente;
    ResponsavelCoordenador coordenador;
    ResponsavelTecnico tecnico;
    ResponsavelAtendente atendente;

    @BeforeEach
    void setUp() {
        gerente = new ResponsavelGerente(null);
        coordenador = new ResponsavelCoordenador(gerente);
        tecnico = new ResponsavelTecnico(coordenador);
        atendente = new ResponsavelAtendente(tecnico);
    }

    @Test
    void deveRetornarAtendenteParaChamadoSenha() {
        assertEquals("Atendente", atendente.atenderChamado(new Chamado(TipoSolicitacaoSenha.getTipoSolicitacaoSenha())));
    }

    @Test
    void deveRetornarTecnicoParaChamadoSoftware() {
        assertEquals("Tecnico", atendente.atenderChamado(new Chamado(TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware())));
    }

    @Test
    void deveRetornarCoordenadorParaChamadoRede() {
        assertEquals("Coordenador", atendente.atenderChamado(new Chamado(TipoSolicitacaoRede.getTipoSolicitacaoRede())));
    }

    @Test
    void deveRetornarGerenteParaChamadoServidor() {
        assertEquals("Gerente", atendente.atenderChamado(new Chamado(TipoSolicitacaoServidor.getTipoSolicitacaoServidor())));
    }

    @Test
    void deveRetornarSemAtendimentoParaChamadoImpressora() {
        assertEquals("Sem atendimento", atendente.atenderChamado(new Chamado(TipoSolicitacaoImpressora.getTipoSolicitacaoImpressora())));
    }

}
