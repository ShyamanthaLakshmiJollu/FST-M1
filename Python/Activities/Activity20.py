import pandas as pd
dataframe = pd.read_excel("sample.xlsx")
print("Printing entire data: ")
print(dataframe)
print("Number of Rows and Columns: ")
print(dataframe.shape)
print("Data in emails column:",dataframe["Email"])
#Sort the data based on FirstName in ascending order and print the data
sort=dataframe.sort_values("First Name")
print(sort)