# -*- coding: utf-8 -*-
"""
Created on Sun Jan  5 00:11:08 2020

@author: Utilisateur
"""
if __name__ == '__main__':
    N = int(input())
    result = []
    for n in range(N):
        x = input().split(" ")
        command = x[0]
        if command == 'append':
            result.append(int(x[1]))
        if command == 'print':
            print(result)
        if command == 'insert':
            result.insert(int(x[1]), int(x[2]))
        if command == 'reverse':
            result = result[::-1]
        if command == 'pop':
            result.pop()
        if command == 'sort':
            result = sorted(result)
        if command == 'remove':
            result.remove(int(x[1]))
            
'''
Input (stdin)

12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print


Your Output (stdout)
[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]

'''