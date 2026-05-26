Sistema de Gestión de Tienda de Mascotas

Aplicación desarrollada en Java para la administración de mascotas dentro de una tienda mediante consola.

El sistema permite registrar diferentes tipos de mascotas, consultar inventario y realizar búsquedas específicas aplicando principios de Programación Orientada a Objetos.



Funcionalidades

- Registro de nuevas mascotas
- Gestión de diferentes tipos de mascotas
- Visualización completa del inventario
- Búsqueda por tipo de mascota
- Menú interactivo por consola
- Validación de entradas del usuario



Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Clases abstractas
- ArrayList
- Scanner


Estructura del proyecto

```text
MainTiendaMascotas.java
 ├── Mascota (Clase abstracta)
 ├── Gato
 ├── Perro
 ├── Otro
 ├── TiendaMascotas
 └── MainTiendaMascotas
```



Arquitectura del sistema

Mascota
Clase abstracta base que define los atributos comunes:

- Nombre
- Edad
- Tipo
- Raza

Incluye el método abstracto:

```java
mostrarInformacion()
```

---

Gato
Extiende la clase Mascota.

Atributo adicional:

- Estado de esterilización


Perro
Extiende la clase Mascota.

Atributo adicional:

- Tamaño



Otro
Extiende la clase Mascota.

Atributos adicionales:

- Especie
- Cuidados especiales



TiendaMascotas
Gestiona el inventario y operaciones del sistema:

- Registrar mascotas
- Mostrar inventario
- Buscar por tipo



Cómo ejecutar

Compilar

```bash
javac MainTiendaMascotas.java
```

Ejecutar

```bash
java MainTiendaMascotas
```



Opciones disponibles

1. Registrar nueva mascota
Permite agregar:

- Gatos
- Perros
- Otros animales



2. Mostrar inventario completo
Visualiza todas las mascotas registradas.

3. Buscar por tipo
Filtra mascotas según su categoría.


4. Salir
Finaliza la ejecución del sistema.


Conceptos aplicados

Durante este proyecto se aplicaron conceptos clave de Java:

- Encapsulamiento
- Herencia
- Polimorfismo
- Abstracción
- Colecciones dinámicas
- Diseño orientado a objetos
- Validación de entradas



Ejemplo de uso

```text
MENÚ PRINCIPAL

1. Registrar nueva mascota
2. Mostrar inventario completo
3. Buscar mascotas por tipo
4. Salir
```



Objetivo del proyecto

Fortalecer habilidades en desarrollo backend con Java y profundizar en la aplicación práctica de Programación Orientada a Objetos mediante un sistema de gestión funcional.



Aprendizajes obtenidos

Este proyecto permitió reforzar:

- Diseño de jerarquías de clases
- Implementación de clases abstractas
- Aplicación de polimorfismo
- Manejo de estructuras dinámicas
- Organización modular del código


Autor

Nicolas

Desarrollador en formación enfocado en Java, programación backend y construcción de soluciones prácticas.
