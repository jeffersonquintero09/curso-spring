package com.bolsadeideas.springboot.web.app.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private String email;

}
