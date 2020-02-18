# -*- coding: utf-8 -*-
"""
Created on Tue Jan  7 23:34:59 2020

@author: Utilisateur
"""

def count_substring(string, sub_string):
    return (sum([1 for i in range(0, len(string) - len(sub_string) + 1) 
                        if (string[i:(len(sub_string)+i)] == sub_string)
                ])
            )


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
    
'''
input: 
emreahmetemre
emre
    
output:
2
'''