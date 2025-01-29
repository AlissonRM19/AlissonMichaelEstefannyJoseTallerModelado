package com.example.miprimeraplicacion;

import java.util.Objects;


public class TestMetodos {

    public boolean passwordConfirmationMatch(String password, String passwordconfirm) {
        if (Objects.equals(password, passwordconfirm)) {
            return true;
        }
        else {
            //Toast.makeText(this, "Confirmacion de contraseña incorrecta", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public static boolean isEmpty(String editText) {
        if (editText == null) {
            return true; // Si el EditText es nulo, lo consideramos vacío
        }
        return editText.isEmpty();
    }
}
