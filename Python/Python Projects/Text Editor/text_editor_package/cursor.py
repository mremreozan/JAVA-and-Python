# -*- coding: utf-8 -*-
"""
Created on Mon Jun  8 20:51:45 2020

@author: Utilisateur
"""

class Cursor:
    def __init__(self, document):
        self.document = document
        self.position = 0
    
    def forward(self):
        self.position += 1

    def back(self):
        self.position -= 1

    def home(self):
        while self.document.characters[
            self.position-1].character != '\n':
            self.position -= 1
            if self.position == 0:
                # Got to beginning of file before newline
                break
                
    def end(self):
        while self.position < len(
            self.document.characters) and \
            self.document.characters[
                self.position
                ].character != '\n':
            self.position += 1