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

### ✅ Requisitos previos

- Tener instalado **Java 21**
- Tener instalado **IntelliJ IDEA** (o tu IDE favorito para Java)
- Acceso a internet (para realizar las conversiones vía API)

### 🧪 Pasos para ejecutar

1. Clona el repositorio:

   ```bash
   https://github.com/Yanina-Unrein/conversor_monedas.git
   ```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta la clase `Main` 


## API utilizada
https://api.exchangerate-api.com

