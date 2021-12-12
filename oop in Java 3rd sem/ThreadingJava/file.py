def compare(file1,file2):
    with open(file1,'r') as f:
        linelist1 = f.read().splitlines()
        wordlist1 = f.read()

    with open(file2,'r') as f:
        linelist2 = f.read().splitlines()
        wordlist2 = f.read()
    
    similarlines = [line for line in linelist1 if line in linelist2]
    differentlines = [line for line in linelist1 if line not in linelist2] + [line for line in linelist2 if line not in linelist1]

    report = {"Similar lines":similarlines,"Different lines":differentlines, "lines in file1":len(linelist1),"lines in file2":len(linelist2)}

    return report

report = compare('file1.txt','file2.txt')

for key,value in report.items():
    print("{}".format(key) , ":" , value)




# # Importing difflib
import difflib

with open('file1.txt') as file_1:
	file_1_text = file_1.readlines()

with open('file2.txt') as file_2:
	file_2_text = file_2.readlines()

# Find and print the diff:
for line in difflib.unified_diff(
		file_1_text, file_2_text, fromfile='file1.txt',
		tofile='file2.txt', lineterm=''):
	print(line)


