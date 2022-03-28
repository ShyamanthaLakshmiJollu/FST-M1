#Write a Python program to calculate the sum of all the elements in a list.
mylist=list(input("Please enter numbers to sum").split(","))
sum=0
for num in mylist:
    sum = sum + int(num)  
print(sum)
