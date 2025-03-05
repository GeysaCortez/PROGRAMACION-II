class Pila:
    def __init__(self, n):
        self.arreglo = [None] * n  # Lista con tamaño fijo
        self.top = -1
        self.n = n

    def push(self, e):
        if self.is_full():
            print("Pila llena")
        else:
            self.top += 1
            self.arreglo[self.top] = e

    def pop(self):
        if self.is_empty():
            print("Pila vacía")
            return -1
        else:
            e = self.arreglo[self.top]
            self.top -= 1
            return e

    def peek(self):
        if self.is_empty():
            print("Pila vacía")
            return -1
        return self.arreglo[self.top]

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == self.n - 1


# Prueba de la implementación
if __name__ == "__main__":
    pila = Pila(3)
    pila.push(10)
    pila.push(20)
    pila.push(30)

    print(pila.peek())
    print("pop() =", pila.pop())
    print("pop() =", pila.pop())
    print("pop() =", pila.pop())
