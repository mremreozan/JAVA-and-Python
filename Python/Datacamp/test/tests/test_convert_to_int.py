# -*- coding: utf-8 -*-
"""
Created on Sun May 31 17:35:46 2020

@author: Utilisateur
"""

import sys
sys.path.append("..")
from functions import convert_to_int
from functions import convert_to_int2  


# Complete the unit test name by adding a prefix
def test_convert_to_int():
  # Complete the assert statement
  assert convert_to_int("2,081") == 2081
  
def test_convert_to_int2():
  # Complete the assert statement
  assert convert_to_int2("2,081") == 2081

#test_convert_to_int2()
#test_convert_to_int()