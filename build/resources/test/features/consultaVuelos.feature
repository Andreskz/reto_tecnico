  # Autor: Johnathan

  @stories
  Feature: Verificar el correcto funcionamiento de la consulta de la pestaña vuelos
    Yo como usuario quiero consultar a Latam para ver los vuelos disponibles desde la plataforma web

    # Escenarios de CP de llenar origen y destino mas busqueda completa
    @scenario1
    Scenario Outline: Verificar el desplegable ida y vuelta
      Given que Johnathan ingresa a la pagina de latamairlines
      When Ingresa el Origen y el destino
        | Origen   | Destino   |
        | <origen> | <destino> |
      Then Verifica que se seleccionen los dos campos
      Examples:
        | origen   | destino |
        | Medellin | Bogota  |

    #Solo inicio del home
    @scenario2

    Scenario Outline: Validacion opencart
      Given Johnathan necesita visitar la web opencart
      And el inicia sesion en el portal web
        | username   | password   |
        | <username> | <password> |
      When el da clic en el menú de ventas e ingresa a la seccion de ordenes para visualizar una orden
      #Then Valida una orden
      Examples:
        | username | password |
        | demo     | demo     |


