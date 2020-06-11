# -*- coding: utf-8 -*-
"""
@author: Utilisateur
"""

from .all_properties import *
from .apartment_and_house import get_valid_input

class Agent:
    def __init__(self):
        self.property_list = []
    
    def display_properties(self):
        for property in self.property_list:
            property.display()
    
    type_map = {
            ("house", "rental"): HouseRental,
            ("house", "purchase"): HousePurchase,
            ("apartment", "rental"): ApartmentRental,
            ("apartment", "purchase"): ApartmentPurchase
            }
    
    def add_property(self):
        property_type = get_valid_input(
                "What type of property? ",
                ("house", "apartment")).lower()
        payment_type = get_valid_input(
                "What payment type? ",
                ("purchase", "rental")).lower()

        PropertyClass = self.type_map[
                (property_type, payment_type)]

        init_args = PropertyClass.prompt_init()
        self.property_list.append(PropertyClass(**init_args))