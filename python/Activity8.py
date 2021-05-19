number_list= list(input("Enter list of numbers: ").split(","))

firstElement=number_list[0]
lastelement=number_list[-1]
if firstElement==lastelement:
    print(True)
else:
    print(False)    
