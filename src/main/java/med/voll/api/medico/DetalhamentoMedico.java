package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DetalhamentoMedico(Long id, String nome, String email, String crm, Especialidade especialidade,
                                 Endereco endereco) {
    public DetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(),
                medico.getEndereco());
    }
}
