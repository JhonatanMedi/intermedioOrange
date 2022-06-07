#01/06/2022
#jhonatan medina
@Regresion
Feature:Manejo de data por medio de excel

  @Excel
  Scenario Outline: agregar usuario administrador
    Given open browser
    And diligenciar user <user> y contrasena <pass>
    And llegar a agregar un usuario
    When Diligenciar el nombre de la hoja <sheetName> y numero de columna <rowNumber>

    Examples:
      | user  | pass     | sheetName   | rowNumber |
      | Admin | admin123 | RegTestData | 0         |