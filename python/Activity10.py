t = input("enter numbers ").split(",")
a = tuple(int(x) for x in t)

print(a)

for i in a:
   if (i % 5 == 0):
        print(i)
