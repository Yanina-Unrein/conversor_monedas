# conversor_monedas
Challenge para el programa ONE - Oracle Next Education

# 💱 Conversor de Monedas en Java

Este proyecto es una aplicación de consola escrita en Java que permite convertir montos entre diferentes monedas en tiempo real utilizando una API de tasas de cambio.

## 🚀 Funcionalidades

- Obtiene tasas de cambio actualizadas desde una API externa.
- Permite ingresar una moneda de origen, una moneda destino y un monto a convertir.
- Muestra el resultado de la conversión en pantalla.
- Valida que los códigos de moneda ingresados sean válidos.
- Manejo de errores en caso de conexión fallida o datos inválidos.

## 🧱 Estructura del Proyecto

src/
├── Main.java
├── model/
│   └── Currency.java
├── service/
│   └── ExchangeService.java
├── util/
│   └── JsonParser.java
└── ui/
    └── ConsoleUI.java

## 📦 Requisitos

- JDK 8 o superior
- Conexión a internet (para consultar la API)
- Biblioteca JSON (org.json)

### 📚 Agregar la librería JSON

Descargar el archivo .jar desde:
https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar

Agregarlo al classpath o al proyecto como biblioteca externa.


## API utilizada
https://api.exchangerate-api.com

Retorna tasas de cambio con base en USD

