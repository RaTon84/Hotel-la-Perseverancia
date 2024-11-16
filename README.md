<div align="end">
  <img  src="https://github.com/RaTon84/Taller-Lenguajes-de-marcado-UNAHUR/blob/10ba9bdad96272088bfc71626eff781e41499173/logo-unahur.png" alt="logo-unahur" width="250" height="75" />
</div> 

# Hotel “La Perseverancia”.

Enunciado.

Desarrollar un sistema de gestión reservas de habitaciones de un Hotel
utilizando Java. El sistema debe permitir a los clientes realizar reservas de habitaciones
estándar, de lujo y suites, gestionar las reservas de manera eficiente y facilitar la
administración de las habitaciones disponibles. La solución debe ser robusta y eficiente,
utilizando las mejores prácticas de desarrollo orientado a objetos.

El diseño debe seguir los principios de la orientación a objetos,
asegurando la cohesión y el bajo acoplamiento de las clases. Se tendrá en cuenta el
correcto empleo de los conceptos de herencia, clases abstracta, polimorfismo, interface,
colecciones avanzadas, casos de prueba y manejo adecuado de excepciones para
garantizar la integridad y robustez del sistema.

El sistema debe permitir:

• Agregar habitaciones estándar, de lujo y suites al inventario del
hotel. Cada habitación se identificará de manera única por su
número de habitación y el valor por estadía depende de su
categoría ($200, $450 y $1,000 USD respectivamente).
o Cada nivel de habitación ofrece una experiencia de
alojamiento distinta, permitiendo a los huéspedes elegir la
opción que mejor se ajuste a sus necesidades y
preferencias de confort.

• Calcular el precio de reserva para una habitación determinada y en
un rango de fechas donde haya disponibilidad.

• Realizar reservas para habitaciones disponibles. La disponibilidad
debe ser verificada en tiempo real para evitar conflictos.

• La cancelación de reservas existentes, liberando las habitaciones
para nuevas reservas.

• Consultar las reservas existentes. La consulta debe ser rápida y
eficiente.

• Manejo de Excepciones. Debe manejar adecuadamente
situaciones como intentar reservar una habitación que ya está
ocupada o que no existe, mediante el uso de excepciones
específicas.

Se pide:

• Implementar las clases necesarias que den solución al
problema.

• Para el manejo de fechas podría usar:
https://docs.oracle.com/javase/8/docs/api/java/time/Loc
alDate.html (LocalDate). Posibles usos:
o LocalDate fecha = LocalDate.now();
o fecha.plusDays(2);
• Generen al menos los siguientes casos de prueba que
verifiquen la funcionalidad deseada.

1. Agregar una Habitación Estándar al Sistema:
Entrada: Información de la habitación estándar
(número de habitación, capacidad, precio por noche,
tiene balcón, vista, incluye desayuno, TV por cable).
Resultado Esperado: La habitación se agrega al
sistema y se puede recuperar correctamente.
2. Realizar una Reserva en una Habitación Estándar
Disponible:
Entrada: Cliente (del cual se conoce su nombre y
documento de identidad), habitación, fecha de inicio y fin
de la reserva.
Resultado Esperado: La reserva se realiza con éxito
y se puede recuperar la información de la reserva.
3. Cancelar una Reserva:
Entrada: Número de reserva.
Resultado Esperado: La reserva se cancela y la
habitación queda disponible nuevamente.
4. Intentar Reservar una Habitación Inexistente:
Entrada: Cliente, habitación inexistente, fecha de
inicio y fin de la reserva.
Resultado Esperado: Se lanza una excepción
“HabitacionInexistenteException” con el mensaje "La
habitación no existe."
5. Intentar Reservar una Habitación ya Ocupada:
Entrada: Cliente,habitación, fecha de inicio y fin de
la reserva (mismo periodo que una reserva existente).
Resultado Esperado: Se lanza una excepción
“HabitacionOcupadaException” con un mensaje
indicando que la habitación está ocupada.
6. Agregar una Suite al Sistema y Realizar una Reserva:
Entrada: Información de la suite (número de
habitación, capacidad, precio por noche, tamaño de la
suite, tiene jacuzzi, servicio de mayordomo, zona de estar,
número de habitaciones).
Resultado Esperado: La suite se agrega al sistema y
se puede realizar una reserva con éxito.
7. Consultar reservas por rango de fechas. Verificar que el
sistema devuelve todas las reservas dentro de un rango
de fechas específico:
Entrada: Realizar tres reservas en fechas diferentes
y consultar reservas con un rango que incluya una de las
reservas.
Resultado Esperado: El sistema devuelve solo la
reserva que coincide con el rango de fechas
