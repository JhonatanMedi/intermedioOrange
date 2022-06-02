#01/06/2022
#jhonatan medina
@Regresion
Feature:Manejo de data por medio de excel

  @Excel
  Scenario Outline: agregar usuario administrador
    Given open browser
    And diligenciar user <user> y contrasena <pass>
    And llegar a agregar un usuario

    Examples:
      | user  | pass     |
      | Admin | admin123 |