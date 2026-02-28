# Requerimientos del Sistema

## 1. Lista general de requerimientos

EventSync permitira gestionar eventos académicos del campus (conferencias, talleres y hackathons).

### 1.1 Requerimientos funcionales

El sistema de EventSync debe tener la capacidad de:

- Crear eventos segun su tipo
- Registrar inscripciones
- Aplicar reglas de negocio por tipo de evento
- Notificar automáticamente a los inscritos ante cambios relevantes del evento.

### 1.2 Requerimientos funcionales

El sistema de EventSync debe tener:

1.  El sistema debe permitir la creacion de eventos por parte de _RRHH_
2.  El sistema debe permitir la inscripcion a eventos por parte de _estudiantes_

## 2. Diagramas de caso de uso

### 2.1 Requerimiento Funcional 1

| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** | Creacion de eventos |
| **Descripción** | El sistema debe permitir la creacion de eventos por parte de _RRHH_ |
| **Precondiciones** | Para que el sistema cumpla con este requerimiento el sistema debe tener previamente la informacion de profesores (mediante _enlace_) |
| **Actor** | RRHH |
| **Flujo principal** | 1. RRHH <br>2. EventSync <br>3. Enlace |
| **Diagrama de caso de uso** | ![img](../images/rrhh-use.png) |
| **Poscondiciones** | Una nofiticacion a _RRHH_ y a _estudiantes_ sobre la creacion del evento si es que fue posible, si no solo una notificacion a RRHH sobre que no fue posible |


### 2.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-03 |
| **Nombre del requerimiento** | inscripcion a eventos |
| **Descripción** | El sistema debe permitir a los estudiantes hacer registro para eventos |
| **Precondiciones** | EventSync debe saber que personas son _estudiantes_ de verdad, por ende debe usar _enlace_ |
| **Actor** | Estudiantes |
| **Flujo principal** | 1. Estudiantes <br>2. EventSync <br>3. Enlace |
| **Diagrama de caso de uso** | ![img](../images/estu-use.png) |
| **Poscondiciones** | Se espera que el sistema informte al estudiante sobre si fue aceptado o no para el evento |
