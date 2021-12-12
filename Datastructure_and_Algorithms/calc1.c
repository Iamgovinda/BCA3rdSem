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
calc1.mul()
calc1.div()
calc1.add()
calc1.sub()