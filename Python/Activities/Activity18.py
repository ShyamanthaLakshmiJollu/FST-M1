from turtle import pd
import pandas as pd
dataframe=pd.read_csv("csvdata.csv")
#printing all values
print(dataframe)
#Print the values in the Usernames column only
print("************")
print(dataframe["Usernames"])
print("***********")
#Print the username and password of the second row
print("$$$$$$$$$$$$$")
print(dataframe["Usernames"][1], "|",dataframe["Passwords"][1])
print("$$$$$$$$$$$$$")
##Sort the Usernames column in ascending order
print(dataframe.sort_values("Usernames"))
print("_________________")
##Sort the Passwords column in descending order
print(dataframe.sort_values("Passwords",ascending=False))
print("__________________")