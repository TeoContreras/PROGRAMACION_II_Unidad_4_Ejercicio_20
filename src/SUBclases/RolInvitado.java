package SUBclases;

import SUPERclases.RolUsuario;

public class RolInvitado implements RolUsuario {

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equals("inicio");
    }
}
