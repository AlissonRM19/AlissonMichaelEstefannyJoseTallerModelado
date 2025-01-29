package com.example.miprimeraplicacion;

import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

public class TestMetodos {
    public boolean checkEspaciosObligatorios(String nameEditText, String lastNameEditText, String nicknameEditText,
                                             String emailEditText, String passwordEditText, String professorNameEditText,
                                             String nacionalidad, String childhoodNicknameEditText, String favoriteTeamEditText,
                                             String cardNumberEditText, String cardExpiryEditText, String cardCvcEditText) {
        if (Objects.equals(nameEditText, "") || Objects.equals(lastNameEditText, "") ||
                Objects.equals(nicknameEditText, "") || Objects.equals(emailEditText, "") || passwordEditText == ""
                || Objects.equals(professorNameEditText, "") || Objects.equals(nacionalidad, "")
                || Objects.equals(childhoodNicknameEditText, "") || Objects.equals(favoriteTeamEditText, "")
                || Objects.equals(cardNumberEditText, "") || Objects.equals(cardExpiryEditText, "")
                || Objects.equals(cardCvcEditText, "")) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean procesarMensaje(String message){

        if ("1".equals(message)) {
            // Abrir nueva ventana si el mensaje es "1"
            // Se recibe un mensaje que se puede procesar
            return true;
        } else if ("0".equals(message)) {
            // Mostrar mensaje de credenciales incorrectas
            // Se recibe un mensaje que se puede procesar
            return true;

        } else {
            // Manejar otros mensajes si es necesario
            // Se recibe un mensaje que no puede procesarse
            return false;


        }

    }
}
