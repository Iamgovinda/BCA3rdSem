stack=[]

def push():
    data=input("Enter the data: ")
    stack.append(data)

def pop():
    popped_item=stack.pop()
    print("popped item is: ",popped_item)

def display():
    print("\n\n\n###############\n")
    print(stack)

def selectchoice():
    choice=int(input("*******Enter choices*******\n0 for exit.\n1 for push operation.\n2 for pop operation.\n3 for display operation.\nEnter your choice:"))
    if choice!=0:
        if choice==1:
            push()
            selectchoice()
        elif(choice==2):
            pop()
            selectchoice()
        elif(choice==3):
            display()
            selectchoice()
        else:
            print("enter the valid choices only.")


selectchoice()