import ORGANIZADOR.GestorSeguridad;
import SUBclases.RolAdministrador;
import SUBclases.RolEditor;
import SUBclases.RolInvitado;
import SUPERclases.RolUsuario;

public class MAIN {
    public static void main(String[] args) {
        GestorSeguridad gestor = new GestorSeguridad();

        RolUsuario rol = new RolAdministrador();
        System.out.println("--- Rol: Administrador ---");
        gestor.navegar(rol, "inicio");
        gestor.navegar(rol, "contenido");
        gestor.navegar(rol, "usuarios");

        rol = new RolEditor();
        System.out.println("--- Rol: Editor ---");
        gestor.navegar(rol, "inicio");
        gestor.navegar(rol, "contenido");
        gestor.navegar(rol, "usuarios");

        rol = new RolInvitado();
        System.out.println("--- Rol: Invitado ---");
        gestor.navegar(rol, "inicio");
        gestor.navegar(rol, "contenido");
        gestor.navegar(rol, "usuarios");
    }
}
