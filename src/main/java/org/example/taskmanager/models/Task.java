package org.example.taskmanager.models;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private int id;

    @NotBlank(message = "Titulo é obrigatorio")
    @Size(message = "Titulo deve ter entre 3 e no maximo 10 caracteres", min = 3, max = 10)
    private String title;

    @NotBlank(message = "Descrição é obrigatório")
    @Size(message = "Titulo deve ter maximo 50 caracteres", min = 1, max = 50)
    private String description;

    private boolean completed;
}
