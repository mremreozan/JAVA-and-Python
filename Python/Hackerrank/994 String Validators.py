# -*- coding: utf-8 -*-
"""
Created on Wed Jan  8 00:23:16 2020

@author: Emre Ozan
"""

if __name__ == '__main__':
    s = input()

for test in ('isalnum', 'isalpha', 'isdigit', 'islower', 'isupper'):
       print(any(eval("c." + test + "()") for c in s))


'''
input: 
EmreOzan+*1991

Output: 
True
True
True
True
True
    
'''
