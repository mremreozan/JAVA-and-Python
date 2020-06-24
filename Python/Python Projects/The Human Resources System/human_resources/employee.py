# -*- coding: utf-8 -*-
"""
Created on Tue Jun 23 22:12:35 2020

@author: Utilisateur
"""
from .representations import AsDictionaryMixin
from .productivity import ProductivitySystem
from .hr import PayrollSystem
from .contact import AddressBook

class EmployeeDatabase:
    def __init__(self):
        self._employees = [
            {
                'id': 9001,
                'name': 'Mary Poppins',
                'payrol_id' : 1,
                'role': 'manager'
            },
            {
                'id': 9002,
                'name': 'John Smith',
                'payrol_id' : 2,
                'role': 'secretary'
            },
            {
                'id': 9003,
                'name': 'Kevin Bacon',
                'payrol_id' : 3,
                'role': 'sales'
            },
            {
                'id': 9004,
                'name': 'Jane Doe',
                'payrol_id' : 4,
                'role': 'factory'
            },
            {
                'id': 9005,
                'name': 'Robin Williams',
                'payrol_id' : 5,
                'role': 'secretary'
            },
            {
                'id': 9006,
                'name': 'Robin Williams',
                'payrol_id' : 5,
                'role': 'secretary'
            },
        ]
        self.productivity = ProductivitySystem()
        self.payroll = PayrollSystem()
        self.employee_addresses = AddressBook()

    @property
    def employees(self):
        return [self._create_employee(**data) for data in self._employees]

    def _create_employee(self, id, name, payrol_id, role):
        address = self.employee_addresses.get_employee_address(id)
        employee_role = self.productivity.get_role(role)
        payroll_policy = self.payroll.get_policy(payrol_id)
        return Employee(id, name, address, employee_role, payroll_policy)
    
class Employee(AsDictionaryMixin):
    def __init__(self, id, name, address, role, payroll):
        self.id = id
        self.name = name
        self.address = address
        self._role = role
        self._payroll = payroll

    def work(self, hours):
        duties = self._role.perform_duties(hours)
        print(f'Employee {self.id} - {self.name}:')
        print(f'- {duties}')
        print('')
        self._payroll.track_work(hours)

    def calculate_payroll(self):
        return self._payroll.calculate_payroll()