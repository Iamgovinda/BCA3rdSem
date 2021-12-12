#python code to find the longest word from a text file.

def longestword(filename):
    with open(filename, 'r') as f:
        words = f.read().split()
    wordlist = [word for word in words  if len(word) == len(max(words,key=len))]
    return wordlist

words = longestword("Test.txt")
for word in words:
    print(word)




# python code to find the longest word from a text file.

try:
    f = open("Test.txt",'r')
    wordlist = f.read().split()
    words = list(filter(lambda word: len(word)==len(max(wordlist,key=len)),wordlist))

    for word in words:
        print(word)
except FileNotFoundError:
    print("File not Found.")
finally:
    f.close()



