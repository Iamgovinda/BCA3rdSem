


def fileCompare(file1,file2):
    with open(file1,'r') as f1:
        content = f1.read().split()
        length1 = 0
        for words in content:
            length1 = length1 + len(words)

    with open(file2,'r') as f2:
        content = f2.read().split()
        length2 = 0
        for words in content:
            length2 = length2 + len(words)
    
    if length1>length2:
        return "file1 > file2"
    elif length1 == length2:
        return "file1 == file2"
    else:
        return "file2 > file1"

print(fileCompare("Test.txt","Test2.txt"));