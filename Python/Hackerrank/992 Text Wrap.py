# -*- coding: utf-8 -*-
"""
Created on Wed Jan  8 23:23:38 2020

@author: Emre Ozan
"""

import textwrap

def wrap(string, max_width):
    return '\n'.join(textwrap.wrap(string, max_width))

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
    
'''
input:
emreemreemreemreemreemre
4

output:
emre
emre
emre
emre
emre
emre
'''