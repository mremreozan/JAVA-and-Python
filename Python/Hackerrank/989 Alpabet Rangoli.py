# -*- coding: utf-8 -*-
"""
Created on Thu Jan  9 23:57:14 2020

@author: Emre Ozan
"""
import string
alpha = string.ascii_lowercase

def print_rangoli(size):
    L = []
    for i in range(n):
        s = "-".join(alpha[i:n])
        L.append((s[::-1]+s[1:]).center(4*n-3, "-"))
    print('\n'.join(L[:0:-1]+L))    
    
    
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
    
'''    
input:
3

output:
----c----
--c-b-c--
c-b-a-b-c
--c-b-c--
----c----

'''