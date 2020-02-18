# -*- coding: utf-8 -*-
"""
Created on Thu Jan  9 23:44:54 2020

@author: Emre Ozan
"""

def print_formatted(number):
    width = len("{0:b}".format(n))
    for i in range(1,n+1):
        print ("{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=width))
        
if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
    
'''
input:
10

ouput:
   1    1    1    1
   2    2    2   10
   3    3    3   11
   4    4    4  100
   5    5    5  101
   6    6    6  110
   7    7    7  111
   8   10    8 1000
   9   11    9 1001
  10   12    A 1010
  
'''
    