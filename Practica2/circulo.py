import matplotlib.pyplot as plt

# Definir centro y radio
centro = (2, 3)
radio = 5

# Crear la figura y los ejes
fig, ax = plt.subplots()

# Crear el círculo
circulo = plt.Circle(centro, radio, color='b', fill=False)

# Agregar el círculo al gráfico
ax.add_patch(circulo)

# Configurar límites del gráfico
ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1)
ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)

# Mostrar ejes en la misma escala
ax.set_aspect('equal')

# Mostrar el gráfico
plt.show()