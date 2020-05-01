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



# Remember, you have to use items() to a list before slicing.
europe_list = list(europe.items())
print(europe_list[:2])



# A defaultdict allows you to define what each uninitialized key will contain. When establishing a defaultdict, you pass it the type you want it to be, such as a list, tuple, set, int, string, dictionary or any other valid type object.

from collections import defaultdict

def group_by_owners(files):
    file = defaultdict(list)
    for key, value in files.items():
        file[value].append(key)
    return dict(file)

    
files = {
        'Input.txt': 'Randy',
        'Code.py': 'Stan',
        'Output.txt': 'Randy'
        }   
print(group_by_owners(files))

# OUTPUT:
# {'Randy': ['Input.txt', 'Output.txt'], 'Stan': ['Code.py']}




entries = [('01/01/2015', 587), ('01/02/2015', 1386), ('01/03/2015', 785), ('01/04/2015', 625), ('01/05/2015', 1752), ('01/01/2015', 1777), ('01/02/2015', 1269), ('01/03/2015', 1435), ('01/02/2015', 1631), ('01/04/2015', 771)]

# Import OrderedDict from collections
from collections import OrderedDict

# Create an OrderedDict called: ridership_date
ridership_date = OrderedDict()

# Iterate over the entries
for date, riders in entries:
    # If a key does not exist in ridership_date, set it to 0
    if  date not in ridership_date:
        ridership_date[date] = 0
        
    # Add riders to the date key in ridership_date
    ridership_date[date] += riders
    
# Print the first 31 records
print(list(ridership_date.items())[:10])


# Print the first key in ridership_date
print(list(ridership_date.keys())[0])

# Pop the first item from ridership_date and print it
print(ridership_date.popitem(last=False))

# Print the last key in ridership_date
print(list(ridership_date.keys())[-1])

# Pop the last item from ridership_date and print it
print(ridership_date.popitem())





entries = [('01/01/2015', 'Austin-Forest Park', '587'), ('01/02/2015', 'Austin-Forest Park', '1386'), ('01/03/2015', 'Austin-Forest Park', '785'), ('01/04/2015', 'Austin-Forest Park', '625'), ('01/05/2015', 'Austin-Forest Park', '1752'), ('01/06/2015', 'Austin-Forest Park', '1777'), ('01/07/2015', 'Austin-Forest Park', '1269'), ('01/08/2015', 'Austin-Forest Park', '1435'), ('01/09/2015', 'Austin-Forest Park', '1631'), ('01/10/2015', 'Austin-Forest Park', '771'), ('01/11/2015', 'Austin-Forest Park', '588'), ('01/12/2015', 'Austin-Forest Park', '2065'), ('01/13/2015', 'Austin-Forest Park', '2108'), ('01/14/2015', 'Austin-Forest Park', '2012'), ('01/15/2015', 'Austin-Forest Park', '2069'), ('01/16/2015', 'Austin-Forest Park', '2003'), ('01/17/2015', 'Austin-Forest Park', '953'), ('01/18/2015', 'Austin-Forest Park', '706'), ('01/19/2015', 'Austin-Forest Park', '1216'), ('01/20/2015', 'Austin-Forest Park', '2115')]

# Import namedtuple from collections
from collections import namedtuple

# Create the namedtuple: DateDetails
DateDetails = namedtuple('DateDetails', ['date', 'stop', 'riders'])

# Create the empty list: labeled_entries
labeled_entries = []

# Iterate over the entries list
for date, stop, riders in entries:
    # Append a new DateDetails namedtuple instance for each entry to labeled_entries
    labeled_entries.append(DateDetails(date, stop, riders))
    
# Print the first 5 items in labeled_entries
print(labeled_entries[:5])

# OUTPUT:
'''
    [DateDetails(date='01/01/2015', stop='Austin-Forest Park', riders='587'), DateDetails(date='01/02/2015', stop='Austin-Forest Park', riders='1386'), DateDetails(date='01/03/2015', stop='Austin-Forest Park', riders='785'), DateDetails(date='01/04/2015', stop='Austin-Forest Park', riders='625'), DateDetails(date='01/05/2015', stop='Austin-Forest Park', riders='1752')]
'''

# Iterate over the first twenty items in labeled_entries
for item in labeled_entries[0:20]:
    # Print each item's stop
    print(item.stop)

    # Print each item's date
    print(item.date)

    # Print each item's riders
    print(item.riders)
    
# OUTPUT:
'''
    Austin-Forest Park
    01/01/2015
    587
    Austin-Forest Park
    01/02/2015
    1386
    Austin-Forest Park
    01/03/2015
    785
    Austin-Forest Park
...........
'''