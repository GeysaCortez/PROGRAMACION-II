class Ministerio:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.empleados = []  

    def agregar_empleado(self, nombre_completo, edad, sueldo):
        self.empleados.append({
            "nombre": nombre_completo,
            "edad": edad,
            "sueldo": sueldo
        })

    def eliminar_empleado_por_edad(self, edad_objetivo):
        self.empleados = [emp for emp in self.empleados if emp["edad"] != edad_objetivo]

    def mostrar_empleado_menor_edad(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        menor = min(self.empleados, key=lambda emp: emp["edad"])
        print(f"Empleado con menor edad: {menor}")

    def mostrar_empleado_menor_sueldo(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        menor = min(self.empleados, key=lambda emp: emp["sueldo"])
        print(f"Empleado con menor sueldo: {menor}")

    def __str__(self):
        return f"Ministerio {self.nombre}, dirección: {self.direccion}, empleados: {len(self.empleados)}"

    # Sobrecarga del operador << para transferir un empleado del segundo al primer Ministerio
    def __lshift__(self, otro):
        if not otro.empleados:
            print("No hay empleados para transferir.")
            return
        empleado = otro.empleados.pop()  # Toma el último
        self.empleados.append(empleado)
        print(f"Empleado transferido: {empleado['nombre']}")


# a) Instanciar 2 objetos Ministerio de diferente forma
min1 = Ministerio("Rojo", "Estación Central, Cementerio, 16 de Julio")
min2 = Ministerio("Azul", "Obrajes, San Miguel, Irpavi")

# Agregar empleados
min1.agregar_empleado("Pedro Rojas Luna", 35, 2500)
min1.agregar_empleado("Lucy Sosa Rios", 43, 3250)
min1.agregar_empleado("Ana Perez Rojas", 26, 2700)
min1.agregar_empleado("Saul Arce Calle", 29, 2500)

# b) Eliminar a los empleados con edad X (por ejemplo 43)
min1.eliminar_empleado_por_edad(43)

# c) Transferir un empleado de min2 a min1 usando operador sobrecargado <<
# Primero, agregamos un empleado a min2 para poder transferir
min2.agregar_empleado("Carlos Pinto Zamora", 31, 2600)
min1 << min2  # Transfiere de min2 a min1

# d) Mostrar empleados con menor edad y menor sueldo
print("\nEmpleados en Ministerio 1:")
min1.mostrar_empleado_menor_edad()
min1.mostrar_empleado_menor_sueldo()

print("\nEmpleados en Ministerio 2:")
min2.mostrar_empleado_menor_edad()
min2.mostrar_empleado_menor_sueldo()
