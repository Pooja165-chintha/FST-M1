from typing import List


Listnum = [5,4,3,2,1]

def calSum(mylist):
    sum=0
    for num in mylist:
        sum+=num

    return sum

sum= calSum(Listnum)
print(sum)
