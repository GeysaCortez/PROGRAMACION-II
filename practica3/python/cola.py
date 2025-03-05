class Cola:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.n = n

    def insert(self, e):
        if self.isFull():
            print("Cola llena")
        else:
            self.fin += 1
            self.arreglo[self.fin] = e

    def remove(self):
        if self.isEmpty():
            print("Cola vacía")
            return -1
        else:
            e = self.arreglo[self.inicio]
            self.inicio += 1
            return e

    def peek(self):
        if self.isEmpty():
            print("Cola vacía")
            return -1
        return self.arreglo[self.inicio]

    def size(self):
        return self.fin - self.inicio + 1

    def isEmpty(self):
        return self.inicio > self.fin

    def isFull(self):
        return self.fin == self.n - 1

if __name__ == "__main__":
    cola = Cola(3)
    cola.insert(10)
    cola.insert(20)
    cola.insert(30)

    print(cola.peek())
    print("remove() =", cola.remove())
    print("remove() =", cola.remove())
    print("remove() =", cola.remove())

   