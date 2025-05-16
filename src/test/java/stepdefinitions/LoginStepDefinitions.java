package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import view.LoginView;

public class LoginStepDefinitions {

    private LoginView loginView;


    @And("el usuario ingresa credenciales válidas con email {string} y contraseña {string}")
    public void elUsuarioIngresaCredencialesValidasConEmailYContrasena(String email, String contrasena) {
        loginView = new LoginView();
        loginView.ingresarEmail(email);
        loginView.ingresarContrasena(contrasena);
    }

    @And("el usuario presiona el botón de inicio de sesión")
    public void elUsuarioPresionaElBotonDeInicioDeSesion() {
        loginView.presionarIniciarSesion();
    }

    @Then("el usuario visualiza un mensaje de bienvenida {string}")
    public void elUsuarioVisualizaUnMensajeDeBienvenida(String mensaje) {
        Assertions.assertEquals(mensaje, loginView.obtenerMensajeBienvenida());
    }

    @And("el usuario presiona la pestaña de registrar usuario")
    public void elUsuarioPresionaLaPestanaDeRegistrarUsuario() {
        loginView = new LoginView();
        loginView.presionarRegistrarUsuario();
    }

    @And("el usuario ingresa los datos del nuevo usuario con email {string} y contraseña {string}")
    public void elUsuarioIngresaLosDatosDelNuevoUsuarioConEmailYContrasena(String email, String contrasena) {
        loginView.ingresarEmail(email);
        loginView.ingresarContrasena(contrasena);
        loginView.confirmarContrasena(contrasena);
    }

    @And("el usuario presiona el botón de registrar")
    public void elUsuarioPresionaElBotonDeRegistrar() {
        loginView.presionarRegistrar();
    }

    @Then("el usuario visualiza un mensaje de éxito {string}")
    public void elUsuarioVisualizaUnMensajeDeExito(String mensaje) {
        Assertions.assertEquals(mensaje, loginView.obtenerMensajeBienvenida());
    }
}
