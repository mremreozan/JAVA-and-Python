# -*- coding: utf-8 -*-
"""
Created on Tue Jun 23 22:10:05 2020

@author: Utilisateur
"""
from .representations import AsDictionaryMixin

class AddressBook:
    def __init__(self):
        self._employee_addresses = {
            9001: Address('121 Admin Rd.', 'Concord', 'NH', '03301'),
            9002: Address('67 Paperwork Ave', 'Manchester', 'NH', '03101'),
            9003: Address('15 Rose St', 'Concord', 'NH', '03301', 'Apt. B-1'),
            9004: Address('39 Sole St.', 'Concord', 'NH', '03301'),
            9005: Address('99 Mountain Rd.', 'Concord', 'NH', '03301'),
            9006: Address('25 flower St', 'Brussels', 'Anderlecht', '1070', 'Apt. C-1')
        }

    def get_employee_address(self, employee_id):
        address = self._employee_addresses.get(employee_id)
        if not address:
            raise ValueError(employee_id)
        return address

class Address(AsDictionaryMixin):
    def __init__(self, street, city, state, zipcode, street2=''):
        self.street = street
        self.street2 = street2
        self.city = city
        self.state = state
        self.zipcode = zipcode

    def __str__(self):
        lines = [self.street]
        if self.street2:
            lines.append(self.street2)
        lines.append(f'{self.city}, {self.state} {self.zipcode}')
        return '\n'.join(lines)

