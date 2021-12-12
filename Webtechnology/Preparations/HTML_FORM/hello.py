class calculator:

    def __init__(self,a,b) -> None:
        self.num1=a
        self.num2=b

    def add(self):
        return self.num1+self.num2
    
    def sub(self):
        if self.num1>self.num2: return self.num1-self.num2
        return self.num2-self.num1


calc=calculator(12,34)
print(calc.add())
print(calc.sub())
