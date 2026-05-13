# Agenda de Contactos con Thymeleaf

> Aplicación web CRUD para gestionar contactos, desarrollada con Spring Boot 4, Thymeleaf y MySQL.

[![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=openjdk)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.x-brightgreen?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.x-005F0F?style=flat-square&logo=thymeleaf)](https://www.thymeleaf.org/)
[![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=flat-square&logo=apachemaven)](https://maven.apache.org/)

---

## Descripción

**Agenda de Contactos** es una aplicación web full-stack que permite gestionar una lista de contactos personales o laborales a través de una interfaz limpia y sencilla. Implementa las cuatro operaciones fundamentales de cualquier sistema de datos: **Crear, Leer, Actualizar y Eliminar (CRUD)**.

El proyecto fue desarrollado con el objetivo de aplicar los fundamentos de Spring Boot en un caso de uso real, integrando la capa de presentación (Thymeleaf) con la capa de persistencia (Spring Data JPA + MySQL).

---

## Funcionalidades Principales

- **Listar contactos** — Visualiza todos los contactos en una tabla organizada
- **Agregar contacto** — Formulario para registrar nombre, apellido, teléfono, email y dirección
- **Editar contacto** — Modifica los datos de cualquier contacto existente
- **Eliminar contacto** — Elimina un contacto con confirmación previa
- **Interfaz responsiva** — Diseño adaptable con CSS personalizado

---

##  Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|-----------|---------|-----------|
| Java | 21 | Lenguaje de programación principal |
| Spring Boot | 4.0.x | Framework de aplicación web |
| Spring MVC | (incluido) | Manejo de peticiones HTTP y rutas |
| Spring Data JPA | (incluido) | Capa de persistencia y acceso a datos |
| Hibernate | (incluido) | ORM — mapeo objeto-relacional |
| Thymeleaf | 3.x | Motor de plantillas HTML del lado servidor |
| MySQL | 8.x | Sistema de gestión de base de datos |
| Lombok | (incluido) | Reducción de código boilerplate |
| Maven | 3.9+ | Gestión de dependencias y build |
| Apache Tomcat | (embebido) | Servidor de aplicaciones |

---

## Capturas de Pantalla

> Las siguientes imágenes ilustran las pantallas principales de la aplicación.

### Lista de Contactos
```
┌──────────────────────────────────────────────────────────────┐
│  📒 Agenda de Contactos              [+ Nuevo Contacto]      │
├──────┬──────────┬───────────┬────────────┬───────────────────┤
│  ID  │  Nombre  │ Apellido  │  Teléfono  │     Acciones      │
├──────┼──────────┼───────────┼────────────┼───────────────────┤
│   1  │  Juan    │ Pérez     │ 555-1234   │ [Editar][Eliminar] │
│   2  │  María   │ García    │ 555-5678   │ [Editar][Eliminar] │
│   3  │  Carlos  │ López     │ 555-9012   │ [Editar][Eliminar] │
└──────┴──────────┴───────────┴────────────┴───────────────────┘
```

### Formulario de Contacto
```
┌─────────────────────────────────────────┐
│  Nuevo Contacto                         │
│                                         │
│  Nombre *   [________________________]  │
│  Apellido   [________________________]  │
│  Teléfono   [________________________]  │
│  Email      [________________________]  │
│  Dirección  [________________________]  │
│             [________________________]  │
│                                         │
│             [Guardar]  [Cancelar]       │
└─────────────────────────────────────────┘
```

---

## Estructura del Proyecto

```
Sistema-contactos/
├── src/
│   ├── main/
│   │   ├── java/dc/sistemacontactos/
│   │   │   ├── SistemaContactosApplication.java
│   │   │   ├── entity/
│   │   │   │   └── Contacto.java
│   │   │   ├── repository/
│   │   │   │   └── ContactoRepository.java
│   │   │   ├── service/
│   │   │   │   ├── ContactoService.java
│   │   │   │   └── ContactoServiceImpl.java
│   │   │   └── controller/
│   │   │       └── ContactoController.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── form.html
│   │       ├── static/
│   │       │   └── css/styles.css
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## Requisitos Previos

Asegúrate de tener instalado en tu sistema:

- **JDK 21** o superior — [Descargar](https://adoptium.net/)
- **MySQL 8.x** — [Descargar](https://dev.mysql.com/downloads/mysql/)
- **Maven 3.9+** — [Descargar](https://maven.apache.org/download.cgi) *(o usa el wrapper `mvnw` incluido)*
- **Git** — [Descargar](https://git-scm.com/)

---

## Instalación y Configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/DanielAsDano/Agenda-de-contactos-con-thymeleaf.git
cd Agenda-de-contactos-con-thymeleaf
```

### 2. Crear la base de datos en MySQL

Abre MySQL Workbench o tu terminal MySQL y ejecuta:

```sql
CREATE DATABASE agenda_contactos
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;
```

### 3. Configurar la conexión a la base de datos

Edita el archivo `src/main/resources/application.properties`:

```properties
# Cambia estos valores según tu entorno local
spring.datasource.url=jdbc:mysql://localhost:3306/agenda_contactos?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update
```

> **Nota:** Con `ddl-auto=update`, Hibernate creará automáticamente la tabla `contacto` al iniciar la aplicación por primera vez. No es necesario crear la tabla manualmente.

### 4. Compilar el proyecto

```bash
# Usando el Maven Wrapper (recomendado, no requiere Maven instalado)
./mvnw clean install

# En Windows
mvnw.cmd clean install

# O con Maven instalado
mvn clean install
```

---

## Ejecución

```bash
# Con Maven Wrapper
./mvnw spring-boot:run

# En Windows
mvnw.cmd spring-boot:run

# O ejecutando el JAR generado
java -jar target/Sistema-contactos-0.0.1-SNAPSHOT.jar
```

Abre tu navegador en:

```
http://localhost:8080/contactos
```

---

## Endpoints de la Aplicación

| Método | URL | Descripción |
|--------|-----|-------------|
| `GET` | `/contactos` | Lista todos los contactos |
| `GET` | `/contactos/nuevo` | Muestra formulario para nuevo contacto |
| `POST` | `/contactos/guardar` | Guarda un contacto (nuevo o editado) |
| `GET` | `/contactos/editar/{id}` | Muestra formulario con datos del contacto |
| `GET` | `/contactos/eliminar/{id}` | Elimina el contacto por ID |

---

## Documentación Adicional

Este proyecto incluye tres guías técnicas de apoyo:

- **`Agenda de contactos con thymeleaf.md`** — Guía paso a paso para recrear el proyecto desde cero, con explicaciones de cada capa del código.
- **`Thymeleaf.md`** — Hoja de referencia rápida (cheat sheet) de los atributos, expresiones y funcionalidades de Thymeleaf.
- **`web & java.md`** — Arquitectura de integración: cómo fluyen los datos entre el HTML y el backend Java.

---

## Autor

**Cárdenas Daniel**

- GitHub: [@DanielAsDano](https://github.com/DanielAsDano)

---

## Licencia

Este proyecto es de uso educativo y académico.
