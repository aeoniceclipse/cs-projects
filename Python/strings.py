who = "world"
what = 1
num = 1.00
wrds = "hello %s %d %.1f %f" % (who, what, num, num)
split = wrds.split(" ")

print(wrds)
print(len(wrds))
print(wrds.index("1"))
print(wrds.count("1"))
print(wrds[6:26])
print(wrds[:5])
print(wrds[::2])
print(wrds[::-1])
print(wrds.upper())
print(wrds.lower())
print(wrds.startswith("hello"))
print(wrds.endswith("world"))
print(split[0])