#Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.
listone=list(input("Enter numbers in to list1").split(","))
listtwo=list(input("Enter numbers in to list2").split(","))
listthree=[]

for i in listone:
    if ((int(i)%2)!=0):
        listthree.append(i) 
for j in listtwo:
    if ((int(j)%2)==0): 
        listthree.append(j)      
print(listthree)            