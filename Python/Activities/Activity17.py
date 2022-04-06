import pandas as pd
data = {
    "Usernames":["admin","Charles","Deku"],
    "Passwords":["password","charl13","AllMight"]
}
dataframe = pd.DataFrame(data)
dataframe.to_csv("csvdata.csv")