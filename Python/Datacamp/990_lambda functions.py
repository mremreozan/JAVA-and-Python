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