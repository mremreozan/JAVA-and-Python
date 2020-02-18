# -*- coding: utf-8 -*-
"""
Created on Wed Jan  8 23:34:45 2020

@author: Emre Ozan
"""
n, m = map(int, input().split())

p = '.'
t = '-'
r = '|'

#Top Cone
for i in range((n-1)//2):
    print(t*((m-1)//2-(1+3*i))+(p+r+p)*(2*i+1)+t*((m-1)//2-(1+3*i)))
    
print('WELCOME'.center(m, '-'))


for i in range((n-1)//2):
    print(3*t*(i+1)+(p+r+p)*(n-2-2*i)+3*t*(i+1))
    
'''    
alternative
'''
print('\n')



pattern = [('.|.'*(2*i + 1)).center(m, '-') for i in range(n//2)]

print('\n'.join(pattern + ['WELCOME'.center(m, '-')] + pattern[::-1]))    
    

'''
input:
7 21

output:
---------.|.---------
------.|..|..|.------
---.|..|..|..|..|.---
-------WELCOME-------
---.|..|..|..|..|.---
------.|..|..|.------
---------.|.---------
'''