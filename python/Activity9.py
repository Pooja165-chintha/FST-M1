flist=[1,2,3,4,5,6]
slist=[7,8,9,10,11]
tlist=[]
print("First List",flist)
print("Second List",slist)

for n in flist:
    if n%2 > 0:
        tlist.append(n)
for n in slist:
    if n%2==0:
        tlist.append(n)
	
print("result List is:")
print(tlist)        
