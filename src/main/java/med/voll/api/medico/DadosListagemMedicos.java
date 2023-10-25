package med.voll.api.medico;

public record DadosListagemMedicos(String nome, String crm, Especialidade especialidade) {
    public DadosListagemMedicos(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getEspecialidade());
    }
}
