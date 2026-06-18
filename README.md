# LlanquihueTourApp2.0
Aplicación Java desarrollada para la gestión de tours turísticos de la agencia Llanquihue Tour. Implementa Programación Orientada a Objetos, organización modular en paquetes, colecciones ArrayList, lectura de archivos externos y búsqueda de información mediante consola.
🌎 LlanquihueTourApp

📖 Descripción

LlanquihueTourApp es una aplicación desarrollada en Java que permite gestionar información de tours turísticos mediante Programación Orientada a Objetos (POO), lectura de archivos y colecciones dinámicas.

El sistema carga información desde un archivo de texto, crea objetos relacionados mediante composición y permite realizar búsquedas, filtros y estadísticas sobre los tours registrados.

---

🎯 Objetivos

- Aplicar Programación Orientada a Objetos.
- Utilizar encapsulamiento y composición entre clases.
- Implementar colecciones utilizando ArrayList.
- Leer información desde archivos externos.
- Realizar búsquedas y filtros.
- Generar estadísticas sobre los tours.

---

🛠 Tecnologías Utilizadas

Tecnología| Uso
Java| Desarrollo de la aplicación
IntelliJ IDEA| Entorno de desarrollo
ArrayList| Gestión de colecciones
BufferedReader| Lectura de archivos
GitHub| Control de versiones

---
```text
📂 Estructura del Proyecto

LlanquihueTourApp
│
├── src
│   ├── model
│   │   ├── Guia.java
│   │   ├── Transporte.java
│   │   ├── Tour.java
│   │   └── Agencia.java
│   │
│   ├── data
│   │   └── GestorDatos.java
│   │
│   ├── service
│   │   └── ServicioTours.java
│   │
│   └── ui
│       └── Main.java
│
└── resources
    └── tours.txt
```
---

🏗 Clases del Sistema

👨‍💼 Guia

Representa a un guía turístico con:

- Nombre
- Especialidad
- Años de experiencia

🚌 Transporte

Representa el medio de transporte utilizado en los tours:

- Tipo
- Capacidad

🗺 Tour

Representa un tour turístico e incorpora:

- Nombre
- Destino
- Participantes
- Precio
- Guía
- Transporte

🏢 Agencia

Administra la colección de tours mediante un ArrayList.

📁 GestorDatos

Se encarga de leer el archivo "tours.txt" y crear los objetos necesarios.

⚙ ServicioTours

Contiene la lógica principal:

- Mostrar tours
- Buscar tours
- Filtrar tours
- Generar estadísticas

▶ Main

Clase principal encargada de ejecutar el sistema.

---

🚀 Funcionalidades

✅ Carga de información desde archivo

✅ Visualización de tours

✅ Búsqueda por nombre

✅ Filtrado por cantidad de participantes

✅ Estadísticas generales

✅ Validación de entradas

---

📊 Estadísticas Disponibles

El sistema permite visualizar:

- Cantidad total de tours.
- Promedio de participantes.
- Tour con más participantes.
- Tour más caro.

---

📄 Archivo de Datos

Ubicación:

resources/tours.txt

Ejemplo:

Ruta Gastronomica;Puerto Varas;20;25000;Pedro Soto;Gastronomia;5;Bus;40

---

🧠 Conceptos Aplicados

- Programación Orientada a Objetos (POO)
- Encapsulamiento
- Composición
- Colecciones (ArrayList)
- Lectura de archivos
- Manejo de excepciones
- Organización por capas

---

▶ Cómo Ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que exista el archivo "resources/tours.txt".
3. Ejecutar la clase "Main.java".
4. Utilizar el menú interactivo.

---

👨‍🎓 Autor

Sebastián Estrada

Proyecto académico desarrollado para la asignatura de Programación Orientada a Objetos.
