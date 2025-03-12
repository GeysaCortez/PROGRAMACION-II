import math

class FiguraGeometrica:
    def __init__(self):
        pass
class Circulo(FiguraGeometrica):
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2

    def __str__(self):
        return "(radio = {})".format(self.radio)

class Rectangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

    def __str__(self):
        return "(base = {}, altura = {})".format(self.base, self.altura)

class Triangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2

    def __str__(self):
        return "(base = {}, altura = {})".format(self.base, self.altura)

class Pentagono(FiguraGeometrica):
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        return (5 * self.lado ** 2) / (4 * math.tan(math.pi / 5))

    def __str__(self):
        return "(lado = {})".format(self.lado)

class Trapecio(FiguraGeometrica):
    def __init__(self, baseA, baseB, altura):
        self.baseA = baseA
        self.baseB = baseB
        self.altura = altura

    def area(self):
        return ((self.baseA + self.baseB) * self.altura) / 2

    def __str__(self):
        return "( baseA = {}, baseB = {}, altura = {})".format(self.baseA, self.baseB, self.altura)


# Crear instancias de figuras geométricas
p1 = Circulo(1)
p2 = Rectangulo(2, 3)
p3 = Triangulo(12, 5)
p4 = Pentagono(6)
p5 = Trapecio(4, 8, 10)

# Imprimir
print("Circulo: ",p1.area())
print("Rectangulo", p2.area())
print("Triangulo", p3.area())
print("Pentagono", p4.area())
print("Trapecio", p5.area())


