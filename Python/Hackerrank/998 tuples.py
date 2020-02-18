# -*- coding: utf-8 -*-
"""
Created on Sun Jan  5 00:31:08 2020

@author: Utilisateur
"""

if __name__ == '__main__':
    n = input()
    str = input()

    lst = str.split()
    lst = map(int, lst)

    t = tuple(lst)
    print(hash(t))
    
    
'''
Input (stdin)
2
1 2

Expected Output
3713081631934410656
'''