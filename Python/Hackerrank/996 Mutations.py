# -*- coding: utf-8 -*-
"""
Created on Tue Jan  7 00:49:25 2020

@author: Emre Ozan
"""
def mutate_string(string, position, character):
    l = list(string)
    l[position]=character
    return ''.join(l)

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)


'''
Input (stdin)
abracadabra
5 k



Your Output (stdout)
abrackdabra
'''