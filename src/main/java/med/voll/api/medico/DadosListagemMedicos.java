package med.voll.api.medico;

public record DadosListagemMedicos(Long id, String nome, String crm, Especialidade especialidade) {
    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getEspecialidade());
    }
}
