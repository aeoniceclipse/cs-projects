import numpy as np

height = [0, 1, 2, 3, 4]
weight = [5, 6, 7, 8, 9]

nph = np.array(height)
npw = np.array(weight)

print(nph)
print(type(npw))

x = 0

while x < 5:
	div = nph[x] / npw[x]
	print(div)
	x += 1