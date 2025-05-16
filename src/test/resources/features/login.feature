@smoke
Feature: Login

Background:
    Given que la aplicación ha cargado correctamente

Scenario: El usuario inicia sesión con credenciales válidas
  When el usuario presiona la pestaña de Login
  And el usuario ingresa credenciales válidas con email "sergio.godoy.0801@gmail.com" y contraseña "Pruebas123"
  And el usuario presiona el botón de inicio de sesión
  Then el usuario visualiza un mensaje de bienvenida "You are logged in!"


Scenario: El usuario registra un nuevo usuario
  When el usuario presiona la pestaña de Login
  And el usuario presiona la pestaña de registrar usuario
  And el usuario ingresa los datos del nuevo usuario con email "pruebas@gmail.com" y contraseña "Pruebas123"
  And el usuario presiona el botón de registrar
  Then el usuario visualiza un mensaje de éxito "You successfully signed up!"