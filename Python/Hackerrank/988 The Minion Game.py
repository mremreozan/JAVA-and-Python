# -*- coding: utf-8 -*-
"""
Created on Fri Jan 10 00:22:02 2020

@author: Emre Ozan
"""
def minion_game(string):
    V = frozenset("AEIOU")
    n = len(s)
    ksc = sum(q for c, q in zip(s, range(n, 0, -1)) if c in V)
    ssc = n * (n + 1) // 2 - ksc
    if ksc > ssc:
        print("Kevin {:d}".format(ksc))
    elif ssc > ksc:
        print("Stuart {:d}".format(ssc))
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)
    
'''    
iNPUT:
BANANA

OUTPUT:
Stuart 12

Explain:
Kevin and Stuart want to play the 'The Minion Game'.
Game Rules:
Both players are given the same string, .
Both players have to make substrings using the letters of the string .
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.
A player gets +1 point for each occurrence of the substring in the S string .
Print one line: the name of the winner and their score separated by a space.

'''

