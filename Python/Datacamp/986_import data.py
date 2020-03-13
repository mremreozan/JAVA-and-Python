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




import pickle
 
dictt = {'June': '69.4', 'Aug': '85', 'Airline': '8', 'Mar': '84.4'}
 
pickle.dump( dictt, open( "Datasets/data.pkl", "wb" ) )

# Open pickle file and load data
# The letters signifying 'read only' and 'binary' are 'r' and 'b', respectively.
with open('Datasets/data.pkl', 'rb') as file:
    d = pickle.load(file)

# Print data
print(d)

# Print datatype
print(type(d))
'''
{'June': '69.4', 'Aug': '85', 'Airline': '8', 'Mar': '84.4'}
<class 'dict'>
'''



# Import pandas
import pandas as pd

# Assign spreadsheet filename: file
file = "Datasets/battledeath.xlsx"

# Load spreadsheet: xls
xls = pd.ExcelFile(file)

# Print sheet names
print(xls.sheet_names)
'''
['2002', '2004']
'''
# Load a sheet into a DataFrame by name: df1
df1 = xls.parse('2004')

# Print the head of the DataFrame df1
print(df1.head())
'''
               War(country)       2004
0               Afghanistan   9.451028
1                   Albania   0.130354
2                   Algeria   3.407277
...
'''

# Load a sheet into a DataFrame by index: df2
# Load the sheet 2002 into the DataFrame df2 using its index (0).
df2 = xls.parse(0)

# Print the head of the DataFrame df2
print(df2.head())
'''
    War, age-adjusted mortality due to        2002
0                          Afghanistan   36.083990
1                              Albania    0.128908
2                              Algeria   18.314120
...
'''

# Parse the first sheet and rename the columns: df1
# To skip the first row of data, set skiprows = [0].
# The values passed to skiprows and names all need to be of type list.
df1 = xls.parse(0, skiprows=[0], names=['Country', 'AAM due to War (2002)'])

# Print the head of the DataFrame df1
print(df1.head())
'''
               Country  AAM due to War (2002)
0              Albania               0.128908
1              Algeria              18.314120
2              Andorra               0.000000
3               Angola              18.964560
4  Antigua and Barbuda               0.000000
'''

# Parse the first column of the second sheet and rename the column: df2
# Parse only the first column with the usecols parameter
df2 = xls.parse(1, usecols=[0], skiprows=[0], names=['Country'])

# Print the head of the DataFrame df2
print(df2.head())
'''
    Country
0              Albania
1              Algeria
2              Andorra
3               Angola
4  Antigua and Barbuda
'''




'''
# Import sas7bdat package
from sas7bdat import SAS7BDAT

# Save file to a DataFrame: df_sas
with SAS7BDAT('Datasets/sales.sas7bdat') as file:
    df_sas = file.to_data_frame()

# Print head of DataFrame
print(df_sas.head())

# Plot histogram of DataFrame features (pandas and pyplot already imported)
pd.DataFrame.hist(df_sas[['P']])
plt.ylabel('count')
plt.show()

     YEAR     P           S
0  1950.0  12.9  181.899994
1  1951.0  11.9  245.000000
2  1952.0  10.7  250.199997
3  1953.0  11.3  265.899994
4  1954.0  11.2  248.500000
'''



# Import pandas
import pandas as pd

# Load Stata file into a pandas DataFrame: df
df = pd.read_stata('Datasets/disarea.dta')

# Print the head of the DataFrame df
print(df.head(2))
'''
  wbcode               country  disa1  disa2  ...  disa22  disa23  disa24  disa25
0    AFG           Afghanistan   0.00   0.00  ...    0.00    0.02    0.00    0.00
1    AGO                Angola   0.32   0.02  ...    0.99    0.98    0.61    0.00
'''
# Plot histogram of one column of the DataFrame
pd.DataFrame.hist(df[['disa10']])
plt.xlabel('Extent of disease')
plt.ylabel('Number of countries')
plt.show()





# Import packages
import numpy as np
import h5py

# Assign filename: file
file = 'Datasets/LIGO_data.hdf5'

# Load file: data
data = h5py.File(file, 'r')

# Print the datatype of the loaded file
print(type(file))      #  <class 'str'>

# Print the keys of the file
# Print the names of the groups in the HDF5 file
for key in data.keys():
    print(key)
'''
meta
quality
strain
'''



# Get the HDF5 group: group
group = data['strain']

# Check out keys of group
for key in group.keys():
    print(key)             # output: Strain

# Set variable equal to time series data: strain
strain = data['strain']['Strain'].value

# Set number of time points to sample: num_samples
num_samples =10000

# Set time vector
time = np.arange(0, 1, 1/num_samples)

# Plot data
plt.plot(time, strain[:num_samples])
plt.xlabel('GPS Time (s)')
plt.ylabel('strain')
plt.show()


'''
# We have an error because type of the file have to be matlab but windos make it Mic.Access.Table.
# How to load a MATLAB file 
# Import package
import scipy.io

# Load MATLAB file: mat
mat = scipy.io.loadmat('Datasets/albeck_gene_expression.mat')

# Print the datatype type of mat
print(type(mat))      # output: <class 'dict'>
'''