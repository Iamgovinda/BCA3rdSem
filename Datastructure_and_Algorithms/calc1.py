class calculation:

    def __init__(self,a,b):
        self.a=a
        self.b=b

    def mul(self):
        return self.a*self.b

    def div(self):
        return self.a/self.b

    def add(self):
        return self.a+self.b

    def sub(self):
        return self.a-self.b

calc1=calculation(10,5)
a=calc1.mul()
b=calc1.div()
c=calc1.add()
d=calc1.sub()

print(a,b,c,d)

