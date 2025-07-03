# FastFoodRefactor - Examen Tema 4

Este proyecto contiene la refactorización del sistema de gestión de pedidos para la cadena de comida rápida "FastFood", aplicando **5 patrones de diseño** en Java.

## Estructura del Proyecto

### 1. Observer Pattern (`observer/`)
Separa la lógica de notificaciones (`Email`, `SMS`, etc.) del sistema principal, usando `Observer` y `Subject`.

### 2. Command Pattern (`command/`)
Encapsula la acción de enviar un pedido a cocina (`KitchenService`) como un comando ejecutable.

### 3. Proxy Pattern (`proxy/`)
Agrega control de acceso al procesamiento de pedidos mediante una clase `OrderServiceProxy`.

### 4. Factory Method Pattern (`factory/`)
Permite instanciar manejadores de pedidos diferentes (`Online`, `InStore`) sin usar `if-else`.

### 5. Template Method Pattern (`template/`)
Define el flujo de procesamiento de un pedido con pasos comunes y algunos específicos según el tipo.

## Alumnos

**[Echenique Juan - Lanza Tiago]**  
Materia: **Programación 3**

---

Este proyecto es una solución estructurada y mantenible al sistema monolítico original de `OrderManager`.
