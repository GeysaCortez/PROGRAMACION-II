class LineaTeleferico:
    def __init__(self, color, tramo, nroCabinas):
        self.color = color
        self.tramo = tramo
        self.nroCabinas = nroCabinas
        self.empleados = []  

    def agregar_empleado(self, nombre_completo, edad, sueldo):
        self.empleados.append({
            "nombre": nombre_completo,
            "edad": edad,
            "sueldo": sueldo
        })

    def eliminar_empleado_por_apellido(self, apellido):
        self.empleados = [emp for emp in self.empleados if apellido not in emp["nombre"]]

    def mostrar_empleado_mayor_edad(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        mayor = max(self.empleados, key=lambda emp: emp["edad"])
        print(f"Empleado con mayor edad: {mayor}")

    def mostrar_empleado_mayor_sueldo(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        mayor = max(self.empleados, key=lambda emp: emp["sueldo"])
        print(f"Empleado con mayor sueldo: {mayor}")

    def __str__(self):
        return f"Linea {self.color}, tramo: {self.tramo}, cabinas: {self.nroCabinas}, empleados: {len(self.empleados)}"

    # Sobrecarga del operador >> para transferir un empleado
    def __rshift__(self, otro):
        if not self.empleados:
            print("No hay empleados para transferir.")
            return
        empleado = self.empleados.pop()  # Quita el último
        otro.empleados.append(empleado)
        print(f"Empleado transferido: {empleado['nombre']}")


# a) Instanciar 2 objetos
linea1 = LineaTeleferico("Rojo", "Estación Central, Cementerio, 16 de Julio", 20)
linea2 = LineaTeleferico("Verde", "Irpavi, Alto Obrajes, Del Libertador", 25)

# Agregar empleados a la línea 1
linea1.agregar_empleado("Pedro Rojas Luna", 35, 2500)
linea1.agregar_empleado("Lucy Sosa Rios", 43, 3250)
linea1.agregar_empleado("Ana Perez Rojas", 26, 2700)
linea1.agregar_empleado("Saul Arce Calle", 29, 2500)

# b) Eliminar a los empleados con apellido "Rojas"
linea1.eliminar_empleado_por_apellido("Rojas")

# c) Transferir un empleado de línea1 a línea2 usando operador sobrecargado >>
linea1 >> linea2

# d) Mostrar empleados con mayor edad y mayor sueldo
print("\nEmpleados en Línea 1:")
linea1.mostrar_empleado_mayor_edad()
linea1.mostrar_empleado_mayor_sueldo()

print("\nEmpleados en Línea 2:")
linea2.mostrar_empleado_mayor_edad()
linea2.mostrar_empleado_mayor_sueldo()
