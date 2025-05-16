package view;

import io.appium.java_client.AppiumBy;
import org.example.base.BaseView;
import org.openqa.selenium.By;

public class HomeView extends BaseView {

    public HomeView() {
        super();
    }


    private final By btnLogin = AppiumBy.accessibilityId("Login");

    private final By pantallaHome = AppiumBy.accessibilityId("Home-screen");

    public void presionarLogin() {
        presionar(btnLogin);
        new LoginView();
    }

    public boolean esVisiblePantallaHome() {
        return estaVisibleElemento(pantallaHome);
    }

}
