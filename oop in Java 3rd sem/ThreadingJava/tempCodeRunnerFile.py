def wordcount(file):
    with open(file,'r') as f:
        lines = f.read().splitlines()
        return lines

print(wordcount('file.txt'))