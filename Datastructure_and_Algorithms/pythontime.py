import time

def add(a,b):
    return int.__add__(a,b)

def add2(a,b):
    return a+b
if "__name__" == "__main__":
    init = time.time()

    for i in range(1000):
        add(1,1)
    
    print(time.time()-init)

    init=time.time()

    for i in range(1000):
        add(1,1)

    print(time.time()-init)
