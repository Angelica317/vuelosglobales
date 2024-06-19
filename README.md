# Sistema de Gestión de Aerolíneas Vuelos Globales

Este proyecto consiste en el desarrollo de un sistema integral para la gestión de operaciones de la aerolínea Vuelos Globales. El sistema abarca una amplia gama de funcionalidades, desde el registro de aviones y tripulación hasta la gestión de rutas, reservas de vuelo y mantenimiento de aeronaves. El objetivo principal es proporcionar una solución eficiente y escalable que optimice los procesos de la aerolínea y mejore la experiencia del cliente.

### Tecnologías Utilizadas

- **Lenguaje de Programación:** Java con Spring Boot, un framework que facilita el desarrollo rápido de aplicaciones web Java.
- **Base de Datos:** MySQL, un sistema de gestión de bases de datos relacionales de código abierto, potente y ampliamente utilizado.
- Arquitectura:
  - **Hexagonal:** Esta arquitectura promueve la independencia del dominio de cualquier tecnología externa, mejorando la testabilidad y la adaptabilidad del sistema.
  - **Vertical Slicing:** Se divide el desarrollo en funcionalidades completas y entregables, permitiendo una entrega incremental de valor y facilitando la priorización de características.

### Estructura del Proyecto

El proyecto sigue la estructura típica de una aplicación Spring Boot:

- src/main/java:

   Contiene el código fuente de la aplicación,

   organizado en paquetes según la arquitectura hexagonal:

  - **domain:** Entidades del dominio y lógica de negocio.
  - **application:** Casos de uso y servicios de aplicación.
  - **infrastructure:** Adaptadores para interactuar con tecnologías externas (base de datos, API, etc.).
  - **config:** Configuración de la aplicación.

- **src/main/resources:** Contiene archivos de configuración (application.properties), scripts SQL para la creación de la base de datos y otros recursos.

- **src/test:** Contiene las pruebas unitarias e de integración.

### Instalación y Configuración

1. **Clonar el Repositorio:** `git clone https://github.com/lumigamher/vuelosglobales`
2. Configurar la Base de Datos:
   - Crear una base de datos MySQL.
   - Actualizar los datos de conexión en el archivo `application.properties`.
3. **Ejecutar la Aplicación:** `./mvnw spring-boot:run`

### Contribuciones

Las contribuciones al proyecto son bienvenidas. Si encuentras algún error o tienes alguna sugerencia de mejora, por favor abre un issue o envía un pull request.