# Framework de Automatización para Pruebas con Aplicaciones Móviles

Este proyecto es un **Framework de Automatización** diseñado para realizar pruebas en aplicaciones móviles utilizando **Appium**, **Cucumber** y **JUnit 5**. Está configurado para soportar tanto plataformas **Android** como **iOS**.

## Tabla de Contenidos

- [Requisitos Previos](#requisitos-previos)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Configuración](#configuración)
  - [Archivo `config.properties`](#archivo-configproperties)
- [Ejecución de Pruebas](#ejecución-de-pruebas)
- [Características Implementadas](#características-implementadas)
- [Dependencias](#dependencias)
- [Contribuciones](#contribuciones)

---

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- **Java 17** o superior.
- **Maven** para la gestión de dependencias.
- **Appium Server** en ejecución.
- Un emulador o dispositivo físico configurado para pruebas.

---

## Estructura del Proyecto

El proyecto sigue una estructura modular para facilitar la escalabilidad y el mantenimiento:

---

## Configuración

### Archivo `config.properties`

El archivo `config.properties` contiene la configuración necesaria para ejecutar las pruebas. Asegúrate de actualizarlo según tu entorno:

```ini
# Configuración común
platformName=Android
automationName=UIAutomator2
deviceName=Pixel_6_Pro
udid=emulator-5554
appPackage=com.wdiodemoapp
appActivity=com.wdiodemoapp.MainActivity

# iOS específico
# bundleId=com.example.app
# udid=1234567890
```

## Ejecución de Pruebas
Compila el proyecto: 
```bash
mvn clean install
```
Ejecuta las pruebas con Maven:  
```bash
mvn test
```
Genera un reporte HTML: Los reportes se generan automáticamente en target/cucumber-reports.html.

---

## Características Implementadas
### Escenarios de Prueba

#### Inicio de Sesión
- Validación de credenciales correctas.
- Mensaje de bienvenida esperado.

#### Registro de Usuario
- Creación de un nuevo usuario.
- Validación de mensaje de éxito.

----

### Hooks
- **@After Hook** : Cierra el driver después de cada escenario para evitar conflictos.

### Gestión del Driver
- Soporte para **Android** e **iOS**.
- Configuración dinámica a través de `config.properties`.

---

## Dependencias

El proyecto utiliza las siguientes dependencias principales:

- **Appium Java Client**: 8.6.0  
- **Cucumber**: 7.11.0  
- **JUnit 5**: 5.9.1  
- **Selenium**: 4.13.0  

Estas dependencias están definidas en el archivo `pom.xml`.

---

## Contribuciones

¡Las contribuciones son bienvenidas! Por favor, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad o corrección de errores.
3. Envía un pull request con una descripción detallada.

---