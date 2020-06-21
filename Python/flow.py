num1 = 1
num2 = 2

wrd1 = "hello"
wrd2 = "world"

lst = [1, 2, 3, 4, 5]

print(num1 == 1)
print(num1 != 1)
print(num1 < 2)
print(num2 > 2)
print(num1 == num2)

print(wrd1 == "hello")
print(wrd1 != "hello")
print(wrd1 == wrd2)

if wrd1 == wrd2:
	print("ok")

if wrd1 != wrd2:
	print(wrd1 + wrd2)

if num1 != num2 and num1 == 1:
	print("yay")

if num1 == num2 or num1 == 1:
	print("good")

if num1 in lst:
	print("is")

for x in lst:
	print(x)

for x in range(0, 5, 2):
	print(x)

count = 0
while count < 5:
	print(lst[count:])
	count += 1

for x in range(10):
	if x % 2 == 0:
		continue
	print(x)