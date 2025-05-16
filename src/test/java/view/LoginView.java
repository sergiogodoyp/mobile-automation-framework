package view;


import io.appium.java_client.AppiumBy;
import org.example.base.BaseView;
import org.openqa.selenium.By;


public class LoginView extends BaseView {

    public LoginView() {
        super();
    }


    private final By txtEmail = AppiumBy.accessibilityId("input-email");
    private final By txtContrasena = AppiumBy.accessibilityId("input-password");
    private final By txtConfirmarContrasena = AppiumBy.accessibilityId("input-repeat-password");
    private final By btnIniciarSesion = AppiumBy.accessibilityId("button-LOGIN");
    private final By lblMensajeBienvenida = AppiumBy.id("android:id/message");
    private final By btnRegistarUsuario = AppiumBy.accessibilityId("button-sign-up-container");
    private final By btnRegistrar = AppiumBy.accessibilityId("button-SIGN UP");

    public void ingresarEmail(String email) {
        escribirTexto(txtEmail,email);
    }

    public void ingresarContrasena(String password) {
        escribirTexto(txtContrasena, password);
    }

    public void presionarIniciarSesion() {
        presionar(btnIniciarSesion);
    }

    public String obtenerMensajeBienvenida() {
        return obtenerTexto(lblMensajeBienvenida);
    }

    public void confirmarContrasena(String password) {
        escribirTexto(txtConfirmarContrasena,password);
    }
    public void presionarRegistrarUsuario() {
        presionar(btnRegistarUsuario);
    }

    public void presionarRegistrar() {
        presionar(btnRegistrar);
    }

}
