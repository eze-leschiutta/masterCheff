package edu.it.services;

import com.github.javafaker.Faker;
import edu.it.model.Usuario;
import java.util.UUID;

public class CreadorDeUsuario {
    public static Usuario crear() {
        var usu = new Usuario();
        var fkr = Faker.instance();

        usu.id = UUID.randomUUID().toString();
        usu.nombre = fkr.address().firstName();
        usu.apellido = fkr.address().lastName();
        usu.calle = fkr.address().streetName();
        usu.calleNumero = fkr.address().streetAddressNumber();
        usu.estado = fkr.address().state();
        usu.pais = fkr.address().country();

        return usu;
    }
}
