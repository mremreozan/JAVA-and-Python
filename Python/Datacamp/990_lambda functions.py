# -*- coding: utf-8 -*-
"""
Created on Tue Mar 10 19:48:10 2020

@author: Utilisateur
"""
# Define echo_word as a lambda function: echo_word
echo_word = (lambda a, b: a * b)

# Call echo_word: result
result = echo_word("hey", 5)

# Print result
print(result)



# Create a list of strings: spells
spells = ['protego', 'accio', 'expecto patronum', 'legilimens']

# Use map() to apply a lambda function over spells: shout_spells
shout_spells = map(lambda item: item + '!!!', spells)

# Convert shout_spells to a list: shout_spells_list
shout_spells_list = list(shout_spells)

# Print the result
print(shout_spells_list)



# Create a list of strings: fellowship
fellowship = ['frodo', 'samwise', 'merry', 'pippin', 'aragorn', 'boromir', 'legolas', 'gimli', 'gandalf']

# Use filter() to apply a lambda function over fellowship: result
result = filter(lambda member : len(member) > 6 , fellowship)

# Convert result to a list: result_list
result_list = list(result)

# Print result_list
print(result_list)



# Import reduce from functools
from functools import reduce

# Create a list of strings: stark
stark = ['robb', 'sansa', 'arya', 'brandon', 'rickon']

# Use reduce() to apply a lambda function over stark: result
result = reduce(lambda item1, item2: item1+item2, stark)

# Print the result
print(result)

import pandas as pd 
tweets_df = pd.read_csv("Datasets/tweets.csv")
# Select retweets from the Twitter DataFrame: result
result = filter(lambda x : x[0:2] == "RT", tweets_df["text"])

# Create list from filter object result: res_list
res_list = list(result)

# Print all retweets in res_list
for tweet in res_list:
    print(tweet)
    
    
# filter function
# Exclude all the numbers from nums divisible by 3 or 5
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
fnums = filter(lambda x: x % 3 != 0 and x % 5 != 0, nums)
print(list(fnums)) 
'''
[1, 2, 4, 7, 8]
'''


# Take x and return x squared if x > 0 and 0, otherwise
squared_no_negatives = lambda x : x**2 if x>0 else 0
print(squared_no_negatives(2.0))
print(squared_no_negatives(-1))
'''
4
0
'''


# Returns a squared root of a sum of squared numbers
lambda3 = lambda *nums : sum([num**2 for num in nums])**(1/2)
print(lambda3(3, 4, 5))
'''
7.0710678118654755
'''


# Using a lambda expression as an argument in the sort method
words = ['advantage', 'job', 'shape', 'item', 'atmosphere', 'height', 'creature','plane', 'unit']
# Sort words by the string length
words.sort(key=lambda s: len(s))
print(words)
'''
['job', 'item', 'unit', 'shape', 'plane', 'height', 'creature', 'advantage', 'atmosphere']
'''



# The map() function
def my_zip(*args):
    
    # Retrieve Iterable lengths and find the minimal length
    lengths = list(map(len, args))
    min_length = min(lengths)

    tuple_list = []
    for i in range(0, min_length):
        # Map the elements in args with the same index i
        mapping = map(lambda x: x[i], args)
        # Convert the mapping and append it to tuple_list
        tuple_list.append(tuple(mapping))
        
    return tuple_list

result = my_zip([1, 2, 3], ['a', 'b', 'c', 'd'], 'DataCamp')
print(result)
'''
[(1, 'a', 'D'), (2, 'b', 'a'), (3, 'c', 't')]
'''



# reduce
# Reverse a string using reduce()
string = 'DataCamp'
inv_string = reduce(lambda x, y: y + x, string)
print('Inverted string = ' + inv_string) 
'''
Inverted string = pmaCataD
'''



# Find common items shared among all the sets in sets
sets = [{1, 4, 8, 9}, {2, 4, 6, 9, 10, 8}, {9, 0, 1, 2, 4}]
common_items = reduce(lambda x, y: x.intersection(y), sets)
print('common items = ' + str(common_items))
'''
common items = {9, 4}
'''


# Convert a number sequence into a single number
nums = [5, 6, 0, 1]
num = reduce(lambda x, y: str(x)+str(y), nums)
print(str(nums) + ' is converted to ' + str(num))
'''
[5, 6, 0, 1] is converted to 5601
'''