'''
Written by David Coutts
4.2.2019
Write a method to replace all spaces in a string with '%20:
You may assume that the string has sufficient space at the end to hold the additional characters,
and that you are given the "true" length of the string.
(Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE:
Input: "Mr John Smith " J 13 Output: "Mr%20J ohn%20Smith" Hints: #53, #7 78


This is the easiest "MVP" solution I could come up with in Python - it creates a new string in replaceSpaces to return, 
but I'd like to find a way of doing this in place if possible. 

'''


def replaceSpaces(string):
	result = ""
	for i in string:
		if i == " ":
			result += "%20"
		else:
			result += i
	return result

def main():
	initialResult = " Testing testing tested "
	print("Initial value: " + initialResult)
	updatedResult = replaceSpaces(initialResult)
	print("Updated result: " + updatedResult)

main()
