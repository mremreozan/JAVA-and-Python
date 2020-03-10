# -*- coding: utf-8 -*-
"""
Created on Tue Mar 10 13:46:31 2020

@author: Utilisateur
"""

# Import numpy and set seed
import numpy as np
np.random.seed(123)
#With the seed reset (every time), the same set of numbers will appear every time.
#If the random seed is not reset, different numbers appear with every invocation:
#if this code is worked again, we have same result.

a = np.random.rand(4)
print(a)
b = np.random.rand()
print(b)

# Use randint() to simulate a dice
print(np.random.randint(1,7))

# Use randint() again
print(np.random.randint(1,7))