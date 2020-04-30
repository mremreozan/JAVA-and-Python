# -*- coding: utf-8 -*-
"""
Created on Sun Apr 26 19:05:49 2020

@author: Utilisateur
"""

from collections import Counter
from .tokenize import tokenize
import numpy as np
import matplotlib.pyplot as plt

# Define Document class
class Document:
    """A class for text analysis
    
    :param text: string of text to be analyzed
    :ivar text: string of text to be analyzed; set by `text` parameter
    :ivar tokens: parsed list of words from text
    :ivar word_counts: Counter containing count of hashdag used in text
    """
    # Method to create a new instance of MyClass
    def __init__(self, text):
        self.text = text
        # Tokenize the document with non-public tokenize method
        self.tokens = self._tokenize()
        # Perform word count with non-public count_words method
        self.word_counts = self._count_words()
        
    def _tokenize(self):
        return tokenize(self.text)
    
    # non-public method totally document's word counts with Counter
    def _count_words(self):
        return Counter(self.tokens)

    def plot_counts(self):
        
        words = np.array(self.word_counts.most_common(5))
        x = words[:,0]
        y = words[:,1]
        y=y.astype(int)
        plt.bar(x, y)
        plt.show()