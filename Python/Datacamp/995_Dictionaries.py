# -*- coding: utf-8 -*-
"""
Created on Mon Mar  9 12:54:22 2020

@author: Utilisateur
"""

# Definition of countries and capital
countries = ['spain', 'france', 'germany', 'norway']
capitals = ['madrid', 'paris', 'berlin', 'oslo']

# From string in countries and capitals, create dictionary europe
europe = { 'spain':'madrid', 'france':'paris', "germany":'berlin', 'norway':'oslo' }

# Print europe
print(europe)

# Iterate over europe
for key, value in europe.items():
    print("the capital of "+ key + " is " + value)
    
# Print out the keys in europe
print(europe.keys())

# Print out value that belongs to key 'norway'
print(europe["norway"])

# Add italy to europe
europe['italy'] = 'rome'

# Print out italy in europe - True or False
print('italy' in europe)

# Remove norway
del(europe['norway'])



# Dictionary of dictionaries
europe = { 'spain': { 'capital':'madrid', 'population':46.77 },
           'france': { 'capital':'paris', 'population':66.03 },
           'germany': { 'capital':'berlin', 'population':80.62 },
           'norway': { 'capital':'oslo', 'population':5.084 } }


# Print out the capital of France
print(europe['france']['capital'])

# Create sub-dictionary data
data =  {'capital':'rome', 'population':59.83 }

# Add data to europe under key 'italy'
europe['italy']=data

# Print europe
print(europe)

