package med.voll.api.domain.medico;

public record DadosListagemMedicos(Long id, String nome, String crm, Especialidade especialidade) {
    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getEspecialidade());
    }
}
