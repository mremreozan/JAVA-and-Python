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

def calc_bmi_lists(sample_indices, hts, wts):

    # Gather sample heights and weights as lists
    s_hts = [hts[i] for i in sample_indices]
    s_wts = [wts[i] for i in sample_indices]

    # Convert heights from cm to m and square with list comprehension
    s_hts_m_sqr = [(ht / 100) ** 2 for ht in s_hts]

    # Calculate BMIs as a list with list comprehension
    bmis = [s_wts[i] / s_hts_m_sqr[i] for i in range(len(sample_indices))]

    return bmis

def calc_bmi_arrays(sample_indices, hts, wts):

    # Gather sample heights and weights as arrays
    s_hts = hts[sample_indices]
    s_wts = wts[sample_indices]

    # Convert heights from cm to m and square with broadcasting
    s_hts_m_sqr = (s_hts / 100) ** 2

    # Calculate BMIs as an array using broadcasting
    bmis = s_wts / s_hts_m_sqr

    return bmis