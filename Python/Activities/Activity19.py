#writing data in to excel file
from csv import excel
import pandas as pd
data = {
    "First Name" : ["Satvik","Avinash","Lahari"],
    "Last Name"  : ["shah","Kati","rath"],
    "Email": ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"]
}
dataframe=pd.DataFrame(data)
print(dataframe)
writer  = pd.ExcelWriter("sample.xlsx")
dataframe.to_excel(writer,"sheet1",index=False)
writer.save()