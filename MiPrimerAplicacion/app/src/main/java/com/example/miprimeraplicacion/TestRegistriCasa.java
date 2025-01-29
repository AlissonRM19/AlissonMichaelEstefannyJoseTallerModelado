package com.example.miprimeraplicacion;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class TestRegistriCasa {

    //Validacion de registro de casa con espacios completos
    public class Test1ValidadorRegistroCasa {

        public boolean validarCamposRegistro(String nombre, String reglas, String capacidad, String precio, String ubicacion, String descripcion) {
            if (nombre.isEmpty()) {
                return false;
            }

            if (reglas.isEmpty()) {
                return false;
            }

            if (capacidad.isEmpty()) {
                return false;
            }

            if (precio.isEmpty()) {
                return false;
            }

            if ("latitud: 0.0, longitud: 0.0".equals(ubicacion)) {
                return false;
            }

            return true;
        }
    }

//Mensaje de recuperación de contraseña
    public class Test1ProcesarMensajes {

        public  String determinarAccionMensaje(String message) {
            if (message == null) {
                return "ninguna_accion";
            }

            if ("10".equals(message)) {
                return "abrir_recuperacion";
            }

            if ("20".equals(message)) {
                return "mostrar_error_autenticacion";
            }

            return "mostrar_error_fatal";
        }
    }


}
