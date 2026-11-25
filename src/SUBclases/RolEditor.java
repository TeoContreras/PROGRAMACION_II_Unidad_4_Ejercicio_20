package SUBclases;

import SUPERclases.RolUsuario;

public class RolEditor implements RolUsuario {

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equals("inicio") || moduloSistema.equals("contenido") || moduloSistema.equals("reportes");
    }
}
