class this:
	x = "this"

	def that(self):
		print("this and that too")

wrd1 = this()
wrd2 = this()

wrd2.x = "that"

print("%s and %s" % (wrd1.x, wrd2.x))
wrd1.that()
wrd2.that()