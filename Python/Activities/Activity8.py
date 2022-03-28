#Given a list of numbers, return True if first and last number of a list is same
mylist=list(input("Enter list of numbers:").split(","))
firstElement = mylist[0]
lastElement = mylist[-1]
if (firstElement==lastElement):
    print(True)
else:
    print(False)    