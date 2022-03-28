def sum(list):
    s=0
    for number in list:
        s=s+number
    return s
numbers = [10,20,30,40,50]
result = sum(numbers)
print("The sum of all elements is:" +str(result))       
    