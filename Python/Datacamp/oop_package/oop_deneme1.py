# -*- coding: utf-8 -*-
"""
Created on Sun Apr 26 17:09:50 2020

@author: Utilisateur
"""
import matplotlib.pyplot as plt
import numpy as np

def talk(break_up=False):
    """Helper for communicating with significant other"""
    if break_up:
        print("It's not you, it's me...")
    else:
        print('I <3 U!')
        

def walk(req):

    if req==True:
        print("We can walk at forest")
        
    else:
        print("We can watch at home")
        
def plot_counts2(words):
    
    words = np.array(words)
    x = words[:,0]
    y = words[:,1]
    y=y.astype(int)
    plt.bar(x, y)
    plt.show()
    
def filter_lines(lines, first_chars):
    
    lines = lines.split('\n')

    filter_line = filter(lambda line : line[0:2] == first_chars, lines)
    filter_line = list(filter_line)
    
    str1=" "
    filter_line = str1.join(filter_line)
    
    return filter_line