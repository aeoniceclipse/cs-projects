items = {
	"i1": "item 1",
	"i2": "item 2",
	"i4": "item 4"
}

item = items["i1"]
del items["i4"]
items["i3"] = "item 3"

print(items)
print(item)
print(items["i2"])