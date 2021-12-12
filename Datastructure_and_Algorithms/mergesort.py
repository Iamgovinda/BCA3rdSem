
list1 = [3,4,1,5,2,6,0,9]
def mergesort(array):
    if len(array)>1:
        
        mid = len(array)//2
        l = array[:mid]
        h = array[mid:]
        p = mergesort(l)
        q = mergesort(h)
        merge(p,q)

def merge(p,q):
    print(p)
    print(q)
                

mergesort(list1)

