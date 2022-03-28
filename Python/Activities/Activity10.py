""" Given a tuple of numbers, iterate through it and print
      only those numbers which are divisible by 5 """
myTuple=tuple(input("enter numbers to store in a tuple:  ").split(","))
myTuple.append(90)
print("Numbers divisible by 5 are: ")
for number in myTuple:
    n = int(number)%5
    if (n%5==0):
        print(number)



     


