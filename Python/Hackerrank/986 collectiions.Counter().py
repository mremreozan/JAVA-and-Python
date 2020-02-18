# -*- coding: utf-8 -*-
"""
Created on Sat Jan 11 23:52:14 2020

@author: Emre Ozan
"""

from collections import Counter

if __name__ == '__main__':
    n = int(input())
    s = Counter(map(int,input().split()))
    x = int(input())
    total = []
    for i in range(x):
        a,b = map(int,input().split())
        if s[a] > 0:
            total.append(b)
            s.subtract(Counter([a]))
        else:
            pass

    print (sum(total))
    
''' 
INPUT: 
5
32 42 45 34 32
2
32 50
45 100

OUTPUT:
150