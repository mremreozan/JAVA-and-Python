# -*- coding: utf-8 -*-
"""
Created on Sat Jan 11 00:16:01 2020

@author: Emre Ozan
"""

from itertools import product

if __name__ == '__main__':
    n = [int(i) for i in input().split()]   # first style for list
    m = list(map(int,input().split()))      # second style for list

    print(*product(n, m))         # direct results

    print(list(product(n, m)))    # as a list


'''
input:
1 2

3 4

output:
(1, 3) (1, 4) (2, 3) (2, 4)
[(1, 3), (1, 4), (2, 3), (2, 4)]

'''