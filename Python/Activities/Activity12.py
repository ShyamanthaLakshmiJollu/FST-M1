def sum(n):
    if n<=1:
        return n
    else:
        return n+sum(n-1) 
result = sum(10)
print(result)           