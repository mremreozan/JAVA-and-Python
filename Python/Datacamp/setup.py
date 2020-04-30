# -*- coding: utf-8 -*-
"""
Created on Sun Apr 26 18:43:41 2020

@author: Utilisateur
"""

# Import needed function from setuptools
from setuptools import setup

# Create proper setup to be used by pip
# pip need setup.py to load requirements.txt
setup(name='oop_package',
      version='0.0.1',
      description='show working type of Object Oriented Programming',
      author='Emre Ozan',
      packages=['oop_package'],
      install_requires=['matplotlib>=3.0.0'])
