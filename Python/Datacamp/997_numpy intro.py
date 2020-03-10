# -*- coding: utf-8 -*-
"""
Created on Sun Mar  8 22:05:04 2020

@author: Utilisateur
"""

# Create list baseball
baseball = [180, 215, 210, 210, 188, 176, 209, 200]

# Import the numpy package as np
import numpy as np

# Create a numpy array from baseball: np_baseball
np_baseball = np.array(baseball)

# Print out type of np_baseball
print(type(np_baseball))



# height and weight are available as regular lists
height_in = [80, 70, 85]
weight_lb = [200, 180, 185]
# Import numpy
import numpy as np

# Create array from height_in with metric units: np_height_m
np_height_m = np.array(height_in) * 0.0254

# Create array from weight_lb with metric units: np_weight_kg
np_weight_kg = np.array(weight_lb) * 0.453592

# Calculate the BMI: bmi
bmi=np_weight_kg / np_height_m**2

# Print out bmi
print(bmi)


# Calculate the BMI: bmi
np_height_m = np.array(height_in) * 0.0254
np_weight_kg = np.array(weight_lb) * 0.453592
bmi = np_weight_kg / np_height_m ** 2

# Create the light array
light = bmi < 21

# Print out light
print(light)

# Print out BMIs of all baseball players whose BMI is below 21
print(bmi[light])

# Create baseball, a list of lists
baseball = [[180, 78.4],
            [215, 102.7],
            [210, 98.5],
            [188, 75.2]]

# Create a 2D numpy array from baseball: np_baseball
np_baseball=np.array(baseball)

# Print out the type of np_baseball
print(type(np_baseball))

# Print out the shape of np_baseball
print(np_baseball.shape)

# Print out the 3th row of np_baseball
print(np_baseball[2])

# For loop over np_height
for x in np_baseball:
    print(str(x[0])+ " height "+ str(x[1]) + " weight")

# For loop over np_baseball
for x in np.nditer(np_baseball):
    print(x)

# Select the entire second column of np_baseball: np_weight_lb
np_weight_lb = np_baseball[:,1] 

# Print out height of 2th player
print(np_baseball[1][0])


# Print mean height (first column)
avg = np.mean(np_baseball[:,0])
print("Average: " + str(avg))

# Print median height. 
med = np.median(np_baseball[:,0])
print("Median: " + str(med))

# Print out the standard deviation on height.
stddev = np.std(np_baseball[:,0])
print("Standard Deviation: " + str(stddev))

# Print out correlation between first and second column. 
corr = np.corrcoef(np_baseball[:,0], np_baseball[:,1])
print("Correlation: " + str(corr))



# heights and positions are available as lists
positions = ['GK', 'M', 'A', 'D', 'GK', 'M', 'A', 'A', 'D']
heights = [191, 184, 185, 180, 184, 185, 180, 185, 180]
# Convert positions and heights to numpy arrays: np_positions, np_heights
np_positions = np.array(positions)
np_heights = np.array(heights)

# Heights of the goalkeepers: gk_heights
gk_heights = np_heights[np_positions == 'GK']

# Heights of the other players: other_heights
other_heights = np_heights[np_positions != 'GK']

# Print out the median height of goalkeepers. Replace 'None'
gk_heights_med = np.median(gk_heights)
print("Median height of goalkeepers: " + str(gk_heights_med))

# Print out the median height of other players. Replace 'None'
other_heights_med = np.median(other_heights)
print("Median height of other players: " + str(other_heights_med))