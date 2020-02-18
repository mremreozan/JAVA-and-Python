# -*- coding: utf-8 -*-
"""
Created on Tue Jan  7 00:39:12 2020

@author: Emre Ozan
"""

def split_and_join(line):
    return("-".join(line.split()))

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
    
    
'''
Input (stdin)
this is a string

Your Output (stdout)
this-is-a-string


'''

