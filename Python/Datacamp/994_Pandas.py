# -*- coding: utf-8 -*-
"""
Created on Mon Mar  9 13:31:02 2020

@author: Utilisateur
"""

import pandas as pd

# Build cars DataFrame
names = ['United States', 'Australia', 'Japan', 'India', 'Russia', 'Morocco', 'Egypt']
dr =  [True, False, False, False, True, True, True]
cpc = [809, 731, 588, 18, 200, 70, 45]
cars_dict = { 'country':names, 'drives_right':dr, 'cars_per_cap':cpc }
cars = pd.DataFrame(cars_dict)
print(cars)

# Definition of row_labels
row_labels = ['US', 'AUS', 'JPN', 'IN', 'RU', 'MOR', 'EG']

# Specify row labels of cars
cars.index=row_labels

# Print cars again
print(cars)



# Import the cars.csv data: cars
cars = pd.read_csv('Datasets/cars.csv')

# Print out cars
print(cars)

# Fix import by including index_col
cars = pd.read_csv('Datasets/cars.csv', index_col=0)

# Print out cars
print(cars)
# Iterate over rows of cars
for lab, row in cars.iterrows() :
    print(lab)
    print(row)
    
# Print out country column as Pandas Series
print(cars['country'])

# Print out country column as Pandas DataFrame
print(cars[['country']])

# Print out DataFrame with country and drives_right columns
print(cars[['country', 'drives_right']])

# Print out first 3 observations
print(cars[0:3])

# Print out fourth, fifth and sixth observation
print(cars[3:6])

# Print out observation for Japan
print(cars.loc['JAP'])

# Print out observations for Australia and Egypt
print(cars.iloc[[1, 6]])

# Print out drives_right value of Morocco
print(cars.loc['MOR', 'drives_right'])

# Print sub-DataFrame
print(cars.loc[['RU', 'MOR'], ['country', 'drives_right']])


# Print out drives_right column as Series
print(cars.loc[:, 'drives_right'])

# Print out drives_right column as DataFrame
print(cars.loc[:, ['drives_right']])

# Print out cars_per_cap and drives_right as DataFrame
print(cars.iloc[:, [0,2]])


# Extract drives_right column as Series: dr
dr= cars["drives_right"]
print(dr)
# Use dr to subset cars: sel
sel = cars[dr]  # only true in the dr is equal to sel.  

# Print sel
print(sel) 

# Convert code to a one-liner
sel = cars[cars['drives_right']]

# Print sel
print(sel)

# Create car_maniac: observations that have a cars_per_cap over 500
cpc = cars['cars_per_cap']
many_cars = cpc > 500
car_maniac = cars[many_cars]

# Print car_maniac
print(car_maniac)


# Import numpy, you'll need this
import numpy as np
# Create medium: observations with cars_per_cap between 100 and 500
cpc = cars['cars_per_cap']
between = np.logical_and(cpc>100, cpc<500)
medium = cars[between]

# Print medium
print(medium)

# Code for loop that adds COUNTRY column
for lab, row in cars.iterrows() :
    cars.loc[lab, "COUNTRY"] = row["country"].upper()
    
# Print cars
print(cars)



# Define count_entries()
def count_entries(df, col_name):
    """Return a dictionary with counts of 
    occurrences as value for each key."""

    # Initialize an empty dictionary: langs_count
    langs_count = {}
    
    # Extract column from DataFrame: col
    col = df[col_name]
    
    # Iterate over lang column in DataFrame
    for entry in col:

        # If the language is in langs_count, add 1
        if entry in langs_count.keys():
            langs_count[entry] = langs_count[entry] + 1 
        # Else add the language to langs_count, set the value to 1
        else:
            langs_count[entry] = 1

    # Return the langs_count dictionary
    return langs_count

# Call count_entries(): result
# Import Twitter data as DataFrame: df
tweets_df = pd.read_csv('Datasets/tweets.csv')
result = count_entries(tweets_df, "lang")

# Print the result
print(result)