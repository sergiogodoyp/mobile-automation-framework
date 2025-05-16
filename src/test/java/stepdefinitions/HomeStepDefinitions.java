package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.drivers.DriverManager;
import org.junit.jupiter.api.Assertions;
import view.HomeView;

public class HomeStepDefinitions {

    private HomeView homeView;

    public HomeStepDefinitions() {
        this.homeView = new HomeView(); // Inicializa el atributo de la clase
        verifyDriverReady();
    }

    private void verifyDriverReady() {
        Assertions.assertNotNull(DriverManager.getDriver(), "ERROR: Driver no inicializado");
        Assertions.assertNotNull(DriverManager.getDriver().getSessionId(), "ERROR: Sesión de Appium no activa");
    }

    @Given("que la aplicación ha cargado correctamente")
    public void queLaAplicacionHaCargadoCorrectamente() {
        Assertions.assertTrue(homeView.esVisiblePantallaHome(), "ERROR: La aplicación no cargó correctamente");
    }

    @When("el usuario presiona la pestaña de Login")
    public void elUsuarioPresionaLaPestanaDeLogin() {
        homeView.presionarLogin();
    }

}
