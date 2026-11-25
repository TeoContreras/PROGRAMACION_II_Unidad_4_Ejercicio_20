package ORGANIZADOR;

import SUPERclases.RolUsuario;

public class GestorSeguridad {

    public void navegar(RolUsuario rol, String moduloSistema){
        if (rol.verificarPermisoAcceso(moduloSistema)) {
            System.out.println("Acceso permitido al módulo " + moduloSistema);
        } else {
            System.out.println("Acceso denegado al módulo " + moduloSistema);
        }
    }
}
