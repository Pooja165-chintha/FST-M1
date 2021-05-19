fruits={"apple":10,"Banana":3,"kiwi":20,"olivs":30}
check_fruit = input("Is this fruit avaiable ? ").lower()

if check_fruit in fruits:
    print("Yes, this is available")
else:
    print("No, this is not available")