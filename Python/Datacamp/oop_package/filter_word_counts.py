# -*- coding: utf-8 -*-
"""
Created on Mon Apr 27 12:32:07 2020

@author: Utilisateur
"""
from collections import Counter

def filter_word_counts(words_group, first_char):
    
    # Use filter() to apply a lambda function over fellowship: result
    result = filter(lambda member : member[0]==first_char , words_group)

    # Convert result to a list: result_list
    result_list = list(result)
    
    result_count = Counter(result_list)

    return result_count 