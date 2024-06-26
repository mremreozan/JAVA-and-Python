# -*- coding: utf-8 -*-
"""
Created on Thu Jun 11 22:50:17 2020

@author: Utilisateur
"""
from .apartment_and_house import get_valid_input
    
class Purchase:
    def __init__(self, price='', taxes='', **kwargs):
        super().__init__(**kwargs)
        self.price = price
        self.taxes = taxes

    def display(self):
        super().display()
        print("PURCHASE DETAILS")
        print("selling price: {}".format(self.price))
        print("estimated taxes: {}".format(self.taxes))
        print()
        print()
    
    @staticmethod
    def prompt_init():
        return dict(
                price=input("What is the selling price? "),
                taxes=input("What are the estimated taxes? "))
    
class Rental:
    def __init__(self, furnished='', utilities='',
                 rent='', **kwargs):
        super().__init__(**kwargs)
        self.furnished = furnished
        self.rent = rent
        self.utilities = utilities
        
    def display(self):
        super().display()
        print("RENTAL DETAILS")      
        print("rent: {}".format(self.rent))
        print("estimated utilities: {}".format(
                self.utilities))
        print("furnished: {}".format(self.furnished))
        print()
        print()
    
    @staticmethod
    def prompt_init():
        return dict(
                rent=input("What is the monthly rent? "),
                utilities=input(
                        "What are the estimated utilities? "),
                        furnished = get_valid_input(
                                "Is the property furnished? ",
                                ("yes", "no")))