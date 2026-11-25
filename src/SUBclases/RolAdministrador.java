package SUBclases;

import SUPERclases.RolUsuario;

public class RolAdministrador implements RolUsuario {

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        // El administrador accede a todos los módulos
        return true;
    }
}
