upto = int(input("eneter number for fibonacci series"))

def fibonacci(num):
    if num <=1:
        return num
    else:
        return(fibonacci(num-1) + fibonacci(num-2))

if upto<=0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(upto):
        print(fibonacci(i))   

