"""Create a Python dictionary that contains a bunch of fruits and their prices.
Write a program that checks if a certain fruit is available or not."""
fruits = { 
    "apple" : 10,
    "banana" : 20,
    "Mango"  : 50,
    "Chicco" : 40
}
search = input("please enter which fruit availability you are looking for: ")
if (search in fruits):
    print(search + " is available" )

else:
    print(search +" is not available")

