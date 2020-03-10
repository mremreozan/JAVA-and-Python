# -*- coding: utf-8 -*-
"""
Created on Sun Mar  8 20:46:27 2020

@author: Utilisateur
"""

# Create list areas
areas = [11.25, 18.0, 20.0, 10.75, 9.50]

# Create areas_copy
areas_copy = areas
areas_copy2 = list(areas)

# Change areas_copy
areas_copy[0] = "emre"     # areas and areas_copy point to same list. 
areas_copy2[0] = "yusuf"   # this change nothing in the areas because it is a explicit copy.


# Print areas
print(areas)


nums = [2, 4, 6]
# Unpack nums into num1, num2, and num3
num1, num2, num3 = nums

# Construct even_nums
even_nums = (1, num2, num3)
print(even_nums)