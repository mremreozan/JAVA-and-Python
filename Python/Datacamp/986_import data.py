# -*- coding: utf-8 -*-
"""
Created on Wed Mar 11 21:49:23 2020

@author: Utilisateur
"""

# Open a file: file (read-only)
file = open("Datasets/moby_dick.txt", "r")

# Print it
print(file.read())

# Check whether file is closed
print(file.closed)

# Close file
file.close()

# Check whether file is closed
print(file.closed)
'''
CHAPTER 1. Loomings.

Call me Ishmael. Some years.............. 
.
.
False
True
'''



# Read & print the first 3 lines
with open('Datasets/moby_dick.txt') as file:
    print(file.readline())
    print(file.readline())
    print(file.readline())
'''
CHAPTER 1. Loomings.

Call me Ishmael. Some years ago--never mind how long precisely--having
''' 
    


# Import package
import numpy as np
import matplotlib.pyplot as plt

# Assign filename to variable: file
file = 'Datasets/digits.csv'

# Load file as array: digits
digits = np.loadtxt(file, delimiter=',')

# Print datatype of digits
print(type(digits))             # <class 'numpy.ndarray'>

# Select and reshape a row
im = digits[21, 1:]
im_sq = np.reshape(im, (28, 28))

# Plot reshaped data (matplotlib.pyplot already loaded as plt)
plt.imshow(im_sq, cmap='Greys', interpolation='nearest')
plt.show()




# Assign filename: file
file = 'Datasets/seaslug.txt'

# Import file: data
data = np.loadtxt(file, delimiter='\t', dtype=str)

# Print the first element of data
print(data[0])                   # ['Time' 'Percent']

# Import data as floats and skip the first row: data_float
# if we don't skip the header, there is an error because header is not float.
data_float = np.loadtxt(file, delimiter='\t', dtype=float, skiprows=1)

# Print the 10th element of data_float
print(data_float[0])            # [9.9e+01 6.7e-02]

# Plot a scatterplot of the data
plt.scatter(data_float[:, 0], data_float[:, 1])
plt.xlabel('time (min.)')
plt.ylabel('percentage of larvae')
plt.show()


# to import data containing mixed datatypes.  - genfromtxt()
data = np.genfromtxt('Datasets/titanic.csv', delimiter=',', names=True, dtype=None)
print(data['Survived'])
'''
[0 1 1 1 0 0 0 0 1 1 1 1 0 0 0 1 0 1 0 1 0 1 1 1 0 1 0 0 1 0 0 1 1 0 0 0 1...]
'''



# Import file using np.recfromcsv: d
# np.recfromcsv() that behaves similarly to np.genfromtxt(), except that its default dtype is None.
d = np.recfromcsv('Datasets/titanic.csv', delimiter=',', names=True)

# Print out first three entries of d
print(d[:3])
'''
    [(1, 0, 3, b'male', 22., 1, 0, b'A/5 21171',  7.25  , b'', b'S')
     (2, 1, 1, b'female', 38., 1, 0, b'PC 17599', 71.2833, b'C85', b'C')
     (3, 1, 3, b'female', 26., 0, 0, b'STON/O2. 3101282',  7.925 , b'', b'S')]
'''


import pandas as pd
# Assign the filename: file
file = 'Datasets/digits.csv'

# Read the first 5 rows of the file into a DataFrame: data
data = pd.read_csv(file, nrows=5, header=None)

# Build a numpy array from the DataFrame: data_array
data_array = data.values

# Print the datatype of data_array to the shell
print(type(data_array))
'''
<class 'numpy.ndarray'>
'''



# Assign filename: file
file = 'Datasets/titanic.csv'

# Import file: data
# na_values takes a list of strings to recognize as NA/NaN, in this case the string 'Nothing'.
# suppose to contain comments after the character '#'
data = pd.read_csv(file, sep=',', comment="#", na_values=["Nothing"])

# Print the head of the DataFrame
print(data.head())

# Plot 'Age' variable in a histogram
pd.DataFrame.hist(data[['Age']])
plt.xlabel('Age (years)')
plt.ylabel('count')
plt.show()



