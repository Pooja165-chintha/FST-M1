import pandas
from pandas.core.frame import DataFrame

data={ 
    "Usernames": ["admin", "Charles", "Bob"],
    "Passwords": ["password", "Charl13", "AllMight"]
    }
dataframe= pandas.DataFrame(data)    
print(dataframe)
 
"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)
